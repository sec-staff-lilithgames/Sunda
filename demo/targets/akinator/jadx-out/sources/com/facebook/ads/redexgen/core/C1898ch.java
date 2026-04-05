package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1898ch {
    public final int[] A00(View view, int i10, int i11) {
        QP qp2 = (QP) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i10, view.getPaddingLeft() + view.getPaddingRight(), qp2.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i11, childWidthSpec + view.getPaddingBottom(), qp2.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + qp2.leftMargin + qp2.rightMargin, childWidthSpec3 + qp2.bottomMargin + qp2.topMargin};
    }
}
