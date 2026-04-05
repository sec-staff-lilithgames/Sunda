package o6;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d implements n6.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f77874a = t3.n.createAsync(Looper.getMainLooper());

    @Override // n6.r0
    public void cancel(Runnable runnable) {
        this.f77874a.removeCallbacks(runnable);
    }

    public Handler getHandler() {
        return this.f77874a;
    }

    @Override // n6.r0
    public void scheduleWithDelay(long j10, Runnable runnable) {
        this.f77874a.postDelayed(runnable, j10);
    }
}
