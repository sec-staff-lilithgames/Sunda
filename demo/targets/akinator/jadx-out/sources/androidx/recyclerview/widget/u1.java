package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 implements l3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7282a;

    public u1(RecyclerView recyclerView) {
        this.f7282a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.l3
    public void processAppeared(RecyclerView.n nVar, RecyclerView.d.a aVar, RecyclerView.d.a aVar2) {
        this.f7282a.animateAppearance(nVar, aVar, aVar2);
    }

    @Override // androidx.recyclerview.widget.l3
    public void processDisappeared(RecyclerView.n nVar, RecyclerView.d.a aVar, RecyclerView.d.a aVar2) {
        RecyclerView recyclerView = this.f7282a;
        recyclerView.mRecycler.l(nVar);
        recyclerView.animateDisappearance(nVar, aVar, aVar2);
    }

    @Override // androidx.recyclerview.widget.l3
    public void processPersistent(RecyclerView.n nVar, RecyclerView.d.a aVar, RecyclerView.d.a aVar2) {
        nVar.setIsRecyclable(false);
        RecyclerView recyclerView = this.f7282a;
        if (recyclerView.mDataSetHasChangedAfterLayout) {
            if (recyclerView.mItemAnimator.animateChange(nVar, nVar, aVar, aVar2)) {
                recyclerView.postAnimationRunner();
            }
        } else if (recyclerView.mItemAnimator.animatePersistence(nVar, aVar, aVar2)) {
            recyclerView.postAnimationRunner();
        }
    }

    @Override // androidx.recyclerview.widget.l3
    public void unused(RecyclerView.n nVar) {
        RecyclerView recyclerView = this.f7282a;
        recyclerView.mLayout.removeAndRecycleView(nVar.itemView, recyclerView.mRecycler);
    }
}
