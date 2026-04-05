package u9;

import ca.m;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h implements ca.j {

    /* renamed from: b, reason: collision with root package name */
    public final PopPedagogiqueActivity f88164b;

    public h(PopPedagogiqueActivity popPedagogiqueActivity) {
        this.f88164b = popPedagogiqueActivity;
    }

    public void manageRewardedVideoListener() {
        boolean zIsRewardedReady = ca.k.getInstance().isRewardedReady();
        PopPedagogiqueActivity popPedagogiqueActivity = this.f88164b;
        if (!zIsRewardedReady) {
            new da.f(popPedagogiqueActivity).setTypeOk(b1.sharedInstance().getTraductionFromToken("PAS_DE_VIDEO_DISPONIBLE"));
            return;
        }
        m.sharedInstance().setCanSendAnalytics(false);
        popPedagogiqueActivity.disableAdOneTime();
        popPedagogiqueActivity.majIcon(false);
        ca.k.getInstance().showRewarded(popPedagogiqueActivity);
    }

    public void onCreate() {
        ca.k.getInstance().addRewardedVideoListener(this);
    }

    public void onDestroy() {
        ca.k.getInstance().removeRewardedVideoListener(this);
    }

    @Override // ca.j
    public void onReady() {
        this.f88164b.majIcon(true);
    }

    public void onResume() {
        this.f88164b.majIcon(ca.k.getInstance().isRewardedReady());
    }

    @Override // ca.j
    public void onRewardEarned() {
        PopPedagogiqueActivity popPedagogiqueActivity = this.f88164b;
        popPedagogiqueActivity.setCandAddGz(true);
        popPedagogiqueActivity.majIcon(false);
        if (popPedagogiqueActivity.isAkiResumed()) {
            popPedagogiqueActivity.traiteRewarded();
        }
    }

    public void onPause() {
    }
}
