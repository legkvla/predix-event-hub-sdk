// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventHub.proto

package com.ge.predix.eventhub.stub;

public interface SubscriptionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:predix.eventhub.SubscriptionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .predix.eventhub.Ack ack = 1;</code>
   */
  java.util.List<com.ge.predix.eventhub.stub.Ack> 
      getAckList();
  /**
   * <code>repeated .predix.eventhub.Ack ack = 1;</code>
   */
  com.ge.predix.eventhub.stub.Ack getAck(int index);
  /**
   * <code>repeated .predix.eventhub.Ack ack = 1;</code>
   */
  int getAckCount();
  /**
   * <code>repeated .predix.eventhub.Ack ack = 1;</code>
   */
  java.util.List<? extends com.ge.predix.eventhub.stub.AckOrBuilder> 
      getAckOrBuilderList();
  /**
   * <code>repeated .predix.eventhub.Ack ack = 1;</code>
   */
  com.ge.predix.eventhub.stub.AckOrBuilder getAckOrBuilder(
      int index);
}
