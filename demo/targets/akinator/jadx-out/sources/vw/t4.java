package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class t4 {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f90108a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f90109b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f90110c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f90111d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f90112e;

    public t4(d2 d2Var, x2 x2Var, i2 i2Var, i2 i2Var2, boolean z10) {
        this.f90112e = z10;
        this.f90108a = d2Var;
        this.f90109b = i2Var;
        this.f90111d = x2Var;
        this.f90110c = i2Var2;
    }

    public d2 getInstantiator() {
        return this.f90108a;
    }

    public uw.s getRevision() {
        i2 i2Var = this.f90109b;
        if (i2Var != null) {
            return (uw.s) i2Var.getContact().getAnnotation(uw.s.class);
        }
        return null;
    }

    public k4 getSection() {
        return new b3(this.f90111d);
    }

    public i2 getText() {
        return this.f90110c;
    }

    public i2 getVersion() {
        return this.f90109b;
    }

    public boolean isPrimitive() {
        return this.f90112e;
    }
}
