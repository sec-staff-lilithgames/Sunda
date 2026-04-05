package com.google.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@CheckReturnValue
/* loaded from: classes7.dex */
abstract class UnknownFieldSchema<T, B> {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private final void mergeFrom(B b10, Reader reader, int i10) throws IOException {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b10, reader, i10)) {
        }
    }

    public abstract void addFixed32(B b10, int i10, int i11);

    public abstract void addFixed64(B b10, int i10, long j10);

    public abstract void addGroup(B b10, int i10, T t10);

    public abstract void addLengthDelimited(B b10, int i10, ByteString byteString);

    public abstract void addVarint(B b10, int i10, long j10);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t10);

    public abstract int getSerializedSizeAsMessageSet(T t10);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t10, T t11);

    public final boolean mergeOneFieldFrom(B b10, Reader reader, int i10) throws IOException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b10, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b10, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b10, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b10, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i11 = i10 + 1;
        if (i11 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        mergeFrom(bNewBuilder, reader, i11);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b10, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b10);

    public void setRecursionLimit(int i10) {
        recursionLimit = i10;
    }

    public abstract void setToMessage(Object obj, T t10);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b10);

    public abstract void writeAsMessageSetTo(T t10, Writer writer) throws IOException;

    public abstract void writeTo(T t10, Writer writer) throws IOException;
}
