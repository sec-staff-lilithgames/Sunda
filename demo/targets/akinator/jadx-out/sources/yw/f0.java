package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f0 implements h0 {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f96689b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f96690c;

    /* renamed from: d, reason: collision with root package name */
    public String f96691d;

    /* renamed from: e, reason: collision with root package name */
    public String f96692e;

    /* renamed from: f, reason: collision with root package name */
    public String f96693f;

    /* renamed from: a, reason: collision with root package name */
    public final i0 f96688a = new i0(this);

    /* renamed from: g, reason: collision with root package name */
    public t f96694g = t.f96761e;

    public f0(c0 c0Var, j0 j0Var) {
        this.f96689b = c0Var;
        this.f96690c = j0Var;
    }

    @Override // yw.h0
    public void commit() throws Exception {
        j0 j0Var = this.f96690c;
        if (j0Var.isEmpty()) {
            throw new x("No root node");
        }
        j0Var.bottom().commit();
    }

    @Override // yw.h0
    public z getAttributes() {
        return this.f96688a;
    }

    @Override // yw.h0
    public h0 getChild(String str) throws Exception {
        return this.f96689b.writeElement(this, str);
    }

    @Override // yw.h0
    public String getComment() {
        return this.f96692e;
    }

    @Override // yw.h0
    public t getMode() {
        return this.f96694g;
    }

    @Override // yw.h0, yw.v
    public String getName() {
        return null;
    }

    @Override // yw.h0
    public u getNamespaces() {
        return null;
    }

    @Override // yw.h0
    public String getPrefix() {
        return null;
    }

    @Override // yw.h0
    public String getReference() {
        return this.f96691d;
    }

    @Override // yw.h0, yw.v
    public String getValue() throws Exception {
        return this.f96693f;
    }

    @Override // yw.h0
    public boolean isCommitted() {
        return this.f96690c.isEmpty();
    }

    @Override // yw.h0
    public boolean isRoot() {
        return true;
    }

    @Override // yw.h0
    public void remove() throws Exception {
        j0 j0Var = this.f96690c;
        if (j0Var.isEmpty()) {
            throw new x("No root node");
        }
        j0Var.bottom().remove();
    }

    @Override // yw.h0
    public h0 setAttribute(String str, String str2) {
        return this.f96688a.put(str, str2);
    }

    @Override // yw.h0
    public void setComment(String str) {
        this.f96692e = str;
    }

    @Override // yw.h0
    public void setData(boolean z10) {
        if (z10) {
            this.f96694g = t.f96759b;
        } else {
            this.f96694g = t.f96760c;
        }
    }

    @Override // yw.h0
    public void setMode(t tVar) {
        this.f96694g = tVar;
    }

    @Override // yw.h0
    public void setReference(String str) {
        this.f96691d = str;
    }

    @Override // yw.h0
    public void setValue(String str) {
        this.f96693f = str;
    }

    @Override // yw.h0, yw.v
    public h0 getParent() {
        return null;
    }

    @Override // yw.h0
    public String getPrefix(boolean z10) {
        return null;
    }

    @Override // yw.h0
    public void setName(String str) {
    }
}
