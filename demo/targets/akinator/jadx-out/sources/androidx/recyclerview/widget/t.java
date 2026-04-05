package androidx.recyclerview.widget;

import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final r f7267a;

    /* renamed from: b, reason: collision with root package name */
    public final q3 f7268b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7269c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f7270d = new IdentityHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7271e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public s f7272f = new s();

    /* renamed from: g, reason: collision with root package name */
    public final int f7273g;

    /* renamed from: h, reason: collision with root package name */
    public final a3 f7274h;

    public t(r rVar, q qVar) {
        this.f7267a = rVar;
        qVar.getClass();
        this.f7268b = new o3();
        this.f7273g = 1;
        this.f7274h = new y2();
    }

    public final boolean a(int i10, RecyclerView.a aVar) {
        ArrayList arrayList = this.f7271e;
        if (i10 < 0 || i10 > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i10);
        }
        if (hasStableIds()) {
            w3.i.checkArgument(aVar.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (aVar.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int iF = f(aVar);
        if ((iF == -1 ? null : (j1) arrayList.get(iF)) != null) {
            return false;
        }
        j1 j1Var = new j1(aVar, this, this.f7268b, this.f7274h.createStableIdLookup());
        arrayList.add(i10, j1Var);
        Iterator it = this.f7269c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                aVar.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (j1Var.f7156e > 0) {
            this.f7267a.notifyItemRangeInserted(c(j1Var), j1Var.f7156e);
        }
        b();
        return true;
    }

    public final void b() {
        y1 y1Var;
        Iterator it = this.f7271e.iterator();
        while (true) {
            if (!it.hasNext()) {
                y1Var = y1.f7321b;
                break;
            }
            j1 j1Var = (j1) it.next();
            y1 stateRestorationPolicy = j1Var.f7154c.getStateRestorationPolicy();
            y1Var = y1.f7323e;
            if (stateRestorationPolicy == y1Var || (stateRestorationPolicy == y1.f7322c && j1Var.f7156e == 0)) {
                break;
            }
        }
        r rVar = this.f7267a;
        if (y1Var != rVar.getStateRestorationPolicy()) {
            rVar.a(y1Var);
        }
    }

    public final int c(j1 j1Var) {
        j1 j1Var2;
        Iterator it = this.f7271e.iterator();
        int i10 = 0;
        while (it.hasNext() && (j1Var2 = (j1) it.next()) != j1Var) {
            i10 += j1Var2.f7156e;
        }
        return i10;
    }

    public boolean canRestoreState() {
        Iterator it = this.f7271e.iterator();
        while (it.hasNext()) {
            if (!((j1) it.next()).f7154c.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    public final s d(int i10) {
        s sVar = this.f7272f;
        if (sVar.f7239c) {
            sVar = new s();
        } else {
            sVar.f7239c = true;
        }
        Iterator it = this.f7271e.iterator();
        int i11 = i10;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            j1 j1Var = (j1) it.next();
            int i12 = j1Var.f7156e;
            if (i12 > i11) {
                sVar.f7237a = j1Var;
                sVar.f7238b = i11;
                break;
            }
            i11 -= i12;
        }
        if (sVar.f7237a != null) {
            return sVar;
        }
        throw new IllegalArgumentException(a.b.e(i10, "Cannot find wrapper for "));
    }

    public final j1 e(RecyclerView.n nVar) {
        j1 j1Var = (j1) this.f7270d.get(nVar);
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + nVar + ", seems like it is not bound by this adapter: " + this);
    }

    public final int f(RecyclerView.a aVar) {
        ArrayList arrayList = this.f7271e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((j1) arrayList.get(i10)).f7154c == aVar) {
                return i10;
            }
        }
        return -1;
    }

    public RecyclerView.a getBoundAdapter(RecyclerView.n nVar) {
        j1 j1Var = (j1) this.f7270d.get(nVar);
        if (j1Var == null) {
            return null;
        }
        return j1Var.f7154c;
    }

    public List<RecyclerView.a> getCopyOfAdapters() {
        ArrayList arrayList = this.f7271e;
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((j1) it.next()).f7154c);
        }
        return arrayList2;
    }

    public long getItemId(int i10) {
        s sVarD = d(i10);
        long itemId = sVarD.f7237a.getItemId(sVarD.f7238b);
        sVarD.f7239c = false;
        sVarD.f7237a = null;
        sVarD.f7238b = -1;
        this.f7272f = sVarD;
        return itemId;
    }

    public int getItemViewType(int i10) {
        s sVarD = d(i10);
        j1 j1Var = sVarD.f7237a;
        int iLocalToGlobal = j1Var.f7152a.localToGlobal(j1Var.f7154c.getItemViewType(sVarD.f7238b));
        sVarD.f7239c = false;
        sVarD.f7237a = null;
        sVarD.f7238b = -1;
        this.f7272f = sVarD;
        return iLocalToGlobal;
    }

    public int getLocalAdapterPosition(RecyclerView.a aVar, RecyclerView.n nVar, int i10) {
        j1 j1Var = (j1) this.f7270d.get(nVar);
        if (j1Var == null) {
            return -1;
        }
        RecyclerView.a aVar2 = j1Var.f7154c;
        int iC = i10 - c(j1Var);
        int itemCount = aVar2.getItemCount();
        if (iC >= 0 && iC < itemCount) {
            return aVar2.findRelativeAdapterPositionIn(aVar, nVar, iC);
        }
        StringBuilder sbF = w0.i.f(iC, itemCount, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbF.append(nVar);
        sbF.append("adapter:");
        sbF.append(aVar);
        throw new IllegalStateException(sbF.toString());
    }

    public int getTotalCount() {
        Iterator it = this.f7271e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((j1) it.next()).f7156e;
        }
        return i10;
    }

    public Pair<RecyclerView.a, Integer> getWrappedAdapterAndPosition(int i10) {
        s sVarD = d(i10);
        Pair<RecyclerView.a, Integer> pair = new Pair<>(sVarD.f7237a.f7154c, Integer.valueOf(sVarD.f7238b));
        sVarD.f7239c = false;
        sVarD.f7237a = null;
        sVarD.f7238b = -1;
        this.f7272f = sVarD;
        return pair;
    }

    public boolean hasStableIds() {
        return this.f7273g != 1;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        ArrayList arrayList = this.f7269c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = this.f7271e.iterator();
        while (it2.hasNext()) {
            ((j1) it2.next()).f7154c.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void onBindViewHolder(RecyclerView.n nVar, int i10) {
        s sVarD = d(i10);
        this.f7270d.put(nVar, sVarD.f7237a);
        j1 j1Var = sVarD.f7237a;
        j1Var.f7154c.bindViewHolder(nVar, sVarD.f7238b);
        sVarD.f7239c = false;
        sVarD.f7237a = null;
        sVarD.f7238b = -1;
        this.f7272f = sVarD;
    }

    @Override // androidx.recyclerview.widget.i1
    public void onChanged(j1 j1Var) {
        this.f7267a.notifyDataSetChanged();
        b();
    }

    public RecyclerView.n onCreateViewHolder(ViewGroup viewGroup, int i10) {
        j1 wrapperForGlobalType = this.f7268b.getWrapperForGlobalType(i10);
        return wrapperForGlobalType.f7154c.onCreateViewHolder(viewGroup, wrapperForGlobalType.f7152a.globalToLocal(i10));
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        ArrayList arrayList = this.f7269c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = this.f7271e.iterator();
        while (it.hasNext()) {
            ((j1) it.next()).f7154c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean onFailedToRecycleView(RecyclerView.n nVar) {
        IdentityHashMap identityHashMap = this.f7270d;
        j1 j1Var = (j1) identityHashMap.get(nVar);
        if (j1Var != null) {
            boolean zOnFailedToRecycleView = j1Var.f7154c.onFailedToRecycleView(nVar);
            identityHashMap.remove(nVar);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + nVar + ", seems like it is not bound by this adapter: " + this);
    }

    @Override // androidx.recyclerview.widget.i1
    public void onItemRangeChanged(j1 j1Var, int i10, int i11) {
        this.f7267a.notifyItemRangeChanged(i10 + c(j1Var), i11);
    }

    @Override // androidx.recyclerview.widget.i1
    public void onItemRangeInserted(j1 j1Var, int i10, int i11) {
        this.f7267a.notifyItemRangeInserted(i10 + c(j1Var), i11);
    }

    @Override // androidx.recyclerview.widget.i1
    public void onItemRangeMoved(j1 j1Var, int i10, int i11) {
        int iC = c(j1Var);
        this.f7267a.notifyItemMoved(i10 + iC, i11 + iC);
    }

    @Override // androidx.recyclerview.widget.i1
    public void onItemRangeRemoved(j1 j1Var, int i10, int i11) {
        this.f7267a.notifyItemRangeRemoved(i10 + c(j1Var), i11);
    }

    @Override // androidx.recyclerview.widget.i1
    public void onStateRestorationPolicyChanged(j1 j1Var) {
        b();
    }

    public void onViewAttachedToWindow(RecyclerView.n nVar) {
        e(nVar).f7154c.onViewAttachedToWindow(nVar);
    }

    public void onViewDetachedFromWindow(RecyclerView.n nVar) {
        e(nVar).f7154c.onViewDetachedFromWindow(nVar);
    }

    public void onViewRecycled(RecyclerView.n nVar) {
        IdentityHashMap identityHashMap = this.f7270d;
        j1 j1Var = (j1) identityHashMap.get(nVar);
        if (j1Var != null) {
            j1Var.f7154c.onViewRecycled(nVar);
            identityHashMap.remove(nVar);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + nVar + ", seems like it is not bound by this adapter: " + this);
        }
    }

    @Override // androidx.recyclerview.widget.i1
    public void onItemRangeChanged(j1 j1Var, int i10, int i11, Object obj) {
        this.f7267a.notifyItemRangeChanged(i10 + c(j1Var), i11, obj);
    }
}
