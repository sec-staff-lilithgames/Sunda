package bd;

import j1.o2;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m extends y0 implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final dd.o f9097e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f9098f;

    /* renamed from: g, reason: collision with root package name */
    public final dd.o f9099g;

    /* renamed from: h, reason: collision with root package name */
    public final dd.o f9100h;

    @Deprecated
    public m(dd.o oVar, Boolean bool) {
        this(oVar, bool, null, null);
    }

    public static m construct(Class<?> cls, jc.s0 s0Var, jc.d dVar, tb.t tVar) {
        dd.o oVarConstructFromName = dd.o.constructFromName(s0Var, dVar.getClassInfo());
        Object objFindEnumNamingStrategy = s0Var.getAnnotationIntrospector().findEnumNamingStrategy(s0Var, dVar.getClassInfo());
        boolean zCanOverrideAccessModifiers = s0Var.canOverrideAccessModifiers();
        s0Var.getEnumNamingStrategy();
        rc.n0.createEnumNamingStrategyInstance(objFindEnumNamingStrategy, zCanOverrideAccessModifiers, null);
        return new m(oVarConstructFromName, e(cls, tVar, true, null), null, dd.o.constructFromToString(s0Var, dVar.getClassInfo()));
    }

    public static Boolean e(Class cls, tb.t tVar, boolean z10, Boolean bool) {
        tb.s shape = tVar == null ? null : tVar.getShape();
        if (shape == null || shape == tb.s.f86775k || shape == tb.s.f86772h) {
            return bool;
        }
        if (shape == tb.s.f86771g || shape == tb.s.f86776l) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == tb.s.f86773i) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        String str = z10 ? "class" : "property";
        StringBuilder sb2 = new StringBuilder("Unsupported serialization shape (");
        sb2.append(shape);
        sb2.append(") for Enum ");
        sb2.append(name);
        sb2.append(", not supported as ");
        throw new IllegalArgumentException(o2.o(sb2, str, " annotation"));
    }

    @Override // bd.y0, bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        jc.u0 provider = hVar.getProvider();
        Boolean bool = this.f9098f;
        if (bool != null ? bool.booleanValue() : provider.isEnabled(jc.t0.WRITE_ENUMS_USING_INDEX)) {
            hVar.expectIntegerFormat(oVar);
        } else {
            hVar.expectStringFormat(oVar);
        }
    }

    @Override // zc.j
    public jc.w createContextual(jc.u0 u0Var, jc.g gVar) throws jc.r {
        tb.t tVarC = z0.c(handledType(), u0Var, gVar);
        if (tVarC != null) {
            Class<Object> clsHandledType = handledType();
            Boolean bool = this.f9098f;
            Boolean boolE = e(clsHandledType, tVarC, false, bool);
            if (!Objects.equals(boolE, bool)) {
                return new m(this.f9097e, boolE, this.f9099g, this.f9100h);
            }
        }
        return this;
    }

    public dd.o getEnumValues() {
        return this.f9097e;
    }

    @Override // bd.y0, bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        Boolean bool = this.f9098f;
        if (bool != null ? bool.booleanValue() : u0Var.isEnabled(jc.t0.WRITE_ENUMS_USING_INDEX)) {
            return z0.a("integer");
        }
        yc.v vVarA = z0.a("string");
        if (type != null && u0Var.constructType(type).isEnumType()) {
            yc.a aVarPutArray = vVarA.putArray("enum");
            Iterator<ub.c0> it = this.f9097e.values().iterator();
            while (it.hasNext()) {
                aVarPutArray.add(it.next().getValue());
            }
        }
        return vVarA;
    }

    @Deprecated
    public m(dd.o oVar, Boolean bool, dd.o oVar2) {
        this(oVar, bool, oVar2, null);
    }

    @Override // bd.z0, jc.w
    public final void serialize(Enum<?> r22, ub.o oVar, jc.u0 u0Var) throws IOException {
        dd.o oVar2 = this.f9099g;
        if (oVar2 != null) {
            oVar.writeString(oVar2.serializedValueFor(r22));
            return;
        }
        Boolean bool = this.f9098f;
        if (bool != null ? bool.booleanValue() : u0Var.isEnabled(jc.t0.WRITE_ENUMS_USING_INDEX)) {
            oVar.writeNumber(r22.ordinal());
        } else if (u0Var.isEnabled(jc.t0.WRITE_ENUMS_USING_TO_STRING)) {
            oVar.writeString(this.f9100h.serializedValueFor(r22));
        } else {
            oVar.writeString(this.f9097e.serializedValueFor(r22));
        }
    }

    public m(dd.o oVar, Boolean bool, dd.o oVar2, dd.o oVar3) {
        super(oVar.getEnumClass());
        this.f9097e = oVar;
        this.f9098f = bool;
        this.f9099g = oVar2;
        this.f9100h = oVar3;
    }
}
