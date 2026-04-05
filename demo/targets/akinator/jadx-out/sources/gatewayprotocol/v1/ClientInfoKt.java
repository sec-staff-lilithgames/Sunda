package gatewayprotocol.v1;

import gatewayprotocol.v1.ClientInfoOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ClientInfoKt {
    public static final ClientInfoKt INSTANCE = new ClientInfoKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ClientInfoOuterClass.ClientInfo.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ClientInfoOuterClass.ClientInfo.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ClientInfoOuterClass.ClientInfo.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ ClientInfoOuterClass.ClientInfo _build() {
            ClientInfoOuterClass.ClientInfo clientInfoBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(clientInfoBuild, "_builder.build()");
            return clientInfoBuild;
        }

        public final void clearAdQualitySdkVersion() {
            this._builder.clearAdQualitySdkVersion();
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIsFidAvailable() {
            this._builder.clearIsFidAvailable();
        }

        public final void clearMediationAdapterVersion() {
            this._builder.clearMediationAdapterVersion();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOfferwallVersion() {
            this._builder.clearOfferwallVersion();
        }

        public final void clearOmidPartnerVersion() {
            this._builder.clearOmidPartnerVersion();
        }

        public final void clearOmidVersion() {
            this._builder.clearOmidVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearScarVersionName() {
            this._builder.clearScarVersionName();
        }

        public final void clearSdkDevelopmentPlatform() {
            this._builder.clearSdkDevelopmentPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearTest() {
            this._builder.clearTest();
        }

        public final String getAdQualitySdkVersion() {
            String adQualitySdkVersion = this._builder.getAdQualitySdkVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adQualitySdkVersion, "_builder.getAdQualitySdkVersion()");
            return adQualitySdkVersion;
        }

        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final String getGameId() {
            String gameId = this._builder.getGameId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final boolean getIsFidAvailable() {
            return this._builder.getIsFidAvailable();
        }

        public final String getMediationAdapterVersion() {
            String mediationAdapterVersion = this._builder.getMediationAdapterVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mediationAdapterVersion, "_builder.getMediationAdapterVersion()");
            return mediationAdapterVersion;
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        public final String getOfferwallVersion() {
            String offerwallVersion = this._builder.getOfferwallVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(offerwallVersion, "_builder.getOfferwallVersion()");
            return offerwallVersion;
        }

        public final String getOmidPartnerVersion() {
            String omidPartnerVersion = this._builder.getOmidPartnerVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(omidPartnerVersion, "_builder.getOmidPartnerVersion()");
            return omidPartnerVersion;
        }

        public final String getOmidVersion() {
            String omidVersion = this._builder.getOmidVersion();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(omidVersion, "_builder.getOmidVersion()");
            return omidVersion;
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(platform, "_builder.getPlatform()");
            return platform;
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        public final String getScarVersionName() {
            String scarVersionName = this._builder.getScarVersionName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(scarVersionName, "_builder.getScarVersionName()");
            return scarVersionName;
        }

        public final String getSdkDevelopmentPlatform() {
            String sdkDevelopmentPlatform = this._builder.getSdkDevelopmentPlatform();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sdkDevelopmentPlatform, "_builder.getSdkDevelopmentPlatform()");
            return sdkDevelopmentPlatform;
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final boolean getTest() {
            return this._builder.getTest();
        }

        public final boolean hasAdQualitySdkVersion() {
            return this._builder.hasAdQualitySdkVersion();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasIsFidAvailable() {
            return this._builder.hasIsFidAvailable();
        }

        public final boolean hasMediationAdapterVersion() {
            return this._builder.hasMediationAdapterVersion();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasOfferwallVersion() {
            return this._builder.hasOfferwallVersion();
        }

        public final boolean hasOmidPartnerVersion() {
            return this._builder.hasOmidPartnerVersion();
        }

        public final boolean hasOmidVersion() {
            return this._builder.hasOmidVersion();
        }

        public final boolean hasScarVersionName() {
            return this._builder.hasScarVersionName();
        }

        public final boolean hasSdkDevelopmentPlatform() {
            return this._builder.hasSdkDevelopmentPlatform();
        }

        public final void setAdQualitySdkVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdQualitySdkVersion(value);
        }

        public final void setCustomMediationName(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCustomMediationName(value);
        }

        public final void setGameId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setGameId(value);
        }

        public final void setIsFidAvailable(boolean z10) {
            this._builder.setIsFidAvailable(z10);
        }

        public final void setMediationAdapterVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setMediationAdapterVersion(value);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setMediationProvider(value);
        }

        public final void setMediationProviderValue(int i10) {
            this._builder.setMediationProviderValue(i10);
        }

        public final void setMediationVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setMediationVersion(value);
        }

        public final void setOfferwallVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setOfferwallVersion(value);
        }

        public final void setOmidPartnerVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setOmidPartnerVersion(value);
        }

        public final void setOmidVersion(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setOmidVersion(value);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setPlatform(value);
        }

        public final void setPlatformValue(int i10) {
            this._builder.setPlatformValue(i10);
        }

        public final void setScarVersionName(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setScarVersionName(value);
        }

        public final void setSdkDevelopmentPlatform(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setSdkDevelopmentPlatform(value);
        }

        public final void setSdkVersion(int i10) {
            this._builder.setSdkVersion(i10);
        }

        public final void setSdkVersionName(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setSdkVersionName(value);
        }

        public final void setTest(boolean z10) {
            this._builder.setTest(z10);
        }

        private Dsl(ClientInfoOuterClass.ClientInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private ClientInfoKt() {
    }
}
