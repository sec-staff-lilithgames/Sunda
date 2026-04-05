package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 extends o6 implements w0 {

    /* renamed from: b, reason: collision with root package name */
    public int f22686b;

    /* renamed from: c, reason: collision with root package name */
    public int f22687c;

    /* renamed from: e, reason: collision with root package name */
    public int f22688e;

    /* renamed from: f, reason: collision with root package name */
    public z1 f22689f;

    /* renamed from: g, reason: collision with root package name */
    public xa f22690g;

    public u0() {
        super(null);
        if (k7.alwaysUseFieldBuilders && this.f22690g == null) {
            this.f22690g = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22689f = null;
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22838e;
    }

    public u0 clearEnd() {
        this.f22686b &= -3;
        this.f22688e = 0;
        onChanged();
        return this;
    }

    public u0 clearOptions() {
        xa xaVar = this.f22690g;
        if (xaVar == null) {
            this.f22689f = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f22686b &= -5;
        return this;
    }

    public u0 clearStart() {
        this.f22686b &= -2;
        this.f22687c = 0;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22838e;
    }

    @Override // com.explorestack.protobuf.w0
    public int getEnd() {
        return this.f22688e;
    }

    @Override // com.explorestack.protobuf.w0
    public z1 getOptions() {
        xa xaVar = this.f22690g;
        if (xaVar != null) {
            return (z1) xaVar.getMessage();
        }
        z1 z1Var = this.f22689f;
        return z1Var == null ? z1.getDefaultInstance() : z1Var;
    }

    public y1 getOptionsBuilder() {
        this.f22686b |= 4;
        onChanged();
        if (this.f22690g == null) {
            this.f22690g = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22689f = null;
        }
        return (y1) this.f22690g.getBuilder();
    }

    @Override // com.explorestack.protobuf.w0
    public a2 getOptionsOrBuilder() {
        xa xaVar = this.f22690g;
        if (xaVar != null) {
            return (a2) xaVar.getMessageOrBuilder();
        }
        z1 z1Var = this.f22689f;
        return z1Var == null ? z1.getDefaultInstance() : z1Var;
    }

    @Override // com.explorestack.protobuf.w0
    public int getStart() {
        return this.f22687c;
    }

    @Override // com.explorestack.protobuf.w0
    public boolean hasEnd() {
        return (this.f22686b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.w0
    public boolean hasOptions() {
        return (this.f22686b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.w0
    public boolean hasStart() {
        return (this.f22686b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22839f.ensureFieldAccessorsInitialized(v0.class, u0.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return !hasOptions() || getOptions().isInitialized();
    }

    public u0 mergeOptions(z1 z1Var) {
        z1 z1Var2;
        xa xaVar = this.f22690g;
        if (xaVar == null) {
            if ((this.f22686b & 4) == 0 || (z1Var2 = this.f22689f) == null || z1Var2 == z1.getDefaultInstance()) {
                this.f22689f = z1Var;
            } else {
                this.f22689f = z1.newBuilder(this.f22689f).mergeFrom(z1Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(z1Var);
        }
        this.f22686b |= 4;
        return this;
    }

    public u0 setEnd(int i10) {
        this.f22686b |= 2;
        this.f22688e = i10;
        onChanged();
        return this;
    }

    public u0 setOptions(z1 z1Var) {
        xa xaVar = this.f22690g;
        if (xaVar == null) {
            z1Var.getClass();
            this.f22689f = z1Var;
            onChanged();
        } else {
            xaVar.setMessage(z1Var);
        }
        this.f22686b |= 4;
        return this;
    }

    public u0 setStart(int i10) {
        this.f22686b |= 1;
        this.f22687c = i10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public u0 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (u0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public v0 build() {
        v0 v0VarBuildPartial = buildPartial();
        if (v0VarBuildPartial.isInitialized()) {
            return v0VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) v0VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public v0 buildPartial() {
        int i10;
        v0 v0Var = new v0(this);
        v0Var.f22749g = (byte) -1;
        int i11 = this.f22686b;
        if ((i11 & 1) != 0) {
            v0Var.f22746c = this.f22687c;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            v0Var.f22747e = this.f22688e;
            i10 |= 2;
        }
        if ((i11 & 4) != 0) {
            xa xaVar = this.f22690g;
            if (xaVar == null) {
                v0Var.f22748f = this.f22689f;
            } else {
                v0Var.f22748f = (z1) xaVar.build();
            }
            i10 |= 4;
        }
        v0Var.f22745b = i10;
        onBuilt();
        return v0Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public u0 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (u0) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public v0 getDefaultInstanceForType() {
        return v0.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public u0 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (u0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public u0 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (u0) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final u0 setUnknownFields(gc gcVar) {
        return (u0) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public u0 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (u0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final u0 mergeUnknownFields(gc gcVar) {
        return (u0) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public u0 clear() {
        super.clear();
        this.f22687c = 0;
        int i10 = this.f22686b;
        this.f22688e = 0;
        this.f22686b = i10 & (-4);
        xa xaVar = this.f22690g;
        if (xaVar == null) {
            this.f22689f = null;
        } else {
            xaVar.clear();
        }
        this.f22686b &= -5;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public u0 mo500clone() {
        return (u0) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public u0 mergeFrom(Message message) {
        if (message instanceof v0) {
            return mergeFrom((v0) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public u0 setOptions(y1 y1Var) {
        xa xaVar = this.f22690g;
        if (xaVar == null) {
            this.f22689f = y1Var.build();
            onChanged();
        } else {
            xaVar.setMessage(y1Var.build());
        }
        this.f22686b |= 4;
        return this;
    }

    public u0 mergeFrom(v0 v0Var) {
        if (v0Var == v0.getDefaultInstance()) {
            return this;
        }
        if (v0Var.hasStart()) {
            setStart(v0Var.getStart());
        }
        if (v0Var.hasEnd()) {
            setEnd(v0Var.getEnd());
        }
        if (v0Var.hasOptions()) {
            mergeOptions(v0Var.getOptions());
        }
        mergeUnknownFields(v0Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.u0 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.t0 r1 = com.explorestack.protobuf.v0.f22744i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.v0 r3 = (com.explorestack.protobuf.v0) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.v0 r4 = (com.explorestack.protobuf.v0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.u0.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.u0");
    }
}
