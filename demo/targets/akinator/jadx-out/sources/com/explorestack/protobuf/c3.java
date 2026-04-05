package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c3 extends k7 implements d3 {

    /* renamed from: e, reason: collision with root package name */
    public static final c3 f21978e = new c3();

    /* renamed from: f, reason: collision with root package name */
    public static final w2 f21979f = new w2();

    /* renamed from: c, reason: collision with root package name */
    public byte f21981c = -1;

    /* renamed from: b, reason: collision with root package name */
    public List f21980b = Collections.EMPTY_LIST;

    public static c3 getDefaultInstance() {
        return f21978e;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.W;
    }

    public static b3 newBuilder() {
        return f21978e.toBuilder();
    }

    public static c3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (c3) k7.parseDelimitedWithIOException(f21979f, inputStream);
    }

    public static c3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (c3) f21979f.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f21979f;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return super.equals(obj);
        }
        c3 c3Var = (c3) obj;
        return getAnnotationList().equals(c3Var.getAnnotationList()) && this.unknownFields.equals(c3Var.unknownFields);
    }

    @Override // com.explorestack.protobuf.d3
    public z2 getAnnotation(int i10) {
        return (z2) this.f21980b.get(i10);
    }

    @Override // com.explorestack.protobuf.d3
    public int getAnnotationCount() {
        return this.f21980b.size();
    }

    @Override // com.explorestack.protobuf.d3
    public List<z2> getAnnotationList() {
        return this.f21980b;
    }

    @Override // com.explorestack.protobuf.d3
    public a3 getAnnotationOrBuilder(int i10) {
        return (a3) this.f21980b.get(i10);
    }

    @Override // com.explorestack.protobuf.d3
    public List<? extends a3> getAnnotationOrBuilderList() {
        return this.f21980b;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f21979f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = 0;
        for (int i11 = 0; i11 < this.f21980b.size(); i11++) {
            iComputeMessageSize += h0.computeMessageSize(1, (MessageLite) this.f21980b.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getAnnotationCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getAnnotationList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.X.ensureFieldAccessorsInitialized(c3.class, b3.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f21981c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f21981c = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new c3();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        for (int i10 = 0; i10 < this.f21980b.size(); i10++) {
            h0Var.writeMessage(1, (MessageLite) this.f21980b.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static b3 newBuilder(c3 c3Var) {
        return f21978e.toBuilder().mergeFrom(c3Var);
    }

    public static c3 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (c3) f21979f.parseFrom(byteBuffer, m5Var);
    }

    public static c3 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (c3) k7.parseDelimitedWithIOException(f21979f, inputStream, m5Var);
    }

    public static c3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (c3) f21979f.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public c3 getDefaultInstanceForType() {
        return f21978e;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public b3 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public b3 toBuilder() {
        if (this == f21978e) {
            return new b3();
        }
        return new b3().mergeFrom(this);
    }

    public static c3 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (c3) f21979f.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        b3 b3Var = new b3(p6Var);
        b3Var.f21929c = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            b3Var.e();
        }
        return b3Var;
    }

    public static c3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (c3) f21979f.parseFrom(bArr);
    }

    public static c3 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (c3) f21979f.parseFrom(bArr, m5Var);
    }

    public static c3 parseFrom(InputStream inputStream) throws IOException {
        return (c3) k7.parseWithIOException(f21979f, inputStream);
    }

    public static c3 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (c3) k7.parseWithIOException(f21979f, inputStream, m5Var);
    }

    public static c3 parseFrom(y yVar) throws IOException {
        return (c3) k7.parseWithIOException(f21979f, yVar);
    }

    public static c3 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (c3) k7.parseWithIOException(f21979f, yVar, m5Var);
    }
}
