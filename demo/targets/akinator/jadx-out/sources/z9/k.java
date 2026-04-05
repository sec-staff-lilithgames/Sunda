package z9;

import ca.o;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k implements PurchaseHistoryResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f97725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f97726b;

    public k(j jVar, d dVar) {
        this.f97725a = jVar;
        this.f97726b = dVar;
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        d dVar;
        if (billingResult.getResponseCode() != 0 || list == null) {
            d dVar2 = this.f97726b;
            if (dVar2 != null) {
                dVar2.onInappPurchasesRequested(false);
                return;
            }
            return;
        }
        Iterator<PurchaseHistoryRecord> it = list.iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().getProducts().iterator();
            while (it2.hasNext()) {
                if (it2.next().equals("com.digidust.elokence.akinator.freemium.full")) {
                    o.sharedInstance().unlockGame();
                    e.getInstance().b("com.digidust.elokence.akinator.freemium.full");
                }
            }
        }
        j jVar = this.f97725a;
        int i10 = jVar.f97723a - 1;
        jVar.f97723a = i10;
        if (i10 != 0 || (dVar = jVar.f97724b) == null) {
            return;
        }
        dVar.onInappPurchasesRequested(true);
    }
}
