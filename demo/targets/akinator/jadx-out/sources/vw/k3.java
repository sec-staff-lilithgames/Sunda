package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final yw.j f89948a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f89949a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f89950b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f89951c;

        public a(Class cls, Class cls2) {
            this(cls, cls2, null);
        }

        public Constructor getConstructor() throws Exception {
            Class cls = this.f89950b;
            Class cls2 = this.f89949a;
            return cls2 != null ? getConstructor(cls, cls2) : getConstructor(cls);
        }

        public a(Class cls, Class cls2, Class cls3) {
            this.f89950b = cls2;
            this.f89949a = cls3;
            this.f89951c = cls;
        }

        public Constructor getConstructor(Class cls) throws Exception {
            return this.f89951c.getConstructor(Constructor.class, cls, yw.j.class, Integer.TYPE);
        }

        public Constructor getConstructor(Class cls, Class cls2) throws Exception {
            return this.f89951c.getConstructor(Constructor.class, cls, cls2, yw.j.class, Integer.TYPE);
        }
    }

    public k3(v4 v4Var) {
        this.f89948a = v4Var.getFormat();
    }

    public i3 getInstance(Constructor constructor, Annotation annotation, int i10) throws Exception {
        return getInstance(constructor, annotation, null, i10);
    }

    public i3 getInstance(Constructor constructor, Annotation annotation, Annotation annotation2, int i10) throws Exception {
        a aVar;
        if (annotation instanceof uw.d) {
            aVar = new a(i1.class, uw.d.class);
        } else if (annotation instanceof uw.f) {
            aVar = new a(b1.class, uw.f.class);
        } else if (annotation instanceof uw.e) {
            aVar = new a(x0.class, uw.e.class);
        } else if (annotation instanceof uw.i) {
            aVar = new a(h1.class, uw.i.class, uw.h.class);
        } else if (annotation instanceof uw.g) {
            aVar = new a(d1.class, uw.g.class, uw.f.class);
        } else if (annotation instanceof uw.j) {
            aVar = new a(k1.class, uw.j.class, uw.d.class);
        } else if (annotation instanceof uw.h) {
            aVar = new a(f1.class, uw.h.class);
        } else if (annotation instanceof uw.a) {
            aVar = new a(g.class, uw.a.class);
        } else {
            if (!(annotation instanceof uw.q)) {
                throw new p3("Annotation %s not supported", annotation);
            }
            aVar = new a(f5.class, uw.q.class);
        }
        Constructor constructor2 = aVar.getConstructor();
        if (!constructor2.isAccessible()) {
            constructor2.setAccessible(true);
        }
        yw.j jVar = this.f89948a;
        return annotation2 != null ? (i3) constructor2.newInstance(constructor, annotation, annotation2, jVar, Integer.valueOf(i10)) : (i3) constructor2.newInstance(constructor, annotation, jVar, Integer.valueOf(i10));
    }
}
