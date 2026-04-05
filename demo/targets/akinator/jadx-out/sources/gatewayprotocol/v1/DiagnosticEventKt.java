package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DiagnosticEventKt {
    public static final DiagnosticEventKt INSTANCE = new DiagnosticEventKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class IntTagsProxy extends DslProxy {
            private IntTagsProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class StringTagsProxy extends DslProxy {
            private StringTagsProxy() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEvent _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEventBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(diagnosticEventBuild, "_builder.build()");
            return diagnosticEventBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearAdType() {
            this._builder.clearAdType();
        }

        public final void clearCustomEventType() {
            this._builder.clearCustomEventType();
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearEventType() {
            this._builder.clearEventType();
        }

        public final void clearHeaderBiddingTokenNumber() {
            this._builder.clearHeaderBiddingTokenNumber();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final /* synthetic */ void clearIntTags(DslMap dslMap) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearIntTags();
        }

        public final void clearIsHeaderBidding() {
            this._builder.clearIsHeaderBidding();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearReason() {
            this._builder.clearReason();
        }

        public final void clearReasonDebug() {
            this._builder.clearReasonDebug();
        }

        public final /* synthetic */ void clearStringTags(DslMap dslMap) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearStringTags();
        }

        public final void clearTimeValue() {
            this._builder.clearTimeValue();
        }

        public final void clearTimestamps() {
            this._builder.clearTimestamps();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
            DiagnosticEventRequestOuterClass.DiagnosticAdType adType = this._builder.getAdType();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adType, "_builder.getAdType()");
            return adType;
        }

        public final int getAdTypeValue() {
            return this._builder.getAdTypeValue();
        }

        public final String getCustomEventType() {
            String customEventType = this._builder.getCustomEventType();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(customEventType, "_builder.getCustomEventType()");
            return customEventType;
        }

        public final int getEventId() {
            return this._builder.getEventId();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventType getEventType() {
            DiagnosticEventRequestOuterClass.DiagnosticEventType eventType = this._builder.getEventType();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(eventType, "_builder.getEventType()");
            return eventType;
        }

        public final int getEventTypeValue() {
            return this._builder.getEventTypeValue();
        }

        public final int getHeaderBiddingTokenNumber() {
            return this._builder.getHeaderBiddingTokenNumber();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final /* synthetic */ DslMap getIntTagsMap() {
            Map<String, Integer> intTagsMap = this._builder.getIntTagsMap();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(intTagsMap, "_builder.getIntTagsMap()");
            return new DslMap(intTagsMap);
        }

        public final boolean getIsHeaderBidding() {
            return this._builder.getIsHeaderBidding();
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final String getReason() {
            String reason = this._builder.getReason();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(reason, "_builder.getReason()");
            return reason;
        }

        public final String getReasonDebug() {
            String reasonDebug = this._builder.getReasonDebug();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(reasonDebug, "_builder.getReasonDebug()");
            return reasonDebug;
        }

        public final /* synthetic */ DslMap getStringTagsMap() {
            Map<String, String> stringTagsMap = this._builder.getStringTagsMap();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(stringTagsMap, "_builder.getStringTagsMap()");
            return new DslMap(stringTagsMap);
        }

        public final double getTimeValue() {
            return this._builder.getTimeValue();
        }

        public final TimestampsOuterClass.Timestamps getTimestamps() {
            TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(timestamps, "_builder.getTimestamps()");
            return timestamps;
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasAdType() {
            return this._builder.hasAdType();
        }

        public final boolean hasCustomEventType() {
            return this._builder.hasCustomEventType();
        }

        public final boolean hasHeaderBiddingTokenNumber() {
            return this._builder.hasHeaderBiddingTokenNumber();
        }

        public final boolean hasImpressionOpportunityId() {
            return this._builder.hasImpressionOpportunityId();
        }

        public final boolean hasIsHeaderBidding() {
            return this._builder.hasIsHeaderBidding();
        }

        public final boolean hasPlacementId() {
            return this._builder.hasPlacementId();
        }

        public final boolean hasReason() {
            return this._builder.hasReason();
        }

        public final boolean hasReasonDebug() {
            return this._builder.hasReasonDebug();
        }

        public final boolean hasTimeValue() {
            return this._builder.hasTimeValue();
        }

        public final boolean hasTimestamps() {
            return this._builder.hasTimestamps();
        }

        public final /* synthetic */ void putAllIntTags(DslMap dslMap, Map map) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(map, "map");
            this._builder.putAllIntTags(map);
        }

        public final /* synthetic */ void putAllStringTags(DslMap dslMap, Map map) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(map, "map");
            this._builder.putAllStringTags(map);
        }

        public final void putIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            this._builder.putIntTags(key, i10);
        }

        public final void putStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.putStringTags(key, value);
        }

        public final /* synthetic */ void removeIntTags(DslMap dslMap, String key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            this._builder.removeIntTags(key);
        }

        public final /* synthetic */ void removeStringTags(DslMap dslMap, String key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            this._builder.removeStringTags(key);
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final void setAdFormatValue(int i10) {
            this._builder.setAdFormatValue(i10);
        }

        public final void setAdType(DiagnosticEventRequestOuterClass.DiagnosticAdType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAdType(value);
        }

        public final void setAdTypeValue(int i10) {
            this._builder.setAdTypeValue(i10);
        }

        public final void setCustomEventType(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setCustomEventType(value);
        }

        public final void setEventId(int i10) {
            this._builder.setEventId(i10);
        }

        public final void setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setEventType(value);
        }

        public final void setEventTypeValue(int i10) {
            this._builder.setEventTypeValue(i10);
        }

        public final void setHeaderBiddingTokenNumber(int i10) {
            this._builder.setHeaderBiddingTokenNumber(i10);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final /* synthetic */ void setIntTags(DslMap<String, Integer, IntTagsProxy> dslMap, String key, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            putIntTags(dslMap, key, i10);
        }

        public final void setIsHeaderBidding(boolean z10) {
            this._builder.setIsHeaderBidding(z10);
        }

        public final void setPlacementId(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setReason(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setReason(value);
        }

        public final void setReasonDebug(String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setReasonDebug(value);
        }

        public final /* synthetic */ void setStringTags(DslMap<String, String, StringTagsProxy> dslMap, String key, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslMap, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            putStringTags(dslMap, key, value);
        }

        public final void setTimeValue(double d10) {
            this._builder.setTimeValue(d10);
        }

        public final void setTimestamps(TimestampsOuterClass.Timestamps value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setTimestamps(value);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventKt() {
    }
}
