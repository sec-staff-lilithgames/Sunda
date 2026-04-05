package com.sfbx.appconsentv3.ui.util;

import android.view.View;
import android.widget.Button;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ButtonExtsKt {
    public static final void initButton(Button button, int i10, int i11, int i12, int i13, boolean z10) {
        e0.checkNotNullParameter(button, "<this>");
        if (z10) {
            i10 = i11;
        }
        button.setTextColor(i10);
        if (z10) {
            i12 = 0;
        }
        if (!z10) {
            i11 = 0;
        }
        button.setBackground(ViewExtsKt.getBackgroundSolidStrokeRectangle(button, i12, i11));
        if (i13 > -1) {
            button.setPadding(i13, 0, i13, 0);
        }
    }

    public static /* synthetic */ void initButton$default(Button button, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        if ((i14 & 16) != 0) {
            z10 = false;
        }
        initButton(button, i10, i11, i12, i13, z10);
    }

    public static final void initSettingButton(Button button, int i10, int i11, int i12) {
        e0.checkNotNullParameter(button, "<this>");
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            i10 = numValueOf.intValue();
        }
        button.setTextColor(i10);
        button.setBackground(ViewExtsKt.getBackgroundSolidStrokeRectangle(button, 0, i11));
        if (i12 > -1) {
            button.setPadding(i12, 0, i12, 0);
        }
    }

    public static /* synthetic */ void initSettingButton$default(Button button, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = -1;
        }
        initSettingButton(button, i10, i11, i12);
    }

    public static final void setButtonValues(Button button, String text, View.OnClickListener listener) {
        e0.checkNotNullParameter(button, "<this>");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(listener, "listener");
        button.setVisibility(0);
        button.setText(text);
        button.setOnClickListener(listener);
    }
}
