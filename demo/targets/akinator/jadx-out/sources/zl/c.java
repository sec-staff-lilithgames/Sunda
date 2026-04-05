package zl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class c implements u, v {

    /* renamed from: a, reason: collision with root package name */
    public final hr.c f98225a;

    public c(hr.c cVar) {
        this.f98225a = cVar;
    }

    @Override // zl.v
    public void onAdClicked() {
        this.f98225a.onAdClicked();
    }

    @Override // zl.v
    public void onAdExpired() {
        this.f98225a.onAdExpired();
    }

    @Override // zl.u
    public void onAdLoadFailed(pr.a aVar) {
        this.f98225a.onAdLoadFailed(aVar);
    }

    @Override // zl.u, zl.x
    public abstract /* synthetic */ void onAdLoaded(t tVar);

    @Override // zl.v
    public void onAdShowFailed(pr.a aVar) {
        this.f98225a.onAdShowFailed(aVar);
    }

    @Override // zl.v
    public void onAdShown() {
        this.f98225a.onAdShown();
    }
}
