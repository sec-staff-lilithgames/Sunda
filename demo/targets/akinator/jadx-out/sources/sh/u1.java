package sh;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class u1 extends j implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f85869j;

    public u1(Runnable runnable) {
        this.f85869j = (Runnable) mh.p1.checkNotNull(runnable);
    }

    @Override // sh.k
    public final String l() {
        return "task=[" + this.f85869j + C3191e4.i.f36531e;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f85869j.run();
        } catch (Throwable th2) {
            setException(th2);
            throw th2;
        }
    }
}
