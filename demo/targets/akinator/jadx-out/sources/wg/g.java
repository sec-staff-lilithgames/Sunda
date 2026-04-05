package wg;

import android.animation.AnimatorSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f90585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f90586c;

    public /* synthetic */ g(t tVar, int i10) {
        this.f90585b = i10;
        this.f90586c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f90585b) {
            case 0:
                this.f90586c.l();
                break;
            case 1:
                t tVar = this.f90586c;
                AnimatorSet animatorSetD = tVar.d(true);
                animatorSetD.addListener(new o(tVar));
                animatorSetD.start();
                break;
            default:
                t tVar2 = this.f90586c;
                tVar2.f90610c.setTranslationY(r1.getHeight());
                AnimatorSet animatorSetG = tVar2.g(true);
                animatorSetG.addListener(new q(tVar2));
                animatorSetG.start();
                break;
        }
    }
}
