package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class x0 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f90207a;

    /* renamed from: b, reason: collision with root package name */
    public final a f90208b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f90209c;

    /* renamed from: d, reason: collision with root package name */
    public final String f90210d;

    /* renamed from: e, reason: collision with root package name */
    public final String f90211e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f90212f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f90213g;

    /* renamed from: h, reason: collision with root package name */
    public final int f90214h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends j3 {
        public a(uw.e eVar, Constructor constructor, int i10) {
            super(eVar, constructor, i10);
        }

        @Override // vw.j3, vw.i0
        public String getName() {
            return ((uw.e) this.f89933e).name();
        }
    }

    public x0(Constructor constructor, uw.e eVar, yw.j jVar, int i10) throws Exception {
        a aVar = new a(eVar, constructor, i10);
        this.f90208b = aVar;
        w0 w0Var = new w0(aVar, eVar, jVar);
        this.f90209c = w0Var;
        this.f90207a = w0Var.getExpression();
        this.f90210d = w0Var.getPath();
        this.f90212f = w0Var.getType();
        this.f90211e = w0Var.getName();
        this.f90213g = w0Var.getKey();
        this.f90214h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f90208b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f90207a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f90214h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f90213g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f90211e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f90210d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f90212f;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f90212f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f90209c.isRequired();
    }

    @Override // vw.i3
    public String toString() {
        return this.f90208b.toString();
    }
}
