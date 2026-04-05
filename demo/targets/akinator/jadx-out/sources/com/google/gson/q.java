package com.google.gson;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class q {
    @Deprecated
    public q() {
    }

    public abstract q deepCopy();

    public BigDecimal getAsBigDecimal() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger getAsBigInteger() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean getAsBoolean() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte getAsByte() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char getAsCharacter() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double getAsDouble() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float getAsFloat() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int getAsInt() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public p getAsJsonArray() {
        if (isJsonArray()) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public s getAsJsonNull() {
        if (isJsonNull()) {
            return (s) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public t getAsJsonObject() {
        if (isJsonObject()) {
            return (t) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public v getAsJsonPrimitive() {
        if (isJsonPrimitive()) {
            return (v) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long getAsLong() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number getAsNumber() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short getAsShort() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String getAsString() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean isJsonArray() {
        return this instanceof p;
    }

    public boolean isJsonNull() {
        return this instanceof s;
    }

    public boolean isJsonObject() {
        return this instanceof t;
    }

    public boolean isJsonPrimitive() {
        return this instanceof v;
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            JsonWriter jsonWriter = new JsonWriter(mk.d0.writerForAppendable(sb2));
            jsonWriter.setStrictness(c0.f29915b);
            mk.d0.write(this, jsonWriter);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
