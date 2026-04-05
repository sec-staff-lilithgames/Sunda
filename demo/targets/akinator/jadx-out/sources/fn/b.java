package fn;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f55740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f55741c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f55742e;

    public b(c cVar, Runnable runnable, Handler handler) {
        this.f55742e = cVar;
        this.f55740b = runnable;
        this.f55741c = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f55742e.destroy();
        Runnable runnable = this.f55740b;
        if (runnable != null) {
            this.f55741c.postDelayed(runnable, 1000L);
        }
    }
}
