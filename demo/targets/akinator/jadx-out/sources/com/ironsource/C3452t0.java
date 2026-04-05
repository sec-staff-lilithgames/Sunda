package com.ironsource;

import com.ironsource.C3434s;
import com.ironsource.InterfaceC3459t7;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.t0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3452t0 implements N3 {

    /* renamed from: a, reason: collision with root package name */
    private final C3514wb f38870a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C3434s> f38871b;

    public C3452t0(C3514wb tools, Map<LevelPlay.AdFormat, C3434s> adFormatsConfigurations) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f38870a = tools;
        this.f38871b = adFormatsConfigurations;
    }

    private final void b(InterfaceC3459t7.a aVar, String str, C3434s.d dVar) throws JSONException {
        C3164cd c3164cdE = dVar.e();
        if (c3164cdE != null) {
            Q3 q32 = Q3.Pacing;
            a(aVar.a(str, q32, new H3(c3164cdE.a(), c3164cdE.b(), c3164cdE.c())), str, q32);
        }
    }

    @Override // com.ironsource.N3
    public void a(InterfaceC3459t7.a cappingService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C3434s>> it = this.f38871b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C3434s.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C3434s.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(InterfaceC3459t7.a aVar, String str, C3434s.d dVar) throws JSONException {
        K3 k3B = dVar.b();
        if (k3B != null) {
            Q3 q32 = Q3.ShowCount;
            a(aVar.a(str, q32, new H3(k3B.a(), k3B.b(), k3B.c())), str, q32);
        }
    }

    private final void a(Object obj, String str, Q3 q32) throws JSONException {
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(obj);
        if (thM7134exceptionOrNullimpl != null) {
            this.f38870a.a(str, new L3().a(q32), thM7134exceptionOrNullimpl.getMessage());
        }
    }
}
