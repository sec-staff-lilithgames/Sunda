package z9;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f97721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f97722b;

    public i(l lVar, c cVar) {
        this.f97722b = lVar;
        this.f97721a = cVar;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        Timber.tag("AkInappManagerImpl").w("Inapp service disconnected", new Object[0]);
        this.f97722b.f97729b = false;
        e.getInstance().a(false);
        c cVar = this.f97721a;
        if (cVar != null) {
            cVar.onInappInit(false);
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(BillingResult billingResult) {
        Timber.tag("AkInappManagerImpl").w("Inapp service connected", new Object[0]);
        this.f97722b.f97729b = true;
        e.getInstance().a(true);
        c cVar = this.f97721a;
        if (cVar != null) {
            cVar.onInappInit(billingResult.getResponseCode() == 0);
        }
    }
}
