package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y0 extends o6 implements a1 {

    /* renamed from: b, reason: collision with root package name */
    public int f22899b;

    /* renamed from: c, reason: collision with root package name */
    public int f22900c;

    /* renamed from: e, reason: collision with root package name */
    public int f22901e;

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22840g;
    }

    public y0 clearEnd() {
        this.f22899b &= -3;
        this.f22901e = 0;
        onChanged();
        return this;
    }

    public y0 clearStart() {
        this.f22899b &= -2;
        this.f22900c = 0;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22840g;
    }

    @Override // com.explorestack.protobuf.a1
    public int getEnd() {
        return this.f22901e;
    }

    @Override // com.explorestack.protobuf.a1
    public int getStart() {
        return this.f22900c;
    }

    @Override // com.explorestack.protobuf.a1
    public boolean hasEnd() {
        return (this.f22899b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.a1
    public boolean hasStart() {
        return (this.f22899b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22841h.ensureFieldAccessorsInitialized(z0.class, y0.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public y0 setEnd(int i10) {
        this.f22899b |= 2;
        this.f22901e = i10;
        onChanged();
        return this;
    }

    public y0 setStart(int i10) {
        this.f22899b |= 1;
        this.f22900c = i10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y0 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (y0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public z0 build() {
        z0 z0VarBuildPartial = buildPartial();
        if (z0VarBuildPartial.isInitialized()) {
            return z0VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) z0VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public z0 buildPartial() {
        int i10;
        z0 z0Var = new z0(this);
        z0Var.f22934f = (byte) -1;
        int i11 = this.f22899b;
        if ((i11 & 1) != 0) {
            z0Var.f22932c = this.f22900c;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            z0Var.f22933e = this.f22901e;
            i10 |= 2;
        }
        z0Var.f22931b = i10;
        onBuilt();
        return z0Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y0 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (y0) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public z0 getDefaultInstanceForType() {
        return z0.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y0 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (y0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public y0 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (y0) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final y0 setUnknownFields(gc gcVar) {
        return (y0) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public y0 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (y0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final y0 mergeUnknownFields(gc gcVar) {
        return (y0) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public y0 clear() {
        super.clear();
        this.f22900c = 0;
        int i10 = this.f22899b;
        this.f22901e = 0;
        this.f22899b = i10 & (-4);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public y0 mo500clone() {
        return (y0) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public y0 mergeFrom(Message message) {
        if (message instanceof z0) {
            return mergeFrom((z0) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public y0 mergeFrom(z0 z0Var) {
        if (z0Var == z0.getDefaultInstance()) {
            return this;
        }
        if (z0Var.hasStart()) {
            setStart(z0Var.getStart());
        }
        if (z0Var.hasEnd()) {
            setEnd(z0Var.getEnd());
        }
        mergeUnknownFields(z0Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.y0 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.x0 r1 = com.explorestack.protobuf.z0.f22930h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.z0 r3 = (com.explorestack.protobuf.z0) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.z0 r4 = (com.explorestack.protobuf.z0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.y0.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.y0");
    }
}
