package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
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
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SDK extends k7 implements SDKOrBuilder {
    public static final int OMIDPN_FIELD_NUMBER = 3;
    public static final int OMIDPV_FIELD_NUMBER = 4;
    public static final int SDKVER_FIELD_NUMBER = 2;
    public static final int SDK_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object omidpn_;
    private volatile Object omidpv_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private static final SDK DEFAULT_INSTANCE = new SDK();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.SDK.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public SDK parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new SDK(yVar, m5Var);
        }
    };

    public static SDK getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SDK parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDK) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDK parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDK)) {
            return super.equals(obj);
        }
        SDK sdk = (SDK) obj;
        return getSdk().equals(sdk.getSdk()) && getSdkver().equals(sdk.getSdkver()) && getOmidpn().equals(sdk.getOmidpn()) && getOmidpv().equals(sdk.getOmidpv()) && this.unknownFields.equals(sdk.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public String getOmidpn() {
        Object obj = this.omidpn_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.omidpn_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public ByteString getOmidpnBytes() {
        Object obj = this.omidpn_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.omidpn_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public String getOmidpv() {
        Object obj = this.omidpv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.omidpv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public ByteString getOmidpvBytes() {
        Object obj = this.omidpv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.omidpv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getSdkBytes().isEmpty() ? k7.computeStringSize(1, this.sdk_) : 0;
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.sdkver_);
        }
        if (!getOmidpnBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(3, this.omidpn_);
        }
        if (!getOmidpvBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(4, this.omidpv_);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
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
        int iHashCode = this.unknownFields.hashCode() + ((getOmidpv().hashCode() + ((((getOmidpn().hashCode() + ((((getSdkver().hashCode() + ((((getSdk().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_fieldAccessorTable.ensureFieldAccessorsInitialized(SDK.class, Builder.class);
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
        return new SDK();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getSdkBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.sdkver_);
        }
        if (!getOmidpnBytes().isEmpty()) {
            k7.writeString(h0Var, 3, this.omidpn_);
        }
        if (!getOmidpvBytes().isEmpty()) {
            k7.writeString(h0Var, 4, this.omidpv_);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements SDKOrBuilder {
        private Object omidpn_;
        private Object omidpv_;
        private Object sdk_;
        private Object sdkver_;

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearOmidpn() {
            this.omidpn_ = SDK.getDefaultInstance().getOmidpn();
            onChanged();
            return this;
        }

        public Builder clearOmidpv() {
            this.omidpv_ = SDK.getDefaultInstance().getOmidpv();
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = SDK.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = SDK.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public String getOmidpn() {
            Object obj = this.omidpn_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.omidpn_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public ByteString getOmidpnBytes() {
            Object obj = this.omidpn_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.omidpn_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public String getOmidpv() {
            Object obj = this.omidpv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.omidpv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public ByteString getOmidpvBytes() {
            Object obj = this.omidpv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.omidpv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.SDKOrBuilder
        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_SDK_fieldAccessorTable.ensureFieldAccessorsInitialized(SDK.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setOmidpn(String str) {
            str.getClass();
            this.omidpn_ = str;
            onChanged();
            return this;
        }

        public Builder setOmidpnBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.omidpn_ = byteString;
            onChanged();
            return this;
        }

        public Builder setOmidpv(String str) {
            str.getClass();
            this.omidpv_ = str;
            onChanged();
            return this;
        }

        public Builder setOmidpvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.omidpv_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdk(String str) {
            str.getClass();
            this.sdk_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.sdk_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdkver(String str) {
            str.getClass();
            this.sdkver_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.sdk_ = "";
            this.sdkver_ = "";
            this.omidpn_ = "";
            this.omidpv_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDK build() {
            SDK sdkBuildPartial = buildPartial();
            if (sdkBuildPartial.isInitialized()) {
                return sdkBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sdkBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SDK buildPartial() {
            SDK sdk = new SDK(this);
            sdk.sdk_ = this.sdk_;
            sdk.sdkver_ = this.sdkver_;
            sdk.omidpn_ = this.omidpn_;
            sdk.omidpv_ = this.omidpv_;
            onBuilt();
            return sdk;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SDK getDefaultInstanceForType() {
            return SDK.getDefaultInstance();
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
            this.sdk_ = "";
            this.sdkver_ = "";
            this.omidpn_ = "";
            this.omidpv_ = "";
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SDK) {
                return mergeFrom((SDK) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder() {
            super(null);
            this.sdk_ = "";
            this.sdkver_ = "";
            this.omidpn_ = "";
            this.omidpv_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(SDK sdk) {
            if (sdk == SDK.getDefaultInstance()) {
                return this;
            }
            if (!sdk.getSdk().isEmpty()) {
                this.sdk_ = sdk.sdk_;
                onChanged();
            }
            if (!sdk.getSdkver().isEmpty()) {
                this.sdkver_ = sdk.sdkver_;
                onChanged();
            }
            if (!sdk.getOmidpn().isEmpty()) {
                this.omidpn_ = sdk.omidpn_;
                onChanged();
            }
            if (!sdk.getOmidpv().isEmpty()) {
                this.omidpv_ = sdk.omidpv_;
                onChanged();
            }
            mergeUnknownFields(((k7) sdk).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.SDK.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.SDK.access$900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.SDK r3 = (io.bidmachine.protobuf.sdk.SDK) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.SDK r4 = (io.bidmachine.protobuf.sdk.SDK) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.SDK.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.SDK$Builder");
        }
    }

    public static Builder newBuilder(SDK sdk) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sdk);
    }

    public static SDK parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private SDK(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SDK parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (SDK) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static SDK parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SDK getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SDK parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SDK() {
        this.memoizedIsInitialized = (byte) -1;
        this.sdk_ = "";
        this.sdkver_ = "";
        this.omidpn_ = "";
        this.omidpv_ = "";
    }

    public static SDK parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static SDK parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (SDK) PARSER.parseFrom(bArr, m5Var);
    }

    public static SDK parseFrom(InputStream inputStream) throws IOException {
        return (SDK) k7.parseWithIOException(PARSER, inputStream);
    }

    public static SDK parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (SDK) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    private SDK(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            this.sdk_ = yVar.readStringRequireUtf8();
                        } else if (tag == 18) {
                            this.sdkver_ = yVar.readStringRequireUtf8();
                        } else if (tag == 26) {
                            this.omidpn_ = yVar.readStringRequireUtf8();
                        } else if (tag != 34) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            this.omidpv_ = yVar.readStringRequireUtf8();
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

    public static SDK parseFrom(y yVar) throws IOException {
        return (SDK) k7.parseWithIOException(PARSER, yVar);
    }

    public static SDK parseFrom(y yVar, m5 m5Var) throws IOException {
        return (SDK) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
