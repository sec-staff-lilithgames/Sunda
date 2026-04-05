package t3;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f86292b = create(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final r f86293a;

    public p(r rVar) {
        this.f86293a = rVar;
    }

    public static p create(Locale... localeArr) {
        return wrap(new LocaleList(localeArr));
    }

    public static p forLanguageTags(String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArrSplit[i10];
            Locale[] localeArr2 = o.f86291a;
            localeArr[i10] = Locale.forLanguageTag(str2);
        }
        return create(localeArr);
    }

    public static p getAdjustedDefault() {
        return wrap(LocaleList.getAdjustedDefault());
    }

    public static p getDefault() {
        return wrap(LocaleList.getDefault());
    }

    public static p getEmptyLocaleList() {
        return f86292b;
    }

    public static boolean matchesLanguageAndScript(Locale locale, Locale locale2) {
        if (Build.VERSION.SDK_INT >= 33) {
            return LocaleList.matchesLanguageAndScript(locale, locale2);
        }
        Locale[] localeArr = o.f86291a;
        if (locale.equals(locale2)) {
            return true;
        }
        if (locale.getLanguage().equals(locale2.getLanguage())) {
            Locale[] localeArr2 = o.f86291a;
            int length = localeArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Locale[] localeArr3 = o.f86291a;
                    int length2 = localeArr3.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            String strMaximizeAndGetScript = v3.e.maximizeAndGetScript(locale);
                            if (!strMaximizeAndGetScript.isEmpty()) {
                                return strMaximizeAndGetScript.equals(v3.e.maximizeAndGetScript(locale2));
                            }
                            String country = locale.getCountry();
                            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                                return true;
                            }
                        } else {
                            if (localeArr3[i11].equals(locale2)) {
                                break;
                            }
                            i11++;
                        }
                    }
                } else {
                    if (localeArr2[i10].equals(locale)) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return false;
    }

    @Deprecated
    public static p wrap(Object obj) {
        return wrap((LocaleList) obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f86293a.equals(((p) obj).f86293a);
        }
        return false;
    }

    public Locale get(int i10) {
        return this.f86293a.get(i10);
    }

    public Locale getFirstMatch(String[] strArr) {
        return this.f86293a.getFirstMatch(strArr);
    }

    public int hashCode() {
        return this.f86293a.hashCode();
    }

    public int indexOf(Locale locale) {
        return this.f86293a.indexOf(locale);
    }

    public boolean isEmpty() {
        return this.f86293a.isEmpty();
    }

    public int size() {
        return this.f86293a.size();
    }

    public String toLanguageTags() {
        return this.f86293a.toLanguageTags();
    }

    public String toString() {
        return this.f86293a.toString();
    }

    public Object unwrap() {
        return this.f86293a.getLocaleList();
    }

    public static p wrap(LocaleList localeList) {
        return new p(new r(localeList));
    }
}
