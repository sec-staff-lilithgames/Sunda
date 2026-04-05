package jc;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tb.f1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u0 extends h {

    /* renamed from: o, reason: collision with root package name */
    public static final ad.c f69443o = new ad.c("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");

    /* renamed from: p, reason: collision with root package name */
    public static final ad.c0 f69444p = new ad.c0();

    /* renamed from: b, reason: collision with root package name */
    public final s0 f69445b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f69446c;

    /* renamed from: e, reason: collision with root package name */
    public final zc.s f69447e;

    /* renamed from: f, reason: collision with root package name */
    public final zc.r f69448f;

    /* renamed from: g, reason: collision with root package name */
    public transient lc.n f69449g;

    /* renamed from: h, reason: collision with root package name */
    public final w f69450h;

    /* renamed from: i, reason: collision with root package name */
    public w f69451i;

    /* renamed from: j, reason: collision with root package name */
    public w f69452j;

    /* renamed from: k, reason: collision with root package name */
    public w f69453k;

    /* renamed from: l, reason: collision with root package name */
    public final ad.u f69454l;

    /* renamed from: m, reason: collision with root package name */
    public DateFormat f69455m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f69456n;

    public u0() {
        this.f69450h = f69444p;
        this.f69452j = bd.v.f9145e;
        this.f69453k = f69443o;
        this.f69445b = null;
        this.f69447e = null;
        this.f69448f = new zc.r();
        this.f69454l = null;
        this.f69446c = null;
        this.f69449g = null;
        this.f69456n = true;
    }

    public dd.k0 bufferForValueConversion(ub.a0 a0Var) {
        return new dd.k0(a0Var, false);
    }

    @Override // jc.h
    public final boolean canOverrideAccessModifiers() {
        return this.f69445b.canOverrideAccessModifiers();
    }

    @Override // jc.h
    public o constructSpecializedType(o oVar, Class<?> cls) throws IllegalArgumentException {
        return oVar.hasRawClass(cls) ? oVar : getConfig().getTypeFactory().constructSpecializedType(oVar, cls, true);
    }

    public final w d(Class cls) throws r {
        w wVarCreateSerializer;
        o oVarConstructType = this.f69445b.constructType((Class<?>) cls);
        try {
            wVarCreateSerializer = this.f69447e.createSerializer(this, oVarConstructType);
        } catch (IllegalArgumentException e10) {
            reportBadDefinition(oVarConstructType, dd.i.exceptionMessage(e10));
            wVarCreateSerializer = null;
        }
        if (wVarCreateSerializer != null) {
            this.f69448f.addAndResolveNonTypedSerializer(cls, oVarConstructType, wVarCreateSerializer, this);
        }
        return wVarCreateSerializer;
    }

    public void defaultSerializeDateKey(long j10, ub.o oVar) throws IOException {
        if (isEnabled(t0.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            oVar.writeFieldName(String.valueOf(j10));
        } else {
            oVar.writeFieldName(f().format(new Date(j10)));
        }
    }

    public final void defaultSerializeDateValue(long j10, ub.o oVar) throws IOException {
        if (isEnabled(t0.WRITE_DATES_AS_TIMESTAMPS)) {
            oVar.writeNumber(j10);
        } else {
            oVar.writeString(f().format(new Date(j10)));
        }
    }

    public final void defaultSerializeField(String str, Object obj, ub.o oVar) throws IOException {
        oVar.writeFieldName(str);
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (g) null).serialize(obj, oVar, this);
        } else if (this.f69456n) {
            oVar.writeNull();
        } else {
            this.f69452j.serialize(null, oVar, this);
        }
    }

    public final void defaultSerializeNull(ub.o oVar) throws IOException {
        if (this.f69456n) {
            oVar.writeNull();
        } else {
            this.f69452j.serialize(null, oVar, this);
        }
    }

    public final void defaultSerializeValue(Object obj, ub.o oVar) throws IOException {
        if (obj != null) {
            findTypedValueSerializer(obj.getClass(), true, (g) null).serialize(obj, oVar, this);
        } else if (this.f69456n) {
            oVar.writeNull();
        } else {
            this.f69452j.serialize(null, oVar, this);
        }
    }

    public final w e(o oVar) throws r {
        w wVarCreateSerializer;
        try {
            wVarCreateSerializer = this.f69447e.createSerializer(this, oVar);
        } catch (IllegalArgumentException e10) {
            reportMappingProblem(e10, dd.i.exceptionMessage(e10), new Object[0]);
            wVarCreateSerializer = null;
        }
        if (wVarCreateSerializer != null) {
            this.f69448f.addAndResolveNonTypedSerializer(oVar, wVarCreateSerializer, this);
        }
        return wVarCreateSerializer;
    }

    public final DateFormat f() {
        DateFormat dateFormat = this.f69455m;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.f69445b.getDateFormat().clone();
        this.f69455m = dateFormat2;
        return dateFormat2;
    }

    public w findContentValueSerializer(o oVar, g gVar) throws r {
        w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(oVar);
        return (wVarUntypedValueSerializer == null && (wVarUntypedValueSerializer = this.f69448f.untypedValueSerializer(oVar)) == null && (wVarUntypedValueSerializer = e(oVar)) == null) ? getUnknownTypeSerializer(oVar.getRawClass()) : handleSecondaryContextualization(wVarUntypedValueSerializer, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w findKeySerializer(o oVar, g gVar) throws r {
        w wVarCreateKeySerializer = this.f69447e.createKeySerializer(this, oVar, this.f69451i);
        if (wVarCreateKeySerializer instanceof zc.q) {
            ((zc.q) wVarCreateKeySerializer).resolve(this);
        }
        return handleSecondaryContextualization(wVarCreateKeySerializer, gVar);
    }

    public w findNullKeySerializer(o oVar, g gVar) throws r {
        return this.f69453k;
    }

    public w findNullValueSerializer(g gVar) throws r {
        return this.f69452j;
    }

    public abstract ad.h0 findObjectId(Object obj, f1 f1Var);

    public w findPrimaryPropertySerializer(o oVar, g gVar) throws r {
        w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(oVar);
        return (wVarUntypedValueSerializer == null && (wVarUntypedValueSerializer = this.f69448f.untypedValueSerializer(oVar)) == null && (wVarUntypedValueSerializer = e(oVar)) == null) ? getUnknownTypeSerializer(oVar.getRawClass()) : handlePrimaryContextualization(wVarUntypedValueSerializer, gVar);
    }

    public wc.j findTypeSerializer(o oVar) throws r {
        return this.f69447e.createTypeSerializer(this.f69445b, oVar);
    }

    public w findTypedValueSerializer(Class<?> cls, boolean z10, g gVar) throws r {
        w wVarTypedValueSerializer = this.f69454l.typedValueSerializer(cls);
        if (wVarTypedValueSerializer != null) {
            return wVarTypedValueSerializer;
        }
        zc.r rVar = this.f69448f;
        w wVarTypedValueSerializer2 = rVar.typedValueSerializer(cls);
        if (wVarTypedValueSerializer2 != null) {
            return wVarTypedValueSerializer2;
        }
        w wVarFindValueSerializer = findValueSerializer(cls, gVar);
        s0 s0Var = this.f69445b;
        wc.j jVarCreateTypeSerializer = this.f69447e.createTypeSerializer(s0Var, s0Var.constructType(cls));
        if (jVarCreateTypeSerializer != null) {
            wVarFindValueSerializer = new ad.b0(jVarCreateTypeSerializer.forProperty(gVar), wVarFindValueSerializer);
        }
        if (z10) {
            rVar.addTypedSerializer(cls, wVarFindValueSerializer);
        }
        return wVarFindValueSerializer;
    }

    public w findValueSerializer(Class<?> cls, g gVar) throws r {
        w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(cls);
        if (wVarUntypedValueSerializer == null) {
            zc.r rVar = this.f69448f;
            w wVarUntypedValueSerializer2 = rVar.untypedValueSerializer(cls);
            if (wVarUntypedValueSerializer2 == null) {
                wVarUntypedValueSerializer = rVar.untypedValueSerializer(this.f69445b.constructType(cls));
                if (wVarUntypedValueSerializer == null && (wVarUntypedValueSerializer = d(cls)) == null) {
                    return getUnknownTypeSerializer(cls);
                }
            } else {
                wVarUntypedValueSerializer = wVarUntypedValueSerializer2;
            }
        }
        return handleSecondaryContextualization(wVarUntypedValueSerializer, gVar);
    }

    public void flushCachedSerializers() {
        this.f69448f.flush();
    }

    public final void g(Object obj, o oVar) throws r {
        if (oVar.isPrimitive() && dd.i.wrapperType(oVar.getRawClass()).isAssignableFrom(obj.getClass())) {
            return;
        }
        reportBadDefinition(oVar, String.format("Incompatible types: declared root type (%s) vs %s", oVar, dd.i.classNameOf(obj)));
    }

    @Override // jc.h
    public final Class<?> getActiveView() {
        return this.f69446c;
    }

    @Override // jc.h
    public final c getAnnotationIntrospector() {
        return this.f69445b.getAnnotationIntrospector();
    }

    @Override // jc.h
    public Object getAttribute(Object obj) {
        return this.f69449g.getAttribute(obj);
    }

    @Override // jc.h
    public final lc.q getDatatypeFeatures() {
        return this.f69445b.getDatatypeFeatures();
    }

    public w getDefaultNullKeySerializer() {
        return this.f69453k;
    }

    public w getDefaultNullValueSerializer() {
        return this.f69452j;
    }

    @Override // jc.h
    public final tb.t getDefaultPropertyFormat(Class<?> cls) {
        return this.f69445b.getDefaultPropertyFormat(cls);
    }

    public final tb.d0 getDefaultPropertyInclusion(Class<?> cls) {
        return this.f69445b.getDefaultPropertyInclusion(cls);
    }

    public final zc.m getFilterProvider() {
        return this.f69445b.getFilterProvider();
    }

    public ub.o getGenerator() {
        return null;
    }

    @Override // jc.h
    public Locale getLocale() {
        return this.f69445b.getLocale();
    }

    @Override // jc.h
    public TimeZone getTimeZone() {
        return this.f69445b.getTimeZone();
    }

    @Override // jc.h
    public final cd.s getTypeFactory() {
        return this.f69445b.getTypeFactory();
    }

    public w getUnknownTypeSerializer(Class<?> cls) {
        return cls == Object.class ? this.f69450h : new ad.c0(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w handlePrimaryContextualization(w wVar, g gVar) throws r {
        return (wVar == 0 || !(wVar instanceof zc.j)) ? wVar : ((zc.j) wVar).createContextual(this, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w handleSecondaryContextualization(w wVar, g gVar) throws r {
        return (wVar == 0 || !(wVar instanceof zc.j)) ? wVar : ((zc.j) wVar).createContextual(this, gVar);
    }

    public final boolean hasSerializationFeatures(int i10) {
        return this.f69445b.hasSerializationFeatures(i10);
    }

    public abstract Object includeFilterInstance(rc.d0 d0Var, Class<?> cls) throws r;

    public abstract boolean includeFilterSuppressNulls(Object obj) throws r;

    @Override // jc.h
    public r invalidTypeIdException(o oVar, String str, String str2) {
        return pc.e.from(null, h.a("Could not resolve type id '" + str + "' as a subtype of " + dd.i.getTypeDescription(oVar), str2), oVar, str);
    }

    @Override // jc.h
    public final boolean isEnabled(y yVar) {
        return this.f69445b.isEnabled(yVar);
    }

    public boolean isUnknownTypeSerializer(w wVar) {
        if (wVar == this.f69450h || wVar == null) {
            return true;
        }
        return isEnabled(t0.FAIL_ON_EMPTY_BEANS) && wVar.getClass() == ad.c0.class;
    }

    @Deprecated
    public r mappingException(String str, Object... objArr) {
        return r.from(getGenerator(), h.b(str, objArr));
    }

    @Override // jc.h
    public <T> T reportBadDefinition(o oVar, String str) throws r {
        throw pc.b.from(getGenerator(), str, oVar);
    }

    public <T> T reportBadPropertyDefinition(d dVar, rc.d0 d0Var, String str, Object... objArr) throws r {
        String strB = h.b(str, objArr);
        StringBuilder sbB = b3.h.b("Invalid definition for property ", d0Var != null ? h.c(d0Var.getName()) : "N/A", " (of type ", dVar != null ? dd.i.nameOf(dVar.getBeanClass()) : "N/A", "): ");
        sbB.append(strB);
        throw pc.b.from(getGenerator(), sbB.toString(), dVar, d0Var);
    }

    @Override // jc.h
    public <T> T reportBadTypeDefinition(d dVar, String str, Object... objArr) throws r {
        throw pc.b.from(getGenerator(), a.b.m("Invalid type definition for type ", dVar == null ? "N/A" : dd.i.nameOf(dVar.getBeanClass()), ": ", h.b(str, objArr)), dVar, (rc.d0) null);
    }

    public void reportMappingProblem(String str, Object... objArr) throws r {
        throw mappingException(str, objArr);
    }

    public abstract w serializerInstance(rc.b bVar, Object obj) throws r;

    public void setDefaultKeySerializer(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this.f69451i = wVar;
    }

    public void setNullKeySerializer(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this.f69453k = wVar;
    }

    public void setNullValueSerializer(w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("Cannot pass null JsonSerializer");
        }
        this.f69452j = wVar;
    }

    public final dd.k0 bufferForValueConversion() {
        return bufferForValueConversion(null);
    }

    @Override // jc.h
    public final s0 getConfig() {
        return this.f69445b;
    }

    @Override // jc.h
    public final boolean isEnabled(lc.o oVar) {
        return this.f69445b.isEnabled(oVar);
    }

    public <T> T reportBadDefinition(o oVar, String str, Throwable th2) throws r {
        throw pc.b.from(getGenerator(), str, oVar).withCause(th2);
    }

    public void reportMappingProblem(Throwable th2, String str, Object... objArr) throws r {
        throw r.from(getGenerator(), h.b(str, objArr), th2);
    }

    @Override // jc.h
    public u0 setAttribute(Object obj, Object obj2) {
        this.f69449g = this.f69449g.withPerCallAttribute(obj, obj2);
        return this;
    }

    public final boolean isEnabled(t0 t0Var) {
        return this.f69445b.isEnabled(t0Var);
    }

    public void defaultSerializeDateKey(Date date, ub.o oVar) throws IOException {
        if (isEnabled(t0.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            oVar.writeFieldName(String.valueOf(date.getTime()));
        } else {
            oVar.writeFieldName(f().format(date));
        }
    }

    public final void defaultSerializeDateValue(Date date, ub.o oVar) throws IOException {
        if (isEnabled(t0.WRITE_DATES_AS_TIMESTAMPS)) {
            oVar.writeNumber(date.getTime());
        } else {
            oVar.writeString(f().format(date));
        }
    }

    public <T> T reportBadDefinition(Class<?> cls, String str, Throwable th2) throws r {
        throw pc.b.from(getGenerator(), str, constructType(cls)).withCause(th2);
    }

    public w findKeySerializer(Class<?> cls, g gVar) throws r {
        return findKeySerializer(this.f69445b.constructType(cls), gVar);
    }

    public w findContentValueSerializer(Class<?> cls, g gVar) throws r {
        w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(cls);
        if (wVarUntypedValueSerializer == null) {
            zc.r rVar = this.f69448f;
            w wVarUntypedValueSerializer2 = rVar.untypedValueSerializer(cls);
            if (wVarUntypedValueSerializer2 == null) {
                wVarUntypedValueSerializer = rVar.untypedValueSerializer(this.f69445b.constructType(cls));
                if (wVarUntypedValueSerializer == null && (wVarUntypedValueSerializer = d(cls)) == null) {
                    return getUnknownTypeSerializer(cls);
                }
            } else {
                wVarUntypedValueSerializer = wVarUntypedValueSerializer2;
            }
        }
        return handleSecondaryContextualization(wVarUntypedValueSerializer, gVar);
    }

    public w findPrimaryPropertySerializer(Class<?> cls, g gVar) throws r {
        w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(cls);
        if (wVarUntypedValueSerializer == null) {
            zc.r rVar = this.f69448f;
            w wVarUntypedValueSerializer2 = rVar.untypedValueSerializer(cls);
            if (wVarUntypedValueSerializer2 == null) {
                wVarUntypedValueSerializer = rVar.untypedValueSerializer(this.f69445b.constructType(cls));
                if (wVarUntypedValueSerializer == null && (wVarUntypedValueSerializer = d(cls)) == null) {
                    return getUnknownTypeSerializer(cls);
                }
            } else {
                wVarUntypedValueSerializer = wVarUntypedValueSerializer2;
            }
        }
        return handlePrimaryContextualization(wVarUntypedValueSerializer, gVar);
    }

    public w findValueSerializer(o oVar, g gVar) throws r {
        if (oVar == null) {
            reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        }
        w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(oVar);
        if (wVarUntypedValueSerializer == null && (wVarUntypedValueSerializer = this.f69448f.untypedValueSerializer(oVar)) == null && (wVarUntypedValueSerializer = e(oVar)) == null) {
            return getUnknownTypeSerializer(oVar.getRawClass());
        }
        return handleSecondaryContextualization(wVarUntypedValueSerializer, gVar);
    }

    public w findTypedValueSerializer(o oVar, boolean z10, g gVar) throws r {
        w wVarTypedValueSerializer = this.f69454l.typedValueSerializer(oVar);
        if (wVarTypedValueSerializer != null) {
            return wVarTypedValueSerializer;
        }
        zc.r rVar = this.f69448f;
        w wVarTypedValueSerializer2 = rVar.typedValueSerializer(oVar);
        if (wVarTypedValueSerializer2 != null) {
            return wVarTypedValueSerializer2;
        }
        w wVarFindValueSerializer = findValueSerializer(oVar, gVar);
        wc.j jVarCreateTypeSerializer = this.f69447e.createTypeSerializer(this.f69445b, oVar);
        if (jVarCreateTypeSerializer != null) {
            wVarFindValueSerializer = new ad.b0(jVarCreateTypeSerializer.forProperty(gVar), wVarFindValueSerializer);
        }
        if (z10) {
            rVar.addTypedSerializer(oVar, wVarFindValueSerializer);
        }
        return wVarFindValueSerializer;
    }

    public u0(zc.k kVar, s0 s0Var, zc.s sVar) {
        this.f69450h = f69444p;
        this.f69452j = bd.v.f9145e;
        ad.c cVar = f69443o;
        this.f69453k = cVar;
        this.f69447e = sVar;
        this.f69445b = s0Var;
        zc.r rVar = kVar.f69448f;
        this.f69448f = rVar;
        this.f69450h = kVar.f69450h;
        this.f69451i = kVar.f69451i;
        w wVar = kVar.f69452j;
        this.f69452j = wVar;
        this.f69453k = kVar.f69453k;
        this.f69456n = wVar == cVar;
        this.f69446c = s0Var.getActiveView();
        this.f69449g = s0Var.getAttributes();
        this.f69454l = rVar.getReadOnlyLookupMap();
    }

    public w findValueSerializer(Class<?> cls) throws r {
        w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(cls);
        if (wVarUntypedValueSerializer != null) {
            return wVarUntypedValueSerializer;
        }
        zc.r rVar = this.f69448f;
        w wVarUntypedValueSerializer2 = rVar.untypedValueSerializer(cls);
        if (wVarUntypedValueSerializer2 != null) {
            return wVarUntypedValueSerializer2;
        }
        w wVarUntypedValueSerializer3 = rVar.untypedValueSerializer(this.f69445b.constructType(cls));
        return (wVarUntypedValueSerializer3 == null && (wVarUntypedValueSerializer3 = d(cls)) == null) ? getUnknownTypeSerializer(cls) : wVarUntypedValueSerializer3;
    }

    public w findValueSerializer(o oVar) throws r {
        w wVarUntypedValueSerializer = this.f69454l.untypedValueSerializer(oVar);
        return (wVarUntypedValueSerializer == null && (wVarUntypedValueSerializer = this.f69448f.untypedValueSerializer(oVar)) == null && (wVarUntypedValueSerializer = e(oVar)) == null) ? getUnknownTypeSerializer(oVar.getRawClass()) : wVarUntypedValueSerializer;
    }

    public u0(zc.k kVar) {
        this.f69450h = f69444p;
        this.f69452j = bd.v.f9145e;
        this.f69453k = f69443o;
        this.f69445b = null;
        this.f69446c = null;
        this.f69447e = null;
        this.f69454l = null;
        this.f69448f = new zc.r();
        this.f69450h = kVar.f69450h;
        this.f69451i = kVar.f69451i;
        this.f69452j = kVar.f69452j;
        this.f69453k = kVar.f69453k;
        this.f69456n = kVar.f69456n;
    }

    public u0(zc.k kVar, zc.r rVar) {
        this.f69450h = f69444p;
        this.f69452j = bd.v.f9145e;
        this.f69453k = f69443o;
        this.f69448f = rVar;
        this.f69445b = kVar.f69445b;
        this.f69446c = kVar.f69446c;
        this.f69447e = kVar.f69447e;
        this.f69449g = kVar.f69449g;
        this.f69454l = kVar.f69454l;
        this.f69450h = kVar.f69450h;
        this.f69452j = kVar.f69452j;
        this.f69453k = kVar.f69453k;
        this.f69451i = kVar.f69451i;
        this.f69456n = kVar.f69456n;
    }
}
