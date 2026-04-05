package com.digidust.elokence.akinator.activities.rarecharacter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import ca.j;
import ca.k;
import ca.m;
import ca.o;
import ca.p;
import ca.r;
import ca.u;
import ca.v;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.PopuVipActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import da.f;
import jb.h;
import lb.b1;
import mt.n0;
import na.b;
import on.w;
import pt.c;
import sn.t;
import v9.a;
import z9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class OptionRareCharacterActivity extends AkActivity implements View.OnClickListener, j {
    public static final /* synthetic */ int N = 0;
    public Button C;
    public Button D;
    public Button E;
    public Button F;
    public boolean G = false;
    public c H;
    public Drawable I;
    public RelativeLayout J;
    public TextView K;
    public TextView L;
    public FirebaseAnalytics M;

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void itemPurchased(String str) {
        if (str.equals(e.getInstance().getSkuInappUltime())) {
            v.sharedInstance().passedThroughInapp(this.M);
            h.sharedInstance().createOrUpdateMetricValeur("pt_full", "1");
            t();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != this.D) {
            if (view == this.E) {
                b.playBip();
                if (!e.getInstance().isInit()) {
                    Toast.makeText(this, b1.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"), 0).show();
                    return;
                } else {
                    disableAdOneTime();
                    e.getInstance().purchaseInapp(e.getInstance().getSkuInappUltime(), this);
                    return;
                }
            }
            if (view == this.F) {
                c cVar = this.H;
                if (cVar == null || cVar.isDisposed()) {
                    displayLoader();
                    this.H = n0.create(new a(this)).observeOn(ot.c.mainThread()).subscribeOn(ou.j.newThread()).subscribe(new v9.b(this, 0), new v9.b(this, 1));
                    return;
                }
                return;
            }
            return;
        }
        b.playBip();
        if (k.getInstance().isRewardedReady()) {
            m.sharedInstance().setCanSendAnalytics(false);
            disableAdOneTime();
            u.sharedInstance().showPubTemp(false);
            k.getInstance().showRewarded(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            getWindow().addFlags(4);
            getWindow().getDecorView().addOnAttachStateChangeListener(new v9.c(this, new p(this, 7)));
        } else {
            u(false);
        }
        getWindow().addFlags(2);
        f fVar = new f(this);
        fVar.setTypeNoAdAvailable();
        fVar.setOkListener(new a(this));
        fVar.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ac  */
    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        k.getInstance().removeRewardedVideoListener(this);
        super.onDestroy();
        c cVar = this.H;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void onInitialization(boolean z10) {
        e.getInstance().requestInappDetailsUpdate(new t(8));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        updateUI();
        if (e.getInstance().isInit()) {
            e.getInstance().requestAllPurchases(null);
        } else {
            e.getInstance().init(this, null);
        }
        if (this.G) {
            v.sharedInstance().passedThroughRewarded(this.M);
            this.G = false;
            h.sharedInstance().incMetricCompteur("pt_rewarded_video");
            r.sharedInstance().incNbPopuUnlocked();
            u.sharedInstance().showPubTemp(false);
            u.sharedInstance().unlockPopuForThispPartie();
            String campaign = jb.c.sharedInstance().getCampaign("PopularityTresholdRule");
            if (campaign == null) {
                t();
                return;
            }
            if (!campaign.contains("BQ_")) {
                if (!campaign.contains("PROG_")) {
                    t();
                    return;
                }
                Intent intent = new Intent(this, (Class<?>) PopuVipActivity.class);
                intent.putExtra("mode", "prog");
                startActivity(intent);
                finish();
                return;
            }
            String[] strArrSplit = campaign.split("_");
            if (strArrSplit.length != 2) {
                t();
                return;
            }
            try {
                if (r.sharedInstance().getNbPopuUnlocked() >= Integer.parseInt(strArrSplit[1])) {
                    Intent intent2 = new Intent(this, (Class<?>) PopuVipActivity.class);
                    intent2.putExtra("mode", "fullAccess");
                    startActivity(intent2);
                    finish();
                } else {
                    t();
                }
            } catch (NumberFormatException unused) {
                t();
            }
        }
    }

    @Override // ca.j
    public void onRewardEarned() {
        this.G = true;
        if (isAkiResumed()) {
            t();
        }
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void skuDetailsUpdated() {
        runOnUiThread(new w(this, 21));
    }

    public final void t() {
        setResult(-1);
        finish();
    }

    public final void u(boolean z10) {
        this.I.setAlpha(z10 ? 170 : 255);
        getWindow().setDimAmount(z10 ? 0.1f : 0.4f);
        if (Build.VERSION.SDK_INT >= 31) {
            getWindow().setBackgroundBlurRadius(80);
            getWindow().getAttributes().setBlurBehindRadius(20);
            getWindow().setAttributes(getWindow().getAttributes());
        }
    }

    public void updateUI() {
        if (isFinishing()) {
            return;
        }
        if (!o.sharedInstance().isPopularityLimited() || o.sharedInstance().isUnlocked()) {
            this.D.setAlpha(0.5f);
            this.E.setAlpha(0.5f);
            this.D.setEnabled(false);
            this.E.setEnabled(false);
        }
    }

    @Override // ca.j
    public void onReady() {
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
