package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdPlayerConfigRequestOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdPlayerConfigRequest extends GeneratedMessageLite<AdPlayerConfigRequest, Builder> implements AdPlayerConfigRequestOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 5;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 1;
        private static final AdPlayerConfigRequest DEFAULT_INSTANCE;
        public static final int EXTRAS_FIELD_NUMBER = 7;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        public static final int MEDIATION_AD_UNIT_ID_FIELD_NUMBER = 6;
        public static final int MEDIATION_INFO_FIELD_NUMBER = 8;
        private static volatile Parser<AdPlayerConfigRequest> PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int bitField0_;
        private ByteString configurationToken_;
        private MapFieldLite<String, String> extras_ = MapFieldLite.emptyMapField();
        private ByteString impressionOpportunityId_;
        private String mediationAdUnitId_;
        private MediationInfoOuterClass.MediationInfo mediationInfo_;
        private String placementId_;
        private int webviewVersion_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<AdPlayerConfigRequest, Builder> implements AdPlayerConfigRequestOrBuilder {
            public /* synthetic */ Builder(wl.c cVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearAdFormat();
                return this;
            }

            public Builder clearConfigurationToken() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearConfigurationToken();
                return this;
            }

            public Builder clearExtras() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).getMutableExtrasMap().clear();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearImpressionOpportunityId();
                return this;
            }

            public Builder clearMediationAdUnitId() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearMediationAdUnitId();
                return this;
            }

            public Builder clearMediationInfo() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearMediationInfo();
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearPlacementId();
                return this;
            }

            public Builder clearWebviewVersion() {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).clearWebviewVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean containsExtras(String str) {
                str.getClass();
                return ((AdPlayerConfigRequest) this.instance).getExtrasMap().containsKey(str);
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((AdPlayerConfigRequest) this.instance).getAdFormat();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public int getAdFormatValue() {
                return ((AdPlayerConfigRequest) this.instance).getAdFormatValue();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public ByteString getConfigurationToken() {
                return ((AdPlayerConfigRequest) this.instance).getConfigurationToken();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            @Deprecated
            public Map<String, String> getExtras() {
                return getExtrasMap();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public int getExtrasCount() {
                return ((AdPlayerConfigRequest) this.instance).getExtrasMap().size();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public Map<String, String> getExtrasMap() {
                return Collections.unmodifiableMap(((AdPlayerConfigRequest) this.instance).getExtrasMap());
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public String getExtrasOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> extrasMap = ((AdPlayerConfigRequest) this.instance).getExtrasMap();
                return extrasMap.containsKey(str) ? extrasMap.get(str) : str2;
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public String getExtrasOrThrow(String str) {
                str.getClass();
                Map<String, String> extrasMap = ((AdPlayerConfigRequest) this.instance).getExtrasMap();
                if (extrasMap.containsKey(str)) {
                    return extrasMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public ByteString getImpressionOpportunityId() {
                return ((AdPlayerConfigRequest) this.instance).getImpressionOpportunityId();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public String getMediationAdUnitId() {
                return ((AdPlayerConfigRequest) this.instance).getMediationAdUnitId();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public ByteString getMediationAdUnitIdBytes() {
                return ((AdPlayerConfigRequest) this.instance).getMediationAdUnitIdBytes();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public MediationInfoOuterClass.MediationInfo getMediationInfo() {
                return ((AdPlayerConfigRequest) this.instance).getMediationInfo();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public String getPlacementId() {
                return ((AdPlayerConfigRequest) this.instance).getPlacementId();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public ByteString getPlacementIdBytes() {
                return ((AdPlayerConfigRequest) this.instance).getPlacementIdBytes();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public int getWebviewVersion() {
                return ((AdPlayerConfigRequest) this.instance).getWebviewVersion();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean hasAdFormat() {
                return ((AdPlayerConfigRequest) this.instance).hasAdFormat();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean hasMediationAdUnitId() {
                return ((AdPlayerConfigRequest) this.instance).hasMediationAdUnitId();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean hasMediationInfo() {
                return ((AdPlayerConfigRequest) this.instance).hasMediationInfo();
            }

            @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
            public boolean hasWebviewVersion() {
                return ((AdPlayerConfigRequest) this.instance).hasWebviewVersion();
            }

            public Builder mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).mergeMediationInfo(mediationInfo);
                return this;
            }

            public Builder putAllExtras(Map<String, String> map) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).getMutableExtrasMap().putAll(map);
                return this;
            }

            public Builder putExtras(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).getMutableExtrasMap().put(str, str2);
                return this;
            }

            public Builder removeExtras(String str) {
                str.getClass();
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).getMutableExtrasMap().remove(str);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setAdFormat(adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i10) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setAdFormatValue(i10);
                return this;
            }

            public Builder setConfigurationToken(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setConfigurationToken(byteString);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setImpressionOpportunityId(byteString);
                return this;
            }

            public Builder setMediationAdUnitId(String str) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setMediationAdUnitId(str);
                return this;
            }

            public Builder setMediationAdUnitIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setMediationAdUnitIdBytes(byteString);
                return this;
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setMediationInfo(mediationInfo);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setPlacementId(str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setPlacementIdBytes(byteString);
                return this;
            }

            public Builder setWebviewVersion(int i10) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setWebviewVersion(i10);
                return this;
            }

            private Builder() {
                super(AdPlayerConfigRequest.DEFAULT_INSTANCE);
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo.Builder builder) {
                copyOnWrite();
                ((AdPlayerConfigRequest) this.instance).setMediationInfo(builder.build());
                return this;
            }
        }

        static {
            AdPlayerConfigRequest adPlayerConfigRequest = new AdPlayerConfigRequest();
            DEFAULT_INSTANCE = adPlayerConfigRequest;
            GeneratedMessageLite.registerDefaultInstance(AdPlayerConfigRequest.class, adPlayerConfigRequest);
        }

        private AdPlayerConfigRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.configurationToken_ = byteString;
            this.placementId_ = "";
            this.impressionOpportunityId_ = byteString;
            this.mediationAdUnitId_ = "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdFormat() {
            this.bitField0_ &= -3;
            this.adFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigurationToken() {
            this.configurationToken_ = getDefaultInstance().getConfigurationToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationAdUnitId() {
            this.bitField0_ &= -5;
            this.mediationAdUnitId_ = getDefaultInstance().getMediationAdUnitId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMediationInfo() {
            this.mediationInfo_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlacementId() {
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWebviewVersion() {
            this.bitField0_ &= -2;
            this.webviewVersion_ = 0;
        }

        public static AdPlayerConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExtrasMap() {
            return internalGetMutableExtras();
        }

        private MapFieldLite<String, String> internalGetExtras() {
            return this.extras_;
        }

        private MapFieldLite<String, String> internalGetMutableExtras() {
            if (!this.extras_.isMutable()) {
                this.extras_ = this.extras_.mutableCopy();
            }
            return this.extras_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            MediationInfoOuterClass.MediationInfo mediationInfo2 = this.mediationInfo_;
            if (mediationInfo2 == null || mediationInfo2 == MediationInfoOuterClass.MediationInfo.getDefaultInstance()) {
                this.mediationInfo_ = mediationInfo;
            } else {
                this.mediationInfo_ = MediationInfoOuterClass.MediationInfo.newBuilder(this.mediationInfo_).mergeFrom((MediationInfoOuterClass.MediationInfo.Builder) mediationInfo).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdPlayerConfigRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdPlayerConfigRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdFormatValue(int i10) {
            this.bitField0_ |= 2;
            this.adFormat_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurationToken(ByteString byteString) {
            byteString.getClass();
            this.configurationToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationAdUnitId(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.mediationAdUnitId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationAdUnitIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mediationAdUnitId_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            this.mediationInfo_ = mediationInfo;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementId(String str) {
            str.getClass();
            this.placementId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlacementIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWebviewVersion(int i10) {
            this.bitField0_ |= 1;
            this.webviewVersion_ = i10;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean containsExtras(String str) {
            str.getClass();
            return internalGetExtras().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.c cVar = null;
            switch (wl.c.f90700a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdPlayerConfigRequest();
                case 2:
                    return new Builder(cVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\t\b\u0001\u0000\u0000\u0001\n\u0002Ȉ\u0004\n\u0005ဌ\u0001\u0006ለ\u0002\u00072\bဉ\u0003\tင\u0000", new Object[]{"bitField0_", "configurationToken_", "placementId_", "impressionOpportunityId_", "adFormat_", "mediationAdUnitId_", "extras_", c.f57487a, "mediationInfo_", "webviewVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdPlayerConfigRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AdPlayerConfigRequest.class) {
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

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormatForNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return adFormatForNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        @Deprecated
        public Map<String, String> getExtras() {
            return getExtrasMap();
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public int getExtrasCount() {
            return internalGetExtras().size();
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public Map<String, String> getExtrasMap() {
            return Collections.unmodifiableMap(internalGetExtras());
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public String getExtrasOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExtras = internalGetExtras();
            return mapFieldLiteInternalGetExtras.containsKey(str) ? mapFieldLiteInternalGetExtras.get(str) : str2;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public String getExtrasOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExtras = internalGetExtras();
            if (mapFieldLiteInternalGetExtras.containsKey(str)) {
                return mapFieldLiteInternalGetExtras.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public String getMediationAdUnitId() {
            return this.mediationAdUnitId_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public ByteString getMediationAdUnitIdBytes() {
            return ByteString.copyFromUtf8(this.mediationAdUnitId_);
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this.mediationInfo_;
            return mediationInfo == null ? MediationInfoOuterClass.MediationInfo.getDefaultInstance() : mediationInfo;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public String getPlacementId() {
            return this.placementId_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean hasMediationAdUnitId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean hasMediationInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // gatewayprotocol.v1.AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder
        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AdPlayerConfigRequest adPlayerConfigRequest) {
            return DEFAULT_INSTANCE.createBuilder(adPlayerConfigRequest);
        }

        public static AdPlayerConfigRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdPlayerConfigRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdPlayerConfigRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdPlayerConfigRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdPlayerConfigRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        ByteString getConfigurationToken();

        @Deprecated
        Map<String, String> getExtras();

        int getExtrasCount();

        Map<String, String> getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        ByteString getImpressionOpportunityId();

        String getMediationAdUnitId();

        ByteString getMediationAdUnitIdBytes();

        MediationInfoOuterClass.MediationInfo getMediationInfo();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasMediationAdUnitId();

        boolean hasMediationInfo();

        boolean hasWebviewVersion();
    }

    private AdPlayerConfigRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
