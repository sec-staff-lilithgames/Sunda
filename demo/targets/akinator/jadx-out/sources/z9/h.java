package z9;

import ca.r;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import io.bidmachine.media3.exoplayer.scheduler.Requirements;
import io.bidmachine.media3.exoplayer.scheduler.RequirementsWatcher;
import java.util.Iterator;
import java.util.List;
import zn.m;
import zn.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements PurchasesUpdatedListener, ConsumeResponseListener, io.bidmachine.media3.exoplayer.scheduler.b, mn.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f97720b;

    public /* synthetic */ h(Object obj) {
        this.f97720b = obj;
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public void onConsumeResponse(BillingResult billingResult, String str) {
        int i10;
        Purchase purchase = (Purchase) this.f97720b;
        if (billingResult.getResponseCode() == 0) {
            for (String str2 : purchase.getProducts()) {
                if (str2.startsWith(l.f97727f)) {
                    switch (str2.charAt(str2.length() - 1)) {
                        case '1':
                            i10 = 11250;
                            break;
                        case '2':
                            i10 = 37500;
                            break;
                        case '3':
                            i10 = 66250;
                            break;
                        case '4':
                            i10 = 115000;
                            break;
                        case '5':
                            i10 = 173750;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    r.sharedInstance().depositGeniz(i10);
                }
                e.getInstance().b(str2);
            }
        }
    }

    @Override // mn.g
    public void onProgress(long j10, long j11, long j12) {
        m mVar = ((s) this.f97720b).f98384f;
        if (mVar == null) {
            return;
        }
        ((zn.i) mVar).onProgress(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (j11 * 100.0f) / j10);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        l lVar = (l) this.f97720b;
        lVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lVar.a((Purchase) it.next());
        }
    }

    @Override // io.bidmachine.media3.exoplayer.scheduler.b
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i10) {
        zn.g gVar = (zn.g) this.f97720b;
        Requirements requirements = zn.g.f98326q;
        gVar.b(requirementsWatcher, i10);
    }
}
