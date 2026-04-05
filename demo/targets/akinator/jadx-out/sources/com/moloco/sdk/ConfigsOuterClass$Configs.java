package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigsOuterClass$Configs extends GeneratedMessageLite<ConfigsOuterClass$Configs, j7> implements q7 {
    public static final int ANDROID_CONFIG_FIELD_NUMBER = 1;
    public static final int COMMON_CONFIGS_FIELD_NUMBER = 3;
    private static final ConfigsOuterClass$Configs DEFAULT_INSTANCE;
    public static final int IOS_CONFIG_FIELD_NUMBER = 2;
    private static volatile Parser<ConfigsOuterClass$Configs> PARSER;
    private int clientConfigsCase_ = 0;
    private Object clientConfigs_;
    private CommonConfigs commonConfigs_;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AndroidConfigs extends GeneratedMessageLite<AndroidConfigs, i7> implements MessageLiteOrBuilder {
        private static final AndroidConfigs DEFAULT_INSTANCE;
        private static volatile Parser<AndroidConfigs> PARSER;

        static {
            AndroidConfigs androidConfigs = new AndroidConfigs();
            DEFAULT_INSTANCE = androidConfigs;
            GeneratedMessageLite.registerDefaultInstance(AndroidConfigs.class, androidConfigs);
        }

        private AndroidConfigs() {
        }

        public static AndroidConfigs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static i7 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AndroidConfigs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AndroidConfigs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AndroidConfigs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (h7.f45816a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AndroidConfigs();
                case 2:
                    return new i7(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AndroidConfigs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AndroidConfigs.class) {
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

        public static i7 newBuilder(AndroidConfigs androidConfigs) {
            return DEFAULT_INSTANCE.createBuilder(androidConfigs);
        }

        public static AndroidConfigs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AndroidConfigs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AndroidConfigs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(InputStream inputStream) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AndroidConfigs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AndroidConfigs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AndroidConfigs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AndroidConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CommonConfigs extends GeneratedMessageLite<CommonConfigs, l7> implements o7 {
        private static final CommonConfigs DEFAULT_INSTANCE;
        public static final int MEDIA_CONFIG_FIELD_NUMBER = 1;
        private static volatile Parser<CommonConfigs> PARSER;
        private MediaConfig mediaConfig_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class MediaConfig extends GeneratedMessageLite<MediaConfig, m7> implements n7 {
            private static final MediaConfig DEFAULT_INSTANCE;
            public static final int MIN_STREAMING_PLAYABLE_DURATION_ON_TIMEOUT_SECS_FIELD_NUMBER = 2;
            private static volatile Parser<MediaConfig> PARSER = null;
            public static final int STREAMING_CHUNK_SIZE_KILOBYTES_FIELD_NUMBER = 1;
            private int bitField0_;
            private double minStreamingPlayableDurationOnTimeoutSecs_;
            private long streamingChunkSizeKilobytes_;

            static {
                MediaConfig mediaConfig = new MediaConfig();
                DEFAULT_INSTANCE = mediaConfig;
                GeneratedMessageLite.registerDefaultInstance(MediaConfig.class, mediaConfig);
            }

            private MediaConfig() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMinStreamingPlayableDurationOnTimeoutSecs() {
                this.bitField0_ &= -3;
                this.minStreamingPlayableDurationOnTimeoutSecs_ = 0.0d;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStreamingChunkSizeKilobytes() {
                this.bitField0_ &= -2;
                this.streamingChunkSizeKilobytes_ = 0L;
            }

            public static MediaConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static m7 newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static MediaConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MediaConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<MediaConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMinStreamingPlayableDurationOnTimeoutSecs(double d10) {
                this.bitField0_ |= 2;
                this.minStreamingPlayableDurationOnTimeoutSecs_ = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStreamingChunkSizeKilobytes(long j10) {
                this.bitField0_ |= 1;
                this.streamingChunkSizeKilobytes_ = j10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (h7.f45816a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new MediaConfig();
                    case 2:
                        return new m7(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001", new Object[]{"bitField0_", "streamingChunkSizeKilobytes_", "minStreamingPlayableDurationOnTimeoutSecs_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<MediaConfig> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (MediaConfig.class) {
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

            @Override // com.moloco.sdk.n7
            public double getMinStreamingPlayableDurationOnTimeoutSecs() {
                return this.minStreamingPlayableDurationOnTimeoutSecs_;
            }

            @Override // com.moloco.sdk.n7
            public long getStreamingChunkSizeKilobytes() {
                return this.streamingChunkSizeKilobytes_;
            }

            @Override // com.moloco.sdk.n7
            public boolean hasMinStreamingPlayableDurationOnTimeoutSecs() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.moloco.sdk.n7
            public boolean hasStreamingChunkSizeKilobytes() {
                return (this.bitField0_ & 1) != 0;
            }

            public static m7 newBuilder(MediaConfig mediaConfig) {
                return DEFAULT_INSTANCE.createBuilder(mediaConfig);
            }

            public static MediaConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static MediaConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static MediaConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(InputStream inputStream) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MediaConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static MediaConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static MediaConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MediaConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            CommonConfigs commonConfigs = new CommonConfigs();
            DEFAULT_INSTANCE = commonConfigs;
            GeneratedMessageLite.registerDefaultInstance(CommonConfigs.class, commonConfigs);
        }

        private CommonConfigs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediaConfig() {
            this.mediaConfig_ = null;
        }

        public static CommonConfigs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMediaConfig(MediaConfig mediaConfig) {
            mediaConfig.getClass();
            MediaConfig mediaConfig2 = this.mediaConfig_;
            if (mediaConfig2 == null || mediaConfig2 == MediaConfig.getDefaultInstance()) {
                this.mediaConfig_ = mediaConfig;
            } else {
                this.mediaConfig_ = (MediaConfig) ((m7) MediaConfig.newBuilder(this.mediaConfig_).mergeFrom((m7) mediaConfig)).buildPartial();
            }
        }

        public static l7 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CommonConfigs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommonConfigs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<CommonConfigs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediaConfig(MediaConfig mediaConfig) {
            mediaConfig.getClass();
            this.mediaConfig_ = mediaConfig;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (h7.f45816a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CommonConfigs();
                case 2:
                    return new l7(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"mediaConfig_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CommonConfigs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CommonConfigs.class) {
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

        @Override // com.moloco.sdk.o7
        public MediaConfig getMediaConfig() {
            MediaConfig mediaConfig = this.mediaConfig_;
            return mediaConfig == null ? MediaConfig.getDefaultInstance() : mediaConfig;
        }

        @Override // com.moloco.sdk.o7
        public boolean hasMediaConfig() {
            return this.mediaConfig_ != null;
        }

        public static l7 newBuilder(CommonConfigs commonConfigs) {
            return DEFAULT_INSTANCE.createBuilder(commonConfigs);
        }

        public static CommonConfigs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CommonConfigs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommonConfigs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(InputStream inputStream) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommonConfigs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CommonConfigs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CommonConfigs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CommonConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class IOSConfigs extends GeneratedMessageLite<IOSConfigs, p7> implements MessageLiteOrBuilder {
        private static final IOSConfigs DEFAULT_INSTANCE;
        private static volatile Parser<IOSConfigs> PARSER;

        static {
            IOSConfigs iOSConfigs = new IOSConfigs();
            DEFAULT_INSTANCE = iOSConfigs;
            GeneratedMessageLite.registerDefaultInstance(IOSConfigs.class, iOSConfigs);
        }

        private IOSConfigs() {
        }

        public static IOSConfigs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static p7 newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static IOSConfigs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IOSConfigs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<IOSConfigs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (h7.f45816a[methodToInvoke.ordinal()]) {
                case 1:
                    return new IOSConfigs();
                case 2:
                    return new p7(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<IOSConfigs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (IOSConfigs.class) {
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

        public static p7 newBuilder(IOSConfigs iOSConfigs) {
            return DEFAULT_INSTANCE.createBuilder(iOSConfigs);
        }

        public static IOSConfigs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static IOSConfigs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IOSConfigs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(InputStream inputStream) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IOSConfigs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static IOSConfigs parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IOSConfigs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IOSConfigs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    static {
        ConfigsOuterClass$Configs configsOuterClass$Configs = new ConfigsOuterClass$Configs();
        DEFAULT_INSTANCE = configsOuterClass$Configs;
        GeneratedMessageLite.registerDefaultInstance(ConfigsOuterClass$Configs.class, configsOuterClass$Configs);
    }

    private ConfigsOuterClass$Configs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidConfig() {
        if (this.clientConfigsCase_ == 1) {
            this.clientConfigsCase_ = 0;
            this.clientConfigs_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientConfigs() {
        this.clientConfigsCase_ = 0;
        this.clientConfigs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommonConfigs() {
        this.commonConfigs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIosConfig() {
        if (this.clientConfigsCase_ == 2) {
            this.clientConfigsCase_ = 0;
            this.clientConfigs_ = null;
        }
    }

    public static ConfigsOuterClass$Configs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidConfig(AndroidConfigs androidConfigs) {
        androidConfigs.getClass();
        if (this.clientConfigsCase_ != 1 || this.clientConfigs_ == AndroidConfigs.getDefaultInstance()) {
            this.clientConfigs_ = androidConfigs;
        } else {
            this.clientConfigs_ = ((i7) AndroidConfigs.newBuilder((AndroidConfigs) this.clientConfigs_).mergeFrom((i7) androidConfigs)).buildPartial();
        }
        this.clientConfigsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommonConfigs(CommonConfigs commonConfigs) {
        commonConfigs.getClass();
        CommonConfigs commonConfigs2 = this.commonConfigs_;
        if (commonConfigs2 == null || commonConfigs2 == CommonConfigs.getDefaultInstance()) {
            this.commonConfigs_ = commonConfigs;
        } else {
            this.commonConfigs_ = (CommonConfigs) ((l7) CommonConfigs.newBuilder(this.commonConfigs_).mergeFrom((l7) commonConfigs)).buildPartial();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIosConfig(IOSConfigs iOSConfigs) {
        iOSConfigs.getClass();
        if (this.clientConfigsCase_ != 2 || this.clientConfigs_ == IOSConfigs.getDefaultInstance()) {
            this.clientConfigs_ = iOSConfigs;
        } else {
            this.clientConfigs_ = ((p7) IOSConfigs.newBuilder((IOSConfigs) this.clientConfigs_).mergeFrom((p7) iOSConfigs)).buildPartial();
        }
        this.clientConfigsCase_ = 2;
    }

    public static j7 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ConfigsOuterClass$Configs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigsOuterClass$Configs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ConfigsOuterClass$Configs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidConfig(AndroidConfigs androidConfigs) {
        androidConfigs.getClass();
        this.clientConfigs_ = androidConfigs;
        this.clientConfigsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommonConfigs(CommonConfigs commonConfigs) {
        commonConfigs.getClass();
        this.commonConfigs_ = commonConfigs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIosConfig(IOSConfigs iOSConfigs) {
        iOSConfigs.getClass();
        this.clientConfigs_ = iOSConfigs;
        this.clientConfigsCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (h7.f45816a[methodToInvoke.ordinal()]) {
            case 1:
                return new ConfigsOuterClass$Configs();
            case 2:
                return new j7(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\t", new Object[]{"clientConfigs_", "clientConfigsCase_", AndroidConfigs.class, IOSConfigs.class, "commonConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ConfigsOuterClass$Configs> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ConfigsOuterClass$Configs.class) {
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

    @Override // com.moloco.sdk.q7
    public AndroidConfigs getAndroidConfig() {
        return this.clientConfigsCase_ == 1 ? (AndroidConfigs) this.clientConfigs_ : AndroidConfigs.getDefaultInstance();
    }

    @Override // com.moloco.sdk.q7
    public k7 getClientConfigsCase() {
        return k7.forNumber(this.clientConfigsCase_);
    }

    @Override // com.moloco.sdk.q7
    public CommonConfigs getCommonConfigs() {
        CommonConfigs commonConfigs = this.commonConfigs_;
        return commonConfigs == null ? CommonConfigs.getDefaultInstance() : commonConfigs;
    }

    @Override // com.moloco.sdk.q7
    public IOSConfigs getIosConfig() {
        return this.clientConfigsCase_ == 2 ? (IOSConfigs) this.clientConfigs_ : IOSConfigs.getDefaultInstance();
    }

    @Override // com.moloco.sdk.q7
    public boolean hasAndroidConfig() {
        return this.clientConfigsCase_ == 1;
    }

    @Override // com.moloco.sdk.q7
    public boolean hasCommonConfigs() {
        return this.commonConfigs_ != null;
    }

    @Override // com.moloco.sdk.q7
    public boolean hasIosConfig() {
        return this.clientConfigsCase_ == 2;
    }

    public static j7 newBuilder(ConfigsOuterClass$Configs configsOuterClass$Configs) {
        return DEFAULT_INSTANCE.createBuilder(configsOuterClass$Configs);
    }

    public static ConfigsOuterClass$Configs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ConfigsOuterClass$Configs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConfigsOuterClass$Configs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(InputStream inputStream) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConfigsOuterClass$Configs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ConfigsOuterClass$Configs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ConfigsOuterClass$Configs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigsOuterClass$Configs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
