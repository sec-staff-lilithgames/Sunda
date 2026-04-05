package com.moloco.sdk;

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
public final class MetricsRequest$SDKInitFailureTrackingRequest extends GeneratedMessageLite<MetricsRequest$SDKInitFailureTrackingRequest, q9> implements z9 {
    public static final int CLIENT_ERROR_FIELD_NUMBER = 2;
    private static final MetricsRequest$SDKInitFailureTrackingRequest DEFAULT_INSTANCE;
    private static volatile Parser<MetricsRequest$SDKInitFailureTrackingRequest> PARSER = null;
    public static final int SERVER_ERROR_FIELD_NUMBER = 1;
    private int errorTypeCase_ = 0;
    private Object errorType_;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ClientError extends GeneratedMessageLite<ClientError, r9> implements v9 {
        public static final int CLIENT_FAILURE_TYPE_FIELD_NUMBER = 1;
        private static final ClientError DEFAULT_INSTANCE;
        private static volatile Parser<ClientError> PARSER;
        private int bitField0_;
        private int clientFailureType_;

        static {
            ClientError clientError = new ClientError();
            DEFAULT_INSTANCE = clientError;
            GeneratedMessageLite.registerDefaultInstance(ClientError.class, clientError);
        }

        private ClientError() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientFailureType() {
            this.bitField0_ &= -2;
            this.clientFailureType_ = 0;
        }

        public static ClientError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static r9 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientError parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClientError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientFailureType(u9 u9Var) {
            this.clientFailureType_ = u9Var.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientFailureTypeValue(int i10) {
            this.bitField0_ |= 1;
            this.clientFailureType_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j9.f47261a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientError();
                case 2:
                    return new r9(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "clientFailureType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientError> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ClientError.class) {
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

        @Override // com.moloco.sdk.v9
        public u9 getClientFailureType() {
            u9 u9VarForNumber = u9.forNumber(this.clientFailureType_);
            return u9VarForNumber == null ? u9.UNRECOGNIZED : u9VarForNumber;
        }

        @Override // com.moloco.sdk.v9
        public int getClientFailureTypeValue() {
            return this.clientFailureType_;
        }

        @Override // com.moloco.sdk.v9
        public boolean hasClientFailureType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static r9 newBuilder(ClientError clientError) {
            return DEFAULT_INSTANCE.createBuilder(clientError);
        }

        public static ClientError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientError parseFrom(InputStream inputStream) throws IOException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientError parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ServerError extends GeneratedMessageLite<ServerError, x9> implements y9 {
        private static final ServerError DEFAULT_INSTANCE;
        private static volatile Parser<ServerError> PARSER = null;
        public static final int SERVER_HTTP_STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int serverHttpStatus_;

        static {
            ServerError serverError = new ServerError();
            DEFAULT_INSTANCE = serverError;
            GeneratedMessageLite.registerDefaultInstance(ServerError.class, serverError);
        }

        private ServerError() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerHttpStatus() {
            this.bitField0_ &= -2;
            this.serverHttpStatus_ = 0;
        }

        public static ServerError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static x9 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ServerError parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ServerError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServerError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ServerError> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerHttpStatus(int i10) {
            this.bitField0_ |= 1;
            this.serverHttpStatus_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (j9.f47261a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServerError();
                case 2:
                    return new x9(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "serverHttpStatus_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ServerError> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ServerError.class) {
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

        @Override // com.moloco.sdk.y9
        public int getServerHttpStatus() {
            return this.serverHttpStatus_;
        }

        @Override // com.moloco.sdk.y9
        public boolean hasServerHttpStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        public static x9 newBuilder(ServerError serverError) {
            return DEFAULT_INSTANCE.createBuilder(serverError);
        }

        public static ServerError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServerError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ServerError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ServerError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ServerError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServerError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ServerError parseFrom(InputStream inputStream) throws IOException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServerError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServerError parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ServerError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ServerError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest = new MetricsRequest$SDKInitFailureTrackingRequest();
        DEFAULT_INSTANCE = metricsRequest$SDKInitFailureTrackingRequest;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$SDKInitFailureTrackingRequest.class, metricsRequest$SDKInitFailureTrackingRequest);
    }

    private MetricsRequest$SDKInitFailureTrackingRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientError() {
        if (this.errorTypeCase_ == 2) {
            this.errorTypeCase_ = 0;
            this.errorType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorType() {
        this.errorTypeCase_ = 0;
        this.errorType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerError() {
        if (this.errorTypeCase_ == 1) {
            this.errorTypeCase_ = 0;
            this.errorType_ = null;
        }
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientError(ClientError clientError) {
        clientError.getClass();
        if (this.errorTypeCase_ != 2 || this.errorType_ == ClientError.getDefaultInstance()) {
            this.errorType_ = clientError;
        } else {
            this.errorType_ = ((r9) ClientError.newBuilder((ClientError) this.errorType_).mergeFrom((r9) clientError)).buildPartial();
        }
        this.errorTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerError(ServerError serverError) {
        serverError.getClass();
        if (this.errorTypeCase_ != 1 || this.errorType_ == ServerError.getDefaultInstance()) {
            this.errorType_ = serverError;
        } else {
            this.errorType_ = ((x9) ServerError.newBuilder((ServerError) this.errorType_).mergeFrom((x9) serverError)).buildPartial();
        }
        this.errorTypeCase_ = 1;
    }

    public static q9 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricsRequest$SDKInitFailureTrackingRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientError(ClientError clientError) {
        clientError.getClass();
        this.errorType_ = clientError;
        this.errorTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerError(ServerError serverError) {
        serverError.getClass();
        this.errorType_ = serverError;
        this.errorTypeCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (j9.f47261a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$SDKInitFailureTrackingRequest();
            case 2:
                return new q9(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"errorType_", "errorTypeCase_", ServerError.class, ClientError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$SDKInitFailureTrackingRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricsRequest$SDKInitFailureTrackingRequest.class) {
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

    @Override // com.moloco.sdk.z9
    public ClientError getClientError() {
        return this.errorTypeCase_ == 2 ? (ClientError) this.errorType_ : ClientError.getDefaultInstance();
    }

    @Override // com.moloco.sdk.z9
    public w9 getErrorTypeCase() {
        return w9.forNumber(this.errorTypeCase_);
    }

    @Override // com.moloco.sdk.z9
    public ServerError getServerError() {
        return this.errorTypeCase_ == 1 ? (ServerError) this.errorType_ : ServerError.getDefaultInstance();
    }

    @Override // com.moloco.sdk.z9
    public boolean hasClientError() {
        return this.errorTypeCase_ == 2;
    }

    @Override // com.moloco.sdk.z9
    public boolean hasServerError() {
        return this.errorTypeCase_ == 1;
    }

    public static q9 newBuilder(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        return DEFAULT_INSTANCE.createBuilder(metricsRequest$SDKInitFailureTrackingRequest);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricsRequest$SDKInitFailureTrackingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitFailureTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
