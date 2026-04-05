package oc;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o extends s0 implements mc.k {

    /* renamed from: f, reason: collision with root package name */
    public final jc.o f78919f;

    /* renamed from: g, reason: collision with root package name */
    public final jc.q f78920g;

    /* renamed from: h, reason: collision with root package name */
    public final mc.v f78921h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f78922i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f78923j;

    public o(jc.o oVar, jc.q qVar) {
        super(EnumSet.class);
        this.f78919f = oVar;
        if (!oVar.isEnumType()) {
            throw new IllegalArgumentException("Type " + oVar + " not Java Enum type");
        }
        this.f78920g = qVar;
        this.f78923j = null;
        this.f78921h = null;
        this.f78922i = false;
    }

    public final void V(ub.u uVar, jc.k kVar, EnumSet enumSet) throws jc.r {
        Enum r02;
        while (true) {
            try {
                ub.z zVarNextToken = uVar.nextToken();
                if (zVarNextToken == ub.z.END_ARRAY) {
                    return;
                }
                if (zVarNextToken != ub.z.VALUE_NULL) {
                    r02 = (Enum) this.f78920g.deserialize(uVar, kVar);
                } else if (!this.f78922i) {
                    r02 = (Enum) this.f78921h.getNullValue(kVar);
                }
                if (r02 != null) {
                    enumSet.add(r02);
                }
            } catch (Exception e10) {
                throw jc.r.wrapWithPath(e10, enumSet, enumSet.size());
            }
        }
    }

    public final EnumSet W(ub.u uVar, jc.k kVar, EnumSet enumSet) throws jc.r {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f78923j;
        if (bool2 != bool && (bool2 != null || !kVar.isEnabled(jc.l.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (EnumSet) kVar.handleUnexpectedToken(EnumSet.class, uVar);
        }
        if (uVar.hasToken(ub.z.VALUE_NULL)) {
            return (EnumSet) kVar.handleUnexpectedToken(this.f78919f, uVar);
        }
        try {
            Enum r32 = (Enum) this.f78920g.deserialize(uVar, kVar);
            if (r32 == null) {
                return enumSet;
            }
            enumSet.add(r32);
            return enumSet;
        } catch (Exception e10) {
            throw jc.r.wrapWithPath(e10, enumSet, enumSet.size());
        }
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        Boolean boolR = s0.R(kVar, gVar, EnumSet.class, tb.q.f86754b);
        jc.o oVar = this.f78919f;
        jc.q qVar = this.f78920g;
        jc.q qVarFindContextualValueDeserializer = qVar == null ? kVar.findContextualValueDeserializer(oVar, gVar) : kVar.handleSecondaryContextualization(qVar, gVar, oVar);
        return withResolved(qVarFindContextualValueDeserializer, s0.P(kVar, gVar, qVarFindContextualValueDeserializer), boolR);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromArray(uVar, kVar);
    }

    @Override // jc.q
    public dd.a getEmptyAccessPattern() {
        return dd.a.f51983e;
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return EnumSet.noneOf(this.f78919f.getRawClass());
    }

    @Override // jc.q
    public boolean isCachable() {
        return this.f78919f.getValueHandler() == null;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12140c;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.TRUE;
    }

    public o withDeserializer(jc.q qVar) {
        return this.f78920g == qVar ? this : new o(this, qVar, this.f78921h, this.f78923j);
    }

    public o withResolved(jc.q qVar, mc.v vVar, Boolean bool) {
        return (Objects.equals(this.f78923j, bool) && this.f78920g == qVar && this.f78921h == qVar) ? this : new o(this, qVar, vVar, bool);
    }

    @Override // jc.q
    public EnumSet<?> deserialize(ub.u uVar, jc.k kVar, EnumSet<?> enumSet) throws IOException {
        if (!uVar.isExpectedStartArrayToken()) {
            return W(uVar, kVar, enumSet);
        }
        V(uVar, kVar, enumSet);
        return enumSet;
    }

    @Override // jc.q
    public EnumSet<?> deserialize(ub.u uVar, jc.k kVar) throws IOException {
        EnumSet<?> enumSetNoneOf = EnumSet.noneOf(this.f78919f.getRawClass());
        if (!uVar.isExpectedStartArrayToken()) {
            return W(uVar, kVar, enumSetNoneOf);
        }
        V(uVar, kVar, enumSetNoneOf);
        return enumSetNoneOf;
    }

    @Deprecated
    public o(jc.o oVar, jc.q qVar, wc.g gVar) {
        this(oVar, qVar);
    }

    public o(o oVar, jc.q qVar, mc.v vVar, Boolean bool) {
        super(oVar);
        this.f78919f = oVar.f78919f;
        this.f78920g = qVar;
        this.f78921h = vVar;
        this.f78922i = nc.u.isSkipper(vVar);
        this.f78923j = bool;
    }
}
