package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v2 extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final t2 f90156b;

    /* renamed from: c, reason: collision with root package name */
    public final u2 f90157c;

    /* renamed from: e, reason: collision with root package name */
    public final u2 f90158e;

    public v2(t0 t0Var, v4 v4Var) throws Exception {
        String name;
        String name2;
        String name3;
        String name4;
        String name5;
        String name6;
        t2 t2Var = new t2(t0Var, v4Var);
        this.f90156b = t2Var;
        u2 u2Var = new u2();
        this.f90157c = u2Var;
        u2 u2Var2 = new u2();
        this.f90158e = u2Var2;
        uw.c override = t0Var.getOverride();
        uw.c access = t0Var.getAccess();
        Class cls = t0Var.getSuper();
        if (cls != null) {
            Iterator<E> it = v4Var.getMethods(cls, override).iterator();
            while (it.hasNext()) {
                o2 o2Var = (o2) ((i0) it.next());
                s2 read = o2Var.getRead();
                s2 write = o2Var.getWrite();
                if (write != null) {
                    String name7 = write.getName();
                    s2 s2Var = (s2) u2Var.remove(name7);
                    if (s2Var != null && (write.getAnnotation() instanceof uw.q)) {
                        write = s2Var;
                    }
                    u2Var.put(name7, write);
                }
                String name8 = read.getName();
                s2 s2Var2 = (s2) u2Var2.remove(name8);
                if (s2Var2 != null && (read.getAnnotation() instanceof uw.q)) {
                    read = s2Var2;
                }
                u2Var2.put(name8, read);
            }
        }
        List<p2> methods = t0Var.getMethods();
        uw.c cVar = uw.c.f88807c;
        w2 w2Var = w2.SET;
        w2 w2Var2 = w2.IS;
        w2 w2Var3 = w2.GET;
        if (access == cVar) {
            for (p2 p2Var : methods) {
                Annotation[] annotations = p2Var.getAnnotations();
                Method method = p2Var.getMethod();
                if (t2Var.getType(method) != null) {
                    s2 t2Var2 = t2Var.getInstance(method, annotations);
                    w2 methodType = t2Var2.getMethodType();
                    if (methodType == w2Var3 && (name6 = t2Var2.getName()) != null) {
                        u2Var2.put(name6, t2Var2);
                    }
                    if (methodType == w2Var2 && (name5 = t2Var2.getName()) != null) {
                        u2Var2.put(name5, t2Var2);
                    }
                    if (methodType == w2Var && (name4 = t2Var2.getName()) != null) {
                        u2Var.put(name4, t2Var2);
                    }
                }
            }
        }
        for (p2 p2Var2 : t0Var.getMethods()) {
            Annotation[] annotations2 = p2Var2.getAnnotations();
            Method method2 = p2Var2.getMethod();
            for (Annotation annotation : annotations2) {
                if (annotation instanceof uw.a) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.j) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.g) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.i) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.f) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.e) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.h) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.d) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.s) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.q) {
                    a(method2, annotation, annotations2);
                }
                if (annotation instanceof uw.r) {
                    s2 t2Var3 = t2Var.getInstance(method2, annotation, annotations2);
                    w2 methodType2 = t2Var3.getMethodType();
                    if (methodType2 == w2Var3 && (name3 = t2Var3.getName()) != null) {
                        u2Var2.remove(name3);
                    }
                    if (methodType2 == w2Var2 && (name2 = t2Var3.getName()) != null) {
                        u2Var2.remove(name2);
                    }
                    if (methodType2 == w2Var && (name = t2Var3.getName()) != null) {
                        u2Var.remove(name);
                    }
                }
            }
        }
        Iterator<String> it2 = u2Var2.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            s2 s2Var3 = (s2) u2Var2.get(next);
            if (s2Var3 != null) {
                s2 s2VarTake = u2Var.take(next);
                if (s2VarTake != null) {
                    Annotation annotation2 = s2Var3.getAnnotation();
                    String name9 = s2Var3.getName();
                    if (!s2VarTake.getAnnotation().equals(annotation2)) {
                        throw new q2("Annotations do not match for '%s' in %s", name9, t0Var);
                    }
                    Class type = s2Var3.getType();
                    if (type != s2VarTake.getType()) {
                        throw new q2("Method types do not match for %s in %s", name9, type);
                    }
                    add(new o2(s2Var3, s2VarTake));
                } else {
                    add(new o2(s2Var3));
                }
            }
        }
        Iterator<String> it3 = u2Var.iterator();
        while (it3.hasNext()) {
            String next2 = it3.next();
            s2 s2Var4 = (s2) u2Var.get(next2);
            if (s2Var4 != null) {
                s2 s2VarTake2 = u2Var2.take(next2);
                Method method3 = s2Var4.getMethod();
                if (s2VarTake2 == null) {
                    throw new q2("No matching get method for %s in %s", method3, t0Var);
                }
            }
        }
    }

    public final void a(Method method, Annotation annotation, Annotation[] annotationArr) throws Exception {
        String name;
        String name2;
        String name3;
        s2 t2Var = this.f90156b.getInstance(method, annotation, annotationArr);
        w2 methodType = t2Var.getMethodType();
        w2 w2Var = w2.GET;
        u2 u2Var = this.f90158e;
        if (methodType == w2Var && (name3 = t2Var.getName()) != null) {
            u2Var.put(name3, t2Var);
        }
        if (methodType == w2.IS && (name2 = t2Var.getName()) != null) {
            u2Var.put(name2, t2Var);
        }
        if (methodType != w2.SET || (name = t2Var.getName()) == null) {
            return;
        }
        this.f90157c.put(name, t2Var);
    }
}
