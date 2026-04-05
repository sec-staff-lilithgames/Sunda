package com.vungle.ads.internal.presenter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MRAIDPresenter f50774c;

    public /* synthetic */ a(MRAIDPresenter mRAIDPresenter, int i10) {
        this.f50773b = i10;
        this.f50774c = mRAIDPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50773b) {
            case 0:
                MRAIDPresenter.m3630processCommand$lambda5(this.f50774c);
                break;
            case 1:
                MRAIDPresenter.m3631processCommand$lambda9(this.f50774c);
                break;
            case 2:
                MRAIDPresenter.m3628processCommand$lambda10(this.f50774c);
                break;
            default:
                MRAIDPresenter.m3627prepare$lambda14(this.f50774c);
                break;
        }
    }
}
