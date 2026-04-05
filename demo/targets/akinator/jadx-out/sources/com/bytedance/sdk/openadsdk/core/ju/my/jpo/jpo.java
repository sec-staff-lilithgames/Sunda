package com.bytedance.sdk.openadsdk.core.ju.my.jpo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.cm.jj;
import com.bytedance.adsdk.ugeno.jd.wqx;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.adsdk.ugeno.cm.jd.jpo {
    public jpo(wqx wqxVar, String str, jj.jpo jpoVar) {
        super(wqxVar, str, jpoVar);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jd.jpo
    public void jpo() {
        wqx wqxVar;
        wqx wqxVarJd;
        Map<String, String> map = this.f17693jj;
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = this.f17693jj.get("id");
        if (TextUtils.isEmpty(str) || (wqxVarJd = (wqxVar = this.wqx).jd(wqxVar)) == null) {
            return;
        }
        wqx wqxVarCm = wqxVarJd.cm(str);
        if (wqxVarCm instanceof com.bytedance.sdk.openadsdk.core.ju.jd.jpo.jpo) {
            com.bytedance.sdk.openadsdk.core.ju.jd.jpo.jpo jpoVar = (com.bytedance.sdk.openadsdk.core.ju.jd.jpo.jpo) wqxVarCm;
            jpoVar.cm();
            jpoVar.jpo(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.ju.my.jpo.jpo.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    jpo.this.wqx();
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jd.jpo
    public void jd() {
    }
}
