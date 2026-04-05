package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g extends a5 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f89821a;

    /* renamed from: b, reason: collision with root package name */
    public final a f89822b;

    /* renamed from: c, reason: collision with root package name */
    public final f f89823c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89824d;

    /* renamed from: e, reason: collision with root package name */
    public final String f89825e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f89826f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f89827g;

    /* renamed from: h, reason: collision with root package name */
    public final int f89828h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends j3 {
        public a(uw.a aVar, Constructor constructor, int i10) {
            super(aVar, constructor, i10);
        }

        @Override // vw.j3, vw.i0
        public String getName() {
            return ((uw.a) this.f89933e).name();
        }
    }

    public g(Constructor constructor, uw.a aVar, yw.j jVar, int i10) throws Exception {
        a aVar2 = new a(aVar, constructor, i10);
        this.f89822b = aVar2;
        f fVar = new f(aVar2, aVar, jVar);
        this.f89823c = fVar;
        this.f89821a = fVar.getExpression();
        this.f89824d = fVar.getPath();
        this.f89826f = fVar.getType();
        this.f89825e = fVar.getName();
        this.f89827g = fVar.getKey();
        this.f89828h = i10;
    }

    @Override // vw.a5, vw.i3
    public Annotation getAnnotation() {
        return this.f89822b.getAnnotation();
    }

    @Override // vw.a5, vw.i3
    public o1 getExpression() {
        return this.f89821a;
    }

    @Override // vw.a5, vw.i3
    public int getIndex() {
        return this.f89828h;
    }

    @Override // vw.a5, vw.i3
    public Object getKey() {
        return this.f89827g;
    }

    @Override // vw.a5, vw.i3
    public String getName() {
        return this.f89825e;
    }

    @Override // vw.a5, vw.i3
    public String getPath() {
        return this.f89824d;
    }

    @Override // vw.a5, vw.i3
    public Class getType() {
        return this.f89826f;
    }

    @Override // vw.a5, vw.i3
    public boolean isAttribute() {
        return true;
    }

    @Override // vw.a5, vw.i3
    public boolean isPrimitive() {
        return this.f89826f.isPrimitive();
    }

    @Override // vw.a5, vw.i3
    public boolean isRequired() {
        return this.f89823c.isRequired();
    }

    @Override // vw.i3
    public String toString() {
        return this.f89822b.toString();
    }
}
