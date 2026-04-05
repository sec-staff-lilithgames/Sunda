package o9;

import android.content.Intent;
import android.view.View;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import com.digidust.elokence.akinator.activities.StoreItemsActivity;
import com.digidust.elokence.akinator.activities.WebviewCGV;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StoreItemsActivity f78642c;

    public /* synthetic */ v9(StoreItemsActivity storeItemsActivity, int i10) {
        this.f78641b = i10;
        this.f78642c = storeItemsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f78641b;
        StoreItemsActivity storeItemsActivity = this.f78642c;
        switch (i10) {
            case 0:
                String[] strArr = StoreItemsActivity.U;
                storeItemsActivity.disableAdOneTime();
                Intent intent = new Intent(storeItemsActivity, (Class<?>) WebviewCGV.class);
                intent.putExtra("url", "https://cgu.akinator.com/mobile/content#cgv");
                storeItemsActivity.startActivity(intent);
                break;
            case 1:
                String[] strArr2 = StoreItemsActivity.U;
                storeItemsActivity.onBackPressed();
                break;
            case 2:
                int i11 = StoreItemsActivity.V[storeItemsActivity.L];
                if ((ca.m.sharedInstance().isUserConnected() ? ca.r.sharedInstance().getGenizBalanceAccount() : ca.r.sharedInstance().getGenizBalance()) < i11) {
                    storeItemsActivity.disableAdOneTime();
                    Intent intent2 = new Intent(storeItemsActivity, (Class<?>) PopPedagogiqueActivity.class);
                    intent2.putExtra("PostPedagogiqueActivityModeGz", true);
                    storeItemsActivity.startActivity(intent2);
                    break;
                } else {
                    if (ca.m.sharedInstance().isUserConnected()) {
                        storeItemsActivity.w(i11);
                    } else {
                        ca.r.sharedInstance().withdrawGeniz(i11);
                    }
                    ca.r.sharedInstance().setItemBought("hat", StoreItemsActivity.U[storeItemsActivity.L]);
                    if (ca.m.sharedInstance().isUserConnected()) {
                        StoreItemsActivity.v(storeItemsActivity.L, true, false);
                    }
                    storeItemsActivity.t("hat");
                    break;
                }
            default:
                int i12 = StoreItemsActivity.X[storeItemsActivity.N];
                if ((ca.m.sharedInstance().isUserConnected() ? ca.r.sharedInstance().getGenizBalanceAccount() : ca.r.sharedInstance().getGenizBalance()) < i12) {
                    storeItemsActivity.disableAdOneTime();
                    Intent intent3 = new Intent(storeItemsActivity, (Class<?>) PopPedagogiqueActivity.class);
                    intent3.putExtra("PostPedagogiqueActivityModeGz", true);
                    storeItemsActivity.startActivity(intent3);
                    break;
                } else {
                    if (ca.m.sharedInstance().isUserConnected()) {
                        storeItemsActivity.w(i12);
                    } else {
                        ca.r.sharedInstance().withdrawGeniz(i12);
                    }
                    ca.r.sharedInstance().setItemBought("cloth", StoreItemsActivity.W[storeItemsActivity.N]);
                    if (ca.m.sharedInstance().isUserConnected()) {
                        StoreItemsActivity.v(storeItemsActivity.N, false, false);
                    }
                    storeItemsActivity.t("cloth");
                    break;
                }
        }
    }
}
