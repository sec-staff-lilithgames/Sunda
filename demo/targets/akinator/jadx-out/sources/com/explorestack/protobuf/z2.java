package com.explorestack.protobuf;

import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z2 extends k7 implements a3 {

    /* renamed from: j, reason: collision with root package name */
    public static final z2 f22939j = new z2();

    /* renamed from: k, reason: collision with root package name */
    public static final x2 f22940k = new x2();

    /* renamed from: b, reason: collision with root package name */
    public int f22941b;

    /* renamed from: g, reason: collision with root package name */
    public int f22945g;

    /* renamed from: h, reason: collision with root package name */
    public int f22946h;

    /* renamed from: e, reason: collision with root package name */
    public int f22943e = -1;

    /* renamed from: i, reason: collision with root package name */
    public byte f22947i = -1;

    /* renamed from: c, reason: collision with root package name */
    public s7 f22942c = k7.emptyIntList();

    /* renamed from: f, reason: collision with root package name */
    public volatile Serializable f22944f = LJjmO.guCUswShaS;

    public static z2 getDefaultInstance() {
        return f22939j;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.Y;
    }

    public static y2 newBuilder() {
        return f22939j.toBuilder();
    }

    public static z2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (z2) k7.parseDelimitedWithIOException(f22940k, inputStream);
    }

    public static z2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (z2) f22940k.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22940k;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return super.equals(obj);
        }
        z2 z2Var = (z2) obj;
        if (!getPathList().equals(z2Var.getPathList()) || hasSourceFile() != z2Var.hasSourceFile()) {
            return false;
        }
        if ((hasSourceFile() && !getSourceFile().equals(z2Var.getSourceFile())) || hasBegin() != z2Var.hasBegin()) {
            return false;
        }
        if ((!hasBegin() || getBegin() == z2Var.getBegin()) && hasEnd() == z2Var.hasEnd()) {
            return (!hasEnd() || getEnd() == z2Var.getEnd()) && this.unknownFields.equals(z2Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.a3
    public int getBegin() {
        return this.f22945g;
    }

    @Override // com.explorestack.protobuf.a3
    public int getEnd() {
        return this.f22946h;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22940k;
    }

    @Override // com.explorestack.protobuf.a3
    public int getPath(int i10) {
        return ((l7) this.f22942c).getInt(i10);
    }

    @Override // com.explorestack.protobuf.a3
    public int getPathCount() {
        return this.f22942c.size();
    }

    @Override // com.explorestack.protobuf.a3
    public List<Integer> getPathList() {
        return this.f22942c;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < this.f22942c.size(); i11++) {
            iComputeInt32SizeNoTag += h0.computeInt32SizeNoTag(((l7) this.f22942c).getInt(i11));
        }
        int iComputeInt32SizeNoTag2 = getPathList().isEmpty() ? iComputeInt32SizeNoTag : h0.computeInt32SizeNoTag(iComputeInt32SizeNoTag) + iComputeInt32SizeNoTag + 1;
        this.f22943e = iComputeInt32SizeNoTag;
        if ((this.f22941b & 1) != 0) {
            iComputeInt32SizeNoTag2 += k7.computeStringSize(2, this.f22944f);
        }
        if ((this.f22941b & 2) != 0) {
            iComputeInt32SizeNoTag2 += h0.computeInt32Size(3, this.f22945g);
        }
        if ((this.f22941b & 4) != 0) {
            iComputeInt32SizeNoTag2 += h0.computeInt32Size(4, this.f22946h);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32SizeNoTag2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.a3
    public String getSourceFile() {
        Serializable serializable = this.f22944f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22944f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.a3
    public ByteString getSourceFileBytes() {
        Serializable serializable = this.f22944f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22944f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.a3
    public boolean hasBegin() {
        return (this.f22941b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.a3
    public boolean hasEnd() {
        return (this.f22941b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.a3
    public boolean hasSourceFile() {
        return (this.f22941b & 1) != 0;
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
        if (hasSourceFile()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getSourceFile().hashCode();
        }
        if (hasBegin()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getBegin();
        }
        if (hasEnd()) {
            iHashCode = p0.o2.B(iHashCode, 37, 4, 53) + getEnd();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.Z.ensureFieldAccessorsInitialized(z2.class, y2.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22947i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22947i = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new z2();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        getSerializedSize();
        if (getPathList().size() > 0) {
            h0Var.writeUInt32NoTag(10);
            h0Var.writeUInt32NoTag(this.f22943e);
        }
        for (int i10 = 0; i10 < this.f22942c.size(); i10++) {
            h0Var.writeInt32NoTag(((l7) this.f22942c).getInt(i10));
        }
        if ((this.f22941b & 1) != 0) {
            k7.writeString(h0Var, 2, this.f22944f);
        }
        if ((this.f22941b & 2) != 0) {
            h0Var.writeInt32(3, this.f22945g);
        }
        if ((this.f22941b & 4) != 0) {
            h0Var.writeInt32(4, this.f22946h);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static y2 newBuilder(z2 z2Var) {
        return f22939j.toBuilder().mergeFrom(z2Var);
    }

    public static z2 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (z2) f22940k.parseFrom(byteBuffer, m5Var);
    }

    public static z2 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (z2) k7.parseDelimitedWithIOException(f22940k, inputStream, m5Var);
    }

    public static z2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (z2) f22940k.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public z2 getDefaultInstanceForType() {
        return f22939j;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public y2 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public y2 toBuilder() {
        if (this == f22939j) {
            return new y2();
        }
        return new y2().mergeFrom(this);
    }

    public static z2 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (z2) f22940k.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        y2 y2Var = new y2(p6Var);
        y2Var.f22906c = k7.emptyIntList();
        y2Var.f22907e = "";
        return y2Var;
    }

    public static z2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (z2) f22940k.parseFrom(bArr);
    }

    public static z2 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (z2) f22940k.parseFrom(bArr, m5Var);
    }

    public static z2 parseFrom(InputStream inputStream) throws IOException {
        return (z2) k7.parseWithIOException(f22940k, inputStream);
    }

    public static z2 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (z2) k7.parseWithIOException(f22940k, inputStream, m5Var);
    }

    public static z2 parseFrom(y yVar) throws IOException {
        return (z2) k7.parseWithIOException(f22940k, yVar);
    }

    public static z2 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (z2) k7.parseWithIOException(f22940k, yVar, m5Var);
    }
}
