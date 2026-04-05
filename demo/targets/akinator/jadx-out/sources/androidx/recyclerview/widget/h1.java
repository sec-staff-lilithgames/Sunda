package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 extends RecyclerView.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f7134b;

    public h1(j1 j1Var) {
        this.f7134b = j1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onChanged() {
        j1 j1Var = this.f7134b;
        j1Var.f7156e = j1Var.f7154c.getItemCount();
        j1Var.f7155d.onChanged(j1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeChanged(int i10, int i11) {
        j1 j1Var = this.f7134b;
        j1Var.f7155d.onItemRangeChanged(j1Var, i10, i11, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeInserted(int i10, int i11) {
        j1 j1Var = this.f7134b;
        j1Var.f7156e += i11;
        t tVar = j1Var.f7155d;
        tVar.onItemRangeInserted(j1Var, i10, i11);
        if (j1Var.f7156e <= 0 || j1Var.f7154c.getStateRestorationPolicy() != y1.f7322c) {
            return;
        }
        tVar.onStateRestorationPolicyChanged(j1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeMoved(int i10, int i11, int i12) {
        w3.i.checkArgument(i12 == 1, "moving more than 1 item is not supported in RecyclerView");
        j1 j1Var = this.f7134b;
        j1Var.f7155d.onItemRangeMoved(j1Var, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeRemoved(int i10, int i11) {
        j1 j1Var = this.f7134b;
        j1Var.f7156e -= i11;
        t tVar = j1Var.f7155d;
        tVar.onItemRangeRemoved(j1Var, i10, i11);
        if (j1Var.f7156e >= 1 || j1Var.f7154c.getStateRestorationPolicy() != y1.f7322c) {
            return;
        }
        tVar.onStateRestorationPolicyChanged(j1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onStateRestorationPolicyChanged() {
        j1 j1Var = this.f7134b;
        j1Var.f7155d.onStateRestorationPolicyChanged(j1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeChanged(int i10, int i11, Object obj) {
        j1 j1Var = this.f7134b;
        j1Var.f7155d.onItemRangeChanged(j1Var, i10, i11, obj);
    }
}
