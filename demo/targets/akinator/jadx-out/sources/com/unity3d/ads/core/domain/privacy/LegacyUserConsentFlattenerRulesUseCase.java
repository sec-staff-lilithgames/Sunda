package com.unity3d.ads.core.domain.privacy;

import com.amazon.device.ads.DtbDeviceRegistration;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import uu.o0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(p0.mutableListOf(DtbDeviceRegistration.CONFIG_PRIVACY_KEY, "unity", "pipl"), o0.listOf("value"), p0.mutableListOf("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
