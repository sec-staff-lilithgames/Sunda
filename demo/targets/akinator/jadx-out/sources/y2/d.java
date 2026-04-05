package y2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements a3.e {

    /* renamed from: a, reason: collision with root package name */
    public float f93959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a3.g f93960b;

    public d(a3.g gVar) {
        this.f93960b = gVar;
    }

    @Override // a3.e
    public float getInterpolation(float f10) {
        this.f93959a = f10;
        return (float) this.f93960b.get(f10);
    }

    @Override // a3.e
    public float getVelocity() {
        return (float) this.f93960b.getDiff(this.f93959a);
    }
}
