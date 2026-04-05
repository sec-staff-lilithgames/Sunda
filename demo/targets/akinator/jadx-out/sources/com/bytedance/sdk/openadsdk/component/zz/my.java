package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.hna;
import com.bytedance.sdk.openadsdk.core.zz.my;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends wqx {

    /* renamed from: au, reason: collision with root package name */
    jpo f20114au;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(View view, int i10);
    }

    public my(Context context, dt dtVar) {
        super(context);
        jpo(context, dtVar);
    }

    private void jpo(Context context, dt dtVar) {
        com.bytedance.sdk.openadsdk.core.zz.my myVar = new com.bytedance.sdk.openadsdk.core.zz.my(context);
        com.bytedance.sdk.openadsdk.core.zz.cm.jpo().wqx(myVar);
        myVar.jpo(dtVar, new my.jd() { // from class: com.bytedance.sdk.openadsdk.component.zz.my.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.my.jd
            public void jpo(int i10, int i11) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.my.jd
            public View jpo() {
                return my.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.my.jd
            public void jpo(View view, int i10) {
                jpo jpoVar = my.this.f20114au;
                if (jpoVar != null) {
                    jpoVar.jpo(view, i10);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.zz.my.jd
            public void jd() {
            }
        }, "open_ad");
        addView(myVar, new ViewGroup.LayoutParams(-1, -1));
        myVar.nmd();
        int iJd = va.jd(context, 9.0f);
        int iJd2 = va.jd(context, 10.0f);
        this.f20116cm = PAGLogoView.createPAGLogoViewByMaterial(context, dtVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, va.jd(context, 14.0f));
        layoutParams.leftMargin = iJd2;
        layoutParams.bottomMargin = iJd2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.f20116cm, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.widget.wqx(context);
        this.f112if = wqxVar;
        wqxVar.setPadding(iJd, 0, iJd, 0);
        this.f112if.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(va.jd(context, 32.0f), va.jd(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iJd2, iJd2);
        addView(this.f112if, layoutParams2);
        View view = this.xyk;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public com.bytedance.sdk.openadsdk.core.jj.cm getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public com.bytedance.sdk.openadsdk.core.jj.xyk getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public hna getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20114au = null;
    }

    public void setRenderListener(jpo jpoVar) {
        this.f20114au = jpoVar;
    }
}
