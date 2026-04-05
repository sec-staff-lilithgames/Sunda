package oc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l extends c1 implements mc.k {

    /* renamed from: f, reason: collision with root package name */
    public final DateFormat f78881f;

    /* renamed from: g, reason: collision with root package name */
    public final String f78882g;

    public l(Class cls) {
        super(cls);
        this.f78881f = null;
        this.f78882g = null;
    }

    @Override // oc.s0
    public final Date A(ub.u uVar, jc.k kVar) {
        Date date;
        if (this.f78881f == null || !uVar.hasToken(ub.z.VALUE_STRING)) {
            return super.A(uVar, kVar);
        }
        String strTrim = uVar.getText().trim();
        if (strTrim.isEmpty()) {
            if (f(strTrim, kVar).ordinal() != 3) {
                return null;
            }
            return new Date(0L);
        }
        synchronized (this.f78881f) {
            try {
                try {
                    date = this.f78881f.parse(strTrim);
                } catch (ParseException unused) {
                    return (Date) kVar.handleWeirdStringValue(handledType(), strTrim, "expected format \"%s\"", this.f78882g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return date;
    }

    public abstract l V(DateFormat dateFormat, String str);

    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        DateFormat dateFormat;
        DateFormat dateFormatWithLenient;
        tb.t tVarS = s0.S(kVar, gVar, handledType());
        if (tVarS != null) {
            TimeZone timeZone = tVarS.getTimeZone();
            Boolean lenient = tVarS.getLenient();
            if (tVarS.hasPattern()) {
                String pattern = tVarS.getPattern();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, tVarS.hasLocale() ? tVarS.getLocale() : kVar.getLocale());
                if (timeZone == null) {
                    timeZone = kVar.getTimeZone();
                }
                simpleDateFormat.setTimeZone(timeZone);
                if (lenient != null) {
                    simpleDateFormat.setLenient(lenient.booleanValue());
                }
                return V(simpleDateFormat, pattern);
            }
            String pattern2 = this.f78882g;
            if (timeZone != null) {
                DateFormat dateFormat2 = kVar.getConfig().getDateFormat();
                if (dateFormat2.getClass() == dd.j0.class) {
                    dd.j0 j0VarWithLocale = ((dd.j0) dateFormat2).withTimeZone(timeZone).withLocale(tVarS.hasLocale() ? tVarS.getLocale() : kVar.getLocale());
                    dateFormatWithLenient = j0VarWithLocale;
                    if (lenient != null) {
                        dateFormatWithLenient = j0VarWithLocale.withLenient(lenient);
                    }
                } else {
                    DateFormat dateFormat3 = (DateFormat) dateFormat2.clone();
                    dateFormat3.setTimeZone(timeZone);
                    dateFormatWithLenient = dateFormat3;
                    if (lenient != null) {
                        dateFormat3.setLenient(lenient.booleanValue());
                        dateFormatWithLenient = dateFormat3;
                    }
                }
                return V(dateFormatWithLenient, pattern2);
            }
            if (lenient != null) {
                DateFormat dateFormat4 = kVar.getConfig().getDateFormat();
                if (dateFormat4.getClass() == dd.j0.class) {
                    dd.j0 j0VarWithLenient = ((dd.j0) dateFormat4).withLenient(lenient);
                    pattern2 = j0VarWithLenient.toPattern();
                    dateFormat = j0VarWithLenient;
                } else {
                    DateFormat dateFormat5 = (DateFormat) dateFormat4.clone();
                    dateFormat5.setLenient(lenient.booleanValue());
                    boolean z10 = dateFormat5 instanceof SimpleDateFormat;
                    dateFormat = dateFormat5;
                    if (z10) {
                        ((SimpleDateFormat) dateFormat5).toPattern();
                        dateFormat = dateFormat5;
                    }
                }
                if (pattern2 == null) {
                    pattern2 = "[unknown]";
                }
                return V(dateFormat, pattern2);
            }
        }
        return this;
    }

    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12150n;
    }

    public l(l lVar, DateFormat dateFormat, String str) {
        super(lVar.f78945b);
        this.f78881f = dateFormat;
        this.f78882g = str;
    }
}
