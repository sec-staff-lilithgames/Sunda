package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.jj.cm mAdLogo;
    private com.bytedance.sdk.openadsdk.core.jj.xyk mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, dt dtVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(dtVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iJd = va.jd(context, 2.0f);
        this.containerHeight = va.jd(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(va.jd(context, 14.0f), va.jd(context, 6.0f));
        layoutParams.leftMargin = iJd;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iJd;
        layoutParams2.rightMargin = iJd;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iJd);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(dt dtVar) {
        if (dtVar == null) {
            return;
        }
        initData(dtVar.mb());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.jj.zz.jpo(this, layoutParams));
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.jd jdVar) {
        if (jdVar == null) {
            return;
        }
        if (jdVar.my()) {
            this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo(), "tt_ad_logo"));
        } else {
            String strJpo = jdVar.jpo();
            if (TextUtils.isEmpty(strJpo)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strJpo.contains("logo")) {
                    this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.zz.cm.jpo(strJpo).wqx(1).jpo(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strJd = jdVar.jd();
        if (jdVar.my()) {
            this.mAdText.setText(com.bytedance.sdk.component.utils.dt.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(strJd)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(strJd);
            this.mAdText.setVisibility(0);
        }
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }
}
