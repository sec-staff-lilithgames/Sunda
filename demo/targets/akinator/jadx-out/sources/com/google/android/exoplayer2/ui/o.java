package com.google.android.exoplayer2.ui;

import android.text.Html;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f28295a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f28295a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.ui.l convert(java.lang.CharSequence r16, float r17) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.o.convert(java.lang.CharSequence, float):com.google.android.exoplayer2.ui.l");
    }
}
