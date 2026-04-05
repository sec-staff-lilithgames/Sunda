package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g0 implements h0 {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f96696b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f96697c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f96698d;

    /* renamed from: e, reason: collision with root package name */
    public String f96699e;

    /* renamed from: f, reason: collision with root package name */
    public String f96700f;

    /* renamed from: g, reason: collision with root package name */
    public String f96701g;

    /* renamed from: h, reason: collision with root package name */
    public String f96702h;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f96695a = new i0(this);

    /* renamed from: i, reason: collision with root package name */
    public t f96703i = t.f96761e;

    public g0(h0 h0Var, c0 c0Var, String str) {
        this.f96696b = new l0(h0Var);
        this.f96697c = c0Var;
        this.f96698d = h0Var;
        this.f96702h = str;
    }

    @Override // yw.h0
    public void commit() throws Exception {
        this.f96697c.commit(this);
    }

    @Override // yw.h0
    public h0 getChild(String str) throws Exception {
        return this.f96697c.writeElement(this, str);
    }

    @Override // yw.h0
    public String getComment() {
        return this.f96700f;
    }

    @Override // yw.h0
    public t getMode() {
        return this.f96703i;
    }

    @Override // yw.h0, yw.v
    public String getName() {
        return this.f96702h;
    }

    @Override // yw.h0
    public u getNamespaces() {
        return this.f96696b;
    }

    @Override // yw.h0
    public String getPrefix() {
        return getPrefix(true);
    }

    @Override // yw.h0
    public String getReference() {
        return this.f96699e;
    }

    @Override // yw.h0, yw.v
    public String getValue() {
        return this.f96701g;
    }

    @Override // yw.h0
    public boolean isCommitted() {
        return this.f96697c.isCommitted(this);
    }

    @Override // yw.h0
    public boolean isRoot() {
        return this.f96697c.isRoot(this);
    }

    @Override // yw.h0
    public void remove() throws Exception {
        this.f96697c.remove(this);
    }

    @Override // yw.h0
    public h0 setAttribute(String str, String str2) {
        return this.f96695a.put(str, str2);
    }

    @Override // yw.h0
    public void setComment(String str) {
        this.f96700f = str;
    }

    @Override // yw.h0
    public void setData(boolean z10) {
        if (z10) {
            this.f96703i = t.f96759b;
        } else {
            this.f96703i = t.f96760c;
        }
    }

    @Override // yw.h0
    public void setMode(t tVar) {
        this.f96703i = tVar;
    }

    @Override // yw.h0
    public void setName(String str) {
        this.f96702h = str;
    }

    @Override // yw.h0
    public void setReference(String str) {
        this.f96699e = str;
    }

    @Override // yw.h0
    public void setValue(String str) {
        this.f96701g = str;
    }

    public String toString() {
        return a.b.k("element ", this.f96702h);
    }

    @Override // yw.h0
    public i0 getAttributes() {
        return this.f96695a;
    }

    @Override // yw.h0, yw.v
    public h0 getParent() {
        return this.f96698d;
    }

    @Override // yw.h0
    public String getPrefix(boolean z10) {
        String prefix = this.f96696b.getPrefix(this.f96699e);
        return (z10 && prefix == null) ? this.f96698d.getPrefix() : prefix;
    }
}
