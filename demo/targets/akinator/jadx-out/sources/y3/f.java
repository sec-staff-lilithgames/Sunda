package y3;

import android.app.usage.StorageStatsManager;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.exoplayer2.util.b0;
import com.inmobi.media.Ob;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements yo.g, AcknowledgePurchaseResponseListener, b0, PurchasesUpdatedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f94059b;

    public /* synthetic */ f(int i10) {
        this.f94059b = i10;
    }

    public static /* bridge */ /* synthetic */ StorageStatsManager a(Object obj) {
        return (StorageStatsManager) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager b(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder c(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    @Override // yo.g
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // com.google.android.exoplayer2.util.b0
    public void invoke(Object obj, com.google.android.exoplayer2.util.p pVar) {
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        switch (this.f94059b) {
            case 6:
                Ob.a(billingResult, list);
                break;
            default:
                Ob.b(billingResult, list);
                break;
        }
    }

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
    }
}
