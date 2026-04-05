package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2905na {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f33160a;

    public C2905na(U0 adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        this.f33160a = adUnit;
    }

    public final byte[] a() {
        U uI0 = this.f33160a.i0();
        HashMap mapHashMapOf = uu.p1.hashMapOf(tu.e0.to("h-user-agent", C2925od.k()));
        if (mapHashMapOf != null) {
            HashMap map = uI0.f32502k;
            if (map != null) {
                map.putAll(mapHashMapOf);
            }
        } else {
            uI0.getClass();
        }
        uI0.f();
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a("root", C2925od.b(), null);
        RootConfig rootConfig = configA instanceof RootConfig ? (RootConfig) configA : null;
        if (rootConfig != null && rootConfig.isMonetizationDisabled()) {
            throw new L(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED), (short) 2012);
        }
        if (!uI0.f32495d) {
            throw new L(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED), (short) 2141);
        }
        byte[] bytes = uI0.c().getBytes(sv.g.f86134b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
