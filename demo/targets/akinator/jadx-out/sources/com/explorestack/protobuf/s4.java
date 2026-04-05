package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s4 extends o6 implements u4 {

    /* renamed from: b, reason: collision with root package name */
    public int f22610b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f22611c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22612e;

    public s4() {
        super(null);
        this.f22611c = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.Q;
    }

    public s4 clearIsExtension() {
        this.f22610b &= -3;
        this.f22612e = false;
        onChanged();
        return this;
    }

    public s4 clearNamePart() {
        this.f22610b &= -2;
        this.f22611c = t4.getDefaultInstance().getNamePart();
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.Q;
    }

    @Override // com.explorestack.protobuf.u4
    public boolean getIsExtension() {
        return this.f22612e;
    }

    @Override // com.explorestack.protobuf.u4
    public String getNamePart() {
        Serializable serializable = this.f22611c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22611c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.u4
    public ByteString getNamePartBytes() {
        Serializable serializable = this.f22611c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22611c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.u4
    public boolean hasIsExtension() {
        return (this.f22610b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.u4
    public boolean hasNamePart() {
        return (this.f22610b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.R.ensureFieldAccessorsInitialized(t4.class, s4.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return hasNamePart() && hasIsExtension();
    }

    public s4 setIsExtension(boolean z10) {
        this.f22610b |= 2;
        this.f22612e = z10;
        onChanged();
        return this;
    }

    public s4 setNamePart(String str) {
        str.getClass();
        this.f22610b |= 1;
        this.f22611c = str;
        onChanged();
        return this;
    }

    public s4 setNamePartBytes(ByteString byteString) {
        byteString.getClass();
        this.f22610b |= 1;
        this.f22611c = byteString;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s4 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s4) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public t4 build() {
        t4 t4VarBuildPartial = buildPartial();
        if (t4VarBuildPartial.isInitialized()) {
            return t4VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) t4VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public t4 buildPartial() {
        t4 t4Var = new t4(this);
        t4Var.f22660f = (byte) -1;
        int i10 = this.f22610b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        t4Var.f22658c = this.f22611c;
        if ((i10 & 2) != 0) {
            t4Var.f22659e = this.f22612e;
            i11 |= 2;
        }
        t4Var.f22657b = i11;
        onBuilt();
        return t4Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s4 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (s4) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public t4 getDefaultInstanceForType() {
        return t4.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s4 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s4) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s4 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (s4) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final s4 setUnknownFields(gc gcVar) {
        return (s4) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s4 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (s4) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final s4 mergeUnknownFields(gc gcVar) {
        return (s4) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public s4 clear() {
        super.clear();
        this.f22611c = "";
        int i10 = this.f22610b;
        this.f22612e = false;
        this.f22610b = i10 & (-4);
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public s4 mo500clone() {
        return (s4) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s4 mergeFrom(Message message) {
        if (message instanceof t4) {
            return mergeFrom((t4) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public s4 mergeFrom(t4 t4Var) {
        if (t4Var == t4.getDefaultInstance()) {
            return this;
        }
        if (t4Var.hasNamePart()) {
            this.f22610b |= 1;
            this.f22611c = t4Var.f22658c;
            onChanged();
        }
        if (t4Var.hasIsExtension()) {
            setIsExtension(t4Var.getIsExtension());
        }
        mergeUnknownFields(t4Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.s4 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.r4 r1 = com.explorestack.protobuf.t4.f22656h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.t4 r3 = (com.explorestack.protobuf.t4) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.t4 r4 = (com.explorestack.protobuf.t4) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.s4.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.s4");
    }
}
