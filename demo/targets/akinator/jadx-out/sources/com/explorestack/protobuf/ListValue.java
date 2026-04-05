package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ListValue extends k7 implements k8 {
    private static final ListValue DEFAULT_INSTANCE = new ListValue();
    private static final fa PARSER = new d() { // from class: com.explorestack.protobuf.ListValue.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public ListValue parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new ListValue(yVar, m5Var);
        }
    };
    public static final int VALUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Value> values_;

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return kb.f22317f;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListValue)) {
            return super.equals(obj);
        }
        ListValue listValue = (ListValue) obj;
        return getValuesList().equals(listValue.getValuesList()) && this.unknownFields.equals(listValue.unknownFields);
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
        int iComputeMessageSize = 0;
        for (int i11 = 0; i11 < this.values_.size(); i11++) {
            iComputeMessageSize += h0.computeMessageSize(1, this.values_.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.k8
    public Value getValues(int i10) {
        return this.values_.get(i10);
    }

    @Override // com.explorestack.protobuf.k8
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.explorestack.protobuf.k8
    public List<Value> getValuesList() {
        return this.values_;
    }

    @Override // com.explorestack.protobuf.k8
    public wc getValuesOrBuilder(int i10) {
        return this.values_.get(i10);
    }

    @Override // com.explorestack.protobuf.k8
    public List<? extends wc> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getValuesCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getValuesList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return kb.f22318g.ensureFieldAccessorsInitialized(ListValue.class, Builder.class);
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
        return new ListValue();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        for (int i10 = 0; i10 < this.values_.size(); i10++) {
            h0Var.writeMessage(1, this.values_.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements k8 {
        private int bitField0_;
        private pa valuesBuilder_;
        private List<Value> values_;

        private void ensureValuesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.values_ = new ArrayList(this.values_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return kb.f22317f;
        }

        private pa getValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
                this.valuesBuilder_ = new pa(this.values_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.values_ = null;
            }
            return this.valuesBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getValuesFieldBuilder();
            }
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            pa paVar = this.valuesBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureValuesIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.values_);
            onChanged();
            return this;
        }

        public Builder addValues(Value value) {
            pa paVar = this.valuesBuilder_;
            if (paVar != null) {
                paVar.addMessage(value);
                return this;
            }
            value.getClass();
            ensureValuesIsMutable();
            this.values_.add(value);
            onChanged();
            return this;
        }

        public Value.Builder addValuesBuilder() {
            return (Value.Builder) getValuesFieldBuilder().addBuilder(Value.getDefaultInstance());
        }

        public Builder clearValues() {
            pa paVar = this.valuesBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.values_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return kb.f22317f;
        }

        @Override // com.explorestack.protobuf.k8
        public Value getValues(int i10) {
            pa paVar = this.valuesBuilder_;
            return paVar == null ? this.values_.get(i10) : (Value) paVar.getMessage(i10);
        }

        public Value.Builder getValuesBuilder(int i10) {
            return (Value.Builder) getValuesFieldBuilder().getBuilder(i10);
        }

        public List<Value.Builder> getValuesBuilderList() {
            return getValuesFieldBuilder().getBuilderList();
        }

        @Override // com.explorestack.protobuf.k8
        public int getValuesCount() {
            pa paVar = this.valuesBuilder_;
            return paVar == null ? this.values_.size() : paVar.getCount();
        }

        @Override // com.explorestack.protobuf.k8
        public List<Value> getValuesList() {
            pa paVar = this.valuesBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.values_) : paVar.getMessageList();
        }

        @Override // com.explorestack.protobuf.k8
        public wc getValuesOrBuilder(int i10) {
            pa paVar = this.valuesBuilder_;
            return paVar == null ? this.values_.get(i10) : (wc) paVar.getMessageOrBuilder(i10);
        }

        @Override // com.explorestack.protobuf.k8
        public List<? extends wc> getValuesOrBuilderList() {
            pa paVar = this.valuesBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.values_);
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return kb.f22318g.ensureFieldAccessorsInitialized(ListValue.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeValues(int i10) {
            pa paVar = this.valuesBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureValuesIsMutable();
            this.values_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setValues(int i10, Value value) {
            pa paVar = this.valuesBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, value);
                return this;
            }
            value.getClass();
            ensureValuesIsMutable();
            this.values_.set(i10, value);
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.values_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ListValue build() {
            ListValue listValueBuildPartial = buildPartial();
            if (listValueBuildPartial.isInitialized()) {
                return listValueBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) listValueBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public ListValue buildPartial() {
            ListValue listValue = new ListValue(this);
            int i10 = this.bitField0_;
            pa paVar = this.valuesBuilder_;
            if (paVar == null) {
                if ((i10 & 1) != 0) {
                    this.values_ = Collections.unmodifiableList(this.values_);
                    this.bitField0_ &= -2;
                }
                listValue.values_ = this.values_;
            } else {
                listValue.values_ = paVar.build();
            }
            onBuilt();
            return listValue;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ListValue getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
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

        public Value.Builder addValuesBuilder(int i10) {
            return (Value.Builder) getValuesFieldBuilder().addBuilder(i10, Value.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(gc gcVar) {
            return (Builder) super.mergeUnknownFields(gcVar);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            pa paVar = this.valuesBuilder_;
            if (paVar == null) {
                this.values_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                return this;
            }
            paVar.clear();
            return this;
        }

        private Builder() {
            super(null);
            this.values_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder addValues(int i10, Value value) {
            pa paVar = this.valuesBuilder_;
            if (paVar == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(i10, value);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, value);
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ListValue) {
                return mergeFrom((ListValue) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setValues(int i10, Value.Builder builder) {
            pa paVar = this.valuesBuilder_;
            if (paVar == null) {
                ensureValuesIsMutable();
                this.values_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(ListValue listValue) {
            if (listValue == ListValue.getDefaultInstance()) {
                return this;
            }
            if (this.valuesBuilder_ == null) {
                if (!listValue.values_.isEmpty()) {
                    if (this.values_.isEmpty()) {
                        this.values_ = listValue.values_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureValuesIsMutable();
                        this.values_.addAll(listValue.values_);
                    }
                    onChanged();
                }
            } else if (!listValue.values_.isEmpty()) {
                if (!this.valuesBuilder_.isEmpty()) {
                    this.valuesBuilder_.addAllMessages(listValue.values_);
                } else {
                    this.valuesBuilder_.dispose();
                    this.valuesBuilder_ = null;
                    this.values_ = listValue.values_;
                    this.bitField0_ &= -2;
                    this.valuesBuilder_ = k7.alwaysUseFieldBuilders ? getValuesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(listValue.unknownFields);
            onChanged();
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            pa paVar = this.valuesBuilder_;
            if (paVar == null) {
                ensureValuesIsMutable();
                this.values_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addValues(int i10, Value.Builder builder) {
            pa paVar = this.valuesBuilder_;
            if (paVar == null) {
                ensureValuesIsMutable();
                this.values_.add(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.explorestack.protobuf.ListValue.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.ListValue.access$400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.ListValue r3 = (com.explorestack.protobuf.ListValue) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.ListValue r4 = (com.explorestack.protobuf.ListValue) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.ListValue.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.ListValue$Builder");
        }
    }

    public static Builder newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listValue);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private ListValue(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (ListValue) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public ListValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ListValue parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private ListValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.values_ = Collections.EMPTY_LIST;
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static ListValue parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (ListValue) PARSER.parseFrom(bArr, m5Var);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) k7.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ListValue(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.values_ = new ArrayList();
                                    z11 = true;
                                }
                                this.values_.add(yVar.readMessage(Value.parser(), m5Var));
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
                if (z11) {
                    this.values_ = Collections.unmodifiableList(this.values_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.values_ = Collections.unmodifiableList(this.values_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static ListValue parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (ListValue) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static ListValue parseFrom(y yVar) throws IOException {
        return (ListValue) k7.parseWithIOException(PARSER, yVar);
    }

    public static ListValue parseFrom(y yVar, m5 m5Var) throws IOException {
        return (ListValue) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
