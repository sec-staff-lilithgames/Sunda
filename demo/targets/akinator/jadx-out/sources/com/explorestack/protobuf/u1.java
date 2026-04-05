package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u1 extends q6 implements w1 {

    /* renamed from: c, reason: collision with root package name */
    public int f22691c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22692e;

    /* renamed from: f, reason: collision with root package name */
    public List f22693f;

    /* renamed from: g, reason: collision with root package name */
    public pa f22694g;

    public u1() {
        super(null);
        this.f22693f = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            j();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.I;
    }

    public u1 addAllUninterpretedOption(Iterable<? extends v4> iterable) {
        pa paVar = this.f22694g;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22693f);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 addExtension(e6 e6Var, Object obj) {
        return addExtension(e6Var, (e6) obj);
    }

    public u1 addUninterpretedOption(v4 v4Var) {
        pa paVar = this.f22694g;
        if (paVar != null) {
            paVar.addMessage(v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22693f.add(v4Var);
        onChanged();
        return this;
    }

    public q4 addUninterpretedOptionBuilder() {
        return (q4) j().addBuilder(v4.getDefaultInstance());
    }

    public u1 clearDeprecated() {
        this.f22691c &= -2;
        this.f22692e = false;
        onChanged();
        return this;
    }

    public u1 clearUninterpretedOption() {
        pa paVar = this.f22694g;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22693f = Collections.EMPTY_LIST;
        this.f22691c &= -3;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.w1
    public boolean getDeprecated() {
        return this.f22692e;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.I;
    }

    @Override // com.explorestack.protobuf.w1
    public v4 getUninterpretedOption(int i10) {
        pa paVar = this.f22694g;
        return paVar == null ? (v4) this.f22693f.get(i10) : (v4) paVar.getMessage(i10);
    }

    public q4 getUninterpretedOptionBuilder(int i10) {
        return (q4) j().getBuilder(i10);
    }

    public List<q4> getUninterpretedOptionBuilderList() {
        return j().getBuilderList();
    }

    @Override // com.explorestack.protobuf.w1
    public int getUninterpretedOptionCount() {
        pa paVar = this.f22694g;
        return paVar == null ? this.f22693f.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.w1
    public List<v4> getUninterpretedOptionList() {
        pa paVar = this.f22694g;
        return paVar == null ? Collections.unmodifiableList(this.f22693f) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.w1
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        pa paVar = this.f22694g;
        return paVar == null ? (w4) this.f22693f.get(i10) : (w4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.w1
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        pa paVar = this.f22694g;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22693f);
    }

    @Override // com.explorestack.protobuf.w1
    public boolean hasDeprecated() {
        return (this.f22691c & 1) != 0;
    }

    public final void i() {
        if ((this.f22691c & 2) == 0) {
            this.f22693f = new ArrayList(this.f22693f);
            this.f22691c |= 2;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.J.ensureFieldAccessorsInitialized(v1.class, u1.class);
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
        if (this.f22694g == null) {
            this.f22694g = new pa(this.f22693f, (this.f22691c & 2) != 0, getParentForChildren(), isClean());
            this.f22693f = null;
        }
        return this.f22694g;
    }

    public u1 removeUninterpretedOption(int i10) {
        pa paVar = this.f22694g;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22693f.remove(i10);
        onChanged();
        return this;
    }

    public u1 setDeprecated(boolean z10) {
        this.f22691c |= 1;
        this.f22692e = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, int i10, Object obj) {
        return setExtension(e6Var, i10, (int) obj);
    }

    public u1 setUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22694g;
        if (paVar != null) {
            paVar.setMessage(i10, v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22693f.set(i10, v4Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> u1 addExtension(e6 e6Var, Type type) {
        return (u1) super.addExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> u1 clearExtension(e6 e6Var) {
        return (u1) super.clearExtension(e6Var);
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, Object obj) {
        return setExtension(e6Var, (e6) obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public v1 build() {
        v1 v1VarBuildPartial = buildPartial();
        if (v1VarBuildPartial.isInitialized()) {
            return v1VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) v1VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public v1 buildPartial() {
        int i10;
        v1 v1Var = new v1(this);
        v1Var.f22755g = (byte) -1;
        int i11 = this.f22691c;
        if ((i11 & 1) != 0) {
            v1Var.f22753e = this.f22692e;
            i10 = 1;
        } else {
            i10 = 0;
        }
        pa paVar = this.f22694g;
        if (paVar == null) {
            if ((i11 & 2) != 0) {
                this.f22693f = Collections.unmodifiableList(this.f22693f);
                this.f22691c &= -3;
            }
            v1Var.f22754f = this.f22693f;
        } else {
            v1Var.f22754f = paVar.build();
        }
        v1Var.f22752c = i10;
        onBuilt();
        return v1Var;
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public v1 getDefaultInstanceForType() {
        return v1.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> u1 setExtension(e6 e6Var, Type type) {
        return (u1) super.setExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final u1 setUnknownFields(gc gcVar) {
        return (u1) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public u1 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (u1) super.addRepeatedField(fieldDescriptor, obj);
    }

    public q4 addUninterpretedOptionBuilder(int i10) {
        return (q4) j().addBuilder(i10, v4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public u1 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (u1) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public u1 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (u1) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final u1 mergeUnknownFields(gc gcVar) {
        return (u1) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> u1 setExtension(e6 e6Var, int i10, Type type) {
        return (u1) super.setExtension(e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public u1 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (u1) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public u1 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (u1) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public u1 clear() {
        super.clear();
        this.f22692e = false;
        int i10 = this.f22691c;
        this.f22691c = i10 & (-2);
        pa paVar = this.f22694g;
        if (paVar == null) {
            this.f22693f = Collections.EMPTY_LIST;
            this.f22691c = i10 & (-4);
            return this;
        }
        paVar.clear();
        return this;
    }

    public u1 addUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22694g;
        if (paVar == null) {
            v4Var.getClass();
            i();
            this.f22693f.add(i10, v4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public u1 mo500clone() {
        return (u1) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public u1 mergeFrom(Message message) {
        if (message instanceof v1) {
            return mergeFrom((v1) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public u1 setUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22694g;
        if (paVar == null) {
            i();
            this.f22693f.set(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q4Var.build());
        return this;
    }

    public u1 mergeFrom(v1 v1Var) {
        if (v1Var == v1.getDefaultInstance()) {
            return this;
        }
        if (v1Var.hasDeprecated()) {
            setDeprecated(v1Var.getDeprecated());
        }
        if (this.f22694g == null) {
            if (!v1Var.f22754f.isEmpty()) {
                if (this.f22693f.isEmpty()) {
                    this.f22693f = v1Var.f22754f;
                    this.f22691c &= -3;
                } else {
                    i();
                    this.f22693f.addAll(v1Var.f22754f);
                }
                onChanged();
            }
        } else if (!v1Var.f22754f.isEmpty()) {
            if (this.f22694g.isEmpty()) {
                this.f22694g.dispose();
                this.f22694g = null;
                this.f22693f = v1Var.f22754f;
                this.f22691c &= -3;
                this.f22694g = k7.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f22694g.addAllMessages(v1Var.f22754f);
            }
        }
        f(v1Var);
        mergeUnknownFields(v1Var.unknownFields);
        onChanged();
        return this;
    }

    public u1 addUninterpretedOption(q4 q4Var) {
        pa paVar = this.f22694g;
        if (paVar == null) {
            i();
            this.f22693f.add(q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q4Var.build());
        return this;
    }

    public u1 addUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22694g;
        if (paVar == null) {
            i();
            this.f22693f.add(i10, q4Var.build());
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
    public com.explorestack.protobuf.u1 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.t1 r1 = com.explorestack.protobuf.v1.f22751i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.v1 r3 = (com.explorestack.protobuf.v1) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.v1 r4 = (com.explorestack.protobuf.v1) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.u1.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.u1");
    }
}
