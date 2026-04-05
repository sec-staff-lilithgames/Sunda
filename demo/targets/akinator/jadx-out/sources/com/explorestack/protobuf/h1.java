package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h1 extends k7 implements i1 {

    /* renamed from: g, reason: collision with root package name */
    public static final h1 f22188g = new h1();

    /* renamed from: h, reason: collision with root package name */
    public static final f1 f22189h = new f1();

    /* renamed from: b, reason: collision with root package name */
    public int f22190b;

    /* renamed from: c, reason: collision with root package name */
    public int f22191c;

    /* renamed from: e, reason: collision with root package name */
    public int f22192e;

    /* renamed from: f, reason: collision with root package name */
    public byte f22193f = -1;

    public static h1 getDefaultInstance() {
        return f22188g;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22850q;
    }

    public static g1 newBuilder() {
        return f22188g.toBuilder();
    }

    public static h1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (h1) k7.parseDelimitedWithIOException(f22189h, inputStream);
    }

    public static h1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (h1) f22189h.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22189h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return super.equals(obj);
        }
        h1 h1Var = (h1) obj;
        if (hasStart() != h1Var.hasStart()) {
            return false;
        }
        if ((!hasStart() || getStart() == h1Var.getStart()) && hasEnd() == h1Var.hasEnd()) {
            return (!hasEnd() || getEnd() == h1Var.getEnd()) && this.unknownFields.equals(h1Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.i1
    public int getEnd() {
        return this.f22192e;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22189h;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeInt32Size = (this.f22190b & 1) != 0 ? h0.computeInt32Size(1, this.f22191c) : 0;
        if ((this.f22190b & 2) != 0) {
            iComputeInt32Size += h0.computeInt32Size(2, this.f22192e);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.i1
    public int getStart() {
        return this.f22191c;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.i1
    public boolean hasEnd() {
        return (this.f22190b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.i1
    public boolean hasStart() {
        return (this.f22190b & 1) != 0;
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
        return x4.f22851r.ensureFieldAccessorsInitialized(h1.class, g1.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22193f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22193f = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new h1();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22190b & 1) != 0) {
            h0Var.writeInt32(1, this.f22191c);
        }
        if ((this.f22190b & 2) != 0) {
            h0Var.writeInt32(2, this.f22192e);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static g1 newBuilder(h1 h1Var) {
        return f22188g.toBuilder().mergeFrom(h1Var);
    }

    public static h1 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (h1) f22189h.parseFrom(byteBuffer, m5Var);
    }

    public static h1 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (h1) k7.parseDelimitedWithIOException(f22189h, inputStream, m5Var);
    }

    public static h1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (h1) f22189h.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public h1 getDefaultInstanceForType() {
        return f22188g;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g1 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public g1 toBuilder() {
        if (this == f22188g) {
            return new g1(null);
        }
        return new g1(null).mergeFrom(this);
    }

    public static h1 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (h1) f22189h.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        return new g1(p6Var);
    }

    public static h1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (h1) f22189h.parseFrom(bArr);
    }

    public static h1 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (h1) f22189h.parseFrom(bArr, m5Var);
    }

    public static h1 parseFrom(InputStream inputStream) throws IOException {
        return (h1) k7.parseWithIOException(f22189h, inputStream);
    }

    public static h1 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (h1) k7.parseWithIOException(f22189h, inputStream, m5Var);
    }

    public static h1 parseFrom(y yVar) throws IOException {
        return (h1) k7.parseWithIOException(f22189h, yVar);
    }

    public static h1 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (h1) k7.parseWithIOException(f22189h, yVar, m5Var);
    }
}
