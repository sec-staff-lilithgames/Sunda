package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 extends RecyclerView.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7195b;

    public m2(RecyclerView recyclerView) {
        this.f7195b = recyclerView;
    }

    public final void a() {
        RecyclerView recyclerView = this.f7195b;
        if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
            x3.z1.postOnAnimation(recyclerView, recyclerView.mUpdateChildViewsRunnable);
        } else {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onChanged() {
        RecyclerView recyclerView = this.f7195b;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f6990g = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeChanged(int i10, int i11, Object obj) {
        RecyclerView recyclerView = this.f7195b;
        recyclerView.assertNotInLayoutOrScroll(null);
        c cVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = cVar.f7072b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(cVar.obtainUpdateOp(4, i10, i11, obj));
        cVar.f7076f |= 4;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeInserted(int i10, int i11) {
        RecyclerView recyclerView = this.f7195b;
        recyclerView.assertNotInLayoutOrScroll(null);
        c cVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = cVar.f7072b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(cVar.obtainUpdateOp(1, i10, i11, null));
        cVar.f7076f |= 1;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeMoved(int i10, int i11, int i12) {
        RecyclerView recyclerView = this.f7195b;
        recyclerView.assertNotInLayoutOrScroll(null);
        c cVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = cVar.f7072b;
        if (i10 == i11) {
            return;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        arrayList.add(cVar.obtainUpdateOp(8, i10, i11, null));
        cVar.f7076f |= 8;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onItemRangeRemoved(int i10, int i11) {
        RecyclerView recyclerView = this.f7195b;
        recyclerView.assertNotInLayoutOrScroll(null);
        c cVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = cVar.f7072b;
        if (i11 < 1) {
            return;
        }
        arrayList.add(cVar.obtainUpdateOp(2, i10, i11, null));
        cVar.f7076f |= 2;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b
    public void onStateRestorationPolicyChanged() {
        RecyclerView.a aVar;
        RecyclerView recyclerView = this.f7195b;
        if (recyclerView.mPendingSavedState == null || (aVar = recyclerView.mAdapter) == null || !aVar.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
