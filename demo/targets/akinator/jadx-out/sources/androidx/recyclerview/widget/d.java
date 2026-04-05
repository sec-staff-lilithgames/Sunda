package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.a f7090a;

    public d(RecyclerView.a aVar) {
        this.f7090a = aVar;
    }

    @Override // androidx.recyclerview.widget.g1
    public void onChanged(int i10, int i11, Object obj) {
        this.f7090a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.g1
    public void onInserted(int i10, int i11) {
        this.f7090a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.g1
    public void onMoved(int i10, int i11) {
        this.f7090a.notifyItemMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.g1
    public void onRemoved(int i10, int i11) {
        this.f7090a.notifyItemRangeRemoved(i10, i11);
    }
}
