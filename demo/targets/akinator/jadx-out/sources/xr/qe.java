package xr;

import java.util.IdentityHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class qe {

    /* renamed from: d, reason: collision with root package name */
    public static final qe f92934d = new qe(new le());

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f92935a = new IdentityHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final le f92936b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f92937c;

    public qe(le leVar) {
        this.f92936b = leVar;
    }

    public static <T> T get(oe oeVar) {
        T t10;
        qe qeVar = f92934d;
        synchronized (qeVar) {
            try {
                ne neVar = (ne) qeVar.f92935a.get(oeVar);
                if (neVar == null) {
                    neVar = new ne(oeVar.create());
                    qeVar.f92935a.put(oeVar, neVar);
                }
                ScheduledFuture scheduledFuture = neVar.f92833c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    neVar.f92833c = null;
                }
                neVar.f92832b++;
                t10 = (T) neVar.f92831a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public static <T> T release(oe oeVar, T t10) {
        qe qeVar = f92934d;
        synchronized (qeVar) {
            try {
                ne neVar = (ne) qeVar.f92935a.get(oeVar);
                if (neVar == null) {
                    throw new IllegalArgumentException("No cached instance found for " + oeVar);
                }
                mh.p1.checkArgument(t10 == neVar.f92831a, "Releasing the wrong instance");
                mh.p1.checkState(neVar.f92832b > 0, "Refcount has already reached zero");
                int i10 = neVar.f92832b - 1;
                neVar.f92832b = i10;
                if (i10 == 0) {
                    mh.p1.checkState(neVar.f92833c == null, "Destroy task already scheduled");
                    if (qeVar.f92937c == null) {
                        qeVar.f92937c = qeVar.f92936b.createScheduledExecutor();
                    }
                    neVar.f92833c = qeVar.f92937c.schedule(new x6(new me(qeVar, neVar, oeVar, t10)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }
}
