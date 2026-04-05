package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.e;
import com.apm.insight.runtime.m;
import com.inmobi.commons.core.configs.CrashConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    private static Runnable f13072b = new Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public final void run() {
            m.a().a().removeCallbacks(this);
            m.a().a(new b(m.a().a(), e.g()));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private Context f13073a;

    public b(Handler handler, Context context) {
        super(handler, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        this.f13073a = context;
    }

    public static void c() {
        m.a().a(f13072b, 100L);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:6:0x0010, B:8:0x0016, B:9:0x001e), top: B:13:0x0010 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            com.apm.insight.nativecrash.b r0 = com.apm.insight.e.a()     // Catch: java.lang.Throwable -> Ld
            com.apm.insight.ICommonParams r0 = r0.c()     // Catch: java.lang.Throwable -> Ld
            java.util.Map r0 = r0.getCommonParams()     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L1e
            boolean r1 = com.apm.insight.nativecrash.b.a(r0)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L1e
            long r0 = r3.b()     // Catch: java.lang.Throwable -> L29
            r3.a(r0)     // Catch: java.lang.Throwable -> L29
            goto L29
        L1e:
            com.apm.insight.runtime.o r1 = com.apm.insight.runtime.o.a()     // Catch: java.lang.Throwable -> L29
            org.json.JSONArray r2 = com.apm.insight.entity.b.b()     // Catch: java.lang.Throwable -> L29
            r1.a(r0, r2)     // Catch: java.lang.Throwable -> L29
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.j.b.run():void");
    }
}
