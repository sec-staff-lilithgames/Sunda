package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class InitializationResponseKt {
    public static final InitializationResponseKt INSTANCE = new InitializationResponseKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ScarEligibleFormatsProxy extends DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ScarPlacementsProxy extends DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.InitializationResponse _build() {
            InitializationResponseOuterClass.InitializationResponse initializationResponseBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(initializationResponseBuild, "_builder.build()");
            return initializationResponseBuild;
        }

        public final /* synthetic */ void addAllScarEligibleFormats(DslList dslList, Iterable values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            this._builder.addAllScarEligibleFormats(values);
        }

        public final /* synthetic */ void addScarEligibleFormats(DslList dslList, AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.addScarEligibleFormats(value);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final /* synthetic */ void clearScarEligibleFormats(DslList dslList) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearScarEligibleFormats();
        }

        public final /* synthetic */ void clearScarPlacements(DslMap dslMap) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
            return InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this._builder.getNativeConfiguration();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(nativeConfiguration, "_builder.getNativeConfiguration()");
            return nativeConfiguration;
        }

        public final /* synthetic */ DslList getScarEligibleFormats() {
            List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = this._builder.getScarEligibleFormatsList();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(scarEligibleFormatsList, "_builder.getScarEligibleFormatsList()");
            return new DslList(scarEligibleFormatsList);
        }

        public final /* synthetic */ DslMap getScarPlacementsMap() {
            Map<String, InitializationResponseOuterClass.Placement> scarPlacementsMap = this._builder.getScarPlacementsMap();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(scarPlacementsMap, "_builder.getScarPlacementsMap()");
            return new DslMap(scarPlacementsMap);
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        public final String getUniversalRequestUrl() {
            String universalRequestUrl = this._builder.getUniversalRequestUrl();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(universalRequestUrl, "_builder.getUniversalRequestUrl()");
            return universalRequestUrl;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        public final /* synthetic */ void plusAssignAllScarEligibleFormats(DslList<AdFormatOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, Iterable<? extends AdFormatOuterClass.AdFormat> values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            addAllScarEligibleFormats(dslList, values);
        }

        public final /* synthetic */ void plusAssignScarEligibleFormats(DslList<AdFormatOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            addScarEligibleFormats(dslList, value);
        }

        public final /* synthetic */ void putAllScarPlacements(DslMap dslMap, Map map) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(map, "map");
            this._builder.putAllScarPlacements(map);
        }

        public final void putScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String key, InitializationResponseOuterClass.Placement value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.putScarPlacements(key, value);
        }

        public final /* synthetic */ void removeScarPlacements(DslMap dslMap, String key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            this._builder.removeScarPlacements(key);
        }

        public final void setCountOfLastShownCampaigns(int i10) {
            this._builder.setCountOfLastShownCampaigns(i10);
        }

        public final void setError(ErrorOuterClass.Error value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setError(value);
        }

        public final void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setNativeConfiguration(value);
        }

        public final /* synthetic */ void setScarEligibleFormats(DslList dslList, int i10, AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setScarEligibleFormats(i10, value);
        }

        public final /* synthetic */ void setScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String key, InitializationResponseOuterClass.Placement value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            putScarPlacements(dslMap, key, value);
        }

        public final void setTriggerInitializationCompletedRequest(boolean z10) {
            this._builder.setTriggerInitializationCompletedRequest(z10);
        }

        public final void setUniversalRequestUrl(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setUniversalRequestUrl(value);
        }

        private Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationResponseKt() {
    }
}
