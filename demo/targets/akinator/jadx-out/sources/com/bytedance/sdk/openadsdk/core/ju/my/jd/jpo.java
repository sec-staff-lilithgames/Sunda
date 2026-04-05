package com.bytedance.sdk.openadsdk.core.ju.my.jd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.adsdk.ugeno.cm.cm.wqx {

    /* renamed from: ju, reason: collision with root package name */
    private String f20557ju;

    public jpo(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJd;
        Map<String, String> map = this.my;
        if (map != null && map.size() > 0) {
            String str = this.my.get("id");
            this.f20557ju = this.my.get("state");
            if (TextUtils.isEmpty(str) || (wqxVarJd = (wqxVar = this.f17681jd).jd(wqxVar)) == null) {
                return false;
            }
            com.bytedance.adsdk.ugeno.jd.wqx wqxVarCm = wqxVarJd.cm(str);
            if (wqxVarCm instanceof com.bytedance.sdk.openadsdk.core.ju.jd.jpo.jpo) {
                ((com.bytedance.sdk.openadsdk.core.ju.jd.jpo.jpo) wqxVarCm).jpo(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.ju.my.jd.jpo.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (!TextUtils.equals(jpo.this.f20557ju, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || ((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).jpo == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).jpo.jpo(((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).f17681jd, ((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).f17682jj, ((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).wqx.jd());
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        if (!TextUtils.equals(jpo.this.f20557ju, "start") || ((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).jpo == null) {
                            return;
                        }
                        ((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).jpo.jpo(((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).f17681jd, ((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).f17682jj, ((com.bytedance.adsdk.ugeno.cm.cm.wqx) jpo.this).wqx.jd());
                    }
                });
            }
        }
        return false;
    }
}
