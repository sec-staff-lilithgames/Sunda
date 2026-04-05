package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.c)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.c cVar = (TabLayout.c) view;
        int contentWidth = cVar.getContentWidth();
        int contentHeight = cVar.getContentHeight();
        int iDpToPx = (int) t0.dpToPx(cVar.getContext(), 24);
        if (contentWidth < iDpToPx) {
            contentWidth = iDpToPx;
        }
        int right = (cVar.getRight() + cVar.getLeft()) / 2;
        int bottom = (cVar.getBottom() + cVar.getTop()) / 2;
        int i10 = contentWidth / 2;
        return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(vf.a.lerp((int) rectFA.left, (int) rectFA2.left, f10), drawable.getBounds().top, vf.a.lerp((int) rectFA.right, (int) rectFA2.right, f10), drawable.getBounds().bottom);
    }
}
