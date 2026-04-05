package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j3 extends o6 implements l3 {

    /* renamed from: b, reason: collision with root package name */
    public int f22263b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f22264c;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f22265e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f22266f;

    /* renamed from: g, reason: collision with root package name */
    public p3 f22267g;

    /* renamed from: h, reason: collision with root package name */
    public xa f22268h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22269i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22270j;

    public j3() {
        super(null);
        this.f22264c = "";
        this.f22265e = "";
        this.f22266f = "";
        if (k7.alwaysUseFieldBuilders && this.f22268h == null) {
            this.f22268h = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22267g = null;
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22856w;
    }

    public j3 clearClientStreaming() {
        this.f22263b &= -17;
        this.f22269i = false;
        onChanged();
        return this;
    }

    public j3 clearInputType() {
        this.f22263b &= -3;
        this.f22265e = k3.getDefaultInstance().getInputType();
        onChanged();
        return this;
    }

    public j3 clearName() {
        this.f22263b &= -2;
        this.f22264c = k3.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public j3 clearOptions() {
        xa xaVar = this.f22268h;
        if (xaVar == null) {
            this.f22267g = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f22263b &= -9;
        return this;
    }

    public j3 clearOutputType() {
        this.f22263b &= -5;
        this.f22266f = k3.getDefaultInstance().getOutputType();
        onChanged();
        return this;
    }

    public j3 clearServerStreaming() {
        this.f22263b &= -33;
        this.f22270j = false;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean getClientStreaming() {
        return this.f22269i;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22856w;
    }

    @Override // com.explorestack.protobuf.l3
    public String getInputType() {
        Serializable serializable = this.f22265e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22265e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public ByteString getInputTypeBytes() {
        Serializable serializable = this.f22265e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22265e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public String getName() {
        Serializable serializable = this.f22264c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22264c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public ByteString getNameBytes() {
        Serializable serializable = this.f22264c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22264c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public p3 getOptions() {
        xa xaVar = this.f22268h;
        if (xaVar != null) {
            return (p3) xaVar.getMessage();
        }
        p3 p3Var = this.f22267g;
        return p3Var == null ? p3.getDefaultInstance() : p3Var;
    }

    public n3 getOptionsBuilder() {
        this.f22263b |= 8;
        onChanged();
        if (this.f22268h == null) {
            this.f22268h = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22267g = null;
        }
        return (n3) this.f22268h.getBuilder();
    }

    @Override // com.explorestack.protobuf.l3
    public q3 getOptionsOrBuilder() {
        xa xaVar = this.f22268h;
        if (xaVar != null) {
            return (q3) xaVar.getMessageOrBuilder();
        }
        p3 p3Var = this.f22267g;
        return p3Var == null ? p3.getDefaultInstance() : p3Var;
    }

    @Override // com.explorestack.protobuf.l3
    public String getOutputType() {
        Serializable serializable = this.f22266f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22266f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public ByteString getOutputTypeBytes() {
        Serializable serializable = this.f22266f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22266f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean getServerStreaming() {
        return this.f22270j;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasClientStreaming() {
        return (this.f22263b & 16) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasInputType() {
        return (this.f22263b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasName() {
        return (this.f22263b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasOptions() {
        return (this.f22263b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasOutputType() {
        return (this.f22263b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasServerStreaming() {
        return (this.f22263b & 32) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22857x.ensureFieldAccessorsInitialized(k3.class, j3.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return !hasOptions() || getOptions().isInitialized();
    }

    public j3 mergeOptions(p3 p3Var) {
        p3 p3Var2;
        xa xaVar = this.f22268h;
        if (xaVar == null) {
            if ((this.f22263b & 8) == 0 || (p3Var2 = this.f22267g) == null || p3Var2 == p3.getDefaultInstance()) {
                this.f22267g = p3Var;
            } else {
                this.f22267g = p3.newBuilder(this.f22267g).mergeFrom(p3Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(p3Var);
        }
        this.f22263b |= 8;
        return this;
    }

    public j3 setClientStreaming(boolean z10) {
        this.f22263b |= 16;
        this.f22269i = z10;
        onChanged();
        return this;
    }

    public j3 setInputType(String str) {
        str.getClass();
        this.f22263b |= 2;
        this.f22265e = str;
        onChanged();
        return this;
    }

    public j3 setInputTypeBytes(ByteString byteString) {
        byteString.getClass();
        this.f22263b |= 2;
        this.f22265e = byteString;
        onChanged();
        return this;
    }

    public j3 setName(String str) {
        str.getClass();
        this.f22263b |= 1;
        this.f22264c = str;
        onChanged();
        return this;
    }

    public j3 setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f22263b |= 1;
        this.f22264c = byteString;
        onChanged();
        return this;
    }

    public j3 setOptions(p3 p3Var) {
        xa xaVar = this.f22268h;
        if (xaVar == null) {
            p3Var.getClass();
            this.f22267g = p3Var;
            onChanged();
        } else {
            xaVar.setMessage(p3Var);
        }
        this.f22263b |= 8;
        return this;
    }

    public j3 setOutputType(String str) {
        str.getClass();
        this.f22263b |= 4;
        this.f22266f = str;
        onChanged();
        return this;
    }

    public j3 setOutputTypeBytes(ByteString byteString) {
        byteString.getClass();
        this.f22263b |= 4;
        this.f22266f = byteString;
        onChanged();
        return this;
    }

    public j3 setServerStreaming(boolean z10) {
        this.f22263b |= 32;
        this.f22270j = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public j3 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (j3) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public k3 build() {
        k3 k3VarBuildPartial = buildPartial();
        if (k3VarBuildPartial.isInitialized()) {
            return k3VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) k3VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public k3 buildPartial() {
        k3 k3Var = new k3(this);
        k3Var.f22300j = (byte) -1;
        int i10 = this.f22263b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        k3Var.f22294c = this.f22264c;
        if ((i10 & 2) != 0) {
            i11 |= 2;
        }
        k3Var.f22295e = this.f22265e;
        if ((i10 & 4) != 0) {
            i11 |= 4;
        }
        k3Var.f22296f = this.f22266f;
        if ((i10 & 8) != 0) {
            xa xaVar = this.f22268h;
            if (xaVar == null) {
                k3Var.f22297g = this.f22267g;
            } else {
                k3Var.f22297g = (p3) xaVar.build();
            }
            i11 |= 8;
        }
        if ((i10 & 16) != 0) {
            k3Var.f22298h = this.f22269i;
            i11 |= 16;
        }
        if ((i10 & 32) != 0) {
            k3Var.f22299i = this.f22270j;
            i11 |= 32;
        }
        k3Var.f22293b = i11;
        onBuilt();
        return k3Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public j3 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (j3) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public k3 getDefaultInstanceForType() {
        return k3.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public j3 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (j3) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public j3 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (j3) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final j3 setUnknownFields(gc gcVar) {
        return (j3) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public j3 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (j3) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final j3 mergeUnknownFields(gc gcVar) {
        return (j3) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public j3 clear() {
        super.clear();
        this.f22264c = "";
        int i10 = this.f22263b;
        this.f22265e = "";
        this.f22266f = "";
        this.f22263b = i10 & (-8);
        xa xaVar = this.f22268h;
        if (xaVar == null) {
            this.f22267g = null;
        } else {
            xaVar.clear();
        }
        int i11 = this.f22263b;
        this.f22269i = false;
        this.f22270j = false;
        this.f22263b = i11 & (-57);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public j3 mo500clone() {
        return (j3) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public j3 mergeFrom(Message message) {
        if (message instanceof k3) {
            return mergeFrom((k3) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public j3 setOptions(n3 n3Var) {
        xa xaVar = this.f22268h;
        if (xaVar == null) {
            this.f22267g = n3Var.build();
            onChanged();
        } else {
            xaVar.setMessage(n3Var.build());
        }
        this.f22263b |= 8;
        return this;
    }

    public j3 mergeFrom(k3 k3Var) {
        if (k3Var == k3.getDefaultInstance()) {
            return this;
        }
        if (k3Var.hasName()) {
            this.f22263b |= 1;
            this.f22264c = k3Var.f22294c;
            onChanged();
        }
        if (k3Var.hasInputType()) {
            this.f22263b |= 2;
            this.f22265e = k3Var.f22295e;
            onChanged();
        }
        if (k3Var.hasOutputType()) {
            this.f22263b |= 4;
            this.f22266f = k3Var.f22296f;
            onChanged();
        }
        if (k3Var.hasOptions()) {
            mergeOptions(k3Var.getOptions());
        }
        if (k3Var.hasClientStreaming()) {
            setClientStreaming(k3Var.getClientStreaming());
        }
        if (k3Var.hasServerStreaming()) {
            setServerStreaming(k3Var.getServerStreaming());
        }
        mergeUnknownFields(k3Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.j3 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.i3 r1 = com.explorestack.protobuf.k3.f22292l     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.k3 r3 = (com.explorestack.protobuf.k3) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.k3 r4 = (com.explorestack.protobuf.k3) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.j3.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.j3");
    }
}
