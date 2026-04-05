package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f1 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f89796a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89797b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f89798c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89799d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89800e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89801f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89802g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89803h;

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

    public f1(Constructor constructor, uw.h hVar, yw.j jVar, int i10) throws Exception {
        a aVar = new a(hVar, constructor, i10);
        this.f89797b = aVar;
        e1 e1Var = new e1(aVar, hVar, jVar);
        this.f89798c = e1Var;
        this.f89796a = e1Var.getExpression();
        this.f89799d = e1Var.getPath();
        this.f89801f = e1Var.getType();
        this.f89800e = e1Var.getName();
        this.f89802g = e1Var.getKey();
        this.f89803h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f89797b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f89796a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f89803h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f89802g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f89800e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f89799d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f89801f;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f89801f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f89798c.isRequired();
    }

    @Override // vw.i3
    public String toString() {
        return this.f89797b.toString();
    }
}
