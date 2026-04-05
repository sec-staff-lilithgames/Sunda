package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.t8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3004t8 extends ViewGroup {
    public C3004t8(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(p10, "p");
        return p10 instanceof C2987s8;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(p10, "p");
        return new C2987s8(p10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.e0.checkNotNull(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C2987s8 c2987s8 = (C2987s8) layoutParams;
                int i15 = c2987s8.f33366a;
                childAt.layout(i15, c2987s8.f33367b, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + c2987s8.f33367b);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChildren(i10, i11);
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.e0.checkNotNull(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C2987s8 c2987s8 = (C2987s8) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + c2987s8.f33366a;
                int measuredHeight = childAt.getMeasuredHeight() + c2987s8.f33367b;
                iMax2 = Math.max(iMax2, measuredWidth);
                iMax = Math.max(iMax, measuredHeight);
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(iMax2, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(iMax, getSuggestedMinimumHeight()), i11));
    }
}
