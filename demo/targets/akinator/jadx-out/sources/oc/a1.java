package oc;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a1 implements mc.u, Serializable {
    public static y0 a(jc.j jVar, rc.l lVar) {
        if (lVar instanceof rc.g) {
            Constructor<?> annotated = ((rc.g) lVar).getAnnotated();
            if (jVar.canOverrideAccessModifiers()) {
                dd.i.checkAndFixAccess(annotated, jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new v0(annotated);
        }
        Method annotated2 = ((rc.m) lVar).getAnnotated();
        if (jVar.canOverrideAccessModifiers()) {
            dd.i.checkAndFixAccess(annotated2, jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new w0(annotated2);
    }

    public static jc.x constructDelegatingKeyDeserializer(jc.j jVar, jc.o oVar, jc.q qVar) {
        return new t0(oVar.getRawClass(), qVar);
    }

    public static jc.x constructEnumKeyDeserializer(dd.n nVar) {
        return new u0(nVar, null);
    }

    public static jc.x findStringBasedKeyDeserializer(jc.j jVar, jc.o oVar) throws jc.r {
        rc.c next;
        jc.d dVarIntrospectForCreation = jVar.introspectForCreation(oVar);
        Iterator<rc.c> it = dVarIntrospectForCreation.getConstructorsWithMode().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            rc.g gVar = (rc.g) next.f84134a;
            if (gVar.getParameterCount() == 1 && String.class == gVar.getRawParameterType(0)) {
                break;
            }
        }
        if (next != null && next.f84135b != null) {
            return a(jVar, (rc.l) next.f84134a);
        }
        List<rc.c> factoryMethodsWithMode = dVarIntrospectForCreation.getFactoryMethodsWithMode();
        factoryMethodsWithMode.removeIf(new z0(0));
        rc.m mVar = null;
        for (rc.c cVar : factoryMethodsWithMode) {
            Object obj = cVar.f84135b;
            rc.b bVar = cVar.f84134a;
            if (obj != null) {
                if (mVar != null) {
                    throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + dd.i.nameOf(((rc.m) bVar).getDeclaringClass()));
                }
                mVar = (rc.m) bVar;
            }
        }
        if (mVar != null) {
            return a(jVar, mVar);
        }
        if (next != null) {
            return a(jVar, (rc.l) next.f84134a);
        }
        if (factoryMethodsWithMode.isEmpty()) {
            return null;
        }
        return a(jVar, (rc.l) factoryMethodsWithMode.get(0).f84134a);
    }

    @Override // mc.u
    public jc.x findKeyDeserializer(jc.o oVar, jc.j jVar, jc.d dVar) throws jc.r {
        Class<?> rawClass = oVar.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = dd.i.wrapperType(rawClass);
        }
        return y0.forType(rawClass);
    }

    public static jc.x constructEnumKeyDeserializer(dd.n nVar, rc.m mVar) {
        return new u0(nVar, mVar);
    }

    public static jc.x constructEnumKeyDeserializer(dd.n nVar, dd.n nVar2, dd.n nVar3, dd.n nVar4) {
        return new u0(nVar, null, nVar2, nVar3, nVar4);
    }

    public static jc.x constructEnumKeyDeserializer(dd.n nVar, rc.m mVar, dd.n nVar2, dd.n nVar3, dd.n nVar4) {
        return new u0(nVar, mVar, nVar2, nVar3, nVar4);
    }
}
