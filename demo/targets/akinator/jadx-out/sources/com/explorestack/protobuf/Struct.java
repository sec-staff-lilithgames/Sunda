package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class Struct extends k7 implements jb {
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private b9 fields_;
    private byte memoizedIsInitialized;
    private static final Struct DEFAULT_INSTANCE = new Struct();
    private static final fa PARSER = new d() { // from class: com.explorestack.protobuf.Struct.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Struct parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Struct(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FieldsDefaultEntryHolder {
        static final s8 defaultEntry = s8.newDefaultInstance(kb.f22314c, bd.f21956f, "", bd.f21958h, Value.getDefaultInstance());

        private FieldsDefaultEntryHolder() {
        }
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return kb.f22312a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b9 internalGetFields() {
        b9 b9Var = this.fields_;
        return b9Var == null ? b9.emptyMapField(FieldsDefaultEntryHolder.defaultEntry) : b9Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.jb
    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().getMap().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Struct)) {
            return super.equals(obj);
        }
        Struct struct = (Struct) obj;
        return internalGetFields().equals(struct.internalGetFields()) && this.unknownFields.equals(struct.unknownFields);
    }

    @Override // com.explorestack.protobuf.jb
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.explorestack.protobuf.jb
    public int getFieldsCount() {
        return internalGetFields().getMap().size();
    }

    @Override // com.explorestack.protobuf.jb
    public Map<String, Value> getFieldsMap() {
        return internalGetFields().getMap();
    }

    @Override // com.explorestack.protobuf.jb
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        Map<Object, Object> map = internalGetFields().getMap();
        return map.containsKey(str) ? (Value) map.get(str) : value;
    }

    @Override // com.explorestack.protobuf.jb
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        Map<Object, Object> map = internalGetFields().getMap();
        if (map.containsKey(str)) {
            return (Value) map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        Iterator itN = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.n(internalGetFields());
        int iG = 0;
        while (itN.hasNext()) {
            Map.Entry entry = (Map.Entry) itN.next();
            iG = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.g(entry, FieldsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 1, iG);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iG;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (!internalGetFields().getMap().isEmpty()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + internalGetFields().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return kb.f22313b.ensureFieldAccessorsInitialized(Struct.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.k7
    public b9 internalGetMapField(int i10) {
        if (i10 == 1) {
            return internalGetFields();
        }
        throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public Object newInstance(j7 j7Var) {
        return new Struct();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        k7.serializeStringMapTo(h0Var, internalGetFields(), FieldsDefaultEntryHolder.defaultEntry, 1);
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements jb {
        private int bitField0_;
        private b9 fields_;

        public static final Descriptors.Descriptor getDescriptor() {
            return kb.f22312a;
        }

        private b9 internalGetFields() {
            b9 b9Var = this.fields_;
            return b9Var == null ? b9.emptyMapField(FieldsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        private b9 internalGetMutableFields() {
            onChanged();
            if (this.fields_ == null) {
                this.fields_ = b9.newMapField(FieldsDefaultEntryHolder.defaultEntry);
            }
            if (!this.fields_.isMutable()) {
                this.fields_ = this.fields_.copy();
            }
            return this.fields_;
        }

        public Builder clearFields() {
            internalGetMutableFields().getMutableMap().clear();
            return this;
        }

        @Override // com.explorestack.protobuf.jb
        public boolean containsFields(String str) {
            str.getClass();
            return internalGetFields().getMap().containsKey(str);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return kb.f22312a;
        }

        @Override // com.explorestack.protobuf.jb
        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        @Override // com.explorestack.protobuf.jb
        public int getFieldsCount() {
            return internalGetFields().getMap().size();
        }

        @Override // com.explorestack.protobuf.jb
        public Map<String, Value> getFieldsMap() {
            return internalGetFields().getMap();
        }

        @Override // com.explorestack.protobuf.jb
        public Value getFieldsOrDefault(String str, Value value) {
            str.getClass();
            Map<Object, Object> map = internalGetFields().getMap();
            return map.containsKey(str) ? (Value) map.get(str) : value;
        }

        @Override // com.explorestack.protobuf.jb
        public Value getFieldsOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetFields().getMap();
            if (map.containsKey(str)) {
                return (Value) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, Value> getMutableFields() {
            return internalGetMutableFields().getMutableMap();
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return kb.f22313b.ensureFieldAccessorsInitialized(Struct.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMapField(int i10) {
            if (i10 == 1) {
                return internalGetFields();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMutableMapField(int i10) {
            if (i10 == 1) {
                return internalGetMutableFields();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllFields(Map<String, Value> map) {
            internalGetMutableFields().getMutableMap().putAll(map);
            return this;
        }

        public Builder putFields(String str, Value value) {
            str.getClass();
            value.getClass();
            internalGetMutableFields().getMutableMap().put(str, value);
            return this;
        }

        public Builder removeFields(String str) {
            str.getClass();
            internalGetMutableFields().getMutableMap().remove(str);
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Struct build() {
            Struct structBuildPartial = buildPartial();
            if (structBuildPartial.isInitialized()) {
                return structBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) structBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Struct buildPartial() {
            Struct struct = new Struct(this);
            struct.fields_ = internalGetFields();
            struct.fields_.makeImmutable();
            onBuilt();
            return struct;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Struct getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(gc gcVar) {
            return (Builder) super.setUnknownFields(gcVar);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(gc gcVar) {
            return (Builder) super.mergeUnknownFields(gcVar);
        }

        private Builder() {
            super(null);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            internalGetMutableFields().clear();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Struct) {
                return mergeFrom((Struct) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            internalGetMutableFields().mergeFrom(struct.internalGetFields());
            mergeUnknownFields(struct.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.explorestack.protobuf.Struct.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.Struct.access$500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.Struct r3 = (com.explorestack.protobuf.Struct) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.explorestack.protobuf.Struct r4 = (com.explorestack.protobuf.Struct) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.Struct.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.Struct$Builder");
        }

        private void maybeForceBuilderInitialization() {
        }
    }

    public static Builder newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(struct);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Struct(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Struct) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Struct getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Struct parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Struct parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Struct) PARSER.parseFrom(bArr, m5Var);
    }

    private Struct(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                if (!z11) {
                                    this.fields_ = b9.newMapField(FieldsDefaultEntryHolder.defaultEntry);
                                    z11 = true;
                                }
                                s8 s8Var = (s8) yVar.readMessage(FieldsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                this.fields_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    }
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) k7.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Struct) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Struct parseFrom(y yVar) throws IOException {
        return (Struct) k7.parseWithIOException(PARSER, yVar);
    }

    public static Struct parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Struct) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
