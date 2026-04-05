package com.sfbx.appconsentv3.ui.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ViewExtsKt {
    public static final Drawable getBackground(View view, int i10, int i11, int i12) {
        e0.checkNotNullParameter(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = view.getContext();
        e0.checkNotNullExpressionValue(context, "context");
        gradientDrawable.setCornerRadius(ExtensionKt.dpToPx(i12, context));
        gradientDrawable.setColor(i10);
        Context context2 = view.getContext();
        e0.checkNotNullExpressionValue(context2, "context");
        gradientDrawable.setStroke(ExtensionKt.dpToPx(2.0f, context2), i11);
        return gradientDrawable;
    }

    public static final Drawable getBackgroundSolid(View view, int i10, int i11) {
        e0.checkNotNullParameter(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i11 > 0) {
            Context context = view.getContext();
            e0.checkNotNullExpressionValue(context, "context");
            gradientDrawable.setCornerRadius(ExtensionKt.dpToPx(i11, context));
        }
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    public static final Drawable getBackgroundSolidStrokeRectangle(View view, int i10, int i11) {
        e0.checkNotNullParameter(view, "<this>");
        return getBackground(view, i10, i11, 6);
    }

    public static final Drawable getBackgroundStroke(View view, int i10, int i11) {
        e0.checkNotNullParameter(view, "<this>");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = view.getContext();
        e0.checkNotNullExpressionValue(context, "context");
        gradientDrawable.setCornerRadius(ExtensionKt.dpToPx(6.0f, context));
        if (i10 != 0) {
            Context context2 = view.getContext();
            e0.checkNotNullExpressionValue(context2, "context");
            gradientDrawable.setStroke(ExtensionKt.dpToPx(2.0f, context2), i10);
        }
        float f10 = i11;
        Context context3 = view.getContext();
        e0.checkNotNullExpressionValue(context3, "context");
        int iDpToPx = ExtensionKt.dpToPx(f10, context3);
        Context context4 = view.getContext();
        e0.checkNotNullExpressionValue(context4, "context");
        int iDpToPx2 = ExtensionKt.dpToPx(f10, context4);
        Context context5 = view.getContext();
        e0.checkNotNullExpressionValue(context5, "context");
        int iDpToPx3 = ExtensionKt.dpToPx(f10, context5);
        Context context6 = view.getContext();
        e0.checkNotNullExpressionValue(context6, "context");
        return new InsetDrawable((Drawable) gradientDrawable, iDpToPx, iDpToPx2, iDpToPx3, ExtensionKt.dpToPx(f10, context6));
    }

    public static /* synthetic */ Drawable getBackgroundStroke$default(View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return getBackgroundStroke(view, i10, i11);
    }

    public static final void underline(TextView textView, int i10) {
        e0.checkNotNullParameter(textView, "<this>");
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        if (i10 != 0) {
            textView.setTextColor(i10);
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            e0.checkNotNullExpressionValue(compoundDrawablesRelative, "compoundDrawablesRelative");
            for (Drawable it : compoundDrawablesRelative) {
                if (it != null) {
                    e0.checkNotNullExpressionValue(it, "it");
                    p3.a.setTint(it, i10);
                }
            }
        }
    }
}
