package androidx.recyclerview.widget;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x1 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7307a;

    public x1(RecyclerView recyclerView) {
        this.f7307a = recyclerView;
    }

    public final void a(b bVar) {
        int i10 = bVar.f7050a;
        RecyclerView recyclerView = this.f7307a;
        if (i10 == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f7051b, bVar.f7053d);
            return;
        }
        if (i10 == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, bVar.f7051b, bVar.f7053d);
        } else if (i10 == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, bVar.f7051b, bVar.f7053d, bVar.f7052c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, bVar.f7051b, bVar.f7053d, 1);
        }
    }

    @Override // androidx.recyclerview.widget.a
    public RecyclerView.n findViewHolder(int i10) {
        RecyclerView recyclerView = this.f7307a;
        RecyclerView.n nVarFindViewHolderForPosition = recyclerView.findViewHolderForPosition(i10, true);
        if (nVarFindViewHolderForPosition != null) {
            p pVar = recyclerView.mChildHelper;
            if (!pVar.f7213c.contains(nVarFindViewHolderForPosition.itemView)) {
                return nVarFindViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.a
    public void markViewHoldersUpdated(int i10, int i11, Object obj) {
        RecyclerView recyclerView = this.f7307a;
        recyclerView.viewRangeUpdate(i10, i11, obj);
        recyclerView.mItemsChanged = true;
    }

    @Override // androidx.recyclerview.widget.a
    public void offsetPositionsForAdd(int i10, int i11) {
        RecyclerView recyclerView = this.f7307a;
        recyclerView.offsetPositionRecordsForInsert(i10, i11);
        recyclerView.mItemsAddedOrRemoved = true;
    }

    @Override // androidx.recyclerview.widget.a
    public void offsetPositionsForMove(int i10, int i11) {
        RecyclerView recyclerView = this.f7307a;
        recyclerView.offsetPositionRecordsForMove(i10, i11);
        recyclerView.mItemsAddedOrRemoved = true;
    }

    @Override // androidx.recyclerview.widget.a
    public void offsetPositionsForRemovingInvisible(int i10, int i11) {
        RecyclerView recyclerView = this.f7307a;
        recyclerView.offsetPositionRecordsForRemove(i10, i11, true);
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f6987d += i11;
    }

    @Override // androidx.recyclerview.widget.a
    public void offsetPositionsForRemovingLaidOutOrNewView(int i10, int i11) {
        RecyclerView recyclerView = this.f7307a;
        recyclerView.offsetPositionRecordsForRemove(i10, i11, false);
        recyclerView.mItemsAddedOrRemoved = true;
    }

    @Override // androidx.recyclerview.widget.a
    public void onDispatchFirstPass(b bVar) {
        a(bVar);
    }

    @Override // androidx.recyclerview.widget.a
    public void onDispatchSecondPass(b bVar) {
        a(bVar);
    }
}
