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
public final class z1 extends s6 implements a2 {

    /* renamed from: f, reason: collision with root package name */
    public static final z1 f22935f = new z1();

    /* renamed from: g, reason: collision with root package name */
    public static final x1 f22936g = new x1();

    /* renamed from: e, reason: collision with root package name */
    public byte f22938e = -1;

    /* renamed from: c, reason: collision with root package name */
    public List f22937c = Collections.EMPTY_LIST;

    public static z1 getDefaultInstance() {
        return f22935f;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22842i;
    }

    public static y1 newBuilder() {
        return f22935f.toBuilder();
    }

    public static z1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (z1) k7.parseDelimitedWithIOException(f22936g, inputStream);
    }

    public static z1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (z1) f22936g.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22936g;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return super.equals(obj);
        }
        z1 z1Var = (z1) obj;
        return getUninterpretedOptionList().equals(z1Var.getUninterpretedOptionList()) && this.unknownFields.equals(z1Var.unknownFields) && this.f22625b.getAllFields().equals(z1Var.f22625b.getAllFields());
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22936g;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = 0;
        for (int i11 = 0; i11 < this.f22937c.size(); i11++) {
            iComputeMessageSize += h0.computeMessageSize(999, (MessageLite) this.f22937c.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + this.f22625b.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.a2
    public v4 getUninterpretedOption(int i10) {
        return (v4) this.f22937c.get(i10);
    }

    @Override // com.explorestack.protobuf.a2
    public int getUninterpretedOptionCount() {
        return this.f22937c.size();
    }

    @Override // com.explorestack.protobuf.a2
    public List<v4> getUninterpretedOptionList() {
        return this.f22937c;
    }

    @Override // com.explorestack.protobuf.a2
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        return (w4) this.f22937c.get(i10);
    }

    @Override // com.explorestack.protobuf.a2
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        return this.f22937c;
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
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (AbstractMessage.hashFields(iHashCode, this.f22625b.getAllFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22843j.ensureFieldAccessorsInitialized(z1.class, y1.class);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22938e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                this.f22938e = (byte) 0;
                return false;
            }
        }
        if (this.f22625b.isInitialized()) {
            this.f22938e = (byte) 1;
            return true;
        }
        this.f22938e = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new z1();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        r6 r6Var = new r6(this);
        for (int i10 = 0; i10 < this.f22937c.size(); i10++) {
            h0Var.writeMessage(999, (MessageLite) this.f22937c.get(i10));
        }
        r6Var.writeUntil(536870912, h0Var);
        this.unknownFields.writeTo(h0Var);
    }

    public static y1 newBuilder(z1 z1Var) {
        return f22935f.toBuilder().mergeFrom(z1Var);
    }

    public static z1 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (z1) f22936g.parseFrom(byteBuffer, m5Var);
    }

    public static z1 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (z1) k7.parseDelimitedWithIOException(f22936g, inputStream, m5Var);
    }

    public static z1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (z1) f22936g.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public z1 getDefaultInstanceForType() {
        return f22935f;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public y1 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public y1 toBuilder() {
        if (this == f22935f) {
            return new y1();
        }
        return new y1().mergeFrom(this);
    }

    public static z1 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (z1) f22936g.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        y1 y1Var = new y1(p6Var);
        y1Var.f22903e = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            y1Var.j();
        }
        return y1Var;
    }

    public static z1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (z1) f22936g.parseFrom(bArr);
    }

    public static z1 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (z1) f22936g.parseFrom(bArr, m5Var);
    }

    public static z1 parseFrom(InputStream inputStream) throws IOException {
        return (z1) k7.parseWithIOException(f22936g, inputStream);
    }

    public static z1 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (z1) k7.parseWithIOException(f22936g, inputStream, m5Var);
    }

    public static z1 parseFrom(y yVar) throws IOException {
        return (z1) k7.parseWithIOException(f22936g, yVar);
    }

    public static z1 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (z1) k7.parseWithIOException(f22936g, yVar, m5Var);
    }
}
