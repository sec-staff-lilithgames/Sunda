package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i2 extends q6 implements m2 {

    /* renamed from: c, reason: collision with root package name */
    public int f22215c;

    /* renamed from: e, reason: collision with root package name */
    public int f22216e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22217f;

    /* renamed from: g, reason: collision with root package name */
    public int f22218g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22219h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22220i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22221j;

    /* renamed from: k, reason: collision with root package name */
    public List f22222k;

    /* renamed from: l, reason: collision with root package name */
    public pa f22223l;

    public i2() {
        super(null);
        this.f22216e = 0;
        this.f22218g = 0;
        this.f22222k = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            j();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.C;
    }

    public i2 addAllUninterpretedOption(Iterable<? extends v4> iterable) {
        pa paVar = this.f22223l;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22222k);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 addExtension(e6 e6Var, Object obj) {
        return addExtension(e6Var, (e6) obj);
    }

    public i2 addUninterpretedOption(v4 v4Var) {
        pa paVar = this.f22223l;
        if (paVar != null) {
            paVar.addMessage(v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22222k.add(v4Var);
        onChanged();
        return this;
    }

    public q4 addUninterpretedOptionBuilder() {
        return (q4) j().addBuilder(v4.getDefaultInstance());
    }

    public i2 clearCtype() {
        this.f22215c &= -2;
        this.f22216e = 0;
        onChanged();
        return this;
    }

    public i2 clearDeprecated() {
        this.f22215c &= -17;
        this.f22220i = false;
        onChanged();
        return this;
    }

    public i2 clearJstype() {
        this.f22215c &= -5;
        this.f22218g = 0;
        onChanged();
        return this;
    }

    public i2 clearLazy() {
        this.f22215c &= -9;
        this.f22219h = false;
        onChanged();
        return this;
    }

    public i2 clearPacked() {
        this.f22215c &= -3;
        this.f22217f = false;
        onChanged();
        return this;
    }

    public i2 clearUninterpretedOption() {
        pa paVar = this.f22223l;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22222k = Collections.EMPTY_LIST;
        this.f22215c &= -65;
        onChanged();
        return this;
    }

    public i2 clearWeak() {
        this.f22215c &= -33;
        this.f22221j = false;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.m2
    public DescriptorProtos$FieldOptions$CType getCtype() {
        DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CTypeValueOf = DescriptorProtos$FieldOptions$CType.valueOf(this.f22216e);
        return descriptorProtos$FieldOptions$CTypeValueOf == null ? DescriptorProtos$FieldOptions$CType.STRING : descriptorProtos$FieldOptions$CTypeValueOf;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean getDeprecated() {
        return this.f22220i;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.C;
    }

    @Override // com.explorestack.protobuf.m2
    public DescriptorProtos$FieldOptions$JSType getJstype() {
        DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSTypeValueOf = DescriptorProtos$FieldOptions$JSType.valueOf(this.f22218g);
        return descriptorProtos$FieldOptions$JSTypeValueOf == null ? DescriptorProtos$FieldOptions$JSType.JS_NORMAL : descriptorProtos$FieldOptions$JSTypeValueOf;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean getLazy() {
        return this.f22219h;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean getPacked() {
        return this.f22217f;
    }

    @Override // com.explorestack.protobuf.m2
    public v4 getUninterpretedOption(int i10) {
        pa paVar = this.f22223l;
        return paVar == null ? (v4) this.f22222k.get(i10) : (v4) paVar.getMessage(i10);
    }

    public q4 getUninterpretedOptionBuilder(int i10) {
        return (q4) j().getBuilder(i10);
    }

    public List<q4> getUninterpretedOptionBuilderList() {
        return j().getBuilderList();
    }

    @Override // com.explorestack.protobuf.m2
    public int getUninterpretedOptionCount() {
        pa paVar = this.f22223l;
        return paVar == null ? this.f22222k.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.m2
    public List<v4> getUninterpretedOptionList() {
        pa paVar = this.f22223l;
        return paVar == null ? Collections.unmodifiableList(this.f22222k) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.m2
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        pa paVar = this.f22223l;
        return paVar == null ? (w4) this.f22222k.get(i10) : (w4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.m2
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        pa paVar = this.f22223l;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22222k);
    }

    @Override // com.explorestack.protobuf.m2
    public boolean getWeak() {
        return this.f22221j;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasCtype() {
        return (this.f22215c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasDeprecated() {
        return (this.f22215c & 16) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasJstype() {
        return (this.f22215c & 4) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasLazy() {
        return (this.f22215c & 8) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasPacked() {
        return (this.f22215c & 2) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasWeak() {
        return (this.f22215c & 32) != 0;
    }

    public final void i() {
        if ((this.f22215c & 64) == 0) {
            this.f22222k = new ArrayList(this.f22222k);
            this.f22215c |= 64;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.D.ensureFieldAccessorsInitialized(l2.class, i2.class);
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
        if (this.f22223l == null) {
            this.f22223l = new pa(this.f22222k, (this.f22215c & 64) != 0, getParentForChildren(), isClean());
            this.f22222k = null;
        }
        return this.f22223l;
    }

    public i2 removeUninterpretedOption(int i10) {
        pa paVar = this.f22223l;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22222k.remove(i10);
        onChanged();
        return this;
    }

    public i2 setCtype(DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CType) {
        descriptorProtos$FieldOptions$CType.getClass();
        this.f22215c |= 1;
        this.f22216e = descriptorProtos$FieldOptions$CType.getNumber();
        onChanged();
        return this;
    }

    public i2 setDeprecated(boolean z10) {
        this.f22215c |= 16;
        this.f22220i = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, int i10, Object obj) {
        return setExtension(e6Var, i10, (int) obj);
    }

    public i2 setJstype(DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSType) {
        descriptorProtos$FieldOptions$JSType.getClass();
        this.f22215c |= 4;
        this.f22218g = descriptorProtos$FieldOptions$JSType.getNumber();
        onChanged();
        return this;
    }

    public i2 setLazy(boolean z10) {
        this.f22215c |= 8;
        this.f22219h = z10;
        onChanged();
        return this;
    }

    public i2 setPacked(boolean z10) {
        this.f22215c |= 2;
        this.f22217f = z10;
        onChanged();
        return this;
    }

    public i2 setUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22223l;
        if (paVar != null) {
            paVar.setMessage(i10, v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22222k.set(i10, v4Var);
        onChanged();
        return this;
    }

    public i2 setWeak(boolean z10) {
        this.f22215c |= 32;
        this.f22221j = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> i2 addExtension(e6 e6Var, Type type) {
        return (i2) super.addExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> i2 clearExtension(e6 e6Var) {
        return (i2) super.clearExtension(e6Var);
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, Object obj) {
        return setExtension(e6Var, (e6) obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public l2 build() {
        l2 l2VarBuildPartial = buildPartial();
        if (l2VarBuildPartial.isInitialized()) {
            return l2VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) l2VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public l2 buildPartial() {
        l2 l2Var = new l2(this);
        l2Var.f22334l = (byte) -1;
        int i10 = this.f22215c;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        l2Var.f22327e = this.f22216e;
        if ((i10 & 2) != 0) {
            l2Var.f22328f = this.f22217f;
            i11 |= 2;
        }
        if ((i10 & 4) != 0) {
            i11 |= 4;
        }
        l2Var.f22329g = this.f22218g;
        if ((i10 & 8) != 0) {
            l2Var.f22330h = this.f22219h;
            i11 |= 8;
        }
        if ((i10 & 16) != 0) {
            l2Var.f22331i = this.f22220i;
            i11 |= 16;
        }
        if ((i10 & 32) != 0) {
            l2Var.f22332j = this.f22221j;
            i11 |= 32;
        }
        pa paVar = this.f22223l;
        if (paVar == null) {
            if ((i10 & 64) != 0) {
                this.f22222k = Collections.unmodifiableList(this.f22222k);
                this.f22215c &= -65;
            }
            l2Var.f22333k = this.f22222k;
        } else {
            l2Var.f22333k = paVar.build();
        }
        l2Var.f22326c = i11;
        onBuilt();
        return l2Var;
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public l2 getDefaultInstanceForType() {
        return l2.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> i2 setExtension(e6 e6Var, Type type) {
        return (i2) super.setExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final i2 setUnknownFields(gc gcVar) {
        return (i2) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public i2 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (i2) super.addRepeatedField(fieldDescriptor, obj);
    }

    public q4 addUninterpretedOptionBuilder(int i10) {
        return (q4) j().addBuilder(i10, v4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public i2 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (i2) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public i2 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (i2) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final i2 mergeUnknownFields(gc gcVar) {
        return (i2) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> i2 setExtension(e6 e6Var, int i10, Type type) {
        return (i2) super.setExtension(e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public i2 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (i2) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public i2 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (i2) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public i2 clear() {
        super.clear();
        this.f22216e = 0;
        int i10 = this.f22215c;
        this.f22217f = false;
        this.f22218g = 0;
        this.f22219h = false;
        this.f22220i = false;
        this.f22221j = false;
        this.f22215c = i10 & (-64);
        pa paVar = this.f22223l;
        if (paVar == null) {
            this.f22222k = Collections.EMPTY_LIST;
            this.f22215c = i10 & (-128);
            return this;
        }
        paVar.clear();
        return this;
    }

    public i2 addUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22223l;
        if (paVar == null) {
            v4Var.getClass();
            i();
            this.f22222k.add(i10, v4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public i2 mo500clone() {
        return (i2) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public i2 mergeFrom(Message message) {
        if (message instanceof l2) {
            return mergeFrom((l2) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public i2 setUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22223l;
        if (paVar == null) {
            i();
            this.f22222k.set(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q4Var.build());
        return this;
    }

    public i2 mergeFrom(l2 l2Var) {
        if (l2Var == l2.getDefaultInstance()) {
            return this;
        }
        if (l2Var.hasCtype()) {
            setCtype(l2Var.getCtype());
        }
        if (l2Var.hasPacked()) {
            setPacked(l2Var.getPacked());
        }
        if (l2Var.hasJstype()) {
            setJstype(l2Var.getJstype());
        }
        if (l2Var.hasLazy()) {
            setLazy(l2Var.getLazy());
        }
        if (l2Var.hasDeprecated()) {
            setDeprecated(l2Var.getDeprecated());
        }
        if (l2Var.hasWeak()) {
            setWeak(l2Var.getWeak());
        }
        if (this.f22223l == null) {
            if (!l2Var.f22333k.isEmpty()) {
                if (this.f22222k.isEmpty()) {
                    this.f22222k = l2Var.f22333k;
                    this.f22215c &= -65;
                } else {
                    i();
                    this.f22222k.addAll(l2Var.f22333k);
                }
                onChanged();
            }
        } else if (!l2Var.f22333k.isEmpty()) {
            if (this.f22223l.isEmpty()) {
                this.f22223l.dispose();
                this.f22223l = null;
                this.f22222k = l2Var.f22333k;
                this.f22215c &= -65;
                this.f22223l = k7.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f22223l.addAllMessages(l2Var.f22333k);
            }
        }
        f(l2Var);
        mergeUnknownFields(l2Var.unknownFields);
        onChanged();
        return this;
    }

    public i2 addUninterpretedOption(q4 q4Var) {
        pa paVar = this.f22223l;
        if (paVar == null) {
            i();
            this.f22222k.add(q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q4Var.build());
        return this;
    }

    public i2 addUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22223l;
        if (paVar == null) {
            i();
            this.f22222k.add(i10, q4Var.build());
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
    public com.explorestack.protobuf.i2 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.h2 r1 = com.explorestack.protobuf.l2.f22325n     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.l2 r3 = (com.explorestack.protobuf.l2) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.l2 r4 = (com.explorestack.protobuf.l2) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.i2.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.i2");
    }
}
