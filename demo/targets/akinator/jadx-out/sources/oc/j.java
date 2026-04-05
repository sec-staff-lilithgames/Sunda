package oc;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j extends s0 {

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f78873f;

    /* renamed from: g, reason: collision with root package name */
    public final mc.v f78874g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f78875h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f78876i;

    public j(jc.o oVar, mc.v vVar, Boolean bool) {
        super(oVar);
        this.f78873f = oVar;
        this.f78876i = bool;
        this.f78874g = vVar;
        this.f78875h = nc.u.isSkipper(vVar);
    }

    public static void V(jc.k kVar, Exception exc, Object obj, String str) throws IOException {
        Exception cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        dd.i.throwIfError(cause);
        if (kVar != null && !kVar.isEnabled(jc.l.WRAP_EXCEPTIONS)) {
            dd.i.throwIfRTE(cause);
        }
        if ((cause instanceof IOException) && !(cause instanceof jc.r)) {
            throw ((IOException) cause);
        }
        throw jc.r.wrapWithPath(cause, obj, (String) dd.i.nonNull(str, "N/A"));
    }

    @Override // jc.q
    public mc.z findBackReference(String str) {
        jc.q contentDeserializer = getContentDeserializer();
        if (contentDeserializer != null) {
            return contentDeserializer.findBackReference(str);
        }
        throw new IllegalArgumentException(e3.g.l("Cannot handle managed/back reference '", str, "': type: container deserializer of type ", getClass().getName(), " returned null for 'getContentDeserializer()'"));
    }

    public abstract jc.q getContentDeserializer();

    public jc.o getContentType() {
        jc.o oVar = this.f78873f;
        return oVar == null ? cd.s.unknownType() : oVar.getContentType();
    }

    @Override // jc.q
    public dd.a getEmptyAccessPattern() {
        return dd.a.f51983e;
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        mc.c0 valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDefault()) {
            jc.o valueType = getValueType();
            kVar.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
        }
        try {
            return valueInstantiator.createUsingDefault(kVar);
        } catch (IOException e10) {
            return dd.i.throwAsMappingException(kVar, e10);
        }
    }

    @Override // oc.s0
    public jc.o getValueType() {
        return this.f78873f;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.TRUE;
    }

    public j(j jVar, mc.v vVar, Boolean bool) {
        super(jVar.f78873f);
        this.f78873f = jVar.f78873f;
        this.f78874g = vVar;
        this.f78876i = bool;
        this.f78875h = nc.u.isSkipper(vVar);
    }
}
