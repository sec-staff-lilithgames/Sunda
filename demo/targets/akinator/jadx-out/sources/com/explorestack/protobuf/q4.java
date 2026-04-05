package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q4 extends o6 implements w4 {

    /* renamed from: b, reason: collision with root package name */
    public int f22513b;

    /* renamed from: c, reason: collision with root package name */
    public List f22514c;

    /* renamed from: e, reason: collision with root package name */
    public pa f22515e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f22516f;

    /* renamed from: g, reason: collision with root package name */
    public long f22517g;

    /* renamed from: h, reason: collision with root package name */
    public long f22518h;

    /* renamed from: i, reason: collision with root package name */
    public double f22519i;

    /* renamed from: j, reason: collision with root package name */
    public ByteString f22520j;

    /* renamed from: k, reason: collision with root package name */
    public Serializable f22521k;

    public q4() {
        super(null);
        this.f22514c = Collections.EMPTY_LIST;
        this.f22516f = "";
        this.f22520j = ByteString.EMPTY;
        this.f22521k = "";
        if (k7.alwaysUseFieldBuilders) {
            e();
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.O;
    }

    public q4 addAllName(Iterable<? extends t4> iterable) {
        pa paVar = this.f22515e;
        if (paVar != null) {
            paVar.addAllMessages(iterable);
            return this;
        }
        c();
        b.a.addAll((Iterable) iterable, this.f22514c);
        onChanged();
        return this;
    }

    public q4 addName(t4 t4Var) {
        pa paVar = this.f22515e;
        if (paVar != null) {
            paVar.addMessage(t4Var);
            return this;
        }
        t4Var.getClass();
        c();
        this.f22514c.add(t4Var);
        onChanged();
        return this;
    }

    public s4 addNameBuilder() {
        return (s4) e().addBuilder(t4.getDefaultInstance());
    }

    public final void c() {
        if ((this.f22513b & 1) == 0) {
            this.f22514c = new ArrayList(this.f22514c);
            this.f22513b |= 1;
        }
    }

    public q4 clearAggregateValue() {
        this.f22513b &= -65;
        this.f22521k = v4.getDefaultInstance().getAggregateValue();
        onChanged();
        return this;
    }

    public q4 clearDoubleValue() {
        this.f22513b &= -17;
        this.f22519i = 0.0d;
        onChanged();
        return this;
    }

    public q4 clearIdentifierValue() {
        this.f22513b &= -3;
        this.f22516f = v4.getDefaultInstance().getIdentifierValue();
        onChanged();
        return this;
    }

    public q4 clearName() {
        pa paVar = this.f22515e;
        if (paVar != null) {
            paVar.clear();
            return this;
        }
        this.f22514c = Collections.EMPTY_LIST;
        this.f22513b &= -2;
        onChanged();
        return this;
    }

    public q4 clearNegativeIntValue() {
        this.f22513b &= -9;
        this.f22518h = 0L;
        onChanged();
        return this;
    }

    public q4 clearPositiveIntValue() {
        this.f22513b &= -5;
        this.f22517g = 0L;
        onChanged();
        return this;
    }

    public q4 clearStringValue() {
        this.f22513b &= -33;
        this.f22520j = v4.getDefaultInstance().getStringValue();
        onChanged();
        return this;
    }

    public final pa e() {
        if (this.f22515e == null) {
            this.f22515e = new pa(this.f22514c, (this.f22513b & 1) != 0, getParentForChildren(), isClean());
            this.f22514c = null;
        }
        return this.f22515e;
    }

    @Override // com.explorestack.protobuf.w4
    public String getAggregateValue() {
        Serializable serializable = this.f22521k;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22521k = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.w4
    public ByteString getAggregateValueBytes() {
        Serializable serializable = this.f22521k;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22521k = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.O;
    }

    @Override // com.explorestack.protobuf.w4
    public double getDoubleValue() {
        return this.f22519i;
    }

    @Override // com.explorestack.protobuf.w4
    public String getIdentifierValue() {
        Serializable serializable = this.f22516f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22516f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.w4
    public ByteString getIdentifierValueBytes() {
        Serializable serializable = this.f22516f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22516f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.w4
    public t4 getName(int i10) {
        pa paVar = this.f22515e;
        return paVar == null ? (t4) this.f22514c.get(i10) : (t4) paVar.getMessage(i10);
    }

    public s4 getNameBuilder(int i10) {
        return (s4) e().getBuilder(i10);
    }

    public List<s4> getNameBuilderList() {
        return e().getBuilderList();
    }

    @Override // com.explorestack.protobuf.w4
    public int getNameCount() {
        pa paVar = this.f22515e;
        return paVar == null ? this.f22514c.size() : paVar.getCount();
    }

    @Override // com.explorestack.protobuf.w4
    public List<t4> getNameList() {
        pa paVar = this.f22515e;
        return paVar == null ? Collections.unmodifiableList(this.f22514c) : paVar.getMessageList();
    }

    @Override // com.explorestack.protobuf.w4
    public u4 getNameOrBuilder(int i10) {
        pa paVar = this.f22515e;
        return paVar == null ? (u4) this.f22514c.get(i10) : (u4) paVar.getMessageOrBuilder(i10);
    }

    @Override // com.explorestack.protobuf.w4
    public List<? extends u4> getNameOrBuilderList() {
        pa paVar = this.f22515e;
        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.f22514c);
    }

    @Override // com.explorestack.protobuf.w4
    public long getNegativeIntValue() {
        return this.f22518h;
    }

    @Override // com.explorestack.protobuf.w4
    public long getPositiveIntValue() {
        return this.f22517g;
    }

    @Override // com.explorestack.protobuf.w4
    public ByteString getStringValue() {
        return this.f22520j;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasAggregateValue() {
        return (this.f22513b & 64) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasDoubleValue() {
        return (this.f22513b & 16) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasIdentifierValue() {
        return (this.f22513b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasNegativeIntValue() {
        return (this.f22513b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasPositiveIntValue() {
        return (this.f22513b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasStringValue() {
        return (this.f22513b & 32) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.P.ensureFieldAccessorsInitialized(v4.class, q4.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        for (int i10 = 0; i10 < getNameCount(); i10++) {
            if (!getName(i10).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public q4 removeName(int i10) {
        pa paVar = this.f22515e;
        if (paVar != null) {
            paVar.remove(i10);
            return this;
        }
        c();
        this.f22514c.remove(i10);
        onChanged();
        return this;
    }

    public q4 setAggregateValue(String str) {
        str.getClass();
        this.f22513b |= 64;
        this.f22521k = str;
        onChanged();
        return this;
    }

    public q4 setAggregateValueBytes(ByteString byteString) {
        byteString.getClass();
        this.f22513b |= 64;
        this.f22521k = byteString;
        onChanged();
        return this;
    }

    public q4 setDoubleValue(double d10) {
        this.f22513b |= 16;
        this.f22519i = d10;
        onChanged();
        return this;
    }

    public q4 setIdentifierValue(String str) {
        str.getClass();
        this.f22513b |= 2;
        this.f22516f = str;
        onChanged();
        return this;
    }

    public q4 setIdentifierValueBytes(ByteString byteString) {
        byteString.getClass();
        this.f22513b |= 2;
        this.f22516f = byteString;
        onChanged();
        return this;
    }

    public q4 setName(int i10, t4 t4Var) {
        pa paVar = this.f22515e;
        if (paVar != null) {
            paVar.setMessage(i10, t4Var);
            return this;
        }
        t4Var.getClass();
        c();
        this.f22514c.set(i10, t4Var);
        onChanged();
        return this;
    }

    public q4 setNegativeIntValue(long j10) {
        this.f22513b |= 8;
        this.f22518h = j10;
        onChanged();
        return this;
    }

    public q4 setPositiveIntValue(long j10) {
        this.f22513b |= 4;
        this.f22517g = j10;
        onChanged();
        return this;
    }

    public q4 setStringValue(ByteString byteString) {
        byteString.getClass();
        this.f22513b |= 32;
        this.f22520j = byteString;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q4 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (q4) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public v4 build() {
        v4 v4VarBuildPartial = buildPartial();
        if (v4VarBuildPartial.isInitialized()) {
            return v4VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) v4VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public v4 buildPartial() {
        v4 v4Var = new v4(this);
        v4Var.f22766k = (byte) -1;
        int i10 = this.f22513b;
        pa paVar = this.f22515e;
        if (paVar == null) {
            if ((i10 & 1) != 0) {
                this.f22514c = Collections.unmodifiableList(this.f22514c);
                this.f22513b &= -2;
            }
            v4Var.f22759c = this.f22514c;
        } else {
            v4Var.f22759c = paVar.build();
        }
        int i11 = (i10 & 2) != 0 ? 1 : 0;
        v4Var.f22760e = this.f22516f;
        if ((i10 & 4) != 0) {
            v4Var.f22761f = this.f22517g;
            i11 |= 2;
        }
        if ((i10 & 8) != 0) {
            v4Var.f22762g = this.f22518h;
            i11 |= 4;
        }
        if ((i10 & 16) != 0) {
            v4Var.f22763h = this.f22519i;
            i11 |= 8;
        }
        if ((i10 & 32) != 0) {
            i11 |= 16;
        }
        v4Var.f22764i = this.f22520j;
        if ((i10 & 64) != 0) {
            i11 |= 32;
        }
        v4Var.f22765j = this.f22521k;
        v4Var.f22758b = i11;
        onBuilt();
        return v4Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q4 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (q4) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public v4 getDefaultInstanceForType() {
        return v4.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q4 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (q4) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q4 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (q4) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final q4 setUnknownFields(gc gcVar) {
        return (q4) super.setUnknownFields(gcVar);
    }

    public s4 addNameBuilder(int i10) {
        return (s4) e().addBuilder(i10, t4.getDefaultInstance());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public q4 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (q4) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final q4 mergeUnknownFields(gc gcVar) {
        return (q4) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public q4 clear() {
        super.clear();
        pa paVar = this.f22515e;
        if (paVar == null) {
            this.f22514c = Collections.EMPTY_LIST;
            this.f22513b &= -2;
        } else {
            paVar.clear();
        }
        this.f22516f = "";
        int i10 = this.f22513b;
        this.f22517g = 0L;
        this.f22518h = 0L;
        this.f22519i = 0.0d;
        this.f22513b = i10 & (-31);
        this.f22520j = ByteString.EMPTY;
        this.f22521k = "";
        this.f22513b = i10 & (-127);
        return this;
    }

    public q4 addName(int i10, t4 t4Var) {
        pa paVar = this.f22515e;
        if (paVar == null) {
            t4Var.getClass();
            c();
            this.f22514c.add(i10, t4Var);
            onChanged();
            return this;
        }
        paVar.addMessage(i10, t4Var);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public q4 mo500clone() {
        return (q4) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public q4 mergeFrom(Message message) {
        if (message instanceof v4) {
            return mergeFrom((v4) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public q4 setName(int i10, s4 s4Var) {
        pa paVar = this.f22515e;
        if (paVar == null) {
            c();
            this.f22514c.set(i10, s4Var.build());
            onChanged();
            return this;
        }
        paVar.setMessage(i10, s4Var.build());
        return this;
    }

    public q4 mergeFrom(v4 v4Var) {
        if (v4Var == v4.getDefaultInstance()) {
            return this;
        }
        if (this.f22515e == null) {
            if (!v4Var.f22759c.isEmpty()) {
                if (this.f22514c.isEmpty()) {
                    this.f22514c = v4Var.f22759c;
                    this.f22513b &= -2;
                } else {
                    c();
                    this.f22514c.addAll(v4Var.f22759c);
                }
                onChanged();
            }
        } else if (!v4Var.f22759c.isEmpty()) {
            if (this.f22515e.isEmpty()) {
                this.f22515e.dispose();
                this.f22515e = null;
                this.f22514c = v4Var.f22759c;
                this.f22513b &= -2;
                this.f22515e = k7.alwaysUseFieldBuilders ? e() : null;
            } else {
                this.f22515e.addAllMessages(v4Var.f22759c);
            }
        }
        if (v4Var.hasIdentifierValue()) {
            this.f22513b |= 2;
            this.f22516f = v4Var.f22760e;
            onChanged();
        }
        if (v4Var.hasPositiveIntValue()) {
            setPositiveIntValue(v4Var.getPositiveIntValue());
        }
        if (v4Var.hasNegativeIntValue()) {
            setNegativeIntValue(v4Var.getNegativeIntValue());
        }
        if (v4Var.hasDoubleValue()) {
            setDoubleValue(v4Var.getDoubleValue());
        }
        if (v4Var.hasStringValue()) {
            setStringValue(v4Var.getStringValue());
        }
        if (v4Var.hasAggregateValue()) {
            this.f22513b |= 64;
            this.f22521k = v4Var.f22765j;
            onChanged();
        }
        mergeUnknownFields(v4Var.unknownFields);
        onChanged();
        return this;
    }

    public q4 addName(s4 s4Var) {
        pa paVar = this.f22515e;
        if (paVar == null) {
            c();
            this.f22514c.add(s4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(s4Var.build());
        return this;
    }

    public q4 addName(int i10, s4 s4Var) {
        pa paVar = this.f22515e;
        if (paVar == null) {
            c();
            this.f22514c.add(i10, s4Var.build());
            onChanged();
            return this;
        }
        paVar.addMessage(i10, s4Var.build());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.q4 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.p4 r1 = com.explorestack.protobuf.v4.f22757m     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.v4 r3 = (com.explorestack.protobuf.v4) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.v4 r4 = (com.explorestack.protobuf.v4) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.q4.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.q4");
    }
}
