package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class UniversalResponseOuterClass {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UniversalResponse extends GeneratedMessageLite<UniversalResponse, Builder> implements UniversalResponseOrBuilder {
        private static final UniversalResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int MUTABLE_DATA_FIELD_NUMBER = 2;
        private static volatile Parser<UniversalResponse> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private MutableDataOuterClass.MutableData mutableData_;
        private Payload payload_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<UniversalResponse, Builder> implements UniversalResponseOrBuilder {
            public /* synthetic */ Builder(wl.k0 k0Var) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                ((UniversalResponse) this.instance).clearError();
                return this;
            }

            public Builder clearMutableData() {
                copyOnWrite();
                ((UniversalResponse) this.instance).clearMutableData();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((UniversalResponse) this.instance).clearPayload();
                return this;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((UniversalResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public MutableDataOuterClass.MutableData getMutableData() {
                return ((UniversalResponse) this.instance).getMutableData();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public Payload getPayload() {
                return ((UniversalResponse) this.instance).getPayload();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasError() {
                return ((UniversalResponse) this.instance).hasError();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasMutableData() {
                return ((UniversalResponse) this.instance).hasMutableData();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
            public boolean hasPayload() {
                return ((UniversalResponse) this.instance).hasPayload();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((UniversalResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder mergeMutableData(MutableDataOuterClass.MutableData mutableData) {
                copyOnWrite();
                ((UniversalResponse) this.instance).mergeMutableData(mutableData);
                return this;
            }

            public Builder mergePayload(Payload payload) {
                copyOnWrite();
                ((UniversalResponse) this.instance).mergePayload(payload);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setError(error);
                return this;
            }

            public Builder setMutableData(MutableDataOuterClass.MutableData mutableData) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setMutableData(mutableData);
                return this;
            }

            public Builder setPayload(Payload payload) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setPayload(payload);
                return this;
            }

            private Builder() {
                super(UniversalResponse.DEFAULT_INSTANCE);
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setMutableData(MutableDataOuterClass.MutableData.Builder builder) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setMutableData(builder.build());
                return this;
            }

            public Builder setPayload(Payload.Builder builder) {
                copyOnWrite();
                ((UniversalResponse) this.instance).setPayload(builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Payload extends GeneratedMessageLite<Payload, Builder> implements PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_PLAYER_CONFIG_RESPONSE_FIELD_NUMBER = 3;
            public static final int AD_RESPONSE_FIELD_NUMBER = 2;
            public static final int AUDIENCE_MANAGEMENT_RESPONSE_FIELD_NUMBER = 6;
            private static final Payload DEFAULT_INSTANCE;
            public static final int INITIALIZATION_RESPONSE_FIELD_NUMBER = 1;
            private static volatile Parser<Payload> PARSER = null;
            public static final int PRIVACY_UPDATE_RESPONSE_FIELD_NUMBER = 5;
            private int valueCase_ = 0;
            private Object value_;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<Payload, Builder> implements PayloadOrBuilder {
                public /* synthetic */ Builder(wl.k0 k0Var) {
                    this();
                }

                public Builder clearAdDataRefreshResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdDataRefreshResponse();
                    return this;
                }

                public Builder clearAdPlayerConfigResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdPlayerConfigResponse();
                    return this;
                }

                public Builder clearAdResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAdResponse();
                    return this;
                }

                public Builder clearAudienceManagementResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearAudienceManagementResponse();
                    return this;
                }

                public Builder clearInitializationResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearInitializationResponse();
                    return this;
                }

                public Builder clearPrivacyUpdateResponse() {
                    copyOnWrite();
                    ((Payload) this.instance).clearPrivacyUpdateResponse();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((Payload) this.instance).clearValue();
                    return this;
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                    return ((Payload) this.instance).getAdDataRefreshResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                    return ((Payload) this.instance).getAdPlayerConfigResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public AdResponseOuterClass.AdResponse getAdResponse() {
                    return ((Payload) this.instance).getAdResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse() {
                    return ((Payload) this.instance).getAudienceManagementResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                    return ((Payload) this.instance).getInitializationResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                    return ((Payload) this.instance).getPrivacyUpdateResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public ValueCase getValueCase() {
                    return ((Payload) this.instance).getValueCase();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdDataRefreshResponse() {
                    return ((Payload) this.instance).hasAdDataRefreshResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdPlayerConfigResponse() {
                    return ((Payload) this.instance).hasAdPlayerConfigResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAdResponse() {
                    return ((Payload) this.instance).hasAdResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasAudienceManagementResponse() {
                    return ((Payload) this.instance).hasAudienceManagementResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasInitializationResponse() {
                    return ((Payload) this.instance).hasInitializationResponse();
                }

                @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
                public boolean hasPrivacyUpdateResponse() {
                    return ((Payload) this.instance).hasPrivacyUpdateResponse();
                }

                public Builder mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdDataRefreshResponse(adDataRefreshResponse);
                    return this;
                }

                public Builder mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdPlayerConfigResponse(adPlayerConfigResponse);
                    return this;
                }

                public Builder mergeAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAdResponse(adResponse);
                    return this;
                }

                public Builder mergeAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeAudienceManagementResponse(audienceManagementResponse);
                    return this;
                }

                public Builder mergeInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergeInitializationResponse(initializationResponse);
                    return this;
                }

                public Builder mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).mergePrivacyUpdateResponse(privacyUpdateResponse);
                    return this;
                }

                public Builder setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdDataRefreshResponse(adDataRefreshResponse);
                    return this;
                }

                public Builder setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdPlayerConfigResponse(adPlayerConfigResponse);
                    return this;
                }

                public Builder setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdResponse(adResponse);
                    return this;
                }

                public Builder setAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setAudienceManagementResponse(audienceManagementResponse);
                    return this;
                }

                public Builder setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setInitializationResponse(initializationResponse);
                    return this;
                }

                public Builder setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    copyOnWrite();
                    ((Payload) this.instance).setPrivacyUpdateResponse(privacyUpdateResponse);
                    return this;
                }

                private Builder() {
                    super(Payload.DEFAULT_INSTANCE);
                }

                public Builder setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdDataRefreshResponse(builder.build());
                    return this;
                }

                public Builder setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdPlayerConfigResponse(builder.build());
                    return this;
                }

                public Builder setAdResponse(AdResponseOuterClass.AdResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAdResponse(builder.build());
                    return this;
                }

                public Builder setAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setAudienceManagementResponse(builder.build());
                    return this;
                }

                public Builder setInitializationResponse(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setInitializationResponse(builder.build());
                    return this;
                }

                public Builder setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                    copyOnWrite();
                    ((Payload) this.instance).setPrivacyUpdateResponse(builder.build());
                    return this;
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public enum ValueCase {
                INITIALIZATION_RESPONSE(1),
                AD_RESPONSE(2),
                AD_PLAYER_CONFIG_RESPONSE(3),
                AD_DATA_REFRESH_RESPONSE(4),
                PRIVACY_UPDATE_RESPONSE(5),
                AUDIENCE_MANAGEMENT_RESPONSE(6),
                VALUE_NOT_SET(0);

                private final int value;

                ValueCase(int i10) {
                    this.value = i10;
                }

                public static ValueCase forNumber(int i10) {
                    switch (i10) {
                        case 0:
                            return VALUE_NOT_SET;
                        case 1:
                            return INITIALIZATION_RESPONSE;
                        case 2:
                            return AD_RESPONSE;
                        case 3:
                            return AD_PLAYER_CONFIG_RESPONSE;
                        case 4:
                            return AD_DATA_REFRESH_RESPONSE;
                        case 5:
                            return PRIVACY_UPDATE_RESPONSE;
                        case 6:
                            return AUDIENCE_MANAGEMENT_RESPONSE;
                        default:
                            return null;
                    }
                }

                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static ValueCase valueOf(int i10) {
                    return forNumber(i10);
                }
            }

            static {
                Payload payload = new Payload();
                DEFAULT_INSTANCE = payload;
                GeneratedMessageLite.registerDefaultInstance(Payload.class, payload);
            }

            private Payload() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAdResponse() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAudienceManagementResponse() {
                if (this.valueCase_ == 6) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInitializationResponse() {
                if (this.valueCase_ == 1) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
            }

            public static Payload getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                if (this.valueCase_ != 4 || this.value_ == AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance()) {
                    this.value_ = adDataRefreshResponse;
                } else {
                    this.value_ = AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder((AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.value_).mergeFrom((AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder) adDataRefreshResponse).buildPartial();
                }
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                if (this.valueCase_ != 3 || this.value_ == AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance()) {
                    this.value_ = adPlayerConfigResponse;
                } else {
                    this.value_ = AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) this.value_).mergeFrom((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder) adPlayerConfigResponse).buildPartial();
                }
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                if (this.valueCase_ != 2 || this.value_ == AdResponseOuterClass.AdResponse.getDefaultInstance()) {
                    this.value_ = adResponse;
                } else {
                    this.value_ = AdResponseOuterClass.AdResponse.newBuilder((AdResponseOuterClass.AdResponse) this.value_).mergeFrom((AdResponseOuterClass.AdResponse.Builder) adResponse).buildPartial();
                }
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                audienceManagementResponse.getClass();
                if (this.valueCase_ != 6 || this.value_ == AudienceManagementResponseOuterClass.AudienceManagementResponse.getDefaultInstance()) {
                    this.value_ = audienceManagementResponse;
                } else {
                    this.value_ = AudienceManagementResponseOuterClass.AudienceManagementResponse.newBuilder((AudienceManagementResponseOuterClass.AudienceManagementResponse) this.value_).mergeFrom((AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder) audienceManagementResponse).buildPartial();
                }
                this.valueCase_ = 6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                if (this.valueCase_ != 1 || this.value_ == InitializationResponseOuterClass.InitializationResponse.getDefaultInstance()) {
                    this.value_ = initializationResponse;
                } else {
                    this.value_ = InitializationResponseOuterClass.InitializationResponse.newBuilder((InitializationResponseOuterClass.InitializationResponse) this.value_).mergeFrom((InitializationResponseOuterClass.InitializationResponse.Builder) initializationResponse).buildPartial();
                }
                this.valueCase_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                if (this.valueCase_ != 5 || this.value_ == PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance()) {
                    this.value_ = privacyUpdateResponse;
                } else {
                    this.value_ = PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) this.value_).mergeFrom((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder) privacyUpdateResponse).buildPartial();
                }
                this.valueCase_ = 5;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Payload parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Payload> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                this.value_ = adDataRefreshResponse;
                this.valueCase_ = 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                this.value_ = adPlayerConfigResponse;
                this.valueCase_ = 3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                this.value_ = adResponse;
                this.valueCase_ = 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                audienceManagementResponse.getClass();
                this.value_ = audienceManagementResponse;
                this.valueCase_ = 6;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                this.value_ = initializationResponse;
                this.valueCase_ = 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                this.value_ = privacyUpdateResponse;
                this.valueCase_ = 5;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                wl.k0 k0Var = null;
                switch (wl.k0.f90717a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Payload();
                    case 2:
                        return new Builder(k0Var);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"value_", "valueCase_", InitializationResponseOuterClass.InitializationResponse.class, AdResponseOuterClass.AdResponse.class, AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.class, AdDataRefreshResponseOuterClass.AdDataRefreshResponse.class, PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.class, AudienceManagementResponseOuterClass.AudienceManagementResponse.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Payload> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Payload.class) {
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

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                return this.valueCase_ == 4 ? (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.value_ : AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                return this.valueCase_ == 3 ? (AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) this.value_ : AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public AdResponseOuterClass.AdResponse getAdResponse() {
                return this.valueCase_ == 2 ? (AdResponseOuterClass.AdResponse) this.value_ : AdResponseOuterClass.AdResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse() {
                return this.valueCase_ == 6 ? (AudienceManagementResponseOuterClass.AudienceManagementResponse) this.value_ : AudienceManagementResponseOuterClass.AudienceManagementResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                return this.valueCase_ == 1 ? (InitializationResponseOuterClass.InitializationResponse) this.value_ : InitializationResponseOuterClass.InitializationResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                return this.valueCase_ == 5 ? (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) this.value_ : PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance();
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdDataRefreshResponse() {
                return this.valueCase_ == 4;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdPlayerConfigResponse() {
                return this.valueCase_ == 3;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAdResponse() {
                return this.valueCase_ == 2;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasAudienceManagementResponse() {
                return this.valueCase_ == 6;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasInitializationResponse() {
                return this.valueCase_ == 1;
            }

            @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.PayloadOrBuilder
            public boolean hasPrivacyUpdateResponse() {
                return this.valueCase_ == 5;
            }

            public static Builder newBuilder(Payload payload) {
                return DEFAULT_INSTANCE.createBuilder(payload);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Payload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Payload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Payload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Payload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Payload parseFrom(InputStream inputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Payload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface PayloadOrBuilder extends MessageLiteOrBuilder {
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse();

            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse();

            AdResponseOuterClass.AdResponse getAdResponse();

            AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse();

            InitializationResponseOuterClass.InitializationResponse getInitializationResponse();

            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse();

            Payload.ValueCase getValueCase();

            boolean hasAdDataRefreshResponse();

            boolean hasAdPlayerConfigResponse();

            boolean hasAdResponse();

            boolean hasAudienceManagementResponse();

            boolean hasInitializationResponse();

            boolean hasPrivacyUpdateResponse();
        }

        static {
            UniversalResponse universalResponse = new UniversalResponse();
            DEFAULT_INSTANCE = universalResponse;
            GeneratedMessageLite.registerDefaultInstance(UniversalResponse.class, universalResponse);
        }

        private UniversalResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMutableData() {
            this.mutableData_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = null;
            this.bitField0_ &= -2;
        }

        public static UniversalResponse getDefaultInstance() {
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
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMutableData(MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            MutableDataOuterClass.MutableData mutableData2 = this.mutableData_;
            if (mutableData2 == null || mutableData2 == MutableDataOuterClass.MutableData.getDefaultInstance()) {
                this.mutableData_ = mutableData;
            } else {
                this.mutableData_ = MutableDataOuterClass.MutableData.newBuilder(this.mutableData_).mergeFrom((MutableDataOuterClass.MutableData.Builder) mutableData).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePayload(Payload payload) {
            payload.getClass();
            Payload payload2 = this.payload_;
            if (payload2 == null || payload2 == Payload.getDefaultInstance()) {
                this.payload_ = payload;
            } else {
                this.payload_ = Payload.newBuilder(this.payload_).mergeFrom((Payload.Builder) payload).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UniversalResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMutableData(MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            this.mutableData_ = mutableData;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(Payload payload) {
            payload.getClass();
            this.payload_ = payload;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            wl.k0 k0Var = null;
            switch (wl.k0.f90717a[methodToInvoke.ordinal()]) {
                case 1:
                    return new UniversalResponse();
                case 2:
                    return new Builder(k0Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "payload_", "mutableData_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UniversalResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (UniversalResponse.class) {
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

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public MutableDataOuterClass.MutableData getMutableData() {
            MutableDataOuterClass.MutableData mutableData = this.mutableData_;
            return mutableData == null ? MutableDataOuterClass.MutableData.getDefaultInstance() : mutableData;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public Payload getPayload() {
            Payload payload = this.payload_;
            return payload == null ? Payload.getDefaultInstance() : payload;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasMutableData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponseOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(UniversalResponse universalResponse) {
            return DEFAULT_INSTANCE.createBuilder(universalResponse);
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UniversalResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UniversalResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(InputStream inputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UniversalResponseOrBuilder extends MessageLiteOrBuilder {
        ErrorOuterClass.Error getError();

        MutableDataOuterClass.MutableData getMutableData();

        UniversalResponse.Payload getPayload();

        boolean hasError();

        boolean hasMutableData();

        boolean hasPayload();
    }

    private UniversalResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
