package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7114a;

    public e2(RecyclerView recyclerView) {
        this.f7114a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.d2
    public void onAnimationFinished(RecyclerView.n nVar) {
        nVar.setIsRecyclable(true);
        if (nVar.mShadowedHolder != null && nVar.mShadowingHolder == null) {
            nVar.mShadowedHolder = null;
        }
        nVar.mShadowingHolder = null;
        if (nVar.shouldBeKeptAsChild()) {
            return;
        }
        View view = nVar.itemView;
        RecyclerView recyclerView = this.f7114a;
        if (recyclerView.removeAnimatingView(view) || !nVar.isTmpDetached()) {
            return;
        }
        recyclerView.removeDetachedView(nVar.itemView, false);
    }
}
