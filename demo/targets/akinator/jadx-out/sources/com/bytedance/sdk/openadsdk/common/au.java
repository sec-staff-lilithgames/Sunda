package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.jpo.jj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.zz.jj f19707cm;

    /* renamed from: jd, reason: collision with root package name */
    private RelativeLayout f19708jd;

    /* renamed from: jj, reason: collision with root package name */
    private final String f19709jj;
    private final dt jpo;
    private ImageView my;

    /* renamed from: qk, reason: collision with root package name */
    private opi f19710qk;
    private final Context wqx;
    private hna xyk;

    public au(Context context, dt dtVar, String str) {
        this.wqx = context;
        this.jpo = dtVar;
        this.f19709jj = str;
        jj();
    }

    private void jj() {
        RelativeLayout relativeLayoutJpo = jpo(this.wqx);
        this.f19708jd = relativeLayoutJpo;
        this.f19707cm = (com.bytedance.sdk.component.zz.jj) relativeLayoutJpo.findViewById(com.bytedance.sdk.openadsdk.utils.hna.xk);
        opi opiVar = new opi(this.wqx, (RelativeLayout) this.f19708jd.findViewById(com.bytedance.sdk.openadsdk.utils.hna.cql), this.jpo);
        this.f19710qk = opiVar;
        this.my = opiVar.wqx();
        this.xyk = new hna(this.wqx, (LinearLayout) this.f19708jd.findViewById(com.bytedance.sdk.openadsdk.utils.hna.aix), this.f19707cm, this.jpo, this.f19709jj);
    }

    private static RelativeLayout jpo(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new zz(context));
        com.bytedance.sdk.component.zz.jj jjVar = new com.bytedance.sdk.component.zz.jj(context);
        jjVar.setId(com.bytedance.sdk.openadsdk.utils.hna.xk);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        layoutParams.addRule(3, com.bytedance.sdk.openadsdk.utils.hna.cql);
        relativeLayout.addView(jjVar, layoutParams);
        xyk xykVar = new xyk(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(xykVar.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(xykVar, layoutParams2);
        return relativeLayout;
    }

    public com.bytedance.sdk.component.zz.jj cm() {
        return this.f19707cm;
    }

    public void jd() {
        opi opiVar = this.f19710qk;
        if (opiVar != null) {
            opiVar.jd();
        }
        hna hnaVar = this.xyk;
        if (hnaVar != null) {
            hnaVar.jd();
        }
    }

    public View my() {
        return this.f19708jd;
    }

    public ImageView wqx() {
        return this.my;
    }

    public void jpo() {
        opi opiVar = this.f19710qk;
        if (opiVar != null) {
            opiVar.jpo();
        }
        hna hnaVar = this.xyk;
        if (hnaVar != null) {
            hnaVar.jpo();
        }
    }

    public void jpo(WebView webView, int i10, jj.jpo jpoVar) {
        opi opiVar = this.f19710qk;
        if (opiVar != null) {
            opiVar.jpo(i10);
        }
        hna hnaVar = this.xyk;
        if (hnaVar != null) {
            hnaVar.jpo(webView, jpoVar);
        }
    }
}
