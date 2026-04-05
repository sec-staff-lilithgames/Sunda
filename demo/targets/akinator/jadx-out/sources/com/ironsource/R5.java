package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class R5 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f35384e = -1;

    /* renamed from: a, reason: collision with root package name */
    private Runnable f35385a = new a();

    /* renamed from: b, reason: collision with root package name */
    private int f35386b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3367o f35387c;

    /* renamed from: d, reason: collision with root package name */
    private C3548yb f35388d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC3367o interfaceC3367o = R5.this.f35387c;
            if (interfaceC3367o != null) {
                interfaceC3367o.a();
            }
        }
    }

    public R5(int i10, InterfaceC3367o interfaceC3367o) {
        this.f35387c = interfaceC3367o;
        this.f35386b = i10;
    }

    public boolean b() {
        return this.f35386b > 0;
    }

    public void a(long j10) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f35386b) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f35387c.a();
                return;
            }
            a();
            this.f35388d = new C3548yb(millis, this.f35385a, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }

    public void a() {
        if (!b() || this.f35388d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f35388d.e();
        this.f35388d = null;
    }
}
