package t3;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f86294a;

    public r(LocaleList localeList) {
        this.f86294a = localeList;
    }

    public boolean equals(Object obj) {
        return this.f86294a.equals(((q) obj).getLocaleList());
    }

    @Override // t3.q
    public Locale get(int i10) {
        return this.f86294a.get(i10);
    }

    @Override // t3.q
    public Locale getFirstMatch(String[] strArr) {
        return this.f86294a.getFirstMatch(strArr);
    }

    @Override // t3.q
    public Object getLocaleList() {
        return this.f86294a;
    }

    public int hashCode() {
        return this.f86294a.hashCode();
    }

    @Override // t3.q
    public int indexOf(Locale locale) {
        return this.f86294a.indexOf(locale);
    }

    @Override // t3.q
    public boolean isEmpty() {
        return this.f86294a.isEmpty();
    }

    @Override // t3.q
    public int size() {
        return this.f86294a.size();
    }

    @Override // t3.q
    public String toLanguageTags() {
        return this.f86294a.toLanguageTags();
    }

    public String toString() {
        return this.f86294a.toString();
    }
}
