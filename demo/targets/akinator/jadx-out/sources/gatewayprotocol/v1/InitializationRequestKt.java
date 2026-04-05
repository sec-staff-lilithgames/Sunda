package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class InitializationRequestKt {
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest initializationRequestBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(initializationRequestBuild, "_builder.build()");
            return initializationRequestBuild;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(auid, "_builder.getAuid()");
            return auid;
        }

        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(auidString, "_builder.getAuidString()");
            return auidString;
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(cache, "_builder.getCache()");
            return cache;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(externalUserIdentifier, "_builder.getExternalUserIdentifier()");
            return externalUserIdentifier;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uadsInitBlob, "_builder.getUadsInitBlob()");
            return uadsInitBlob;
        }

        public final String getUnityBuildGuid() {
            String unityBuildGuid = this._builder.getUnityBuildGuid();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(unityBuildGuid, "_builder.getUnityBuildGuid()");
            return unityBuildGuid;
        }

        public final ByteString getUnityInstallationId() {
            ByteString unityInstallationId = this._builder.getUnityInstallationId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(unityInstallationId, "_builder.getUnityInstallationId()");
            return unityInstallationId;
        }

        public final ByteString getUnityMegaSessionId() {
            ByteString unityMegaSessionId = this._builder.getUnityMegaSessionId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(unityMegaSessionId, "_builder.getUnityMegaSessionId()");
            return unityMegaSessionId;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(map, "map");
            this._builder.putAllExtras(map);
        }

        public final void putExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            this._builder.removeExtras(key);
        }

        public final void setAnalyticsUserId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAnalyticsUserId(value);
        }

        public final void setAuid(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAuid(value);
        }

        public final void setAuidString(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAuidString(value);
        }

        public final void setCache(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCache(value);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setClientInfo(value);
        }

        public final void setDeviceInfo(InitializationRequestOuterClass.InitializationDeviceInfo value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDeviceInfo(value);
        }

        public final void setExternalUserIdentifier(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setExternalUserIdentifier(value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setIdfi(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setIdfi(value);
        }

        public final void setIsFirstInit(boolean z10) {
            this._builder.setIsFirstInit(z10);
        }

        public final void setLegacyFlowUserConsent(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setLegacyFlowUserConsent(value);
        }

        public final void setPrivacy(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setPrivacy(value);
        }

        public final void setSessionId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setSessionId(value);
        }

        public final void setUadsInitBlob(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setUadsInitBlob(value);
        }

        public final void setUnityBuildGuid(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setUnityBuildGuid(value);
        }

        public final void setUnityInstallationId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setUnityInstallationId(value);
        }

        public final void setUnityMegaSessionId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setUnityMegaSessionId(value);
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationRequestKt() {
    }
}
