package com.fyber.inneractive.sdk.mraid;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends e {
    public i(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        int iA = a("w");
        int iA2 = a(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME);
        this.f24173c.a((String) this.f24172b.get("url"), iA <= 0 ? -1 : iA, iA2 <= 0 ? -1 : iA2, "true".equals(this.f24172b.get("shouldUseCustomClose")), "true".equals(this.f24172b.get("lockOrientation")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.f24172b.get("url");
    }
}
