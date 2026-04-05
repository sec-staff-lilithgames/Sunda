package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f41103a;

    private static int a(View view, ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) == view) {
                return i10;
            }
        }
        return -1;
    }

    private static boolean a(View view, View view2, float f10) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        if (rect3.setIntersect(rect, rect2)) {
            int iHeight = rect3.height() * rect3.width();
            int iHeight2 = rect.height() * rect.width();
            int measuredHeight = view.getMeasuredHeight() * view.getMeasuredWidth();
            if (f10 == 0.0f) {
                return iHeight2 < measuredHeight || iHeight >= measuredHeight;
            }
            float f11 = measuredHeight * f10;
            float f12 = iHeight;
            if (f12 >= f11) {
                return true;
            }
            int i10 = iHeight2 - iHeight;
            if (iHeight + i10 >= measuredHeight) {
                return f12 > f11;
            }
            if (i10 <= f11) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(View view, ViewGroup viewGroup, float f10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            p0.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && a(view, childAt, f10)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    p0.b("ViewUtils", "View Judge : View Covered by WebView.");
                    f41103a = true;
                }
                if (a(childAt)) {
                    p0.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f41103a = true;
                }
                if (f41103a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, f10);
                }
            }
        }
        return f41103a;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.view.View r10, int r11) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.d1.a(android.view.View, int):boolean");
    }

    public static boolean a(View view) {
        if (view == null) {
            return true;
        }
        if (!((view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getAlpha() > 0.5f) {
            return view.getBackground() == null || view.getBackground().getAlpha() > 127;
        }
        return false;
    }
}
