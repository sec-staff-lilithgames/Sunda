package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f89997a;

    /* renamed from: b, reason: collision with root package name */
    public Class f89998b;

    /* renamed from: c, reason: collision with root package name */
    public Class f89999c;

    /* renamed from: d, reason: collision with root package name */
    public String f90000d;

    /* renamed from: e, reason: collision with root package name */
    public String f90001e;

    /* renamed from: f, reason: collision with root package name */
    public String f90002f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f90003g;

    public n1(i0 i0Var, uw.h hVar) {
        this.f90003g = hVar.attribute();
        this.f90000d = hVar.entry();
        this.f90001e = hVar.value();
        this.f90002f = hVar.key();
        this.f89997a = i0Var;
    }

    public i0 getContact() {
        return this.f89997a;
    }

    public String getEntry() throws Exception {
        String str = this.f90000d;
        if (str == null) {
            return str;
        }
        if (str.length() == 0) {
            this.f90000d = "entry";
        }
        return this.f90000d;
    }

    public n0 getKey(l0 l0Var) throws Exception {
        this.f89999c.getClass();
        n nVar = new n(this.f89999c);
        return l0Var.isPrimitive(nVar) ? new w3(l0Var, this, nVar) : new z(l0Var, this, nVar);
    }

    public n0 getValue(l0 l0Var) throws Exception {
        this.f89998b.getClass();
        n nVar = new n(this.f89998b);
        return l0Var.isPrimitive(nVar) ? new z3(l0Var, this, nVar) : new f0(l0Var, this, nVar);
    }

    public boolean isAttribute() {
        return this.f90003g;
    }

    public boolean isInline() throws Exception {
        return isAttribute();
    }

    public String toString() {
        return String.format("%s on %s", null, this.f89997a);
    }

    public String getKey() throws Exception {
        String str = this.f90002f;
        if (str == null) {
            return str;
        }
        if (str.length() == 0) {
            this.f90002f = null;
        }
        return this.f90002f;
    }

    public String getValue() throws Exception {
        String str = this.f90001e;
        if (str == null) {
            return str;
        }
        if (str.length() == 0) {
            this.f90001e = null;
        }
        return this.f90001e;
    }
}
