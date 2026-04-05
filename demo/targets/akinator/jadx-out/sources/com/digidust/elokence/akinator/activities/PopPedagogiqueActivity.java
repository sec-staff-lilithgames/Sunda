package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import bj.v0;
import mt.b0;
import o9.b3;
import o9.i4;
import o9.j4;
import o9.k4;
import o9.l4;
import o9.x;
import ot.c;
import ou.j;
import timber.log.Timber;
import u9.h;
import z9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PopPedagogiqueActivity extends AkActivity implements View.OnClickListener {
    public static final /* synthetic */ int V = 0;
    public View C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public Button I;
    public Button J;
    public Button K;
    public Button L;
    public Button M;
    public ImageView N;
    public TextView O;
    public boolean P = false;
    public boolean Q = false;
    public boolean R = false;
    public boolean S = false;
    public final h T = new h(this);
    public final k4 U = new k4(this);

    public void closeWithError() {
        r();
    }

    public void majIcon(boolean z10) {
        this.N.setEnabled(z10);
        this.N.setAlpha(z10 ? 1.0f : 0.5f);
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.C) {
            finish();
        } else if (view == this.N) {
            this.T.manageRewardedVideoListener();
        }
        if (view == this.O) {
            disableAdOneTime();
            Intent intent = new Intent(this, (Class<?>) WebviewCGV.class);
            intent.putExtra("url", "https://cgu.akinator.com/mobile/content#cgv");
            startActivity(intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03d3  */
    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digidust.elokence.akinator.activities.PopPedagogiqueActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.T.onDestroy();
        super.onDestroy();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.T.onPause();
        super.onPause();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Timber.tag("PopPeda").i("OnResume", new Object[0]);
        if (this.Q) {
            if (e.getInstance().isInit()) {
                l4 l4Var = new l4(this);
                e.getInstance().requestInappDetailsUpdate(new j4(this, l4Var));
                e.getInstance().requestAllPurchases(new j4(this, l4Var));
            } else {
                e.getInstance().init(this, new b3(this, 1));
            }
        }
        traiteRewarded();
        this.T.onResume();
    }

    public void setCandAddGz(boolean z10) {
        this.P = z10;
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, z9.a
    public void skuDetailsUpdated() {
        updateUI();
    }

    public final void t() {
        disposeAtDestruction(b0.fromCallable(new x(9)).subscribeOn(j.io()).observeOn(c.mainThread()).subscribe(new v0(this, 18)));
    }

    public void traiteRewarded() {
        runOnUiThread(new i4(this, 0));
    }

    public void updateUI() {
        runOnUiThread(new i4(this, 1));
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
