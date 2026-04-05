package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Error extends k7 implements ErrorOrBuilder {
    public static final int ERROR_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int REASON_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private Data error_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private Data reason_;
    private static final Error DEFAULT_INSTANCE = new Error();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Error.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Error parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Error(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Data extends k7 implements DataOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int code_;
        private volatile Object description_;
        private byte memoizedIsInitialized;
        private static final Data DEFAULT_INSTANCE = new Data();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Error.Data.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Data parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Data(yVar, m5Var);
            }
        };

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Data) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return super.equals(obj);
            }
            Data data = (Data) obj;
            return getCode() == data.getCode() && getDescription().equals(data.getDescription()) && this.unknownFields.equals(data.unknownFields);
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public int getCode() {
            return this.code_;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.description_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            int i11 = this.code_;
            int iComputeSInt32Size = i11 != 0 ? h0.computeSInt32Size(1, i11) : 0;
            if (!getDescriptionBytes().isEmpty()) {
                iComputeSInt32Size += k7.computeStringSize(2, this.description_);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeSInt32Size;
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
            int iHashCode = this.unknownFields.hashCode() + ((getDescription().hashCode() + ((((getCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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
            return new Data();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            int i10 = this.code_;
            if (i10 != 0) {
                h0Var.writeSInt32(1, i10);
            }
            if (!getDescriptionBytes().isEmpty()) {
                k7.writeString(h0Var, 2, this.description_);
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements DataOrBuilder {
            private int code_;
            private Object description_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearCode() {
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.description_ = Data.getDefaultInstance().getDescription();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public int getCode() {
                return this.code_;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sdk.Error.DataOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_descriptor;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_Data_fieldAccessorTable.ensureFieldAccessorsInitialized(Data.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCode(int i10) {
                this.code_ = i10;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                b.checkByteStringIsUtf8(byteString);
                this.description_ = byteString;
                onChanged();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data build() {
                Data dataBuildPartial = buildPartial();
                if (dataBuildPartial.isInitialized()) {
                    return dataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data buildPartial() {
                Data data = new Data(this);
                data.code_ = this.code_;
                data.description_ = this.description_;
                onBuilt();
                return data;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Data getDefaultInstanceForType() {
                return Data.getDefaultInstance();
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

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.code_ = 0;
                this.description_ = "";
                return this;
            }

            private Builder() {
                super(null);
                this.description_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Data) {
                    return mergeFrom((Data) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Data data) {
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (data.getCode() != 0) {
                    setCode(data.getCode());
                }
                if (!data.getDescription().isEmpty()) {
                    this.description_ = data.description_;
                    onChanged();
                }
                mergeUnknownFields(((k7) data).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.sdk.Error.Data.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Error.Data.access$700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.sdk.Error$Data r3 = (io.bidmachine.protobuf.sdk.Error.Data) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.sdk.Error$Data r4 = (io.bidmachine.protobuf.sdk.Error.Data) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Error.Data.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Error$Data$Builder");
            }
        }

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Data(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Data parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Data) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Data parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Data() {
            this.memoizedIsInitialized = (byte) -1;
            this.description_ = "";
        }

        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Data parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr, m5Var);
        }

        public static Data parseFrom(InputStream inputStream) throws IOException {
            return (Data) k7.parseWithIOException(PARSER, inputStream);
        }

        private Data(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            this();
            m5Var.getClass();
            cc ccVarNewBuilder = gc.newBuilder();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.code_ = yVar.readSInt32();
                            } else if (tag != 18) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                this.description_ = yVar.readStringRequireUtf8();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
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

        public static Data parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Data) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Data parseFrom(y yVar) throws IOException {
            return (Data) k7.parseWithIOException(PARSER, yVar);
        }

        public static Data parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Data) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DataOrBuilder extends MessageOrBuilder {
        int getCode();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getDescription();

        ByteString getDescriptionBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Error getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Error) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return super.equals(obj);
        }
        Error error = (Error) obj;
        if (!getName().equals(error.getName()) || hasError() != error.hasError()) {
            return false;
        }
        if ((!hasError() || getError().equals(error.getError())) && hasReason() == error.hasReason()) {
            return (!hasReason() || getReason().equals(error.getReason())) && this.unknownFields.equals(error.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public Data getError() {
        Data data = this.error_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public DataOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public Data getReason() {
        Data data = this.reason_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public DataOrBuilder getReasonOrBuilder() {
        return getReason();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? k7.computeStringSize(1, this.name_) : 0;
        if (this.error_ != null) {
            iComputeStringSize += h0.computeMessageSize(2, getError());
        }
        if (this.reason_ != null) {
            iComputeStringSize += h0.computeMessageSize(3, getReason());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
    public boolean hasReason() {
        return this.reason_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasError()) {
            iHashCode = getError().hashCode() + o2.B(iHashCode, 37, 2, 53);
        }
        if (hasReason()) {
            iHashCode = getReason().hashCode() + o2.B(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
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
        return new Error();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getNameBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.name_);
        }
        if (this.error_ != null) {
            h0Var.writeMessage(2, getError());
        }
        if (this.reason_ != null) {
            h0Var.writeMessage(3, getReason());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements ErrorOrBuilder {
        private xa errorBuilder_;
        private Data error_;
        private Object name_;
        private xa reasonBuilder_;
        private Data reason_;

        private Builder() {
            super(null);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
        }

        private xa getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new xa(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        private xa getReasonFieldBuilder() {
            if (this.reasonBuilder_ == null) {
                this.reasonBuilder_ = new xa(getReason(), getParentForChildren(), isClean());
                this.reason_ = null;
            }
            return this.reasonBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearError() {
            if (this.errorBuilder_ == null) {
                this.error_ = null;
                onChanged();
                return this;
            }
            this.error_ = null;
            this.errorBuilder_ = null;
            return this;
        }

        public Builder clearName() {
            this.name_ = Error.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder clearReason() {
            if (this.reasonBuilder_ == null) {
                this.reason_ = null;
                onChanged();
                return this;
            }
            this.reason_ = null;
            this.reasonBuilder_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public Data getError() {
            xa xaVar = this.errorBuilder_;
            if (xaVar != null) {
                return (Data) xaVar.getMessage();
            }
            Data data = this.error_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        public Data.Builder getErrorBuilder() {
            onChanged();
            return (Data.Builder) getErrorFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public DataOrBuilder getErrorOrBuilder() {
            xa xaVar = this.errorBuilder_;
            if (xaVar != null) {
                return (DataOrBuilder) xaVar.getMessageOrBuilder();
            }
            Data data = this.error_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public Data getReason() {
            xa xaVar = this.reasonBuilder_;
            if (xaVar != null) {
                return (Data) xaVar.getMessage();
            }
            Data data = this.reason_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        public Data.Builder getReasonBuilder() {
            onChanged();
            return (Data.Builder) getReasonFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public DataOrBuilder getReasonOrBuilder() {
            xa xaVar = this.reasonBuilder_;
            if (xaVar != null) {
                return (DataOrBuilder) xaVar.getMessageOrBuilder();
            }
            Data data = this.reason_;
            return data == null ? Data.getDefaultInstance() : data;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ErrorOrBuilder
        public boolean hasReason() {
            return (this.reasonBuilder_ == null && this.reason_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKErrorsProto.internal_static_bidmachine_protobuf_sdk_errors_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeError(Data data) {
            xa xaVar = this.errorBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(data);
                return this;
            }
            Data data2 = this.error_;
            if (data2 != null) {
                this.error_ = Data.newBuilder(data2).mergeFrom(data).buildPartial();
            } else {
                this.error_ = data;
            }
            onChanged();
            return this;
        }

        public Builder mergeReason(Data data) {
            xa xaVar = this.reasonBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(data);
                return this;
            }
            Data data2 = this.reason_;
            if (data2 != null) {
                this.reason_ = Data.newBuilder(data2).mergeFrom(data).buildPartial();
            } else {
                this.reason_ = data;
            }
            onChanged();
            return this;
        }

        public Builder setError(Data data) {
            xa xaVar = this.errorBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(data);
                return this;
            }
            data.getClass();
            this.error_ = data;
            onChanged();
            return this;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        public Builder setReason(Data data) {
            xa xaVar = this.reasonBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(data);
                return this;
            }
            data.getClass();
            this.reason_ = data;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Error build() {
            Error errorBuildPartial = buildPartial();
            if (errorBuildPartial.isInitialized()) {
                return errorBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) errorBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Error buildPartial() {
            Error error = new Error(this);
            error.name_ = this.name_;
            xa xaVar = this.errorBuilder_;
            if (xaVar == null) {
                error.error_ = this.error_;
            } else {
                error.error_ = (Data) xaVar.build();
            }
            xa xaVar2 = this.reasonBuilder_;
            if (xaVar2 == null) {
                error.reason_ = this.reason_;
            } else {
                error.reason_ = (Data) xaVar2.build();
            }
            onBuilt();
            return error;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Error getDefaultInstanceForType() {
            return Error.getDefaultInstance();
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

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.name_ = "";
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            if (this.reasonBuilder_ == null) {
                this.reason_ = null;
                return this;
            }
            this.reason_ = null;
            this.reasonBuilder_ = null;
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.name_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setError(Data.Builder builder) {
            xa xaVar = this.errorBuilder_;
            if (xaVar == null) {
                this.error_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setReason(Data.Builder builder) {
            xa xaVar = this.reasonBuilder_;
            if (xaVar == null) {
                this.reason_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Error) {
                return mergeFrom((Error) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Error error) {
            if (error == Error.getDefaultInstance()) {
                return this;
            }
            if (!error.getName().isEmpty()) {
                this.name_ = error.name_;
                onChanged();
            }
            if (error.hasError()) {
                mergeError(error.getError());
            }
            if (error.hasReason()) {
                mergeReason(error.getReason());
            }
            mergeUnknownFields(((k7) error).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.Error.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Error.access$1800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Error r3 = (io.bidmachine.protobuf.sdk.Error) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Error r4 = (io.bidmachine.protobuf.sdk.Error) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Error.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Error$Builder");
        }
    }

    public static Builder newBuilder(Error error) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
    }

    public static Error parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Error(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Error parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Error) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Error getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Error parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Error() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
    }

    public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Error parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Error) PARSER.parseFrom(bArr, m5Var);
    }

    public static Error parseFrom(InputStream inputStream) throws IOException {
        return (Error) k7.parseWithIOException(PARSER, inputStream);
    }

    private Error(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        Data.Builder builder;
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (tag == 18) {
                                    Data data = this.error_;
                                    builder = data != null ? data.toBuilder() : null;
                                    Data data2 = (Data) yVar.readMessage(Data.parser(), m5Var);
                                    this.error_ = data2;
                                    if (builder != null) {
                                        builder.mergeFrom(data2);
                                        this.error_ = builder.buildPartial();
                                    }
                                } else if (tag != 26) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    Data data3 = this.reason_;
                                    builder = data3 != null ? data3.toBuilder() : null;
                                    Data data4 = (Data) yVar.readMessage(Data.parser(), m5Var);
                                    this.reason_ = data4;
                                    if (builder != null) {
                                        builder.mergeFrom(data4);
                                        this.reason_ = builder.buildPartial();
                                    }
                                }
                            } else {
                                this.name_ = yVar.readStringRequireUtf8();
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

    public static Error parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Error) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Error parseFrom(y yVar) throws IOException {
        return (Error) k7.parseWithIOException(PARSER, yVar);
    }

    public static Error parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Error) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
