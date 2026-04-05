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
public final class MetricsRequest$SDKInitTrackingRequest extends GeneratedMessageLite<MetricsRequest$SDKInitTrackingRequest, ba> implements da {
    private static final MetricsRequest$SDKInitTrackingRequest DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 2;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile Parser<MetricsRequest$SDKInitTrackingRequest> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int initStatusCase_ = 0;
    private Object initStatus_;
    private long latencyMs_;

    static {
        MetricsRequest$SDKInitTrackingRequest metricsRequest$SDKInitTrackingRequest = new MetricsRequest$SDKInitTrackingRequest();
        DEFAULT_INSTANCE = metricsRequest$SDKInitTrackingRequest;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$SDKInitTrackingRequest.class, metricsRequest$SDKInitTrackingRequest);
    }

    private MetricsRequest$SDKInitTrackingRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailure() {
        if (this.initStatusCase_ == 2) {
            this.initStatusCase_ = 0;
            this.initStatus_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitStatus() {
        this.initStatusCase_ = 0;
        this.initStatus_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -2;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        if (this.initStatusCase_ == 1) {
            this.initStatusCase_ = 0;
            this.initStatus_ = null;
        }
    }

    public static MetricsRequest$SDKInitTrackingRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFailure(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        metricsRequest$SDKInitFailureTrackingRequest.getClass();
        if (this.initStatusCase_ != 2 || this.initStatus_ == MetricsRequest$SDKInitFailureTrackingRequest.getDefaultInstance()) {
            this.initStatus_ = metricsRequest$SDKInitFailureTrackingRequest;
        } else {
            this.initStatus_ = ((q9) MetricsRequest$SDKInitFailureTrackingRequest.newBuilder((MetricsRequest$SDKInitFailureTrackingRequest) this.initStatus_).mergeFrom((q9) metricsRequest$SDKInitFailureTrackingRequest)).buildPartial();
        }
        this.initStatusCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuccess(MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest) {
        metricsRequest$SDKInitSuccessTrackingRequest.getClass();
        if (this.initStatusCase_ != 1 || this.initStatus_ == MetricsRequest$SDKInitSuccessTrackingRequest.getDefaultInstance()) {
            this.initStatus_ = metricsRequest$SDKInitSuccessTrackingRequest;
        } else {
            this.initStatus_ = ((aa) MetricsRequest$SDKInitSuccessTrackingRequest.newBuilder((MetricsRequest$SDKInitSuccessTrackingRequest) this.initStatus_).mergeFrom((aa) metricsRequest$SDKInitSuccessTrackingRequest)).buildPartial();
        }
        this.initStatusCase_ = 1;
    }

    public static ba newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricsRequest$SDKInitTrackingRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MetricsRequest$SDKInitTrackingRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailure(MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest) {
        metricsRequest$SDKInitFailureTrackingRequest.getClass();
        this.initStatus_ = metricsRequest$SDKInitFailureTrackingRequest;
        this.initStatusCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j10) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(MetricsRequest$SDKInitSuccessTrackingRequest metricsRequest$SDKInitSuccessTrackingRequest) {
        metricsRequest$SDKInitSuccessTrackingRequest.getClass();
        this.initStatus_ = metricsRequest$SDKInitSuccessTrackingRequest;
        this.initStatusCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (j9.f47261a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$SDKInitTrackingRequest();
            case 2:
                return new ba(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဃ\u0000", new Object[]{"initStatus_", "initStatusCase_", "bitField0_", MetricsRequest$SDKInitSuccessTrackingRequest.class, MetricsRequest$SDKInitFailureTrackingRequest.class, "latencyMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$SDKInitTrackingRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (MetricsRequest$SDKInitTrackingRequest.class) {
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

    @Override // com.moloco.sdk.da
    public MetricsRequest$SDKInitFailureTrackingRequest getFailure() {
        return this.initStatusCase_ == 2 ? (MetricsRequest$SDKInitFailureTrackingRequest) this.initStatus_ : MetricsRequest$SDKInitFailureTrackingRequest.getDefaultInstance();
    }

    @Override // com.moloco.sdk.da
    public ca getInitStatusCase() {
        return ca.forNumber(this.initStatusCase_);
    }

    @Override // com.moloco.sdk.da
    public long getLatencyMs() {
        return this.latencyMs_;
    }

    @Override // com.moloco.sdk.da
    public MetricsRequest$SDKInitSuccessTrackingRequest getSuccess() {
        return this.initStatusCase_ == 1 ? (MetricsRequest$SDKInitSuccessTrackingRequest) this.initStatus_ : MetricsRequest$SDKInitSuccessTrackingRequest.getDefaultInstance();
    }

    @Override // com.moloco.sdk.da
    public boolean hasFailure() {
        return this.initStatusCase_ == 2;
    }

    @Override // com.moloco.sdk.da
    public boolean hasLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.moloco.sdk.da
    public boolean hasSuccess() {
        return this.initStatusCase_ == 1;
    }

    public static ba newBuilder(MetricsRequest$SDKInitTrackingRequest metricsRequest$SDKInitTrackingRequest) {
        return DEFAULT_INSTANCE.createBuilder(metricsRequest$SDKInitTrackingRequest);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(InputStream inputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MetricsRequest$SDKInitTrackingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricsRequest$SDKInitTrackingRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
