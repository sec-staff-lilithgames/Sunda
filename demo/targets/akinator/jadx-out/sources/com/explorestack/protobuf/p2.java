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
public final class p2 extends k7 implements q2 {

    /* renamed from: q, reason: collision with root package name */
    public static final p2 f22465q = new p2();

    /* renamed from: r, reason: collision with root package name */
    public static final n2 f22466r = new n2();

    /* renamed from: b, reason: collision with root package name */
    public int f22467b;

    /* renamed from: i, reason: collision with root package name */
    public List f22473i;

    /* renamed from: j, reason: collision with root package name */
    public List f22474j;

    /* renamed from: k, reason: collision with root package name */
    public List f22475k;

    /* renamed from: l, reason: collision with root package name */
    public List f22476l;

    /* renamed from: m, reason: collision with root package name */
    public u2 f22477m;

    /* renamed from: n, reason: collision with root package name */
    public n4 f22478n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Serializable f22479o;

    /* renamed from: p, reason: collision with root package name */
    public byte f22480p = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f22468c = "";

    /* renamed from: e, reason: collision with root package name */
    public volatile Serializable f22469e = "";

    /* renamed from: f, reason: collision with root package name */
    public g8 f22470f = f8.f22138e;

    /* renamed from: g, reason: collision with root package name */
    public s7 f22471g = k7.emptyIntList();

    /* renamed from: h, reason: collision with root package name */
    public s7 f22472h = k7.emptyIntList();

    public p2() {
        List list = Collections.EMPTY_LIST;
        this.f22473i = list;
        this.f22474j = list;
        this.f22475k = list;
        this.f22476l = list;
        this.f22479o = "";
    }

    public static p2 getDefaultInstance() {
        return f22465q;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22833a;
    }

    public static o2 newBuilder() {
        return f22465q.toBuilder();
    }

