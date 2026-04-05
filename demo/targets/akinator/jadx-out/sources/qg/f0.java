package qg;

import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f0 extends ug.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f83133a;

    public f0(h0 h0Var) {
        this.f83133a = h0Var;
    }

    @Override // ug.i
    public void onFontRetrievalFailed(int i10) {
        h0 h0Var = this.f83133a;
        h0Var.f83187e = true;
        g0 g0Var = (g0) h0Var.f83188f.get();
        if (g0Var != null) {
            g0Var.onTextSizeChange();
        }
    }

    @Override // ug.i
    public void onFontRetrieved(Typeface typeface, boolean z10) {
        if (z10) {
            return;
        }
        h0 h0Var = this.f83133a;
        h0Var.f83187e = true;
        g0 g0Var = (g0) h0Var.f83188f.get();
        if (g0Var != null) {
            g0Var.onTextSizeChange();
        }
    }
}
