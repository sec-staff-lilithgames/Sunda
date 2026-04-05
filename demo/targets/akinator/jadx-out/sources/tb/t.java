package tb;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class t implements a, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final t f86779j = new t();

    /* renamed from: b, reason: collision with root package name */
    public final String f86780b;

    /* renamed from: c, reason: collision with root package name */
    public final s f86781c;

    /* renamed from: e, reason: collision with root package name */
    public final Locale f86782e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86783f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f86784g;

    /* renamed from: h, reason: collision with root package name */
    public final r f86785h;

    /* renamed from: i, reason: collision with root package name */
    public transient TimeZone f86786i;

    public t() {
        this("", s.f86775k, "", "", r.empty(), (Boolean) null);
    }

    public static boolean a(Object obj, Serializable serializable) {
        if (obj == null) {
            return serializable == null;
        }
        if (serializable == null) {
            return false;
        }
        return obj.equals(serializable);
    }

    public static final t empty() {
        return f86779j;
    }

    public static t forLeniency(boolean z10) {
        return new t("", null, null, null, null, r.empty(), Boolean.valueOf(z10));
    }

    public static t forPattern(String str) {
        return new t(str, null, null, null, null, r.empty(), null);
    }

    public static t forShape(s sVar) {
        return new t("", sVar, null, null, null, r.empty(), null);
    }

    public static final t from(u uVar) {
        return uVar == null ? f86779j : new t(uVar);
    }

    public static t merge(t tVar, t tVar2) {
        return tVar == null ? tVar2 : tVar.withOverrides(tVar2);
    }

    public static t mergeAll(t... tVarArr) {
        t tVar = null;
        for (t tVarWithOverrides : tVarArr) {
            if (tVarWithOverrides != null) {
                if (tVar != null) {
                    tVarWithOverrides = tVar.withOverrides(tVarWithOverrides);
                }
                tVar = tVarWithOverrides;
            }
        }
        return tVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f86781c == tVar.f86781c && this.f86785h.equals(tVar.f86785h) && a(this.f86784g, tVar.f86784g) && a(this.f86783f, tVar.f86783f) && a(this.f86780b, tVar.f86780b) && a(this.f86786i, tVar.f86786i) && a(this.f86782e, tVar.f86782e);
    }

    public Boolean getFeature(q qVar) {
        return this.f86785h.get(qVar);
    }

    public r getFeatures() {
        return this.f86785h;
    }

    public Boolean getLenient() {
        return this.f86784g;
    }

    public Locale getLocale() {
        return this.f86782e;
    }

    public String getPattern() {
        return this.f86780b;
    }

    public s getShape() {
        return this.f86781c;
    }

    public TimeZone getTimeZone() {
        TimeZone timeZone = this.f86786i;
        if (timeZone != null) {
            return timeZone;
        }
        String str = this.f86783f;
        if (str == null) {
            return null;
        }
        TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str);
        this.f86786i = timeZone2;
        return timeZone2;
    }

    public boolean hasLenient() {
        return this.f86784g != null;
    }

    public boolean hasLocale() {
        return this.f86782e != null;
    }

    public boolean hasPattern() {
        String str = this.f86780b;
        return str != null && str.length() > 0;
    }

    public boolean hasShape() {
        return this.f86781c != s.f86775k;
    }

    public boolean hasTimeZone() {
        if (this.f86786i != null) {
            return true;
        }
        String str = this.f86783f;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public int hashCode() {
        String str = this.f86783f;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this.f86780b;
        if (str2 != null) {
            iHashCode ^= str2.hashCode();
        }
        int iHashCode2 = this.f86781c.hashCode() + iHashCode;
        Boolean bool = this.f86784g;
        if (bool != null) {
            iHashCode2 ^= bool.hashCode();
        }
        Locale locale = this.f86782e;
        if (locale != null) {
            iHashCode2 += locale.hashCode();
        }
        return this.f86785h.hashCode() ^ iHashCode2;
    }

    public boolean isLenient() {
        return Boolean.TRUE.equals(this.f86784g);
    }

    public String timeZoneAsString() {
        TimeZone timeZone = this.f86786i;
        return timeZone != null ? timeZone.getID() : this.f86783f;
    }

    public String toString() {
        return "JsonFormat.Value(pattern=" + this.f86780b + ",shape=" + this.f86781c + ",lenient=" + this.f86784g + ",locale=" + this.f86782e + ",timezone=" + this.f86783f + ",features=" + this.f86785h + ")";
    }

    @Override // tb.a
    public Class<u> valueFor() {
        return u.class;
    }

    public t withFeature(q qVar) {
        r rVar = this.f86785h;
        r rVarWith = rVar.with(qVar);
        if (rVarWith == rVar) {
            return this;
        }
        return new t(this.f86780b, this.f86781c, this.f86782e, this.f86783f, this.f86786i, rVarWith, this.f86784g);
    }

    public t withLenient(Boolean bool) {
        if (bool == this.f86784g) {
            return this;
        }
        return new t(this.f86780b, this.f86781c, this.f86782e, this.f86783f, this.f86786i, this.f86785h, bool);
    }

    public t withLocale(Locale locale) {
        return new t(this.f86780b, this.f86781c, locale, this.f86783f, this.f86786i, this.f86785h, this.f86784g);
    }

    public final t withOverrides(t tVar) {
        TimeZone timeZone;
        if (tVar != null) {
            r rVarWithOverrides = tVar.f86785h;
            t tVar2 = f86779j;
            if (tVar != tVar2 && tVar != this) {
                if (this == tVar2) {
                    return tVar;
                }
                String str = tVar.f86780b;
                if (str == null || str.isEmpty()) {
                    str = this.f86780b;
                }
                String str2 = str;
                s sVar = tVar.f86781c;
                if (sVar == s.f86775k) {
                    sVar = this.f86781c;
                }
                s sVar2 = sVar;
                Locale locale = tVar.f86782e;
                if (locale == null) {
                    locale = this.f86782e;
                }
                Locale locale2 = locale;
                r rVar = this.f86785h;
                if (rVar != null) {
                    rVarWithOverrides = rVar.withOverrides(rVarWithOverrides);
                }
                r rVar2 = rVarWithOverrides;
                Boolean bool = tVar.f86784g;
                if (bool == null) {
                    bool = this.f86784g;
                }
                Boolean bool2 = bool;
                String str3 = tVar.f86783f;
                if (str3 == null || str3.isEmpty()) {
                    timeZone = this.f86786i;
                    str3 = this.f86783f;
                } else {
                    timeZone = tVar.f86786i;
                }
                return new t(str2, sVar2, locale2, str3, timeZone, rVar2, bool2);
            }
        }
        return this;
    }

    public t withPattern(String str) {
        return new t(str, this.f86781c, this.f86782e, this.f86783f, this.f86786i, this.f86785h, this.f86784g);
    }

    public t withShape(s sVar) {
        if (sVar == this.f86781c) {
            return this;
        }
        return new t(this.f86780b, sVar, this.f86782e, this.f86783f, this.f86786i, this.f86785h, this.f86784g);
    }

    public t withTimeZone(TimeZone timeZone) {
        return new t(this.f86780b, this.f86781c, this.f86782e, null, timeZone, this.f86785h, this.f86784g);
    }

    public t withoutFeature(q qVar) {
        r rVar = this.f86785h;
        r rVarWithout = rVar.without(qVar);
        if (rVarWithout == rVar) {
            return this;
        }
        return new t(this.f86780b, this.f86781c, this.f86782e, this.f86783f, this.f86786i, rVarWithout, this.f86784g);
    }

    public t(u uVar) {
        this(uVar.pattern(), uVar.shape(), uVar.locale(), uVar.timezone(), r.construct(uVar), uVar.lenient().asBoolean());
    }

    public t(String str, s sVar, String str2, String str3, r rVar, Boolean bool) {
        this(str, sVar, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, rVar, bool);
    }

    public t(String str, s sVar, Locale locale, TimeZone timeZone, r rVar, Boolean bool) {
        this.f86780b = str == null ? "" : str;
        this.f86781c = sVar == null ? s.f86775k : sVar;
        this.f86782e = locale;
        this.f86786i = timeZone;
        this.f86783f = null;
        this.f86785h = rVar == null ? r.empty() : rVar;
        this.f86784g = bool;
    }

    public t(String str, s sVar, Locale locale, String str2, TimeZone timeZone, r rVar, Boolean bool) {
        this.f86780b = str == null ? "" : str;
        this.f86781c = sVar == null ? s.f86775k : sVar;
        this.f86782e = locale;
        this.f86786i = timeZone;
        this.f86783f = str2;
        this.f86785h = rVar == null ? r.empty() : rVar;
        this.f86784g = bool;
    }

    @Deprecated
    public t(String str, s sVar, Locale locale, String str2, TimeZone timeZone, r rVar) {
        this(str, sVar, locale, str2, timeZone, rVar, null);
    }

    @Deprecated
    public t(String str, s sVar, String str2, String str3, r rVar) {
        this(str, sVar, str2, str3, rVar, (Boolean) null);
    }

    @Deprecated
    public t(String str, s sVar, Locale locale, TimeZone timeZone, r rVar) {
        this(str, sVar, locale, timeZone, rVar, (Boolean) null);
    }
}
