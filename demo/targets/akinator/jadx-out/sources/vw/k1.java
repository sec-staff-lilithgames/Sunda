package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k1 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f89938a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89939b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f89940c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89941d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89942e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89943f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89944g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89945h;

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

    public k1(Constructor constructor, uw.j jVar, uw.d dVar, yw.j jVar2, int i10) throws Exception {
        a aVar = new a(dVar, constructor, i10);
        this.f89939b = aVar;
        j1 j1Var = new j1(aVar, jVar, dVar, jVar2);
        this.f89940c = j1Var;
        this.f89938a = j1Var.getExpression();
        this.f89941d = j1Var.getPath();
        this.f89943f = j1Var.getType();
        this.f89942e = j1Var.getName();
        this.f89944g = j1Var.getKey();
        this.f89945h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f89939b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f89938a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f89945h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f89944g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f89942e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f89941d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f89943f;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f89943f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f89940c.isRequired();
    }

    @Override // vw.i3
    public String toString() {
        return this.f89939b.toString();
    }
}
