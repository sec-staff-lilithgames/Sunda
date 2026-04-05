package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public final p f96732a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96733b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96734c;

    /* renamed from: d, reason: collision with root package name */
    public final String f96735d;

    /* renamed from: e, reason: collision with root package name */
    public final String f96736e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f96737f;

    public n(p pVar, String str, String str2) {
        this.f96732a = pVar;
        this.f96736e = str2;
        this.f96735d = str;
    }

    @Override // yw.p
    public p getAttribute(String str) {
        return null;
    }

    @Override // yw.p
    public z getAttributes() {
        return new q(this);
    }

    @Override // yw.p, yw.v
    public String getName() {
        return this.f96735d;
    }

    @Override // yw.p
    public p getNext() {
        return null;
    }

    @Override // yw.p
    public k0 getPosition() {
        return this.f96732a.getPosition();
    }

    @Override // yw.p
    public String getPrefix() {
        return this.f96734c;
    }

    @Override // yw.p
    public String getReference() {
        return this.f96733b;
    }

    @Override // yw.p
    public Object getSource() {
        return this.f96737f;
    }

    @Override // yw.p, yw.v
    public String getValue() {
        return this.f96736e;
    }

    @Override // yw.p
    public boolean isElement() {
        return false;
    }

    @Override // yw.p
    public boolean isEmpty() {
        return false;
    }

    @Override // yw.p
    public boolean isRoot() {
        return false;
    }

    public String toString() {
        return e3.g.l("attribute ", this.f96735d, "='", this.f96736e, "'");
    }

    @Override // yw.p
    public p getNext(String str) {
        return null;
    }

    @Override // yw.p, yw.v
    public p getParent() {
        return this.f96732a;
    }

    public n(p pVar, a aVar) {
        this.f96733b = aVar.getReference();
        this.f96734c = aVar.getPrefix();
        this.f96737f = aVar.getSource();
        this.f96736e = aVar.getValue();
        this.f96735d = aVar.getName();
        this.f96732a = pVar;
    }

    @Override // yw.p
    public void skip() {
    }
}
