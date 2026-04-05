package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final q f96738a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f96739b;

    /* renamed from: c, reason: collision with root package name */
    public final p f96740c;

    /* renamed from: d, reason: collision with root package name */
    public final g f96741d;

    public o(p pVar, a0 a0Var, g gVar) {
        this.f96738a = new q(this, gVar);
        this.f96739b = a0Var;
        this.f96740c = pVar;
        this.f96741d = gVar;
    }

    @Override // yw.p
    public p getAttribute(String str) {
        return this.f96738a.get(str);
    }

    @Override // yw.p
    public z getAttributes() {
        return this.f96738a;
    }

    @Override // yw.p, yw.v
    public String getName() {
        return this.f96741d.getName();
    }

    @Override // yw.p
    public p getNext() throws Exception {
        return this.f96739b.readElement(this);
    }

    @Override // yw.p
    public k0 getPosition() {
        return new r(this.f96741d);
    }

    @Override // yw.p
    public String getPrefix() {
        return this.f96741d.getPrefix();
    }

    @Override // yw.p
    public String getReference() {
        return this.f96741d.getReference();
    }

    @Override // yw.p
    public Object getSource() {
        return this.f96741d.getSource();
    }

    @Override // yw.p, yw.v
    public String getValue() throws Exception {
        return this.f96739b.readValue(this);
    }

    @Override // yw.p
    public boolean isElement() {
        return true;
    }

    @Override // yw.p
    public boolean isEmpty() throws Exception {
        if (this.f96738a.isEmpty()) {
            return this.f96739b.isEmpty(this);
        }
        return false;
    }

    @Override // yw.p
    public boolean isRoot() {
        return this.f96739b.isRoot(this);
    }

    @Override // yw.p
    public void skip() throws Exception {
        this.f96739b.skipElement(this);
    }

    public String toString() {
        return a.b.k("element ", getName());
    }

    @Override // yw.p
    public p getNext(String str) throws Exception {
        return this.f96739b.readElement(this, str);
    }

    @Override // yw.p, yw.v
    public p getParent() {
        return this.f96740c;
    }
}
