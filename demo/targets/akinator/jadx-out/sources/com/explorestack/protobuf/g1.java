package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g1 extends o6 implements i1 {

    /* renamed from: b, reason: collision with root package name */
    public int f22148b;

    /* renamed from: c, reason: collision with root package name */
    public int f22149c;

    /* renamed from: e, reason: collision with root package name */
    public int f22150e;

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22850q;
    }

    public g1 clearEnd() {
        this.f22148b &= -3;
        this.f22150e = 0;
        onChanged();
        return this;
    }

    public g1 clearStart() {
        this.f22148b &= -2;
        this.f22149c = 0;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22850q;
    }

    @Override // com.explorestack.protobuf.i1
    public int getEnd() {
        return this.f22150e;
    }

    @Override // com.explorestack.protobuf.i1
    public int getStart() {
        return this.f22149c;
    }

    @Override // com.explorestack.protobuf.i1
    public boolean hasEnd() {
        return (this.f22148b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.i1
    public boolean hasStart() {
        return (this.f22148b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22851r.ensureFieldAccessorsInitialized(h1.class, g1.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    public g1 setEnd(int i10) {
        this.f22148b |= 2;
        this.f22150e = i10;
        onChanged();
        return this;
    }

    public g1 setStart(int i10) {
        this.f22148b |= 1;
        this.f22149c = i10;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public g1 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (g1) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public h1 build() {
        h1 h1VarBuildPartial = buildPartial();
        if (h1VarBuildPartial.isInitialized()) {
            return h1VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) h1VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public h1 buildPartial() {
        int i10;
        h1 h1Var = new h1(this);
        h1Var.f22193f = (byte) -1;
        int i11 = this.f22148b;
        if ((i11 & 1) != 0) {
            h1Var.f22191c = this.f22149c;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            h1Var.f22192e = this.f22150e;
            i10 |= 2;
        }
        h1Var.f22190b = i10;
        onBuilt();
        return h1Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public g1 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (g1) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public h1 getDefaultInstanceForType() {
        return h1.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public g1 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (g1) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public g1 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (g1) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final g1 setUnknownFields(gc gcVar) {
        return (g1) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public g1 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (g1) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final g1 mergeUnknownFields(gc gcVar) {
        return (g1) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public g1 clear() {
        super.clear();
        this.f22149c = 0;
        int i10 = this.f22148b;
        this.f22150e = 0;
        this.f22148b = i10 & (-4);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public g1 mo500clone() {
        return (g1) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public g1 mergeFrom(Message message) {
        if (message instanceof h1) {
            return mergeFrom((h1) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public g1 mergeFrom(h1 h1Var) {
        if (h1Var == h1.getDefaultInstance()) {
            return this;
        }
        if (h1Var.hasStart()) {
            setStart(h1Var.getStart());
        }
        if (h1Var.hasEnd()) {
            setEnd(h1Var.getEnd());
        }
        mergeUnknownFields(h1Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.g1 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.f1 r1 = com.explorestack.protobuf.h1.f22189h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.h1 r3 = (com.explorestack.protobuf.h1) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.h1 r4 = (com.explorestack.protobuf.h1) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.g1.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.g1");
    }
}
