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
public final class b1 extends k7 implements c1 {

    /* renamed from: o, reason: collision with root package name */
    public static final b1 f21914o = new b1();

    /* renamed from: p, reason: collision with root package name */
    public static final r0 f21915p = new r0();

    /* renamed from: b, reason: collision with root package name */
    public int f21916b;

    /* renamed from: e, reason: collision with root package name */
    public List f21918e;

    /* renamed from: f, reason: collision with root package name */
    public List f21919f;

    /* renamed from: g, reason: collision with root package name */
    public List f21920g;

    /* renamed from: h, reason: collision with root package name */
    public List f21921h;

    /* renamed from: i, reason: collision with root package name */
    public List f21922i;

    /* renamed from: j, reason: collision with root package name */
    public List f21923j;

    /* renamed from: k, reason: collision with root package name */
    public g3 f21924k;

    /* renamed from: l, reason: collision with root package name */
    public List f21925l;

    /* renamed from: m, reason: collision with root package name */
    public g8 f21926m;

    /* renamed from: n, reason: collision with root package name */
    public byte f21927n = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f21917c = "";

    public b1() {
        List list = Collections.EMPTY_LIST;
        this.f21918e = list;
        this.f21919f = list;
        this.f21920g = list;
        this.f21921h = list;
        this.f21922i = list;
        this.f21923j = list;
        this.f21925l = list;
        this.f21926m = f8.f22138e;
    }

    public static b1 getDefaultInstance() {
        return f21914o;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22836c;
    }

    public static s0 newBuilder() {
        return f21914o.toBuilder();
    }

