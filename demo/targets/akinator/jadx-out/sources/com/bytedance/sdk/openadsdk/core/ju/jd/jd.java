package com.bytedance.sdk.openadsdk.core.ju.jd;

import android.content.Context;
import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.adsdk.ugeno.zz.jj.jd {
    private String ez;
    private String kgu;

    public jd(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.zz.jj.jd, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        if (TextUtils.isEmpty(this.kgu) || TextUtils.equals(this.kgu, AbstractJsonLexerKt.NULL)) {
            this.kgu = "";
        }
        if (TextUtils.isEmpty(this.ez) || TextUtils.equals(this.ez, AbstractJsonLexerKt.NULL)) {
            this.ez = "";
        }
        String str = this.ez + this.kgu;
        ((com.bytedance.adsdk.ugeno.zz.jj.jd) this).jpo = str;
        ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setText(str);
        ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.zz.jj.jd, com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        super.jpo(str, str2);
        str.getClass();
        if (str.equals("before")) {
            this.ez = str2;
        } else if (str.equals("after")) {
            this.kgu = str2;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zz.jj.jd
    public void ju(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, AbstractJsonLexerKt.NULL)) {
            str = "";
        }
        if (TextUtils.isEmpty(this.kgu) || TextUtils.equals(this.kgu, AbstractJsonLexerKt.NULL)) {
            this.kgu = "";
        }
        if (TextUtils.isEmpty(this.ez) || TextUtils.equals(this.ez, AbstractJsonLexerKt.NULL)) {
            this.ez = "";
        }
        String str2 = this.ez + str + this.kgu;
        ((com.bytedance.adsdk.ugeno.zz.jj.jd) this).jpo = str2;
        ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setText(str2);
        try {
            float f10 = this.kln ? this.f17808hx : this.f17827se;
            float f11 = this.f17801ef ? this.pdm : this.f17827se;
            float fMeasureText = ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).getPaint().measureText(((com.bytedance.adsdk.ugeno.zz.jj.jd) this).jpo);
            if (fMeasureText >= 0.0f) {
                my((int) (f10 + fMeasureText + f11));
            }
        } catch (Throwable unused) {
        }
    }
}
