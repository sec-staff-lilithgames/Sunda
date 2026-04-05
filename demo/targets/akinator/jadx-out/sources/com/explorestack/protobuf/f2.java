package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f2 extends k7 implements g2 {

    /* renamed from: p, reason: collision with root package name */
    public static final f2 f22104p = new f2();

    /* renamed from: q, reason: collision with root package name */
    public static final b2 f22105q = new b2();

    /* renamed from: b, reason: collision with root package name */
    public int f22106b;

    /* renamed from: e, reason: collision with root package name */
    public int f22108e;

    /* renamed from: k, reason: collision with root package name */
    public int f22114k;

    /* renamed from: m, reason: collision with root package name */
    public l2 f22116m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22117n;

    /* renamed from: o, reason: collision with root package name */
    public byte f22118o = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f22107c = "";

    /* renamed from: f, reason: collision with root package name */
    public int f22109f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f22110g = 1;

    /* renamed from: h, reason: collision with root package name */
    public volatile Serializable f22111h = "";

    /* renamed from: i, reason: collision with root package name */
    public volatile Serializable f22112i = "";

    /* renamed from: j, reason: collision with root package name */
    public volatile Serializable f22113j = "";

    /* renamed from: l, reason: collision with root package name */
    public volatile Serializable f22115l = "";

    public static f2 getDefaultInstance() {
        return f22104p;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22844k;
    }

    public static c2 newBuilder() {
        return f22104p.toBuilder();
    }

    public static f2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (f2) k7.parseDelimitedWithIOException(f22105q, inputStream);
    }

    public static f2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f2) f22105q.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22105q;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return super.equals(obj);
        }
        f2 f2Var = (f2) obj;
        if (hasName() != f2Var.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(f2Var.getName())) || hasNumber() != f2Var.hasNumber()) {
            return false;
        }
        if ((hasNumber() && getNumber() != f2Var.getNumber()) || hasLabel() != f2Var.hasLabel()) {
            return false;
        }
        if ((hasLabel() && this.f22109f != f2Var.f22109f) || hasType() != f2Var.hasType()) {
            return false;
        }
        if ((hasType() && this.f22110g != f2Var.f22110g) || hasTypeName() != f2Var.hasTypeName()) {
            return false;
        }
        if ((hasTypeName() && !getTypeName().equals(f2Var.getTypeName())) || hasExtendee() != f2Var.hasExtendee()) {
            return false;
        }
        if ((hasExtendee() && !getExtendee().equals(f2Var.getExtendee())) || hasDefaultValue() != f2Var.hasDefaultValue()) {
            return false;
        }
        if ((hasDefaultValue() && !getDefaultValue().equals(f2Var.getDefaultValue())) || hasOneofIndex() != f2Var.hasOneofIndex()) {
            return false;
        }
        if ((hasOneofIndex() && getOneofIndex() != f2Var.getOneofIndex()) || hasJsonName() != f2Var.hasJsonName()) {
            return false;
        }
        if ((hasJsonName() && !getJsonName().equals(f2Var.getJsonName())) || hasOptions() != f2Var.hasOptions()) {
            return false;
        }
        if ((!hasOptions() || getOptions().equals(f2Var.getOptions())) && hasProto3Optional() == f2Var.hasProto3Optional()) {
            return (!hasProto3Optional() || getProto3Optional() == f2Var.getProto3Optional()) && this.unknownFields.equals(f2Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.g2
    public String getDefaultValue() {
        Serializable serializable = this.f22113j;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22113j = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getDefaultValueBytes() {
        Serializable serializable = this.f22113j;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22113j = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public String getExtendee() {
        Serializable serializable = this.f22112i;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22112i = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getExtendeeBytes() {
        Serializable serializable = this.f22112i;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22112i = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public String getJsonName() {
        Serializable serializable = this.f22115l;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22115l = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getJsonNameBytes() {
        Serializable serializable = this.f22115l;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22115l = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public DescriptorProtos$FieldDescriptorProto$Label getLabel() {
        DescriptorProtos$FieldDescriptorProto$Label descriptorProtos$FieldDescriptorProto$LabelValueOf = DescriptorProtos$FieldDescriptorProto$Label.valueOf(this.f22109f);
        return descriptorProtos$FieldDescriptorProto$LabelValueOf == null ? DescriptorProtos$FieldDescriptorProto$Label.LABEL_OPTIONAL : descriptorProtos$FieldDescriptorProto$LabelValueOf;
    }

    @Override // com.explorestack.protobuf.g2
    public String getName() {
        Serializable serializable = this.f22107c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22107c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getNameBytes() {
        Serializable serializable = this.f22107c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22107c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public int getNumber() {
        return this.f22108e;
    }

    @Override // com.explorestack.protobuf.g2
    public int getOneofIndex() {
        return this.f22114k;
    }

    @Override // com.explorestack.protobuf.g2
    public l2 getOptions() {
        l2 l2Var = this.f22116m;
        return l2Var == null ? l2.getDefaultInstance() : l2Var;
    }

    @Override // com.explorestack.protobuf.g2
    public m2 getOptionsOrBuilder() {
        l2 l2Var = this.f22116m;
        return l2Var == null ? l2.getDefaultInstance() : l2Var;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22105q;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean getProto3Optional() {
        return this.f22117n;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f22106b & 1) != 0 ? k7.computeStringSize(1, this.f22107c) : 0;
        if ((this.f22106b & 32) != 0) {
            iComputeStringSize += k7.computeStringSize(2, this.f22112i);
        }
        if ((this.f22106b & 2) != 0) {
            iComputeStringSize += h0.computeInt32Size(3, this.f22108e);
        }
        if ((this.f22106b & 4) != 0) {
            iComputeStringSize += h0.computeEnumSize(4, this.f22109f);
        }
        if ((this.f22106b & 8) != 0) {
            iComputeStringSize += h0.computeEnumSize(5, this.f22110g);
        }
        if ((this.f22106b & 16) != 0) {
            iComputeStringSize += k7.computeStringSize(6, this.f22111h);
        }
        if ((this.f22106b & 64) != 0) {
            iComputeStringSize += k7.computeStringSize(7, this.f22113j);
        }
        if ((this.f22106b & 512) != 0) {
            iComputeStringSize += h0.computeMessageSize(8, getOptions());
        }
        if ((this.f22106b & 128) != 0) {
            iComputeStringSize += h0.computeInt32Size(9, this.f22114k);
        }
        if ((this.f22106b & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            iComputeStringSize += k7.computeStringSize(10, this.f22115l);
        }
        if ((this.f22106b & 1024) != 0) {
            iComputeStringSize += h0.computeBoolSize(17, this.f22117n);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.g2
    public DescriptorProtos$FieldDescriptorProto$Type getType() {
        DescriptorProtos$FieldDescriptorProto$Type descriptorProtos$FieldDescriptorProto$TypeValueOf = DescriptorProtos$FieldDescriptorProto$Type.valueOf(this.f22110g);
        return descriptorProtos$FieldDescriptorProto$TypeValueOf == null ? DescriptorProtos$FieldDescriptorProto$Type.TYPE_DOUBLE : descriptorProtos$FieldDescriptorProto$TypeValueOf;
    }

    @Override // com.explorestack.protobuf.g2
    public String getTypeName() {
        Serializable serializable = this.f22111h;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22111h = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.g2
    public ByteString getTypeNameBytes() {
        Serializable serializable = this.f22111h;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22111h = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasDefaultValue() {
        return (this.f22106b & 64) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasExtendee() {
        return (this.f22106b & 32) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasJsonName() {
        return (this.f22106b & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasLabel() {
        return (this.f22106b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasName() {
        return (this.f22106b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasNumber() {
        return (this.f22106b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasOneofIndex() {
        return (this.f22106b & 128) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasOptions() {
        return (this.f22106b & 512) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasProto3Optional() {
        return (this.f22106b & 1024) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasType() {
        return (this.f22106b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.g2
    public boolean hasTypeName() {
        return (this.f22106b & 16) != 0;
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
        if (hasNumber()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getNumber();
        }
        if (hasLabel()) {
            iHashCode = p0.o2.B(iHashCode, 37, 4, 53) + this.f22109f;
        }
        if (hasType()) {
            iHashCode = p0.o2.B(iHashCode, 37, 5, 53) + this.f22110g;
        }
        if (hasTypeName()) {
            iHashCode = p0.o2.B(iHashCode, 37, 6, 53) + getTypeName().hashCode();
        }
        if (hasExtendee()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getExtendee().hashCode();
        }
        if (hasDefaultValue()) {
            iHashCode = p0.o2.B(iHashCode, 37, 7, 53) + getDefaultValue().hashCode();
        }
        if (hasOneofIndex()) {
            iHashCode = p0.o2.B(iHashCode, 37, 9, 53) + getOneofIndex();
        }
        if (hasJsonName()) {
            iHashCode = p0.o2.B(iHashCode, 37, 10, 53) + getJsonName().hashCode();
        }
        if (hasOptions()) {
            iHashCode = p0.o2.B(iHashCode, 37, 8, 53) + getOptions().hashCode();
        }
        if (hasProto3Optional()) {
            iHashCode = p0.o2.B(iHashCode, 37, 17, 53) + x7.hashBoolean(getProto3Optional());
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22845l.ensureFieldAccessorsInitialized(f2.class, c2.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22118o;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f22118o = (byte) 1;
            return true;
        }
        this.f22118o = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new f2();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22106b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f22107c);
        }
        if ((this.f22106b & 32) != 0) {
            k7.writeString(h0Var, 2, this.f22112i);
        }
        if ((this.f22106b & 2) != 0) {
            h0Var.writeInt32(3, this.f22108e);
        }
        if ((this.f22106b & 4) != 0) {
            h0Var.writeEnum(4, this.f22109f);
        }
        if ((this.f22106b & 8) != 0) {
            h0Var.writeEnum(5, this.f22110g);
        }
        if ((this.f22106b & 16) != 0) {
            k7.writeString(h0Var, 6, this.f22111h);
        }
        if ((this.f22106b & 64) != 0) {
            k7.writeString(h0Var, 7, this.f22113j);
        }
        if ((this.f22106b & 512) != 0) {
            h0Var.writeMessage(8, getOptions());
        }
        if ((this.f22106b & 128) != 0) {
            h0Var.writeInt32(9, this.f22114k);
        }
        if ((this.f22106b & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            k7.writeString(h0Var, 10, this.f22115l);
        }
        if ((this.f22106b & 1024) != 0) {
            h0Var.writeBool(17, this.f22117n);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static c2 newBuilder(f2 f2Var) {
        return f22104p.toBuilder().mergeFrom(f2Var);
    }

    public static f2 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (f2) f22105q.parseFrom(byteBuffer, m5Var);
    }

    public static f2 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (f2) k7.parseDelimitedWithIOException(f22105q, inputStream, m5Var);
    }

    public static f2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (f2) f22105q.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public f2 getDefaultInstanceForType() {
        return f22104p;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public c2 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public c2 toBuilder() {
        if (this == f22104p) {
            return new c2();
        }
        return new c2().mergeFrom(this);
    }

    public static f2 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (f2) f22105q.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        c2 c2Var = new c2(p6Var);
        c2Var.f21966c = "";
        c2Var.f21968f = 1;
        c2Var.f21969g = 1;
        c2Var.f21970h = "";
        c2Var.f21971i = "";
        c2Var.f21972j = "";
        c2Var.f21974l = "";
        if (k7.alwaysUseFieldBuilders && c2Var.f21976n == null) {
            c2Var.f21976n = new xa(c2Var.getOptions(), c2Var.getParentForChildren(), c2Var.isClean());
            c2Var.f21975m = null;
        }
        return c2Var;
    }

    public static f2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (f2) f22105q.parseFrom(bArr);
    }

    public static f2 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (f2) f22105q.parseFrom(bArr, m5Var);
    }

    public static f2 parseFrom(InputStream inputStream) throws IOException {
        return (f2) k7.parseWithIOException(f22105q, inputStream);
    }

    public static f2 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (f2) k7.parseWithIOException(f22105q, inputStream, m5Var);
    }

    public static f2 parseFrom(y yVar) throws IOException {
        return (f2) k7.parseWithIOException(f22105q, yVar);
    }

    public static f2 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (f2) k7.parseWithIOException(f22105q, yVar, m5Var);
    }
}
