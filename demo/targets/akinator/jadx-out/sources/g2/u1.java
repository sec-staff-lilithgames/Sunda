package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f56859a = o2.k.ActualStringDelegate();

    public static final String capitalize(String str, n2.d locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        return f56859a.capitalize(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String decapitalize(String str, n2.d locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        return f56859a.decapitalize(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String toLowerCase(String str, n2.d locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        return f56859a.toLowerCase(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String toUpperCase(String str, n2.d locale) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(locale, "locale");
        return f56859a.toUpperCase(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String capitalize(String str, n2.e localeList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(localeList, "localeList");
        return capitalize(str, localeList.isEmpty() ? n2.d.f75554b.getCurrent() : localeList.get(0));
    }

    public static final String decapitalize(String str, n2.e localeList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(localeList, "localeList");
        return decapitalize(str, localeList.isEmpty() ? n2.d.f75554b.getCurrent() : localeList.get(0));
    }

    public static final String toLowerCase(String str, n2.e localeList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(localeList, "localeList");
        return toLowerCase(str, localeList.isEmpty() ? n2.d.f75554b.getCurrent() : localeList.get(0));
    }

    public static final String toUpperCase(String str, n2.e localeList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(localeList, "localeList");
        return toUpperCase(str, localeList.isEmpty() ? n2.d.f75554b.getCurrent() : localeList.get(0));
    }
}
