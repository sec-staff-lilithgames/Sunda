package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l extends y0 implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f9094e;

    /* renamed from: f, reason: collision with root package name */
    public final DateFormat f9095f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f9096g;

    public l(Class cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.f9094e = bool;
        this.f9095f = dateFormat;
        this.f9096g = dateFormat == null ? null : new AtomicReference();
    }

    @Override // bd.y0, bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        if (e(hVar.getProvider())) {
            hVar.expectIntegerFormat(oVar);
        } else {
            hVar.expectStringFormat(oVar);
        }
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        tb.t tVarC = z0.c(handledType(), u0Var, gVar);
        if (tVarC != null) {
            tb.s shape = tVarC.getShape();
            if (shape.isNumeric()) {
                return withFormat(Boolean.TRUE, null);
            }
            if (tVarC.hasPattern()) {
                DateFormat simpleDateFormat = new SimpleDateFormat(tVarC.getPattern(), tVarC.hasLocale() ? tVarC.getLocale() : u0Var.getLocale());
                simpleDateFormat.setTimeZone(tVarC.hasTimeZone() ? tVarC.getTimeZone() : u0Var.getTimeZone());
                return withFormat(Boolean.FALSE, simpleDateFormat);
            }
            boolean zHasLocale = tVarC.hasLocale();
            boolean zHasTimeZone = tVarC.hasTimeZone();
            boolean z10 = shape == tb.s.f86771g;
            if (zHasLocale || zHasTimeZone || z10) {
                DateFormat dateFormat = u0Var.getConfig().getDateFormat();
                if (dateFormat instanceof dd.j0) {
                    dd.j0 j0VarWithTimeZone = (dd.j0) dateFormat;
                    if (tVarC.hasLocale()) {
                        j0VarWithTimeZone = j0VarWithTimeZone.withLocale(tVarC.getLocale());
                    }
                    if (tVarC.hasTimeZone()) {
                        j0VarWithTimeZone = j0VarWithTimeZone.withTimeZone(tVarC.getTimeZone());
                    }
                    return withFormat(Boolean.FALSE, j0VarWithTimeZone);
                }
                if (!(dateFormat instanceof SimpleDateFormat)) {
                    u0Var.reportBadDefinition((Class<?>) handledType(), "Configured `DateFormat` (" + dateFormat.getClass().getName() + ") not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`");
                }
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
                DateFormat simpleDateFormat3 = zHasLocale ? new SimpleDateFormat(simpleDateFormat2.toPattern(), tVarC.getLocale()) : (SimpleDateFormat) simpleDateFormat2.clone();
                TimeZone timeZone = tVarC.getTimeZone();
                if (timeZone != null && !timeZone.equals(simpleDateFormat3.getTimeZone())) {
                    simpleDateFormat3.setTimeZone(timeZone);
                }
                return withFormat(Boolean.FALSE, simpleDateFormat3);
            }
        }
        return this;
    }

    public final boolean e(jc.u0 u0Var) {
        Boolean bool = this.f9094e;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f9095f != null) {
            return false;
        }
        if (u0Var != null) {
            return u0Var.isEnabled(jc.t0.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for ".concat(handledType().getName()));
    }

    public final void f(Date date, ub.o oVar, jc.u0 u0Var) throws IOException {
        DateFormat dateFormat = this.f9095f;
        if (dateFormat == null) {
            u0Var.defaultSerializeDateValue(date, oVar);
            return;
        }
        AtomicReference atomicReference = this.f9096g;
        DateFormat dateFormat2 = (DateFormat) atomicReference.getAndSet(null);
        if (dateFormat2 == null) {
            dateFormat2 = (DateFormat) dateFormat.clone();
        }
        oVar.writeString(dateFormat2.format(date));
        while (!atomicReference.compareAndSet(null, dateFormat2) && atomicReference.get() == null) {
        }
    }

    @Override // bd.y0, bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a(e(u0Var) ? "number" : "string");
    }

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Object obj) {
        return false;
    }

    @Override // bd.z0, jc.w
    public abstract void serialize(Object obj, ub.o oVar, jc.u0 u0Var) throws IOException;

    public abstract l withFormat(Boolean bool, DateFormat dateFormat);
}
