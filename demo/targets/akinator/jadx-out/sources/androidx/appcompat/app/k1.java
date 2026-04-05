package androidx.appcompat.app;

import android.view.View;
import x3.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f4765a;

    public k1(m1 m1Var) {
        this.f4765a = m1Var;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationEnd(View view) {
        m1 m1Var = this.f4765a;
        m1Var.f4800z = null;
        m1Var.f4779e.requestLayout();
    }
}
