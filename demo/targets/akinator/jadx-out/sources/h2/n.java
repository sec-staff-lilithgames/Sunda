package h2;

import android.text.Spanned;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static final boolean hasSpan(Spanned spanned, Class<?> clazz) {
        e0.checkNotNullParameter(spanned, "<this>");
        e0.checkNotNullParameter(clazz, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), clazz) != spanned.length();
    }

    public static final boolean hasSpan(Spanned spanned, Class<?> clazz, int i10, int i11) {
        e0.checkNotNullParameter(spanned, "<this>");
        e0.checkNotNullParameter(clazz, "clazz");
        return spanned.nextSpanTransition(i10 - 1, i11, clazz) != i11;
    }
}
