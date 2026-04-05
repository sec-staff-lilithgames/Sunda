package r7;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f84006c;

    public /* synthetic */ v(a0 a0Var, int i10) {
        this.f84005b = i10;
        this.f84006c = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f84005b;
        a0 a0Var = this.f84006c;
        switch (i10) {
            case 0:
                boolean z10 = a0.X;
                Drawable.Callback callback = a0Var.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(a0Var);
                    return;
                }
                return;
            default:
                Semaphore semaphore = a0Var.R;
                a8.b bVar = a0Var.f83863s;
                if (bVar == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    bVar.setProgress(a0Var.f83848c.getAnimatedValueAbsolute());
                    if (a0.X && a0Var.O) {
                        if (a0Var.S == null) {
                            a0Var.S = new Handler(Looper.getMainLooper());
                            a0Var.T = new v(a0Var, 0);
                        }
                        a0Var.S.post(a0Var.T);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th2) {
                    semaphore.release();
                    throw th2;
                }
                semaphore.release();
                return;
        }
    }
}
