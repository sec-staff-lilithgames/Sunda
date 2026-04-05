package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3536y implements InterfaceC3337m7 {

    /* renamed from: a, reason: collision with root package name */
    private final P8 f39245a;

    public C3536y(P8 sessionDepthService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        this.f39245a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC3337m7
    public void a(Map<String, Object> output) {
        kotlin.jvm.internal.e0.checkNotNullParameter(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Q6.I0, Integer.valueOf(this.f39245a.a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Q6.I0, Integer.valueOf(this.f39245a.a(LevelPlay.AdFormat.REWARDED)));
        output.put(Q6.F0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(Q6.I0, Integer.valueOf(this.f39245a.a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(Q6.I0, Integer.valueOf(this.f39245a.a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
