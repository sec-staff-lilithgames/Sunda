package rc;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final dd.b f84173h = y.emptyAnnotations();

    /* renamed from: i, reason: collision with root package name */
    public static final Class f84174i = Object.class;

    /* renamed from: j, reason: collision with root package name */
    public static final Class f84175j = Enum.class;

    /* renamed from: k, reason: collision with root package name */
    public static final Class f84176k = List.class;

    /* renamed from: l, reason: collision with root package name */
    public static final Class f84177l = Map.class;

    /* renamed from: a, reason: collision with root package name */
    public final lc.z f84178a;

    /* renamed from: b, reason: collision with root package name */
    public final jc.c f84179b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f84180c;

    /* renamed from: d, reason: collision with root package name */
    public final cd.r f84181d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f84182e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f84183f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f84184g;

    public f(lc.z zVar, jc.o oVar, e0 e0Var) {
        this.f84178a = zVar;
        Class<?> rawClass = oVar.getRawClass();
        this.f84182e = rawClass;
        this.f84180c = e0Var;
        this.f84181d = oVar.getBindings();
        jc.c annotationIntrospector = zVar.isAnnotationProcessingEnabled() ? zVar.getAnnotationIntrospector() : null;
        this.f84179b = annotationIntrospector;
        this.f84183f = e0Var != null ? e0Var.findMixInClassFor(rawClass) : null;
        this.f84184g = (annotationIntrospector == null || dd.i.isJDKClass(rawClass)) ? false : true;
    }

    public static void d(jc.o oVar, ArrayList arrayList, boolean z10) {
        Class<?> rawClass = oVar.getRawClass();
        if (z10) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((jc.o) arrayList.get(i10)).getRawClass() == rawClass) {
                    return;
                }
            }
            arrayList.add(oVar);
            if (rawClass == f84176k || rawClass == f84177l) {
                return;
            }
        }
        Iterator<jc.o> it = oVar.getInterfaces().iterator();
        while (it.hasNext()) {
            d(it.next(), arrayList, true);
        }
    }

    public static void e(jc.o oVar, ArrayList arrayList, boolean z10) {
        Class<?> rawClass = oVar.getRawClass();
        if (rawClass == f84174i || rawClass == f84175j) {
            return;
        }
        if (z10) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((jc.o) arrayList.get(i10)).getRawClass() == rawClass) {
                    return;
                }
            }
            arrayList.add(oVar);
        }
        Iterator<jc.o> it = oVar.getInterfaces().iterator();
        while (it.hasNext()) {
            d(it.next(), arrayList, true);
        }
        jc.o superClass = oVar.getSuperClass();
        if (superClass != null) {
            e(superClass, arrayList, true);
        }
    }

    public static e resolve(lc.z zVar, jc.o oVar, e0 e0Var) {
        if (oVar.isArrayType()) {
            Class<?> rawClass = oVar.getRawClass();
            if (zVar == null || zVar.findMixInClassFor(rawClass) == null) {
                return new e(oVar.getRawClass());
            }
        }
        f fVar = new f(zVar, oVar, e0Var);
        ArrayList arrayList = new ArrayList(8);
        if (!oVar.hasRawClass(Object.class)) {
            if (oVar.isInterface()) {
                d(oVar, arrayList, false);
            } else {
                e(oVar, arrayList, false);
            }
        }
        return new e(oVar, fVar.f84182e, arrayList, fVar.f84183f, fVar.f(arrayList), fVar.f84181d, fVar.f84179b, fVar.f84180c, zVar.getTypeFactory(), fVar.f84184g);
    }

    public static e resolveWithoutSuperTypes(lc.z zVar, Class<?> cls) {
        return resolveWithoutSuperTypes(zVar, cls, zVar);
    }

    public final y a(y yVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!yVar.isPresent(annotation)) {
                    yVar = yVar.addOrOverride(annotation);
                    if (this.f84179b.isAnnotationBundle(annotation)) {
                        yVar = c(yVar, annotation);
                    }
                }
            }
        }
        return yVar;
    }

    public final y b(y yVar, Class cls, Class cls2) {
        if (cls2 != null) {
            yVar = a(yVar, dd.i.findClassAnnotations(cls2));
            Iterator<Class<?>> it = dd.i.findSuperClasses(cls2, cls, false).iterator();
            while (it.hasNext()) {
                yVar = a(yVar, dd.i.findClassAnnotations(it.next()));
            }
        }
        return yVar;
    }

    public final y c(y yVar, Annotation annotation) {
        for (Annotation annotation2 : dd.i.findClassAnnotations(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !yVar.isPresent(annotation2)) {
                yVar = yVar.addOrOverride(annotation2);
                if (this.f84179b.isAnnotationBundle(annotation2)) {
                    yVar = c(yVar, annotation2);
                }
            }
        }
        return yVar;
    }

    public final dd.b f(List list) {
        jc.c cVar = this.f84179b;
        dd.b bVar = f84173h;
        if (cVar == null) {
            return bVar;
        }
        e0 e0Var = this.f84180c;
        boolean z10 = e0Var != null && (!(e0Var instanceof e1) || ((e1) e0Var).hasMixIns());
        boolean z11 = this.f84184g;
        if (!z10 && !z11) {
            return bVar;
        }
        y yVarEmptyCollector = y.emptyCollector();
        Class cls = this.f84182e;
        Class cls2 = this.f84183f;
        if (cls2 != null) {
            yVarEmptyCollector = b(yVarEmptyCollector, cls, cls2);
        }
        if (z11) {
            yVarEmptyCollector = a(yVarEmptyCollector, dd.i.findClassAnnotations(cls));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jc.o oVar = (jc.o) it.next();
            if (z10) {
                Class<?> rawClass = oVar.getRawClass();
                yVarEmptyCollector = b(yVarEmptyCollector, rawClass, e0Var.findMixInClassFor(rawClass));
            }
            if (z11) {
                yVarEmptyCollector = a(yVarEmptyCollector, dd.i.findClassAnnotations(oVar.getRawClass()));
            }
        }
        if (z10) {
            yVarEmptyCollector = b(yVarEmptyCollector, Object.class, e0Var.findMixInClassFor(Object.class));
        }
        return yVarEmptyCollector.asAnnotations();
    }

    public final e g() {
        List list = Collections.EMPTY_LIST;
        return new e(null, this.f84182e, list, this.f84183f, f(list), this.f84181d, this.f84179b, this.f84180c, this.f84178a.getTypeFactory(), this.f84184g);
    }

    public static e resolveWithoutSuperTypes(lc.z zVar, jc.o oVar, e0 e0Var) {
        if (oVar.isArrayType()) {
            Class<?> rawClass = oVar.getRawClass();
            if (zVar == null || zVar.findMixInClassFor(rawClass) == null) {
                return new e(oVar.getRawClass());
            }
        }
        return new f(zVar, oVar, e0Var).g();
    }

    public static e resolveWithoutSuperTypes(lc.z zVar, Class<?> cls, e0 e0Var) {
        if (cls.isArray() && (zVar == null || zVar.findMixInClassFor(cls) == null)) {
            return new e(cls);
        }
        return new f(zVar, cls, e0Var).g();
    }

    public f(lc.z zVar, Class cls, e0 e0Var) {
        this.f84178a = zVar;
        this.f84182e = cls;
        this.f84180c = e0Var;
        this.f84181d = cd.r.emptyBindings();
        if (zVar == null) {
            this.f84179b = null;
            this.f84183f = null;
        } else {
            this.f84179b = zVar.isAnnotationProcessingEnabled() ? zVar.getAnnotationIntrospector() : null;
            this.f84183f = e0Var != null ? e0Var.findMixInClassFor(cls) : null;
        }
        this.f84184g = (this.f84179b == null || dd.i.isJDKClass(cls)) ? false : true;
    }
}
