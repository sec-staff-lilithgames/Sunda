package fu;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends AtomicBoolean implements Runnable, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f56030b;

    public i(Runnable runnable) {
        this.f56030b = runnable;
    }

    @Override // pt.c
    public void dispose() {
        lazySet(true);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get()) {
            return;
        }
        try {
            this.f56030b.run();
        } finally {
            lazySet(true);
        }
    }
}
