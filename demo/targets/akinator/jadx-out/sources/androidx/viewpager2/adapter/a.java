package androidx.viewpager2.adapter;

import android.widget.FrameLayout;
import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.v0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f7361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f7362c;

    public a(m mVar, n nVar) {
        this.f7362c = mVar;
        this.f7361b = nVar;
    }

    @Override // androidx.lifecycle.v0
    public void onStateChanged(b1 b1Var, i0 i0Var) {
        m mVar = this.f7362c;
        if (mVar.shouldDelayFragmentTransactions()) {
            return;
        }
        b1Var.getLifecycle().removeObserver(this);
        n nVar = this.f7361b;
        if (z1.isAttachedToWindow((FrameLayout) nVar.itemView)) {
            mVar.placeFragmentInViewHolder(nVar);
        }
    }
}
