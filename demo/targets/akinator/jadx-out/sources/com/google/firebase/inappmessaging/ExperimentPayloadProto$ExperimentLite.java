package com.google.firebase.inappmessaging;

import bj.k0;
import bj.l0;
import bj.m0;
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
/* loaded from: classes7.dex */
public final class ExperimentPayloadProto$ExperimentLite extends GeneratedMessageLite<ExperimentPayloadProto$ExperimentLite, l0> implements m0 {
    private static final ExperimentPayloadProto$ExperimentLite DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile Parser<ExperimentPayloadProto$ExperimentLite> PARSER;
    private String experimentId_ = "";

    static {
        ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite = new ExperimentPayloadProto$ExperimentLite();
        DEFAULT_INSTANCE = experimentPayloadProto$ExperimentLite;
        GeneratedMessageLite.registerDefaultInstance(ExperimentPayloadProto$ExperimentLite.class, experimentPayloadProto$ExperimentLite);
    }

    private ExperimentPayloadProto$ExperimentLite() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentId() {
        this.experimentId_ = getDefaultInstance().getExperimentId();
    }

    public static ExperimentPayloadProto$ExperimentLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l0 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExperimentPayloadProto$ExperimentLite parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExperimentPayloadProto$ExperimentLite> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentId(String str) {
        str.getClass();
        this.experimentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.experimentId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (k0.f9647a[methodToInvoke.ordinal()]) {
            case 1:
                return new ExperimentPayloadProto$ExperimentLite();
            case 2:
                return new l0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExperimentPayloadProto$ExperimentLite> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ExperimentPayloadProto$ExperimentLite.class) {
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

    @Override // bj.m0
    public String getExperimentId() {
        return this.experimentId_;
    }

    @Override // bj.m0
    public ByteString getExperimentIdBytes() {
        return ByteString.copyFromUtf8(this.experimentId_);
    }

    public static l0 newBuilder(ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        return DEFAULT_INSTANCE.createBuilder(experimentPayloadProto$ExperimentLite);
    }

    public static ExperimentPayloadProto$ExperimentLite parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(InputStream inputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
