package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s3 extends o6 implements u3 {

    /* renamed from: b, reason: collision with root package name */
    public int f22606b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f22607c;

    /* renamed from: e, reason: collision with root package name */
    public x3 f22608e;

    /* renamed from: f, reason: collision with root package name */
    public xa f22609f;

    public s3() {
        super(null);
        this.f22607c = "";
        if (k7.alwaysUseFieldBuilders && this.f22609f == null) {
            this.f22609f = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22608e = null;
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22846m;
    }

    public s3 clearName() {
        this.f22606b &= -2;
        this.f22607c = t3.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public s3 clearOptions() {
        xa xaVar = this.f22609f;
        if (xaVar == null) {
            this.f22608e = null;
            onChanged();
        } else {
            xaVar.clear();
        }
        this.f22606b &= -3;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return x4.f22846m;
    }

    @Override // com.explorestack.protobuf.u3
    public String getName() {
        Serializable serializable = this.f22607c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22607c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.u3
    public ByteString getNameBytes() {
        Serializable serializable = this.f22607c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22607c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.u3
    public x3 getOptions() {
        xa xaVar = this.f22609f;
        if (xaVar != null) {
            return (x3) xaVar.getMessage();
        }
        x3 x3Var = this.f22608e;
        return x3Var == null ? x3.getDefaultInstance() : x3Var;
    }

    public w3 getOptionsBuilder() {
        this.f22606b |= 2;
        onChanged();
        if (this.f22609f == null) {
            this.f22609f = new xa(getOptions(), getParentForChildren(), isClean());
            this.f22608e = null;
        }
        return (w3) this.f22609f.getBuilder();
    }

    @Override // com.explorestack.protobuf.u3
    public y3 getOptionsOrBuilder() {
        xa xaVar = this.f22609f;
        if (xaVar != null) {
            return (y3) xaVar.getMessageOrBuilder();
        }
        x3 x3Var = this.f22608e;
        return x3Var == null ? x3.getDefaultInstance() : x3Var;
    }

    @Override // com.explorestack.protobuf.u3
    public boolean hasName() {
        return (this.f22606b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.u3
    public boolean hasOptions() {
        return (this.f22606b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22847n.ensureFieldAccessorsInitialized(t3.class, s3.class);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        return !hasOptions() || getOptions().isInitialized();
    }

    public s3 mergeOptions(x3 x3Var) {
        x3 x3Var2;
        xa xaVar = this.f22609f;
        if (xaVar == null) {
            if ((this.f22606b & 2) == 0 || (x3Var2 = this.f22608e) == null || x3Var2 == x3.getDefaultInstance()) {
                this.f22608e = x3Var;
            } else {
                this.f22608e = x3.newBuilder(this.f22608e).mergeFrom(x3Var).buildPartial();
            }
            onChanged();
        } else {
            xaVar.mergeFrom(x3Var);
        }
        this.f22606b |= 2;
        return this;
    }

    public s3 setName(String str) {
        str.getClass();
        this.f22606b |= 1;
        this.f22607c = str;
        onChanged();
        return this;
    }

    public s3 setNameBytes(ByteString byteString) {
        byteString.getClass();
        this.f22606b |= 1;
        this.f22607c = byteString;
        onChanged();
        return this;
    }

    public s3 setOptions(x3 x3Var) {
        xa xaVar = this.f22609f;
        if (xaVar == null) {
            x3Var.getClass();
            this.f22608e = x3Var;
            onChanged();
        } else {
            xaVar.setMessage(x3Var);
        }
        this.f22606b |= 2;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s3 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s3) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public t3 build() {
        t3 t3VarBuildPartial = buildPartial();
        if (t3VarBuildPartial.isInitialized()) {
            return t3VarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) t3VarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public t3 buildPartial() {
        t3 t3Var = new t3(this);
        t3Var.f22654f = (byte) -1;
        int i10 = this.f22606b;
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        t3Var.f22652c = this.f22607c;
        if ((i10 & 2) != 0) {
            xa xaVar = this.f22609f;
            if (xaVar == null) {
                t3Var.f22653e = this.f22608e;
            } else {
                t3Var.f22653e = (x3) xaVar.build();
            }
            i11 |= 2;
        }
        t3Var.f22651b = i11;
        onBuilt();
        return t3Var;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s3 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (s3) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public t3 getDefaultInstanceForType() {
        return t3.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s3 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (s3) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public s3 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (s3) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final s3 setUnknownFields(gc gcVar) {
        return (s3) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s3 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (s3) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final s3 mergeUnknownFields(gc gcVar) {
        return (s3) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public s3 clear() {
        super.clear();
        this.f22607c = "";
        this.f22606b &= -2;
        xa xaVar = this.f22609f;
        if (xaVar == null) {
            this.f22608e = null;
        } else {
            xaVar.clear();
        }
        this.f22606b &= -3;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public s3 mo500clone() {
        return (s3) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public s3 mergeFrom(Message message) {
        if (message instanceof t3) {
            return mergeFrom((t3) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public s3 setOptions(w3 w3Var) {
        xa xaVar = this.f22609f;
        if (xaVar == null) {
            this.f22608e = w3Var.build();
            onChanged();
        } else {
            xaVar.setMessage(w3Var.build());
        }
        this.f22606b |= 2;
        return this;
    }

    public s3 mergeFrom(t3 t3Var) {
        if (t3Var == t3.getDefaultInstance()) {
            return this;
        }
        if (t3Var.hasName()) {
            this.f22606b |= 1;
            this.f22607c = t3Var.f22652c;
            onChanged();
        }
        if (t3Var.hasOptions()) {
            mergeOptions(t3Var.getOptions());
        }
        mergeUnknownFields(t3Var.unknownFields);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.s3 mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.r3 r1 = com.explorestack.protobuf.t3.f22650h     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.t3 r3 = (com.explorestack.protobuf.t3) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.t3 r4 = (com.explorestack.protobuf.t3) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.s3.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.s3");
    }
}
