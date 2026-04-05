package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ClientInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class MediationInfoOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MediationInfo extends GeneratedMessageLite<MediationInfo, Builder> implements MediationInfoOrBuilder {
        public static final int ADAPTER_VERSION_FIELD_NUMBER = 4;
        public static final int CUSTOM_NAME_FIELD_NUMBER = 2;
        private static final MediationInfo DEFAULT_INSTANCE;
        private static volatile Parser<MediationInfo> PARSER = null;
        public static final int PROVIDER_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 3;
        private int bitField0_;
        private int provider_;
        private String customName_ = "";
        private String version_ = "";
        private String adapterVersion_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<MediationInfo, Builder> implements MediationInfoOrBuilder {
            public /* synthetic */ Builder(wl.w wVar) {
                this();
            }

            public Builder clearAdapterVersion() {
                copyOnWrite();
                ((MediationInfo) this.instance).clearAdapterVersion();
                return this;
            }

            public Builder clearCustomName() {
                copyOnWrite();
                ((MediationInfo) this.instance).clearCustomName();
                return this;
            }

            public Builder clearProvider() {
                copyOnWrite();
                ((MediationInfo) this.instance).clearProvider();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((MediationInfo) this.instance).clearVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public String getAdapterVersion() {
                return ((MediationInfo) this.instance).getAdapterVersion();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public ByteString getAdapterVersionBytes() {
                return ((MediationInfo) this.instance).getAdapterVersionBytes();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public String getCustomName() {
                return ((MediationInfo) this.instance).getCustomName();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public ByteString getCustomNameBytes() {
                return ((MediationInfo) this.instance).getCustomNameBytes();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public ClientInfoOuterClass.MediationProvider getProvider() {
                return ((MediationInfo) this.instance).getProvider();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public int getProviderValue() {
                return ((MediationInfo) this.instance).getProviderValue();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public String getVersion() {
                return ((MediationInfo) this.instance).getVersion();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public ByteString getVersionBytes() {
                return ((MediationInfo) this.instance).getVersionBytes();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public boolean hasAdapterVersion() {
                return ((MediationInfo) this.instance).hasAdapterVersion();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public boolean hasCustomName() {
                return ((MediationInfo) this.instance).hasCustomName();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public boolean hasVersion() {
                return ((MediationInfo) this.instance).hasVersion();
            }

            public Builder setAdapterVersion(String str) {
                copyOnWrite();
                ((MediationInfo) this.instance).setAdapterVersion(str);
                return this;
            }

            public Builder setAdapterVersionBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((MediationInfo) this.instance).setAdapterVersionBytes(byteString);
                return this;
            }

            public Builder setCustomName(String str) {
                copyOnWrite();
                ((MediationInfo) this.instance).setCustomName(str);
                return this;
            }

            public Builder setCustomNameBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((MediationInfo) this.instance).setCustomNameBytes(byteString);
                return this;
            }

            public Builder setProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
                copyOnWrite();
                ((MediationInfo) this.instance).setProvider(mediationProvider);
                return this;
            }

            public Builder setProviderValue(int i10) {
                copyOnWrite();
                ((MediationInfo) this.instance).setProviderValue(i10);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                ((MediationInfo) this.instance).setVersion(str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((MediationInfo) this.instance).setVersionBytes(byteString);
                return this;
            }

            private Builder() {
                super(MediationInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            MediationInfo mediationInfo = new MediationInfo();
            DEFAULT_INSTANCE = mediationInfo;
            GeneratedMessageLite.registerDefaultInstance(MediationInfo.class, mediationInfo);
        }

        private MediationInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdapterVersion() {
            this.bitField0_ &= -5;
            this.adapterVersion_ = getDefaultInstance().getAdapterVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomName() {
            this.bitField0_ &= -2;
            this.customName_ = getDefaultInstance().getCustomName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProvider() {
            this.provider_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -3;
            this.version_ = getDefaultInstance().getVersion();
        }

        public static MediationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static MediationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MediationInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdapterVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.adapterVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdapterVersionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.adapterVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customName_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this.provider_ = mediationProvider.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderValue(int i10) {
            this.provider_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.w wVar = null;
            switch (wl.w.f90730a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MediationInfo();
                case 2:
                    return new Builder(wVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002", new Object[]{"bitField0_", "provider_", "customName_", "version_", "adapterVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MediationInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MediationInfo.class) {
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

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public String getAdapterVersion() {
            return this.adapterVersion_;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public ByteString getAdapterVersionBytes() {
            return ByteString.copyFromUtf8(this.adapterVersion_);
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public String getCustomName() {
            return this.customName_;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public ByteString getCustomNameBytes() {
            return ByteString.copyFromUtf8(this.customName_);
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider mediationProviderForNumber = ClientInfoOuterClass.MediationProvider.forNumber(this.provider_);
            return mediationProviderForNumber == null ? ClientInfoOuterClass.MediationProvider.UNRECOGNIZED : mediationProviderForNumber;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public int getProviderValue() {
            return this.provider_;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public String getVersion() {
            return this.version_;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public boolean hasAdapterVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public boolean hasCustomName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(MediationInfo mediationInfo) {
            return DEFAULT_INSTANCE.createBuilder(mediationInfo);
        }

        public static MediationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MediationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MediationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(InputStream inputStream) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MediationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface MediationInfoOrBuilder extends MessageLiteOrBuilder {
        String getAdapterVersion();

        ByteString getAdapterVersionBytes();

        String getCustomName();

        ByteString getCustomNameBytes();

        ClientInfoOuterClass.MediationProvider getProvider();

        int getProviderValue();

        String getVersion();

        ByteString getVersionBytes();

        boolean hasAdapterVersion();

        boolean hasCustomName();

        boolean hasVersion();
    }

    private MediationInfoOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
