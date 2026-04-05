package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.core.dm;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.utils.prr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTAdActivity extends TTBaseActivity {
    private jd jpo;

    private void wqx() {
        jd jdVar = this.jpo;
        if (jdVar == null) {
            super.onBackPressed();
        } else {
            jdVar.jj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void jd() {
        wqx();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean jpo() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.jpo((Activity) this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        wqx();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVarJd = pdm.jpo().jd();
        com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVarWqx = pdm.jpo().wqx();
        dt dtVarJpo = com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.au.cm.jd) null);
        if (dtVarJpo == null) {
            finish();
            return;
        }
        jd jdVar = new jd(this, dtVarJpo);
        this.jpo = jdVar;
        jdVar.jpo(this, bundle, jpoVarJd, jdVarWqx);
        com.bytedance.sdk.openadsdk.utils.jd.jpo(dtVarJpo);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.my(this);
        }
        pdm.jpo().jpo((com.bytedance.sdk.openadsdk.jpo.my.jpo) null);
        pdm.jpo().jpo((com.bytedance.sdk.openadsdk.jpo.wqx.jd) null);
        prr.jpo();
        dm.jpo().jpo(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.wqx(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.jd(this);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.jpo(this, bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.jpo(this);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.cm(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.jpo(z10);
        }
    }
}
