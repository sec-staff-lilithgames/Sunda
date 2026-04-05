package com.bytedance.sdk.openadsdk.activity;

import a.b;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.prr;
import com.bytedance.sdk.openadsdk.core.cm.qk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTDelegateActivity extends TTBaseActivity {

    /* renamed from: cm, reason: collision with root package name */
    private static final Map<String, qk.jpo> f19186cm = b.u();

    /* renamed from: jd, reason: collision with root package name */
    private Intent f19187jd;
    dt jpo = null;
    private rv wqx;

    private void cm() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    private void my() {
        String strFxd;
        String strJpo;
        String stringExtra;
        int intExtra = this.f19187jd.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                strFxd = this.f19187jd.getStringExtra("ext_info");
                strJpo = this.f19187jd.getStringExtra("filter_words");
                stringExtra = this.f19187jd.getStringExtra("creative_info");
            } else {
                if (this.jpo == null) {
                    this.jpo = pdm.jpo().jpo(pdm.jpo(this.f19187jd));
                }
                dt dtVar = this.jpo;
                if (dtVar == null) {
                    finish();
                    return;
                } else {
                    strFxd = dtVar.fxd();
                    strJpo = com.bytedance.sdk.openadsdk.tool.jpo.jpo(this.jpo.pve());
                    stringExtra = "";
                }
            }
            jpo(strFxd, strJpo, this.f19187jd.getStringExtra("closed_listener_key"), stringExtra, this.jpo);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!oya.my()) {
            finish();
            return;
        }
        cm();
        this.f19187jd = getIntent();
        if (sq.jpo() == null) {
            sq.jd(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        rv rvVar = this.wqx;
        if (rvVar != null) {
            rvVar.jd();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (sq.jpo() == null) {
            sq.jd(this);
        }
        setIntent(intent);
        this.f19187jd = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        rv rvVar = this.wqx;
        if ((rvVar == null || ((com.bytedance.sdk.openadsdk.wqx.wqx) rvVar).jpo == null || !((com.bytedance.sdk.openadsdk.wqx.wqx) rvVar).jpo.isShowing()) && this.f19187jd != null) {
            my();
        }
    }

    public static void jpo(dt dtVar, String str, qk.jpo jpoVar) {
        if (dtVar == null) {
            return;
        }
        Intent intent = new Intent(sq.jpo(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            intent.putExtra("ext_info", dtVar.fxd());
            intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.jpo.jpo(dtVar.pve()));
            intent.putExtra("creative_info", dtVar.gum().toString());
        } else {
            intent.putExtra("meta_index", pdm.jpo().jpo(dtVar));
        }
        if (jpoVar != null) {
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                com.bytedance.sdk.openadsdk.core.zz.jd().jpo(str, jpoVar);
            } else {
                f19186cm.put(str, jpoVar);
            }
        }
        com.bytedance.sdk.component.utils.jd.jpo(sq.jpo(), intent, null);
    }

    public static void jpo(dt dtVar, String str) {
        jpo(dtVar, str, null);
    }

    private void jpo(String str, String str2, final String str3, String str4, dt dtVar) {
        TTDelegateActivity tTDelegateActivity;
        if (str2 == null || str == null || this.wqx != null) {
            tTDelegateActivity = this;
        } else {
            tTDelegateActivity = this;
            com.bytedance.sdk.openadsdk.wqx.wqx wqxVar = new com.bytedance.sdk.openadsdk.wqx.wqx(tTDelegateActivity, str, com.bytedance.sdk.openadsdk.tool.jpo.jpo(str2), str4, dtVar);
            tTDelegateActivity.wqx = wqxVar;
            wqxVar.jpo(str3);
            tTDelegateActivity.wqx.jpo(new rv.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.rv.jpo
                public void jpo(int i10, String str5) {
                    qk.jpo jpoVarMy;
                    if (TTDelegateActivity.f19186cm != null && TTDelegateActivity.f19186cm.size() > 0 && !TextUtils.isEmpty(str3) && !com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                        qk.jpo jpoVar = (qk.jpo) TTDelegateActivity.f19186cm.get(str3);
                        if (jpoVar != null) {
                            jpoVar.jpo();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (jpoVarMy = com.bytedance.sdk.openadsdk.core.zz.jd().my(str3)) != null) {
                        jpoVarMy.jpo();
                        com.bytedance.sdk.openadsdk.core.zz.jd().jj(str3);
                    }
                    TTDelegateActivity.this.jpo(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.rv.jpo
                public void jpo() {
                    if (!((com.bytedance.sdk.openadsdk.wqx.wqx) TTDelegateActivity.this.wqx).wqx()) {
                        TTDelegateActivity.this.jpo(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.wqx.wqx) TTDelegateActivity.this.wqx).jpo(false);
                }
            });
        }
        rv rvVar = tTDelegateActivity.wqx;
        if (rvVar != null) {
            rvVar.jpo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str) {
        Map<String, qk.jpo> map = f19186cm;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (prr.cm()) {
            map.size();
        }
    }
}
