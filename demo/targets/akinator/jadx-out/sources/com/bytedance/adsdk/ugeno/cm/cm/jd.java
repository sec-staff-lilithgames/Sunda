package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends wqx implements com.bytedance.adsdk.ugeno.jpo.jd {

    /* renamed from: ju, reason: collision with root package name */
    private String f17673ju;

    public jd(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd
    public void jd() {
        com.bytedance.adsdk.ugeno.cm.ju juVar;
        if ((TextUtils.equals(this.f17673ju, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || TextUtils.isEmpty(this.f17673ju)) && (juVar = this.jpo) != null) {
            juVar.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        com.bytedance.adsdk.ugeno.jd.wqx wqxVar;
        com.bytedance.adsdk.ugeno.jd.wqx wqxVarJd;
        com.bytedance.adsdk.ugeno.jpo.jpo jpoVarYd;
        Map<String, String> map = this.my;
        if (map != null && map.size() > 0) {
            String str = this.my.get("name");
            this.f17673ju = this.my.get("state");
            if (!TextUtils.isEmpty(str) && (wqxVarJd = (wqxVar = this.f17681jd).jd(wqxVar)) != null && (jpoVarYd = wqxVarJd.jj(str).yd(str)) != null) {
                jpoVarYd.jpo(this);
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.jd
    public void jpo() {
        com.bytedance.adsdk.ugeno.cm.ju juVar;
        if ((TextUtils.equals(this.f17673ju, "start") || TextUtils.isEmpty(this.f17673ju)) && (juVar = this.jpo) != null) {
            juVar.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
        }
    }
}
