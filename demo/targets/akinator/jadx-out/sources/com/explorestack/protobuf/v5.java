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
public final class v5 extends k7 implements y5 {

    /* renamed from: n, reason: collision with root package name */
    public static final v5 f22767n = new v5();

    /* renamed from: o, reason: collision with root package name */
    public static final r5 f22768o = new r5();

    /* renamed from: e, reason: collision with root package name */
    public int f22771e;

    /* renamed from: h, reason: collision with root package name */
    public int f22774h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22775i;

    /* renamed from: m, reason: collision with root package name */
    public byte f22779m = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f22769b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f22770c = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile Serializable f22772f = "";

    /* renamed from: g, reason: collision with root package name */
    public volatile Serializable f22773g = "";

    /* renamed from: j, reason: collision with root package name */
    public List f22776j = Collections.EMPTY_LIST;

    /* renamed from: k, reason: collision with root package name */
    public volatile Serializable f22777k = "";

    /* renamed from: l, reason: collision with root package name */
    public volatile Serializable f22778l = "";

    public static v5 getDefaultInstance() {
        return f22767n;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ub.f22723a;
    }

    public static s5 newBuilder() {
        return f22767n.toBuilder();
    }

    public static v5 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (v5) k7.parseDelimitedWithIOException(f22768o, inputStream);
    }

    public static v5 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (v5) f22768o.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22768o;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return super.equals(obj);
        }
        v5 v5Var = (v5) obj;
        return this.f22769b == v5Var.f22769b && this.f22770c == v5Var.f22770c && getNumber() == v5Var.getNumber() && getName().equals(v5Var.getName()) && getTypeUrl().equals(v5Var.getTypeUrl()) && getOneofIndex() == v5Var.getOneofIndex() && getPacked() == v5Var.getPacked() && getOptionsList().equals(v5Var.getOptionsList()) && getJsonName().equals(v5Var.getJsonName()) && getDefaultValue().equals(v5Var.getDefaultValue()) && this.unknownFields.equals(v5Var.unknownFields);
    }

    @Override // com.explorestack.protobuf.y5
    public Field$Cardinality getCardinality() {
        Field$Cardinality field$CardinalityValueOf = Field$Cardinality.valueOf(this.f22770c);
        return field$CardinalityValueOf == null ? Field$Cardinality.UNRECOGNIZED : field$CardinalityValueOf;
    }

    @Override // com.explorestack.protobuf.y5
    public int getCardinalityValue() {
        return this.f22770c;
    }

    @Override // com.explorestack.protobuf.y5
    public String getDefaultValue() {
        Serializable serializable = this.f22778l;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22778l = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public ByteString getDefaultValueBytes() {
        Serializable serializable = this.f22778l;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22778l = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public String getJsonName() {
        Serializable serializable = this.f22777k;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22777k = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public ByteString getJsonNameBytes() {
        Serializable serializable = this.f22777k;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22777k = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public Field$Kind getKind() {
        Field$Kind field$KindValueOf = Field$Kind.valueOf(this.f22769b);
        return field$KindValueOf == null ? Field$Kind.UNRECOGNIZED : field$KindValueOf;
    }

    @Override // com.explorestack.protobuf.y5
    public int getKindValue() {
        return this.f22769b;
    }

    @Override // com.explorestack.protobuf.y5
    public String getName() {
        Serializable serializable = this.f22772f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22772f = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public ByteString getNameBytes() {
        Serializable serializable = this.f22772f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22772f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public int getNumber() {
        return this.f22771e;
    }

    @Override // com.explorestack.protobuf.y5
    public int getOneofIndex() {
        return this.f22774h;
    }

    @Override // com.explorestack.protobuf.y5
    public da getOptions(int i10) {
        return (da) this.f22776j.get(i10);
    }

    @Override // com.explorestack.protobuf.y5
    public int getOptionsCount() {
        return this.f22776j.size();
    }

    @Override // com.explorestack.protobuf.y5
    public List<da> getOptionsList() {
        return this.f22776j;
    }

    @Override // com.explorestack.protobuf.y5
    public ea getOptionsOrBuilder(int i10) {
        return (ea) this.f22776j.get(i10);
    }

    @Override // com.explorestack.protobuf.y5
    public List<? extends ea> getOptionsOrBuilderList() {
        return this.f22776j;
    }

    @Override // com.explorestack.protobuf.y5
    public boolean getPacked() {
        return this.f22775i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22768o;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeEnumSize = this.f22769b != Field$Kind.TYPE_UNKNOWN.getNumber() ? h0.computeEnumSize(1, this.f22769b) : 0;
        if (this.f22770c != Field$Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            iComputeEnumSize += h0.computeEnumSize(2, this.f22770c);
        }
        int i11 = this.f22771e;
        if (i11 != 0) {
            iComputeEnumSize += h0.computeInt32Size(3, i11);
        }
        if (!getNameBytes().isEmpty()) {
            iComputeEnumSize += k7.computeStringSize(4, this.f22772f);
        }
        if (!getTypeUrlBytes().isEmpty()) {
            iComputeEnumSize += k7.computeStringSize(6, this.f22773g);
        }
        int i12 = this.f22774h;
        if (i12 != 0) {
            iComputeEnumSize += h0.computeInt32Size(7, i12);
        }
        boolean z10 = this.f22775i;
        if (z10) {
            iComputeEnumSize += h0.computeBoolSize(8, z10);
        }
        for (int i13 = 0; i13 < this.f22776j.size(); i13++) {
            iComputeEnumSize += h0.computeMessageSize(9, (MessageLite) this.f22776j.get(i13));
        }
        if (!getJsonNameBytes().isEmpty()) {
            iComputeEnumSize += k7.computeStringSize(10, this.f22777k);
        }
        if (!getDefaultValueBytes().isEmpty()) {
            iComputeEnumSize += k7.computeStringSize(11, this.f22778l);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.y5
    public String getTypeUrl() {
        Serializable serializable = this.f22773g;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22773g = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.y5
    public ByteString getTypeUrlBytes() {
        Serializable serializable = this.f22773g;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22773g = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int iHashBoolean = x7.hashBoolean(getPacked()) + ((((getOneofIndex() + ((((getTypeUrl().hashCode() + ((((getName().hashCode() + ((((getNumber() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.f22769b, 37, 2, 53), this.f22770c, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53);
        if (getOptionsCount() > 0) {
            iHashBoolean = getOptionsList().hashCode() + p0.o2.B(iHashBoolean, 37, 9, 53);
        }
        int iHashCode = this.unknownFields.hashCode() + ((getDefaultValue().hashCode() + ((((getJsonName().hashCode() + p0.o2.B(iHashBoolean, 37, 10, 53)) * 37) + 11) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return ub.f22724b.ensureFieldAccessorsInitialized(v5.class, s5.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22779m;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22779m = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new v5();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.f22769b != Field$Kind.TYPE_UNKNOWN.getNumber()) {
            h0Var.writeEnum(1, this.f22769b);
        }
        if (this.f22770c != Field$Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            h0Var.writeEnum(2, this.f22770c);
        }
        int i10 = this.f22771e;
        if (i10 != 0) {
            h0Var.writeInt32(3, i10);
        }
        if (!getNameBytes().isEmpty()) {
            k7.writeString(h0Var, 4, this.f22772f);
        }
        if (!getTypeUrlBytes().isEmpty()) {
            k7.writeString(h0Var, 6, this.f22773g);
        }
        int i11 = this.f22774h;
        if (i11 != 0) {
            h0Var.writeInt32(7, i11);
        }
        boolean z10 = this.f22775i;
        if (z10) {
            h0Var.writeBool(8, z10);
        }
        for (int i12 = 0; i12 < this.f22776j.size(); i12++) {
            h0Var.writeMessage(9, (MessageLite) this.f22776j.get(i12));
        }
        if (!getJsonNameBytes().isEmpty()) {
            k7.writeString(h0Var, 10, this.f22777k);
        }
        if (!getDefaultValueBytes().isEmpty()) {
            k7.writeString(h0Var, 11, this.f22778l);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static s5 newBuilder(v5 v5Var) {
        return f22767n.toBuilder().mergeFrom(v5Var);
    }

    public static v5 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (v5) f22768o.parseFrom(byteBuffer, m5Var);
    }

    public static v5 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (v5) k7.parseDelimitedWithIOException(f22768o, inputStream, m5Var);
    }

    public static v5 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (v5) f22768o.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public v5 getDefaultInstanceForType() {
        return f22767n;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s5 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s5 toBuilder() {
        if (this == f22767n) {
            return new s5();
        }
        return new s5().mergeFrom(this);
    }

    public static v5 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (v5) f22768o.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        s5 s5Var = new s5(p6Var);
        s5Var.f22614c = 0;
        s5Var.f22615e = 0;
        s5Var.f22617g = "";
        s5Var.f22618h = "";
        s5Var.f22621k = Collections.EMPTY_LIST;
        s5Var.f22623m = "";
        s5Var.f22624n = "";
        if (k7.alwaysUseFieldBuilders) {
            s5Var.e();
        }
        return s5Var;
    }

    public static v5 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (v5) f22768o.parseFrom(bArr);
    }

    public static v5 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (v5) f22768o.parseFrom(bArr, m5Var);
    }

    public static v5 parseFrom(InputStream inputStream) throws IOException {
        return (v5) k7.parseWithIOException(f22768o, inputStream);
    }

    public static v5 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (v5) k7.parseWithIOException(f22768o, inputStream, m5Var);
    }

    public static v5 parseFrom(y yVar) throws IOException {
        return (v5) k7.parseWithIOException(f22768o, yVar);
    }

    public static v5 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (v5) k7.parseWithIOException(f22768o, yVar, m5Var);
    }
}
