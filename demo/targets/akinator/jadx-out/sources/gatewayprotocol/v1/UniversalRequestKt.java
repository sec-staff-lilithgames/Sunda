package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class UniversalRequestKt {
    public static final UniversalRequestKt INSTANCE = new UniversalRequestKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest _build() {
            UniversalRequestOuterClass.UniversalRequest universalRequestBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(universalRequestBuild, "_builder.build()");
            return universalRequestBuild;
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            UniversalRequestOuterClass.UniversalRequest.Payload payload = this._builder.getPayload();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(payload, "_builder.getPayload()");
            return payload;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setPayload(UniversalRequestOuterClass.UniversalRequest.Payload value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setPayload(value);
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setSharedData(value);
        }

        private Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PayloadKt {
        public static final PayloadKt INSTANCE = new PayloadKt();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, kotlin.jvm.internal.u uVar) {
                this(builder);
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                UniversalRequestOuterClass.UniversalRequest.Payload payloadBuild = this._builder.build();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(payloadBuild, "_builder.build()");
                return payloadBuild;
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final void clearAudienceManagementRequest() {
                this._builder.clearAudienceManagementRequest();
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            public final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = this._builder.getAdDataRefreshRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(adDataRefreshRequest, "_builder.getAdDataRefreshRequest()");
                return adDataRefreshRequest;
            }

            public final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = this._builder.getAdPlayerConfigRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(adPlayerConfigRequest, "_builder.getAdPlayerConfigRequest()");
                return adPlayerConfigRequest;
            }

            public final AdRequestOuterClass.AdRequest getAdRequest() {
                AdRequestOuterClass.AdRequest adRequest = this._builder.getAdRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(adRequest, "_builder.getAdRequest()");
                return adRequest;
            }

            public final AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequest() {
                AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest = this._builder.getAudienceManagementRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(audienceManagementRequest, "_builder.getAudienceManagementRequest()");
                return audienceManagementRequest;
            }

            public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = this._builder.getDiagnosticEventRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(diagnosticEventRequest, "_builder.getDiagnosticEventRequest()");
                return diagnosticEventRequest;
            }

            public final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = this._builder.getGetTokenEventRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(getTokenEventRequest, "_builder.getGetTokenEventRequest()");
                return getTokenEventRequest;
            }

            public final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest = this._builder.getInitializationCompletedEventRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(initializationCompletedEventRequest, "_builder.getInitializationCompletedEventRequest()");
                return initializationCompletedEventRequest;
            }

            public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(initializationRequest, "_builder.getInitializationRequest()");
                return initializationRequest;
            }

            public final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEvent = this._builder.getOperativeEvent();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(operativeEvent, "_builder.getOperativeEvent()");
                return operativeEvent;
            }

            public final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = this._builder.getPrivacyUpdateRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(privacyUpdateRequest, "_builder.getPrivacyUpdateRequest()");
                return privacyUpdateRequest;
            }

            public final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = this._builder.getTransactionEventRequest();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(transactionEventRequest, "_builder.getTransactionEventRequest()");
                return transactionEventRequest;
            }

            public final UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueCase = this._builder.getValueCase();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(valueCase, "_builder.getValueCase()");
                return valueCase;
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final boolean hasAudienceManagementRequest() {
                return this._builder.hasAudienceManagementRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            public final void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setAdDataRefreshRequest(value);
            }

            public final void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setAdPlayerConfigRequest(value);
            }

            public final void setAdRequest(AdRequestOuterClass.AdRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setAdRequest(value);
            }

            public final void setAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setAudienceManagementRequest(value);
            }

            public final void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setDiagnosticEventRequest(value);
            }

            public final void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setGetTokenEventRequest(value);
            }

            public final void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setInitializationCompletedEventRequest(value);
            }

            public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setInitializationRequest(value);
            }

            public final void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setOperativeEvent(value);
            }

            public final void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setPrivacyUpdateRequest(value);
            }

            public final void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setTransactionEventRequest(value);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }
        }

        private PayloadKt() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SharedDataKt {
        public static final SharedDataKt INSTANCE = new SharedDataKt();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, kotlin.jvm.internal.u uVar) {
                this(builder);
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                UniversalRequestOuterClass.UniversalRequest.SharedData sharedDataBuild = this._builder.build();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(sharedDataBuild, "_builder.build()");
                return sharedDataBuild;
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            public final Timestamp getAppStartTime() {
                Timestamp appStartTime = this._builder.getAppStartTime();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(appStartTime, "_builder.getAppStartTime()");
                return appStartTime;
            }

            public final ByteString getCurrentState() {
                ByteString currentState = this._builder.getCurrentState();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentState, "_builder.getCurrentState()");
                return currentState;
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this._builder.getDeveloperConsent();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(developerConsent, "_builder.getDeveloperConsent()");
                return developerConsent;
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(Dsl dsl) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(limitedSessionToken, "_builder.getLimitedSessionToken()");
                return limitedSessionToken;
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }

            public final PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this._builder.getPii();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(pii, "_builder.getPii()");
                return pii;
            }

            public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            public final Timestamp getSdkStartTime() {
                Timestamp sdkStartTime = this._builder.getSdkStartTime();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(sdkStartTime, "_builder.getSdkStartTime()");
                return sdkStartTime;
            }

            public final ByteString getSessionToken() {
                ByteString sessionToken = this._builder.getSessionToken();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(sessionToken, "_builder.getSessionToken()");
                return sessionToken;
            }

            public final TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this._builder.getTestData();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(testData, "_builder.getTestData()");
                return testData;
            }

            public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
                kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
                return UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            public final TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(timestamps, "_builder.getTimestamps()");
                return timestamps;
            }

            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            public final void setAppStartTime(Timestamp value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setAppStartTime(value);
            }

            public final void setCurrentState(ByteString value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setCurrentState(value);
            }

            public final void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setDeveloperConsent(value);
            }

            public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setLimitedSessionToken(value);
            }

            public final void setPii(PiiOuterClass.Pii value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setPii(value);
            }

            public final void setSdkStartTime(Timestamp value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setSdkStartTime(value);
            }

            public final void setSessionToken(ByteString value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setSessionToken(value);
            }

            public final void setTestData(TestDataOuterClass.TestData value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setTestData(value);
            }

            public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                this._builder.setTimestamps(value);
            }

            public final void setWebviewVersion(int i10) {
                this._builder.setWebviewVersion(i10);
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }
        }

        private SharedDataKt() {
        }
    }

    private UniversalRequestKt() {
    }

    /* renamed from: -initializepayload, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.Payload m4111initializepayload(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* renamed from: -initializesharedData, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.SharedData m4112initializesharedData(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        SharedDataKt.Dsl.Companion companion = SharedDataKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        SharedDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
