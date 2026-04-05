package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b1 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f89696a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89697b;

    /* renamed from: c, reason: collision with root package name */
    public final a1 f89698c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89699d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89700e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89701f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89702g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89703h;

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

    public b1(Constructor constructor, uw.f fVar, yw.j jVar, int i10) throws Exception {
        a aVar = new a(fVar, constructor, i10);
        this.f89697b = aVar;
        a1 a1Var = new a1(aVar, fVar, jVar);
        this.f89698c = a1Var;
        this.f89696a = a1Var.getExpression();
        this.f89699d = a1Var.getPath();
        this.f89701f = a1Var.getType();
        this.f89700e = a1Var.getName();
        this.f89702g = a1Var.getKey();
        this.f89703h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f89697b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f89696a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f89703h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f89702g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f89700e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f89699d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f89701f;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f89701f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f89698c.isRequired();
    }

    @Override // vw.i3
    public String toString() {
        return this.f89697b.toString();
    }
}
