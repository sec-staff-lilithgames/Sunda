package tm;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f87013b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f87014c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f87015e;

    public e(g gVar, s0 s0Var, Runnable runnable) {
        this.f87015e = gVar;
        this.f87013b = s0Var;
        this.f87014c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = g.f87037y;
        this.f87015e.b(this.f87013b);
        Runnable runnable = this.f87014c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
