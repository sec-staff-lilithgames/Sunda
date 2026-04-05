package dr;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a implements d {
    @Override // dr.d
    public void cancel(Runnable runnable) {
        try {
            if (runnable instanceof cr.a) {
                ((cr.a) runnable).setCancel(true);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // dr.d
    public void execute(Runnable runnable) {
        try {
            if (runnable instanceof cr.a) {
                ((cr.a) runnable).setCancel(false);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // dr.d
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10) {
        super.schedule(runnable, j10);
    }

    @Override // dr.d
    public void schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            if (runnable instanceof cr.a) {
                ((cr.a) runnable).setCancel(false);
            }
        } catch (Throwable unused) {
        }
    }
}
