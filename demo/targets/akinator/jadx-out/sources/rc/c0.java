package rc;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c0 extends f0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f84136b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f84137c;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f84138e;

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f84139f;

    /* renamed from: g, reason: collision with root package name */
    public static final b0 f84140g;

    static {
        cd.n nVarConstructUnsafe = cd.n.constructUnsafe(String.class);
        dd.b bVar = f.f84173h;
        f84136b = b0.forOtherUse(null, nVarConstructUnsafe, new e(String.class));
        Class cls = Boolean.TYPE;
        f84137c = b0.forOtherUse(null, cd.n.constructUnsafe(cls), new e(cls));
        Class cls2 = Integer.TYPE;
        f84138e = b0.forOtherUse(null, cd.n.constructUnsafe(cls2), new e(cls2));
        Class cls3 = Long.TYPE;
        f84139f = b0.forOtherUse(null, cd.n.constructUnsafe(cls3), new e(cls3));
        f84140g = b0.forOtherUse(null, cd.n.constructUnsafe(Object.class), new e(Object.class));
    }

    public static b0 a(lc.a0 a0Var, jc.o oVar) {
        if (!oVar.isContainerType() || oVar.isArrayType()) {
            return null;
        }
        Class<?> rawClass = oVar.getRawClass();
        if (!dd.i.isJDKClass(rawClass)) {
            return null;
        }
        if ((Collection.class.isAssignableFrom(rawClass) || Map.class.isAssignableFrom(rawClass)) && rawClass.toString().indexOf(36) <= 0) {
            return b0.forOtherUse(a0Var, oVar, f.resolve(a0Var, oVar, a0Var));
        }
        return null;
    }

    public static b0 b(lc.z zVar, jc.o oVar) {
        Class<?> rawClass = oVar.getRawClass();
        if (rawClass.isPrimitive()) {
            if (rawClass != Integer.TYPE) {
                if (rawClass != Long.TYPE) {
                    if (rawClass != Boolean.TYPE) {
                        return null;
                    }
                    return f84137c;
                }
                return f84139f;
            }
            return f84138e;
        }
        if (!dd.i.isJDKClass(rawClass)) {
            if (!jc.t.class.isAssignableFrom(rawClass)) {
                return null;
            }
            dd.b bVar = f.f84173h;
            return b0.forOtherUse(zVar, oVar, new e(rawClass));
        }
        if (rawClass == Object.class) {
            return f84140g;
        }
        if (rawClass == String.class) {
            return f84136b;
        }
        if (rawClass != Integer.class) {
            if (rawClass != Long.class) {
                if (rawClass != Boolean.class) {
                    return null;
                }
                return f84137c;
            }
            return f84139f;
        }
        return f84138e;
    }

    public static u0 c(lc.a0 a0Var, jc.o oVar, e0 e0Var, boolean z10) {
        e eVarResolve = f.resolve(a0Var, oVar, e0Var);
        return new u0(a0Var, z10, oVar, eVarResolve, oVar.isRecordType() ? a0Var.getAccessorNaming().forRecord(a0Var, eVarResolve) : a0Var.getAccessorNaming().forPOJO(a0Var, eVarResolve));
    }

    @Override // rc.f0
    public f0 copy() {
        return new c0();
    }

    @Override // rc.f0
    public b0 forClassAnnotations(lc.z zVar, jc.o oVar, e0 e0Var) {
        b0 b0VarB = b(zVar, oVar);
        return b0VarB == null ? b0.forOtherUse(zVar, oVar, f.resolve(zVar, oVar, e0Var)) : b0VarB;
    }

    @Override // rc.f0
    public b0 forCreation(jc.j jVar, jc.o oVar, e0 e0Var) {
        b0 b0VarB = b(jVar, oVar);
        return (b0VarB == null && (b0VarB = a(jVar, oVar)) == null) ? b0.forDeserialization(c(jVar, oVar, e0Var, false)) : b0VarB;
    }

    @Override // rc.f0
    public b0 forDeserialization(jc.j jVar, jc.o oVar, e0 e0Var) {
        b0 b0VarB = b(jVar, oVar);
        return (b0VarB == null && (b0VarB = a(jVar, oVar)) == null) ? b0.forDeserialization(c(jVar, oVar, e0Var, false)) : b0VarB;
    }

    @Override // rc.f0
    public b0 forDeserializationWithBuilder(jc.j jVar, jc.o oVar, e0 e0Var, jc.d dVar) {
        e eVarResolve = f.resolve(jVar, oVar, e0Var);
        return b0.forDeserialization(new u0(jVar, false, oVar, eVarResolve, jVar.getAccessorNaming().forBuilder(jVar, eVarResolve, dVar)));
    }

    @Override // rc.f0
    public b0 forDirectClassAnnotations(lc.z zVar, jc.o oVar, e0 e0Var) {
        b0 b0VarB = b(zVar, oVar);
        return b0VarB == null ? b0.forOtherUse(zVar, oVar, f.resolveWithoutSuperTypes(zVar, oVar, e0Var)) : b0VarB;
    }

    @Override // rc.f0
    public b0 forSerialization(jc.s0 s0Var, jc.o oVar, e0 e0Var) {
        b0 b0VarB = b(s0Var, oVar);
        return (b0VarB == null && (b0VarB = a(s0Var, oVar)) == null) ? b0.forSerialization(c(s0Var, oVar, e0Var, true)) : b0VarB;
    }
}
