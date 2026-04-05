package com.bytedance.sdk.openadsdk.oya;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import h2.rl.UeklptUrP;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class yd extends com.bytedance.sdk.openadsdk.core.jj.wqx {

    /* renamed from: cm, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.jj.xyk f21421cm;

    /* renamed from: jd, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.jj.cm f21422jd;

    /* renamed from: jj, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.jj.xyk f21423jj;
    protected com.bytedance.sdk.openadsdk.core.jj.wqx jpo;
    protected com.bytedance.sdk.openadsdk.core.jj.xyk my;
    protected sq wqx;

    public yd(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jpo(context);
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk cm(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_backup_btn_1"));
        xykVar.setGravity(17);
        xykVar.setText(dt.jpo(context, "tt_video_download_apk"));
        xykVar.setTextColor(-1);
        xykVar.setTextSize(2, 14.0f);
        return xykVar;
    }

    public FrameLayout getTtAdContainer() {
        return this.jpo;
    }

    public TextView getTtFullAdAppName() {
        return this.f21421cm;
    }

    public TextView getTtFullAdDesc() {
        return this.my;
    }

    public TextView getTtFullAdDownload() {
        return this.f21423jj;
    }

    public sq getTtFullAdIcon() {
        return this.wqx;
    }

    public ImageView getTtFullImg() {
        return this.f21422jd;
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk jd(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setEllipsize(TextUtils.TruncateAt.END);
        xykVar.setMaxLines(1);
        xykVar.setTextColor(Color.parseColor("#FF999999"));
        xykVar.setTextSize(2, 16.0f);
        return xykVar;
    }

    public com.bytedance.sdk.openadsdk.core.jj.cm jj(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return cmVar;
    }

    public abstract void jpo(Context context);

    public com.bytedance.sdk.openadsdk.core.jj.wqx my(Context context) {
        return new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
    }

    public sq qk(Context context) {
        sq sqVar = new sq(context);
        sqVar.setScaleType(ImageView.ScaleType.FIT_XY);
        sqVar.setBackgroundColor(0);
        return sqVar;
    }

    public PAGLogoView xyk(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk wqx(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setEllipsize(TextUtils.TruncateAt.END);
        xykVar.setMaxLines(1);
        xykVar.setSingleLine();
        xykVar.setTextColor(Color.parseColor(UeklptUrP.BAApeopI));
        xykVar.setTextSize(2, 12.0f);
        return xykVar;
    }
}
