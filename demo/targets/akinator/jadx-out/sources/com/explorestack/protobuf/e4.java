package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e4 extends q6 implements g4 {

    /* renamed from: c, reason: collision with root package name */
    public int f22076c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22077e;

    /* renamed from: f, reason: collision with root package name */
    public List f22078f;

    /* renamed from: g, reason: collision with root package name */
    public pa f22079g;

    public e4() {
        super(null);
        this.f22078f = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            j();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.K;
    }

    public e4 addAllUninterpretedOption(Iterable<? extends v4> iterable) {
        pa paVar = this.f22079g;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22078f);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 addExtension(e6 e6Var, Object obj) {
        return addExtension(e6Var, (e6) obj);
    }

    public e4 addUninterpretedOption(v4 v4Var) {
        pa paVar = this.f22079g;
        if (paVar != null) {
            paVar.addMessage(v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22078f.add(v4Var);
        onChanged();
        return this;
    }

    public q4 addUninterpretedOptionBuilder() {
        return (q4) j().addBuilder(v4.getDefaultInstance());
    }

    public e4 clearDeprecated() {
        this.f22076c &= -2;
        this.f22077e = false;
        onChanged();
        return this;
    }

    public e4 clearUninterpretedOption() {
        pa paVar = this.f22079g;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22078f = Collections.EMPTY_LIST;
        this.f22076c &= -3;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.g4
    public boolean getDeprecated() {
        return this.f22077e;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.K;
    }

    @Override // com.explorestack.protobuf.g4
    public v4 getUninterpretedOption(int i10) {
        pa paVar = this.f22079g;
        return paVar == null ? (v4) this.f22078f.get(i10) : (v4) paVar.getMessage(i10);
    }

    public q4 getUninterpretedOptionBuilder(int i10) {
        return (q4) j().getBuilder(i10);
    }

    public List<q4> getUninterpretedOptionBuilderList() {
        return j().getBuilderList();
    }

    @Override // com.explorestack.protobuf.g4
    public int getUninterpretedOptionCount() {
        pa paVar = this.f22079g;
        return paVar == null ? this.f22078f.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.g4
    public List<v4> getUninterpretedOptionList() {
        pa paVar = this.f22079g;
        return paVar == null ? Collections.unmodifiableList(this.f22078f) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.g4
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        pa paVar = this.f22079g;
        return paVar == null ? (w4) this.f22078f.get(i10) : (w4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.g4
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        pa paVar = this.f22079g;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22078f);
    }

    @Override // com.explorestack.protobuf.g4
    public boolean hasDeprecated() {
        return (this.f22076c & 1) != 0;
    }

    public final void i() {
        if ((this.f22076c & 2) == 0) {
            this.f22078f = new ArrayList(this.f22078f);
            this.f22076c |= 2;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.L.ensureFieldAccessorsInitialized(f4.class, e4.class);
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
        if (this.f22079g == null) {
            this.f22079g = new pa(this.f22078f, (this.f22076c & 2) != 0, getParentForChildren(), isClean());
            this.f22078f = null;
        }
        return this.f22079g;
    }

    public e4 removeUninterpretedOption(int i10) {
        pa paVar = this.f22079g;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22078f.remove(i10);
        onChanged();
        return this;
    }

    public e4 setDeprecated(boolean z10) {
        this.f22076c |= 1;
        this.f22077e = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, int i10, Object obj) {
        return setExtension(e6Var, i10, (int) obj);
    }

    public e4 setUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22079g;
        if (paVar != null) {
            paVar.setMessage(i10, v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22078f.set(i10, v4Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> e4 addExtension(e6 e6Var, Type type) {
        return (e4) super.addExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> e4 clearExtension(e6 e6Var) {
        return (e4) super.clearExtension(e6Var);
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, Object obj) {
        return setExtension(e6Var, (e6) obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public f4 build() {
        f4 f4VarBuildPartial = buildPartial();
        if (f4VarBuildPartial.isInitialized()) {
            return f4VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) f4VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public f4 buildPartial() {
        int i10;
        f4 f4Var = new f4(this);
        f4Var.f22131g = (byte) -1;
        int i11 = this.f22076c;
        if ((i11 & 1) != 0) {
            f4Var.f22129e = this.f22077e;
            i10 = 1;
        } else {
            i10 = 0;
        }
        pa paVar = this.f22079g;
        if (paVar == null) {
            if ((i11 & 2) != 0) {
                this.f22078f = Collections.unmodifiableList(this.f22078f);
                this.f22076c &= -3;
            }
            f4Var.f22130f = this.f22078f;
        } else {
            f4Var.f22130f = paVar.build();
        }
        f4Var.f22128c = i10;
        onBuilt();
        return f4Var;
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public f4 getDefaultInstanceForType() {
        return f4.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> e4 setExtension(e6 e6Var, Type type) {
        return (e4) super.setExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final e4 setUnknownFields(gc gcVar) {
        return (e4) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e4 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (e4) super.addRepeatedField(fieldDescriptor, obj);
    }

    public q4 addUninterpretedOptionBuilder(int i10) {
        return (q4) j().addBuilder(i10, v4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e4 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (e4) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public e4 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (e4) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final e4 mergeUnknownFields(gc gcVar) {
        return (e4) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> e4 setExtension(e6 e6Var, int i10, Type type) {
        return (e4) super.setExtension(e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e4 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (e4) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public e4 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (e4) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public e4 clear() {
        super.clear();
        this.f22077e = false;
        int i10 = this.f22076c;
        this.f22076c = i10 & (-2);
        pa paVar = this.f22079g;
        if (paVar == null) {
            this.f22078f = Collections.EMPTY_LIST;
            this.f22076c = i10 & (-4);
            return this;
        }
        paVar.clear();
        return this;
    }

    public e4 addUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22079g;
        if (paVar == null) {
            v4Var.getClass();
            i();
            this.f22078f.add(i10, v4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public e4 mo500clone() {
        return (e4) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public e4 mergeFrom(Message message) {
        if (message instanceof f4) {
            return mergeFrom((f4) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public e4 setUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22079g;
        if (paVar == null) {
            i();
            this.f22078f.set(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q4Var.build());
        return this;
    }

    public e4 mergeFrom(f4 f4Var) {
        if (f4Var == f4.getDefaultInstance()) {
            return this;
        }
        if (f4Var.hasDeprecated()) {
            setDeprecated(f4Var.getDeprecated());
        }
        if (this.f22079g == null) {
            if (!f4Var.f22130f.isEmpty()) {
                if (this.f22078f.isEmpty()) {
                    this.f22078f = f4Var.f22130f;
                    this.f22076c &= -3;
                } else {
                    i();
                    this.f22078f.addAll(f4Var.f22130f);
                }
                onChanged();
            }
        } else if (!f4Var.f22130f.isEmpty()) {
            if (this.f22079g.isEmpty()) {
                this.f22079g.dispose();
                this.f22079g = null;
                this.f22078f = f4Var.f22130f;
                this.f22076c &= -3;
                this.f22079g = k7.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f22079g.addAllMessages(f4Var.f22130f);
            }
        }
        f(f4Var);
        mergeUnknownFields(f4Var.unknownFields);
        onChanged();
        return this;
    }

    public e4 addUninterpretedOption(q4 q4Var) {
        pa paVar = this.f22079g;
        if (paVar == null) {
            i();
            this.f22078f.add(q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q4Var.build());
        return this;
    }

    public e4 addUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22079g;
        if (paVar == null) {
            i();
            this.f22078f.add(i10, q4Var.build());
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
    public com.explorestack.protobuf.e4 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.d4 r1 = com.explorestack.protobuf.f4.f22127i     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.f4 r3 = (com.explorestack.protobuf.f4) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.f4 r4 = (com.explorestack.protobuf.f4) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.e4.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.e4");
    }
}
