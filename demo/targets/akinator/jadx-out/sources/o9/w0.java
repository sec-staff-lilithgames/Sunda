package o9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements da.s, b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f78643a;

    @Override // o9.b1
    public void onDeactivateAutoScroll() {
        this.f78643a.killThreadRefreshSlider();
    }

    @Override // da.s
    public void onInterceptTouchEvent() {
        this.f78643a.killThreadRefreshSlider();
    }
}
