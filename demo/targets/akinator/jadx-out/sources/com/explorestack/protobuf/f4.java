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
public final class f4 extends s6 implements g4 {

    /* renamed from: h, reason: collision with root package name */
    public static final f4 f22126h = new f4();

    /* renamed from: i, reason: collision with root package name */
    public static final d4 f22127i = new d4();

    /* renamed from: c, reason: collision with root package name */
    public int f22128c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22129e;

    /* renamed from: g, reason: collision with root package name */
    public byte f22131g = -1;

    /* renamed from: f, reason: collision with root package name */
    public List f22130f = Collections.EMPTY_LIST;

    public static f4 getDefaultInstance() {
        return f22126h;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.K;
    }

    public static e4 newBuilder() {
        return f22126h.toBuilder();
    }

    public static f4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (f4) k7.parseDelimitedWithIOException(f22127i, inputStream);
    }

    public static f4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f4) f22127i.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22127i;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return super.equals(obj);
        }
        f4 f4Var = (f4) obj;
        if (hasDeprecated() != f4Var.hasDeprecated()) {
            return false;
        }
        return (!hasDeprecated() || getDeprecated() == f4Var.getDeprecated()) && getUninterpretedOptionList().equals(f4Var.getUninterpretedOptionList()) && this.unknownFields.equals(f4Var.unknownFields) && this.f22625b.getAllFields().equals(f4Var.f22625b.getAllFields());
    }

    @Override // com.explorestack.protobuf.g4
    public boolean getDeprecated() {
        return this.f22129e;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22127i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeBoolSize = (this.f22128c & 1) != 0 ? h0.computeBoolSize(33, this.f22129e) : 0;
        for (int i11 = 0; i11 < this.f22130f.size(); i11++) {
            iComputeBoolSize += h0.computeMessageSize(999, (MessageLite) this.f22130f.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + this.f22625b.getSerializedSize() + iComputeBoolSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.g4
    public v4 getUninterpretedOption(int i10) {
        return (v4) this.f22130f.get(i10);
    }

    @Override // com.explorestack.protobuf.g4
    public int getUninterpretedOptionCount() {
        return this.f22130f.size();
    }

    @Override // com.explorestack.protobuf.g4
    public List<v4> getUninterpretedOptionList() {
        return this.f22130f;
    }

    @Override // com.explorestack.protobuf.g4
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        return (w4) this.f22130f.get(i10);
    }

    @Override // com.explorestack.protobuf.g4
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        return this.f22130f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.g4
    public boolean hasDeprecated() {
        return (this.f22128c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasDeprecated()) {
            iHashCode = p0.o2.B(iHashCode, 37, 33, 53) + x7.hashBoolean(getDeprecated());
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (AbstractMessage.hashFields(iHashCode, this.f22625b.getAllFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.L.ensureFieldAccessorsInitialized(f4.class, e4.class);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22131g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                this.f22131g = (byte) 0;
                return false;
            }
        }
        if (this.f22625b.isInitialized()) {
            this.f22131g = (byte) 1;
            return true;
        }
        this.f22131g = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new f4();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        r6 r6Var = new r6(this);
        if ((this.f22128c & 1) != 0) {
            h0Var.writeBool(33, this.f22129e);
        }
        for (int i10 = 0; i10 < this.f22130f.size(); i10++) {
            h0Var.writeMessage(999, (MessageLite) this.f22130f.get(i10));
        }
        r6Var.writeUntil(536870912, h0Var);
        this.unknownFields.writeTo(h0Var);
    }

    public static e4 newBuilder(f4 f4Var) {
        return f22126h.toBuilder().mergeFrom(f4Var);
    }

    public static f4 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (f4) f22127i.parseFrom(byteBuffer, m5Var);
    }

    public static f4 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (f4) k7.parseDelimitedWithIOException(f22127i, inputStream, m5Var);
    }

    public static f4 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (f4) f22127i.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public f4 getDefaultInstanceForType() {
        return f22126h;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public e4 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public e4 toBuilder() {
        if (this == f22126h) {
            return new e4();
        }
        return new e4().mergeFrom(this);
    }

    public static f4 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (f4) f22127i.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        e4 e4Var = new e4(p6Var);
        e4Var.f22078f = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            e4Var.j();
        }
        return e4Var;
    }

    public static f4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (f4) f22127i.parseFrom(bArr);
    }

    public static f4 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (f4) f22127i.parseFrom(bArr, m5Var);
    }

    public static f4 parseFrom(InputStream inputStream) throws IOException {
        return (f4) k7.parseWithIOException(f22127i, inputStream);
    }

    public static f4 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (f4) k7.parseWithIOException(f22127i, inputStream, m5Var);
    }

    public static f4 parseFrom(y yVar) throws IOException {
        return (f4) k7.parseWithIOException(f22127i, yVar);
    }

    public static f4 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (f4) k7.parseWithIOException(f22127i, yVar, m5Var);
    }
}
