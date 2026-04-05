package com.bytedance.sdk.openadsdk.core.ju.my.jd;

import android.content.Context;
import com.bytedance.adsdk.ugeno.cm.ju;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends com.bytedance.adsdk.ugeno.cm.cm.wqx {

    /* renamed from: ju, reason: collision with root package name */
    private boolean f20558ju;

    public wqx(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        Map<String, String> map = this.my;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.f20558ju = false;
        }
        if (this.my.containsKey("percent")) {
            float fJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("percent"), -1.0f);
            if (fJpo >= 0.0f && jLongValue >= (fJpo / 100.0f) * jLongValue2 && !this.f20558ju) {
                this.f20558ju = true;
                ju juVar = this.jpo;
                if (juVar != null) {
                    juVar.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
                }
            }
        } else if (jLongValue >= com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("interval"), -1) && !this.f20558ju) {
            this.f20558ju = true;
            ju juVar2 = this.jpo;
            if (juVar2 != null) {
                juVar2.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
            }
        }
        return true;
    }
}
