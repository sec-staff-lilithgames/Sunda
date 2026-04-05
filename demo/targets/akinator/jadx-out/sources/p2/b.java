package p2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import o2.l;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f80670a = new b();

    public final Object localeSpan(n2.e localeList) {
        e0.checkNotNullParameter(localeList, "localeList");
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(localeList, 10));
        Iterator<E> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(a.toJavaLocale((n2.d) it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void setTextLocales(l textPaint, n2.e localeList) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        e0.checkNotNullParameter(localeList, "localeList");
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(localeList, 10));
        Iterator<E> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(a.toJavaLocale((n2.d) it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Locale[] localeArr = (Locale[]) array;
        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
