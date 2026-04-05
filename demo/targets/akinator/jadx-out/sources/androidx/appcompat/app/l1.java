package androidx.appcompat.app;

import android.view.View;
import x3.p2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f4768a;

    public l1(m1 m1Var) {
        this.f4768a = m1Var;
    }

    @Override // x3.p2
    public void onAnimationUpdate(View view) {
        ((View) this.f4768a.f4779e.getParent()).invalidate();
    }
}
