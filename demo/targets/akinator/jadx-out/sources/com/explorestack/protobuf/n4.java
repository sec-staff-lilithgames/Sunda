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
public final class n4 extends k7 implements o4 {

    /* renamed from: e, reason: collision with root package name */
    public static final n4 f22399e = new n4();

    /* renamed from: f, reason: collision with root package name */
    public static final h4 f22400f = new h4();

    /* renamed from: c, reason: collision with root package name */
    public byte f22402c = -1;

    /* renamed from: b, reason: collision with root package name */
    public List f22401b = Collections.EMPTY_LIST;

    public static n4 getDefaultInstance() {
        return f22399e;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.S;
    }

    public static i4 newBuilder() {
        return f22399e.toBuilder();
    }

    public static n4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (n4) k7.parseDelimitedWithIOException(f22400f, inputStream);
    }

    public static n4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (n4) f22400f.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22400f;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return super.equals(obj);
        }
        n4 n4Var = (n4) obj;
        return getLocationList().equals(n4Var.getLocationList()) && this.unknownFields.equals(n4Var.unknownFields);
    }

    @Override // com.explorestack.protobuf.o4
    public l4 getLocation(int i10) {
        return (l4) this.f22401b.get(i10);
    }

    @Override // com.explorestack.protobuf.o4
    public int getLocationCount() {
        return this.f22401b.size();
    }

    @Override // com.explorestack.protobuf.o4
    public List<l4> getLocationList() {
        return this.f22401b;
    }

    @Override // com.explorestack.protobuf.o4
    public m4 getLocationOrBuilder(int i10) {
        return (m4) this.f22401b.get(i10);
    }

    @Override // com.explorestack.protobuf.o4
    public List<? extends m4> getLocationOrBuilderList() {
        return this.f22401b;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22400f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = 0;
        for (int i11 = 0; i11 < this.f22401b.size(); i11++) {
            iComputeMessageSize += h0.computeMessageSize(1, (MessageLite) this.f22401b.get(i11));
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
        if (getLocationCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getLocationList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.T.ensureFieldAccessorsInitialized(n4.class, i4.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22402c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22402c = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new n4();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        for (int i10 = 0; i10 < this.f22401b.size(); i10++) {
            h0Var.writeMessage(1, (MessageLite) this.f22401b.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static i4 newBuilder(n4 n4Var) {
        return f22399e.toBuilder().mergeFrom(n4Var);
    }

    public static n4 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (n4) f22400f.parseFrom(byteBuffer, m5Var);
    }

    public static n4 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (n4) k7.parseDelimitedWithIOException(f22400f, inputStream, m5Var);
    }

    public static n4 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (n4) f22400f.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public n4 getDefaultInstanceForType() {
        return f22399e;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public i4 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public i4 toBuilder() {
        if (this == f22399e) {
            return new i4();
        }
        return new i4().mergeFrom(this);
    }

    public static n4 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (n4) f22400f.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        i4 i4Var = new i4(p6Var);
        i4Var.f22225c = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            i4Var.e();
        }
        return i4Var;
    }

    public static n4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (n4) f22400f.parseFrom(bArr);
    }

    public static n4 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (n4) f22400f.parseFrom(bArr, m5Var);
    }

    public static n4 parseFrom(InputStream inputStream) throws IOException {
        return (n4) k7.parseWithIOException(f22400f, inputStream);
    }

    public static n4 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (n4) k7.parseWithIOException(f22400f, inputStream, m5Var);
    }

    public static n4 parseFrom(y yVar) throws IOException {
        return (n4) k7.parseWithIOException(f22400f, yVar);
    }

    public static n4 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (n4) k7.parseWithIOException(f22400f, yVar, m5Var);
    }
}
