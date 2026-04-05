package x3;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface m0 extends o0 {
    /* synthetic */ int getNestedScrollAxes();

    /* synthetic */ boolean onNestedFling(View view, float f10, float f11, boolean z10);

    /* synthetic */ boolean onNestedPreFling(View view, float f10, float f11);

    /* synthetic */ void onNestedPreScroll(View view, int i10, int i11, int[] iArr);

    void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12);

    /* synthetic */ void onNestedScroll(View view, int i10, int i11, int i12, int i13);

    void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14);

    /* synthetic */ void onNestedScrollAccepted(View view, View view2, int i10);

    void onNestedScrollAccepted(View view, View view2, int i10, int i11);

    /* synthetic */ boolean onStartNestedScroll(View view, View view2, int i10);

    boolean onStartNestedScroll(View view, View view2, int i10, int i11);

    /* synthetic */ void onStopNestedScroll(View view);

    void onStopNestedScroll(View view, int i10);
}
