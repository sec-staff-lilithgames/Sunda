package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f90061a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f90062b;

    /* renamed from: c, reason: collision with root package name */
    public final yw.j f90063c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements q1 {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f90064a;

        /* renamed from: b, reason: collision with root package name */
        public final yw.j f90065b;

        public a(i0 i0Var, uw.j jVar, yw.j jVar2) throws Exception {
            this.f90064a = i0Var;
            this.f90065b = jVar2;
        }

        @Override // vw.q1
        public uw.d[] getAnnotations() {
            throw null;
        }

        @Override // vw.q1
        public i2 getLabel(uw.d dVar) {
            return new z0(this.f90064a, dVar, this.f90065b);
        }

        @Override // vw.q1
        public Class getType(uw.d dVar) {
            Class clsType = dVar.type();
            return clsType == Void.TYPE ? this.f90064a.getType() : clsType;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements q1 {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f90066a;

        /* renamed from: b, reason: collision with root package name */
        public final yw.j f90067b;

        public b(i0 i0Var, uw.g gVar, yw.j jVar) throws Exception {
            this.f90066a = i0Var;
            this.f90067b = jVar;
        }

        @Override // vw.q1
        public uw.f[] getAnnotations() {
            throw null;
        }

        @Override // vw.q1
        public i2 getLabel(uw.f fVar) {
            return new a1(this.f90066a, fVar, this.f90067b);
        }

        @Override // vw.q1
        public Class getType(uw.f fVar) {
            return fVar.type();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements q1 {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f90068a;

        /* renamed from: b, reason: collision with root package name */
        public final yw.j f90069b;

        public c(i0 i0Var, uw.i iVar, yw.j jVar) throws Exception {
            this.f90068a = i0Var;
            this.f90069b = jVar;
        }

        @Override // vw.q1
        public uw.h[] getAnnotations() {
            throw null;
        }

        @Override // vw.q1
        public i2 getLabel(uw.h hVar) {
            return new e1(this.f90068a, hVar, this.f90069b);
        }

        @Override // vw.q1
        public Class getType(uw.h hVar) {
            return hVar.valueType();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Class f90070a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f90071b;

        public d(Class cls, Class cls2) {
            this.f90070a = cls;
            this.f90071b = cls2;
        }
    }

    public r1(i0 i0Var, Annotation annotation, yw.j jVar) {
        this.f90062b = i0Var;
        this.f90063c = jVar;
        this.f90061a = annotation;
    }

    public q1 getInstance() throws Exception {
        d dVar;
        Annotation annotation = this.f90061a;
        if (annotation instanceof uw.j) {
            dVar = new d(uw.j.class, a.class);
        } else if (annotation instanceof uw.g) {
            dVar = new d(uw.g.class, b.class);
        } else {
            if (!(annotation instanceof uw.i)) {
                throw new p3("Annotation %s is not a union", annotation);
            }
            dVar = new d(uw.i.class, c.class);
        }
        Constructor constructor = dVar.f90071b.getConstructor(i0.class, dVar.f90070a, yw.j.class);
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return (q1) constructor.newInstance(this.f90062b, annotation, this.f90063c);
    }
}
