package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class qc extends vc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc f76584b;

    public qc(uc ucVar, int i10) {
        this.f76583a = i10;
        this.f76584b = ucVar;
    }

    @Override // nh.vc, nh.yc
    public <K, V> sf build() {
        return sd.newSetMultimap(this.f76584b.a(), new kc(this.f76583a));
    }
}
