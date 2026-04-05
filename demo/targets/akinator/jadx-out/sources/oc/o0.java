package oc;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o0 extends s0 implements mc.k {

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f78924f;

    /* renamed from: g, reason: collision with root package name */
    public transient Object f78925g;

    /* renamed from: h, reason: collision with root package name */
    public final mc.v f78926h;

    public o0(Class cls) {
        super(cls);
        this.f78924f = null;
        this.f78926h = null;
    }

    public static jc.q forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return l0.f78883i;
        }
        if (cls == Long.TYPE) {
            return m0.f78902i;
        }
        if (cls == Byte.TYPE) {
            return new h0();
        }
        if (cls == Short.TYPE) {
            return new n0();
        }
        if (cls == Float.TYPE) {
            return new k0();
        }
        if (cls == Double.TYPE) {
            return new j0();
        }
        if (cls == Boolean.TYPE) {
            return new g0();
        }
        if (cls == Character.TYPE) {
            return new i0();
        }
        throw new IllegalArgumentException(a.b.i(cls, "Unknown primitive array element type: "));
    }

    public abstract Object V(Object obj, Object obj2);

    public abstract Object W();

    public final Object X(ub.u uVar, jc.k kVar) {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f78924f;
        boolean z10 = bool2 == bool || (bool2 == null && kVar.isEnabled(jc.l.ACCEPT_SINGLE_VALUE_AS_ARRAY));
        return (!uVar.hasToken(ub.z.VALUE_STRING) || (z10 && !s0.r(uVar.getText()))) ? z10 ? Y(uVar, kVar) : kVar.handleUnexpectedToken(this.f78945b, uVar) : p(uVar, kVar);
    }

    public abstract Object Y(ub.u uVar, jc.k kVar);

    public abstract o0 Z(mc.v vVar, Boolean bool);

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        tb.q qVar = tb.q.f86754b;
        Class cls = this.f78945b;
        Boolean boolR = s0.R(kVar, gVar, cls, qVar);
        tb.e1 contentNulls = gVar != null ? gVar.getMetadata().getContentNulls() : kVar.getConfig().getDefaultSetterInfo().getContentNulls();
        mc.v vVarSkipper = contentNulls == tb.e1.f86706b ? nc.u.skipper() : contentNulls == tb.e1.f86707c ? gVar == null ? nc.v.constructForRootValue(kVar.constructType(cls.getComponentType())) : nc.v.constructForProperty(gVar, gVar.getType().getContentType()) : null;
        return (Objects.equals(boolR, this.f78924f) && vVarSkipper == this.f78926h) ? this : Z(vVarSkipper, boolR);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        Object objDeserialize = deserialize(uVar, kVar);
        return (obj == null || Array.getLength(obj) == 0) ? objDeserialize : V(obj, objDeserialize);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromArray(uVar, kVar);
    }

    @Override // jc.q
    public dd.a getEmptyAccessPattern() {
        return dd.a.f51982c;
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        Object obj = this.f78925g;
        if (obj != null) {
            return obj;
        }
        Object objW = W();
        this.f78925g = objW;
        return objW;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12139b;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.TRUE;
    }

    public o0(o0 o0Var, mc.v vVar, Boolean bool) {
        super(o0Var.f78945b);
        this.f78924f = bool;
        this.f78926h = vVar;
    }
}
