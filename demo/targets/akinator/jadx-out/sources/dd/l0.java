package dd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 extends ub.y {

    /* renamed from: d, reason: collision with root package name */
    public final ub.y f52077d;

    /* renamed from: e, reason: collision with root package name */
    public final ub.p f52078e;

    /* renamed from: f, reason: collision with root package name */
    public String f52079f;

    /* renamed from: g, reason: collision with root package name */
    public Object f52080g;

    public l0(ub.y yVar, cc.f fVar) {
        super(yVar);
        this.f52077d = yVar.getParent();
        this.f52079f = yVar.getCurrentName();
        this.f52080g = yVar.getCurrentValue();
        if (yVar instanceof ec.e) {
            this.f52078e = ((ec.e) yVar).startLocation(fVar);
        } else {
            this.f52078e = ub.p.f88312i;
        }
    }

    public static l0 createRootContext(ub.y yVar) {
        return yVar == null ? new l0() : new l0(yVar, cc.f.unknown());
    }

    public l0 createChildArrayContext() {
        this.f88379b++;
        return new l0(this, 1);
    }

    public l0 createChildObjectContext() {
        this.f88379b++;
        return new l0(this, 2);
    }

    @Override // ub.y
    public String getCurrentName() {
        return this.f52079f;
    }

    @Override // ub.y
    public Object getCurrentValue() {
        return this.f52080g;
    }

    @Override // ub.y
    public ub.y getParent() {
        return this.f52077d;
    }

    @Override // ub.y
    public boolean hasCurrentName() {
        return this.f52079f != null;
    }

    public l0 parentOrCopy() {
        ub.y yVar = this.f52077d;
        return yVar instanceof l0 ? (l0) yVar : yVar == null ? new l0() : new l0(yVar, this.f52078e);
    }

    public void setCurrentName(String str) throws ub.x {
        this.f52079f = str;
    }

    @Override // ub.y
    public void setCurrentValue(Object obj) {
        this.f52080g = obj;
    }

    public void updateForValue() {
        this.f88379b++;
    }

    public l0(ub.y yVar, ub.p pVar) {
        super(yVar);
        this.f52077d = yVar.getParent();
        this.f52079f = yVar.getCurrentName();
        this.f52080g = yVar.getCurrentValue();
        this.f52078e = pVar;
    }

    public l0() {
        super(0);
        this.f52077d = null;
        this.f52078e = ub.p.f88312i;
    }

    public l0(l0 l0Var, int i10) {
        super(i10);
        this.f52077d = l0Var;
        this.f52078e = l0Var.f52078e;
    }
}
