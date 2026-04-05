package com.bytedance.adsdk.ugeno.zz.my;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.jd.wqx;
import cv.BLca.YsiBvdpw;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd extends wqx<jpo> {

    /* renamed from: lq, reason: collision with root package name */
    private static final int f18103lq = Color.parseColor(YsiBvdpw.qBje);
    private static final int uhu = Color.parseColor("#e3e3e4");
    private float ez;

    /* renamed from: gf, reason: collision with root package name */
    private int f18104gf;
    private int jpo;
    private float jrx;
    private float kgu;

    public jd(Context context) {
        super(context);
        this.jpo = f18103lq;
        this.f18104gf = uhu;
        this.ez = 4.0f;
        this.kgu = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        if (sz()) {
            ((jpo) this.my).jpo(this.ez, this.jpo, this.f18104gf, this.kgu, (int) this.jrx);
        } else {
            ((jpo) this.my).jpo(this.ez, this.jpo, this.f18104gf, this.kgu, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public jpo jpo() {
        jpo jpoVar = new jpo(this.f17811jd);
        jpoVar.jpo(this);
        return jpoVar;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        super.jpo(str, str2);
        str.getClass();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.jpo = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.f18104gf = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2, uhu);
                break;
            case "gap":
                this.jrx = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case "size":
                this.kgu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 20.0f);
                break;
            case "score":
                this.ez = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 4.0f);
                break;
        }
    }
}
