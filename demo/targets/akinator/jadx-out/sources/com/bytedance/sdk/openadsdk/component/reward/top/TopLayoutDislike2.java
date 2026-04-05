package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.core.jj.cm;
import com.bytedance.sdk.openadsdk.core.jj.my;
import com.bytedance.sdk.openadsdk.core.jj.xyk;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.jj;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.va;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class TopLayoutDislike2 extends my implements jpo<TopLayoutDislike2> {
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private cm mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private my mPlayableNextAd;
    private CharSequence mProgressStr;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private jd mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        cm cmVar = new cm(getContext());
        int iJd = va.jd(getContext(), 5.0f);
        cmVar.setPadding(iJd, iJd, iJd, iJd);
        cmVar.setScaleType(ImageView.ScaleType.CENTER);
        cmVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jpo());
        return cmVar;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.jd(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TopLayoutDislike2.this.mIsSoundMute = !r0.mIsSoundMute;
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(TopLayoutDislike2.this.mSkipIV != null ? TopLayoutDislike2.this.mIsSoundMute ? dt.wqx(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : dt.wqx(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute") : TopLayoutDislike2.this.mIsSoundMute ? ju.jpo(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : ju.jpo(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper"));
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.jpo(view2, tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.jpo(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.jpo(view2);
                        }
                    }
                });
            }
        }
        cm cmVar = this.mCloseBtn;
        if (cmVar != null) {
            cmVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.wqx(view2);
                    }
                }
            });
        }
        my myVar = this.mPlayableNextAd;
        if (myVar != null) {
            myVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.cm(view2);
                    }
                }
            });
        }
    }

    private void initView(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        int iJd = va.jd(getContext(), 16.0f);
        int iJd2 = va.jd(getContext(), 20.0f);
        int iJd3 = va.jd(getContext(), 28.0f);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iJd3, iJd3);
        layoutParams.leftMargin = iJd;
        layoutParams.topMargin = iJd2;
        this.mImgSound.setId(hna.nes);
        this.mImgSound.setLayoutParams(layoutParams);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iJd3, iJd3);
        layoutParams2.topMargin = iJd2;
        layoutParams2.leftMargin = iJd;
        this.mImgDislike.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        xyk xykVar = new xyk(getContext());
        this.mTextViewCountDown = xykVar;
        xykVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jd());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, va.jd(getContext(), 28.0f));
        layoutParams4.topMargin = va.jd(getContext(), 20.0f);
        int iJd4 = va.jd(getContext(), 16.0f);
        layoutParams2.rightMargin = iJd4;
        layoutParams4.rightMargin = iJd4;
        int iJd5 = va.jd(getContext(), 12.0f);
        va.jd(getContext(), 5.0f);
        this.mTextViewCountDown.setPadding(iJd5, 0, iJd5, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        my myVar = new my(getContext());
        this.mPlayableNextAd = myVar;
        myVar.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, iJd3);
        layoutParams5.topMargin = va.jd(getContext(), 20.0f);
        if (dtVar == null || !dtVar.by()) {
            layoutParams5.rightMargin = va.jd(getContext(), 16.0f);
        } else {
            layoutParams5.rightMargin = va.jd(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.cm.jd());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new xyk(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, va.jd(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(iJd5, 0, 0, 0);
        String strRq = rv.rq(dtVar);
        if (TextUtils.isEmpty(strRq)) {
            this.mNextAdTextTv.setText(dt.jd(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(strRq);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        cm cmVar = new cm(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iJd5, iJd5);
        layoutParams7.rightMargin = iJd5;
        cmVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        cmVar.setLayoutParams(layoutParams7);
        cmVar.setImageResource(dt.cm(sq.jpo(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(cmVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(iJd3, iJd3);
        layoutParams8.topMargin = iJd2;
        layoutParams8.rightMargin = iJd;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        cm cmVarJd = jj.jd(getContext());
        this.mCloseBtn = cmVarJd;
        cmVarJd.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = va.jd(getContext(), 20.0f);
        layoutParams9.rightMargin = va.jd(getContext(), 24.0f);
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(dt.jpo(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        addView(this.mImgSound);
        addView(this.mImgDislike);
        addView(view);
        addView(this.mPlayableNextAd);
        addView(this.mTextViewCountDown);
        addView(this.mSkipIV);
        addView(this.mCloseBtn);
    }

    private void updateTime(boolean z10) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z10) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setListener(jd jdVar) {
        this.mTopListener = jdVar;
    }

    public void setShouldShowSkipTime(boolean z10) {
        this.shouldShowSkipTime = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowDislike(boolean z10) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowEndCardNextAd(boolean z10, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        my myVar = this.mPlayableNextAd;
        if (myVar != null) {
            myVar.setVisibility(z10 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z10 || dtVar == null || dtVar.zx() == null) {
                return;
            }
            String strWqx = dtVar.zx().wqx();
            if (TextUtils.isEmpty(strWqx)) {
                return;
            }
            this.mNextAdTextTv.setText(strWqx);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowPlayableNextAd(boolean z10, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        my myVar = this.mPlayableNextAd;
        if (myVar != null) {
            myVar.setVisibility(z10 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z10) {
                return;
            }
            String strRq = rv.rq(dtVar);
            if (TextUtils.isEmpty(strRq)) {
                this.mNextAdTextTv.setText(dt.jd(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(strRq);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowSkip(boolean z10) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z10) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z10;
        this.mSkipIV.setVisibility((z10 && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z10 & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setShowSound(boolean z10) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setSkipEnable(boolean z10) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z10);
            this.mSkipIV.setClickable(z10);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z10);
            this.mTextViewCountDown.setClickable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i10 = this.skipTime;
            int i11 = i10 == 0 ? Integer.parseInt(str) : i10 - (this.videoDuration - Integer.parseInt(str));
            if (i11 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i11 + ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2 load(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        initView(dtVar);
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(dt.cm(sq.jpo(), "tt_reward_full_feedback"));
        if (!au.jrx().au(String.valueOf(dtVar.jl())) || dtVar.jkt() == 5 || dtVar.jkt() == 6) {
            this.mSkipIV.setImageResource(dt.cm(sq.jpo(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(dt.cm(sq.jpo(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = dtVar.ww() == null ? 0 : dtVar.ww().tu() * ((int) dtVar.ww().jj());
        if (nmd.cm(dtVar) && dtVar.nmd() != null) {
            this.videoDuration = (int) dtVar.nmd().jd();
        } else if (nmd.qk(dtVar) && dtVar.nmd() != null) {
            this.videoDuration = (int) dtVar.nmd().cm();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (dtVar.cxb() != 8 || dtVar.gmx() == null) {
            this.skipTime = dtVar.hf();
        } else {
            this.skipTime = dtVar.rc();
        }
        if (rv.wqx(dtVar)) {
            this.skipTime = dtVar.ow();
            this.videoDuration = dtVar.gox();
        }
        int i10 = this.skipTime;
        this.shouldShowSkipTime = i10 == -1 || i10 >= this.videoDuration;
        if (dtVar.ig()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.jpo
    public void setSoundMute(boolean z10) {
        this.mIsSoundMute = z10;
        this.mImgSound.setImageDrawable(this.mSkipIV != null ? z10 ? dt.wqx(getContext(), "tt_reward_full_mute") : dt.wqx(getContext(), gjnZrsdA.uSJpZN) : z10 ? ju.jpo(getContext(), "tt_mute_wrapper") : ju.jpo(getContext(), "tt_unmute_wrapper"));
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mProgressStr = "";
        setOrientation(0);
    }
}
