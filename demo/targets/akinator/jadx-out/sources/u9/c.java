package u9;

import android.widget.ImageView;
import ca.m;
import lb.b1;
import o9.v0;
import on.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c implements ca.j {

    /* renamed from: b, reason: collision with root package name */
    public final v0 f88158b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88159c = false;

    /* renamed from: e, reason: collision with root package name */
    public aa.e f88160e = null;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f88161f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f88162g = null;

    public c(v0 v0Var) {
        this.f88158b = v0Var;
    }

    public void onFragmentCreate() {
        ca.k.getInstance().addRewardedVideoListener(this);
    }

    public void onFragmentDestroy() {
        ca.k.getInstance().removeRewardedVideoListener(this);
    }

    public void onResume() {
        if (this.f88160e != null && this.f88159c) {
            this.f88159c = false;
            jb.h.sharedInstance().incMetricCompteur("nb_unlocked_clues_rv");
            aa.f.sharedInstance().unlockIndice(this.f88160e);
            v0 v0Var = this.f88158b;
            if (v0Var.getActivity() != null) {
                v0Var.getActivity().runOnUiThread(new w(this, 17));
            }
            v0Var.displayIndice(this.f88162g);
        }
        m.sharedInstance().setCanSendAnalytics(true);
        na.a.sharedInstance();
        na.a.playMusic();
    }

    @Override // ca.j
    public void onRewardEarned() {
        this.f88159c = true;
        if (this.f88158b.isResumed()) {
            onResume();
        }
    }

    public void showRewardedVideo(aa.e eVar, ImageView imageView, String str) {
        this.f88160e = eVar;
        this.f88161f = imageView;
        this.f88162g = str;
        boolean zIsRewardedReady = ca.k.getInstance().isRewardedReady();
        v0 v0Var = this.f88158b;
        if (!zIsRewardedReady) {
            new da.f(v0Var.requireActivity()).setTypeOk(b1.sharedInstance().getTraductionFromToken("CHARGEMENT"));
            return;
        }
        v0Var.getActivityMaster().disableAdOneTime();
        m.sharedInstance().setCanSendAnalytics(false);
        ca.k.getInstance().showRewarded(v0Var.requireActivity());
    }

    @Override // ca.j
    public void onReady() {
    }
}
