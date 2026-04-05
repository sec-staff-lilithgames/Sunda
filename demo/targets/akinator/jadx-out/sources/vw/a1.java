package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a1 extends z4 {

    /* renamed from: b, reason: collision with root package name */
    public final a4 f89671b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f89672c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f89673d;

    /* renamed from: e, reason: collision with root package name */
    public final yw.j f89674e;

    /* renamed from: f, reason: collision with root package name */
    public final String f89675f;

    /* renamed from: g, reason: collision with root package name */
    public String f89676g;

    /* renamed from: h, reason: collision with root package name */
    public String f89677h;

    /* renamed from: i, reason: collision with root package name */
    public String f89678i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f89679j;

    /* renamed from: k, reason: collision with root package name */
    public Class f89680k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f89681l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f89682m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f89683n;

    public a1(i0 i0Var, uw.f fVar, yw.j jVar) {
        this.f89672c = new f2(i0Var, this, jVar);
        this.f89671b = new a4(i0Var);
        this.f89681l = fVar.required();
        this.f89679j = i0Var.getType();
        this.f89675f = fVar.name();
        this.f89682m = fVar.inline();
        this.f89676g = fVar.entry();
        this.f89683n = fVar.data();
        this.f89680k = fVar.type();
        this.f89674e = jVar;
    }

    @Override // vw.z4, vw.i2
    public Annotation getAnnotation() {
        return null;
    }

    @Override // vw.z4, vw.i2
    public i0 getContact() {
        return this.f89672c.getContact();
    }

    @Override // vw.z4, vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        getEntry();
        throw null;
    }

    @Override // vw.z4, vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89671b;
    }

    @Override // vw.z4, vw.i2
    public xw.f getDependent() throws Exception {
        i0 contact = getContact();
        if (this.f89680k == Void.TYPE) {
            this.f89680k = contact.getDependent();
        }
        Class cls = this.f89680k;
        if (cls != null) {
            return new n(cls);
        }
        throw new y0("Unable to determine generic type for %s", contact);
    }

    @Override // vw.z4, vw.i2
    public Object getEmpty(l0 l0Var) throws Exception {
        new o(l0Var, new n(this.f89679j));
        throw null;
    }

    @Override // vw.z4, vw.i2
    public String getEntry() throws Exception {
        yw.t0 style = this.f89674e.getStyle();
        String str = this.f89676g;
        f2 f2Var = this.f89672c;
        if (f2Var.isEmpty(str)) {
            this.f89676g = f2Var.getEntry();
        }
        return ((yw.l) style).getElement(this.f89676g);
    }

    @Override // vw.z4, vw.i2
    public o1 getExpression() throws Exception {
        if (this.f89673d == null) {
            this.f89673d = this.f89672c.getExpression();
        }
        return this.f89673d;
    }

    @Override // vw.z4, vw.i2
    public String getName() throws Exception {
        if (this.f89677h == null) {
            this.f89677h = ((yw.l) this.f89674e.getStyle()).getElement(this.f89672c.getName());
        }
        return this.f89677h;
    }

    @Override // vw.z4, vw.i2
    public String getOverride() {
        return this.f89675f;
    }

    @Override // vw.z4, vw.i2
    public String getPath() throws Exception {
        if (this.f89678i == null) {
            this.f89678i = getExpression().getElement(getName());
        }
        return this.f89678i;
    }

    @Override // vw.z4, vw.i2
    public Class getType() {
        return this.f89679j;
    }

    @Override // vw.z4, vw.i2
    public boolean isCollection() {
        return true;
    }

    @Override // vw.z4, vw.i2
    public boolean isData() {
        return this.f89683n;
    }

    @Override // vw.z4, vw.i2
    public boolean isInline() {
        return this.f89682m;
    }

    @Override // vw.z4, vw.i2
    public boolean isRequired() {
        return this.f89681l;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89672c.toString();
    }
}
