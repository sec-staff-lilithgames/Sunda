package n2;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f75554b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f75555a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final d getCurrent() {
            return new d(h.getPlatformLocaleDelegate().getCurrent().get(0));
        }
    }

    public d(f platformLocale) {
        e0.checkNotNullParameter(platformLocale, "platformLocale");
        this.f75555a = platformLocale;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return e0.areEqual(toLanguageTag(), ((d) obj).toLanguageTag());
    }

    public final String getLanguage() {
        return this.f75555a.getLanguage();
    }

    public final f getPlatformLocale$ui_text_release() {
        return this.f75555a;
    }

    public final String getRegion() {
        return this.f75555a.getRegion();
    }

    public final String getScript() {
        return this.f75555a.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public final String toLanguageTag() {
        return this.f75555a.toLanguageTag();
    }

    public String toString() {
        return toLanguageTag();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String languageTag) {
        this(h.getPlatformLocaleDelegate().parseLanguageTag(languageTag));
        e0.checkNotNullParameter(languageTag, "languageTag");
    }
}
