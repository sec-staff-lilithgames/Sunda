package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t2 extends RecyclerView.d {

    /* renamed from: g, reason: collision with root package name */
    public boolean f7275g = true;

    public abstract boolean animateAdd(RecyclerView.n nVar);

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public boolean animateAppearance(RecyclerView.n nVar, RecyclerView.d.a aVar, RecyclerView.d.a aVar2) {
        int i10;
        int i11;
        return (aVar == null || ((i10 = aVar.f6955a) == (i11 = aVar2.f6955a) && aVar.f6956b == aVar2.f6956b)) ? animateAdd(nVar) : animateMove(nVar, i10, aVar.f6956b, i11, aVar2.f6956b);
    }

    public abstract boolean animateChange(RecyclerView.n nVar, RecyclerView.n nVar2, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public boolean animateChange(RecyclerView.n nVar, RecyclerView.n nVar2, RecyclerView.d.a aVar, RecyclerView.d.a aVar2) {
        int i10;
        int i11;
        int i12 = aVar.f6955a;
        int i13 = aVar.f6956b;
        if (nVar2.shouldIgnore()) {
            int i14 = aVar.f6955a;
            i11 = aVar.f6956b;
            i10 = i14;
        } else {
            i10 = aVar2.f6955a;
            i11 = aVar2.f6956b;
        }
        return animateChange(nVar, nVar2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public boolean animateDisappearance(RecyclerView.n nVar, RecyclerView.d.a aVar, RecyclerView.d.a aVar2) {
        int i10 = aVar.f6955a;
        int i11 = aVar.f6956b;
        View view = nVar.itemView;
        int left = aVar2 == null ? view.getLeft() : aVar2.f6955a;
        int top = aVar2 == null ? view.getTop() : aVar2.f6956b;
        if (nVar.isRemoved() || (i10 == left && i11 == top)) {
            return animateRemove(nVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(nVar, i10, i11, left, top);
    }

    public abstract boolean animateMove(RecyclerView.n nVar, int i10, int i11, int i12, int i13);

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public boolean animatePersistence(RecyclerView.n nVar, RecyclerView.d.a aVar, RecyclerView.d.a aVar2) {
        int i10 = aVar.f6955a;
        int i11 = aVar2.f6955a;
        if (i10 != i11 || aVar.f6956b != aVar2.f6956b) {
            return animateMove(nVar, i10, aVar.f6956b, i11, aVar2.f6956b);
        }
        dispatchMoveFinished(nVar);
        return false;
    }

    public abstract boolean animateRemove(RecyclerView.n nVar);

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public boolean canReuseUpdatedViewHolder(RecyclerView.n nVar) {
        return !this.f7275g || nVar.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.n nVar) {
        onAddFinished(nVar);
        dispatchAnimationFinished(nVar);
    }

    public final void dispatchAddStarting(RecyclerView.n nVar) {
        onAddStarting(nVar);
    }

    public final void dispatchChangeFinished(RecyclerView.n nVar, boolean z10) {
        onChangeFinished(nVar, z10);
        dispatchAnimationFinished(nVar);
    }

    public final void dispatchChangeStarting(RecyclerView.n nVar, boolean z10) {
        onChangeStarting(nVar, z10);
    }

    public final void dispatchMoveFinished(RecyclerView.n nVar) {
        onMoveFinished(nVar);
        dispatchAnimationFinished(nVar);
    }

    public final void dispatchMoveStarting(RecyclerView.n nVar) {
        onMoveStarting(nVar);
    }

    public final void dispatchRemoveFinished(RecyclerView.n nVar) {
        onRemoveFinished(nVar);
        dispatchAnimationFinished(nVar);
    }

    public final void dispatchRemoveStarting(RecyclerView.n nVar) {
        onRemoveStarting(nVar);
    }

    public boolean getSupportsChangeAnimations() {
        return this.f7275g;
    }

    public void setSupportsChangeAnimations(boolean z10) {
        this.f7275g = z10;
    }

    public void onAddFinished(RecyclerView.n nVar) {
    }

    public void onAddStarting(RecyclerView.n nVar) {
    }

    public void onMoveFinished(RecyclerView.n nVar) {
    }

    public void onMoveStarting(RecyclerView.n nVar) {
    }

    public void onRemoveFinished(RecyclerView.n nVar) {
    }

    public void onRemoveStarting(RecyclerView.n nVar) {
    }

    public void onChangeFinished(RecyclerView.n nVar, boolean z10) {
    }

    public void onChangeStarting(RecyclerView.n nVar, boolean z10) {
    }
}
