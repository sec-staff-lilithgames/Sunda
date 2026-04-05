package com.google.gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v extends q {

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f30070b;

    public v(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f30070b = bool;
    }

    public static boolean a(v vVar) {
        Serializable serializable = vVar.f30070b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.q
    public v deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        Serializable serializable = vVar.f30070b;
        Serializable serializable2 = this.f30070b;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (a(this) && a(vVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? getAsBigInteger().equals(vVar.getAsBigInteger()) : getAsNumber().longValue() == vVar.getAsNumber().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return getAsBigDecimal().compareTo(vVar.getAsBigDecimal()) == 0;
        }
        double asDouble = getAsDouble();
        double asDouble2 = vVar.getAsDouble();
        if (asDouble != asDouble2) {
            return Double.isNaN(asDouble) && Double.isNaN(asDouble2);
        }
        return true;
    }

    @Override // com.google.gson.q
    public BigDecimal getAsBigDecimal() {
        Serializable serializable = this.f30070b;
        return serializable instanceof BigDecimal ? (BigDecimal) serializable : mk.t.parseBigDecimal(getAsString());
    }

    @Override // com.google.gson.q
    public BigInteger getAsBigInteger() {
        Serializable serializable = this.f30070b;
        return serializable instanceof BigInteger ? (BigInteger) serializable : a(this) ? BigInteger.valueOf(getAsNumber().longValue()) : mk.t.parseBigInteger(getAsString());
    }

    @Override // com.google.gson.q
    public boolean getAsBoolean() {
        return isBoolean() ? ((Boolean) this.f30070b).booleanValue() : Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.q
    public byte getAsByte() {
        return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.q
    @Deprecated
    public char getAsCharacter() {
        String asString = getAsString();
        if (asString.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return asString.charAt(0);
    }

    @Override // com.google.gson.q
    public double getAsDouble() {
        return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.q
    public float getAsFloat() {
        return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.q
    public int getAsInt() {
        return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.q
    public long getAsLong() {
        return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
    }

    @Override // com.google.gson.q
    public Number getAsNumber() {
        Serializable serializable = this.f30070b;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new mk.j((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.q
    public short getAsShort() {
        return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
    }

    @Override // com.google.gson.q
    public String getAsString() {
        Serializable serializable = this.f30070b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (isNumber()) {
            return getAsNumber().toString();
        }
        if (isBoolean()) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f30070b;
        if (serializable == null) {
            return 31;
        }
        if (a(this)) {
            jDoubleToLongBits = getAsNumber().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public boolean isBoolean() {
        return this.f30070b instanceof Boolean;
    }

    public boolean isNumber() {
        return this.f30070b instanceof Number;
    }

    public boolean isString() {
        return this.f30070b instanceof String;
    }

    public v(Number number) {
        Objects.requireNonNull(number);
        this.f30070b = number;
    }

    public v(String str) {
        Objects.requireNonNull(str);
        this.f30070b = str;
    }

    public v(Character ch2) {
        Objects.requireNonNull(ch2);
        this.f30070b = ch2.toString();
    }
}
