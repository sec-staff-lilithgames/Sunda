package tr;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f87351b = new AtomicBoolean(false);

    public boolean isCanceled() {
        return this.f87351b.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }

    public abstract void runTask();

    public void setCancel(boolean z10) {
        this.f87351b.set(z10);
    }
}
