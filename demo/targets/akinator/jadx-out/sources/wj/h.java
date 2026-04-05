package wj;

import java.util.concurrent.TimeUnit;
import tj.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final long f90671d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f90672e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final n f90673a = n.getInstance();

    /* renamed from: b, reason: collision with root package name */
    public long f90674b;

    /* renamed from: c, reason: collision with root package name */
    public int f90675c;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isRequestAllowed() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f90675c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            tj.n r0 = r4.f90673a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.currentTimeInMillis()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f90674b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.h.isRequestAllowed():boolean");
    }

    public synchronized void setNextRequestTime(int i10) {
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f90675c = 0;
            }
            return;
        } else {
            this.f90675c++;
            synchronized (this) {
                this.f90674b = this.f90673a.currentTimeInMillis() + ((i10 == 429 || (i10 >= 500 && i10 < 600)) ? (long) Math.min(Math.pow(2.0d, this.f90675c) + this.f90673a.getRandomDelayForSyncPrevention(), f90672e) : f90671d);
            }
            return;
        }
    }
}
