package com.arijo.potiondb;

import com.arijo.protobuf.*;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;

import java.io.*;
import java.net.Socket;

public class JPotionDBClient {

  public static final byte REQ_READ_OBJS = 116;
  public static final byte REQ_READ = 90;
  public static final byte REQ_STATIC_READ = 91;
  public static final byte REQ_UPDATE_OBJS = 118;
  public static final byte REQ_START_TRANS = 119;
  public static final byte REQ_ABORT_TRANS = 120;
  public static final byte REQ_COMMIT_TRANS = 121;
  public static final byte REQ_STATIC_UPDATE_OBJS = 122;
  public static final byte REQ_STATIC_READ_OBJS = 123;
  public static final byte REQ_RESET_SERVER = 12;
  public static final byte REQ_NEW_TRIGGER = 14;
  public static final byte REQ_GET_TRIGGERS = 15;
  public static final byte REPLY_OP = 111;
  public static final byte REPLY_START_TRANS = 124;
  public static final byte REPLY_READ_OBJS = 126;
  public static final byte REPLY_COMMIT_TRANS = 127;
  public static final byte REPLY_STATIC_READ_OBJS = (byte) 128;
  public static final byte REPLY_RESET_SERVER = 13;
  public static final byte REPLY_NEW_TRIGGER = 16;
  public static final byte REPLY_GET_TRIGGERS = 17;
  public static final byte REPLY_ERROR = 0;
  private Socket socket;
  private DataOutputStream out;
  //private BufferedReader in;
  private DataInputStream in;

  public JPotionDBClient(String ip, int port) throws IOException {
    socket = new Socket(ip, port);
    //out = new PrintWriter(socket.getOutputStream(), true);
    //in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    out = new DataOutputStream(socket.getOutputStream());
    in = new DataInputStream((socket.getInputStream()));
    System.out.println("[JPotionDBClient] JPotionDBClient started (should be connected to server)");
  }

  /**
   * Closes the client's connection with the server.
   */
  public void close() {
    try {
      socket.close();
    } catch (IOException e) {

    }
  }

  /**
   * Sends a protobuf to the server
   * @param code - the code (byte) that identifies the proto type. Check the constants at the start of this file.
   * @param proto - the proto message to be sent
   * @throws IOException
   */
  public void sendProtobuf(byte code, MessageLite proto) throws IOException {
    byte[] protoBytes = proto.toByteArray();
    int len = protoBytes.length + 1;  //+1 for code
    out.writeInt(len);
    out.write(code);
    out.write(protoBytes);
    out.flush();
    byte[] lenBytes = intToByteArray(len);
  }

  public static final byte[] intToByteArray(int value) {
    return new byte[] {
        (byte)(value >>> 24),
        (byte)(value >>> 16),
        (byte)(value >>> 8),
        (byte)value};
  }

  /**
   * @return the protobuf received from the server
   * @throws IOException
   */
  public MessageLite receiveProtobuf() throws IOException {
    int len = in.readInt();
    byte code = in.readByte();
    byte[] protoBytes = in.readNBytes(len-1);
    return bytesToProto(code, protoBytes);
  }

  /**
   * Given a code and a byte buffer, reconstructs the right protobuf
   * @param code - the code that identifies the protobuf type (check the start of this file)
   * @param buf - a buffer with the bytes of the protobuf
   * @return the protobuf
   */
  private MessageLite bytesToProto(byte code, byte[] buf) {
    MessageLite proto = null;
    try {
      switch (code) {
        case REQ_START_TRANS:
          proto = ApbStartTransaction.parseFrom(buf);
          break;
        case REQ_READ_OBJS:
          proto = ApbReadObjects.parseFrom(buf);
          break;
        case REQ_READ:
          proto = ApbRead.parseFrom(buf);
          break;
        case REQ_UPDATE_OBJS:
          proto = ApbUpdateObjects.parseFrom(buf);
          break;
        case REQ_ABORT_TRANS:
          proto = ApbAbortTransaction.parseFrom(buf);
          break;
        case REQ_COMMIT_TRANS:
          proto = ApbCommitTransaction.parseFrom(buf);
          break;
        case REQ_STATIC_UPDATE_OBJS:
          proto = ApbStaticUpdateObjects.parseFrom(buf);
          break;
        case REQ_STATIC_READ_OBJS:
          proto = ApbStaticReadObjects.parseFrom(buf);
          break;
        case REQ_STATIC_READ:
          proto = ApbStaticRead.parseFrom(buf);
          break;
        case REQ_RESET_SERVER:
          proto = ApbResetServer.parseFrom(buf);
          break;
        case REQ_NEW_TRIGGER:
          proto = ApbNewTrigger.parseFrom(buf);
          break;
        case REQ_GET_TRIGGERS:
          proto = ApbGetTriggers.parseFrom(buf);
          break;
        case REPLY_OP:
          proto = ApbOperationResp.parseFrom(buf);
          break;
        case REPLY_START_TRANS:
          proto = ApbStartTransactionResp.parseFrom(buf);
          break;
        case REPLY_READ_OBJS:
          proto = ApbReadObjectsResp.parseFrom(buf);
          break;
        case REPLY_COMMIT_TRANS:
          proto = ApbCommitResp.parseFrom(buf);
          break;
        case REPLY_STATIC_READ_OBJS:
          proto = ApbStaticReadObjectsResp.parseFrom(buf);
          break;
        case REPLY_RESET_SERVER:
          proto = ApbResetServerResp.parseFrom(buf);
          break;
        case REPLY_NEW_TRIGGER:
          proto = ApbNewTriggerReply.parseFrom(buf);
          break;
        case REPLY_GET_TRIGGERS:
          proto = ApbGetTriggersReply.parseFrom(buf);
          break;
        case REPLY_ERROR:
          proto = ApbErrorResp.parseFrom(buf);
          break;
      }
    } catch (InvalidProtocolBufferException e) {
      e.printStackTrace();
      System.exit(0);
    }
    return proto;
  }
}
