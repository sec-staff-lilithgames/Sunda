package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static long f12857b;

    /* renamed from: a, reason: collision with root package name */
    private final b f12858a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12859c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f12860d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f12859c) {
                    return;
                }
                c.this.f12858a.d();
                long unused = c.f12857b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f12860d, 500L);
                } else {
                    m.a().a(c.this.f12860d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f12857b);
            }
        };
        this.f12860d = runnable;
        this.f12858a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f12857b <= MBInterstitialActivity.WEB_LOAD_TIME;
    }

    public final void b() {
        this.f12859c = true;
    }

    public final void a() {
        if (this.f12859c) {
            return;
        }
        m.a().a(this.f12860d, 5000L);
    }
}
