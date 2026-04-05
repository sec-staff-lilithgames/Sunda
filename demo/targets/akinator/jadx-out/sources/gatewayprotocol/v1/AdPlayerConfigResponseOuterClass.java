package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdPlayerConfigResponseOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdPlayerConfigResponse extends GeneratedMessageLite<AdPlayerConfigResponse, Builder> implements AdPlayerConfigResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 7;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 8;
        private static final AdPlayerConfigResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 6;
        public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser<AdPlayerConfigResponse> PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
        public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private int impressionConfigurationVersion_;
        private ByteString impressionConfiguration_;
        private ByteString trackingToken_;
        private WebviewConfiguration.WebViewConfiguration webviewConfiguration_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<AdPlayerConfigResponse, Builder> implements AdPlayerConfigResponseOrBuilder {
            public /* synthetic */ Builder(wl.d dVar) {
                this();
            }

            public Builder clearAdData() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearAdDataRefreshToken();
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearError();
                return this;
            }

            public Builder clearImpressionConfiguration() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearImpressionConfiguration();
                return this;
            }

            public Builder clearImpressionConfigurationVersion() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearImpressionConfigurationVersion();
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearTrackingToken();
                return this;
            }

            public Builder clearWebviewConfiguration() {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).clearWebviewConfiguration();
                return this;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ByteString getAdData() {
                return ((AdPlayerConfigResponse) this.instance).getAdData();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdPlayerConfigResponse) this.instance).getAdDataRefreshToken();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public int getAdDataVersion() {
                return ((AdPlayerConfigResponse) this.instance).getAdDataVersion();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((AdPlayerConfigResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ByteString getImpressionConfiguration() {
                return ((AdPlayerConfigResponse) this.instance).getImpressionConfiguration();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public int getImpressionConfigurationVersion() {
                return ((AdPlayerConfigResponse) this.instance).getImpressionConfigurationVersion();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public ByteString getTrackingToken() {
                return ((AdPlayerConfigResponse) this.instance).getTrackingToken();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
                return ((AdPlayerConfigResponse) this.instance).getWebviewConfiguration();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public boolean hasError() {
                return ((AdPlayerConfigResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
            public boolean hasWebviewConfiguration() {
                return ((AdPlayerConfigResponse) this.instance).hasWebviewConfiguration();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).mergeWebviewConfiguration(webViewConfiguration);
                return this;
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setAdData(byteString);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setAdDataRefreshToken(byteString);
                return this;
            }

            public Builder setAdDataVersion(int i10) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setAdDataVersion(i10);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setError(error);
                return this;
            }

            public Builder setImpressionConfiguration(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setImpressionConfiguration(byteString);
                return this;
            }

            public Builder setImpressionConfigurationVersion(int i10) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setImpressionConfigurationVersion(i10);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setTrackingToken(byteString);
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setWebviewConfiguration(webViewConfiguration);
                return this;
            }

            private Builder() {
                super(AdPlayerConfigResponse.DEFAULT_INSTANCE);
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration.Builder builder) {
                copyOnWrite();
                ((AdPlayerConfigResponse) this.instance).setWebviewConfiguration(builder.build());
                return this;
            }
        }

        static {
            AdPlayerConfigResponse adPlayerConfigResponse = new AdPlayerConfigResponse();
            DEFAULT_INSTANCE = adPlayerConfigResponse;
            GeneratedMessageLite.registerDefaultInstance(AdPlayerConfigResponse.class, adPlayerConfigResponse);
        }

        private AdPlayerConfigResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.trackingToken_ = byteString;
            this.impressionConfiguration_ = byteString;
            this.adDataRefreshToken_ = byteString;
            this.adData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionConfiguration() {
            this.impressionConfiguration_ = getDefaultInstance().getImpressionConfiguration();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionConfigurationVersion() {
            this.impressionConfigurationVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewConfiguration() {
            this.webviewConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        public static AdPlayerConfigResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            if (error2 == null || error2 == ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = error;
            } else {
                this.error_ = ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom((ErrorOuterClass.Error.Builder) error).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            WebviewConfiguration.WebViewConfiguration webViewConfiguration2 = this.webviewConfiguration_;
            if (webViewConfiguration2 == null || webViewConfiguration2 == WebviewConfiguration.WebViewConfiguration.getDefaultInstance()) {
                this.webviewConfiguration_ = webViewConfiguration;
            } else {
                this.webviewConfiguration_ = WebviewConfiguration.WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom((WebviewConfiguration.WebViewConfiguration.Builder) webViewConfiguration).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdPlayerConfigResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdPlayerConfigResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdData(ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataRefreshToken(ByteString byteString) {
            byteString.getClass();
            this.adDataRefreshToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataVersion(int i10) {
            this.adDataVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionConfiguration(ByteString byteString) {
            byteString.getClass();
            this.impressionConfiguration_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionConfigurationVersion(int i10) {
            this.impressionConfigurationVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            this.webviewConfiguration_ = webViewConfiguration;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.d dVar = null;
            switch (wl.d.f90702a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdPlayerConfigResponse();
                case 2:
                    return new Builder(dVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006ဉ\u0001\u0007\n\b\u0004", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "error_", "adData_", "adDataVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdPlayerConfigResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AdPlayerConfigResponse.class) {
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

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ByteString getImpressionConfiguration() {
            return this.impressionConfiguration_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public int getImpressionConfigurationVersion() {
            return this.impressionConfigurationVersion_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            WebviewConfiguration.WebViewConfiguration webViewConfiguration = this.webviewConfiguration_;
            return webViewConfiguration == null ? WebviewConfiguration.WebViewConfiguration.getDefaultInstance() : webViewConfiguration;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponseOrBuilder
        public boolean hasWebviewConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AdPlayerConfigResponse adPlayerConfigResponse) {
            return DEFAULT_INSTANCE.createBuilder(adPlayerConfigResponse);
        }

        public static AdPlayerConfigResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdPlayerConfigResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdPlayerConfigResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdPlayerConfigResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdPlayerConfigResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        ErrorOuterClass.Error getError();

        ByteString getImpressionConfiguration();

        int getImpressionConfigurationVersion();

        ByteString getTrackingToken();

        WebviewConfiguration.WebViewConfiguration getWebviewConfiguration();

        boolean hasError();

        boolean hasWebviewConfiguration();
    }

    private AdPlayerConfigResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
