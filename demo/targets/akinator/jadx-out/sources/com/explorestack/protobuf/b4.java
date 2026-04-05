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
public final class b4 extends k7 implements c4 {

    /* renamed from: h, reason: collision with root package name */
    public static final b4 f21931h = new b4();

    /* renamed from: i, reason: collision with root package name */
    public static final z3 f21932i = new z3();

    /* renamed from: b, reason: collision with root package name */
    public int f21933b;

    /* renamed from: f, reason: collision with root package name */
    public f4 f21936f;

    /* renamed from: g, reason: collision with root package name */
    public byte f21937g = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f21934c = "";

    /* renamed from: e, reason: collision with root package name */
    public List f21935e = Collections.EMPTY_LIST;

    public static b4 getDefaultInstance() {
        return f21931h;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22854u;
    }

    public static a4 newBuilder() {
        return f21931h.toBuilder();
    }

    public static b4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (b4) k7.parseDelimitedWithIOException(f21932i, inputStream);
    }

    public static b4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (b4) f21932i.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f21932i;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return super.equals(obj);
        }
        b4 b4Var = (b4) obj;
        if (hasName() != b4Var.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(b4Var.getName())) && getMethodList().equals(b4Var.getMethodList()) && hasOptions() == b4Var.hasOptions()) {
            return (!hasOptions() || getOptions().equals(b4Var.getOptions())) && this.unknownFields.equals(b4Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.c4
    public k3 getMethod(int i10) {
        return (k3) this.f21935e.get(i10);
    }

    @Override // com.explorestack.protobuf.c4
    public int getMethodCount() {
        return this.f21935e.size();
    }

    @Override // com.explorestack.protobuf.c4
    public List<k3> getMethodList() {
        return this.f21935e;
    }

    @Override // com.explorestack.protobuf.c4
    public l3 getMethodOrBuilder(int i10) {
        return (l3) this.f21935e.get(i10);
    }

    @Override // com.explorestack.protobuf.c4
    public List<? extends l3> getMethodOrBuilderList() {
        return this.f21935e;
    }

    @Override // com.explorestack.protobuf.c4
    public String getName() {
        Serializable serializable = this.f21934c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f21934c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.c4
    public ByteString getNameBytes() {
        Serializable serializable = this.f21934c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f21934c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.c4
    public f4 getOptions() {
        f4 f4Var = this.f21936f;
        return f4Var == null ? f4.getDefaultInstance() : f4Var;
    }

    @Override // com.explorestack.protobuf.c4
    public g4 getOptionsOrBuilder() {
        f4 f4Var = this.f21936f;
        return f4Var == null ? f4.getDefaultInstance() : f4Var;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f21932i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f21933b & 1) != 0 ? k7.computeStringSize(1, this.f21934c) : 0;
        for (int i11 = 0; i11 < this.f21935e.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(2, (MessageLite) this.f21935e.get(i11));
        }
        if ((this.f21933b & 2) != 0) {
            iComputeStringSize += h0.computeMessageSize(3, getOptions());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.c4
    public boolean hasName() {
        return (this.f21933b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.c4
    public boolean hasOptions() {
        return (this.f21933b & 2) != 0;
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
        if (getMethodCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getMethodList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22855v.ensureFieldAccessorsInitialized(b4.class, a4.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f21937g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getMethodCount(); i10++) {
            if (!getMethod(i10).isInitialized()) {
                this.f21937g = (byte) 0;
                return false;
            }
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f21937g = (byte) 1;
            return true;
        }
        this.f21937g = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new b4();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f21933b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f21934c);
        }
        for (int i10 = 0; i10 < this.f21935e.size(); i10++) {
            h0Var.writeMessage(2, (MessageLite) this.f21935e.get(i10));
        }
        if ((this.f21933b & 2) != 0) {
            h0Var.writeMessage(3, getOptions());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static a4 newBuilder(b4 b4Var) {
        return f21931h.toBuilder().mergeFrom(b4Var);
    }

    public static b4 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (b4) f21932i.parseFrom(byteBuffer, m5Var);
    }

    public static b4 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (b4) k7.parseDelimitedWithIOException(f21932i, inputStream, m5Var);
    }

    public static b4 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (b4) f21932i.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public b4 getDefaultInstanceForType() {
        return f21931h;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public a4 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public a4 toBuilder() {
        if (this == f21931h) {
            return new a4();
        }
        return new a4().mergeFrom(this);
    }

    public static b4 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (b4) f21932i.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        a4 a4Var = new a4(p6Var);
        a4Var.f21842c = "";
        a4Var.f21843e = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            a4Var.c();
            if (a4Var.f21846h == null) {
                a4Var.f21846h = new xa(a4Var.getOptions(), a4Var.getParentForChildren(), a4Var.isClean());
                a4Var.f21845g = null;
            }
        }
        return a4Var;
    }

    public static b4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (b4) f21932i.parseFrom(bArr);
    }

    public static b4 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (b4) f21932i.parseFrom(bArr, m5Var);
    }

    public static b4 parseFrom(InputStream inputStream) throws IOException {
        return (b4) k7.parseWithIOException(f21932i, inputStream);
    }

    public static b4 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (b4) k7.parseWithIOException(f21932i, inputStream, m5Var);
    }

    public static b4 parseFrom(y yVar) throws IOException {
        return (b4) k7.parseWithIOException(f21932i, yVar);
    }

    public static b4 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (b4) k7.parseWithIOException(f21932i, yVar, m5Var);
    }
}
