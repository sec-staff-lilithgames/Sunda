package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.hna;
import com.bytedance.sdk.openadsdk.core.widget.sq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx extends com.bytedance.sdk.openadsdk.core.jj.qk {

    /* renamed from: cm, reason: collision with root package name */
    PAGLogoView f20116cm;

    /* renamed from: if, reason: not valid java name */
    com.bytedance.sdk.openadsdk.core.widget.wqx f112if;

    /* renamed from: jd, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.jj.wqx f20117jd;

    /* renamed from: jj, reason: collision with root package name */
    sq f20118jj;
    com.bytedance.sdk.openadsdk.core.jj.cm jpo;

    /* renamed from: ju, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.jj.xyk f20119ju;
    com.bytedance.sdk.openadsdk.core.jj.xyk my;

    /* renamed from: qk, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.jj.xyk f20120qk;
    com.bytedance.sdk.openadsdk.core.jj.cm wqx;
    final qk xyk;

    /* renamed from: yd, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.core.jj.xyk f20121yd;
    sq zz;

    public wqx(Context context) {
        super(context);
        this.xyk = new qk(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.jj.cm getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.f20116cm;
    }

    public abstract com.bytedance.sdk.openadsdk.core.jj.xyk getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.jj.cm getBackImage() {
        return this.jpo;
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk getClickButton() {
        return this.my;
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk getContent() {
        return this.f20119ju;
    }

    public com.bytedance.sdk.openadsdk.core.widget.wqx getDspAdChoice() {
        return this.f112if;
    }

    public sq getHostAppIcon() {
        return this.f20118jj;
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk getHostAppName() {
        return this.f20120qk;
    }

    public sq getIconOnlyView() {
        return this.zz;
    }

    public com.bytedance.sdk.openadsdk.core.jj.cm getImageView() {
        return this.wqx;
    }

    public com.bytedance.sdk.openadsdk.core.jj.my getOverlayLayout() {
        return null;
    }

    public abstract hna getScoreBar();

    public com.bytedance.sdk.openadsdk.core.jj.xyk getTitle() {
        return this.f20121yd;
    }

    public com.bytedance.sdk.openadsdk.core.jj.xyk getTopCountDown() {
        qk qkVar = this.xyk;
        if (qkVar != null) {
            return qkVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        qk qkVar = this.xyk;
        if (qkVar != null) {
            return qkVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.jj.cm getTopSkip() {
        qk qkVar = this.xyk;
        if (qkVar != null) {
            return qkVar.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.jj.wqx getVideoContainer() {
        return this.f20117jd;
    }
}
