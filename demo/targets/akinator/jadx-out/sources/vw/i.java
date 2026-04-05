package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f89891a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f89892b;

    /* renamed from: c, reason: collision with root package name */
    public final String f89893c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89894d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89895e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89896f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89897g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89898h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f89899i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f89900j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f89901k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f89902l;

    public i(i3 i3Var, i2 i2Var) throws Exception {
        this.f89891a = i3Var.getAnnotation();
        this.f89892b = i3Var.getExpression();
        this.f89901k = i3Var.isAttribute();
        this.f89899i = i3Var.isPrimitive();
        this.f89900j = i2Var.isRequired();
        this.f89895e = i3Var.toString();
        this.f89902l = i3Var.isText();
        this.f89898h = i3Var.getIndex();
        this.f89893c = i3Var.getName();
        this.f89894d = i3Var.getPath();
        this.f89896f = i3Var.getType();
        this.f89897g = i2Var.getKey();
    }

    @Override // vw.i3
    public Annotation getAnnotation() {
        return this.f89891a;
    }

    @Override // vw.i3
    public o1 getExpression() {
        return this.f89892b;
    }

    @Override // vw.i3
    public int getIndex() {
        return this.f89898h;
    }

    @Override // vw.i3
    public Object getKey() {
        return this.f89897g;
    }

    @Override // vw.i3
    public String getName() {
        return this.f89893c;
    }

    @Override // vw.i3
    public String getPath() {
        return this.f89894d;
    }

    @Override // vw.i3
    public Class getType() {
        return this.f89896f;
    }

    @Override // vw.i3
    public boolean isAttribute() {
        return this.f89901k;
    }

    @Override // vw.i3
    public boolean isPrimitive() {
        return this.f89899i;
    }

    @Override // vw.i3
    public boolean isRequired() {
        return this.f89900j;
    }

    @Override // vw.i3
    public boolean isText() {
        return this.f89902l;
    }

    @Override // vw.i3
    public String toString() {
        return this.f89895e;
    }
}
