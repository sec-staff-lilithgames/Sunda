package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class CampaignKt {
    public static final CampaignKt INSTANCE = new CampaignKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            CampaignStateOuterClass.Campaign campaignBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(campaignBuild, "_builder.build()");
            return campaignBuild;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(data, "_builder.getData()");
            return data;
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(loadTimestamp, "_builder.getLoadTimestamp()");
            return loadTimestamp;
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(showTimestamp, "_builder.getShowTimestamp()");
            return showTimestamp;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(Dsl dsl) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dsl, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        public final void setData(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void setDataVersion(int i10) {
            this._builder.setDataVersion(i10);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setLoadTimestamp(TimestampsOuterClass.Timestamps value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setLoadTimestamp(value);
        }

        public final void setPlacementId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setShowTimestamp(TimestampsOuterClass.Timestamps value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setShowTimestamp(value);
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignKt() {
    }
}
