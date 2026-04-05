package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq extends jpo {

    /* renamed from: au, reason: collision with root package name */
    private nmd f21136au;
    private FrameLayout jpo;
    private FrameLayout oya;

    public sq(Context context) {
        super(context);
        this.f21072jd = context;
    }

    private void jd() {
        this.f21075qk = va.jd(this.f21072jd, this.f21136au.getExpectExpressWidth());
        this.xyk = va.jd(this.f21072jd, this.f21136au.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f21075qk, this.xyk);
        }
        layoutParams.width = this.f21075qk;
        layoutParams.height = this.xyk;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.wqx.wu();
        wqx();
    }

    private void wqx() {
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(this.f21072jd);
        this.jpo = wqxVar;
        addView(wqxVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(this.f21072jd);
        this.oya = wqxVar2;
        this.jpo.addView(wqxVar2, new FrameLayout.LayoutParams(-1, -1));
        this.oya.removeAllViews();
    }

    public View getBackupContainerBackgroundView() {
        return this.jpo;
    }

    public FrameLayout getVideoContainer() {
        return this.oya;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, nmd nmdVar, ViewGroup viewGroup) {
        if (dtVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.wqx = dtVar;
        this.f21136au = nmdVar;
        if (dtVar.cxb() == 7) {
            this.f21073jj = "rewarded_video";
        } else {
            this.f21073jj = "fullscreen_interstitial_ad";
        }
        jd();
        if (com.bytedance.sdk.openadsdk.core.model.nmd.wqx(dtVar)) {
            this.f21136au.addView(this, new ViewGroup.LayoutParams(-1, -1));
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f21136au.addView(this, layoutParams);
        }
        int i10 = com.bytedance.sdk.openadsdk.utils.hna.pez;
        View viewFindViewById = viewGroup.findViewById(i10);
        if (viewFindViewById != null) {
            Object tag = viewFindViewById.getTag(i10);
            if (tag instanceof String) {
                String str = (String) tag;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(str, viewFindViewById);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.jpo
    public void jpo(View view, int i10, com.bytedance.sdk.openadsdk.core.model.hna hnaVar) {
        nmd nmdVar = this.f21136au;
        if (nmdVar != null) {
            nmdVar.jpo(view, i10, hnaVar);
        }
    }
}
