package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonUniversalRequestTtlValidator implements UniversalRequestTtlValidator {
    @Override // com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator
    public boolean invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy) {
        e0.checkNotNullParameter(universalRequest, "universalRequest");
        e0.checkNotNullParameter(requestPolicy, "requestPolicy");
        return System.currentTimeMillis() - (universalRequest.getSharedData().getTimestamps().getTimestamp().getSeconds() * ((long) 1000)) < ((long) requestPolicy.getMaxDuration());
    }
}
