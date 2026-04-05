package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final u f96682a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f96683b;

    /* renamed from: c, reason: collision with root package name */
    public String f96684c;

    /* renamed from: d, reason: collision with root package name */
    public String f96685d;

    /* renamed from: e, reason: collision with root package name */
    public String f96686e;

    public d0(h0 h0Var, String str, String str2) {
        this.f96682a = h0Var.getNamespaces();
        this.f96683b = h0Var;
        this.f96686e = str2;
        this.f96685d = str;
    }

    @Override // yw.h0
    public z getAttributes() {
        return new i0(this);
    }

    @Override // yw.h0
    public h0 getChild(String str) {
        return null;
    }

    @Override // yw.h0
    public String getComment() {
        return null;
    }

    @Override // yw.h0
    public t getMode() {
        return t.f96761e;
    }

    @Override // yw.h0, yw.v
    public String getName() {
        return this.f96685d;
    }

    @Override // yw.h0
    public u getNamespaces() {
        return this.f96682a;
    }

    @Override // yw.h0
    public String getPrefix() {
        return this.f96682a.getPrefix(this.f96684c);
    }

    @Override // yw.h0
    public String getReference() {
        return this.f96684c;
    }

    @Override // yw.h0, yw.v
    public String getValue() {
        return this.f96686e;
    }

    @Override // yw.h0
    public boolean isCommitted() {
        return true;
    }

    @Override // yw.h0
    public boolean isRoot() {
        return false;
    }

    @Override // yw.h0
    public h0 setAttribute(String str, String str2) {
        return null;
    }

    @Override // yw.h0
    public void setName(String str) {
        this.f96685d = str;
    }

    @Override // yw.h0
    public void setReference(String str) {
        this.f96684c = str;
    }

    @Override // yw.h0
    public void setValue(String str) {
        this.f96686e = str;
    }

    public String toString() {
        return e3.g.l("attribute ", this.f96685d, "='", this.f96686e, "'");
    }

    @Override // yw.h0, yw.v
    public h0 getParent() {
        return this.f96683b;
    }

    @Override // yw.h0
    public String getPrefix(boolean z10) {
        return this.f96682a.getPrefix(this.f96684c);
    }

    @Override // yw.h0
    public void commit() {
    }

    @Override // yw.h0
    public void remove() {
    }

    @Override // yw.h0
    public void setComment(String str) {
    }

    @Override // yw.h0
    public void setData(boolean z10) {
    }

    @Override // yw.h0
    public void setMode(t tVar) {
    }
}
