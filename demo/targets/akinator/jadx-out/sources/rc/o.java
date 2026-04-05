package rc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o extends g0 {

    /* renamed from: d, reason: collision with root package name */
    public final e0 f84234d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84235e;

    public o(jc.c cVar, e0 e0Var, boolean z10) {
        super(cVar);
        this.f84234d = cVar == null ? null : e0Var;
        this.f84235e = z10;
    }

    public static p collectMethods(jc.c cVar, g1 g1Var, e0 e0Var, cd.s sVar, jc.o oVar, List<jc.o> list, Class<?> cls, boolean z10) {
        e0 e0Var2;
        Class<?> clsFindMixInClassFor;
        o oVar2 = new o(cVar, e0Var, z10);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        oVar2.e(g1Var, oVar.getRawClass(), linkedHashMap, cls);
        Iterator<jc.o> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Class<?> clsFindMixInClassFor2 = null;
            e0Var2 = oVar2.f84234d;
            if (!zHasNext) {
                break;
            }
            jc.o next = it.next();
            if (e0Var2 != null) {
                clsFindMixInClassFor2 = e0Var2.findMixInClassFor(next.getRawClass());
            }
            oVar2.e(new f1(sVar, next.getBindings()), next.getRawClass(), linkedHashMap, clsFindMixInClassFor2);
        }
        if (e0Var2 != null && (clsFindMixInClassFor = e0Var2.findMixInClassFor(Object.class)) != null) {
            oVar2.f(g1Var, oVar.getRawClass(), linkedHashMap, clsFindMixInClassFor);
            if (oVar2.f84190a != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    p0 p0Var = (p0) entry.getKey();
                    if ("hashCode".equals(p0Var.getName()) && p0Var.argCount() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(p0Var.getName(), null);
                            n nVar = (n) entry.getValue();
                            nVar.f84233c = oVar2.c(nVar.f84233c, declaredMethod.getDeclaredAnnotations());
                            nVar.f84232b = declaredMethod;
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new p();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            m mVarBuild = ((n) entry2.getValue()).build();
            if (mVarBuild != null) {
                linkedHashMap2.put(entry2.getKey(), mVarBuild);
            }
        }
        return new p(linkedHashMap2);
    }

    public static boolean g(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    public final void e(g1 g1Var, Class cls, LinkedHashMap linkedHashMap, Class cls2) throws SecurityException {
        if (cls2 != null) {
            f(g1Var, cls, linkedHashMap, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : dd.i.getClassMethods(cls)) {
            if (g(method)) {
                p0 p0Var = new p0(method);
                n nVar = (n) linkedHashMap.get(p0Var);
                if (nVar == null) {
                    linkedHashMap.put(p0Var, new n(g1Var, method, this.f84190a == null ? y.emptyCollector() : b(method.getDeclaredAnnotations())));
                } else {
                    if (this.f84235e) {
                        nVar.f84233c = c(nVar.f84233c, method.getDeclaredAnnotations());
                    }
                    Method method2 = nVar.f84232b;
                    if (method2 == null) {
                        nVar.f84232b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        nVar.f84232b = method;
                        nVar.f84231a = g1Var;
                    }
                }
            }
        }
    }

    public final void f(g1 g1Var, Class cls, LinkedHashMap linkedHashMap, Class cls2) throws SecurityException {
        if (this.f84190a == null) {
            return;
        }
        Iterator<Class<?>> it = dd.i.findRawSuperTypes(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : it.next().getDeclaredMethods()) {
                if (g(method)) {
                    p0 p0Var = new p0(method);
                    n nVar = (n) linkedHashMap.get(p0Var);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (nVar == null) {
                        linkedHashMap.put(p0Var, new n(g1Var, null, b(declaredAnnotations)));
                    } else {
                        nVar.f84233c = c(nVar.f84233c, declaredAnnotations);
                    }
                }
            }
        }
    }
}
