package com.bytedance.sdk.component.adexpress.dynamic.jpo;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.cm;
import com.bytedance.sdk.component.adexpress.dynamic.cm.xyk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cif;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hmu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hna;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hx;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ju;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.kln;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nmd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.opi;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oya;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pdm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.prr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rv;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.se;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sz;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uu;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wqx;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.yd;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zz;
import com.bytedance.sdk.component.adexpress.jd.au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static my jpo(Context context, DynamicRootView dynamicRootView, xyk xykVar) {
        au renderRequest;
        if (context == null || dynamicRootView == null || xykVar == null || xykVar.yd() == null) {
            return null;
        }
        switch (xykVar.yd().jpo()) {
            case -1:
                return new uu(context, dynamicRootView, xykVar);
            case 0:
                return new nq(context, dynamicRootView, xykVar);
            case 1:
                return new ju(context, dynamicRootView, xykVar);
            case 2:
                return new qk(context, dynamicRootView, xykVar);
            case 3:
                return new zz(context, dynamicRootView, xykVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.au(context, dynamicRootView, xykVar);
            case 5:
                return new oya(context, dynamicRootView, xykVar);
            case 6:
            case 9:
            case 17:
                return new jj(context, dynamicRootView, xykVar);
            case 7:
                return new kln(context, dynamicRootView, xykVar);
            case 8:
                return new opi(context, dynamicRootView, xykVar);
            case 10:
                return new hna(context, dynamicRootView, xykVar);
            case 11:
                return new hmu(context, dynamicRootView, xykVar);
            case 12:
                return new yd(context, dynamicRootView, xykVar);
            case 13:
                return new se(context, dynamicRootView, xykVar);
            case 14:
                return new hx(context, dynamicRootView, xykVar);
            case 15:
                return cm.jd() ? new pdm(context, dynamicRootView, xykVar) : new rv(context, dynamicRootView, xykVar);
            case 16:
                return new ju(context, dynamicRootView, xykVar);
            case 18:
                return new dt(context, dynamicRootView, xykVar);
            case 19:
                return new tu(context, dynamicRootView, xykVar);
            case 20:
                return new nmd(context, dynamicRootView, xykVar);
            case 21:
                return new rq(context, dynamicRootView, xykVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xyk(context, dynamicRootView, xykVar);
            case 23:
                return new sq(context, dynamicRootView, xykVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cm(context, dynamicRootView, xykVar);
            case 25:
                return new Cif(context, dynamicRootView, xykVar);
            case 26:
                return "vertical".equals(xykVar.yd().my().gmx()) ? new sz(context, dynamicRootView, xykVar) : new wqx(context, dynamicRootView, xykVar);
            case 27:
                return new rv(context, dynamicRootView, xykVar);
            case 28:
                if (!cm.jd() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new prr(context, dynamicRootView, xykVar, renderRequest.hmu());
            default:
                return null;
        }
    }
}
