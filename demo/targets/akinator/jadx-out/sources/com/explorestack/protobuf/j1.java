package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j1 extends k7 implements k1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j1 f22254j = new j1();

    /* renamed from: k, reason: collision with root package name */
    public static final d1 f22255k = new d1();

    /* renamed from: b, reason: collision with root package name */
    public int f22256b;

    /* renamed from: e, reason: collision with root package name */
    public List f22258e;

    /* renamed from: f, reason: collision with root package name */
    public n1 f22259f;

    /* renamed from: g, reason: collision with root package name */
    public List f22260g;

    /* renamed from: h, reason: collision with root package name */
    public g8 f22261h;

    /* renamed from: i, reason: collision with root package name */
    public byte f22262i = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f22257c = "";

    public j1() {
        List list = Collections.EMPTY_LIST;
        this.f22258e = list;
        this.f22260g = list;
        this.f22261h = f8.f22138e;
    }

    public static j1 getDefaultInstance() {
        return f22254j;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22848o;
    }

    public static e1 newBuilder() {
        return f22254j.toBuilder();
    }

    public static j1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (j1) k7.parseDelimitedWithIOException(f22255k, inputStream);
    }

    public static j1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (j1) f22255k.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22255k;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        if (hasName() != j1Var.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(j1Var.getName())) && getValueList().equals(j1Var.getValueList()) && hasOptions() == j1Var.hasOptions()) {
            return (!hasOptions() || getOptions().equals(j1Var.getOptions())) && getReservedRangeList().equals(j1Var.getReservedRangeList()) && getReservedNameList().equals(j1Var.getReservedNameList()) && this.unknownFields.equals(j1Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.k1
    public String getName() {
        Serializable serializable = this.f22257c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22257c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.k1
    public ByteString getNameBytes() {
        Serializable serializable = this.f22257c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22257c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k1
    public n1 getOptions() {
        n1 n1Var = this.f22259f;
        return n1Var == null ? n1.getDefaultInstance() : n1Var;
    }

    @Override // com.explorestack.protobuf.k1
    public o1 getOptionsOrBuilder() {
        n1 n1Var = this.f22259f;
        return n1Var == null ? n1.getDefaultInstance() : n1Var;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22255k;
    }

    @Override // com.explorestack.protobuf.k1
    public String getReservedName(int i10) {
        return (String) this.f22261h.get(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public ByteString getReservedNameBytes(int i10) {
        return this.f22261h.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public int getReservedNameCount() {
        return this.f22261h.size();
    }

    @Override // com.explorestack.protobuf.k1
    public h1 getReservedRange(int i10) {
        return (h1) this.f22260g.get(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public int getReservedRangeCount() {
        return this.f22260g.size();
    }

    @Override // com.explorestack.protobuf.k1
    public List<h1> getReservedRangeList() {
        return this.f22260g;
    }

    @Override // com.explorestack.protobuf.k1
    public i1 getReservedRangeOrBuilder(int i10) {
        return (i1) this.f22260g.get(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public List<? extends i1> getReservedRangeOrBuilderList() {
        return this.f22260g;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f22256b & 1) != 0 ? k7.computeStringSize(1, this.f22257c) : 0;
        for (int i11 = 0; i11 < this.f22258e.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(2, (MessageLite) this.f22258e.get(i11));
        }
        if ((this.f22256b & 2) != 0) {
            iComputeStringSize += h0.computeMessageSize(3, getOptions());
        }
        for (int i12 = 0; i12 < this.f22260g.size(); i12++) {
            iComputeStringSize += h0.computeMessageSize(4, (MessageLite) this.f22260g.get(i12));
        }
        int iE = 0;
        for (int i13 = 0; i13 < this.f22261h.size(); i13++) {
            iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.f22261h, i13, iE);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + getReservedNameList().size() + iComputeStringSize + iE;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.k1
    public r1 getValue(int i10) {
        return (r1) this.f22258e.get(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public int getValueCount() {
        return this.f22258e.size();
    }

    @Override // com.explorestack.protobuf.k1
    public List<r1> getValueList() {
        return this.f22258e;
    }

    @Override // com.explorestack.protobuf.k1
    public s1 getValueOrBuilder(int i10) {
        return (s1) this.f22258e.get(i10);
    }

    @Override // com.explorestack.protobuf.k1
    public List<? extends s1> getValueOrBuilderList() {
        return this.f22258e;
    }

    @Override // com.explorestack.protobuf.k1
    public boolean hasName() {
        return (this.f22256b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.k1
    public boolean hasOptions() {
        return (this.f22256b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (getValueCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getValueList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 4, 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 5, 53) + getReservedNameList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22849p.ensureFieldAccessorsInitialized(j1.class, e1.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22262i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getValueCount(); i10++) {
            if (!getValue(i10).isInitialized()) {
                this.f22262i = (byte) 0;
                return false;
            }
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f22262i = (byte) 1;
            return true;
        }
        this.f22262i = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new j1();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22256b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f22257c);
        }
        for (int i10 = 0; i10 < this.f22258e.size(); i10++) {
            h0Var.writeMessage(2, (MessageLite) this.f22258e.get(i10));
        }
        if ((this.f22256b & 2) != 0) {
            h0Var.writeMessage(3, getOptions());
        }
        for (int i11 = 0; i11 < this.f22260g.size(); i11++) {
            h0Var.writeMessage(4, (MessageLite) this.f22260g.get(i11));
        }
        int iF = 0;
        while (iF < this.f22261h.size()) {
            iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.f22261h, iF, h0Var, 5, iF, 1);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static e1 newBuilder(j1 j1Var) {
        return f22254j.toBuilder().mergeFrom(j1Var);
    }

    public static j1 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (j1) f22255k.parseFrom(byteBuffer, m5Var);
    }

    @Override // com.explorestack.protobuf.k1
    public ka getReservedNameList() {
        return this.f22261h;
    }

    public static j1 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (j1) k7.parseDelimitedWithIOException(f22255k, inputStream, m5Var);
    }

    public static j1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (j1) f22255k.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public j1 getDefaultInstanceForType() {
        return f22254j;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public e1 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public e1 toBuilder() {
        if (this == f22254j) {
            return new e1();
        }
        return new e1().mergeFrom(this);
    }

    public static j1 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (j1) f22255k.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        e1 e1Var = new e1(p6Var);
        e1Var.f22068c = "";
        List list = Collections.EMPTY_LIST;
        e1Var.f22069e = list;
        e1Var.f22073i = list;
        e1Var.f22075k = f8.f22138e;
        if (k7.alwaysUseFieldBuilders) {
            e1Var.i();
            if (e1Var.f22072h == null) {
                e1Var.f22072h = new xa(e1Var.getOptions(), e1Var.getParentForChildren(), e1Var.isClean());
                e1Var.f22071g = null;
            }
            e1Var.g();
        }
        return e1Var;
    }

    public static j1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (j1) f22255k.parseFrom(bArr);
    }

    public static j1 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (j1) f22255k.parseFrom(bArr, m5Var);
    }

    public static j1 parseFrom(InputStream inputStream) throws IOException {
        return (j1) k7.parseWithIOException(f22255k, inputStream);
    }

    public static j1 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (j1) k7.parseWithIOException(f22255k, inputStream, m5Var);
    }

    public static j1 parseFrom(y yVar) throws IOException {
        return (j1) k7.parseWithIOException(f22255k, yVar);
    }

    public static j1 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (j1) k7.parseWithIOException(f22255k, yVar, m5Var);
    }
}
