package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7278a;

    /* renamed from: b, reason: collision with root package name */
    public int f7279b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f7280c;

    /* renamed from: d, reason: collision with root package name */
    public int f7281d;

    public final void a(RecyclerView recyclerView, boolean z10) {
        this.f7281d = 0;
        int[] iArr = this.f7280c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        RecyclerView.f fVar = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || fVar == null || !fVar.isItemPrefetchEnabled()) {
            return;
        }
        if (z10) {
            if (!recyclerView.mAdapterHelper.g()) {
                fVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            fVar.collectAdjacentPrefetchPositions(this.f7278a, this.f7279b, recyclerView.mState, this);
        }
        int i10 = this.f7281d;
        if (i10 > fVar.mPrefetchMaxCountObserved) {
            fVar.mPrefetchMaxCountObserved = i10;
            fVar.mPrefetchMaxObservedInInitialPrefetch = z10;
            recyclerView.mRecycler.m();
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void addPosition(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f7281d;
        int i13 = i12 * 2;
        int[] iArr = this.f7280c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f7280c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f7280c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f7280c;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f7281d++;
    }
}
