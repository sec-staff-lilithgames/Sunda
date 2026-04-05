package androidx.appcompat.app;

import android.view.View;
import x3.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f4900a;

    public z(a0 a0Var) {
        this.f4900a = a0Var;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationEnd(View view) {
        a0 a0Var = this.f4900a;
        a0Var.f4718b.f4870x.setAlpha(1.0f);
        a0Var.f4718b.A.setListener(null);
        a0Var.f4718b.A = null;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationStart(View view) {
        this.f4900a.f4718b.f4870x.setVisibility(0);
    }
}
