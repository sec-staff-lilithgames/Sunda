package u9;

import ca.m;
import ca.v;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import lb.b1;
import on.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements ca.j {

    /* renamed from: b, reason: collision with root package name */
    public final DefiDuJourActivity f88156b;

    /* renamed from: c, reason: collision with root package name */
    public FirebaseAnalytics f88157c;

    public b(DefiDuJourActivity defiDuJourActivity) {
        this.f88156b = defiDuJourActivity;
    }

    public void manageRewardedVideoListener() {
        DefiDuJourActivity defiDuJourActivity = this.f88156b;
        this.f88157c = FirebaseAnalytics.getInstance(defiDuJourActivity);
        if (!ca.k.getInstance().isRewardedReady()) {
            new da.f(defiDuJourActivity).setTypeOk(b1.sharedInstance().getTraductionFromToken("PAS_DE_VIDEO_DISPONIBLE"));
            return;
        }
        m.sharedInstance().setCanSendAnalytics(false);
        defiDuJourActivity.disableAdOneTime();
        defiDuJourActivity.runOnUiThread(new w(this, 16));
        ca.k.getInstance().showRewarded(defiDuJourActivity);
        v.sharedInstance().doublePoints(this.f88157c);
    }

    public void onCreate() {
        ca.k.getInstance().addRewardedVideoListener(this);
    }

    public void onDestroy() {
        ca.k.getInstance().removeRewardedVideoListener(this);
    }

    @Override // ca.j
    public void onRewardEarned() {
        DefiDuJourActivity defiDuJourActivity = this.f88156b;
        defiDuJourActivity.setCandAddGz(true);
        if (defiDuJourActivity.isAkiResumed()) {
            defiDuJourActivity.traiteAddGz();
        }
    }

    public void onPause() {
    }

    @Override // ca.j
    public void onReady() {
    }

    public void onResume() {
    }
}
