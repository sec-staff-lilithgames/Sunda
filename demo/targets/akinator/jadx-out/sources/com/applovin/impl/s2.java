package com.applovin.impl;

import android.os.Bundle;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s2 {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f15214a = new StringBuilder();

    public s2 a(String str, Object obj) {
        return a(str, obj, "");
    }

    public s2 b(String str) {
        this.f15214a.append(str);
        return this;
    }

    public String toString() {
        return this.f15214a.toString();
    }

    public s2 a(String str, Object obj, String str2) {
        StringBuilder sb2 = this.f15214a;
        sb2.append("\n");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append(str2);
        return this;
    }

    public s2 b(com.applovin.impl.sdk.ad.b bVar) {
        a("Target", bVar.g0()).a("close_style", bVar.q()).a("close_delay_graphic", Long.valueOf(bVar.s()), ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
        if (bVar instanceof com.applovin.impl.sdk.ad.a) {
            com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) bVar;
            a("HTML", aVar.s1().substring(0, Math.min(aVar.s1().length(), 64)));
        }
        if (bVar.hasVideoUrl()) {
            a("close_delay", Long.valueOf(bVar.n0()), ApsMetricsDataMap.APSMETRICS_FIELD_SDK).a("skip_style", bVar.e0()).a("Streaming", Boolean.valueOf(bVar.O0())).a("Video Location", bVar.S()).a("video_button_properties", bVar.l0());
        }
        return this;
    }

    public s2 a(String str) {
        StringBuilder sb2 = this.f15214a;
        sb2.append("\n");
        sb2.append(str);
        return this;
    }

    public s2 a() {
        this.f15214a.append("\n========================================");
        return this;
    }

    public s2 a(com.applovin.impl.sdk.ad.b bVar) {
        boolean z10 = bVar instanceof l7;
        a("Format", bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null).a("Ad ID", Long.valueOf(bVar.getAdIdNumber())).a("Zone ID", bVar.getAdZone().e()).a("Ad Class", z10 ? "VastAd" : "AdServerAd");
        String dspName = bVar.getDspName();
        if (StringUtils.isValidString(dspName)) {
            a("DSP Name", dspName);
        }
        if (z10) {
            a("VAST DSP", ((l7) bVar).z1());
        }
        return this;
    }

    public s2 a(v2 v2Var) {
        return a(AndroidInitializeBoldSDK.MSG_NETWORK, v2Var.c()).a("Adapter Version", v2Var.z()).a("Format", v2Var.getFormat().getLabel()).a("Ad Unit ID", v2Var.getAdUnitId()).a("Placement", v2Var.getPlacement()).a("Network Placement", v2Var.Q()).a("Serve ID", v2Var.P()).a("Creative ID", StringUtils.isValidString(v2Var.getCreativeId()) ? v2Var.getCreativeId() : "None").a("Ad Domain", StringUtils.isValidString(v2Var.v()) ? v2Var.v() : "None").a("DSP Name", StringUtils.isValidString(v2Var.getDspName()) ? v2Var.getDspName() : "None").a("DSP ID", StringUtils.isValidString(v2Var.getDspId()) ? v2Var.getDspId() : "None").a("Server Parameters", v2Var.l());
    }

    public s2 a(AppLovinAdView appLovinAdView) {
        return a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).a("Visibility", b8.a(appLovinAdView.getVisibility()));
    }

    public s2 a(com.applovin.impl.sdk.k kVar) {
        return a("Muted", Boolean.valueOf(kVar.o0().isMuted()));
    }

    public s2 a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(str, bundle.get(str));
            }
        }
        return this;
    }
}
