package br;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class m1 {
    public static final void setPadding(View view, l1 l1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        if (l1Var == null) {
            return;
        }
        Context context = view.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
        int iDpToPx = ir.s.dpToPx(context, l1Var.getLeftDp());
        Context context2 = view.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context2, "context");
        int iDpToPx2 = ir.s.dpToPx(context2, l1Var.getTopDp());
        Context context3 = view.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context3, "context");
        int iDpToPx3 = ir.s.dpToPx(context3, l1Var.getRightDp());
        Context context4 = view.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context4, "context");
        view.setPadding(iDpToPx, iDpToPx2, iDpToPx3, ir.s.dpToPx(context4, l1Var.getBottomDp()));
    }
}
