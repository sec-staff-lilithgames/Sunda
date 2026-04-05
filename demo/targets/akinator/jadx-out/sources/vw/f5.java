package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f5 extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f89813a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89814b;

    /* renamed from: c, reason: collision with root package name */
    public final c5 f89815c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89816d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89817e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89818f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89819g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89820h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends j3 {
        public a(uw.q qVar, Constructor constructor, int i10) {
            super(qVar, constructor, i10);
        }

        @Override // vw.j3, vw.i0
        public String getName() {
            return "";
        }
    }

    public f5(Constructor constructor, uw.q qVar, yw.j jVar, int i10) throws Exception {
        a aVar = new a(qVar, constructor, i10);
        this.f89814b = aVar;
        c5 c5Var = new c5(aVar, qVar, jVar);
        this.f89815c = c5Var;
        this.f89813a = c5Var.getExpression();
        this.f89816d = c5Var.getPath();
        this.f89818f = c5Var.getType();
        this.f89817e = c5Var.getName();
        this.f89819g = c5Var.getKey();
        this.f89820h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f89814b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f89813a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f89820h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f89819g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f89817e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f89816d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f89818f;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f89818f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f89815c.isRequired();
    }

    @Override // vw.a5, vw.i3
    public boolean isText() {
        return true;
    }

    @Override // vw.i3
    public String toString() {
        return this.f89814b.toString();
    }

    public String getName(l0 l0Var) {
        return getName();
    }

    public String getPath(l0 l0Var) {
        return getPath();
    }
}
