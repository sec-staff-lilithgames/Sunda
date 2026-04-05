package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: cm, reason: collision with root package name */
    private boolean f19865cm;

    /* renamed from: jd, reason: collision with root package name */
    private final dt f19866jd;
    com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jpo;
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo my;
    private final String wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, int i10, int i11, int i12);

        void jpo(String str, JSONObject jSONObject);
    }

    public cm(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.my = jpoVar;
        this.f19866jd = jpoVar.f19914jd;
        this.wqx = jpoVar.my;
    }

    private void cm() {
        if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx() && this.f19866jd.pzk() == 4) {
            this.jpo = com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(this.my.f19920pe, this.wqx);
        }
        if (this.jpo == null) {
            this.jpo = com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(this.my.vrc, this.wqx);
        }
    }

    public void jd() {
        com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj jjVar = this.jpo;
        if (jjVar != null) {
            jjVar.wqx(this.f19866jd);
        }
    }

    public void jpo() {
        if (this.f19865cm) {
            return;
        }
        this.f19865cm = true;
        cm();
    }

    public com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj wqx() {
        return this.jpo;
    }

    public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, int i10, int i11, int i12, jpo jpoVar) {
        if (this.jpo != null) {
            int id2 = view.getId();
            if (id2 == com.bytedance.sdk.openadsdk.utils.hna.my) {
                jpoVar.jpo("click_play_star_level", null);
                return;
            }
            if (id2 == com.bytedance.sdk.openadsdk.utils.hna.f21515cm) {
                jpoVar.jpo("click_play_star_nums", null);
                return;
            } else if (id2 == com.bytedance.sdk.openadsdk.utils.hna.wqx) {
                jpoVar.jpo("click_play_source", null);
                return;
            } else {
                if (id2 == com.bytedance.sdk.openadsdk.utils.hna.f21530jd) {
                    jpoVar.jpo("click_play_logo", null);
                    return;
                }
                return;
            }
        }
        jpoVar.jpo(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }
}
