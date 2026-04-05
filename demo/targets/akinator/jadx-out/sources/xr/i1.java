package xr;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f92598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f92599c;

    public i1(j1 j1Var, long j10) {
        this.f92599c = j1Var;
        this.f92598b = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        l5 l5Var = new l5();
        j1 j1Var = this.f92599c;
        j1Var.f92683j.appendTimeoutInsight(l5Var);
        long j10 = this.f92598b;
        long jAbs = Math.abs(j10);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = jAbs / timeUnit.toNanos(1L);
        long jAbs2 = Math.abs(j10) % timeUnit.toNanos(1L);
        StringBuilder sb2 = new StringBuilder("deadline exceeded after ");
        if (j10 < 0) {
            sb2.append('-');
        }
        sb2.append(nanos);
        Locale locale = Locale.US;
        sb2.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
        sb2.append("s. ");
        sb2.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) j1Var.f92682i.getOption(wr.u.f91140a)) == null ? 0.0d : r3.longValue() / j1.f92673t)));
        sb2.append(l5Var);
        j1Var.f92683j.cancel(wr.m6.f91040h.augmentDescription(sb2.toString()));
    }
}
