package q;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements x3.n2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f82035a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f82036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f82037c;

    public b(c cVar) {
        this.f82037c = cVar;
    }

    @Override // x3.n2
    public void onAnimationCancel(View view) {
        this.f82035a = true;
    }

    @Override // x3.n2
    public void onAnimationEnd(View view) {
        if (this.f82035a) {
            return;
        }
        c cVar = this.f82037c;
        cVar.f82056h = null;
        super/*android.view.View*/.setVisibility(this.f82036b);
    }

    @Override // x3.n2
    public void onAnimationStart(View view) {
        super/*android.view.View*/.setVisibility(0);
        this.f82035a = false;
    }

    public b withFinalVisibility(x3.m2 m2Var, int i10) {
        this.f82037c.f82056h = m2Var;
        this.f82036b = i10;
        return this;
    }
}
