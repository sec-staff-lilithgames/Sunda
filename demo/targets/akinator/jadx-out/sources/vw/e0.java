package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final m2 f89751a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f89752b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f89753c;

    /* renamed from: d, reason: collision with root package name */
    public final y1 f89754d;

    /* renamed from: e, reason: collision with root package name */
    public final xw.f f89755e;

    public e0(l0 l0Var, y1 y1Var, o1 o1Var, xw.f fVar) throws Exception {
        this.f89751a = y1Var.getElements();
        this.f89753c = l0Var;
        this.f89754d = y1Var;
        this.f89755e = fVar;
        this.f89752b = o1Var;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        return ((i2) this.f89751a.get(this.f89752b.getElement(pVar.getName()))).getConverter(this.f89753c).read(pVar);
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        return ((i2) this.f89751a.get(this.f89752b.getElement(pVar.getName()))).getConverter(this.f89753c).validate(pVar);
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        y1 y1Var = this.f89754d;
        i2 label = y1Var.getLabel(cls);
        if (label == null) {
            throw new i5("Value of %s not declared in %s with annotation %s", cls, this.f89755e, y1Var);
        }
        label.getConverter(this.f89753c).write(h0Var, obj);
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        return ((i2) this.f89751a.get(this.f89752b.getElement(pVar.getName()))).getConverter(this.f89753c).read(pVar, obj);
    }
}
