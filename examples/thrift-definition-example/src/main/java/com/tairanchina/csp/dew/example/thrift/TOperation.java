/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.tairanchina.csp.dew.example.thrift;


public enum TOperation implements org.apache.thrift.TEnum {
  ADD(1),
  SUBTRACT(2),
  MULTIPLY(3),
  DIVIDE(4);

  private final int value;

  private TOperation(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TOperation findByValue(int value) { 
    switch (value) {
      case 1:
        return ADD;
      case 2:
        return SUBTRACT;
      case 3:
        return MULTIPLY;
      case 4:
        return DIVIDE;
      default:
        return null;
    }
  }
}
