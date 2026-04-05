package com.bytedance.adsdk.ugeno.cm.cm;

import android.content.Context;
import b0.e2;
import com.bytedance.adsdk.ugeno.cm.jj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends wqx {

    /* renamed from: au, reason: collision with root package name */
    private int f17685au;

    /* renamed from: if, reason: not valid java name */
    private int f29if;

    /* renamed from: ju, reason: collision with root package name */
    private int f17686ju;

    public xyk(Context context) {
        super(context);
        this.f17686ju = -1;
        this.f29if = -1;
        this.f17685au = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.cm.cm.wqx
    public boolean jpo(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(String.valueOf(objArr[0]), -1);
            int iJpo2 = com.bytedance.adsdk.ugeno.qk.wqx.jpo(String.valueOf(objArr[1]), -1);
            int iJpo3 = com.bytedance.adsdk.ugeno.qk.wqx.jpo(String.valueOf(objArr[2]), -1);
            Map<String, String> map = this.my;
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                e2.v(iJpo, map2, "fromIndex", iJpo2, "toIndex");
                map2.put("type", Integer.valueOf(iJpo3));
                Iterator<jj.jpo> it = this.wqx.jd().iterator();
                while (it.hasNext()) {
                    it.next().jd(map2);
                }
                this.jpo.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
            } else {
                this.f17686ju = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("fromIndex"), -1);
                this.f29if = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("toIndex"), -1);
                int iJpo4 = com.bytedance.adsdk.ugeno.qk.wqx.jpo(this.my.get("type"), -1);
                this.f17685au = iJpo4;
                if (iJpo == this.f17686ju && iJpo2 == this.f29if && iJpo3 == iJpo4) {
                    this.jpo.jpo(this.f17681jd, this.f17682jj, this.wqx.jd());
                }
            }
        }
        return false;
    }
}
