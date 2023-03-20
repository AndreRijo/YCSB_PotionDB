package com.arijo.potiondb.crdt.update;

public class TopKScore {

  private int id;
  private int score;
  private byte[] data;

  public TopKScore(int id, int score, byte[] data) {
    this.id = id;
    this.score = score;
    this.data = data;
  }

  public int getId() {
    return id;
  }

  public int getScore() {
    return score;
  }

  public byte[] getData() {
    return data;
  }

}
