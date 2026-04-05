package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h1 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f89866a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89867b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f89868c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89869d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89870e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89871f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89872g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89873h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends j3 {
        public a(uw.h hVar, Constructor constructor, int i10) {
            super(hVar, constructor, i10);
        }

        @Override // vw.j3, vw.i0
        public String getName() {
            return ((uw.h) this.f89933e).name();
        }
    }

    public h1(Constructor constructor, uw.i iVar, uw.h hVar, yw.j jVar, int i10) throws Exception {
        a aVar = new a(hVar, constructor, i10);
        this.f89867b = aVar;
        g1 g1Var = new g1(aVar, iVar, hVar, jVar);
        this.f89868c = g1Var;
        this.f89866a = g1Var.getExpression();
        this.f89869d = g1Var.getPath();
        this.f89871f = g1Var.getType();
        this.f89870e = g1Var.getName();
        this.f89872g = g1Var.getKey();
        this.f89873h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f89867b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f89866a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f89873h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f89872g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f89870e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f89869d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f89871f;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f89871f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f89868c.isRequired();
    }

    @Override // vw.i3
    public String toString() {
        return this.f89867b.toString();
    }
}
