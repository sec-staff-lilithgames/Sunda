package o;

import android.view.View;
import x3.n2;
import x3.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f77276a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f77277b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f77278c;

    public i(j jVar) {
        this.f77278c = jVar;
    }

    @Override // x3.o2, x3.n2
    public void onAnimationEnd(View view) {
        int i10 = this.f77277b + 1;
        this.f77277b = i10;
        j jVar = this.f77278c;
        if (i10 == jVar.f77279a.size()) {
            n2 n2Var = jVar.f77282d;
            if (n2Var != null) {
                n2Var.onAnimationEnd(null);
            }
            this.f77277b = 0;
            this.f77276a = false;
            jVar.f77283e = false;
        }
    }

    @Override // x3.o2, x3.n2
    public void onAnimationStart(View view) {
        if (this.f77276a) {
            return;
        }
        this.f77276a = true;
        n2 n2Var = this.f77278c.f77282d;
        if (n2Var != null) {
            n2Var.onAnimationStart(null);
        }
    }
}
