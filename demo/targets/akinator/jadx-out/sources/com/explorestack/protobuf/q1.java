package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q1 extends o6 implements s1 {

    /* renamed from: b, reason: collision with root package name */
    public int f22508b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f22509c;

    /* renamed from: e, reason: collision with root package name */
    public int f22510e;

    /* renamed from: f, reason: collision with root package name */
    public v1 f22511f;

    /* renamed from: g, reason: collision with root package name */
    public xa f22512g;

    public q1() {
        super(null);
        this.f22509c = "";
        if (k7.alwaysUseFieldBuilders && this.f22512g == null) {
            this.f22512g = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22511f = null;
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22852s;
    }

    public q1 clearName() {
        this.f22508b &= -2;
        this.f22509c = r1.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public q1 clearNumber() {
        this.f22508b &= -3;
        this.f22510e = 0;
        onChanged();
        return this;
    }

    public q1 clearOptions() {
        xa xaVar = this.f22512g;
        if (xaVar == null) {
            this.f22511f = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f22508b &= -5;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22852s;
    }

    @Override // com.explorestack.protobuf.s1
    public String getName() {
        Serializable serializable = this.f22509c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22509c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.s1
    public ByteString getNameBytes() {
        Serializable serializable = this.f22509c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22509c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.s1
    public int getNumber() {
        return this.f22510e;
    }

    @Override // com.explorestack.protobuf.s1
    public v1 getOptions() {
        xa xaVar = this.f22512g;
        if (xaVar != null) {
            return (v1) xaVar.getMessage();
        }
        v1 v1Var = this.f22511f;
        return v1Var == null ? v1.getDefaultInstance() : v1Var;
    }

    public u1 getOptionsBuilder() {
        this.f22508b |= 4;
        onChanged();
        if (this.f22512g == null) {
            this.f22512g = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22511f = null;
        }
        return (u1) this.f22512g.getBuilder();
    }

    @Override // com.explorestack.protobuf.s1
    public w1 getOptionsOrBuilder() {
        xa xaVar = this.f22512g;
        if (xaVar != null) {
            return (w1) xaVar.getMessageOrBuilder();
        }
        v1 v1Var = this.f22511f;
        return v1Var == null ? v1.getDefaultInstance() : v1Var;
    }

    @Override // com.explorestack.protobuf.s1
    public boolean hasName() {
        return (this.f22508b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.s1
    public boolean hasNumber() {
        return (this.f22508b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.s1
    public boolean hasOptions() {
        return (this.f22508b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22853t.ensureFieldAccessorsInitialized(r1.class, q1.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return !hasOptions() || getOptions().isInitialized();
    }

    public q1 mergeOptions(v1 v1Var) {
        v1 v1Var2;
        xa xaVar = this.f22512g;
        if (xaVar == null) {
            if ((this.f22508b & 4) == 0 || (v1Var2 = this.f22511f) == null || v1Var2 == v1.getDefaultInstance()) {
                this.f22511f = v1Var;
            } else {
                this.f22511f = v1.newBuilder(this.f22511f).mergeFrom(v1Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(v1Var);
        }
        this.f22508b |= 4;
        return this;
    }

    public q1 setName(String str) {
        str.getClass();
        this.f22508b |= 1;
        this.f22509c = str;
        onChanged();
        return this;
    }

    public q1 setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f22508b |= 1;
        this.f22509c = byteString;
        onChanged();
        return this;
    }

    public q1 setNumber(int i10) {
        this.f22508b |= 2;
        this.f22510e = i10;
        onChanged();
        return this;
    }

    public q1 setOptions(v1 v1Var) {
        xa xaVar = this.f22512g;
        if (xaVar == null) {
            v1Var.getClass();
            this.f22511f = v1Var;
            onChanged();
        } else {
            xaVar.setMessage(v1Var);
        }
        this.f22508b |= 4;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q1 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (q1) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public r1 build() {
        r1 r1VarBuildPartial = buildPartial();
        if (r1VarBuildPartial.isInitialized()) {
            return r1VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) r1VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public r1 buildPartial() {
        r1 r1Var = new r1(this);
        r1Var.f22537g = (byte) -1;
        int i10 = this.f22508b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        r1Var.f22534c = this.f22509c;
        if ((i10 & 2) != 0) {
            r1Var.f22535e = this.f22510e;
            i11 |= 2;
        }
        if ((i10 & 4) != 0) {
            xa xaVar = this.f22512g;
            if (xaVar == null) {
                r1Var.f22536f = this.f22511f;
            } else {
                r1Var.f22536f = (v1) xaVar.build();
            }
            i11 |= 4;
        }
        r1Var.f22533b = i11;
        onBuilt();
        return r1Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q1 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (q1) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public r1 getDefaultInstanceForType() {
        return r1.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q1 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (q1) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q1 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (q1) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final q1 setUnknownFields(gc gcVar) {
        return (q1) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public q1 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (q1) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final q1 mergeUnknownFields(gc gcVar) {
        return (q1) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public q1 clear() {
        super.clear();
        this.f22509c = "";
        int i10 = this.f22508b;
        this.f22510e = 0;
        this.f22508b = i10 & (-4);
        xa xaVar = this.f22512g;
        if (xaVar == null) {
            this.f22511f = null;
        } else {
            xaVar.clear();
        }
        this.f22508b &= -5;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public q1 mo500clone() {
        return (q1) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public q1 mergeFrom(Message message) {
        if (message instanceof r1) {
            return mergeFrom((r1) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public q1 setOptions(u1 u1Var) {
        xa xaVar = this.f22512g;
        if (xaVar == null) {
            this.f22511f = u1Var.build();
            onChanged();
        } else {
            xaVar.setMessage(u1Var.build());
        }
        this.f22508b |= 4;
        return this;
    }

    public q1 mergeFrom(r1 r1Var) {
        if (r1Var == r1.getDefaultInstance()) {
            return this;
        }
        if (r1Var.hasName()) {
            this.f22508b |= 1;
            this.f22509c = r1Var.f22534c;
            onChanged();
        }
        if (r1Var.hasNumber()) {
            setNumber(r1Var.getNumber());
        }
        if (r1Var.hasOptions()) {
            mergeOptions(r1Var.getOptions());
        }
        mergeUnknownFields(r1Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.q1 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.p1 r1 = com.explorestack.protobuf.r1.f22532i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.r1 r3 = (com.explorestack.protobuf.r1) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.r1 r4 = (com.explorestack.protobuf.r1) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.q1.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.q1");
    }
}
