package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l5 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f89969a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f89970b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements c4 {

        /* renamed from: a, reason: collision with root package name */
        public final n0 f89971a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f89972b;

        /* renamed from: c, reason: collision with root package name */
        public final i2 f89973c;

        public a(n0 n0Var, i2 i2Var, Object obj) {
            this.f89971a = n0Var;
            this.f89972b = obj;
            this.f89973c = i2Var;
        }

        @Override // vw.c4, vw.n0
        public Object read(yw.p pVar) throws Exception {
            return read(pVar, this.f89972b);
        }

        @Override // vw.c4, vw.n0
        public boolean validate(yw.p pVar) throws Exception {
            yw.k0 position = pVar.getPosition();
            String name = pVar.getName();
            n0 n0Var = this.f89971a;
            if (n0Var instanceof c4) {
                return ((c4) n0Var).validate(pVar);
            }
            throw new p3("Element '%s' declared twice at %s", name, position);
        }

        @Override // vw.c4, vw.n0
        public void write(yw.h0 h0Var, Object obj) throws Exception {
            write(h0Var, obj);
        }

        @Override // vw.c4, vw.n0
        public Object read(yw.p pVar, Object obj) throws Exception {
            yw.k0 position = pVar.getPosition();
            String name = pVar.getName();
            n0 n0Var = this.f89971a;
            if (n0Var instanceof c4) {
                return ((c4) n0Var).read(pVar, obj);
            }
            throw new p3("Element '%s' is already used with %s at %s", name, this.f89973c, position);
        }
    }

    public l5(i2 i2Var, Object obj) {
        this.f89970b = i2Var;
        this.f89969a = obj;
    }

    @Override // vw.i2
    public Annotation getAnnotation() {
        return this.f89970b.getAnnotation();
    }

    @Override // vw.i2
    public i0 getContact() {
        return this.f89970b.getContact();
    }

    @Override // vw.i2
    public n0 getConverter(l0 l0Var) throws Exception {
        i2 i2Var = this.f89970b;
        n0 converter = i2Var.getConverter(l0Var);
        return converter instanceof a ? converter : new a(converter, i2Var, this.f89969a);
    }

    @Override // vw.i2
    public q0 getDecorator() throws Exception {
        return this.f89970b.getDecorator();
    }

    @Override // vw.i2
    public xw.f getDependent() throws Exception {
        return this.f89970b.getDependent();
    }

    @Override // vw.i2
    public Object getEmpty(l0 l0Var) throws Exception {
        return this.f89970b.getEmpty(l0Var);
    }

    @Override // vw.i2
    public String getEntry() throws Exception {
        return this.f89970b.getEntry();
    }

    @Override // vw.i2
    public o1 getExpression() throws Exception {
        return this.f89970b.getExpression();
    }

    @Override // vw.i2
    public Object getKey() throws Exception {
        return this.f89970b.getKey();
    }

    @Override // vw.i2
    public String getName() throws Exception {
        return this.f89970b.getName();
    }

    @Override // vw.i2
    public String[] getNames() throws Exception {
        return this.f89970b.getNames();
    }

    @Override // vw.i2
    public String getOverride() {
        return this.f89970b.getOverride();
    }

    @Override // vw.i2
    public String getPath() throws Exception {
        return this.f89970b.getPath();
    }

    @Override // vw.i2
    public String[] getPaths() throws Exception {
        return this.f89970b.getPaths();
    }

    @Override // vw.i2
    public xw.f getType(Class cls) throws Exception {
        return this.f89970b.getType(cls);
    }

    public Object getValue() {
        return this.f89969a;
    }

    @Override // vw.i2
    public boolean isAttribute() {
        return this.f89970b.isAttribute();
    }

    @Override // vw.i2
    public boolean isCollection() {
        return this.f89970b.isCollection();
    }

    @Override // vw.i2
    public boolean isData() {
        return this.f89970b.isData();
    }

    @Override // vw.i2
    public boolean isInline() {
        return this.f89970b.isInline();
    }

    @Override // vw.i2
    public boolean isRequired() {
        return this.f89970b.isRequired();
    }

    @Override // vw.i2
    public boolean isText() {
        return this.f89970b.isText();
    }

    @Override // vw.i2
    public boolean isTextList() {
        return this.f89970b.isTextList();
    }

    @Override // vw.i2
    public boolean isUnion() {
        return this.f89970b.isUnion();
    }

    @Override // vw.i2
    public String toString() {
        return this.f89970b.toString();
    }

    @Override // vw.i2
    public Class getType() {
        return this.f89970b.getType();
    }

    @Override // vw.i2
    public i2 getLabel(Class cls) {
        return this;
    }
}
