package io.bidmachine.protobuf;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.f8;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.g8;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.ka;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class TokenConfiguration extends k7 implements TokenConfigurationOrBuilder {
    public static final int AD_NETWORKS_FIELD_NUMBER = 3;
    public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private g8 adNetworks_;
    private int expirationTime_;
    private byte memoizedIsInitialized;
    private volatile Object type_;
    private static final TokenConfiguration DEFAULT_INSTANCE = new TokenConfiguration();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.TokenConfiguration.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public TokenConfiguration parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new TokenConfiguration(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements TokenConfigurationOrBuilder {
        private g8 adNetworks_;
        private int bitField0_;
        private int expirationTime_;
        private Object type_;

        private void ensureAdNetworksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adNetworks_ = new f8(this.adNetworks_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder addAdNetworks(String str) {
            str.getClass();
            ensureAdNetworksIsMutable();
            this.adNetworks_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addAdNetworksBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            ensureAdNetworksIsMutable();
            this.adNetworks_.add(byteString);
            onChanged();
            return this;
        }

        public Builder addAllAdNetworks(Iterable<String> iterable) {
            ensureAdNetworksIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.adNetworks_);
            onChanged();
            return this;
        }

        public Builder clearAdNetworks() {
            this.adNetworks_ = f8.f22138e;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearExpirationTime() {
            this.expirationTime_ = 0;
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.type_ = TokenConfiguration.getDefaultInstance().getType();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public String getAdNetworks(int i10) {
            return (String) this.adNetworks_.get(i10);
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public ByteString getAdNetworksBytes(int i10) {
            return this.adNetworks_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public int getAdNetworksCount() {
            return this.adNetworks_.size();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_descriptor;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public int getExpirationTime() {
            return this.expirationTime_;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(TokenConfiguration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAdNetworks(int i10, String str) {
            str.getClass();
            ensureAdNetworksIsMutable();
            this.adNetworks_.set(i10, (int) str);
            onChanged();
            return this;
        }

        public Builder setExpirationTime(int i10) {
            this.expirationTime_ = i10;
            onChanged();
            return this;
        }

        public Builder setType(String str) {
            str.getClass();
            this.type_ = str;
            onChanged();
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.type_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
        public ka getAdNetworksList() {
            return this.adNetworks_.getUnmodifiableView();
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.type_ = "";
            this.adNetworks_ = f8.f22138e;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public TokenConfiguration build() {
            TokenConfiguration tokenConfigurationBuildPartial = buildPartial();
            if (tokenConfigurationBuildPartial.isInitialized()) {
                return tokenConfigurationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) tokenConfigurationBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public TokenConfiguration buildPartial() {
            TokenConfiguration tokenConfiguration = new TokenConfiguration(this);
            tokenConfiguration.type_ = this.type_;
            tokenConfiguration.expirationTime_ = this.expirationTime_;
            if ((this.bitField0_ & 1) != 0) {
                this.adNetworks_ = this.adNetworks_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            tokenConfiguration.adNetworks_ = this.adNetworks_;
            onBuilt();
            return tokenConfiguration;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public TokenConfiguration getDefaultInstanceForType() {
            return TokenConfiguration.getDefaultInstance();
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
            this.type_ = "";
            this.expirationTime_ = 0;
            this.adNetworks_ = f8.f22138e;
            this.bitField0_ &= -2;
            return this;
        }

        private Builder() {
            super(null);
            this.type_ = "";
            this.adNetworks_ = f8.f22138e;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof TokenConfiguration) {
                return mergeFrom((TokenConfiguration) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(TokenConfiguration tokenConfiguration) {
            if (tokenConfiguration == TokenConfiguration.getDefaultInstance()) {
                return this;
            }
            if (!tokenConfiguration.getType().isEmpty()) {
                this.type_ = tokenConfiguration.type_;
                onChanged();
            }
            if (tokenConfiguration.getExpirationTime() != 0) {
                setExpirationTime(tokenConfiguration.getExpirationTime());
            }
            if (!tokenConfiguration.adNetworks_.isEmpty()) {
                if (this.adNetworks_.isEmpty()) {
                    this.adNetworks_ = tokenConfiguration.adNetworks_;
                    this.bitField0_ &= -2;
                } else {
                    ensureAdNetworksIsMutable();
                    this.adNetworks_.addAll(tokenConfiguration.adNetworks_);
                }
                onChanged();
            }
            mergeUnknownFields(((k7) tokenConfiguration).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.TokenConfiguration.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.TokenConfiguration.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.TokenConfiguration r3 = (io.bidmachine.protobuf.TokenConfiguration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.TokenConfiguration r4 = (io.bidmachine.protobuf.TokenConfiguration) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.TokenConfiguration.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.TokenConfiguration$Builder");
        }
    }

    public static TokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static TokenConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TokenConfiguration) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static TokenConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TokenConfiguration) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenConfiguration)) {
            return super.equals(obj);
        }
        TokenConfiguration tokenConfiguration = (TokenConfiguration) obj;
        return getType().equals(tokenConfiguration.getType()) && getExpirationTime() == tokenConfiguration.getExpirationTime() && getAdNetworksList().equals(tokenConfiguration.getAdNetworksList()) && this.unknownFields.equals(tokenConfiguration.unknownFields);
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public String getAdNetworks(int i10) {
        return (String) this.adNetworks_.get(i10);
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public ByteString getAdNetworksBytes(int i10) {
        return this.adNetworks_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public int getAdNetworksCount() {
        return this.adNetworks_.size();
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public int getExpirationTime() {
        return this.expirationTime_;
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
        int iComputeStringSize = !getTypeBytes().isEmpty() ? k7.computeStringSize(1, this.type_) : 0;
        int i11 = this.expirationTime_;
        if (i11 != 0) {
            iComputeStringSize += h0.computeInt32Size(2, i11);
        }
        int iE = 0;
        for (int i12 = 0; i12 < this.adNetworks_.size(); i12++) {
            iE = a.e(this.adNetworks_, i12, iE);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + getAdNetworksList().size() + iComputeStringSize + iE;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public String getType() {
        Object obj = this.type_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.type_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public ByteString getTypeBytes() {
        Object obj = this.type_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.type_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
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
        int expirationTime = getExpirationTime() + ((((getType().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (getAdNetworksCount() > 0) {
            expirationTime = o2.B(expirationTime, 37, 3, 53) + getAdNetworksList().hashCode();
        }
        int iHashCode = this.unknownFields.hashCode() + (expirationTime * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_TokenConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(TokenConfiguration.class, Builder.class);
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
        return new TokenConfiguration();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getTypeBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.type_);
        }
        int i10 = this.expirationTime_;
        if (i10 != 0) {
            h0Var.writeInt32(2, i10);
        }
        int iF = 0;
        while (iF < this.adNetworks_.size()) {
            iF = a.f(this.adNetworks_, iF, h0Var, 3, iF, 1);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static Builder newBuilder(TokenConfiguration tokenConfiguration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(tokenConfiguration);
    }

    public static TokenConfiguration parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (TokenConfiguration) PARSER.parseFrom(byteBuffer, m5Var);
    }

    @Override // io.bidmachine.protobuf.TokenConfigurationOrBuilder
    public ka getAdNetworksList() {
        return this.adNetworks_;
    }

    private TokenConfiguration(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static TokenConfiguration parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (TokenConfiguration) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static TokenConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TokenConfiguration) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public TokenConfiguration getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static TokenConfiguration parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (TokenConfiguration) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private TokenConfiguration() {
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = "";
        this.adNetworks_ = f8.f22138e;
    }

    public static TokenConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TokenConfiguration) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static TokenConfiguration parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (TokenConfiguration) PARSER.parseFrom(bArr, m5Var);
    }

    public static TokenConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (TokenConfiguration) k7.parseWithIOException(PARSER, inputStream);
    }

    private TokenConfiguration(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            if (tag == 10) {
                                this.type_ = yVar.readStringRequireUtf8();
                            } else if (tag == 16) {
                                this.expirationTime_ = yVar.readInt32();
                            } else if (tag != 26) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                if (!z11) {
                                    this.adNetworks_ = new f8();
                                    z11 = true;
                                }
                                this.adNetworks_.add((g8) stringRequireUtf8);
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
                    this.adNetworks_ = this.adNetworks_.getUnmodifiableView();
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.adNetworks_ = this.adNetworks_.getUnmodifiableView();
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static TokenConfiguration parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (TokenConfiguration) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static TokenConfiguration parseFrom(y yVar) throws IOException {
        return (TokenConfiguration) k7.parseWithIOException(PARSER, yVar);
    }

    public static TokenConfiguration parseFrom(y yVar, m5 m5Var) throws IOException {
        return (TokenConfiguration) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
