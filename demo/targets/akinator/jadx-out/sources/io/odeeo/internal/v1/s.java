package io.odeeo.internal.v1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f67289a = new s();

    public final float getCoveragePercentage(View belowView, View aboveView) {
        e0.checkNotNullParameter(belowView, "belowView");
        e0.checkNotNullParameter(aboveView, "aboveView");
        int[] iArr = new int[2];
        belowView.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        aboveView.getLocationOnScreen(iArr2);
        Rect rect = new Rect(belowView.getPaddingLeft() + iArr[0], belowView.getPaddingTop() + iArr[1], (belowView.getWidth() + iArr[0]) - belowView.getPaddingRight(), (belowView.getHeight() + iArr[1]) - belowView.getPaddingBottom());
        Rect rect2 = new Rect(aboveView.getPaddingLeft() + iArr2[0], aboveView.getPaddingTop() + iArr2[1], (aboveView.getWidth() + iArr2[0]) - aboveView.getPaddingRight(), (aboveView.getHeight() + iArr2[1]) - aboveView.getPaddingBottom());
        if (!new Rect().setIntersect(rect, rect2)) {
            return 0.0f;
        }
        float fHeight = (r11.height() * r11.width()) / (belowView.getHeight() * belowView.getWidth());
        io.odeeo.internal.b2.a.d(e0.stringPlus("areaCovered: ", Float.valueOf(fHeight)), new Object[0]);
        return fHeight * 100;
    }

    public final boolean isLikelyDialogOrInterstitial(View view) {
        e0.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (view.getMeasuredWidth() < view.getResources().getDisplayMetrics().widthPixels || view.getMeasuredHeight() < view.getResources().getDisplayMetrics().heightPixels) && (layoutParams2 != null && layoutParams2.gravity == 17);
    }
}