    public static b1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (b1) k7.parseDelimitedWithIOException(f21915p, inputStream);
    }

    public static b1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (b1) f21915p.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f21915p;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return super.equals(obj);
        }
        b1 b1Var = (b1) obj;
        if (hasName() != b1Var.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(b1Var.getName())) && getFieldList().equals(b1Var.getFieldList()) && getExtensionList().equals(b1Var.getExtensionList()) && getNestedTypeList().equals(b1Var.getNestedTypeList()) && getEnumTypeList().equals(b1Var.getEnumTypeList()) && getExtensionRangeList().equals(b1Var.getExtensionRangeList()) && getOneofDeclList().equals(b1Var.getOneofDeclList()) && hasOptions() == b1Var.hasOptions()) {
            return (!hasOptions() || getOptions().equals(b1Var.getOptions())) && getReservedRangeList().equals(b1Var.getReservedRangeList()) && getReservedNameList().equals(b1Var.getReservedNameList()) && this.unknownFields.equals(b1Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.c1
    public j1 getEnumType(int i10) {
        return (j1) this.f21921h.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getEnumTypeCount() {
        return this.f21921h.size();
    }

    @Override // com.explorestack.protobuf.c1
    public List<j1> getEnumTypeList() {
        return this.f21921h;
    }

    @Override // com.explorestack.protobuf.c1
    public k1 getEnumTypeOrBuilder(int i10) {
        return (k1) this.f21921h.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends k1> getEnumTypeOrBuilderList() {
        return this.f21921h;
    }

    @Override // com.explorestack.protobuf.c1
    public f2 getExtension(int i10) {
        return (f2) this.f21919f.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getExtensionCount() {
        return this.f21919f.size();
    }

    @Override // com.explorestack.protobuf.c1
    public List<f2> getExtensionList() {
        return this.f21919f;
    }

    @Override // com.explorestack.protobuf.c1
    public g2 getExtensionOrBuilder(int i10) {
        return (g2) this.f21919f.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends g2> getExtensionOrBuilderList() {
        return this.f21919f;
    }

    @Override // com.explorestack.protobuf.c1
    public v0 getExtensionRange(int i10) {
        return (v0) this.f21922i.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getExtensionRangeCount() {
        return this.f21922i.size();
    }

    @Override // com.explorestack.protobuf.c1
    public List<v0> getExtensionRangeList() {
        return this.f21922i;
    }

    @Override // com.explorestack.protobuf.c1
    public w0 getExtensionRangeOrBuilder(int i10) {
        return (w0) this.f21922i.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends w0> getExtensionRangeOrBuilderList() {
        return this.f21922i;
    }

    @Override // com.explorestack.protobuf.c1
    public f2 getField(int i10) {
        return (f2) this.f21918e.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getFieldCount() {
        return this.f21918e.size();
    }

    @Override // com.explorestack.protobuf.c1
    public List<f2> getFieldList() {
        return this.f21918e;
    }

    @Override // com.explorestack.protobuf.c1
    public g2 getFieldOrBuilder(int i10) {
        return (g2) this.f21918e.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends g2> getFieldOrBuilderList() {
        return this.f21918e;
    }

    @Override // com.explorestack.protobuf.c1
    public String getName() {
        Serializable serializable = this.f21917c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f21917c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.c1
    public ByteString getNameBytes() {
        Serializable serializable = this.f21917c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f21917c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.c1
    public b1 getNestedType(int i10) {
        return (b1) this.f21920g.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getNestedTypeCount() {
        return this.f21920g.size();
    }

    @Override // com.explorestack.protobuf.c1
    public List<b1> getNestedTypeList() {
        return this.f21920g;
    }

    @Override // com.explorestack.protobuf.c1
    public c1 getNestedTypeOrBuilder(int i10) {
        return (c1) this.f21920g.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends c1> getNestedTypeOrBuilderList() {
        return this.f21920g;
    }

    @Override // com.explorestack.protobuf.c1
    public t3 getOneofDecl(int i10) {
        return (t3) this.f21923j.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getOneofDeclCount() {
        return this.f21923j.size();
    }

    @Override // com.explorestack.protobuf.c1
    public List<t3> getOneofDeclList() {
        return this.f21923j;
    }

    @Override // com.explorestack.protobuf.c1
    public u3 getOneofDeclOrBuilder(int i10) {
        return (u3) this.f21923j.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends u3> getOneofDeclOrBuilderList() {
        return this.f21923j;
    }

    @Override // com.explorestack.protobuf.c1
    public g3 getOptions() {
        g3 g3Var = this.f21924k;
        return g3Var == null ? g3.getDefaultInstance() : g3Var;
    }

    @Override // com.explorestack.protobuf.c1
    public h3 getOptionsOrBuilder() {
        g3 g3Var = this.f21924k;
        return g3Var == null ? g3.getDefaultInstance() : g3Var;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f21915p;
    }

    @Override // com.explorestack.protobuf.c1
    public String getReservedName(int i10) {
        return (String) this.f21926m.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public ByteString getReservedNameBytes(int i10) {
        return this.f21926m.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getReservedNameCount() {
        return this.f21926m.size();
    }

    @Override // com.explorestack.protobuf.c1
    public z0 getReservedRange(int i10) {
        return (z0) this.f21925l.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public int getReservedRangeCount() {
        return this.f21925l.size();
    }

    @Override // com.explorestack.protobuf.c1
    public List<z0> getReservedRangeList() {
        return this.f21925l;
    }

    @Override // com.explorestack.protobuf.c1
    public a1 getReservedRangeOrBuilder(int i10) {
        return (a1) this.f21925l.get(i10);
    }

    @Override // com.explorestack.protobuf.c1
    public List<? extends a1> getReservedRangeOrBuilderList() {
        return this.f21925l;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f21916b & 1) != 0 ? k7.computeStringSize(1, this.f21917c) : 0;
        for (int i11 = 0; i11 < this.f21918e.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(2, (MessageLite) this.f21918e.get(i11));
        }
        for (int i12 = 0; i12 < this.f21920g.size(); i12++) {
            iComputeStringSize += h0.computeMessageSize(3, (MessageLite) this.f21920g.get(i12));
        }
        for (int i13 = 0; i13 < this.f21921h.size(); i13++) {
            iComputeStringSize += h0.computeMessageSize(4, (MessageLite) this.f21921h.get(i13));
        }
        for (int i14 = 0; i14 < this.f21922i.size(); i14++) {
            iComputeStringSize += h0.computeMessageSize(5, (MessageLite) this.f21922i.get(i14));
        }
        for (int i15 = 0; i15 < this.f21919f.size(); i15++) {
            iComputeStringSize += h0.computeMessageSize(6, (MessageLite) this.f21919f.get(i15));
        }
        if ((this.f21916b & 2) != 0) {
            iComputeStringSize += h0.computeMessageSize(7, getOptions());
        }
        for (int i16 = 0; i16 < this.f21923j.size(); i16++) {
            iComputeStringSize += h0.computeMessageSize(8, (MessageLite) this.f21923j.get(i16));
        }
        for (int i17 = 0; i17 < this.f21925l.size(); i17++) {
            iComputeStringSize += h0.computeMessageSize(9, (MessageLite) this.f21925l.get(i17));
        }
        int iE = 0;
        for (int i18 = 0; i18 < this.f21926m.size(); i18++) {
            iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.f21926m, i18, iE);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + getReservedNameList().size() + iComputeStringSize + iE;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.c1
    public boolean hasName() {
        return (this.f21916b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.c1
    public boolean hasOptions() {
        return (this.f21916b & 2) != 0;
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
        if (getFieldCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getFieldList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 6, 53) + getExtensionList().hashCode();
        }
        if (getNestedTypeCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getNestedTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 4, 53) + getEnumTypeList().hashCode();
        }
        if (getExtensionRangeCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 5, 53) + getExtensionRangeList().hashCode();
        }
        if (getOneofDeclCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 8, 53) + getOneofDeclList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = p0.o2.B(iHashCode, 37, 7, 53) + getOptions().hashCode();
        }
        if (getReservedRangeCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 9, 53) + getReservedRangeList().hashCode();
        }
        if (getReservedNameCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 10, 53) + getReservedNameList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22837d.ensureFieldAccessorsInitialized(b1.class, s0.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f21927n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getFieldCount(); i10++) {
            if (!getField(i10).isInitialized()) {
                this.f21927n = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < getExtensionCount(); i11++) {
            if (!getExtension(i11).isInitialized()) {
                this.f21927n = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < getNestedTypeCount(); i12++) {
            if (!getNestedType(i12).isInitialized()) {
                this.f21927n = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < getEnumTypeCount(); i13++) {
            if (!getEnumType(i13).isInitialized()) {
                this.f21927n = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < getExtensionRangeCount(); i14++) {
            if (!getExtensionRange(i14).isInitialized()) {
                this.f21927n = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < getOneofDeclCount(); i15++) {
            if (!getOneofDecl(i15).isInitialized()) {
                this.f21927n = (byte) 0;
                return false;
            }
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f21927n = (byte) 1;
            return true;
        }
        this.f21927n = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new b1();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f21916b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f21917c);
        }
        for (int i10 = 0; i10 < this.f21918e.size(); i10++) {
            h0Var.writeMessage(2, (MessageLite) this.f21918e.get(i10));
        }
        for (int i11 = 0; i11 < this.f21920g.size(); i11++) {
            h0Var.writeMessage(3, (MessageLite) this.f21920g.get(i11));
        }
        for (int i12 = 0; i12 < this.f21921h.size(); i12++) {
            h0Var.writeMessage(4, (MessageLite) this.f21921h.get(i12));
        }
        for (int i13 = 0; i13 < this.f21922i.size(); i13++) {
            h0Var.writeMessage(5, (MessageLite) this.f21922i.get(i13));
        }
        for (int i14 = 0; i14 < this.f21919f.size(); i14++) {
            h0Var.writeMessage(6, (MessageLite) this.f21919f.get(i14));
        }
        if ((this.f21916b & 2) != 0) {
            h0Var.writeMessage(7, getOptions());
        }
        for (int i15 = 0; i15 < this.f21923j.size(); i15++) {
            h0Var.writeMessage(8, (MessageLite) this.f21923j.get(i15));
        }
        for (int i16 = 0; i16 < this.f21925l.size(); i16++) {
            h0Var.writeMessage(9, (MessageLite) this.f21925l.get(i16));
        }
        int iF = 0;
        while (iF < this.f21926m.size()) {
            iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.f21926m, iF, h0Var, 10, iF, 1);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static s0 newBuilder(b1 b1Var) {
        return f21914o.toBuilder().mergeFrom(b1Var);
    }

    public static b1 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (b1) f21915p.parseFrom(byteBuffer, m5Var);
    }

    @Override // com.explorestack.protobuf.c1
    public ka getReservedNameList() {
        return this.f21926m;
    }

    public static b1 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (b1) k7.parseDelimitedWithIOException(f21915p, inputStream, m5Var);
    }

    public static b1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (b1) f21915p.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public b1 getDefaultInstanceForType() {
        return f21914o;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s0 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s0 toBuilder() {
        if (this == f21914o) {
            return new s0();
        }
        return new s0().mergeFrom(this);
    }

    public static b1 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (b1) f21915p.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        s0 s0Var = new s0(p6Var);
        s0Var.f22565c = "";
        List list = Collections.EMPTY_LIST;
        s0Var.f22566e = list;
        s0Var.f22568g = list;
        s0Var.f22570i = list;
        s0Var.f22572k = list;
        s0Var.f22574m = list;
        s0Var.f22576o = list;
        s0Var.f22580s = list;
        s0Var.f22582u = f8.f22138e;
        s0Var.t();
        return s0Var;
    }

    public static b1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (b1) f21915p.parseFrom(bArr);
    }

    public static b1 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (b1) f21915p.parseFrom(bArr, m5Var);
    }

    public static b1 parseFrom(InputStream inputStream) throws IOException {
        return (b1) k7.parseWithIOException(f21915p, inputStream);
    }

    public static b1 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (b1) k7.parseWithIOException(f21915p, inputStream, m5Var);
    }

    public static b1 parseFrom(y yVar) throws IOException {
        return (b1) k7.parseWithIOException(f21915p, yVar);
    }

    public static b1 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (b1) k7.parseWithIOException(f21915p, yVar, m5Var);
    }
}
