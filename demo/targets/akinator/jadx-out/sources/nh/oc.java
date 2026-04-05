package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class oc extends nc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc f76537b;

    public oc(uc ucVar, int i10) {
        this.f76536a = i10;
        this.f76537b = ucVar;
    }

    @Override // nh.nc, nh.yc
    public <K, V> c8 build() {
        return sd.newListMultimap(this.f76537b.a(), new ic(this.f76536a));
    }
}
