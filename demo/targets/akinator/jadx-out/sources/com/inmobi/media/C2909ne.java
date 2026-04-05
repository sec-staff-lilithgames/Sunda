package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2909ne extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2909ne f33164a = new C2909ne();

    public C2909ne() {
        super(1);
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2762f2 it = (C2762f2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        int i10 = it.f32830a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case 150:
                    C3061we c3061we = C2926oe.f33225i;
                    if (c3061we != null) {
                        Map map = it.f32832c;
                        Object obj2 = map != null ? map.get("data") : null;
                        c3061we.a("CrashEventOccurred", obj2 instanceof C2915o3 ? (C2915o3) obj2 : null);
                        break;
                    }
                    break;
                case 151:
                    C3061we c3061we2 = C2926oe.f33225i;
                    if (c3061we2 != null) {
                        Map map2 = it.f32832c;
                        Object obj3 = map2 != null ? map2.get("data") : null;
                        Lf lf2 = obj3 instanceof Lf ? (Lf) obj3 : null;
                        if (lf2 != null && AbstractC2809hf.a(lf2) && !R3.f32183a.J()) {
                            c3061we2.a("MainThreadBlockedEvent", lf2);
                            break;
                        }
                    }
                    break;
                case 152:
                    C3061we c3061we3 = C2926oe.f33225i;
                    if (c3061we3 != null) {
                        Map map3 = it.f32832c;
                        Object obj4 = map3 != null ? map3.get("data") : null;
                        c3061we3.a(obj4 instanceof C2761f1 ? (C2761f1) obj4 : null);
                        break;
                    }
                    break;
                default:
                    C2926oe c2926oe = C2926oe.f33217a;
                    break;
            }
        } else {
            C2926oe.f33220d.set(false);
            C3102z4 c3102z4 = C2926oe.f33222f;
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
            C2926oe.f33222f = null;
            C2926oe.f33225i = null;
            C2925od.f().a(C2926oe.f33224h);
        }
        return tu.x0.f87415a;
    }
}
