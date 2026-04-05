package yw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f96705a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96706b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f96707c;

    /* renamed from: d, reason: collision with root package name */
    public final int f96708d;

    public j() {
        this(3);
    }

    public int getIndent() {
        return this.f96708d;
    }

    public String getProlog() {
        return this.f96706b;
    }

    public t0 getStyle() {
        return this.f96707c;
    }

    public u0 getVerbosity() {
        return this.f96705a;
    }

    public j(int i10) {
        this(i10, (String) null, new l());
    }

    public j(String str) {
        this(3, str);
    }

    public j(int i10, String str) {
        this(i10, str, new l());
    }

    public j(u0 u0Var) {
        this(3, u0Var);
    }

    public j(int i10, u0 u0Var) {
        this(i10, new l(), u0Var);
    }

    public j(t0 t0Var) {
        this(3, t0Var);
    }

    public j(t0 t0Var, u0 u0Var) {
        this(3, t0Var, u0Var);
    }

    public j(int i10, t0 t0Var) {
        this(i10, (String) null, t0Var);
    }

    public j(int i10, t0 t0Var, u0 u0Var) {
        this(i10, null, t0Var, u0Var);
    }

    public j(int i10, String str, t0 t0Var) {
        this(i10, str, t0Var, u0.f96763b);
    }

    public j(int i10, String str, t0 t0Var, u0 u0Var) {
        this.f96705a = u0Var;
        this.f96706b = str;
        this.f96708d = i10;
        this.f96707c = t0Var;
    }
}
