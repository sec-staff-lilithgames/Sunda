package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l4 extends k7 implements m4 {

    /* renamed from: l, reason: collision with root package name */
    public static final l4 f22335l = new l4();

    /* renamed from: m, reason: collision with root package name */
    public static final j4 f22336m = new j4();

    /* renamed from: b, reason: collision with root package name */
    public int f22337b;

    /* renamed from: e, reason: collision with root package name */
    public int f22339e = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f22341g = -1;

    /* renamed from: k, reason: collision with root package name */
    public byte f22345k = -1;

    /* renamed from: c, reason: collision with root package name */
    public s7 f22338c = k7.emptyIntList();

    /* renamed from: f, reason: collision with root package name */
    public s7 f22340f = k7.emptyIntList();

    /* renamed from: h, reason: collision with root package name */
    public volatile Serializable f22342h = "";

    /* renamed from: i, reason: collision with root package name */
    public volatile Serializable f22343i = "";

    /* renamed from: j, reason: collision with root package name */
    public g8 f22344j = f8.f22138e;

    public static l4 getDefaultInstance() {
        return f22335l;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.U;
    }

    public static k4 newBuilder() {
        return f22335l.toBuilder();
    }

    public static l4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (l4) k7.parseDelimitedWithIOException(f22336m, inputStream);
    }

    public static l4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (l4) f22336m.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22336m;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return super.equals(obj);
        }
        l4 l4Var = (l4) obj;
        if (!getPathList().equals(l4Var.getPathList()) || !getSpanList().equals(l4Var.getSpanList()) || hasLeadingComments() != l4Var.hasLeadingComments()) {
            return false;
        }
        if ((!hasLeadingComments() || getLeadingComments().equals(l4Var.getLeadingComments())) && hasTrailingComments() == l4Var.hasTrailingComments()) {
            return (!hasTrailingComments() || getTrailingComments().equals(l4Var.getTrailingComments())) && getLeadingDetachedCommentsList().equals(l4Var.getLeadingDetachedCommentsList()) && this.unknownFields.equals(l4Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.m4
    public String getLeadingComments() {
        Serializable serializable = this.f22342h;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22342h = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.m4
    public ByteString getLeadingCommentsBytes() {
        Serializable serializable = this.f22342h;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22342h = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.m4
    public String getLeadingDetachedComments(int i10) {
        return (String) this.f22344j.get(i10);
    }

    @Override // com.explorestack.protobuf.m4
    public ByteString getLeadingDetachedCommentsBytes(int i10) {
        return this.f22344j.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.m4
    public int getLeadingDetachedCommentsCount() {
        return this.f22344j.size();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22336m;
    }

    @Override // com.explorestack.protobuf.m4
    public int getPath(int i10) {
        return ((l7) this.f22338c).getInt(i10);
    }

    @Override // com.explorestack.protobuf.m4
    public int getPathCount() {
        return this.f22338c.size();
    }

    @Override // com.explorestack.protobuf.m4
    public List<Integer> getPathList() {
        return this.f22338c;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < this.f22338c.size(); i11++) {
            iComputeInt32SizeNoTag += h0.computeInt32SizeNoTag(((l7) this.f22338c).getInt(i11));
        }
        int iComputeInt32SizeNoTag2 = getPathList().isEmpty() ? iComputeInt32SizeNoTag : h0.computeInt32SizeNoTag(iComputeInt32SizeNoTag) + iComputeInt32SizeNoTag + 1;
        this.f22339e = iComputeInt32SizeNoTag;
        int iComputeInt32SizeNoTag3 = 0;
        for (int i12 = 0; i12 < this.f22340f.size(); i12++) {
            iComputeInt32SizeNoTag3 += h0.computeInt32SizeNoTag(((l7) this.f22340f).getInt(i12));
        }
        int iComputeStringSize = iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
        if (!getSpanList().isEmpty()) {
            iComputeStringSize = iComputeStringSize + 1 + h0.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
        }
        this.f22341g = iComputeInt32SizeNoTag3;
        if ((this.f22337b & 1) != 0) {
            iComputeStringSize += k7.computeStringSize(3, this.f22342h);
        }
        if ((this.f22337b & 2) != 0) {
            iComputeStringSize += k7.computeStringSize(4, this.f22343i);
        }
        int iE = 0;
        for (int i13 = 0; i13 < this.f22344j.size(); i13++) {
            iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.f22344j, i13, iE);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + getLeadingDetachedCommentsList().size() + iComputeStringSize + iE;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.m4
    public int getSpan(int i10) {
        return ((l7) this.f22340f).getInt(i10);
    }

    @Override // com.explorestack.protobuf.m4
    public int getSpanCount() {
        return this.f22340f.size();
    }

    @Override // com.explorestack.protobuf.m4
    public List<Integer> getSpanList() {
        return this.f22340f;
    }

    @Override // com.explorestack.protobuf.m4
    public String getTrailingComments() {
        Serializable serializable = this.f22343i;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22343i = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.m4
    public ByteString getTrailingCommentsBytes() {
        Serializable serializable = this.f22343i;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22343i = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.m4
    public boolean hasLeadingComments() {
        return (this.f22337b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.m4
    public boolean hasTrailingComments() {
        return (this.f22337b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getPathCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getPathList().hashCode();
        }
        if (getSpanCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getSpanList().hashCode();
        }
        if (hasLeadingComments()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getLeadingComments().hashCode();
        }
        if (hasTrailingComments()) {
            iHashCode = p0.o2.B(iHashCode, 37, 4, 53) + getTrailingComments().hashCode();
        }
        if (getLeadingDetachedCommentsCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 6, 53) + getLeadingDetachedCommentsList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.V.ensureFieldAccessorsInitialized(l4.class, k4.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22345k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22345k = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new l4();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        getSerializedSize();
        if (getPathList().size() > 0) {
            h0Var.writeUInt32NoTag(10);
            h0Var.writeUInt32NoTag(this.f22339e);
        }
        for (int i10 = 0; i10 < this.f22338c.size(); i10++) {
            h0Var.writeInt32NoTag(((l7) this.f22338c).getInt(i10));
        }
        if (getSpanList().size() > 0) {
            h0Var.writeUInt32NoTag(18);
            h0Var.writeUInt32NoTag(this.f22341g);
        }
        for (int i11 = 0; i11 < this.f22340f.size(); i11++) {
            h0Var.writeInt32NoTag(((l7) this.f22340f).getInt(i11));
        }
        if ((this.f22337b & 1) != 0) {
            k7.writeString(h0Var, 3, this.f22342h);
        }
        if ((this.f22337b & 2) != 0) {
            k7.writeString(h0Var, 4, this.f22343i);
        }
        int iF = 0;
        while (iF < this.f22344j.size()) {
            iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.f22344j, iF, h0Var, 6, iF, 1);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static k4 newBuilder(l4 l4Var) {
        return f22335l.toBuilder().mergeFrom(l4Var);
    }

    public static l4 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (l4) f22336m.parseFrom(byteBuffer, m5Var);
    }

    @Override // com.explorestack.protobuf.m4
    public ka getLeadingDetachedCommentsList() {
        return this.f22344j;
    }

    public static l4 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (l4) k7.parseDelimitedWithIOException(f22336m, inputStream, m5Var);
    }

    public static l4 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (l4) f22336m.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public l4 getDefaultInstanceForType() {
        return f22335l;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public k4 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public k4 toBuilder() {
        if (this == f22335l) {
            return new k4();
        }
        return new k4().mergeFrom(this);
    }

    public static l4 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (l4) f22336m.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        k4 k4Var = new k4(p6Var);
        k4Var.f22302c = k7.emptyIntList();
        k4Var.f22303e = k7.emptyIntList();
        k4Var.f22304f = "";
        k4Var.f22305g = "";
        k4Var.f22306h = f8.f22138e;
        return k4Var;
    }

    public static l4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (l4) f22336m.parseFrom(bArr);
    }

    public static l4 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (l4) f22336m.parseFrom(bArr, m5Var);
    }

    public static l4 parseFrom(InputStream inputStream) throws IOException {
        return (l4) k7.parseWithIOException(f22336m, inputStream);
    }

    public static l4 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (l4) k7.parseWithIOException(f22336m, inputStream, m5Var);
    }

    public static l4 parseFrom(y yVar) throws IOException {
        return (l4) k7.parseWithIOException(f22336m, yVar);
    }

    public static l4 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (l4) k7.parseWithIOException(f22336m, yVar, m5Var);
    }
}
