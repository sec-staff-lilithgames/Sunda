package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GetDiagnosticEventRequest {
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final MutableStateFlow<Integer> uniqueId;

    public GetDiagnosticEventRequest(GetSharedDataTimestamps getSharedDataTimestamps) {
        e0.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.uniqueId = StateFlowKt.MutableStateFlow(-1);
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(String eventName, Map<String, String> map, Map<String, Integer> map2, Double d10, Boolean bool, ByteString byteString, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, Integer num) {
        Integer value;
        Integer numValueOf;
        e0.checkNotNullParameter(eventName, "eventName");
        DiagnosticEventKt.Dsl.Companion companion = DiagnosticEventKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEvent.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DiagnosticEventKt.Dsl dsl_create = companion._create(builderNewBuilder);
        MutableStateFlow<Integer> mutableStateFlow = this.uniqueId;
        do {
            value = mutableStateFlow.getValue();
            numValueOf = Integer.valueOf(value.intValue() + 1);
        } while (!mutableStateFlow.compareAndSet(value, numValueOf));
        dsl_create.setEventId(numValueOf.intValue());
        dsl_create.setEventType(DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_CUSTOM);
        dsl_create.setTimestamps(this.getSharedDataTimestamps.invoke());
        dsl_create.setCustomEventType(eventName);
        if (map != null) {
            dsl_create.putAllStringTags(dsl_create.getStringTagsMap(), map);
        }
        if (map2 != null) {
            dsl_create.putAllIntTags(dsl_create.getIntTagsMap(), map2);
        }
        if (d10 != null) {
            dsl_create.setTimeValue(d10.doubleValue());
        }
        if (bool != null) {
            dsl_create.setIsHeaderBidding(bool.booleanValue());
        }
        if (byteString != null) {
            dsl_create.setImpressionOpportunityId(byteString);
        }
        if (str != null) {
            dsl_create.setPlacementId(str);
        }
        if (diagnosticAdType != null) {
            dsl_create.setAdType(diagnosticAdType);
        }
        if (num != null) {
            dsl_create.setHeaderBiddingTokenNumber(num.intValue());
        }
        return dsl_create._build();
    }
}
