package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v1 extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public final vw.a f90152b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f90153c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f90154a;

        /* renamed from: b, reason: collision with root package name */
        public final String f90155b;

        public a(Field field) {
            this.f90154a = field.getDeclaringClass();
            this.f90155b = field.getName();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.f90154a != this.f90154a) {
                return false;
            }
            return aVar.f90155b.equals(this.f90155b);
        }

        public int hashCode() {
            return this.f90155b.hashCode();
        }
    }

    public v1(t0 t0Var, v4 v4Var) throws Exception {
        j0 fields;
        this.f90152b = new vw.a(t0Var, v4Var);
        k0 k0Var = new k0();
        this.f90153c = k0Var;
        uw.c override = t0Var.getOverride();
        uw.c access = t0Var.getAccess();
        Class cls = t0Var.getSuper();
        if (cls != null && (fields = v4Var.getFields(cls, override)) != null) {
            addAll(fields);
        }
        List<u1> fields2 = t0Var.getFields();
        if (access == uw.c.f88806b) {
            for (u1 u1Var : fields2) {
                Annotation[] annotations = u1Var.getAnnotations();
                Field field = u1Var.getField();
                Class<?> type = field.getType();
                if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
                    Annotation aVar = this.f90152b.getInstance(type, b4.getDependents(field));
                    if (aVar != null) {
                        a(field, aVar, annotations);
                    }
                }
            }
        }
        for (u1 u1Var2 : t0Var.getFields()) {
            Annotation[] annotations2 = u1Var2.getAnnotations();
            Field field2 = u1Var2.getField();
            for (Annotation annotation : annotations2) {
                if (annotation instanceof uw.a) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.j) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.g) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.i) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.f) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.e) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.h) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.d) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.s) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.q) {
                    a(field2, annotation, annotations2);
                }
                if (annotation instanceof uw.r) {
                    k0Var.remove(new a(field2));
                }
            }
        }
        Iterator<i0> it = k0Var.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [vw.i0] */
    public final void a(Field field, Annotation annotation, Annotation[] annotationArr) throws SecurityException {
        t1 t1Var = new t1(field, annotation, annotationArr);
        a aVar = new a(field);
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        k0 k0Var = this.f90153c;
        ?? r52 = (i0) k0Var.remove(aVar);
        if (r52 != 0 && (t1Var.getAnnotation() instanceof uw.q)) {
            t1Var = r52;
        }
        k0Var.put(aVar, t1Var);
    }
}
