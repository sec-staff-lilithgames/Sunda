package ot;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements Runnable, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f79839b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f79840c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f79841e;

    public e(Handler handler, Runnable runnable) {
        this.f79839b = handler;
        this.f79840c = runnable;
    }

    @Override // pt.c
    public void dispose() {
        this.f79839b.removeCallbacks(this);
        this.f79841e = true;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f79841e;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f79840c.run();
        } catch (Throwable th2) {
            mu.a.onError(th2);
        }
    }
}
