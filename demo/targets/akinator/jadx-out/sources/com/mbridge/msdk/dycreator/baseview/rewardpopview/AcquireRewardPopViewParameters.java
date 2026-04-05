package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class AcquireRewardPopViewParameters {
    public AcquireRewardPopViewBehaviourListener behaviourListener;
    public String failTip;
    public String failTitle;
    public String language;
    public String placementId;
    public List<String> rightAnswerList;
    public String slideSuccessTitle;
    public String slideTip;
    public String slideTitle;
    public String successTip;
    public String successTitle;
    public String tips;
    public String title;
    public String unitId;
    public int viewType;
    public List<String> wrongAnswerList;
    public int autoDismissTime = 5;
    public int reduceTime = 0;
    public boolean canClickMaskArea = true;
    public int viewBackLayerTopColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFC27A;
    public int viewBackLayerBottomColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FF932B;
    public int viewForegroundTopColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBE2;
    public int viewForegroundBottomColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFE0B5;
    public int buttonBackgroundLightColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FF8B00;
    public int buttonBackgroundDarkColor = AcquireRewardPopViewConst.DEFAULT_COLOR_33EF7601;
    public int titleTextColor = AcquireRewardPopViewConst.DEFAULT_COLOR_E56F19;
    public int tipTextColor = AcquireRewardPopViewConst.DEFAULT_COLOR_89664C;
    public int buttonTextLightColor = -1;
    public int buttonTextDarkColor = AcquireRewardPopViewConst.DEFAULT_COLOR_D26700;
    public int successTipTextColor = -1;
    public int failTipTextColor = -1;
    public int containerBackgroundColor = AcquireRewardPopViewConst.DEFAULT_COLOR_50000000;
    public int successTitleGradientStartColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
    public int successTitleGradientEndColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
    public int successTitleShadowColor = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
    public int successTitleTextSize = 40;
    public float successTitleShadowRadius = 3.0f;
    public float successTitleShadowDx = 1.5f;
    public float successTitleShadowDy = 1.8f;
    public int failTitleGradientStartColor = -1;
    public int failTitleGradientEndColor = AcquireRewardPopViewConst.DEFAULT_COLOR_8B6B45;
    public int failTitleShadowColor = AcquireRewardPopViewConst.DEFAULT_COLOR_3B3127;
    public int failTitleTextSize = 40;
    public float failTitleShadowRadius = 3.0f;
    public float failTitleShadowDx = 1.5f;
    public float failTitleShadowDy = 1.8f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private AcquireRewardPopViewParameters f40056a;

        public Builder(String str, String str2, int i10, String str3) {
            AcquireRewardPopViewParameters acquireRewardPopViewParameters = new AcquireRewardPopViewParameters();
            this.f40056a = acquireRewardPopViewParameters;
            acquireRewardPopViewParameters.placementId = str;
            acquireRewardPopViewParameters.unitId = str2;
            acquireRewardPopViewParameters.viewType = i10;
            acquireRewardPopViewParameters.language = str3;
            a(str3);
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(java.lang.String r6) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewParameters.Builder.a(java.lang.String):void");
        }

        public AcquireRewardPopViewParameters build() {
            return this.f40056a;
        }

        public Builder setAutoDismissTime(int i10) {
            this.f40056a.autoDismissTime = i10;
            return this;
        }

        public Builder setBehaviourListener(AcquireRewardPopViewBehaviourListener acquireRewardPopViewBehaviourListener) {
            this.f40056a.behaviourListener = acquireRewardPopViewBehaviourListener;
            return this;
        }

        public Builder setButtonBackgroundDarkColor(int i10) {
            this.f40056a.buttonBackgroundDarkColor = i10;
            return this;
        }

        public Builder setButtonBackgroundLightColor(int i10) {
            this.f40056a.buttonBackgroundLightColor = i10;
            return this;
        }

        public Builder setButtonTextDarkColor(int i10) {
            this.f40056a.buttonTextDarkColor = i10;
            return this;
        }

        public Builder setButtonTextLightColor(int i10) {
            this.f40056a.buttonTextLightColor = i10;
            return this;
        }

        public Builder setCanClickMaskArea(boolean z10) {
            this.f40056a.canClickMaskArea = z10;
            return this;
        }

        public Builder setContainerBackgroundColor(int i10) {
            this.f40056a.containerBackgroundColor = i10;
            return this;
        }

        public Builder setFailTip(String str) {
            this.f40056a.failTip = str;
            return this;
        }

        public Builder setFailTipTextColor(int i10) {
            this.f40056a.failTipTextColor = i10;
            return this;
        }

        public Builder setFailTitle(String str) {
            this.f40056a.failTitle = str;
            return this;
        }

        public Builder setFailTitleGradientEndColor(int i10) {
            this.f40056a.failTitleGradientEndColor = i10;
            return this;
        }

        public Builder setFailTitleGradientStartColor(int i10) {
            this.f40056a.failTitleGradientStartColor = i10;
            return this;
        }

        public Builder setFailTitleShadowColor(int i10) {
            this.f40056a.failTitleShadowColor = i10;
            return this;
        }

        public Builder setFailTitleShadowDx(float f10) {
            this.f40056a.failTitleShadowDx = f10;
            return this;
        }

        public Builder setFailTitleShadowDy(float f10) {
            this.f40056a.failTitleShadowDy = f10;
            return this;
        }

        public Builder setFailTitleShadowRadius(float f10) {
            this.f40056a.failTitleShadowRadius = f10;
            return this;
        }

        public Builder setFailTitleTextSize(int i10) {
            this.f40056a.failTitleTextSize = i10;
            return this;
        }

        public Builder setReduceTime(int i10) {
            this.f40056a.reduceTime = i10;
            return this;
        }

        public Builder setRightAnswerList(ArrayList<String> arrayList) {
            this.f40056a.rightAnswerList = arrayList;
            return this;
        }

        public Builder setSlideSuccessTitle(String str) {
            this.f40056a.slideSuccessTitle = str;
            return this;
        }

        public Builder setSlideTip(String str) {
            this.f40056a.slideTip = str;
            return this;
        }

        public Builder setSlideTitle(String str) {
            this.f40056a.slideTitle = str;
            return this;
        }

        public Builder setSuccessTip(String str) {
            this.f40056a.successTip = str;
            return this;
        }

        public Builder setSuccessTipTextColor(int i10) {
            this.f40056a.successTipTextColor = i10;
            return this;
        }

        public Builder setSuccessTitle(String str) {
            this.f40056a.successTitle = str;
            return this;
        }

        public Builder setSuccessTitleGradientEndColor(int i10) {
            this.f40056a.successTitleGradientEndColor = i10;
            return this;
        }

        public Builder setSuccessTitleGradientStartColor(int i10) {
            this.f40056a.successTitleGradientStartColor = i10;
            return this;
        }

        public Builder setSuccessTitleShadowColor(int i10) {
            this.f40056a.successTitleShadowColor = i10;
            return this;
        }

        public Builder setSuccessTitleShadowDx(float f10) {
            this.f40056a.successTitleShadowDx = f10;
            return this;
        }

        public Builder setSuccessTitleShadowDy(float f10) {
            this.f40056a.successTitleShadowDy = f10;
            return this;
        }

        public Builder setSuccessTitleShadowRadius(float f10) {
            this.f40056a.successTitleShadowRadius = f10;
            return this;
        }

        public Builder setSuccessTitleTextSize(int i10) {
            this.f40056a.successTitleTextSize = i10;
            return this;
        }

        public Builder setTipTextColor(int i10) {
            this.f40056a.tipTextColor = i10;
            return this;
        }

        public Builder setTips(String str) {
            this.f40056a.tips = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.f40056a.title = str;
            return this;
        }

        public Builder setTitleTextColor(int i10) {
            this.f40056a.titleTextColor = i10;
            return this;
        }

        public Builder setViewBackLayerBottomColor(int i10) {
            this.f40056a.viewBackLayerBottomColor = i10;
            return this;
        }

        public Builder setViewBackLayerTopColor(int i10) {
            this.f40056a.viewBackLayerTopColor = i10;
            return this;
        }

        public Builder setViewForegroundBottomColor(int i10) {
            this.f40056a.viewForegroundBottomColor = i10;
            return this;
        }

        public Builder setViewForegroundTopColor(int i10) {
            this.f40056a.viewForegroundTopColor = i10;
            return this;
        }

        public Builder setWrongAnswerList(ArrayList<String> arrayList) {
            this.f40056a.wrongAnswerList = arrayList;
            return this;
        }
    }

    public static Builder builder(String str, String str2, int i10, String str3) {
        if (TextUtils.isEmpty(str2)) {
            p0.b("AcquireRewardPopViewParameters", "Unit id must not null.");
            return null;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new Builder(str, str2, i10, str3);
    }
}
