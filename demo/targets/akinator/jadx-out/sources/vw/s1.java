package vw;

import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f90083a;

    /* renamed from: b, reason: collision with root package name */
    public final v4 f90084b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f90085c;

    /* renamed from: d, reason: collision with root package name */
    public final xw.f f90086d;

    public s1(l0 l0Var, xw.f fVar, Class cls) {
        this.f90084b = l0Var.getSupport();
        this.f90085c = cls;
        this.f90083a = l0Var;
        this.f90086d = fVar;
    }

    public static boolean isCompatible(Class cls, Class cls2) {
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls.isAssignableFrom(cls2);
    }

    public static boolean isInstantiable(Class cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            return false;
        }
        return !Modifier.isInterface(r1);
    }

    public final xw.g a(yw.p pVar) throws Exception {
        xw.g conversion = getConversion(pVar);
        if (conversion != null) {
            yw.k0 position = pVar.getPosition();
            Class type = conversion.getType();
            if (!isCompatible(getType(), type)) {
                throw new c2("Incompatible %s for %s at %s", type, this.f90086d, position);
            }
        }
        return conversion;
    }

    public xw.g getConversion(yw.p pVar) throws Exception {
        Class cls;
        xw.g override = this.f90083a.getOverride(this.f90086d, pVar);
        return (override == null || (cls = this.f90085c) == null || isCompatible(cls, override.getType())) ? override : new h3(override, cls);
    }

    public Object getInstance() throws Exception {
        Class type = getType();
        if (isInstantiable(type)) {
            return type.newInstance();
        }
        throw new c2("Type %s can not be instantiated", type);
    }

    public Class getType() {
        Class cls = this.f90085c;
        return cls != null ? cls : this.f90086d.getType();
    }

    public boolean setOverride(xw.f fVar, Object obj, yw.h0 h0Var) throws Exception {
        Class primitive;
        Class type = fVar.getType();
        if (type.isPrimitive() && (primitive = v4.getPrimitive(type)) != type) {
            fVar = new g3(fVar, primitive);
        }
        return this.f90083a.setOverride(fVar, obj, h0Var);
    }
}
