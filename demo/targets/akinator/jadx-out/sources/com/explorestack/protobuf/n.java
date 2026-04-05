package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n extends o6 implements p {

    /* renamed from: b, reason: collision with root package name */
    public boolean f22384b;

    public static final Descriptors.Descriptor getDescriptor() {
        return id.f22246g;
    }

    public n clearValue() {
        this.f22384b = false;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return id.f22246g;
    }

    @Override // com.explorestack.protobuf.p
    public boolean getValue() {
        return this.f22384b;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return id.f22247h.ensureFieldAccessorsInitialized(o.class, n.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.n mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.m r1 = com.explorestack.protobuf.o.f22408f     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.o r3 = (com.explorestack.protobuf.o) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.o r4 = (com.explorestack.protobuf.o) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.n.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.n");
    }

    public n setValue(boolean z10) {
        this.f22384b = z10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public n addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (n) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public o build() {
        o oVarBuildPartial = buildPartial();
        if (oVarBuildPartial.isInitialized()) {
            return oVarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) oVarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public o buildPartial() {
        o oVar = new o(this);
        oVar.f22410c = (byte) -1;
        oVar.f22409b = this.f22384b;
        onBuilt();
        return oVar;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public n clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (n) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public o getDefaultInstanceForType() {
        return o.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public n setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (n) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public n setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (n) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final n setUnknownFields(gc gcVar) {
        return (n) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public n clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (n) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final n mergeUnknownFields(gc gcVar) {
        return (n) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public n clear() {
        super.clear();
        this.f22384b = false;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public n mo500clone() {
        return (n) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public n mergeFrom(Message message) {
        if (message instanceof o) {
            return mergeFrom((o) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public n mergeFrom(o oVar) {
        if (oVar == o.getDefaultInstance()) {
            return this;
        }
        if (oVar.getValue()) {
            setValue(oVar.getValue());
        }
        mergeUnknownFields(oVar.unknownFields);
        onChanged();
        return this;
    }
}
