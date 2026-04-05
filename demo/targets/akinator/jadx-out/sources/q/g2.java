package q;

import android.widget.AbsListView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f82110a;

    public g2(j2 j2Var) {
        this.f82110a = j2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        j2 j2Var = this.f82110a;
        i2 i2Var = j2Var.f82159y;
        if (i10 != 1 || j2Var.isInputMethodNotNeeded() || j2Var.H.getContentView() == null) {
            return;
        }
        j2Var.D.removeCallbacks(i2Var);
        i2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
