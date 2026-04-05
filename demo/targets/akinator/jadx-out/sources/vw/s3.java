package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s3 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final u3 f90087a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f90088b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90089c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f90090d;

    /* renamed from: e, reason: collision with root package name */
    public final xw.f f90091e;

    public s3(l0 l0Var, xw.f fVar) {
        this(l0Var, fVar, null);
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        boolean zIsElement = pVar.isElement();
        Class cls = this.f90090d;
        if (!zIsElement) {
            return read(pVar, cls);
        }
        a2 u3Var = this.f90087a.getInstance(pVar);
        if (u3Var.isReference()) {
            return u3Var.getInstance();
        }
        Object obj = read(pVar, cls);
        u3Var.setInstance(obj);
        return obj;
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        if (!pVar.isElement()) {
            pVar.getValue();
            return true;
        }
        a2 u3Var = this.f90087a.getInstance(pVar);
        if (u3Var.isReference()) {
            return true;
        }
        u3Var.setInstance(null);
        return true;
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        String text = this.f90087a.getText(obj);
        if (text != null) {
            h0Var.setValue(text);
        }
    }

    public s3(l0 l0Var, xw.f fVar, String str) {
        this.f90087a = new u3(l0Var, fVar);
        this.f90090d = fVar.getType();
        this.f90088b = l0Var;
        this.f90089c = str;
        this.f90091e = fVar;
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        if (obj == null) {
            return read(pVar);
        }
        throw new p3("Can not read existing %s for %s", this.f90090d, this.f90091e);
    }

    public Object read(yw.p pVar, Class cls) throws Exception {
        String value = pVar.getValue();
        if (value == null) {
            return null;
        }
        String str = this.f90089c;
        if (str != null && value.equals(str)) {
            return str;
        }
        String property = this.f90088b.getProperty(value);
        if (property != null) {
            return this.f90087a.getInstance(property, cls);
        }
        return null;
    }
}
