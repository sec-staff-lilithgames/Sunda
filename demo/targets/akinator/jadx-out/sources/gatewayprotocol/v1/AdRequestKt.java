package gatewayprotocol.v1;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdRequestKt {
    public static final AdRequestKt INSTANCE = new AdRequestKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdRequestOuterClass.AdRequest.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.AdRequest.Builder builder) {
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

        public /* synthetic */ Dsl(AdRequestOuterClass.AdRequest.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ AdRequestOuterClass.AdRequest _build() {
            AdRequestOuterClass.AdRequest adRequestBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adRequestBuild, "_builder.build()");
            return adRequestBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdRequestType() {
            this._builder.clearAdRequestType();
        }

        public final void clearBannerSize() {
            this._builder.clearBannerSize();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearRequestImpressionConfiguration() {
            this._builder.clearRequestImpressionConfiguration();
        }

        public final void clearScarSignal() {
            this._builder.clearScarSignal();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final void clearTcf() {
            this._builder.clearTcf();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final AdRequestOuterClass.AdRequestType getAdRequestType() {
            AdRequestOuterClass.AdRequestType adRequestType = this._builder.getAdRequestType();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adRequestType, "_builder.getAdRequestType()");
            return adRequestType;
        }

        public final int getAdRequestTypeValue() {
            return this._builder.getAdRequestTypeValue();
        }

        public final AdRequestOuterClass.BannerSize getBannerSize() {
            AdRequestOuterClass.BannerSize bannerSize = this._builder.getBannerSize();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bannerSize, "_builder.getBannerSize()");
            return bannerSize;
        }

        public final AdRequestOuterClass.BannerSize getBannerSizeOrNull(Dsl dsl) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
            return AdRequestKtKt.getBannerSizeOrNull(dsl._builder);
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mediationAdUnitId, "_builder.getMediationAdUnitId()");
            return mediationAdUnitId;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
            return AdRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final boolean getRequestImpressionConfiguration() {
            return this._builder.getRequestImpressionConfiguration();
        }

        public final ByteString getScarSignal() {
            ByteString scarSignal = this._builder.getScarSignal();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(scarSignal, "_builder.getScarSignal()");
            return scarSignal;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final ByteString getTcf() {
            ByteString tcf = this._builder.getTcf();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(tcf, "_builder.getTcf()");
            return tcf;
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdRequestType() {
            return this._builder.hasAdRequestType();
        }

        public final boolean hasBannerSize() {
            return this._builder.hasBannerSize();
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final boolean hasTcf() {
            return this._builder.hasTcf();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
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

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setAdRequestType(AdRequestOuterClass.AdRequestType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdRequestType(value);
        }

        public final void setAdRequestTypeValue(int i10) {
            this._builder.setAdRequestTypeValue(i10);
        }

        public final void setBannerSize(AdRequestOuterClass.BannerSize value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setBannerSize(value);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            putExtras(dslMap, key, value);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setMediationAdUnitId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void setPlacementId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setRequestImpressionConfiguration(boolean z10) {
            this._builder.setRequestImpressionConfiguration(z10);
        }

        public final void setScarSignal(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setScarSignal(value);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        public final void setTcf(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setTcf(value);
        }

        public final void setWebviewVersion(int i10) {
            this._builder.setWebviewVersion(i10);
        }

        private Dsl(AdRequestOuterClass.AdRequest.Builder builder) {
            this._builder = builder;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(dynamicDeviceInfo, PtLatqAYjEFT.SdmNNYDDpqO);
            return dynamicDeviceInfo;
        }
    }

    private AdRequestKt() {
    }
}
