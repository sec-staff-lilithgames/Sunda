package mr;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b implements Runnable, ir.a {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f74907b = new AtomicBoolean(false);

    @Override // ir.a
    public boolean isCanceled() {
        return this.f74907b.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }

    public abstract void runTask();

    @Override // ir.a
    public void setCancel(boolean z10) {
        this.f74907b.set(z10);
    }
}
