package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l5 extends i5 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m5 f76441h;

    public l5(m5 m5Var) {
        this.f76441h = m5Var;
    }

    @Override // nh.i5, nh.m5
    public final l6 b() {
        return this.f76441h.keySet();
    }

    @Override // nh.m5, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f76441h.containsKey(obj);
    }

    @Override // nh.m5
    public final boolean e() {
        return this.f76441h.e();
    }

    @Override // nh.m5
    public final boolean f() {
        return this.f76441h.f();
    }

    @Override // nh.i5
    public final ej h() {
        return new k5(this.f76441h.entrySet().iterator());
    }

    @Override // nh.m5, java.util.Map
    public int hashCode() {
        return this.f76441h.hashCode();
    }

    @Override // java.util.Map
    public int size() {
        return this.f76441h.size();
    }

    @Override // nh.m5, java.util.Map
    public l6 get(Object obj) {
        Object obj2 = this.f76441h.get(obj);
        if (obj2 == null) {
            return null;
        }
        return l6.of(obj2);
    }
}
