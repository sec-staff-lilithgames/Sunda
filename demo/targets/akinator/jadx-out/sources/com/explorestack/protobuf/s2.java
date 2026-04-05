package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s2 extends q6 implements v2 {

    /* renamed from: c, reason: collision with root package name */
    public int f22583c;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f22584e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f22585f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22586g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22587h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22588i;

    /* renamed from: j, reason: collision with root package name */
    public int f22589j;

    /* renamed from: k, reason: collision with root package name */
    public Serializable f22590k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22591l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22592m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22593n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22594o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22595p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22596q;

    /* renamed from: r, reason: collision with root package name */
    public Serializable f22597r;

    /* renamed from: s, reason: collision with root package name */
    public Serializable f22598s;

    /* renamed from: t, reason: collision with root package name */
    public Serializable f22599t;

    /* renamed from: u, reason: collision with root package name */
    public Serializable f22600u;

    /* renamed from: v, reason: collision with root package name */
    public Serializable f22601v;

    /* renamed from: w, reason: collision with root package name */
    public Serializable f22602w;

    /* renamed from: x, reason: collision with root package name */
    public Serializable f22603x;

    /* renamed from: y, reason: collision with root package name */
    public List f22604y;

    /* renamed from: z, reason: collision with root package name */
    public pa f22605z;

    public s2() {
        super(null);
        this.f22584e = "";
        this.f22585f = "";
        this.f22589j = 1;
        this.f22590k = "";
        this.f22596q = true;
        this.f22597r = "";
        this.f22598s = "";
        this.f22599t = "";
        this.f22600u = "";
        this.f22601v = "";
        this.f22602w = "";
        this.f22603x = "";
        this.f22604y = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            j();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22858y;
    }

    public s2 addAllUninterpretedOption(Iterable<? extends v4> iterable) {
        pa paVar = this.f22605z;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22604y);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 addExtension(e6 e6Var, Object obj) {
        return addExtension(e6Var, (e6) obj);
    }

    public s2 addUninterpretedOption(v4 v4Var) {
        pa paVar = this.f22605z;
        if (paVar != null) {
            paVar.addMessage(v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22604y.add(v4Var);
        onChanged();
        return this;
    }

    public q4 addUninterpretedOptionBuilder() {
        return (q4) j().addBuilder(v4.getDefaultInstance());
    }

    public s2 clearCcEnableArenas() {
        this.f22583c &= -4097;
        this.f22596q = true;
        onChanged();
        return this;
    }

    public s2 clearCcGenericServices() {
        this.f22583c &= -129;
        this.f22591l = false;
        onChanged();
        return this;
    }

    public s2 clearCsharpNamespace() {
        this.f22583c &= -16385;
        this.f22598s = u2.getDefaultInstance().getCsharpNamespace();
        onChanged();
        return this;
    }

    public s2 clearDeprecated() {
        this.f22583c &= -2049;
        this.f22595p = false;
        onChanged();
        return this;
    }

    public s2 clearGoPackage() {
        this.f22583c &= -65;
        this.f22590k = u2.getDefaultInstance().getGoPackage();
        onChanged();
        return this;
    }

    @Deprecated
    public s2 clearJavaGenerateEqualsAndHash() {
        this.f22583c &= -9;
        this.f22587h = false;
        onChanged();
        return this;
    }

    public s2 clearJavaGenericServices() {
        this.f22583c &= -257;
        this.f22592m = false;
        onChanged();
        return this;
    }

    public s2 clearJavaMultipleFiles() {
        this.f22583c &= -5;
        this.f22586g = false;
        onChanged();
        return this;
    }

    public s2 clearJavaOuterClassname() {
        this.f22583c &= -3;
        this.f22585f = u2.getDefaultInstance().getJavaOuterClassname();
        onChanged();
        return this;
    }

    public s2 clearJavaPackage() {
        this.f22583c &= -2;
        this.f22584e = u2.getDefaultInstance().getJavaPackage();
        onChanged();
        return this;
    }

    public s2 clearJavaStringCheckUtf8() {
        this.f22583c &= -17;
        this.f22588i = false;
        onChanged();
        return this;
    }

    public s2 clearObjcClassPrefix() {
        this.f22583c &= -8193;
        this.f22597r = u2.getDefaultInstance().getObjcClassPrefix();
        onChanged();
        return this;
    }

    public s2 clearOptimizeFor() {
        this.f22583c &= -33;
        this.f22589j = 1;
        onChanged();
        return this;
    }

    public s2 clearPhpClassPrefix() {
        this.f22583c &= -65537;
        this.f22600u = u2.getDefaultInstance().getPhpClassPrefix();
        onChanged();
        return this;
    }

    public s2 clearPhpGenericServices() {
        this.f22583c &= -1025;
        this.f22594o = false;
        onChanged();
        return this;
    }

    public s2 clearPhpMetadataNamespace() {
        this.f22583c &= -262145;
        this.f22602w = u2.getDefaultInstance().getPhpMetadataNamespace();
        onChanged();
        return this;
    }

    public s2 clearPhpNamespace() {
        this.f22583c &= -131073;
        this.f22601v = u2.getDefaultInstance().getPhpNamespace();
        onChanged();
        return this;
    }

    public s2 clearPyGenericServices() {
        this.f22583c &= -513;
        this.f22593n = false;
        onChanged();
        return this;
    }

    public s2 clearRubyPackage() {
        this.f22583c &= -524289;
        this.f22603x = u2.getDefaultInstance().getRubyPackage();
        onChanged();
        return this;
    }

    public s2 clearSwiftPrefix() {
        this.f22583c &= -32769;
        this.f22599t = u2.getDefaultInstance().getSwiftPrefix();
        onChanged();
        return this;
    }

    public s2 clearUninterpretedOption() {
        pa paVar = this.f22605z;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22604y = Collections.EMPTY_LIST;
        this.f22583c &= -1048577;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getCcEnableArenas() {
        return this.f22596q;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getCcGenericServices() {
        return this.f22591l;
    }

    @Override // com.explorestack.protobuf.v2
    public String getCsharpNamespace() {
        Serializable serializable = this.f22598s;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22598s = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getCsharpNamespaceBytes() {
        Serializable serializable = this.f22598s;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22598s = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getDeprecated() {
        return this.f22595p;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22858y;
    }

    @Override // com.explorestack.protobuf.v2
    public String getGoPackage() {
        Serializable serializable = this.f22590k;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22590k = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getGoPackageBytes() {
        Serializable serializable = this.f22590k;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22590k = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return this.f22587h;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getJavaGenericServices() {
        return this.f22592m;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getJavaMultipleFiles() {
        return this.f22586g;
    }

    @Override // com.explorestack.protobuf.v2
    public String getJavaOuterClassname() {
        Serializable serializable = this.f22585f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22585f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getJavaOuterClassnameBytes() {
        Serializable serializable = this.f22585f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22585f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public String getJavaPackage() {
        Serializable serializable = this.f22584e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22584e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getJavaPackageBytes() {
        Serializable serializable = this.f22584e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22584e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getJavaStringCheckUtf8() {
        return this.f22588i;
    }

    @Override // com.explorestack.protobuf.v2
    public String getObjcClassPrefix() {
        Serializable serializable = this.f22597r;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22597r = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getObjcClassPrefixBytes() {
        Serializable serializable = this.f22597r;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22597r = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public DescriptorProtos$FileOptions$OptimizeMode getOptimizeFor() {
        DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeModeValueOf = DescriptorProtos$FileOptions$OptimizeMode.valueOf(this.f22589j);
        return descriptorProtos$FileOptions$OptimizeModeValueOf == null ? DescriptorProtos$FileOptions$OptimizeMode.SPEED : descriptorProtos$FileOptions$OptimizeModeValueOf;
    }

    @Override // com.explorestack.protobuf.v2
    public String getPhpClassPrefix() {
        Serializable serializable = this.f22600u;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22600u = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getPhpClassPrefixBytes() {
        Serializable serializable = this.f22600u;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22600u = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getPhpGenericServices() {
        return this.f22594o;
    }

    @Override // com.explorestack.protobuf.v2
    public String getPhpMetadataNamespace() {
        Serializable serializable = this.f22602w;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22602w = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getPhpMetadataNamespaceBytes() {
        Serializable serializable = this.f22602w;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22602w = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public String getPhpNamespace() {
        Serializable serializable = this.f22601v;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22601v = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getPhpNamespaceBytes() {
        Serializable serializable = this.f22601v;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22601v = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean getPyGenericServices() {
        return this.f22593n;
    }

    @Override // com.explorestack.protobuf.v2
    public String getRubyPackage() {
        Serializable serializable = this.f22603x;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22603x = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getRubyPackageBytes() {
        Serializable serializable = this.f22603x;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22603x = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public String getSwiftPrefix() {
        Serializable serializable = this.f22599t;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22599t = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public ByteString getSwiftPrefixBytes() {
        Serializable serializable = this.f22599t;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22599t = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.v2
    public v4 getUninterpretedOption(int i10) {
        pa paVar = this.f22605z;
        return paVar == null ? (v4) this.f22604y.get(i10) : (v4) paVar.getMessage(i10);
    }

    public q4 getUninterpretedOptionBuilder(int i10) {
        return (q4) j().getBuilder(i10);
    }

    public List<q4> getUninterpretedOptionBuilderList() {
        return j().getBuilderList();
    }

    @Override // com.explorestack.protobuf.v2
    public int getUninterpretedOptionCount() {
        pa paVar = this.f22605z;
        return paVar == null ? this.f22604y.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.v2
    public List<v4> getUninterpretedOptionList() {
        pa paVar = this.f22605z;
        return paVar == null ? Collections.unmodifiableList(this.f22604y) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.v2
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        pa paVar = this.f22605z;
        return paVar == null ? (w4) this.f22604y.get(i10) : (w4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.v2
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        pa paVar = this.f22605z;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22604y);
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasCcEnableArenas() {
        return (this.f22583c & 4096) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasCcGenericServices() {
        return (this.f22583c & 128) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasCsharpNamespace() {
        return (this.f22583c & 16384) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasDeprecated() {
        return (this.f22583c & 2048) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasGoPackage() {
        return (this.f22583c & 64) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        return (this.f22583c & 8) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaGenericServices() {
        return (this.f22583c & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaMultipleFiles() {
        return (this.f22583c & 4) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaOuterClassname() {
        return (this.f22583c & 2) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaPackage() {
        return (this.f22583c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasJavaStringCheckUtf8() {
        return (this.f22583c & 16) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasObjcClassPrefix() {
        return (this.f22583c & Segment.SIZE) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasOptimizeFor() {
        return (this.f22583c & 32) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPhpClassPrefix() {
        return (this.f22583c & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPhpGenericServices() {
        return (this.f22583c & 1024) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPhpMetadataNamespace() {
        return (this.f22583c & 262144) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPhpNamespace() {
        return (this.f22583c & 131072) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasPyGenericServices() {
        return (this.f22583c & 512) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasRubyPackage() {
        return (this.f22583c & 524288) != 0;
    }

    @Override // com.explorestack.protobuf.v2
    public boolean hasSwiftPrefix() {
        return (this.f22583c & 32768) != 0;
    }

    public final void i() {
        if ((this.f22583c & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.f22604y = new ArrayList(this.f22604y);
            this.f22583c |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22859z.ensureFieldAccessorsInitialized(u2.class, s2.class);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                return false;
            }
        }
        return e();
    }

    public final pa j() {
        if (this.f22605z == null) {
            this.f22605z = new pa(this.f22604y, (this.f22583c & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0, getParentForChildren(), isClean());
            this.f22604y = null;
        }
        return this.f22605z;
    }

    public s2 removeUninterpretedOption(int i10) {
        pa paVar = this.f22605z;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22604y.remove(i10);
        onChanged();
        return this;
    }

    public s2 setCcEnableArenas(boolean z10) {
        this.f22583c |= 4096;
        this.f22596q = z10;
        onChanged();
        return this;
    }

    public s2 setCcGenericServices(boolean z10) {
        this.f22583c |= 128;
        this.f22591l = z10;
        onChanged();
        return this;
    }

    public s2 setCsharpNamespace(String str) {
        str.getClass();
        this.f22583c |= 16384;
        this.f22598s = str;
        onChanged();
        return this;
    }

    public s2 setCsharpNamespaceBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= 16384;
        this.f22598s = byteString;
        onChanged();
        return this;
    }

    public s2 setDeprecated(boolean z10) {
        this.f22583c |= 2048;
        this.f22595p = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, int i10, Object obj) {
        return setExtension(e6Var, i10, (int) obj);
    }

    public s2 setGoPackage(String str) {
        str.getClass();
        this.f22583c |= 64;
        this.f22590k = str;
        onChanged();
        return this;
    }

    public s2 setGoPackageBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= 64;
        this.f22590k = byteString;
        onChanged();
        return this;
    }

    @Deprecated
    public s2 setJavaGenerateEqualsAndHash(boolean z10) {
        this.f22583c |= 8;
        this.f22587h = z10;
        onChanged();
        return this;
    }

    public s2 setJavaGenericServices(boolean z10) {
        this.f22583c |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.f22592m = z10;
        onChanged();
        return this;
    }

    public s2 setJavaMultipleFiles(boolean z10) {
        this.f22583c |= 4;
        this.f22586g = z10;
        onChanged();
        return this;
    }

    public s2 setJavaOuterClassname(String str) {
        str.getClass();
        this.f22583c |= 2;
        this.f22585f = str;
        onChanged();
        return this;
    }

    public s2 setJavaOuterClassnameBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= 2;
        this.f22585f = byteString;
        onChanged();
        return this;
    }

    public s2 setJavaPackage(String str) {
        str.getClass();
        this.f22583c |= 1;
        this.f22584e = str;
        onChanged();
        return this;
    }

    public s2 setJavaPackageBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= 1;
        this.f22584e = byteString;
        onChanged();
        return this;
    }

    public s2 setJavaStringCheckUtf8(boolean z10) {
        this.f22583c |= 16;
        this.f22588i = z10;
        onChanged();
        return this;
    }

    public s2 setObjcClassPrefix(String str) {
        str.getClass();
        this.f22583c |= Segment.SIZE;
        this.f22597r = str;
        onChanged();
        return this;
    }

    public s2 setObjcClassPrefixBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= Segment.SIZE;
        this.f22597r = byteString;
        onChanged();
        return this;
    }

    public s2 setOptimizeFor(DescriptorProtos$FileOptions$OptimizeMode descriptorProtos$FileOptions$OptimizeMode) {
        descriptorProtos$FileOptions$OptimizeMode.getClass();
        this.f22583c |= 32;
        this.f22589j = descriptorProtos$FileOptions$OptimizeMode.getNumber();
        onChanged();
        return this;
    }

    public s2 setPhpClassPrefix(String str) {
        str.getClass();
        this.f22583c |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.f22600u = str;
        onChanged();
        return this;
    }

    public s2 setPhpClassPrefixBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.f22600u = byteString;
        onChanged();
        return this;
    }

    public s2 setPhpGenericServices(boolean z10) {
        this.f22583c |= 1024;
        this.f22594o = z10;
        onChanged();
        return this;
    }

    public s2 setPhpMetadataNamespace(String str) {
        str.getClass();
        this.f22583c |= 262144;
        this.f22602w = str;
        onChanged();
        return this;
    }

    public s2 setPhpMetadataNamespaceBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= 262144;
        this.f22602w = byteString;
        onChanged();
        return this;
    }

    public s2 setPhpNamespace(String str) {
        str.getClass();
        this.f22583c |= 131072;
        this.f22601v = str;
        onChanged();
        return this;
    }

    public s2 setPhpNamespaceBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= 131072;
        this.f22601v = byteString;
        onChanged();
        return this;
    }

    public s2 setPyGenericServices(boolean z10) {
        this.f22583c |= 512;
        this.f22593n = z10;
        onChanged();
        return this;
    }

    public s2 setRubyPackage(String str) {
        str.getClass();
        this.f22583c |= 524288;
        this.f22603x = str;
        onChanged();
        return this;
    }

    public s2 setRubyPackageBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= 524288;
        this.f22603x = byteString;
        onChanged();
        return this;
    }

    public s2 setSwiftPrefix(String str) {
        str.getClass();
        this.f22583c |= 32768;
        this.f22599t = str;
        onChanged();
        return this;
    }

    public s2 setSwiftPrefixBytes(ByteString byteString) {
        byteString.getClass();
        this.f22583c |= 32768;
        this.f22599t = byteString;
        onChanged();
        return this;
    }

    public s2 setUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22605z;
        if (paVar != null) {
            paVar.setMessage(i10, v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22604y.set(i10, v4Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> s2 addExtension(e6 e6Var, Type type) {
        return (s2) super.addExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> s2 clearExtension(e6 e6Var) {
        return (s2) super.clearExtension(e6Var);
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, Object obj) {
        return setExtension(e6Var, (e6) obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public u2 build() {
        u2 u2VarBuildPartial = buildPartial();
        if (u2VarBuildPartial.isInitialized()) {
            return u2VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) u2VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public u2 buildPartial() {
        u2 u2Var = new u2(this);
        u2Var.f22717z = (byte) -1;
        int i10 = this.f22583c;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        u2Var.f22696e = this.f22584e;
        if ((i10 & 2) != 0) {
            i11 |= 2;
        }
        u2Var.f22697f = this.f22585f;
        if ((i10 & 4) != 0) {
            u2Var.f22698g = this.f22586g;
            i11 |= 4;
        }
        if ((i10 & 8) != 0) {
            u2Var.f22699h = this.f22587h;
            i11 |= 8;
        }
        if ((i10 & 16) != 0) {
            u2Var.f22700i = this.f22588i;
            i11 |= 16;
        }
        if ((i10 & 32) != 0) {
            i11 |= 32;
        }
        u2Var.f22701j = this.f22589j;
        if ((i10 & 64) != 0) {
            i11 |= 64;
        }
        u2Var.f22702k = this.f22590k;
        if ((i10 & 128) != 0) {
            u2Var.f22703l = this.f22591l;
            i11 |= 128;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            u2Var.f22704m = this.f22592m;
            i11 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if ((i10 & 512) != 0) {
            u2Var.f22705n = this.f22593n;
            i11 |= 512;
        }
        if ((i10 & 1024) != 0) {
            u2Var.f22706o = this.f22594o;
            i11 |= 1024;
        }
        if ((i10 & 2048) != 0) {
            u2Var.f22707p = this.f22595p;
            i11 |= 2048;
        }
        if ((i10 & 4096) != 0) {
            i11 |= 4096;
        }
        u2Var.f22708q = this.f22596q;
        if ((i10 & Segment.SIZE) != 0) {
            i11 |= Segment.SIZE;
        }
        u2Var.f22709r = this.f22597r;
        if ((i10 & 16384) != 0) {
            i11 |= 16384;
        }
        u2Var.f22710s = this.f22598s;
        if ((i10 & 32768) != 0) {
            i11 |= 32768;
        }
        u2Var.f22711t = this.f22599t;
        if ((i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            i11 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        u2Var.f22712u = this.f22600u;
        if ((i10 & 131072) != 0) {
            i11 |= 131072;
        }
        u2Var.f22713v = this.f22601v;
        if ((i10 & 262144) != 0) {
            i11 |= 262144;
        }
        u2Var.f22714w = this.f22602w;
        if ((i10 & 524288) != 0) {
            i11 |= 524288;
        }
        u2Var.f22715x = this.f22603x;
        pa paVar = this.f22605z;
        if (paVar == null) {
            if ((this.f22583c & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                this.f22604y = Collections.unmodifiableList(this.f22604y);
                this.f22583c &= -1048577;
            }
            u2Var.f22716y = this.f22604y;
        } else {
            u2Var.f22716y = paVar.build();
        }
        u2Var.f22695c = i11;
        onBuilt();
        return u2Var;
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public u2 getDefaultInstanceForType() {
        return u2.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> s2 setExtension(e6 e6Var, Type type) {
        return (s2) super.setExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final s2 setUnknownFields(gc gcVar) {
        return (s2) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s2 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s2) super.addRepeatedField(fieldDescriptor, obj);
    }

    public q4 addUninterpretedOptionBuilder(int i10) {
        return (q4) j().addBuilder(i10, v4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s2 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (s2) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s2 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (s2) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final s2 mergeUnknownFields(gc gcVar) {
        return (s2) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> s2 setExtension(e6 e6Var, int i10, Type type) {
        return (s2) super.setExtension(e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s2 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s2) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s2 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (s2) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public s2 clear() {
        super.clear();
        this.f22584e = "";
        int i10 = this.f22583c;
        this.f22585f = "";
        this.f22586g = false;
        this.f22587h = false;
        this.f22588i = false;
        this.f22589j = 1;
        this.f22590k = "";
        this.f22591l = false;
        this.f22592m = false;
        this.f22593n = false;
        this.f22594o = false;
        this.f22595p = false;
        this.f22596q = true;
        this.f22597r = "";
        this.f22598s = "";
        this.f22599t = "";
        this.f22600u = "";
        this.f22601v = "";
        this.f22602w = "";
        this.f22603x = "";
        this.f22583c = (-1048576) & i10;
        pa paVar = this.f22605z;
        if (paVar == null) {
            this.f22604y = Collections.EMPTY_LIST;
            this.f22583c = (-2097152) & i10;
            return this;
        }
        paVar.clear();
        return this;
    }

    public s2 addUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22605z;
        if (paVar == null) {
            v4Var.getClass();
            i();
            this.f22604y.add(i10, v4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public s2 mo500clone() {
        return (s2) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s2 mergeFrom(Message message) {
        if (message instanceof u2) {
            return mergeFrom((u2) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public s2 setUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22605z;
        if (paVar == null) {
            i();
            this.f22604y.set(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q4Var.build());
        return this;
    }

    public s2 mergeFrom(u2 u2Var) {
        if (u2Var == u2.getDefaultInstance()) {
            return this;
        }
        if (u2Var.hasJavaPackage()) {
            this.f22583c |= 1;
            this.f22584e = u2Var.f22696e;
            onChanged();
        }
        if (u2Var.hasJavaOuterClassname()) {
            this.f22583c |= 2;
            this.f22585f = u2Var.f22697f;
            onChanged();
        }
        if (u2Var.hasJavaMultipleFiles()) {
            setJavaMultipleFiles(u2Var.getJavaMultipleFiles());
        }
        if (u2Var.hasJavaGenerateEqualsAndHash()) {
            setJavaGenerateEqualsAndHash(u2Var.getJavaGenerateEqualsAndHash());
        }
        if (u2Var.hasJavaStringCheckUtf8()) {
            setJavaStringCheckUtf8(u2Var.getJavaStringCheckUtf8());
        }
        if (u2Var.hasOptimizeFor()) {
            setOptimizeFor(u2Var.getOptimizeFor());
        }
        if (u2Var.hasGoPackage()) {
            this.f22583c |= 64;
            this.f22590k = u2Var.f22702k;
            onChanged();
        }
        if (u2Var.hasCcGenericServices()) {
            setCcGenericServices(u2Var.getCcGenericServices());
        }
        if (u2Var.hasJavaGenericServices()) {
            setJavaGenericServices(u2Var.getJavaGenericServices());
        }
        if (u2Var.hasPyGenericServices()) {
            setPyGenericServices(u2Var.getPyGenericServices());
        }
        if (u2Var.hasPhpGenericServices()) {
            setPhpGenericServices(u2Var.getPhpGenericServices());
        }
        if (u2Var.hasDeprecated()) {
            setDeprecated(u2Var.getDeprecated());
        }
        if (u2Var.hasCcEnableArenas()) {
            setCcEnableArenas(u2Var.getCcEnableArenas());
        }
        if (u2Var.hasObjcClassPrefix()) {
            this.f22583c |= Segment.SIZE;
            this.f22597r = u2Var.f22709r;
            onChanged();
        }
        if (u2Var.hasCsharpNamespace()) {
            this.f22583c |= 16384;
            this.f22598s = u2Var.f22710s;
            onChanged();
        }
        if (u2Var.hasSwiftPrefix()) {
            this.f22583c |= 32768;
            this.f22599t = u2Var.f22711t;
            onChanged();
        }
        if (u2Var.hasPhpClassPrefix()) {
            this.f22583c |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
            this.f22600u = u2Var.f22712u;
            onChanged();
        }
        if (u2Var.hasPhpNamespace()) {
            this.f22583c |= 131072;
            this.f22601v = u2Var.f22713v;
            onChanged();
        }
        if (u2Var.hasPhpMetadataNamespace()) {
            this.f22583c |= 262144;
            this.f22602w = u2Var.f22714w;
            onChanged();
        }
        if (u2Var.hasRubyPackage()) {
            this.f22583c |= 524288;
            this.f22603x = u2Var.f22715x;
            onChanged();
        }
        if (this.f22605z == null) {
            if (!u2Var.f22716y.isEmpty()) {
                if (this.f22604y.isEmpty()) {
                    this.f22604y = u2Var.f22716y;
                    this.f22583c &= -1048577;
                } else {
                    i();
                    this.f22604y.addAll(u2Var.f22716y);
                }
                onChanged();
            }
        } else if (!u2Var.f22716y.isEmpty()) {
            if (this.f22605z.isEmpty()) {
                this.f22605z.dispose();
                this.f22605z = null;
                this.f22604y = u2Var.f22716y;
                this.f22583c = (-1048577) & this.f22583c;
                this.f22605z = k7.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f22605z.addAllMessages(u2Var.f22716y);
            }
        }
        f(u2Var);
        mergeUnknownFields(u2Var.unknownFields);
        onChanged();
        return this;
    }

    public s2 addUninterpretedOption(q4 q4Var) {
        pa paVar = this.f22605z;
        if (paVar == null) {
            i();
            this.f22604y.add(q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q4Var.build());
        return this;
    }

    public s2 addUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22605z;
        if (paVar == null) {
            i();
            this.f22604y.add(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, q4Var.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.s2 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.r2 r1 = com.explorestack.protobuf.u2.B     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.u2 r3 = (com.explorestack.protobuf.u2) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            if (r3 == 0) goto Le
            r2.mergeFrom(r3)
        Le:
            return r2
        Lf:
            r3 = move-exception
            goto L1f
        L11:
            r3 = move-exception
            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
            com.explorestack.protobuf.u2 r4 = (com.explorestack.protobuf.u2) r4     // Catch: java.lang.Throwable -> Lf
            java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.mergeFrom(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.s2.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.s2");
    }
}
