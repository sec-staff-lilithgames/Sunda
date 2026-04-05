package j6;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h extends RecyclerView.b {
    @Override // androidx.recyclerview.widget.RecyclerView.b
    public abstract void onChanged();

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public final void onItemRangeChanged(int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public final void onItemRangeInserted(int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public final void onItemRangeMoved(int i10, int i11, int i12) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public final void onItemRangeRemoved(int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public final void onItemRangeChanged(int i10, int i11, Object obj) {
        onChanged();
    }
}
