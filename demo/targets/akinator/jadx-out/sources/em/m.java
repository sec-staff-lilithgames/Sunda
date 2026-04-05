package em;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m extends j {

    /* renamed from: c, reason: collision with root package name */
    public l f54711c;

    @Override // em.j
    public final d0 a() {
        return this.f54711c;
    }

    @Override // em.j, hr.b
    public void onDestroy() {
        this.f54711c = null;
        super.onDestroy();
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.i iVar, hr.j jVar, hr.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        l lVar = new l(iVar, this);
        this.f54711c = lVar;
        ((p) this.f54706a).loadInterstitial(networkAdUnit, lVar);
    }
}