    public static p2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (p2) k7.parseDelimitedWithIOException(f22466r, inputStream);
    }

    public static p2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (p2) f22466r.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22466r;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return super.equals(obj);
        }
        p2 p2Var = (p2) obj;
        if (hasName() != p2Var.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(p2Var.getName())) || hasPackage() != p2Var.hasPackage()) {
            return false;
        }
        if ((hasPackage() && !getPackage().equals(p2Var.getPackage())) || !getDependencyList().equals(p2Var.getDependencyList()) || !getPublicDependencyList().equals(p2Var.getPublicDependencyList()) || !getWeakDependencyList().equals(p2Var.getWeakDependencyList()) || !getMessageTypeList().equals(p2Var.getMessageTypeList()) || !getEnumTypeList().equals(p2Var.getEnumTypeList()) || !getServiceList().equals(p2Var.getServiceList()) || !getExtensionList().equals(p2Var.getExtensionList()) || hasOptions() != p2Var.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(p2Var.getOptions())) || hasSourceCodeInfo() != p2Var.hasSourceCodeInfo()) {
            return false;
        }
        if ((!hasSourceCodeInfo() || getSourceCodeInfo().equals(p2Var.getSourceCodeInfo())) && hasSyntax() == p2Var.hasSyntax()) {
            return (!hasSyntax() || getSyntax().equals(p2Var.getSyntax())) && this.unknownFields.equals(p2Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.q2
    public String getDependency(int i10) {
        return (String) this.f22470f.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public ByteString getDependencyBytes(int i10) {
        return this.f22470f.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getDependencyCount() {
        return this.f22470f.size();
    }

    @Override // com.explorestack.protobuf.q2
    public j1 getEnumType(int i10) {
        return (j1) this.f22474j.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getEnumTypeCount() {
        return this.f22474j.size();
    }

    @Override // com.explorestack.protobuf.q2
    public List<j1> getEnumTypeList() {
        return this.f22474j;
    }

    @Override // com.explorestack.protobuf.q2
    public k1 getEnumTypeOrBuilder(int i10) {
        return (k1) this.f22474j.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public List<? extends k1> getEnumTypeOrBuilderList() {
        return this.f22474j;
    }

    @Override // com.explorestack.protobuf.q2
    public f2 getExtension(int i10) {
        return (f2) this.f22476l.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getExtensionCount() {
        return this.f22476l.size();
    }

    @Override // com.explorestack.protobuf.q2
    public List<f2> getExtensionList() {
        return this.f22476l;
    }

    @Override // com.explorestack.protobuf.q2
    public g2 getExtensionOrBuilder(int i10) {
        return (g2) this.f22476l.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public List<? extends g2> getExtensionOrBuilderList() {
        return this.f22476l;
    }

    @Override // com.explorestack.protobuf.q2
    public b1 getMessageType(int i10) {
        return (b1) this.f22473i.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getMessageTypeCount() {
        return this.f22473i.size();
    }

    @Override // com.explorestack.protobuf.q2
    public List<b1> getMessageTypeList() {
        return this.f22473i;
    }

    @Override // com.explorestack.protobuf.q2
    public c1 getMessageTypeOrBuilder(int i10) {
        return (c1) this.f22473i.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public List<? extends c1> getMessageTypeOrBuilderList() {
        return this.f22473i;
    }

    @Override // com.explorestack.protobuf.q2
    public String getName() {
        Serializable serializable = this.f22468c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22468c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public ByteString getNameBytes() {
        Serializable serializable = this.f22468c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22468c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public u2 getOptions() {
        u2 u2Var = this.f22477m;
        return u2Var == null ? u2.getDefaultInstance() : u2Var;
    }

    @Override // com.explorestack.protobuf.q2
    public v2 getOptionsOrBuilder() {
        u2 u2Var = this.f22477m;
        return u2Var == null ? u2.getDefaultInstance() : u2Var;
    }

    @Override // com.explorestack.protobuf.q2
    public String getPackage() {
        Serializable serializable = this.f22469e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22469e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public ByteString getPackageBytes() {
        Serializable serializable = this.f22469e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22469e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22466r;
    }

    @Override // com.explorestack.protobuf.q2
    public int getPublicDependency(int i10) {
        return ((l7) this.f22471g).getInt(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getPublicDependencyCount() {
        return this.f22471g.size();
    }

    @Override // com.explorestack.protobuf.q2
    public List<Integer> getPublicDependencyList() {
        return this.f22471g;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f22467b & 1) != 0 ? k7.computeStringSize(1, this.f22468c) : 0;
        if ((this.f22467b & 2) != 0) {
            iComputeStringSize += k7.computeStringSize(2, this.f22469e);
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f22470f.size(); i11++) {
            iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.f22470f, i11, iE);
        }
        int size = getDependencyList().size() + iComputeStringSize + iE;
        for (int i12 = 0; i12 < this.f22473i.size(); i12++) {
            size += h0.computeMessageSize(4, (MessageLite) this.f22473i.get(i12));
        }
        for (int i13 = 0; i13 < this.f22474j.size(); i13++) {
            size += h0.computeMessageSize(5, (MessageLite) this.f22474j.get(i13));
        }
        for (int i14 = 0; i14 < this.f22475k.size(); i14++) {
            size += h0.computeMessageSize(6, (MessageLite) this.f22475k.get(i14));
        }
        for (int i15 = 0; i15 < this.f22476l.size(); i15++) {
            size += h0.computeMessageSize(7, (MessageLite) this.f22476l.get(i15));
        }
        if ((this.f22467b & 4) != 0) {
            size += h0.computeMessageSize(8, getOptions());
        }
        if ((this.f22467b & 8) != 0) {
            size += h0.computeMessageSize(9, getSourceCodeInfo());
        }
        int iComputeInt32SizeNoTag = 0;
        for (int i16 = 0; i16 < this.f22471g.size(); i16++) {
            iComputeInt32SizeNoTag += h0.computeInt32SizeNoTag(((l7) this.f22471g).getInt(i16));
        }
        int size2 = getPublicDependencyList().size() + size + iComputeInt32SizeNoTag;
        int iComputeInt32SizeNoTag2 = 0;
        for (int i17 = 0; i17 < this.f22472h.size(); i17++) {
            iComputeInt32SizeNoTag2 += h0.computeInt32SizeNoTag(((l7) this.f22472h).getInt(i17));
        }
        int size3 = getWeakDependencyList().size() + size2 + iComputeInt32SizeNoTag2;
        if ((this.f22467b & 16) != 0) {
            size3 += k7.computeStringSize(12, this.f22479o);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.q2
    public b4 getService(int i10) {
        return (b4) this.f22475k.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getServiceCount() {
        return this.f22475k.size();
    }

    @Override // com.explorestack.protobuf.q2
    public List<b4> getServiceList() {
        return this.f22475k;
    }

    @Override // com.explorestack.protobuf.q2
    public c4 getServiceOrBuilder(int i10) {
        return (c4) this.f22475k.get(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public List<? extends c4> getServiceOrBuilderList() {
        return this.f22475k;
    }

    @Override // com.explorestack.protobuf.q2
    public n4 getSourceCodeInfo() {
        n4 n4Var = this.f22478n;
        return n4Var == null ? n4.getDefaultInstance() : n4Var;
    }

    @Override // com.explorestack.protobuf.q2
    public o4 getSourceCodeInfoOrBuilder() {
        n4 n4Var = this.f22478n;
        return n4Var == null ? n4.getDefaultInstance() : n4Var;
    }

    @Override // com.explorestack.protobuf.q2
    public String getSyntax() {
        Serializable serializable = this.f22479o;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22479o = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.q2
    public ByteString getSyntaxBytes() {
        Serializable serializable = this.f22479o;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22479o = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.q2
    public int getWeakDependency(int i10) {
        return ((l7) this.f22472h).getInt(i10);
    }

    @Override // com.explorestack.protobuf.q2
    public int getWeakDependencyCount() {
        return this.f22472h.size();
    }

    @Override // com.explorestack.protobuf.q2
    public List<Integer> getWeakDependencyList() {
        return this.f22472h;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasName() {
        return (this.f22467b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasOptions() {
        return (this.f22467b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasPackage() {
        return (this.f22467b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasSourceCodeInfo() {
        return (this.f22467b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.q2
    public boolean hasSyntax() {
        return (this.f22467b & 16) != 0;
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
        if (hasPackage()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getPackage().hashCode();
        }
        if (getDependencyCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getDependencyList().hashCode();
        }
        if (getPublicDependencyCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 10, 53) + getPublicDependencyList().hashCode();
        }
        if (getWeakDependencyCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 11, 53) + getWeakDependencyList().hashCode();
        }
        if (getMessageTypeCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 4, 53) + getMessageTypeList().hashCode();
        }
        if (getEnumTypeCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 5, 53) + getEnumTypeList().hashCode();
        }
        if (getServiceCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 6, 53) + getServiceList().hashCode();
        }
        if (getExtensionCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 7, 53) + getExtensionList().hashCode();
        }
        if (hasOptions()) {
            iHashCode = p0.o2.B(iHashCode, 37, 8, 53) + getOptions().hashCode();
        }
        if (hasSourceCodeInfo()) {
            iHashCode = p0.o2.B(iHashCode, 37, 9, 53) + getSourceCodeInfo().hashCode();
        }
        if (hasSyntax()) {
            iHashCode = p0.o2.B(iHashCode, 37, 12, 53) + getSyntax().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22835b.ensureFieldAccessorsInitialized(p2.class, o2.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22480p;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getMessageTypeCount(); i10++) {
            if (!getMessageType(i10).isInitialized()) {
                this.f22480p = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < getEnumTypeCount(); i11++) {
            if (!getEnumType(i11).isInitialized()) {
                this.f22480p = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < getServiceCount(); i12++) {
            if (!getService(i12).isInitialized()) {
                this.f22480p = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < getExtensionCount(); i13++) {
            if (!getExtension(i13).isInitialized()) {
                this.f22480p = (byte) 0;
                return false;
            }
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f22480p = (byte) 1;
            return true;
        }
        this.f22480p = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new p2();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22467b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f22468c);
        }
        if ((this.f22467b & 2) != 0) {
            k7.writeString(h0Var, 2, this.f22469e);
        }
        int iF = 0;
        while (iF < this.f22470f.size()) {
            iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.f22470f, iF, h0Var, 3, iF, 1);
        }
        for (int i10 = 0; i10 < this.f22473i.size(); i10++) {
            h0Var.writeMessage(4, (MessageLite) this.f22473i.get(i10));
        }
        for (int i11 = 0; i11 < this.f22474j.size(); i11++) {
            h0Var.writeMessage(5, (MessageLite) this.f22474j.get(i11));
        }
        for (int i12 = 0; i12 < this.f22475k.size(); i12++) {
            h0Var.writeMessage(6, (MessageLite) this.f22475k.get(i12));
        }
        for (int i13 = 0; i13 < this.f22476l.size(); i13++) {
            h0Var.writeMessage(7, (MessageLite) this.f22476l.get(i13));
        }
        if ((this.f22467b & 4) != 0) {
            h0Var.writeMessage(8, getOptions());
        }
        if ((this.f22467b & 8) != 0) {
            h0Var.writeMessage(9, getSourceCodeInfo());
        }
        for (int i14 = 0; i14 < this.f22471g.size(); i14++) {
            h0Var.writeInt32(10, ((l7) this.f22471g).getInt(i14));
        }
        for (int i15 = 0; i15 < this.f22472h.size(); i15++) {
            h0Var.writeInt32(11, ((l7) this.f22472h).getInt(i15));
        }
        if ((this.f22467b & 16) != 0) {
            k7.writeString(h0Var, 12, this.f22479o);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static o2 newBuilder(p2 p2Var) {
        return f22465q.toBuilder().mergeFrom(p2Var);
    }

    public static p2 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (p2) f22466r.parseFrom(byteBuffer, m5Var);
    }

    @Override // com.explorestack.protobuf.q2
    public ka getDependencyList() {
        return this.f22470f;
    }

    public static p2 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (p2) k7.parseDelimitedWithIOException(f22466r, inputStream, m5Var);
    }

    public static p2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (p2) f22466r.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public p2 getDefaultInstanceForType() {
        return f22465q;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public o2 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public o2 toBuilder() {
        if (this == f22465q) {
            return new o2();
        }
        return new o2().mergeFrom(this);
    }

    public static p2 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (p2) f22466r.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        o2 o2Var = new o2(p6Var);
        o2Var.f22416c = "";
        o2Var.f22417e = "";
        o2Var.f22418f = f8.f22138e;
        o2Var.f22419g = k7.emptyIntList();
        o2Var.f22420h = k7.emptyIntList();
        List list = Collections.EMPTY_LIST;
        o2Var.f22421i = list;
        o2Var.f22423k = list;
        o2Var.f22425m = list;
        o2Var.f22427o = list;
        o2Var.f22433u = "";
        if (k7.alwaysUseFieldBuilders) {
            o2Var.n();
            o2Var.l();
            o2Var.o();
            o2Var.m();
            if (o2Var.f22430r == null) {
                o2Var.f22430r = new xa(o2Var.getOptions(), o2Var.getParentForChildren(), o2Var.isClean());
                o2Var.f22429q = null;
            }
            if (o2Var.f22432t == null) {
                o2Var.f22432t = new xa(o2Var.getSourceCodeInfo(), o2Var.getParentForChildren(), o2Var.isClean());
                o2Var.f22431s = null;
            }
        }
        return o2Var;
    }

    public static p2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (p2) f22466r.parseFrom(bArr);
    }

    public static p2 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (p2) f22466r.parseFrom(bArr, m5Var);
    }

    public static p2 parseFrom(InputStream inputStream) throws IOException {
        return (p2) k7.parseWithIOException(f22466r, inputStream);
    }

    public static p2 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (p2) k7.parseWithIOException(f22466r, inputStream, m5Var);
    }

    public static p2 parseFrom(y yVar) throws IOException {
        return (p2) k7.parseWithIOException(f22466r, yVar);
    }

    public static p2 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (p2) k7.parseWithIOException(f22466r, yVar, m5Var);
    }
}
