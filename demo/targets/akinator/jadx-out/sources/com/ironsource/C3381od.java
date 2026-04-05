package com.ironsource;

import com.ironsource.C3434s;
import com.ironsource.N7;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3381od {

    /* renamed from: a, reason: collision with root package name */
    private final C3514wb f38045a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C3434s> f38046b;

    public C3381od(C3514wb tools, Map<LevelPlay.AdFormat, C3434s> adFormatsConfigurations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f38045a = tools;
        this.f38046b = adFormatsConfigurations;
    }

    private final void b(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C3434s.d dVar) throws JSONException {
        Q3 q32 = Q3.Delivery;
        R4 r4C = dVar.c();
        a(aVar.a(str, adFormat, q32, new H3(r4C != null ? Boolean.valueOf(r4C.a()) : null, null, null, 6, null)), str, adFormat, q32);
    }

    private final void c(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C3434s.d dVar) throws JSONException {
        C3164cd c3164cdE = dVar.e();
        if (c3164cdE != null) {
            Q3 q32 = Q3.Pacing;
            a(aVar.a(str, adFormat, q32, new H3(c3164cdE.a(), c3164cdE.b(), P3.Second)), str, adFormat, q32);
        }
    }

    public final void a(N7.a cappingService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C3434s> entry : this.f38046b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C3434s.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C3434s.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(N7.a aVar, String str, LevelPlay.AdFormat adFormat, C3434s.d dVar) throws JSONException {
        K3 k3B = dVar.b();
        if (k3B != null) {
            Q3 q32 = Q3.ShowCount;
            a(aVar.a(str, adFormat, q32, new H3(k3B.a(), k3B.b(), k3B.c())), str, adFormat, q32);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, Q3 q32) throws JSONException {
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(obj);
        if (thM7134exceptionOrNullimpl != null) {
            this.f38045a.a(str, adFormat, new L3().a(q32), thM7134exceptionOrNullimpl.getMessage());
        }
    }
}
