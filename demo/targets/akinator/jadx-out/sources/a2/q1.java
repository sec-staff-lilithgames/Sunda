package a2;

import android.view.Choreographer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f3778b;

    public q1(p1 p1Var) {
        this.f3778b = p1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        p1 p1Var = this.f3778b;
        p1Var.f3757f.removeCallbacks(this);
        p1.access$performTrampolineDispatch(p1Var);
        p1.access$performFrameDispatch(p1Var, j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        p1.access$performTrampolineDispatch(this.f3778b);
        Object obj = this.f3778b.f3758g;
        p1 p1Var = this.f3778b;
        synchronized (obj) {
            if (p1Var.f3760i.isEmpty()) {
                p1Var.getChoreographer().removeFrameCallback(this);
                p1Var.f3763l = false;
            }
        }
    }
}
