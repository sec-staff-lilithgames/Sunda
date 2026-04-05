package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.b f89924a = new ax.b();

    /* renamed from: b, reason: collision with root package name */
    public final yw.j f89925b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f89926a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f89927b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f89928c;

        public a(Class cls, Class cls2) {
            this(cls, cls2, null);
        }

        public Constructor getConstructor() throws Exception {
            Class cls = this.f89928c;
            Class cls2 = this.f89926a;
            Class cls3 = this.f89927b;
            return cls3 != null ? cls.getConstructor(i0.class, cls2, cls3, yw.j.class) : cls.getConstructor(i0.class, cls2, yw.j.class);
        }

        public a(Class cls, Class cls2, Class cls3) {
            this.f89927b = cls3;
            this.f89926a = cls2;
            this.f89928c = cls;
        }
    }

    public j2(yw.j jVar) {
        this.f89925b = jVar;
    }

    public final k2 a(i0 i0Var, Annotation annotation, l2 l2Var) throws Exception {
        k2 k2Var;
        ax.b bVar = this.f89924a;
        k2 k2Var2 = (k2) bVar.fetch(l2Var);
        if (k2Var2 != null) {
            return k2Var2;
        }
        if ((annotation instanceof uw.j) || (annotation instanceof uw.g) || (annotation instanceof uw.i)) {
            k2Var = c(i0Var, annotation);
        } else {
            i2 i2VarB = b(i0Var, annotation, null);
            if (i2VarB != null) {
                i2VarB = new h(i2VarB);
            }
            k2Var = new k2(i2VarB);
        }
        if (k2Var != null) {
            bVar.cache(l2Var, k2Var);
        }
        return k2Var;
    }

    public final i2 b(i0 i0Var, Annotation annotation, Annotation annotation2) throws Exception {
        a aVar;
        if (annotation instanceof uw.d) {
            aVar = new a(z0.class, uw.d.class);
        } else if (annotation instanceof uw.f) {
            aVar = new a(a1.class, uw.f.class);
        } else if (annotation instanceof uw.e) {
            aVar = new a(w0.class, uw.e.class);
        } else if (annotation instanceof uw.h) {
            aVar = new a(e1.class, uw.h.class);
        } else if (annotation instanceof uw.j) {
            aVar = new a(j1.class, uw.j.class, uw.d.class);
        } else if (annotation instanceof uw.g) {
            aVar = new a(c1.class, uw.g.class, uw.f.class);
        } else if (annotation instanceof uw.i) {
            aVar = new a(g1.class, uw.i.class, uw.h.class);
        } else if (annotation instanceof uw.a) {
            aVar = new a(f.class, uw.a.class);
        } else if (annotation instanceof uw.s) {
            aVar = new a(m5.class, uw.s.class);
        } else {
            if (!(annotation instanceof uw.q)) {
                throw new p3("Annotation %s not supported", annotation);
            }
            aVar = new a(c5.class, uw.q.class);
        }
        Constructor constructor = aVar.getConstructor();
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        yw.j jVar = this.f89925b;
        return annotation2 != null ? (i2) constructor.newInstance(i0Var, annotation, annotation2, jVar) : (i2) constructor.newInstance(i0Var, annotation, jVar);
    }

    public final k2 c(i0 i0Var, Annotation annotation) throws Exception {
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        Annotation[] annotationArr = declaredMethods.length > 0 ? (Annotation[]) declaredMethods[0].invoke(annotation, null) : new Annotation[0];
        if (annotationArr.length <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (Annotation annotation2 : annotationArr) {
            i2 i2VarB = b(i0Var, annotation, annotation2);
            if (i2VarB != null) {
                i2VarB = new h(i2VarB);
            }
            linkedList.add(i2VarB);
        }
        return new k2(linkedList);
    }

    public i2 getLabel(i0 i0Var, Annotation annotation) throws Exception {
        k2 k2VarA = a(i0Var, annotation, new l2(i0Var, annotation));
        if (k2VarA != null) {
            return k2VarA.getPrimary();
        }
        return null;
    }

    public List<i2> getList(i0 i0Var, Annotation annotation) throws Exception {
        k2 k2VarA = a(i0Var, annotation, new l2(i0Var, annotation));
        return k2VarA != null ? k2VarA.getList() : Collections.EMPTY_LIST;
    }
}
