package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final k3 f80449a;

    /* renamed from: b, reason: collision with root package name */
    public int f80450b;

    /* renamed from: c, reason: collision with root package name */
    public Object f80451c;

    public s1(k3 k3Var, int i10, Object obj) {
        this.f80449a = k3Var;
        this.f80450b = i10;
        this.f80451c = obj;
    }

    public final Object getInstances() {
        return this.f80451c;
    }

    public final int getLocation() {
        return this.f80450b;
    }

    public final k3 getScope() {
        return this.f80449a;
    }

    public final boolean isInvalid() {
        return this.f80449a.isInvalidFor(this.f80451c);
    }

    public final void setInstances(Object obj) {
        this.f80451c = obj;
    }

    public final void setLocation(int i10) {
        this.f80450b = i10;
    }
}
