package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends p0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f6474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f6475c;

    public v(w wVar, p0 p0Var) {
        this.f6475c = wVar;
        this.f6474b = p0Var;
    }

    @Override // androidx.fragment.app.p0
    public View onFindViewById(int i10) {
        p0 p0Var = this.f6474b;
        return p0Var.onHasView() ? p0Var.onFindViewById(i10) : this.f6475c.onFindViewById(i10);
    }

    @Override // androidx.fragment.app.p0
    public boolean onHasView() {
        return this.f6474b.onHasView() || this.f6475c.onHasView();
    }
}
