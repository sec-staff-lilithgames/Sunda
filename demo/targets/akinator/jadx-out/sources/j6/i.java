package j6;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f69140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f69140a = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(RecyclerView.l lVar, int[] iArr) {
        ViewPager2 viewPager2 = this.f69140a;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.calculateExtraLayoutSpace(lVar, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityNodeInfo(RecyclerView.j jVar, RecyclerView.l lVar, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(jVar, lVar, cVar);
        this.f69140a.f7400v.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.j jVar, RecyclerView.l lVar, View view, y3.c cVar) {
        ViewPager2 viewPager2 = this.f69140a.f7400v.f69147d;
        cVar.setCollectionItemInfo(y3.k.obtain(viewPager2.getOrientation() == 1 ? viewPager2.f7387i.getPosition(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.f7387i.getPosition(view) : 0, 1, false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean performAccessibilityAction(RecyclerView.j jVar, RecyclerView.l lVar, int i10, Bundle bundle) {
        this.f69140a.f7400v.getClass();
        return super.performAccessibilityAction(jVar, lVar, i10, bundle);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        return false;
    }
}
