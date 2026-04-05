package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z0 extends k7 implements a1 {

    /* renamed from: g, reason: collision with root package name */
    public static final z0 f22929g = new z0();

    /* renamed from: h, reason: collision with root package name */
    public static final x0 f22930h = new x0();

    /* renamed from: b, reason: collision with root package name */
    public int f22931b;

    /* renamed from: c, reason: collision with root package name */
    public int f22932c;

    /* renamed from: e, reason: collision with root package name */
    public int f22933e;

    /* renamed from: f, reason: collision with root package name */
    public byte f22934f = -1;

    public static z0 getDefaultInstance() {
        return f22929g;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22840g;
    }

    public static y0 newBuilder() {
        return f22929g.toBuilder();
    }

    public static z0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (z0) k7.parseDelimitedWithIOException(f22930h, inputStream);
    }

    public static z0 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (z0) f22930h.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22930h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        if (hasStart() != z0Var.hasStart()) {
            return false;
        }
        if ((!hasStart() || getStart() == z0Var.getStart()) && hasEnd() == z0Var.hasEnd()) {
            return (!hasEnd() || getEnd() == z0Var.getEnd()) && this.unknownFields.equals(z0Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.a1
    public int getEnd() {
        return this.f22933e;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22930h;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeInt32Size = (this.f22931b & 1) != 0 ? h0.computeInt32Size(1, this.f22932c) : 0;
        if ((this.f22931b & 2) != 0) {
            iComputeInt32Size += h0.computeInt32Size(2, this.f22933e);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.a1
    public int getStart() {
        return this.f22932c;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.a1
    public boolean hasEnd() {
        return (this.f22931b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.a1
    public boolean hasStart() {
        return (this.f22931b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasStart()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getStart();
        }
        if (hasEnd()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getEnd();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22841h.ensureFieldAccessorsInitialized(z0.class, y0.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22934f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22934f = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new z0();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22931b & 1) != 0) {
            h0Var.writeInt32(1, this.f22932c);
        }
        if ((this.f22931b & 2) != 0) {
            h0Var.writeInt32(2, this.f22933e);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static y0 newBuilder(z0 z0Var) {
        return f22929g.toBuilder().mergeFrom(z0Var);
    }

    public static z0 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (z0) f22930h.parseFrom(byteBuffer, m5Var);
    }

    public static z0 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (z0) k7.parseDelimitedWithIOException(f22930h, inputStream, m5Var);
    }

    public static z0 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (z0) f22930h.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public z0 getDefaultInstanceForType() {
        return f22929g;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public y0 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public y0 toBuilder() {
        if (this == f22929g) {
            return new y0(null);
        }
        return new y0(null).mergeFrom(this);
    }

    public static z0 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (z0) f22930h.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        return new y0(p6Var);
    }

    public static z0 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (z0) f22930h.parseFrom(bArr);
    }

    public static z0 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (z0) f22930h.parseFrom(bArr, m5Var);
    }

    public static z0 parseFrom(InputStream inputStream) throws IOException {
        return (z0) k7.parseWithIOException(f22930h, inputStream);
    }

    public static z0 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (z0) k7.parseWithIOException(f22930h, inputStream, m5Var);
    }

    public static z0 parseFrom(y yVar) throws IOException {
        return (z0) k7.parseWithIOException(f22930h, yVar);
    }

    public static z0 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (z0) k7.parseWithIOException(f22930h, yVar, m5Var);
    }
}
