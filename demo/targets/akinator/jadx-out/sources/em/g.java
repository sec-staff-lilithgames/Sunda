package em;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g implements y, z {

    /* renamed from: a, reason: collision with root package name */
    public final hr.c f54705a;

    public g(hr.c cVar) {
        this.f54705a = cVar;
    }

    @Override // em.z
    public void onAdClicked() {
        this.f54705a.onAdClicked();
    }

    @Override // em.z
    public void onAdExpired() {
        this.f54705a.onAdExpired();
    }

    @Override // em.y
    public void onAdLoadFailed(pr.a aVar) {
        this.f54705a.onAdLoadFailed(aVar);
    }

    @Override // em.y
    public abstract /* synthetic */ void onAdLoaded(u uVar);

    @Override // em.z
    public void onAdShowFailed(pr.a aVar) {
        this.f54705a.onAdShowFailed(aVar);
    }

    @Override // em.z
    public void onAdShown() {
        this.f54705a.onAdShown();
    }
}
