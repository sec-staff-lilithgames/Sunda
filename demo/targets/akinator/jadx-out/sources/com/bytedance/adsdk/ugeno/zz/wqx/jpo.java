package com.bytedance.adsdk.ugeno.zz.wqx;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zz.cm.wqx;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo extends wqx {
    private int jrx;

    public jpo(Context context) {
        super(context);
        this.jrx = -16777216;
    }

    private String au(String str) {
        String strJu = ju(str);
        return TextUtils.isEmpty(strJu) ? "" : "local://".concat(String.valueOf(strJu));
    }

    @Override // com.bytedance.adsdk.ugeno.zz.cm.wqx, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException, NumberFormatException {
        ((wqx) this).jpo = au(((wqx) this).jpo);
        super.jd();
        ((com.bytedance.adsdk.ugeno.zz.cm.jpo) this.my).setColorFilter(this.jrx);
        ((com.bytedance.adsdk.ugeno.zz.cm.jpo) this.my).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.zz.cm.wqx, com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        super.jpo(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.jrx = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
        }
    }

    public abstract String ju(String str);

    @Override // com.bytedance.adsdk.ugeno.zz.cm.wqx
    public String wqx() {
        return "drawable";
    }
}
