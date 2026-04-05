package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Descriptors;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ca extends o6 implements ea {

    /* renamed from: b, reason: collision with root package name */
    public Serializable f22033b;

    /* renamed from: c, reason: collision with root package name */
    public Any f22034c;

    /* renamed from: e, reason: collision with root package name */
    public xa f22035e;

    public ca() {
        super(null);
        this.f22033b = "";
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ub.f22725c;
    }

    public ca clearName() {
        this.f22033b = da.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public ca clearValue() {
        if (this.f22035e == null) {
            this.f22034c = null;
            onChanged();
            return this;
        }
        this.f22034c = null;
        this.f22035e = null;
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return ub.f22725c;
    }

    @Override // com.explorestack.protobuf.ea
    public String getName() {
        Serializable serializable = this.f22033b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22033b = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.ea
    public ByteString getNameBytes() {
        Serializable serializable = this.f22033b;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22033b = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.ea
    public Any getValue() {
        xa xaVar = this.f22035e;
        if (xaVar != null) {
            return (Any) xaVar.getMessage();
        }
        Any any = this.f22034c;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public Any.Builder getValueBuilder() {
        onChanged();
        if (this.f22035e == null) {
            this.f22035e = new xa(getValue(), getParentForChildren(), isClean());
            this.f22034c = null;
        }
        return (Any.Builder) this.f22035e.getBuilder();
    }

    @Override // com.explorestack.protobuf.ea
    public g getValueOrBuilder() {
        xa xaVar = this.f22035e;
        if (xaVar != null) {
            return (g) xaVar.getMessageOrBuilder();
        }
        Any any = this.f22034c;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.explorestack.protobuf.ea
    public boolean hasValue() {
        return (this.f22035e == null && this.f22034c == null) ? false : true;
    }

    @Override // com.explorestack.protobuf.o6
    public final i7 internalGetFieldAccessorTable() {
        return ub.f22726d.ensureFieldAccessorsInitialized(da.class, ca.class);
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
    public com.explorestack.protobuf.ca mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            com.explorestack.protobuf.ba r1 = com.explorestack.protobuf.da.f22057g     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
            com.explorestack.protobuf.da r3 = (com.explorestack.protobuf.da) r3     // Catch: java.lang.Throwable -> Lf com.explorestack.protobuf.InvalidProtocolBufferException -> L11
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
            com.explorestack.protobuf.da r4 = (com.explorestack.protobuf.da) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.ca.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.ca");
    }

    public ca mergeValue(Any any) {
        xa xaVar = this.f22035e;
        if (xaVar != null) {
            xaVar.mergeFrom(any);
            return this;
        }
        Any any2 = this.f22034c;
        if (any2 != null) {
            this.f22034c = Any.newBuilder(any2).mergeFrom(any).buildPartial();
        } else {
            this.f22034c = any;
        }
        onChanged();
        return this;
    }

    public ca setName(String str) {
        str.getClass();
        this.f22033b = str;
        onChanged();
        return this;
    }

    public ca setNameBytes(ByteString byteString) throws IllegalArgumentException {
        byteString.getClass();
        b.checkByteStringIsUtf8(byteString);
        this.f22033b = byteString;
        onChanged();
        return this;
    }

    public ca setValue(Any any) {
        xa xaVar = this.f22035e;
        if (xaVar != null) {
            xaVar.setMessage(any);
            return this;
        }
        any.getClass();
        this.f22034c = any;
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public ca addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (ca) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public da build() {
        da daVarBuildPartial = buildPartial();
        if (daVarBuildPartial.isInitialized()) {
            return daVarBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) daVarBuildPartial);
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public da buildPartial() {
        da daVar = new da(this);
        daVar.f22060e = (byte) -1;
        daVar.f22058b = this.f22033b;
        xa xaVar = this.f22035e;
        if (xaVar == null) {
            daVar.f22059c = this.f22034c;
        } else {
            daVar.f22059c = (Any) xaVar.build();
        }
        onBuilt();
        return daVar;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public ca clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ca) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public da getDefaultInstanceForType() {
        return da.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public ca setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (ca) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public ca setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        return (ca) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public final ca setUnknownFields(gc gcVar) {
        return (ca) super.setUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public ca clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ca) super.clearOneof(oneofDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public final ca mergeUnknownFields(gc gcVar) {
        return (ca) super.mergeUnknownFields(gcVar);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public ca clear() {
        super.clear();
        this.f22033b = "";
        if (this.f22035e == null) {
            this.f22034c = null;
            return this;
        }
        this.f22034c = null;
        this.f22035e = null;
        return this;
    }

    public ca setValue(Any.Builder builder) {
        xa xaVar = this.f22035e;
        if (xaVar == null) {
            this.f22034c = builder.build();
            onChanged();
            return this;
        }
        xaVar.setMessage(builder.build());
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public ca mo500clone() {
        return (ca) super.mo500clone();
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public ca mergeFrom(Message message) {
        if (message instanceof da) {
            return mergeFrom((da) message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ca mergeFrom(da daVar) {
        if (daVar == da.getDefaultInstance()) {
            return this;
        }
        if (!daVar.getName().isEmpty()) {
            this.f22033b = daVar.f22058b;
            onChanged();
        }
        if (daVar.hasValue()) {
            mergeValue(daVar.getValue());
        }
        mergeUnknownFields(daVar.unknownFields);
        onChanged();
        return this;
    }
}
