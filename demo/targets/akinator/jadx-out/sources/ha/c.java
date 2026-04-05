package ha;

import android.animation.ObjectAnimator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public long f58714a = 4000;

    /* renamed from: b, reason: collision with root package name */
    public ObjectAnimator f58715b;

    public void cancel() {
        ObjectAnimator objectAnimator = this.f58715b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public c setDuration(long j10) {
        this.f58714a = j10;
        return this;
    }

    public void start(d dVar) {
        ObjectAnimator objectAnimator = this.f58715b;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            gm.c cVar = new gm.c(8, this, dVar);
            if (dVar.isSetUp()) {
                cVar.run();
            } else {
                dVar.setAnimationSetupCallback(new a(cVar, 0));
            }
        }
    }
}
