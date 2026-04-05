package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n3 extends q6 implements q3 {

    /* renamed from: c, reason: collision with root package name */
    public int f22394c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22395e;

    /* renamed from: f, reason: collision with root package name */
    public int f22396f;

    /* renamed from: g, reason: collision with root package name */
    public List f22397g;

    /* renamed from: h, reason: collision with root package name */
    public pa f22398h;

    public n3() {
        super(null);
        this.f22396f = 0;
        this.f22397g = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            j();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.M;
    }

    public n3 addAllUninterpretedOption(Iterable<? extends v4> iterable) {
        pa paVar = this.f22398h;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22397g);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 addExtension(e6 e6Var, Object obj) {
        return addExtension(e6Var, (e6) obj);
    }

    public n3 addUninterpretedOption(v4 v4Var) {
        pa paVar = this.f22398h;
        if (paVar != null) {
            paVar.addMessage(v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22397g.add(v4Var);
        onChanged();
        return this;
    }

    public q4 addUninterpretedOptionBuilder() {
        return (q4) j().addBuilder(v4.getDefaultInstance());
    }

    public n3 clearDeprecated() {
        this.f22394c &= -2;
        this.f22395e = false;
        onChanged();
        return this;
    }

    public n3 clearIdempotencyLevel() {
        this.f22394c &= -3;
        this.f22396f = 0;
        onChanged();
        return this;
    }

    public n3 clearUninterpretedOption() {
        pa paVar = this.f22398h;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22397g = Collections.EMPTY_LIST;
        this.f22394c &= -5;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q3
    public boolean getDeprecated() {
        return this.f22395e;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.M;
    }

    @Override // com.explorestack.protobuf.q3
    public DescriptorProtos$MethodOptions$IdempotencyLevel getIdempotencyLevel() {
        DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevelValueOf = DescriptorProtos$MethodOptions$IdempotencyLevel.valueOf(this.f22396f);
        return descriptorProtos$MethodOptions$IdempotencyLevelValueOf == null ? DescriptorProtos$MethodOptions$IdempotencyLevel.IDEMPOTENCY_UNKNOWN : descriptorProtos$MethodOptions$IdempotencyLevelValueOf;
    }

    @Override // com.explorestack.protobuf.q3
    public v4 getUninterpretedOption(int i10) {
        pa paVar = this.f22398h;
        return paVar == null ? (v4) this.f22397g.get(i10) : (v4) paVar.getMessage(i10);
    }

    public q4 getUninterpretedOptionBuilder(int i10) {
        return (q4) j().getBuilder(i10);
    }

    public List<q4> getUninterpretedOptionBuilderList() {
        return j().getBuilderList();
    }

    @Override // com.explorestack.protobuf.q3
    public int getUninterpretedOptionCount() {
        pa paVar = this.f22398h;
        return paVar == null ? this.f22397g.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.q3
    public List<v4> getUninterpretedOptionList() {
        pa paVar = this.f22398h;
        return paVar == null ? Collections.unmodifiableList(this.f22397g) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.q3
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        pa paVar = this.f22398h;
        return paVar == null ? (w4) this.f22397g.get(i10) : (w4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.q3
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        pa paVar = this.f22398h;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22397g);
    }

    @Override // com.explorestack.protobuf.q3
    public boolean hasDeprecated() {
        return (this.f22394c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.q3
    public boolean hasIdempotencyLevel() {
        return (this.f22394c & 2) != 0;
    }

    public final void i() {
        if ((this.f22394c & 4) == 0) {
            this.f22397g = new ArrayList(this.f22397g);
            this.f22394c |= 4;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.N.ensureFieldAccessorsInitialized(p3.class, n3.class);
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
        if (this.f22398h == null) {
            this.f22398h = new pa(this.f22397g, (this.f22394c & 4) != 0, getParentForChildren(), isClean());
            this.f22397g = null;
        }
        return this.f22398h;
    }

    public n3 removeUninterpretedOption(int i10) {
        pa paVar = this.f22398h;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22397g.remove(i10);
        onChanged();
        return this;
    }

    public n3 setDeprecated(boolean z10) {
        this.f22394c |= 1;
        this.f22395e = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, int i10, Object obj) {
        return setExtension(e6Var, i10, (int) obj);
    }

    public n3 setIdempotencyLevel(DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel) {
        descriptorProtos$MethodOptions$IdempotencyLevel.getClass();
        this.f22394c |= 2;
        this.f22396f = descriptorProtos$MethodOptions$IdempotencyLevel.getNumber();
        onChanged();
        return this;
    }

    public n3 setUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22398h;
        if (paVar != null) {
            paVar.setMessage(i10, v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22397g.set(i10, v4Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> n3 addExtension(e6 e6Var, Type type) {
        return (n3) super.addExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> n3 clearExtension(e6 e6Var) {
        return (n3) super.clearExtension(e6Var);
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, Object obj) {
        return setExtension(e6Var, (e6) obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public p3 build() {
        p3 p3VarBuildPartial = buildPartial();
        if (p3VarBuildPartial.isInitialized()) {
            return p3VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) p3VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public p3 buildPartial() {
        int i10;
        p3 p3Var = new p3(this);
        p3Var.f22487h = (byte) -1;
        int i11 = this.f22394c;
        if ((i11 & 1) != 0) {
            p3Var.f22484e = this.f22395e;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 |= 2;
        }
        p3Var.f22485f = this.f22396f;
        pa paVar = this.f22398h;
        if (paVar == null) {
            if ((i11 & 4) != 0) {
                this.f22397g = Collections.unmodifiableList(this.f22397g);
                this.f22394c &= -5;
            }
            p3Var.f22486g = this.f22397g;
        } else {
            p3Var.f22486g = paVar.build();
        }
        p3Var.f22483c = i10;
        onBuilt();
        return p3Var;
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public p3 getDefaultInstanceForType() {
        return p3.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> n3 setExtension(e6 e6Var, Type type) {
        return (n3) super.setExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final n3 setUnknownFields(gc gcVar) {
        return (n3) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public n3 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (n3) super.addRepeatedField(fieldDescriptor, obj);
    }

    public q4 addUninterpretedOptionBuilder(int i10) {
        return (q4) j().addBuilder(i10, v4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public n3 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (n3) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public n3 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (n3) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final n3 mergeUnknownFields(gc gcVar) {
        return (n3) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> n3 setExtension(e6 e6Var, int i10, Type type) {
        return (n3) super.setExtension(e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public n3 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (n3) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public n3 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (n3) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public n3 clear() {
        super.clear();
        this.f22395e = false;
        int i10 = this.f22394c;
        this.f22396f = 0;
        this.f22394c = i10 & (-4);
        pa paVar = this.f22398h;
        if (paVar == null) {
            this.f22397g = Collections.EMPTY_LIST;
            this.f22394c = i10 & (-8);
            return this;
        }
        paVar.clear();
        return this;
    }

    public n3 addUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22398h;
        if (paVar == null) {
            v4Var.getClass();
            i();
            this.f22397g.add(i10, v4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public n3 mo500clone() {
        return (n3) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public n3 mergeFrom(Message message) {
        if (message instanceof p3) {
            return mergeFrom((p3) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public n3 setUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22398h;
        if (paVar == null) {
            i();
            this.f22397g.set(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q4Var.build());
        return this;
    }

    public n3 mergeFrom(p3 p3Var) {
        if (p3Var == p3.getDefaultInstance()) {
            return this;
        }
        if (p3Var.hasDeprecated()) {
            setDeprecated(p3Var.getDeprecated());
        }
        if (p3Var.hasIdempotencyLevel()) {
            setIdempotencyLevel(p3Var.getIdempotencyLevel());
        }
        if (this.f22398h == null) {
            if (!p3Var.f22486g.isEmpty()) {
                if (this.f22397g.isEmpty()) {
                    this.f22397g = p3Var.f22486g;
                    this.f22394c &= -5;
                } else {
                    i();
                    this.f22397g.addAll(p3Var.f22486g);
                }
                onChanged();
            }
        } else if (!p3Var.f22486g.isEmpty()) {
            if (this.f22398h.isEmpty()) {
                this.f22398h.dispose();
                this.f22398h = null;
                this.f22397g = p3Var.f22486g;
                this.f22394c &= -5;
                this.f22398h = k7.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f22398h.addAllMessages(p3Var.f22486g);
            }
        }
        f(p3Var);
        mergeUnknownFields(p3Var.unknownFields);
        onChanged();
        return this;
    }

    public n3 addUninterpretedOption(q4 q4Var) {
        pa paVar = this.f22398h;
        if (paVar == null) {
            i();
            this.f22397g.add(q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q4Var.build());
        return this;
    }

    public n3 addUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22398h;
        if (paVar == null) {
            i();
            this.f22397g.add(i10, q4Var.build());
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
    public com.explorestack.protobuf.n3 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.m3 r1 = com.explorestack.protobuf.p3.f22482j     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.p3 r3 = (com.explorestack.protobuf.p3) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.p3 r4 = (com.explorestack.protobuf.p3) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.n3.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.n3");
    }
}
