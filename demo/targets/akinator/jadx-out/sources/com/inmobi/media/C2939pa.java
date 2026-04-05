package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Map;
import xv.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.pa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2939pa implements Ta {

    /* renamed from: a, reason: collision with root package name */
    public final M5 f33268a;

    public C2939pa(AdConfig.PingsV2Config pingsConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pingsConfig, "pingsConfig");
        xv.x dispatcher = new xv.x();
        dispatcher.setMaxRequests(pingsConfig.getMaxBatchSize().getHigh());
        Ge timeoutConfig = new Ge(pingsConfig.getConnectTimeout(), pingsConfig.getReadTimeout(), pingsConfig.getCallTimeout());
        xv.i0[] interceptors = new xv.i0[0];
        kotlin.jvm.internal.e0.checkNotNullParameter(interceptors, "interceptors");
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f33268a = new M5(interceptors, dispatcher, timeoutConfig);
    }

    @Override // com.inmobi.media.Ta
    public final Object a(Ja ping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        HashMap map = new HashMap(ping.f31915c);
        map.put("user-agent", C2925od.k());
        V9 request = new V9(ping.f31913a, map, ping.f31916d);
        M5 m52 = this.f33268a;
        m52.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        C2746e3 c2746e3 = m52.f32026a;
        c2746e3.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        xv.l0 l0Var = c2746e3.f32798a;
        o0.a aVarUrl = new o0.a().url(request.f32393a);
        for (Map.Entry entry : map.entrySet()) {
            aVarUrl.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        aVarUrl.get();
        tu.v vVar = new tu.v(aVarUrl.build(), null);
        xv.o0 o0Var = (xv.o0) vVar.component1();
        C3034v4 c3034v4 = (C3034v4) vVar.component2();
        return c3034v4 != null ? c3034v4 : c2746e3.a(l0Var, o0Var, request.f32393a);
    }
}
