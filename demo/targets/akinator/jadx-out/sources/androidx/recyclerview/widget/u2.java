package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7283a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f7284b;

    public u2(w2 w2Var) {
        this.f7284b = w2Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        super.onScrollStateChanged(recyclerView, i10);
        if (i10 == 0 && this.f7283a) {
            this.f7283a = false;
            this.f7284b.snapToTargetExistingView();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f7283a = true;
    }
}
