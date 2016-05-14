// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_world.proto

package io.grpc.examples.gen;

/**
 * Protobuf type {@code helloworld.Order}
 */
public  final class Order extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:helloworld.Order)
    OrderOrBuilder {
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private Order() {
    orderId_ = 0L;
    phone_ = "";
    name_ = "";
    orderNum_ = "";
    orderDate_ = 0;
    ticketType_ = 0;
    amount_ = 0D;
    orderStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Order(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            orderId_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            phone_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();

            name_ = bs;
            break;
          }
          case 34: {
            com.google.protobuf.ByteString bs = input.readBytes();

            orderNum_ = bs;
            break;
          }
          case 40: {

            orderDate_ = input.readInt32();
            break;
          }
          case 48: {

            ticketType_ = input.readInt32();
            break;
          }
          case 57: {

            amount_ = input.readDouble();
            break;
          }
          case 64: {

            orderStatus_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.gen.HelloWorldProto.internal_static_helloworld_Order_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.gen.HelloWorldProto.internal_static_helloworld_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.gen.Order.class, io.grpc.examples.gen.Order.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private long orderId_;
  /**
   * <code>optional int64 orderId = 1;</code>
   */
  public long getOrderId() {
    return orderId_;
  }

  public static final int PHONE_FIELD_NUMBER = 2;
  private volatile java.lang.Object phone_;
  /**
   * <code>optional string phone = 2;</code>
   */
  public java.lang.String getPhone() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        phone_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string phone = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPhoneBytes() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERNUM_FIELD_NUMBER = 4;
  private volatile java.lang.Object orderNum_;
  /**
   * <code>optional string orderNum = 4;</code>
   */
  public java.lang.String getOrderNum() {
    java.lang.Object ref = orderNum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        orderNum_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string orderNum = 4;</code>
   */
  public com.google.protobuf.ByteString
      getOrderNumBytes() {
    java.lang.Object ref = orderNum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderNum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERDATE_FIELD_NUMBER = 5;
  private int orderDate_;
  /**
   * <code>optional int32 orderDate = 5;</code>
   */
  public int getOrderDate() {
    return orderDate_;
  }

  public static final int TICKETTYPE_FIELD_NUMBER = 6;
  private int ticketType_;
  /**
   * <code>optional int32 ticketType = 6;</code>
   */
  public int getTicketType() {
    return ticketType_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 7;
  private double amount_;
  /**
   * <code>optional double amount = 7;</code>
   */
  public double getAmount() {
    return amount_;
  }

  public static final int ORDERSTATUS_FIELD_NUMBER = 8;
  private int orderStatus_;
  /**
   * <code>optional int32 orderStatus = 8;</code>
   */
  public int getOrderStatus() {
    return orderStatus_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (orderId_ != 0L) {
      output.writeInt64(1, orderId_);
    }
    if (!getPhoneBytes().isEmpty()) {
      output.writeBytes(2, getPhoneBytes());
    }
    if (!getNameBytes().isEmpty()) {
      output.writeBytes(3, getNameBytes());
    }
    if (!getOrderNumBytes().isEmpty()) {
      output.writeBytes(4, getOrderNumBytes());
    }
    if (orderDate_ != 0) {
      output.writeInt32(5, orderDate_);
    }
    if (ticketType_ != 0) {
      output.writeInt32(6, ticketType_);
    }
    if (amount_ != 0D) {
      output.writeDouble(7, amount_);
    }
    if (orderStatus_ != 0) {
      output.writeInt32(8, orderStatus_);
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (orderId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, orderId_);
    }
    if (!getPhoneBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getPhoneBytes());
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, getNameBytes());
    }
    if (!getOrderNumBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, getOrderNumBytes());
    }
    if (orderDate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, orderDate_);
    }
    if (ticketType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, ticketType_);
    }
    if (amount_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, amount_);
    }
    if (orderStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, orderStatus_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.examples.gen.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.gen.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.gen.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.gen.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.gen.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.gen.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.gen.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.examples.gen.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.gen.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.gen.Order parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.examples.gen.Order prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helloworld.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.Order)
      io.grpc.examples.gen.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.gen.HelloWorldProto.internal_static_helloworld_Order_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.gen.HelloWorldProto.internal_static_helloworld_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.gen.Order.class, io.grpc.examples.gen.Order.Builder.class);
    }

    // Construct using io.grpc.examples.gen.Order.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      orderId_ = 0L;

      phone_ = "";

      name_ = "";

      orderNum_ = "";

      orderDate_ = 0;

      ticketType_ = 0;

      amount_ = 0D;

      orderStatus_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.gen.HelloWorldProto.internal_static_helloworld_Order_descriptor;
    }

    public io.grpc.examples.gen.Order getDefaultInstanceForType() {
      return io.grpc.examples.gen.Order.getDefaultInstance();
    }

    public io.grpc.examples.gen.Order build() {
      io.grpc.examples.gen.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.gen.Order buildPartial() {
      io.grpc.examples.gen.Order result = new io.grpc.examples.gen.Order(this);
      result.orderId_ = orderId_;
      result.phone_ = phone_;
      result.name_ = name_;
      result.orderNum_ = orderNum_;
      result.orderDate_ = orderDate_;
      result.ticketType_ = ticketType_;
      result.amount_ = amount_;
      result.orderStatus_ = orderStatus_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.gen.Order) {
        return mergeFrom((io.grpc.examples.gen.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.gen.Order other) {
      if (other == io.grpc.examples.gen.Order.getDefaultInstance()) return this;
      if (other.getOrderId() != 0L) {
        setOrderId(other.getOrderId());
      }
      if (!other.getPhone().isEmpty()) {
        phone_ = other.phone_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getOrderNum().isEmpty()) {
        orderNum_ = other.orderNum_;
        onChanged();
      }
      if (other.getOrderDate() != 0) {
        setOrderDate(other.getOrderDate());
      }
      if (other.getTicketType() != 0) {
        setTicketType(other.getTicketType());
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (other.getOrderStatus() != 0) {
        setOrderStatus(other.getOrderStatus());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.examples.gen.Order parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.gen.Order) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long orderId_ ;
    /**
     * <code>optional int64 orderId = 1;</code>
     */
    public long getOrderId() {
      return orderId_;
    }
    /**
     * <code>optional int64 orderId = 1;</code>
     */
    public Builder setOrderId(long value) {
      
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 orderId = 1;</code>
     */
    public Builder clearOrderId() {
      
      orderId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object phone_ = "";
    /**
     * <code>optional string phone = 2;</code>
     */
    public java.lang.String getPhone() {
      java.lang.Object ref = phone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          phone_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string phone = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      java.lang.Object ref = phone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string phone = 2;</code>
     */
    public Builder setPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string phone = 2;</code>
     */
    public Builder clearPhone() {
      
      phone_ = getDefaultInstance().getPhone();
      onChanged();
      return this;
    }
    /**
     * <code>optional string phone = 2;</code>
     */
    public Builder setPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object orderNum_ = "";
    /**
     * <code>optional string orderNum = 4;</code>
     */
    public java.lang.String getOrderNum() {
      java.lang.Object ref = orderNum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          orderNum_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string orderNum = 4;</code>
     */
    public com.google.protobuf.ByteString
        getOrderNumBytes() {
      java.lang.Object ref = orderNum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderNum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string orderNum = 4;</code>
     */
    public Builder setOrderNum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string orderNum = 4;</code>
     */
    public Builder clearOrderNum() {
      
      orderNum_ = getDefaultInstance().getOrderNum();
      onChanged();
      return this;
    }
    /**
     * <code>optional string orderNum = 4;</code>
     */
    public Builder setOrderNumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderNum_ = value;
      onChanged();
      return this;
    }

    private int orderDate_ ;
    /**
     * <code>optional int32 orderDate = 5;</code>
     */
    public int getOrderDate() {
      return orderDate_;
    }
    /**
     * <code>optional int32 orderDate = 5;</code>
     */
    public Builder setOrderDate(int value) {
      
      orderDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 orderDate = 5;</code>
     */
    public Builder clearOrderDate() {
      
      orderDate_ = 0;
      onChanged();
      return this;
    }

    private int ticketType_ ;
    /**
     * <code>optional int32 ticketType = 6;</code>
     */
    public int getTicketType() {
      return ticketType_;
    }
    /**
     * <code>optional int32 ticketType = 6;</code>
     */
    public Builder setTicketType(int value) {
      
      ticketType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 ticketType = 6;</code>
     */
    public Builder clearTicketType() {
      
      ticketType_ = 0;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <code>optional double amount = 7;</code>
     */
    public double getAmount() {
      return amount_;
    }
    /**
     * <code>optional double amount = 7;</code>
     */
    public Builder setAmount(double value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double amount = 7;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0D;
      onChanged();
      return this;
    }

    private int orderStatus_ ;
    /**
     * <code>optional int32 orderStatus = 8;</code>
     */
    public int getOrderStatus() {
      return orderStatus_;
    }
    /**
     * <code>optional int32 orderStatus = 8;</code>
     */
    public Builder setOrderStatus(int value) {
      
      orderStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 orderStatus = 8;</code>
     */
    public Builder clearOrderStatus() {
      
      orderStatus_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:helloworld.Order)
  }

  // @@protoc_insertion_point(class_scope:helloworld.Order)
  private static final io.grpc.examples.gen.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.gen.Order();
  }

  public static io.grpc.examples.gen.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<Order> PARSER =
      new com.google.protobuf.AbstractParser<Order>() {
    public Order parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Order(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  public io.grpc.examples.gen.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

