package z9;

import ao.q0;
import ca.o;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static String f97727f;

    /* renamed from: a, reason: collision with root package name */
    public BillingClient f97728a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f97729b;

    /* renamed from: c, reason: collision with root package name */
    public TreeMap f97730c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f97731d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f97732e;

    public final void a(Purchase purchase) {
        boolean z10 = true;
        if (purchase.getPurchaseState() != 1) {
            return;
        }
        for (String str : purchase.getProducts()) {
            if (str.equals("com.digidust.elokence.akinator.freemium.full")) {
                if (!o.sharedInstance().isUnlocked()) {
                    o.sharedInstance().unlockGame();
                    o.sharedInstance().setDatePurchaseFull(System.currentTimeMillis());
                }
                e.getInstance().b(str);
                z10 = false;
            }
        }
        if (z10) {
            this.f97728a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new h(purchase));
        } else {
            if (purchase.isAcknowledged()) {
                return;
            }
            this.f97728a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new y3.f(2));
        }
    }

    public final boolean b(d dVar) {
        j jVar = new j(this, dVar);
        if (this.f97729b) {
            this.f97728a.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new q0(this, 21, jVar, dVar));
            this.f97728a.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType("inapp").build(), new k(jVar, dVar));
            return true;
        }
        if (dVar != null) {
            dVar.onInappPurchasesRequested(false);
        }
        return false;
    }

    public void consumePurchase(String str) {
        ConsumeParams.newBuilder().setPurchaseToken(str).build();
    }
}
