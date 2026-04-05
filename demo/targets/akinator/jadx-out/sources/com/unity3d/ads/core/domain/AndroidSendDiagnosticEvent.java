package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidSendDiagnosticEvent implements SendDiagnosticEvent {
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private final LifecycleDataSource lifecycleDataSource;

    public AndroidSendDiagnosticEvent(DiagnosticEventRepository diagnosticEventRepository, GetDiagnosticEventRequest getDiagnosticEventRequest, LifecycleDataSource lifecycleDataSource) {
        e0.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        e0.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        e0.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    @Override // com.unity3d.ads.core.domain.SendDiagnosticEvent
    public void invoke(String event, Double d10, Map<String, String> map, Map<String, Integer> map2, AdObject adObject, Integer num) {
        Map<String, String> linkedHashMap;
        e0.checkNotNullParameter(event, "event");
        Boolean boolValueOf = adObject != null ? Boolean.valueOf(adObject.isHeaderBidding()) : null;
        ByteString opportunityId = adObject != null ? adObject.getOpportunityId() : null;
        String placementId = adObject != null ? adObject.getPlacementId() : null;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = adObject != null ? adObject.getAdType() : null;
        if (map == null || (linkedHashMap = p1.toMutableMap(map)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        Map<String, String> map3 = linkedHashMap;
        if (adObject != null && adObject.isScarAd()) {
            map3.put("scar", "true");
        }
        if (adObject != null && adObject.isOfferwallAd()) {
            map3.put("offerwall", "true");
        }
        map3.put("app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
        this.diagnosticEventRepository.addDiagnosticEvent(this.getDiagnosticEventRequest.invoke(event, map3, map2, d10, boolValueOf, opportunityId, placementId, adType, num));
    }
}
