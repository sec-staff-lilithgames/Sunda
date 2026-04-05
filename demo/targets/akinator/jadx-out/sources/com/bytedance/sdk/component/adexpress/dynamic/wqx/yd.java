package com.bytedance.sdk.component.adexpress.dynamic.wqx;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class yd {
    public static qk jpo(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my myVar, com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar, com.bytedance.sdk.component.adexpress.dynamic.cm.yd ydVar, com.bytedance.sdk.component.adexpress.jd.au auVar) {
        String strRoc;
        String strHmu;
        if (context == null || myVar == null || qkVar == null) {
            return null;
        }
        strRoc = qkVar.roc();
        strHmu = auVar.hmu();
        strRoc.getClass();
        switch (strRoc) {
            case "0":
                return new my(context, myVar, qkVar);
            case "1":
                return new wqx(context, myVar, qkVar);
            case "2":
                return new jd(context, myVar, qkVar);
            case "5":
                return qkVar.xk() == 1 ? new sq(context, myVar, qkVar, qkVar.et()) : new hna(context, myVar, qkVar);
            case "6":
            case "11":
                return new oya(context, myVar, qkVar);
            case "7":
            case "14":
                return new Cif(context, myVar, qkVar);
            case "8":
                return new au(context, myVar, qkVar);
            case "9":
            case "16":
                return new prr(context, myVar, qkVar, strRoc, ydVar.jpo(), ydVar.jd(), ydVar.cm(), ydVar.qk());
            case "10":
                return new cm(context, myVar, qkVar);
            case "12":
                return new hna(context, myVar, qkVar);
            case "13":
                return new sq(context, myVar, qkVar);
            case "17":
            case "18":
                return new jr(context, myVar, qkVar, strRoc, ydVar);
            case "20":
                if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                    return new ju(context, myVar, qkVar, o2.l(strHmu, "static/lotties/glass-swipe/glass-swipe.json"), "20");
                }
                return new ju(context, myVar, qkVar, TextUtils.isEmpty(strHmu) ? null : o2.l(strHmu, "brush_mask.json"), "20");
            case "22":
                return com.bytedance.sdk.component.adexpress.cm.jd() ? new ju(context, myVar, qkVar, o2.l(strHmu, "static/lotties/202327swiper-up-star/index.json"), "22") : new opi(context, myVar, qkVar);
            case "23":
                if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                    return new ju(context, myVar, qkVar, o2.l(strHmu, "static/lotties/202327swiper-up-star/click.json"), "23");
                }
                return null;
            case "24":
                if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                    return new jpo(context, myVar, qkVar);
                }
                return new ju(context, myVar, qkVar, TextUtils.isEmpty(strHmu) ? null : o2.l(strHmu, duhsDlGWdBkekB.ZtitQJ), "24");
            case "25":
                if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                    return new ju(context, myVar, qkVar, o2.l(strHmu, "static/lotties/gesture-slide.json"), "25");
                }
                return null;
            case "29":
                return new jj(context, myVar, qkVar, ydVar.jpo(), ydVar.jd(), ydVar.cm(), ydVar.qk());
            default:
                return null;
        }
    }
}
