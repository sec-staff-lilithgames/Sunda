package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J6 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K6 f31905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J6(K6 k62) {
        super(1);
        this.f31905a = k62;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2762f2 it = (C2762f2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        int i10 = it.f32830a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case 150:
                case 151:
                case 152:
                    Map map = it.f32832c;
                    if (map != null && map.containsKey("data")) {
                        Object obj2 = it.f32832c.get("data");
                        kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        this.f31905a.b((Z5) obj2);
                        break;
                    }
                    break;
            }
        } else {
            K6 k62 = this.f31905a;
            C3102z4 c3102z4 = k62.f31945b;
            if (c3102z4 != null) {
                ScheduledExecutorService scheduledExecutorService = c3102z4.f33693h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                c3102z4.f33693h = null;
                c3102z4.f33690e.set(false);
                c3102z4.f33691f.set(true);
                c3102z4.f33692g.clear();
                c3102z4.f33694i = null;
            }
            k62.f31945b = null;
            C2925od.f().a(k62.f31947d);
        }
        return tu.x0.f87415a;
    }
}
