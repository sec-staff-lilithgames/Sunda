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
public final class g3 extends s6 implements h3 {

    /* renamed from: k, reason: collision with root package name */
    public static final g3 f22151k = new g3();

    /* renamed from: l, reason: collision with root package name */
    public static final e3 f22152l = new e3();

    /* renamed from: c, reason: collision with root package name */
    public int f22153c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22154e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22155f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22156g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22157h;

    /* renamed from: j, reason: collision with root package name */
    public byte f22159j = -1;

    /* renamed from: i, reason: collision with root package name */
    public List f22158i = Collections.EMPTY_LIST;

    public static g3 getDefaultInstance() {
        return f22151k;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.A;
    }

    public static f3 newBuilder() {
        return f22151k.toBuilder();
    }

    public static g3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (g3) k7.parseDelimitedWithIOException(f22152l, inputStream);
    }

    public static g3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (g3) f22152l.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22152l;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return super.equals(obj);
        }
        g3 g3Var = (g3) obj;
        if (hasMessageSetWireFormat() != g3Var.hasMessageSetWireFormat()) {
            return false;
        }
        if ((hasMessageSetWireFormat() && getMessageSetWireFormat() != g3Var.getMessageSetWireFormat()) || hasNoStandardDescriptorAccessor() != g3Var.hasNoStandardDescriptorAccessor()) {
            return false;
        }
        if ((hasNoStandardDescriptorAccessor() && getNoStandardDescriptorAccessor() != g3Var.getNoStandardDescriptorAccessor()) || hasDeprecated() != g3Var.hasDeprecated()) {
            return false;
        }
        if ((!hasDeprecated() || getDeprecated() == g3Var.getDeprecated()) && hasMapEntry() == g3Var.hasMapEntry()) {
            return (!hasMapEntry() || getMapEntry() == g3Var.getMapEntry()) && getUninterpretedOptionList().equals(g3Var.getUninterpretedOptionList()) && this.unknownFields.equals(g3Var.unknownFields) && this.f22625b.getAllFields().equals(g3Var.f22625b.getAllFields());
        }
        return false;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean getDeprecated() {
        return this.f22156g;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean getMapEntry() {
        return this.f22157h;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean getMessageSetWireFormat() {
        return this.f22154e;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean getNoStandardDescriptorAccessor() {
        return this.f22155f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22152l;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeBoolSize = (this.f22153c & 1) != 0 ? h0.computeBoolSize(1, this.f22154e) : 0;
        if ((this.f22153c & 2) != 0) {
            iComputeBoolSize += h0.computeBoolSize(2, this.f22155f);
        }
        if ((this.f22153c & 4) != 0) {
            iComputeBoolSize += h0.computeBoolSize(3, this.f22156g);
        }
        if ((this.f22153c & 8) != 0) {
            iComputeBoolSize += h0.computeBoolSize(7, this.f22157h);
        }
        for (int i11 = 0; i11 < this.f22158i.size(); i11++) {
            iComputeBoolSize += h0.computeMessageSize(999, (MessageLite) this.f22158i.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + this.f22625b.getSerializedSize() + iComputeBoolSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.h3
    public v4 getUninterpretedOption(int i10) {
        return (v4) this.f22158i.get(i10);
    }

    @Override // com.explorestack.protobuf.h3
    public int getUninterpretedOptionCount() {
        return this.f22158i.size();
    }

    @Override // com.explorestack.protobuf.h3
    public List<v4> getUninterpretedOptionList() {
        return this.f22158i;
    }

    @Override // com.explorestack.protobuf.h3
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        return (w4) this.f22158i.get(i10);
    }

    @Override // com.explorestack.protobuf.h3
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        return this.f22158i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean hasDeprecated() {
        return (this.f22153c & 4) != 0;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean hasMapEntry() {
        return (this.f22153c & 8) != 0;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean hasMessageSetWireFormat() {
        return (this.f22153c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean hasNoStandardDescriptorAccessor() {
        return (this.f22153c & 2) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasMessageSetWireFormat()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + x7.hashBoolean(getMessageSetWireFormat());
        }
        if (hasNoStandardDescriptorAccessor()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + x7.hashBoolean(getNoStandardDescriptorAccessor());
        }
        if (hasDeprecated()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + x7.hashBoolean(getDeprecated());
        }
        if (hasMapEntry()) {
            iHashCode = p0.o2.B(iHashCode, 37, 7, 53) + x7.hashBoolean(getMapEntry());
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
        return x4.B.ensureFieldAccessorsInitialized(g3.class, f3.class);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22159j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                this.f22159j = (byte) 0;
                return false;
            }
        }
        if (this.f22625b.isInitialized()) {
            this.f22159j = (byte) 1;
            return true;
        }
        this.f22159j = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new g3();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        r6 r6Var = new r6(this);
        if ((this.f22153c & 1) != 0) {
            h0Var.writeBool(1, this.f22154e);
        }
        if ((this.f22153c & 2) != 0) {
            h0Var.writeBool(2, this.f22155f);
        }
        if ((this.f22153c & 4) != 0) {
            h0Var.writeBool(3, this.f22156g);
        }
        if ((this.f22153c & 8) != 0) {
            h0Var.writeBool(7, this.f22157h);
        }
        for (int i10 = 0; i10 < this.f22158i.size(); i10++) {
            h0Var.writeMessage(999, (MessageLite) this.f22158i.get(i10));
        }
        r6Var.writeUntil(536870912, h0Var);
        this.unknownFields.writeTo(h0Var);
    }

    public static f3 newBuilder(g3 g3Var) {
        return f22151k.toBuilder().mergeFrom(g3Var);
    }

    public static g3 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (g3) f22152l.parseFrom(byteBuffer, m5Var);
    }

    public static g3 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (g3) k7.parseDelimitedWithIOException(f22152l, inputStream, m5Var);
    }

    public static g3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (g3) f22152l.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public g3 getDefaultInstanceForType() {
        return f22151k;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public f3 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public f3 toBuilder() {
        if (this == f22151k) {
            return new f3();
        }
        return new f3().mergeFrom(this);
    }

    public static g3 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (g3) f22152l.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        f3 f3Var = new f3(p6Var);
        f3Var.f22124i = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            f3Var.j();
        }
        return f3Var;
    }

    public static g3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (g3) f22152l.parseFrom(bArr);
    }

    public static g3 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (g3) f22152l.parseFrom(bArr, m5Var);
    }

    public static g3 parseFrom(InputStream inputStream) throws IOException {
        return (g3) k7.parseWithIOException(f22152l, inputStream);
    }

    public static g3 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (g3) k7.parseWithIOException(f22152l, inputStream, m5Var);
    }

    public static g3 parseFrom(y yVar) throws IOException {
        return (g3) k7.parseWithIOException(f22152l, yVar);
    }

    public static g3 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (g3) k7.parseWithIOException(f22152l, yVar, m5Var);
    }
}
