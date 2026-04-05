package l0;

import g2.b2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k0 {
    public static final int findParagraphEnd(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i11 = i10 + 1; i11 < length; i11++) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        for (int i11 = i10 - 1; i11 > 0; i11--) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return b2.TextRange(findParagraphStart(charSequence, i10), findParagraphEnd(charSequence, i10));
    }
}
