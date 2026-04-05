package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u2 extends s6 implements v2 {
    public static final u2 A = new u2();
    public static final r2 B = new r2();

    /* renamed from: c, reason: collision with root package name */
    public int f22695c;

    /* renamed from: e, reason: collision with root package name */
    public volatile Serializable f22696e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Serializable f22697f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22698g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22699h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22700i;

    /* renamed from: j, reason: collision with root package name */
    public int f22701j;

    /* renamed from: k, reason: collision with root package name */
    public volatile Serializable f22702k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22703l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22704m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22705n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22706o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22707p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22708q;

    /* renamed from: r, reason: collision with root package name */
    public volatile Serializable f22709r;

    /* renamed from: s, reason: collision with root package name */
    public volatile Serializable f22710s;

    /* renamed from: t, reason: collision with root package name */
    public volatile Serializable f22711t;

    /* renamed from: u, reason: collision with root package name */
    public volatile Serializable f22712u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Serializable f22713v;

    /* renamed from: w, reason: collision with root package name */
    public volatile Serializable f22714w;

    /* renamed from: x, reason: collision with root package name */
    public volatile Serializable f22715x;

    /* renamed from: y, reason: collision with root package name */
    public List f22716y;

    /* renamed from: z, reason: collision with root package name */
    public byte f22717z = -1;

    public static u2 getDefaultInstance() {
        return A;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22858y;
    }

    public static s2 newBuilder() {
        return A.toBuilder();
    }

    public static u2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (u2) k7.parseDelimitedWithIOException(B, inputStream);
    }

    public static u2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (u2) B.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return B;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return super.equals(obj);
        }
        u2 u2Var = (u2) obj;
        if (hasJavaPackage() != u2Var.hasJavaPackage()) {
            return false;
        }
        if ((hasJavaPackage() && !getJavaPackage().equals(u2Var.getJavaPackage())) || hasJavaOuterClassname() != u2Var.hasJavaOuterClassname()) {
            return false;
        }
        if ((hasJavaOuterClassname() && !getJavaOuterClassname().equals(u2Var.getJavaOuterClassname())) || hasJavaMultipleFiles() != u2Var.hasJavaMultipleFiles()) {
            return false;
        }
        if ((hasJavaMultipleFiles() && getJavaMultipleFiles() != u2Var.getJavaMultipleFiles()) || hasJavaGenerateEqualsAndHash() != u2Var.hasJavaGenerateEqualsAndHash()) {
            return false;
        }
        if ((hasJavaGenerateEqualsAndHash() && getJavaGenerateEqualsAndHash() != u2Var.getJavaGenerateEqualsAndHash()) || hasJavaStringCheckUtf8() != u2Var.hasJavaStringCheckUtf8()) {
            return false;
        }
        if ((hasJavaStringCheckUtf8() && getJavaStringCheckUtf8() != u2Var.getJavaStringCheckUtf8()) || hasOptimizeFor() != u2Var.hasOptimizeFor()) {
            return false;
        }
        if ((hasOptimizeFor() && this.f22701j != u2Var.f22701j) || hasGoPackage() != u2Var.hasGoPackage()) {
            return false;
        }
        if ((hasGoPackage() && !getGoPackage().equals(u2Var.getGoPackage())) || hasCcGenericServices() != u2Var.hasCcGenericServices()) {
            return false;
        }
        if ((hasCcGenericServices() && getCcGenericServices() != u2Var.getCcGenericServices()) || hasJavaGenericServices() != u2Var.hasJavaGenericServices()) {
            return false;
        }
        if ((hasJavaGenericServices() && getJavaGenericServices() != u2Var.getJavaGenericServices()) || hasPyGenericServices() != u2Var.hasPyGenericServices()) {
            return false;
        }
        if ((hasPyGenericServices() && getPyGenericServices() != u2Var.getPyGenericServices()) || hasPhpGenericServices() != u2Var.hasPhpGenericServices()) {
            return false;
        }
        if ((hasPhpGenericServices() && getPhpGenericServices() != u2Var.getPhpGenericServices()) || hasDeprecated() != u2Var.hasDeprecated()) {
            return false;
        }
        if ((hasDeprecated() && getDeprecated() != u2Var.getDeprecated()) || hasCcEnableArenas() != u2Var.hasCcEnableArenas()) {
            return false;
        }
        if ((hasCcEnableArenas() && getCcEnableArenas() != u2Var.getCcEnableArenas()) || hasObjcClassPrefix() != u2Var.hasObjcClassPrefix()) {
            return false;
        }
        if ((hasObjcClassPrefix() && !getObjcClassPrefix().equals(u2Var.getObjcClassPrefix())) || hasCsharpNamespace() != u2Var.hasCsharpNamespace()) {
            return false;
        }
        if ((hasCsharpNamespace() && !getCsharpNamespace().equals(u2Var.getCsharpNamespace())) || hasSwiftPrefix() != u2Var.hasSwiftPrefix()) {
            return false;
        }
        if ((hasSwiftPrefix() && !getSwiftPrefix().equals(u2Var.getSwiftPrefix())) || hasPhpClassPrefix() != u2Var.hasPhpClassPrefix()) {
            return false;
        }
        if ((hasPhpClassPrefix() && !getPhpClassPrefix().equals(u2Var.getPhpClassPrefix())) || hasPhpNamespace() != u2Var.hasPhpNamespace()) {
            return false;
        }
        if ((hasPhpNamespace() && !getPhpNamespace().equals(u2Var.getPhpNamespace())) || hasPhpMetadataNamespace() != u2Var.hasPhpMetadataNamespace()) {
            return false;
        }
        if ((!hasPhpMetadataNamespace() || getPhpMetadataNamespace().equals(u2Var.getPhpMetadataNamespace())) && hasRubyPackage() == u2Var.hasRubyPackage()) {
            return (!hasRubyPackage() || getRubyPackage().equals(u2Var.getRubyPackage())) && getUninterpretedOptionList().equals(u2Var.getUninterpretedOptionList()) && this.unknownFields.equals(u2Var.unknownFields) && this.f22625b.getAllFields().equals(u2Var.f22625b.getAllFields());
        }
        return false;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getCcEnableArenas() {
        return this.f22708q;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getCcGenericServices() {
        return this.f22703l;
    }

    @Override // com.explorestack.protobuf.v2
    public String getCsharpNamespace() {
        Serializable serializable = this.f22710s;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22710s = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getCsharpNamespaceBytes() {
        Serializable serializable = this.f22710s;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22710s = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getDeprecated() {
        return this.f22707p;
    }

    @Override // com.explorestack.protobuf.v2
    public String getGoPackage() {
        Serializable serializable = this.f22702k;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22702k = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getGoPackageBytes() {
        Serializable serializable = this.f22702k;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22702k = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return this.f22699h;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getJavaGenericServices() {
        return this.f22704m;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getJavaMultipleFiles() {
        return this.f22698g;
    }

    @Override // com.explorestack.protobuf.v2
    public String getJavaOuterClassname() {
        Serializable serializable = this.f22697f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22697f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getJavaOuterClassnameBytes() {
        Serializable serializable = this.f22697f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22697f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public String getJavaPackage() {
        Serializable serializable = this.f22696e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22696e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getJavaPackageBytes() {
        Serializable serializable = this.f22696e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22696e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getJavaStringCheckUtf8() {
        return this.f22700i;
    }

    @Override // com.explorestack.protobuf.v2
    public String getObjcClassPrefix() {
        Serializable serializable = this.f22709r;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22709r = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getObjcClassPrefixBytes() {
        Serializable serializable = this.f22709r;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22709r = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public DescriptorProtos$FileOptions$OptimizeMode getOptimizeFor() {
        DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeModeValueOf = DescriptorProtos$FileOptions$OptimizeMode.valueOf(this.f22701j);
        return descriptorProtos$FileOptions$OptimizeModeValueOf == null ? DescriptorProtos$FileOptions$OptimizeMode.SPEED : descriptorProtos$FileOptions$OptimizeModeValueOf;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return B;
    }

    @Override // com.explorestack.protobuf.v2
    public String getPhpClassPrefix() {
        Serializable serializable = this.f22712u;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22712u = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getPhpClassPrefixBytes() {
        Serializable serializable = this.f22712u;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22712u = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getPhpGenericServices() {
        return this.f22706o;
    }

    @Override // com.explorestack.protobuf.v2
    public String getPhpMetadataNamespace() {
        Serializable serializable = this.f22714w;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22714w = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getPhpMetadataNamespaceBytes() {
        Serializable serializable = this.f22714w;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22714w = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public String getPhpNamespace() {
        Serializable serializable = this.f22713v;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22713v = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getPhpNamespaceBytes() {
        Serializable serializable = this.f22713v;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22713v = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getPyGenericServices() {
        return this.f22705n;
    }

    @Override // com.explorestack.protobuf.v2
    public String getRubyPackage() {
        Serializable serializable = this.f22715x;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22715x = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getRubyPackageBytes() {
        Serializable serializable = this.f22715x;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22715x = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f22695c & 1) != 0 ? k7.computeStringSize(1, this.f22696e) : 0;
        if ((this.f22695c & 2) != 0) {
            iComputeStringSize += k7.computeStringSize(8, this.f22697f);
        }
        if ((this.f22695c & 32) != 0) {
            iComputeStringSize += h0.computeEnumSize(9, this.f22701j);
        }
        if ((this.f22695c & 4) != 0) {
            iComputeStringSize += h0.computeBoolSize(10, this.f22698g);
        }
        if ((this.f22695c & 64) != 0) {
            iComputeStringSize += k7.computeStringSize(11, this.f22702k);
        }
        if ((this.f22695c & 128) != 0) {
            iComputeStringSize += h0.computeBoolSize(16, this.f22703l);
        }
        if ((this.f22695c & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            iComputeStringSize += h0.computeBoolSize(17, this.f22704m);
        }
        if ((this.f22695c & 512) != 0) {
            iComputeStringSize += h0.computeBoolSize(18, this.f22705n);
        }
        if ((this.f22695c & 8) != 0) {
            iComputeStringSize += h0.computeBoolSize(20, this.f22699h);
        }
        if ((this.f22695c & 2048) != 0) {
            iComputeStringSize += h0.computeBoolSize(23, this.f22707p);
        }
        if ((this.f22695c & 16) != 0) {
            iComputeStringSize += h0.computeBoolSize(27, this.f22700i);
        }
        if ((this.f22695c & 4096) != 0) {
            iComputeStringSize += h0.computeBoolSize(31, this.f22708q);
        }
        if ((this.f22695c & Segment.SIZE) != 0) {
            iComputeStringSize += k7.computeStringSize(36, this.f22709r);
        }
        if ((this.f22695c & 16384) != 0) {
            iComputeStringSize += k7.computeStringSize(37, this.f22710s);
        }
        if ((this.f22695c & 32768) != 0) {
            iComputeStringSize += k7.computeStringSize(39, this.f22711t);
        }
        if ((this.f22695c & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            iComputeStringSize += k7.computeStringSize(40, this.f22712u);
        }
        if ((this.f22695c & 131072) != 0) {
            iComputeStringSize += k7.computeStringSize(41, this.f22713v);
        }
        if ((this.f22695c & 1024) != 0) {
            iComputeStringSize += h0.computeBoolSize(42, this.f22706o);
        }
        if ((this.f22695c & 262144) != 0) {
            iComputeStringSize += k7.computeStringSize(44, this.f22714w);
        }
        if ((this.f22695c & 524288) != 0) {
            iComputeStringSize += k7.computeStringSize(45, this.f22715x);
        }
        for (int i11 = 0; i11 < this.f22716y.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(999, (MessageLite) this.f22716y.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + this.f22625b.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.v2
    public String getSwiftPrefix() {
        Serializable serializable = this.f22711t;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22711t = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getSwiftPrefixBytes() {
        Serializable serializable = this.f22711t;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22711t = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public v4 getUninterpretedOption(int i10) {
        return (v4) this.f22716y.get(i10);
    }

    @Override // com.explorestack.protobuf.v2
    public int getUninterpretedOptionCount() {
        return this.f22716y.size();
    }

    @Override // com.explorestack.protobuf.v2
    public List<v4> getUninterpretedOptionList() {
        return this.f22716y;
    }

    @Override // com.explorestack.protobuf.v2
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        return (w4) this.f22716y.get(i10);
    }

    @Override // com.explorestack.protobuf.v2
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        return this.f22716y;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasCcEnableArenas() {
        return (this.f22695c & 4096) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasCcGenericServices() {
        return (this.f22695c & 128) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasCsharpNamespace() {
        return (this.f22695c & 16384) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasDeprecated() {
        return (this.f22695c & 2048) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasGoPackage() {
        return (this.f22695c & 64) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        return (this.f22695c & 8) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaGenericServices() {
        return (this.f22695c & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaMultipleFiles() {
        return (this.f22695c & 4) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaOuterClassname() {
        return (this.f22695c & 2) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaPackage() {
        return (this.f22695c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaStringCheckUtf8() {
        return (this.f22695c & 16) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasObjcClassPrefix() {
        return (this.f22695c & Segment.SIZE) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasOptimizeFor() {
        return (this.f22695c & 32) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPhpClassPrefix() {
        return (this.f22695c & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPhpGenericServices() {
        return (this.f22695c & 1024) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPhpMetadataNamespace() {
        return (this.f22695c & 262144) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPhpNamespace() {
        return (this.f22695c & 131072) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPyGenericServices() {
        return (this.f22695c & 512) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasRubyPackage() {
        return (this.f22695c & 524288) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasSwiftPrefix() {
        return (this.f22695c & 32768) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasJavaPackage()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getJavaPackage().hashCode();
        }
        if (hasJavaOuterClassname()) {
            iHashCode = p0.o2.B(iHashCode, 37, 8, 53) + getJavaOuterClassname().hashCode();
        }
        if (hasJavaMultipleFiles()) {
            iHashCode = p0.o2.B(iHashCode, 37, 10, 53) + x7.hashBoolean(getJavaMultipleFiles());
        }
        if (hasJavaGenerateEqualsAndHash()) {
            iHashCode = p0.o2.B(iHashCode, 37, 20, 53) + x7.hashBoolean(getJavaGenerateEqualsAndHash());
        }
        if (hasJavaStringCheckUtf8()) {
            iHashCode = p0.o2.B(iHashCode, 37, 27, 53) + x7.hashBoolean(getJavaStringCheckUtf8());
        }
        if (hasOptimizeFor()) {
            iHashCode = p0.o2.B(iHashCode, 37, 9, 53) + this.f22701j;
        }
        if (hasGoPackage()) {
            iHashCode = p0.o2.B(iHashCode, 37, 11, 53) + getGoPackage().hashCode();
        }
        if (hasCcGenericServices()) {
            iHashCode = p0.o2.B(iHashCode, 37, 16, 53) + x7.hashBoolean(getCcGenericServices());
        }
        if (hasJavaGenericServices()) {
            iHashCode = p0.o2.B(iHashCode, 37, 17, 53) + x7.hashBoolean(getJavaGenericServices());
        }
        if (hasPyGenericServices()) {
            iHashCode = p0.o2.B(iHashCode, 37, 18, 53) + x7.hashBoolean(getPyGenericServices());
        }
        if (hasPhpGenericServices()) {
            iHashCode = p0.o2.B(iHashCode, 37, 42, 53) + x7.hashBoolean(getPhpGenericServices());
        }
        if (hasDeprecated()) {
            iHashCode = p0.o2.B(iHashCode, 37, 23, 53) + x7.hashBoolean(getDeprecated());
        }
        if (hasCcEnableArenas()) {
            iHashCode = p0.o2.B(iHashCode, 37, 31, 53) + x7.hashBoolean(getCcEnableArenas());
        }
        if (hasObjcClassPrefix()) {
            iHashCode = p0.o2.B(iHashCode, 37, 36, 53) + getObjcClassPrefix().hashCode();
        }
        if (hasCsharpNamespace()) {
            iHashCode = p0.o2.B(iHashCode, 37, 37, 53) + getCsharpNamespace().hashCode();
        }
        if (hasSwiftPrefix()) {
            iHashCode = p0.o2.B(iHashCode, 37, 39, 53) + getSwiftPrefix().hashCode();
        }
        if (hasPhpClassPrefix()) {
            iHashCode = p0.o2.B(iHashCode, 37, 40, 53) + getPhpClassPrefix().hashCode();
        }
        if (hasPhpNamespace()) {
            iHashCode = p0.o2.B(iHashCode, 37, 41, 53) + getPhpNamespace().hashCode();
        }
        if (hasPhpMetadataNamespace()) {
            iHashCode = p0.o2.B(iHashCode, 37, 44, 53) + getPhpMetadataNamespace().hashCode();
        }
        if (hasRubyPackage()) {
            iHashCode = p0.o2.B(iHashCode, 37, 45, 53) + getRubyPackage().hashCode();
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
        return x4.f22859z.ensureFieldAccessorsInitialized(u2.class, s2.class);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22717z;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                this.f22717z = (byte) 0;
                return false;
            }
        }
        if (this.f22625b.isInitialized()) {
            this.f22717z = (byte) 1;
            return true;
        }
        this.f22717z = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new u2();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        r6 r6Var = new r6(this);
        if ((this.f22695c & 1) != 0) {
            k7.writeString(h0Var, 1, this.f22696e);
        }
        if ((this.f22695c & 2) != 0) {
            k7.writeString(h0Var, 8, this.f22697f);
        }
        if ((this.f22695c & 32) != 0) {
            h0Var.writeEnum(9, this.f22701j);
        }
        if ((this.f22695c & 4) != 0) {
            h0Var.writeBool(10, this.f22698g);
        }
        if ((this.f22695c & 64) != 0) {
            k7.writeString(h0Var, 11, this.f22702k);
        }
        if ((this.f22695c & 128) != 0) {
            h0Var.writeBool(16, this.f22703l);
        }
        if ((this.f22695c & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            h0Var.writeBool(17, this.f22704m);
        }
        if ((this.f22695c & 512) != 0) {
            h0Var.writeBool(18, this.f22705n);
        }
        if ((this.f22695c & 8) != 0) {
            h0Var.writeBool(20, this.f22699h);
        }
        if ((this.f22695c & 2048) != 0) {
            h0Var.writeBool(23, this.f22707p);
        }
        if ((this.f22695c & 16) != 0) {
            h0Var.writeBool(27, this.f22700i);
        }
        if ((this.f22695c & 4096) != 0) {
            h0Var.writeBool(31, this.f22708q);
        }
        if ((this.f22695c & Segment.SIZE) != 0) {
            k7.writeString(h0Var, 36, this.f22709r);
        }
        if ((this.f22695c & 16384) != 0) {
            k7.writeString(h0Var, 37, this.f22710s);
        }
        if ((this.f22695c & 32768) != 0) {
            k7.writeString(h0Var, 39, this.f22711t);
        }
        if ((this.f22695c & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            k7.writeString(h0Var, 40, this.f22712u);
        }
        if ((this.f22695c & 131072) != 0) {
            k7.writeString(h0Var, 41, this.f22713v);
        }
        if ((this.f22695c & 1024) != 0) {
            h0Var.writeBool(42, this.f22706o);
        }
        if ((this.f22695c & 262144) != 0) {
            k7.writeString(h0Var, 44, this.f22714w);
        }
        if ((this.f22695c & 524288) != 0) {
            k7.writeString(h0Var, 45, this.f22715x);
        }
        for (int i10 = 0; i10 < this.f22716y.size(); i10++) {
            h0Var.writeMessage(999, (MessageLite) this.f22716y.get(i10));
        }
        r6Var.writeUntil(536870912, h0Var);
        this.unknownFields.writeTo(h0Var);
    }

    public static s2 newBuilder(u2 u2Var) {
        return A.toBuilder().mergeFrom(u2Var);
    }

    public static u2 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (u2) B.parseFrom(byteBuffer, m5Var);
    }

    public u2() {
        String str = VPCjETNfjxu.shijltUGaMeP;
        this.f22696e = str;
        this.f22697f = str;
        this.f22701j = 1;
        this.f22702k = str;
        this.f22708q = true;
        this.f22709r = str;
        this.f22710s = str;
        this.f22711t = str;
        this.f22712u = str;
        this.f22713v = str;
        this.f22714w = str;
        this.f22715x = str;
        this.f22716y = Collections.EMPTY_LIST;
    }

    public static u2 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (u2) k7.parseDelimitedWithIOException(B, inputStream, m5Var);
    }

    public static u2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (u2) B.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public u2 getDefaultInstanceForType() {
        return A;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s2 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s2 toBuilder() {
        if (this == A) {
            return new s2();
        }
        return new s2().mergeFrom(this);
    }

    public static u2 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (u2) B.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        s2 s2Var = new s2(p6Var);
        s2Var.f22584e = "";
        s2Var.f22585f = "";
        s2Var.f22589j = 1;
        s2Var.f22590k = "";
        s2Var.f22596q = true;
        s2Var.f22597r = "";
        s2Var.f22598s = "";
        s2Var.f22599t = "";
        s2Var.f22600u = "";
        s2Var.f22601v = "";
        s2Var.f22602w = "";
        s2Var.f22603x = "";
        s2Var.f22604y = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            s2Var.j();
        }
        return s2Var;
    }

    public static u2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (u2) B.parseFrom(bArr);
    }

    public static u2 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (u2) B.parseFrom(bArr, m5Var);
    }

    public static u2 parseFrom(InputStream inputStream) throws IOException {
        return (u2) k7.parseWithIOException(B, inputStream);
    }

    public static u2 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (u2) k7.parseWithIOException(B, inputStream, m5Var);
    }

    public static u2 parseFrom(y yVar) throws IOException {
        return (u2) k7.parseWithIOException(B, yVar);
    }

    public static u2 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (u2) k7.parseWithIOException(B, yVar, m5Var);
    }
}
