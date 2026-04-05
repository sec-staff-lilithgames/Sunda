package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w3 extends q6 implements y3 {

    /* renamed from: c, reason: collision with root package name */
    public int f22793c;

    /* renamed from: e, reason: collision with root package name */
    public List f22794e;

    /* renamed from: f, reason: collision with root package name */
    public pa f22795f;

    public w3() {
        super(null);
        this.f22794e = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            j();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.E;
    }

    public w3 addAllUninterpretedOption(Iterable<? extends v4> iterable) {
        pa paVar = this.f22795f;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22794e);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 addExtension(e6 e6Var, Object obj) {
        return addExtension(e6Var, (e6) obj);
    }

    public w3 addUninterpretedOption(v4 v4Var) {
        pa paVar = this.f22795f;
        if (paVar != null) {
            paVar.addMessage(v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22794e.add(v4Var);
        onChanged();
        return this;
    }

    public q4 addUninterpretedOptionBuilder() {
        return (q4) j().addBuilder(v4.getDefaultInstance());
    }

    public w3 clearUninterpretedOption() {
        pa paVar = this.f22795f;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22794e = Collections.EMPTY_LIST;
        this.f22793c &= -2;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.E;
    }

    @Override // com.explorestack.protobuf.y3
    public v4 getUninterpretedOption(int i10) {
        pa paVar = this.f22795f;
        return paVar == null ? (v4) this.f22794e.get(i10) : (v4) paVar.getMessage(i10);
    }

    public q4 getUninterpretedOptionBuilder(int i10) {
        return (q4) j().getBuilder(i10);
    }

    public List<q4> getUninterpretedOptionBuilderList() {
        return j().getBuilderList();
    }

    @Override // com.explorestack.protobuf.y3
    public int getUninterpretedOptionCount() {
        pa paVar = this.f22795f;
        return paVar == null ? this.f22794e.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.y3
    public List<v4> getUninterpretedOptionList() {
        pa paVar = this.f22795f;
        return paVar == null ? Collections.unmodifiableList(this.f22794e) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.y3
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        pa paVar = this.f22795f;
        return paVar == null ? (w4) this.f22794e.get(i10) : (w4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.y3
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        pa paVar = this.f22795f;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22794e);
    }

    public final void i() {
        if ((this.f22793c & 1) == 0) {
            this.f22794e = new ArrayList(this.f22794e);
            this.f22793c |= 1;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.F.ensureFieldAccessorsInitialized(x3.class, w3.class);
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
        if (this.f22795f == null) {
            this.f22795f = new pa(this.f22794e, (this.f22793c & 1) != 0, getParentForChildren(), isClean());
            this.f22794e = null;
        }
        return this.f22795f;
    }

    public w3 removeUninterpretedOption(int i10) {
        pa paVar = this.f22795f;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22794e.remove(i10);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, int i10, Object obj) {
        return setExtension(e6Var, i10, (int) obj);
    }

    public w3 setUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22795f;
        if (paVar != null) {
            paVar.setMessage(i10, v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22794e.set(i10, v4Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> w3 addExtension(e6 e6Var, Type type) {
        return (w3) super.addExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> w3 clearExtension(e6 e6Var) {
        return (w3) super.clearExtension(e6Var);
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, Object obj) {
        return setExtension(e6Var, (e6) obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public x3 build() {
        x3 x3VarBuildPartial = buildPartial();
        if (x3VarBuildPartial.isInitialized()) {
            return x3VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) x3VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public x3 buildPartial() {
        x3 x3Var = new x3(this);
        x3Var.f22832e = (byte) -1;
        int i10 = this.f22793c;
        pa paVar = this.f22795f;
        if (paVar == null) {
            if ((i10 & 1) != 0) {
                this.f22794e = Collections.unmodifiableList(this.f22794e);
                this.f22793c &= -2;
            }
            x3Var.f22831c = this.f22794e;
        } else {
            x3Var.f22831c = paVar.build();
        }
        onBuilt();
        return x3Var;
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public x3 getDefaultInstanceForType() {
        return x3.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> w3 setExtension(e6 e6Var, Type type) {
        return (w3) super.setExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final w3 setUnknownFields(gc gcVar) {
        return (w3) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public w3 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (w3) super.addRepeatedField(fieldDescriptor, obj);
    }

    public q4 addUninterpretedOptionBuilder(int i10) {
        return (q4) j().addBuilder(i10, v4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public w3 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (w3) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public w3 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (w3) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final w3 mergeUnknownFields(gc gcVar) {
        return (w3) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> w3 setExtension(e6 e6Var, int i10, Type type) {
        return (w3) super.setExtension(e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public w3 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (w3) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public w3 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (w3) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public w3 clear() {
        super.clear();
        pa paVar = this.f22795f;
        if (paVar == null) {
            this.f22794e = Collections.EMPTY_LIST;
            this.f22793c &= -2;
            return this;
        }
        paVar.clear();
        return this;
    }

    public w3 addUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22795f;
        if (paVar == null) {
            v4Var.getClass();
            i();
            this.f22794e.add(i10, v4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public w3 mo500clone() {
        return (w3) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public w3 mergeFrom(Message message) {
        if (message instanceof x3) {
            return mergeFrom((x3) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public w3 setUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22795f;
        if (paVar == null) {
            i();
            this.f22794e.set(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q4Var.build());
        return this;
    }

    public w3 mergeFrom(x3 x3Var) {
        if (x3Var == x3.getDefaultInstance()) {
            return this;
        }
        if (this.f22795f == null) {
            if (!x3Var.f22831c.isEmpty()) {
                if (this.f22794e.isEmpty()) {
                    this.f22794e = x3Var.f22831c;
                    this.f22793c &= -2;
                } else {
                    i();
                    this.f22794e.addAll(x3Var.f22831c);
                }
                onChanged();
            }
        } else if (!x3Var.f22831c.isEmpty()) {
            if (this.f22795f.isEmpty()) {
                this.f22795f.dispose();
                this.f22795f = null;
                this.f22794e = x3Var.f22831c;
                this.f22793c &= -2;
                this.f22795f = k7.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f22795f.addAllMessages(x3Var.f22831c);
            }
        }
        f(x3Var);
        mergeUnknownFields(x3Var.unknownFields);
        onChanged();
        return this;
    }

    public w3 addUninterpretedOption(q4 q4Var) {
        pa paVar = this.f22795f;
        if (paVar == null) {
            i();
            this.f22794e.add(q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q4Var.build());
        return this;
    }

    public w3 addUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22795f;
        if (paVar == null) {
            i();
            this.f22794e.add(i10, q4Var.build());
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
    public com.explorestack.protobuf.w3 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.v3 r1 = com.explorestack.protobuf.x3.f22830g     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.x3 r3 = (com.explorestack.protobuf.x3) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.x3 r4 = (com.explorestack.protobuf.x3) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.w3.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.w3");
    }
}
