package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {
    public static String cssAllClassDescendantsSelector(String str) {
        return e3.g.l(".", str, ",.", str, " *");
    }

    public static String toCssRgba(int i10) {
        return n1.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
