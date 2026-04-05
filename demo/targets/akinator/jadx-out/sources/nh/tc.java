package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class tc extends vc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f76665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uc f76666b;

    public tc(uc ucVar, Class cls) {
        this.f76665a = cls;
        this.f76666b = ucVar;
    }

    @Override // nh.vc, nh.yc
    public <K, V extends Enum<Object>> sf build() {
        return sd.newSetMultimap(this.f76666b.a(), new jc(this.f76665a));
    }
}
