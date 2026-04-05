package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f89840a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f89841b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f89842c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f89843d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f89844e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f89845f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f89846g;

    /* renamed from: h, reason: collision with root package name */
    public final String f89847h;

    /* renamed from: i, reason: collision with root package name */
    public final String f89848i;

    /* renamed from: j, reason: collision with root package name */
    public final String f89849j;

    /* renamed from: k, reason: collision with root package name */
    public final String f89850k;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f89851l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f89852m;

    /* renamed from: n, reason: collision with root package name */
    public final xw.f f89853n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f89854o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f89855p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f89856q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f89857r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f89858s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f89859t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f89860u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f89861v;

    public h(i2 i2Var) throws Exception {
        this.f89840a = i2Var.getAnnotation();
        this.f89841b = i2Var.getExpression();
        this.f89842c = i2Var.getDecorator();
        this.f89857r = i2Var.isAttribute();
        this.f89859t = i2Var.isCollection();
        this.f89843d = i2Var.getContact();
        this.f89853n = i2Var.getDependent();
        this.f89858s = i2Var.isRequired();
        this.f89849j = i2Var.getOverride();
        this.f89861v = i2Var.isTextList();
        this.f89860u = i2Var.isInline();
        this.f89856q = i2Var.isUnion();
        this.f89844e = i2Var.getNames();
        this.f89845f = i2Var.getPaths();
        this.f89848i = i2Var.getPath();
        this.f89846g = i2Var.getType();
        this.f89850k = i2Var.getName();
        this.f89847h = i2Var.getEntry();
        this.f89854o = i2Var.isData();
        this.f89855p = i2Var.isText();
        this.f89852m = i2Var.getKey();
        this.f89851l = i2Var;
    }

    @Override // vw.i2
    public Annotation getAnnotation() {
        return this.f89840a;
    }

    @Override // vw.i2
    public i0 getContact() {
        return this.f89843d;
    }

    @Override // vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        return this.f89851l.getConverter(l0Var);
    }

    @Override // vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89842c;
    }

    @Override // vw.i2
    public xw.f getDependent() throws Exception {
        return this.f89853n;
    }

    @Override // vw.i2
    public Object getEmpty(l0 l0Var) throws Exception {
        return this.f89851l.getEmpty(l0Var);
    }

    @Override // vw.i2
    public String getEntry() throws Exception {
        return this.f89847h;
    }

    @Override // vw.i2
    public o1 getExpression() throws Exception {
        return this.f89841b;
    }

    @Override // vw.i2
    public Object getKey() throws Exception {
        return this.f89852m;
    }

    @Override // vw.i2
    public i2 getLabel(Class cls) throws Exception {
        return this.f89851l.getLabel(cls);
    }

    @Override // vw.i2
    public String getName() throws Exception {
        return this.f89850k;
    }

    @Override // vw.i2
    public String[] getNames() throws Exception {
        return this.f89844e;
    }

    @Override // vw.i2
    public String getOverride() {
        return this.f89849j;
    }

    @Override // vw.i2
    public String getPath() throws Exception {
        return this.f89848i;
    }

    @Override // vw.i2
    public String[] getPaths() throws Exception {
        return this.f89845f;
    }

    @Override // vw.i2
    public xw.f getType(Class cls) throws Exception {
        return this.f89851l.getType(cls);
    }

    @Override // vw.i2
    public boolean isAttribute() {
        return this.f89857r;
    }

    @Override // vw.i2
    public boolean isCollection() {
        return this.f89859t;
    }

    @Override // vw.i2
    public boolean isData() {
        return this.f89854o;
    }

    @Override // vw.i2
    public boolean isInline() {
        return this.f89860u;
    }

    @Override // vw.i2
    public boolean isRequired() {
        return this.f89858s;
    }

    @Override // vw.i2
    public boolean isText() {
        return this.f89855p;
    }

    @Override // vw.i2
    public boolean isTextList() {
        return this.f89861v;
    }

    @Override // vw.i2
    public boolean isUnion() {
        return this.f89856q;
    }

    @Override // vw.i2
    public String toString() {
        return this.f89851l.toString();
    }

    @Override // vw.i2
    public Class getType() {
        return this.f89846g;
    }
}
