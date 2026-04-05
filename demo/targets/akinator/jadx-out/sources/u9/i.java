package u9;

import ca.m;
import ca.v;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import lb.b1;
import on.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i implements ca.j {

    /* renamed from: b, reason: collision with root package name */
    public final PostProposeActivity f88165b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88166c = false;

    /* renamed from: e, reason: collision with root package name */
    public FirebaseAnalytics f88167e;

    public i(PostProposeActivity postProposeActivity) {
        this.f88165b = postProposeActivity;
    }

    public void manageRewardedVideoListener() {
        PostProposeActivity postProposeActivity = this.f88165b;
        this.f88167e = FirebaseAnalytics.getInstance(postProposeActivity);
        if (!ca.k.getInstance().isRewardedReady()) {
            new da.f(postProposeActivity).setTypeOk(b1.sharedInstance().getTraductionFromToken("PAS_DE_VIDEO_DISPONIBLE"));
            return;
        }
        m.sharedInstance().setCanSendAnalytics(false);
        postProposeActivity.disableAdOneTime();
        postProposeActivity.runOnUiThread(new w(this, 18));
        ca.k.getInstance().showRewarded(postProposeActivity);
        v.sharedInstance().doublePoints(this.f88167e);
    }

    public void onCreate() {
        ca.k.getInstance().addRewardedVideoListener(this);
        this.f88166c = false;
    }

    public void onDestroy() {
        ca.k.getInstance().removeRewardedVideoListener(this);
    }

    @Override // ca.j
    public void onReady() {
        this.f88165b.majIcon(true);
    }

    public void onResume() {
        this.f88165b.majIcon(ca.k.getInstance().isRewardedReady() && !this.f88166c);
    }

    @Override // ca.j
    public void onRewardEarned() {
        PostProposeActivity postProposeActivity = this.f88165b;
        postProposeActivity.setCandAddGz(true);
        postProposeActivity.majIcon(false);
        this.f88166c = true;
        if (postProposeActivity.isAkiResumed()) {
            postProposeActivity.traiteRewarded();
        }
    }

    public void onPause() {
    }
}
