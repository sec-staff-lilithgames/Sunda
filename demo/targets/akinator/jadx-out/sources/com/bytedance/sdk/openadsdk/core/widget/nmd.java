package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.au.jd.jpo f20949cm;

    /* renamed from: jd, reason: collision with root package name */
    private TextView f20950jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f20951jj = false;
    private View jpo;
    private jd my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd f20952qk;
    private Context wqx;
    private ViewGroup xyk;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        void ju();

        boolean yd();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    private void cm() {
        View view = this.jpo;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx() {
        if (this.wqx == null) {
            return;
        }
        cm();
    }

    private void jd() {
        this.f20952qk = null;
    }

    public void jpo(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.xyk = viewGroup;
        this.wqx = com.bytedance.sdk.openadsdk.core.sq.jpo().getApplicationContext();
    }

    private void jpo(Context context, View view, boolean z10) {
        ViewGroup.LayoutParams layoutParamsJpo;
        if (context == null || view == null || this.jpo != null || (layoutParamsJpo = jpo(this.xyk)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.oya.prr prrVar = new com.bytedance.sdk.openadsdk.oya.prr(context);
        this.jpo = prrVar;
        prrVar.setLayoutParams(layoutParamsJpo);
        this.xyk.addView(this.jpo);
        this.f20950jd = (TextView) this.jpo.findViewById(com.bytedance.sdk.openadsdk.utils.hna.hd);
        View viewFindViewById = this.jpo.findViewById(com.bytedance.sdk.openadsdk.utils.hna.xur);
        if (z10) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.nmd.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    nmd.this.wqx();
                    if (nmd.this.f20949cm != null) {
                        nmd.this.f20949cm.jpo(jpo.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams jpo(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.au.jd.jpo jpoVar, jd jdVar) {
        this.my = jdVar;
        this.f20949cm = jpoVar;
    }

    public boolean jpo(int i10, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar, boolean z10) {
        Context context = this.wqx;
        if (context == null || jdVar == null) {
            return true;
        }
        jpo(context, this.xyk, z10);
        this.f20952qk = jdVar;
        if (i10 == 1 || i10 == 2) {
            return jpo(i10);
        }
        return true;
    }

    private boolean jpo(int i10) {
        jd jdVar;
        if (jpo() || this.f20951jj) {
            return true;
        }
        if (this.f20949cm != null && (jdVar = this.my) != null) {
            if (jdVar.yd()) {
                this.f20949cm.my(null, null);
            }
            this.f20949cm.jpo(jpo.PAUSE_VIDEO, (String) null);
        }
        jpo(this.f20952qk, true);
        return false;
    }

    public void jpo(boolean z10) {
        if (z10) {
            jd();
        }
        cm();
    }

    public boolean jpo() {
        View view = this.jpo;
        return view != null && view.getVisibility() == 0;
    }

    private void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar, boolean z10) {
        View view;
        String str;
        View view2;
        if (jdVar == null || (view = this.jpo) == null || this.wqx == null || view.getVisibility() == 0) {
            return;
        }
        jd jdVar2 = this.my;
        if (jdVar2 != null) {
            jdVar2.ju();
        }
        double dCeil = Math.ceil((jdVar.my() * 1.0d) / 1048576.0d);
        if (z10) {
            str = String.format(dt.jpo(this.wqx, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = dt.jpo(this.wqx, "tt_video_without_wifi_tips") + dt.jpo(this.wqx, "tt_video_bytesize");
        }
        va.jpo(this.jpo, 0);
        va.jpo(this.f20950jd, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!va.cm(this.jpo) || (view2 = this.jpo) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
