// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_world.proto

package io.grpc.examples.gen;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_Order_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_helloworld_Order_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021hello_world.proto\022\nhelloworld\"\223\001\n\005Orde" +
      "r\022\017\n\007orderId\030\001 \001(\003\022\r\n\005phone\030\002 \001(\t\022\014\n\004nam" +
      "e\030\003 \001(\t\022\020\n\010orderNum\030\004 \001(\t\022\021\n\torderDate\030\005" +
      " \001(\005\022\022\n\nticketType\030\006 \001(\005\022\016\n\006amount\030\007 \001(\001" +
      "\022\023\n\013orderStatus\030\010 \001(\0052=\n\007Greeter\0222\n\010SayH" +
      "ello\022\021.helloworld.Order\032\021.helloworld.Ord" +
      "er\"\000B)\n\024io.grpc.examples.genB\017HelloWorld" +
      "ProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_helloworld_Order_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_helloworld_Order_descriptor,
        new java.lang.String[] { "OrderId", "Phone", "Name", "OrderNum", "OrderDate", "TicketType", "Amount", "OrderStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
