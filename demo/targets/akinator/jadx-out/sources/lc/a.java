package lc;

import dd.j0;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import jc.o0;
import rc.a;
import rc.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final TimeZone f73060p = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: b, reason: collision with root package name */
    public final cd.s f73061b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f73062c;

    /* renamed from: e, reason: collision with root package name */
    public final jc.c f73063e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f73064f;

    /* renamed from: g, reason: collision with root package name */
    public final a.AbstractC0776a f73065g;

    /* renamed from: h, reason: collision with root package name */
    public final wc.i f73066h;

    /* renamed from: i, reason: collision with root package name */
    public final wc.d f73067i;

    /* renamed from: j, reason: collision with root package name */
    public final DateFormat f73068j;

    /* renamed from: k, reason: collision with root package name */
    public final v f73069k;

    /* renamed from: l, reason: collision with root package name */
    public final Locale f73070l;

    /* renamed from: m, reason: collision with root package name */
    public final TimeZone f73071m;

    /* renamed from: n, reason: collision with root package name */
    public final ub.b f73072n;

    /* renamed from: o, reason: collision with root package name */
    public final b f73073o;

    public a(f0 f0Var, jc.c cVar, o0 o0Var, jc.m mVar, cd.s sVar, wc.i iVar, DateFormat dateFormat, v vVar, Locale locale, TimeZone timeZone, ub.b bVar, wc.d dVar, a.AbstractC0776a abstractC0776a, b bVar2) {
        this.f73062c = f0Var;
        this.f73063e = cVar;
        this.f73064f = o0Var;
        this.f73061b = sVar;
        this.f73066h = iVar;
        this.f73068j = dateFormat;
        this.f73069k = vVar;
        this.f73070l = locale;
        this.f73071m = timeZone;
        this.f73072n = bVar;
        this.f73067i = dVar;
        this.f73065g = abstractC0776a;
        this.f73073o = bVar2;
    }

    public a copy() {
        return new a(this.f73062c.copy(), this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a.AbstractC0776a getAccessorNaming() {
        return this.f73065g;
    }

    public jc.c getAnnotationIntrospector() {
        return this.f73063e;
    }

    public ub.b getBase64Variant() {
        return this.f73072n;
    }

    public b getCacheProvider() {
        return this.f73073o;
    }

    public f0 getClassIntrospector() {
        return this.f73062c;
    }

    public DateFormat getDateFormat() {
        return this.f73068j;
    }

    public jc.m getEnumNamingStrategy() {
        return null;
    }

    public v getHandlerInstantiator() {
        return this.f73069k;
    }

    public Locale getLocale() {
        return this.f73070l;
    }

    public wc.d getPolymorphicTypeValidator() {
        return this.f73067i;
    }

    public o0 getPropertyNamingStrategy() {
        return this.f73064f;
    }

    public TimeZone getTimeZone() {
        TimeZone timeZone = this.f73071m;
        return timeZone == null ? f73060p : timeZone;
    }

    public cd.s getTypeFactory() {
        return this.f73061b;
    }

    public wc.i getTypeResolverBuilder() {
        return this.f73066h;
    }

    public boolean hasExplicitTimeZone() {
        return this.f73071m != null;
    }

    public a with(Locale locale) {
        if (this.f73070l == locale) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, locale, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a withAccessorNaming(a.AbstractC0776a abstractC0776a) {
        if (this.f73065g == abstractC0776a) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, abstractC0776a, this.f73073o);
    }

    public a withAnnotationIntrospector(jc.c cVar) {
        if (this.f73063e == cVar) {
            return this;
        }
        return new a(this.f73062c, cVar, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a withAppendedAnnotationIntrospector(jc.c cVar) {
        return withAnnotationIntrospector(rc.z.create(this.f73063e, cVar));
    }

    public a withClassIntrospector(f0 f0Var) {
        if (this.f73062c == f0Var) {
            return this;
        }
        return new a(f0Var, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a withDateFormat(DateFormat dateFormat) {
        DateFormat dateFormatWithTimeZone = dateFormat;
        if (this.f73068j == dateFormatWithTimeZone) {
            return this;
        }
        if (dateFormatWithTimeZone != null && hasExplicitTimeZone()) {
            boolean z10 = dateFormatWithTimeZone instanceof j0;
            TimeZone timeZone = this.f73071m;
            if (z10) {
                dateFormatWithTimeZone = ((j0) dateFormatWithTimeZone).withTimeZone(timeZone);
            } else {
                dateFormatWithTimeZone = (DateFormat) dateFormatWithTimeZone.clone();
                dateFormatWithTimeZone.setTimeZone(timeZone);
            }
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, dateFormatWithTimeZone, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a withEnumNamingStrategy(jc.m mVar) {
        if (mVar == null) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, mVar, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a withHandlerInstantiator(v vVar) {
        if (this.f73069k == vVar) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, vVar, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a withInsertedAnnotationIntrospector(jc.c cVar) {
        return withAnnotationIntrospector(rc.z.create(cVar, this.f73063e));
    }

    public a withPropertyNamingStrategy(o0 o0Var) {
        if (this.f73064f == o0Var) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, o0Var, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a withTypeFactory(cd.s sVar) {
        if (this.f73061b == sVar) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, sVar, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a withTypeResolverBuilder(wc.i iVar) {
        if (this.f73066h == iVar) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, iVar, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a with(TimeZone timeZone) {
        DateFormat dateFormatWithTimeZone;
        if (timeZone == this.f73071m) {
            return this;
        }
        TimeZone timeZone2 = timeZone == null ? f73060p : timeZone;
        DateFormat dateFormat = this.f73068j;
        if (dateFormat instanceof j0) {
            dateFormatWithTimeZone = ((j0) dateFormat).withTimeZone(timeZone2);
        } else {
            DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
            dateFormat2.setTimeZone(timeZone2);
            dateFormatWithTimeZone = dateFormat2;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, dateFormatWithTimeZone, this.f73069k, this.f73070l, timeZone, this.f73072n, this.f73067i, this.f73065g, this.f73073o);
    }

    public a with(ub.b bVar) {
        if (bVar == this.f73072n) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, bVar, this.f73067i, this.f73065g, this.f73073o);
    }

    public a with(wc.d dVar) {
        if (dVar == this.f73067i) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, dVar, this.f73065g, this.f73073o);
    }

    public a with(b bVar) {
        if (bVar == this.f73073o) {
            return this;
        }
        return new a(this.f73062c, this.f73063e, this.f73064f, null, this.f73061b, this.f73066h, this.f73068j, this.f73069k, this.f73070l, this.f73071m, this.f73072n, this.f73067i, this.f73065g, bVar);
    }

    @Deprecated
    public a(f0 f0Var, jc.c cVar, o0 o0Var, cd.s sVar, wc.i iVar, DateFormat dateFormat, v vVar, Locale locale, TimeZone timeZone, ub.b bVar, wc.d dVar, a.AbstractC0776a abstractC0776a, b bVar2) {
        this(f0Var, cVar, o0Var, null, sVar, iVar, dateFormat, vVar, locale, timeZone, bVar, dVar, abstractC0776a, bVar2);
    }

    @Deprecated
    public a(f0 f0Var, jc.c cVar, o0 o0Var, cd.s sVar, wc.i iVar, DateFormat dateFormat, v vVar, Locale locale, TimeZone timeZone, ub.b bVar, wc.d dVar, a.AbstractC0776a abstractC0776a) {
        this(f0Var, cVar, o0Var, sVar, iVar, dateFormat, vVar, locale, timeZone, bVar, dVar, abstractC0776a, s.defaultInstance());
    }
}
