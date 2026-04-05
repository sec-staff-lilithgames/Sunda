package o2;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f77419a = new m();

    public final TypefaceSpan createTypefaceSpan(Typeface typeface) {
        e0.checkNotNullParameter(typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
