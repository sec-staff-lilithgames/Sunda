package dr;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c extends a {
    public abstract Handler a();

    @Override // dr.a, dr.d
    public void cancel(Runnable runnable) {
        super.cancel(runnable);
        a().removeCallbacks(runnable);
    }

    @Override // dr.a, dr.d
    public void execute(Runnable runnable) {
        super.execute(runnable);
        if (Looper.myLooper() == a().getLooper()) {
            runnable.run();
        } else {
            a().post(runnable);
        }
    }

    @Override // dr.a, dr.d
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10) {
        super.schedule(runnable, j10);
    }

    @Override // dr.a, dr.d
    public void schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        super.schedule(runnable, j10, timeUnit);
        a().postDelayed(runnable, timeUnit.toMillis(j10));
    }
}
