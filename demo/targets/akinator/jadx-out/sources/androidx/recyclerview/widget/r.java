package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends RecyclerView.a {

    /* renamed from: i, reason: collision with root package name */
    public final t f7230i;

    @SafeVarargs
    public r(RecyclerView.a... aVarArr) {
        this(q.f7218a, aVarArr);
    }

    public final void a(y1 y1Var) {
        super.setStateRestorationPolicy(y1Var);
    }

    public boolean addAdapter(RecyclerView.a aVar) {
        t tVar = this.f7230i;
        return tVar.a(tVar.f7271e.size(), aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int findRelativeAdapterPositionIn(RecyclerView.a aVar, RecyclerView.n nVar, int i10) {
        return this.f7230i.getLocalAdapterPosition(aVar, nVar, i10);
    }

    public List<? extends RecyclerView.a> getAdapters() {
        return Collections.unmodifiableList(this.f7230i.getCopyOfAdapters());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f7230i.getTotalCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i10) {
        return this.f7230i.getItemId(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i10) {
        return this.f7230i.getItemViewType(i10);
    }

    public Pair<RecyclerView.a, Integer> getWrappedAdapterAndPosition(int i10) {
        return this.f7230i.getWrappedAdapterAndPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f7230i.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.n nVar, int i10) {
        this.f7230i.onBindViewHolder(nVar, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.n onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.f7230i.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f7230i.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public boolean onFailedToRecycleView(RecyclerView.n nVar) {
        return this.f7230i.onFailedToRecycleView(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewAttachedToWindow(RecyclerView.n nVar) {
        this.f7230i.onViewAttachedToWindow(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewDetachedFromWindow(RecyclerView.n nVar) {
        this.f7230i.onViewDetachedFromWindow(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onViewRecycled(RecyclerView.n nVar) {
        this.f7230i.onViewRecycled(nVar);
    }

    public boolean removeAdapter(RecyclerView.a aVar) {
        t tVar = this.f7230i;
        ArrayList arrayList = tVar.f7271e;
        int iF = tVar.f(aVar);
        if (iF == -1) {
            return false;
        }
        j1 j1Var = (j1) arrayList.get(iF);
        int iC = tVar.c(j1Var);
        arrayList.remove(iF);
        tVar.f7267a.notifyItemRangeRemoved(iC, j1Var.f7156e);
        Iterator it = tVar.f7269c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                aVar.onDetachedFromRecyclerView(recyclerView);
            }
        }
        j1Var.f7154c.unregisterAdapterDataObserver(j1Var.f7157f);
        j1Var.f7152a.dispose();
        tVar.b();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void setStateRestorationPolicy(y1 y1Var) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public r(q qVar, RecyclerView.a... aVarArr) {
        this(qVar, (List<? extends RecyclerView.a>) Arrays.asList(aVarArr));
    }

    public r(List<? extends RecyclerView.a> list) {
        this(q.f7218a, list);
    }

    public boolean addAdapter(int i10, RecyclerView.a aVar) {
        return this.f7230i.a(i10, aVar);
    }

    public r(q qVar, List<? extends RecyclerView.a> list) {
        this.f7230i = new t(this, qVar);
        Iterator<? extends RecyclerView.a> it = list.iterator();
        while (it.hasNext()) {
            addAdapter(it.next());
        }
        super.setHasStableIds(this.f7230i.hasStableIds());
    }
}
