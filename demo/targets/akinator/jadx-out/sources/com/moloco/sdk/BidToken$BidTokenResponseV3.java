package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class BidToken$BidTokenResponseV3 extends GeneratedMessageLite<BidToken$BidTokenResponseV3, n5> implements q5 {
    public static final int BID_TOKEN_FIELD_NUMBER = 1;
    public static final int CLIENT_TOKEN_CONFIGS_FIELD_NUMBER = 3;
    private static final BidToken$BidTokenResponseV3 DEFAULT_INSTANCE;
    private static volatile Parser<BidToken$BidTokenResponseV3> PARSER = null;
    public static final int PK_FIELD_NUMBER = 2;
    private ClientTokenConfigs clientTokenConfigs_;
    private String bidToken_ = "";
    private String pk_ = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ClientTokenConfigs extends GeneratedMessageLite<ClientTokenConfigs, o5> implements p5 {
        private static final ClientTokenConfigs DEFAULT_INSTANCE;
        public static final int ENABLE_DBT_FIELD_NUMBER = 1;
        private static volatile Parser<ClientTokenConfigs> PARSER;
        private boolean enableDbt_;

        static {
            ClientTokenConfigs clientTokenConfigs = new ClientTokenConfigs();
            DEFAULT_INSTANCE = clientTokenConfigs;
            GeneratedMessageLite.registerDefaultInstance(ClientTokenConfigs.class, clientTokenConfigs);
        }

        private ClientTokenConfigs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableDbt() {
            this.enableDbt_ = false;
        }

        public static ClientTokenConfigs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static o5 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientTokenConfigs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientTokenConfigs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClientTokenConfigs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableDbt(boolean z10) {
            this.enableDbt_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (d5.f45721a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientTokenConfigs();
                case 2:
                    return new o5(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"enableDbt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientTokenConfigs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ClientTokenConfigs.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.moloco.sdk.p5
        public boolean getEnableDbt() {
            return this.enableDbt_;
        }

        public static o5 newBuilder(ClientTokenConfigs clientTokenConfigs) {
            return DEFAULT_INSTANCE.createBuilder(clientTokenConfigs);
        }

        public static ClientTokenConfigs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientTokenConfigs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientTokenConfigs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientTokenConfigs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientTokenConfigs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientTokenConfigs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientTokenConfigs parseFrom(InputStream inputStream) throws IOException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientTokenConfigs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientTokenConfigs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientTokenConfigs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientTokenConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        BidToken$BidTokenResponseV3 bidToken$BidTokenResponseV3 = new BidToken$BidTokenResponseV3();
        DEFAULT_INSTANCE = bidToken$BidTokenResponseV3;
        GeneratedMessageLite.registerDefaultInstance(BidToken$BidTokenResponseV3.class, bidToken$BidTokenResponseV3);
    }

    private BidToken$BidTokenResponseV3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBidToken() {
        this.bidToken_ = getDefaultInstance().getBidToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTokenConfigs() {
        this.clientTokenConfigs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPk() {
        this.pk_ = getDefaultInstance().getPk();
    }

    public static BidToken$BidTokenResponseV3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientTokenConfigs(ClientTokenConfigs clientTokenConfigs) {
        clientTokenConfigs.getClass();
        ClientTokenConfigs clientTokenConfigs2 = this.clientTokenConfigs_;
        if (clientTokenConfigs2 == null || clientTokenConfigs2 == ClientTokenConfigs.getDefaultInstance()) {
            this.clientTokenConfigs_ = clientTokenConfigs;
        } else {
            this.clientTokenConfigs_ = (ClientTokenConfigs) ((o5) ClientTokenConfigs.newBuilder(this.clientTokenConfigs_).mergeFrom((o5) clientTokenConfigs)).buildPartial();
        }
    }

    public static n5 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BidToken$BidTokenResponseV3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BidToken$BidTokenResponseV3> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBidToken(String str) {
        str.getClass();
        this.bidToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBidTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bidToken_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTokenConfigs(ClientTokenConfigs clientTokenConfigs) {
        clientTokenConfigs.getClass();
        this.clientTokenConfigs_ = clientTokenConfigs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPk(String str) {
        str.getClass();
        this.pk_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPkBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pk_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (d5.f45721a[methodToInvoke.ordinal()]) {
            case 1:
                return new BidToken$BidTokenResponseV3();
            case 2:
                return new n5(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"bidToken_", "pk_", "clientTokenConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BidToken$BidTokenResponseV3> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BidToken$BidTokenResponseV3.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.moloco.sdk.q5
    public String getBidToken() {
        return this.bidToken_;
    }

    @Override // com.moloco.sdk.q5
    public ByteString getBidTokenBytes() {
        return ByteString.copyFromUtf8(this.bidToken_);
    }

    @Override // com.moloco.sdk.q5
    public ClientTokenConfigs getClientTokenConfigs() {
        ClientTokenConfigs clientTokenConfigs = this.clientTokenConfigs_;
        return clientTokenConfigs == null ? ClientTokenConfigs.getDefaultInstance() : clientTokenConfigs;
    }

    @Override // com.moloco.sdk.q5
    public String getPk() {
        return this.pk_;
    }

    @Override // com.moloco.sdk.q5
    public ByteString getPkBytes() {
        return ByteString.copyFromUtf8(this.pk_);
    }

    @Override // com.moloco.sdk.q5
    public boolean hasClientTokenConfigs() {
        return this.clientTokenConfigs_ != null;
    }

    public static n5 newBuilder(BidToken$BidTokenResponseV3 bidToken$BidTokenResponseV3) {
        return DEFAULT_INSTANCE.createBuilder(bidToken$BidTokenResponseV3);
    }

    public static BidToken$BidTokenResponseV3 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(InputStream inputStream) throws IOException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BidToken$BidTokenResponseV3 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BidToken$BidTokenResponseV3) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
