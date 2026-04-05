package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i1 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f89903a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89904b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f89905c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89906d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89907e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89908f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89909g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89910h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends j3 {
        public a(uw.d dVar, Constructor constructor, int i10) {
            super(dVar, constructor, i10);
        }

        @Override // vw.j3, vw.i0
        public String getName() {
            return ((uw.d) this.f89933e).name();
        }
    }

    public i1(Constructor constructor, uw.d dVar, yw.j jVar, int i10) throws Exception {
        a aVar = new a(dVar, constructor, i10);
        this.f89904b = aVar;
        z0 z0Var = new z0(aVar, dVar, jVar);
        this.f89905c = z0Var;
        this.f89903a = z0Var.getExpression();
        this.f89906d = z0Var.getPath();
        this.f89908f = z0Var.getType();
        this.f89907e = z0Var.getName();
        this.f89909g = z0Var.getKey();
        this.f89910h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f89904b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f89903a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f89910h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f89909g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f89907e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f89906d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f89908f;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f89908f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f89905c.isRequired();
    }

    @Override // vw.i3
    public String toString() {
        return this.f89904b.toString();
    }
}
