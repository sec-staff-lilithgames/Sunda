package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f3 extends q6 implements h3 {

    /* renamed from: c, reason: collision with root package name */
    public int f22119c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22120e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22121f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22122g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22123h;

    /* renamed from: i, reason: collision with root package name */
    public List f22124i;

    /* renamed from: j, reason: collision with root package name */
    public pa f22125j;

    public f3() {
        super(null);
        this.f22124i = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            j();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.A;
    }

    public f3 addAllUninterpretedOption(Iterable<? extends v4> iterable) {
        pa paVar = this.f22125j;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        i();
        b.a.addAll((Iterable) iterable, this.f22124i);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 addExtension(e6 e6Var, Object obj) {
        return addExtension(e6Var, (e6) obj);
    }

    public f3 addUninterpretedOption(v4 v4Var) {
        pa paVar = this.f22125j;
        if (paVar != null) {
            paVar.addMessage(v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22124i.add(v4Var);
        onChanged();
        return this;
    }

    public q4 addUninterpretedOptionBuilder() {
        return (q4) j().addBuilder(v4.getDefaultInstance());
    }

    public f3 clearDeprecated() {
        this.f22119c &= -5;
        this.f22122g = false;
        onChanged();
        return this;
    }

    public f3 clearMapEntry() {
        this.f22119c &= -9;
        this.f22123h = false;
        onChanged();
        return this;
    }

    public f3 clearMessageSetWireFormat() {
        this.f22119c &= -2;
        this.f22120e = false;
        onChanged();
        return this;
    }

    public f3 clearNoStandardDescriptorAccessor() {
        this.f22119c &= -3;
        this.f22121f = false;
        onChanged();
        return this;
    }

    public f3 clearUninterpretedOption() {
        pa paVar = this.f22125j;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22124i = Collections.EMPTY_LIST;
        this.f22119c &= -17;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean getDeprecated() {
        return this.f22122g;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.A;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean getMapEntry() {
        return this.f22123h;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean getMessageSetWireFormat() {
        return this.f22120e;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean getNoStandardDescriptorAccessor() {
        return this.f22121f;
    }

    @Override // com.explorestack.protobuf.h3
    public v4 getUninterpretedOption(int i10) {
        pa paVar = this.f22125j;
        return paVar == null ? (v4) this.f22124i.get(i10) : (v4) paVar.getMessage(i10);
    }

    public q4 getUninterpretedOptionBuilder(int i10) {
        return (q4) j().getBuilder(i10);
    }

    public List<q4> getUninterpretedOptionBuilderList() {
        return j().getBuilderList();
    }

    @Override // com.explorestack.protobuf.h3
    public int getUninterpretedOptionCount() {
        pa paVar = this.f22125j;
        return paVar == null ? this.f22124i.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.h3
    public List<v4> getUninterpretedOptionList() {
        pa paVar = this.f22125j;
        return paVar == null ? Collections.unmodifiableList(this.f22124i) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.h3
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        pa paVar = this.f22125j;
        return paVar == null ? (w4) this.f22124i.get(i10) : (w4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.h3
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        pa paVar = this.f22125j;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22124i);
    }

    @Override // com.explorestack.protobuf.h3
    public boolean hasDeprecated() {
        return (this.f22119c & 4) != 0;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean hasMapEntry() {
        return (this.f22119c & 8) != 0;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean hasMessageSetWireFormat() {
        return (this.f22119c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.h3
    public boolean hasNoStandardDescriptorAccessor() {
        return (this.f22119c & 2) != 0;
    }

    public final void i() {
        if ((this.f22119c & 16) == 0) {
            this.f22124i = new ArrayList(this.f22124i);
            this.f22119c |= 16;
        }
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.B.ensureFieldAccessorsInitialized(g3.class, f3.class);
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
        if (this.f22125j == null) {
            this.f22125j = new pa(this.f22124i, (this.f22119c & 16) != 0, getParentForChildren(), isClean());
            this.f22124i = null;
        }
        return this.f22125j;
    }

    public f3 removeUninterpretedOption(int i10) {
        pa paVar = this.f22125j;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        i();
        this.f22124i.remove(i10);
        onChanged();
        return this;
    }

    public f3 setDeprecated(boolean z10) {
        this.f22119c |= 4;
        this.f22122g = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, int i10, Object obj) {
        return setExtension(e6Var, i10, (int) obj);
    }

    public f3 setMapEntry(boolean z10) {
        this.f22119c |= 8;
        this.f22123h = z10;
        onChanged();
        return this;
    }

    public f3 setMessageSetWireFormat(boolean z10) {
        this.f22119c |= 1;
        this.f22120e = z10;
        onChanged();
        return this;
    }

    public f3 setNoStandardDescriptorAccessor(boolean z10) {
        this.f22119c |= 2;
        this.f22121f = z10;
        onChanged();
        return this;
    }

    public f3 setUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22125j;
        if (paVar != null) {
            paVar.setMessage(i10, v4Var);
            return this;
        }
        v4Var.getClass();
        i();
        this.f22124i.set(i10, v4Var);
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> f3 addExtension(e6 e6Var, Type type) {
        return (f3) super.addExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> f3 clearExtension(e6 e6Var) {
        return (f3) super.clearExtension(e6Var);
    }

    @Override // com.explorestack.protobuf.q6
    public /* bridge */ /* synthetic */ q6 setExtension(e6 e6Var, Object obj) {
        return setExtension(e6Var, (e6) obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public g3 build() {
        g3 g3VarBuildPartial = buildPartial();
        if (g3VarBuildPartial.isInitialized()) {
            return g3VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) g3VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public g3 buildPartial() {
        int i10;
        g3 g3Var = new g3(this);
        g3Var.f22159j = (byte) -1;
        int i11 = this.f22119c;
        if ((i11 & 1) != 0) {
            g3Var.f22154e = this.f22120e;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            g3Var.f22155f = this.f22121f;
            i10 |= 2;
        }
        if ((i11 & 4) != 0) {
            g3Var.f22156g = this.f22122g;
            i10 |= 4;
        }
        if ((i11 & 8) != 0) {
            g3Var.f22157h = this.f22123h;
            i10 |= 8;
        }
        pa paVar = this.f22125j;
        if (paVar == null) {
            if ((i11 & 16) != 0) {
                this.f22124i = Collections.unmodifiableList(this.f22124i);
                this.f22119c &= -17;
            }
            g3Var.f22158i = this.f22124i;
        } else {
            g3Var.f22158i = paVar.build();
        }
        g3Var.f22153c = i10;
        onBuilt();
        return g3Var;
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public g3 getDefaultInstanceForType() {
        return g3.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> f3 setExtension(e6 e6Var, Type type) {
        return (f3) super.setExtension(e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final f3 setUnknownFields(gc gcVar) {
        return (f3) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public f3 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (f3) super.addRepeatedField(fieldDescriptor, obj);
    }

    public q4 addUninterpretedOptionBuilder(int i10) {
        return (q4) j().addBuilder(i10, v4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public f3 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (f3) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public f3 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (f3) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final f3 mergeUnknownFields(gc gcVar) {
        return (f3) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.q6
    public <Type> f3 setExtension(e6 e6Var, int i10, Type type) {
        return (f3) super.setExtension(e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public f3 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (f3) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public f3 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (f3) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.q6, com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public f3 clear() {
        super.clear();
        this.f22120e = false;
        int i10 = this.f22119c;
        this.f22121f = false;
        this.f22122g = false;
        this.f22123h = false;
        this.f22119c = i10 & (-16);
        pa paVar = this.f22125j;
        if (paVar == null) {
            this.f22124i = Collections.EMPTY_LIST;
            this.f22119c = i10 & (-32);
            return this;
        }
        paVar.clear();
        return this;
    }

    public f3 addUninterpretedOption(int i10, v4 v4Var) {
        pa paVar = this.f22125j;
        if (paVar == null) {
            v4Var.getClass();
            i();
            this.f22124i.add(i10, v4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, v4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public f3 mo500clone() {
        return (f3) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public f3 mergeFrom(Message message) {
        if (message instanceof g3) {
            return mergeFrom((g3) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public f3 setUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22125j;
        if (paVar == null) {
            i();
            this.f22124i.set(i10, q4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, q4Var.build());
        return this;
    }

    public f3 mergeFrom(g3 g3Var) {
        if (g3Var == g3.getDefaultInstance()) {
            return this;
        }
        if (g3Var.hasMessageSetWireFormat()) {
            setMessageSetWireFormat(g3Var.getMessageSetWireFormat());
        }
        if (g3Var.hasNoStandardDescriptorAccessor()) {
            setNoStandardDescriptorAccessor(g3Var.getNoStandardDescriptorAccessor());
        }
        if (g3Var.hasDeprecated()) {
            setDeprecated(g3Var.getDeprecated());
        }
        if (g3Var.hasMapEntry()) {
            setMapEntry(g3Var.getMapEntry());
        }
        if (this.f22125j == null) {
            if (!g3Var.f22158i.isEmpty()) {
                if (this.f22124i.isEmpty()) {
                    this.f22124i = g3Var.f22158i;
                    this.f22119c &= -17;
                } else {
                    i();
                    this.f22124i.addAll(g3Var.f22158i);
                }
                onChanged();
            }
        } else if (!g3Var.f22158i.isEmpty()) {
            if (this.f22125j.isEmpty()) {
                this.f22125j.dispose();
                this.f22125j = null;
                this.f22124i = g3Var.f22158i;
                this.f22119c &= -17;
                this.f22125j = k7.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f22125j.addAllMessages(g3Var.f22158i);
            }
        }
        f(g3Var);
        mergeUnknownFields(g3Var.unknownFields);
        onChanged();
        return this;
    }

    public f3 addUninterpretedOption(q4 q4Var) {
        pa paVar = this.f22125j;
        if (paVar == null) {
            i();
            this.f22124i.add(q4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(q4Var.build());
        return this;
    }

    public f3 addUninterpretedOption(int i10, q4 q4Var) {
        pa paVar = this.f22125j;
        if (paVar == null) {
            i();
            this.f22124i.add(i10, q4Var.build());
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
    public com.explorestack.protobuf.f3 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.e3 r1 = com.explorestack.protobuf.g3.f22152l     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.g3 r3 = (com.explorestack.protobuf.g3) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.g3 r4 = (com.explorestack.protobuf.g3) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.f3.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.f3");
    }
}
