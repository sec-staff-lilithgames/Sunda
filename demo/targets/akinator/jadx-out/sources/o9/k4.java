package o9;

import android.view.View;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k4 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PopPedagogiqueActivity f78288b;

    public k4(PopPedagogiqueActivity popPedagogiqueActivity) {
        this.f78288b = popPedagogiqueActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        PopPedagogiqueActivity popPedagogiqueActivity = this.f78288b;
        char c10 = 0;
        if (view != popPedagogiqueActivity.I) {
            if (view == popPedagogiqueActivity.J) {
                c10 = 1;
            } else if (view == popPedagogiqueActivity.K) {
                c10 = 2;
            } else if (view == popPedagogiqueActivity.L) {
                c10 = 3;
            } else if (view == popPedagogiqueActivity.M) {
                c10 = 4;
            }
        }
        try {
            popPedagogiqueActivity.disableAdOneTime();
            z9.e.getInstance().purchaseInapp(z9.e.getInstance().getSkuInappGeniz(z9.e.getInstance().getListIdInappGeniz()[c10]), popPedagogiqueActivity);
        } catch (Exception unused) {
            popPedagogiqueActivity.closeWithError();
        }
    }
}
