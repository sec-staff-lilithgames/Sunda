package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d1 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f89741a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89742b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f89743c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89744d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89745e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89746f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89747g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89748h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends j3 {
        public a(uw.f fVar, Constructor constructor, int i10) {
            super(fVar, constructor, i10);
        }

        @Override // vw.j3, vw.i0
        public String getName() {
            return ((uw.f) this.f89933e).name();
        }
    }

    public d1(Constructor constructor, uw.g gVar, uw.f fVar, yw.j jVar, int i10) throws Exception {
        a aVar = new a(fVar, constructor, i10);
        this.f89742b = aVar;
        c1 c1Var = new c1(aVar, gVar, fVar, jVar);
        this.f89743c = c1Var;
        this.f89741a = c1Var.getExpression();
        this.f89744d = c1Var.getPath();
        this.f89746f = c1Var.getType();
        this.f89745e = c1Var.getName();
        this.f89747g = c1Var.getKey();
        this.f89748h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f89742b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f89741a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f89748h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f89747g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f89745e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f89744d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f89746f;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f89746f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f89743c.isRequired();
    }

    @Override // vw.i3
    public String toString() {
        return this.f89742b.toString();
    }
}
