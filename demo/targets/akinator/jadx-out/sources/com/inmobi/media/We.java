package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class We {

    /* renamed from: a, reason: collision with root package name */
    public static final JSONObject f32469a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f32470b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public static C2690af f32471c;

    public static void a() {
        synchronized (f32469a) {
            f32471c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b() {
        /*
            org.json.JSONObject r0 = com.inmobi.media.We.f32469a
            monitor-enter(r0)
            com.inmobi.media.af r1 = com.inmobi.media.We.f32471c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A     // Catch: java.lang.Throwable -> L11
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L11:
            r1 = move-exception
            goto L16
        L13:
            r1 = 0
        L14:
            monitor-exit(r0)
            return r1
        L16:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.We.b():boolean");
    }

    public static void c() {
        C2690af c2690af;
        synchronized (f32469a) {
            if (b() && (c2690af = f32471c) != null) {
                c2690af.A.compareAndSet(false, true);
            }
        }
        d();
    }

    public static void d() {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        SignalsConfig.UnifiedIdServiceConfig unifiedIdServiceConfig = ((SignalsConfig) AbstractC3035v5.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig();
        synchronized (f32469a) {
            String url = unifiedIdServiceConfig.getUrl();
            Config configA = O2.a("signals", C2925od.b(), null);
            kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
            C2690af c2690af = new C2690af(url, new Te(((SignalsConfig) configA).getIncludeIdParams()), C2925od.b(), unifiedIdServiceConfig.getMaxRetries(), unifiedIdServiceConfig.getRetryInterval(), unifiedIdServiceConfig.getTimeout());
            f32471c = c2690af;
            L5 l52 = new L5(new Xe(c2690af, f32470b), c2690af);
            HashMap map = new HashMap();
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("UnifiedIdNetworkCallRequested", map, EnumC2993se.f33373a);
            ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).submit(l52);
        }
    }

    public static void e() {
        synchronized (f32469a) {
            try {
                C2690af c2690af = f32471c;
                if (c2690af != null) {
                    c2690af.A.compareAndSet(false, true);
                }
                f32471c = null;
                f32470b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
