/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.th.hello;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-16")
public class Order implements org.apache.thrift.TBase<Order, Order._Fields>, java.io.Serializable, Cloneable, Comparable<Order> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Order");

  private static final org.apache.thrift.protocol.TField ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("orderId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PHONE_FIELD_DESC = new org.apache.thrift.protocol.TField("phone", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ORDER_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("orderNum", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ORDER_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("orderDate", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TICKET_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("ticketType", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.DOUBLE, (short)7);
  private static final org.apache.thrift.protocol.TField ORDER_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("orderStatus", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new OrderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new OrderTupleSchemeFactory());
  }

  public long orderId; // required
  public String phone; // required
  public String name; // required
  public String orderNum; // required
  public int orderDate; // required
  public int ticketType; // required
  public double amount; // required
  public int orderStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDER_ID((short)1, "orderId"),
    PHONE((short)2, "phone"),
    NAME((short)3, "name"),
    ORDER_NUM((short)4, "orderNum"),
    ORDER_DATE((short)5, "orderDate"),
    TICKET_TYPE((short)6, "ticketType"),
    AMOUNT((short)7, "amount"),
    ORDER_STATUS((short)8, "orderStatus");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ORDER_ID
          return ORDER_ID;
        case 2: // PHONE
          return PHONE;
        case 3: // NAME
          return NAME;
        case 4: // ORDER_NUM
          return ORDER_NUM;
        case 5: // ORDER_DATE
          return ORDER_DATE;
        case 6: // TICKET_TYPE
          return TICKET_TYPE;
        case 7: // AMOUNT
          return AMOUNT;
        case 8: // ORDER_STATUS
          return ORDER_STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ORDERID_ISSET_ID = 0;
  private static final int __ORDERDATE_ISSET_ID = 1;
  private static final int __TICKETTYPE_ISSET_ID = 2;
  private static final int __AMOUNT_ISSET_ID = 3;
  private static final int __ORDERSTATUS_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("orderId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PHONE, new org.apache.thrift.meta_data.FieldMetaData("phone", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORDER_NUM, new org.apache.thrift.meta_data.FieldMetaData("orderNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORDER_DATE, new org.apache.thrift.meta_data.FieldMetaData("orderDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TICKET_TYPE, new org.apache.thrift.meta_data.FieldMetaData("ticketType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.ORDER_STATUS, new org.apache.thrift.meta_data.FieldMetaData("orderStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Order.class, metaDataMap);
  }

  public Order() {
  }

  public Order(
    long orderId,
    String phone,
    String name,
    String orderNum,
    int orderDate,
    int ticketType,
    double amount,
    int orderStatus)
  {
    this();
    this.orderId = orderId;
    setOrderIdIsSet(true);
    this.phone = phone;
    this.name = name;
    this.orderNum = orderNum;
    this.orderDate = orderDate;
    setOrderDateIsSet(true);
    this.ticketType = ticketType;
    setTicketTypeIsSet(true);
    this.amount = amount;
    setAmountIsSet(true);
    this.orderStatus = orderStatus;
    setOrderStatusIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Order(Order other) {
    __isset_bitfield = other.__isset_bitfield;
    this.orderId = other.orderId;
    if (other.isSetPhone()) {
      this.phone = other.phone;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetOrderNum()) {
      this.orderNum = other.orderNum;
    }
    this.orderDate = other.orderDate;
    this.ticketType = other.ticketType;
    this.amount = other.amount;
    this.orderStatus = other.orderStatus;
  }

  public Order deepCopy() {
    return new Order(this);
  }

  @Override
  public void clear() {
    setOrderIdIsSet(false);
    this.orderId = 0;
    this.phone = null;
    this.name = null;
    this.orderNum = null;
    setOrderDateIsSet(false);
    this.orderDate = 0;
    setTicketTypeIsSet(false);
    this.ticketType = 0;
    setAmountIsSet(false);
    this.amount = 0.0;
    setOrderStatusIsSet(false);
    this.orderStatus = 0;
  }

  public long getOrderId() {
    return this.orderId;
  }

  public Order setOrderId(long orderId) {
    this.orderId = orderId;
    setOrderIdIsSet(true);
    return this;
  }

  public void unsetOrderId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ORDERID_ISSET_ID);
  }

  /** Returns true if field orderId is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderId() {
    return EncodingUtils.testBit(__isset_bitfield, __ORDERID_ISSET_ID);
  }

  public void setOrderIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ORDERID_ISSET_ID, value);
  }

  public String getPhone() {
    return this.phone;
  }

  public Order setPhone(String phone) {
    this.phone = phone;
    return this;
  }

  public void unsetPhone() {
    this.phone = null;
  }

  /** Returns true if field phone is set (has been assigned a value) and false otherwise */
  public boolean isSetPhone() {
    return this.phone != null;
  }

  public void setPhoneIsSet(boolean value) {
    if (!value) {
      this.phone = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public Order setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getOrderNum() {
    return this.orderNum;
  }

  public Order setOrderNum(String orderNum) {
    this.orderNum = orderNum;
    return this;
  }

  public void unsetOrderNum() {
    this.orderNum = null;
  }

  /** Returns true if field orderNum is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderNum() {
    return this.orderNum != null;
  }

  public void setOrderNumIsSet(boolean value) {
    if (!value) {
      this.orderNum = null;
    }
  }

  public int getOrderDate() {
    return this.orderDate;
  }

  public Order setOrderDate(int orderDate) {
    this.orderDate = orderDate;
    setOrderDateIsSet(true);
    return this;
  }

  public void unsetOrderDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ORDERDATE_ISSET_ID);
  }

  /** Returns true if field orderDate is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderDate() {
    return EncodingUtils.testBit(__isset_bitfield, __ORDERDATE_ISSET_ID);
  }

  public void setOrderDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ORDERDATE_ISSET_ID, value);
  }

  public int getTicketType() {
    return this.ticketType;
  }

  public Order setTicketType(int ticketType) {
    this.ticketType = ticketType;
    setTicketTypeIsSet(true);
    return this;
  }

  public void unsetTicketType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TICKETTYPE_ISSET_ID);
  }

  /** Returns true if field ticketType is set (has been assigned a value) and false otherwise */
  public boolean isSetTicketType() {
    return EncodingUtils.testBit(__isset_bitfield, __TICKETTYPE_ISSET_ID);
  }

  public void setTicketTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TICKETTYPE_ISSET_ID, value);
  }

  public double getAmount() {
    return this.amount;
  }

  public Order setAmount(double amount) {
    this.amount = amount;
    setAmountIsSet(true);
    return this;
  }

  public void unsetAmount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return EncodingUtils.testBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  public void setAmountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AMOUNT_ISSET_ID, value);
  }

  public int getOrderStatus() {
    return this.orderStatus;
  }

  public Order setOrderStatus(int orderStatus) {
    this.orderStatus = orderStatus;
    setOrderStatusIsSet(true);
    return this;
  }

  public void unsetOrderStatus() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ORDERSTATUS_ISSET_ID);
  }

  /** Returns true if field orderStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetOrderStatus() {
    return EncodingUtils.testBit(__isset_bitfield, __ORDERSTATUS_ISSET_ID);
  }

  public void setOrderStatusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ORDERSTATUS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORDER_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        setOrderId((Long)value);
      }
      break;

    case PHONE:
      if (value == null) {
        unsetPhone();
      } else {
        setPhone((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case ORDER_NUM:
      if (value == null) {
        unsetOrderNum();
      } else {
        setOrderNum((String)value);
      }
      break;

    case ORDER_DATE:
      if (value == null) {
        unsetOrderDate();
      } else {
        setOrderDate((Integer)value);
      }
      break;

    case TICKET_TYPE:
      if (value == null) {
        unsetTicketType();
      } else {
        setTicketType((Integer)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((Double)value);
      }
      break;

    case ORDER_STATUS:
      if (value == null) {
        unsetOrderStatus();
      } else {
        setOrderStatus((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORDER_ID:
      return Long.valueOf(getOrderId());

    case PHONE:
      return getPhone();

    case NAME:
      return getName();

    case ORDER_NUM:
      return getOrderNum();

    case ORDER_DATE:
      return Integer.valueOf(getOrderDate());

    case TICKET_TYPE:
      return Integer.valueOf(getTicketType());

    case AMOUNT:
      return Double.valueOf(getAmount());

    case ORDER_STATUS:
      return Integer.valueOf(getOrderStatus());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORDER_ID:
      return isSetOrderId();
    case PHONE:
      return isSetPhone();
    case NAME:
      return isSetName();
    case ORDER_NUM:
      return isSetOrderNum();
    case ORDER_DATE:
      return isSetOrderDate();
    case TICKET_TYPE:
      return isSetTicketType();
    case AMOUNT:
      return isSetAmount();
    case ORDER_STATUS:
      return isSetOrderStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Order)
      return this.equals((Order)that);
    return false;
  }

  public boolean equals(Order that) {
    if (that == null)
      return false;

    boolean this_present_orderId = true;
    boolean that_present_orderId = true;
    if (this_present_orderId || that_present_orderId) {
      if (!(this_present_orderId && that_present_orderId))
        return false;
      if (this.orderId != that.orderId)
        return false;
    }

    boolean this_present_phone = true && this.isSetPhone();
    boolean that_present_phone = true && that.isSetPhone();
    if (this_present_phone || that_present_phone) {
      if (!(this_present_phone && that_present_phone))
        return false;
      if (!this.phone.equals(that.phone))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_orderNum = true && this.isSetOrderNum();
    boolean that_present_orderNum = true && that.isSetOrderNum();
    if (this_present_orderNum || that_present_orderNum) {
      if (!(this_present_orderNum && that_present_orderNum))
        return false;
      if (!this.orderNum.equals(that.orderNum))
        return false;
    }

    boolean this_present_orderDate = true;
    boolean that_present_orderDate = true;
    if (this_present_orderDate || that_present_orderDate) {
      if (!(this_present_orderDate && that_present_orderDate))
        return false;
      if (this.orderDate != that.orderDate)
        return false;
    }

    boolean this_present_ticketType = true;
    boolean that_present_ticketType = true;
    if (this_present_ticketType || that_present_ticketType) {
      if (!(this_present_ticketType && that_present_ticketType))
        return false;
      if (this.ticketType != that.ticketType)
        return false;
    }

    boolean this_present_amount = true;
    boolean that_present_amount = true;
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    boolean this_present_orderStatus = true;
    boolean that_present_orderStatus = true;
    if (this_present_orderStatus || that_present_orderStatus) {
      if (!(this_present_orderStatus && that_present_orderStatus))
        return false;
      if (this.orderStatus != that.orderStatus)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_orderId = true;
    list.add(present_orderId);
    if (present_orderId)
      list.add(orderId);

    boolean present_phone = true && (isSetPhone());
    list.add(present_phone);
    if (present_phone)
      list.add(phone);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_orderNum = true && (isSetOrderNum());
    list.add(present_orderNum);
    if (present_orderNum)
      list.add(orderNum);

    boolean present_orderDate = true;
    list.add(present_orderDate);
    if (present_orderDate)
      list.add(orderDate);

    boolean present_ticketType = true;
    list.add(present_ticketType);
    if (present_ticketType)
      list.add(ticketType);

    boolean present_amount = true;
    list.add(present_amount);
    if (present_amount)
      list.add(amount);

    boolean present_orderStatus = true;
    list.add(present_orderStatus);
    if (present_orderStatus)
      list.add(orderStatus);

    return list.hashCode();
  }

  @Override
  public int compareTo(Order other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOrderId()).compareTo(other.isSetOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderId, other.orderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhone()).compareTo(other.isSetPhone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phone, other.phone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderNum()).compareTo(other.isSetOrderNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderNum, other.orderNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderDate()).compareTo(other.isSetOrderDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderDate, other.orderDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTicketType()).compareTo(other.isSetTicketType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTicketType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ticketType, other.ticketType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAmount()).compareTo(other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, other.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrderStatus()).compareTo(other.isSetOrderStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrderStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.orderStatus, other.orderStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Order(");
    boolean first = true;

    sb.append("orderId:");
    sb.append(this.orderId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("phone:");
    if (this.phone == null) {
      sb.append("null");
    } else {
      sb.append(this.phone);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderNum:");
    if (this.orderNum == null) {
      sb.append("null");
    } else {
      sb.append(this.orderNum);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderDate:");
    sb.append(this.orderDate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ticketType:");
    sb.append(this.ticketType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    sb.append(this.amount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("orderStatus:");
    sb.append(this.orderStatus);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OrderStandardSchemeFactory implements SchemeFactory {
    public OrderStandardScheme getScheme() {
      return new OrderStandardScheme();
    }
  }

  private static class OrderStandardScheme extends StandardScheme<Order> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Order struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.orderId = iprot.readI64();
              struct.setOrderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PHONE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.phone = iprot.readString();
              struct.setPhoneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ORDER_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.orderNum = iprot.readString();
              struct.setOrderNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ORDER_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.orderDate = iprot.readI32();
              struct.setOrderDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TICKET_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ticketType = iprot.readI32();
              struct.setTicketTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.amount = iprot.readDouble();
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // ORDER_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.orderStatus = iprot.readI32();
              struct.setOrderStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Order struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
      oprot.writeI64(struct.orderId);
      oprot.writeFieldEnd();
      if (struct.phone != null) {
        oprot.writeFieldBegin(PHONE_FIELD_DESC);
        oprot.writeString(struct.phone);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.orderNum != null) {
        oprot.writeFieldBegin(ORDER_NUM_FIELD_DESC);
        oprot.writeString(struct.orderNum);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ORDER_DATE_FIELD_DESC);
      oprot.writeI32(struct.orderDate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TICKET_TYPE_FIELD_DESC);
      oprot.writeI32(struct.ticketType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
      oprot.writeDouble(struct.amount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ORDER_STATUS_FIELD_DESC);
      oprot.writeI32(struct.orderStatus);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OrderTupleSchemeFactory implements SchemeFactory {
    public OrderTupleScheme getScheme() {
      return new OrderTupleScheme();
    }
  }

  private static class OrderTupleScheme extends TupleScheme<Order> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Order struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOrderId()) {
        optionals.set(0);
      }
      if (struct.isSetPhone()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetOrderNum()) {
        optionals.set(3);
      }
      if (struct.isSetOrderDate()) {
        optionals.set(4);
      }
      if (struct.isSetTicketType()) {
        optionals.set(5);
      }
      if (struct.isSetAmount()) {
        optionals.set(6);
      }
      if (struct.isSetOrderStatus()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetOrderId()) {
        oprot.writeI64(struct.orderId);
      }
      if (struct.isSetPhone()) {
        oprot.writeString(struct.phone);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetOrderNum()) {
        oprot.writeString(struct.orderNum);
      }
      if (struct.isSetOrderDate()) {
        oprot.writeI32(struct.orderDate);
      }
      if (struct.isSetTicketType()) {
        oprot.writeI32(struct.ticketType);
      }
      if (struct.isSetAmount()) {
        oprot.writeDouble(struct.amount);
      }
      if (struct.isSetOrderStatus()) {
        oprot.writeI32(struct.orderStatus);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Order struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.orderId = iprot.readI64();
        struct.setOrderIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.phone = iprot.readString();
        struct.setPhoneIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.orderNum = iprot.readString();
        struct.setOrderNumIsSet(true);
      }
      if (incoming.get(4)) {
        struct.orderDate = iprot.readI32();
        struct.setOrderDateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.ticketType = iprot.readI32();
        struct.setTicketTypeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.amount = iprot.readDouble();
        struct.setAmountIsSet(true);
      }
      if (incoming.get(7)) {
        struct.orderStatus = iprot.readI32();
        struct.setOrderStatusIsSet(true);
      }
    }
  }

}
