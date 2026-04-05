package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y1 extends q6 implements a2 {

    /* renamed from: c, reason: collision with root package name */
    public int f22902c;

    /* renamed from: e, reason: collision with root package name */
    public List f22903e;

    /* renamed from: f, reason: collision with root package name */
    public pa f22904f;

    public y1() {
        super(null);
        this.f22903e = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            j();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22842i;
    }

    public y1 addAllUninterpretedOption(Iterable<? extends v4> iterable) {
        pa paVar = this.f22904f;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22903e);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 addExtension(e6 e6Var, Object obj) {
        return addExtension(e6Var, (e6) obj);
    }

    public y1 addUninterpretedOption(v4 v4Var) {
        pa paVar = this.f22904f;
        if (paVar != null) {
            paVar.addMessage(v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22903e.add(v4Var);
        onChanged();
        return this;
    }

    public q4 addUninterpretedOptionBuilder() {
        return (q4) j().addBuilder(v4.getDefaultInstance());
    }

    public y1 clearUninterpretedOption() {
        pa paVar = this.f22904f;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22903e = Collections.EMPTY_LIST;
        this.f22902c &= -2;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22842i;
    }

    @Override // com.explorestack.protobuf.a2
    public v4 getUninterpretedOption(int i10) {
        pa paVar = this.f22904f;
        return paVar == null ? (v4) this.f22903e.get(i10) : (v4) paVar.getMessage(i10);
    }

    public q4 getUninterpretedOptionBuilder(int i10) {
        return (q4) j().getBuilder(i10);
    }

    public List<q4> getUninterpretedOptionBuilderList() {
        return j().getBuilderList();
    }

    @Override // com.explorestack.protobuf.a2
    public int getUninterpretedOptionCount() {
        pa paVar = this.f22904f;
        return paVar == null ? this.f22903e.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.a2
    public List<v4> getUninterpretedOptionList() {
        pa paVar = this.f22904f;
        return paVar == null ? Collections.unmodifiableList(this.f22903e) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.a2
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        pa paVar = this.f22904f;
        return paVar == null ? (w4) this.f22903e.get(i10) : (w4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.a2
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        pa paVar = this.f22904f;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22903e);
    }

    public final void i() {
        if ((this.f22902c & 1) == 0) {
            this.f22903e = new ArrayList(this.f22903e);
            this.f22902c |= 1;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22843j.ensureFieldAccessorsInitialized(z1.class, y1.class);
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
        if (this.f22904f == null) {
            this.f22904f = new pa(this.f22903e, (this.f22902c & 1) != 0, getParentForChildren(), isClean());
            this.f22903e = null;
        }
        return this.f22904f;
    }

    public y1 removeUninterpretedOption(int i10) {
        pa paVar = this.f22904f;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22903e.remove(i10);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, int i10, Object obj) {
        return setExtension(e6Var, i10, (int) obj);
    }

    public y1 setUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22904f;
        if (paVar != null) {
            paVar.setMessage(i10, v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22903e.set(i10, v4Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> y1 addExtension(e6 e6Var, Type type) {
        return (y1) super.addExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> y1 clearExtension(e6 e6Var) {
        return (y1) super.clearExtension(e6Var);
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, Object obj) {
        return setExtension(e6Var, (e6) obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public z1 build() {
        z1 z1VarBuildPartial = buildPartial();
        if (z1VarBuildPartial.isInitialized()) {
            return z1VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) z1VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public z1 buildPartial() {
        z1 z1Var = new z1(this);
        z1Var.f22938e = (byte) -1;
        int i10 = this.f22902c;
        pa paVar = this.f22904f;
        if (paVar == null) {
            if ((i10 & 1) != 0) {
                this.f22903e = Collections.unmodifiableList(this.f22903e);
                this.f22902c &= -2;
            }
            z1Var.f22937c = this.f22903e;
        } else {
            z1Var.f22937c = paVar.build();
        }
        onBuilt();
        return z1Var;
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public z1 getDefaultInstanceForType() {
        return z1.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> y1 setExtension(e6 e6Var, Type type) {
        return (y1) super.setExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final y1 setUnknownFields(gc gcVar) {
        return (y1) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y1 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (y1) super.addRepeatedField(fieldDescriptor, obj);
    }

    public q4 addUninterpretedOptionBuilder(int i10) {
        return (q4) j().addBuilder(i10, v4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y1 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (y1) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public y1 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (y1) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final y1 mergeUnknownFields(gc gcVar) {
        return (y1) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> y1 setExtension(e6 e6Var, int i10, Type type) {
        return (y1) super.setExtension(e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y1 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (y1) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y1 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (y1) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public y1 clear() {
        super.clear();
        pa paVar = this.f22904f;
        if (paVar == null) {
            this.f22903e = Collections.EMPTY_LIST;
            this.f22902c &= -2;
            return this;
        }
        paVar.clear();
        return this;
    }

    public y1 addUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22904f;
        if (paVar == null) {
            v4Var.getClass();
            i();
            this.f22903e.add(i10, v4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public y1 mo500clone() {
        return (y1) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public y1 mergeFrom(Message message) {
        if (message instanceof z1) {
            return mergeFrom((z1) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public y1 setUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22904f;
        if (paVar == null) {
            i();
            this.f22903e.set(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q4Var.build());
        return this;
    }

    public y1 mergeFrom(z1 z1Var) {
        if (z1Var == z1.getDefaultInstance()) {
            return this;
        }
        if (this.f22904f == null) {
            if (!z1Var.f22937c.isEmpty()) {
                if (this.f22903e.isEmpty()) {
                    this.f22903e = z1Var.f22937c;
                    this.f22902c &= -2;
                } else {
                    i();
                    this.f22903e.addAll(z1Var.f22937c);
                }
                onChanged();
            }
        } else if (!z1Var.f22937c.isEmpty()) {
            if (this.f22904f.isEmpty()) {
                this.f22904f.dispose();
                this.f22904f = null;
                this.f22903e = z1Var.f22937c;
                this.f22902c &= -2;
                this.f22904f = k7.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f22904f.addAllMessages(z1Var.f22937c);
            }
        }
        f(z1Var);
        mergeUnknownFields(z1Var.unknownFields);
        onChanged();
        return this;
    }

    public y1 addUninterpretedOption(q4 q4Var) {
        pa paVar = this.f22904f;
        if (paVar == null) {
            i();
            this.f22903e.add(q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q4Var.build());
        return this;
    }

    public y1 addUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22904f;
        if (paVar == null) {
            i();
            this.f22903e.add(i10, q4Var.build());
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
    public com.explorestack.protobuf.y1 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.x1 r1 = com.explorestack.protobuf.z1.f22936g     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.z1 r3 = (com.explorestack.protobuf.z1) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.z1 r4 = (com.explorestack.protobuf.z1) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.y1.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.y1");
    }
}
