package mt;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f74928b = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* renamed from: c, reason: collision with root package name */
    public static final long f74929c = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a implements pt.c {
        @Override // pt.c
        public abstract /* synthetic */ void dispose();

        @Override // pt.c
        public abstract /* synthetic */ boolean isDisposed();

        public long now(TimeUnit timeUnit) {
            return !m0.f74928b ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
        }

        public pt.c schedule(Runnable runnable) {
            return schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit);

        public pt.c schedulePeriodically(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            tt.h hVar = new tt.h();
            tt.h hVar2 = new tt.h(hVar);
            Runnable runnableOnSchedule = mu.a.onSchedule(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jNow = now(TimeUnit.NANOSECONDS);
            pt.c cVarSchedule = schedule(new l0(this, timeUnit.toNanos(j10) + jNow, runnableOnSchedule, jNow, hVar2, nanos), j10, timeUnit);
            if (cVarSchedule == tt.e.f87354b) {
                return cVarSchedule;
            }
            hVar.replace(cVarSchedule);
            return hVar2;
        }
    }

    public static long clockDriftTolerance() {
        return f74929c;
    }

    public abstract a createWorker();

    public long now(TimeUnit timeUnit) {
        return !f74928b ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public pt.c scheduleDirect(Runnable runnable) {
        return scheduleDirect(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public pt.c schedulePeriodicallyDirect(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        a aVarCreateWorker = createWorker();
        k0 k0Var = new k0(mu.a.onSchedule(runnable), aVarCreateWorker);
        pt.c cVarSchedulePeriodically = aVarCreateWorker.schedulePeriodically(k0Var, j10, j11, timeUnit);
        return cVarSchedulePeriodically == tt.e.f87354b ? cVarSchedulePeriodically : k0Var;
    }

    public <S extends m0 & pt.c> S when(st.o oVar) {
        return new fu.o0(oVar, this);
    }

    public pt.c scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        a aVarCreateWorker = createWorker();
        j0 j0Var = new j0(mu.a.onSchedule(runnable), aVarCreateWorker);
        aVarCreateWorker.schedule(j0Var, j10, timeUnit);
        return j0Var;
    }

    public void shutdown() {
    }

    public void start() {
    }
}
