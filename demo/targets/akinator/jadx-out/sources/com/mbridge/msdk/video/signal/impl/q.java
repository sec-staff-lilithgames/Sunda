package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.video.module.MBridgeVideoView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class q extends r {
    public q(MBridgeVideoView mBridgeVideoView) {
        this.f45242a = mBridgeVideoView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.alertWebViewShowed();
        } else {
            super.alertWebViewShowed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        super.closeVideoOperate(i10, i11);
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.closeVideoOperate(i10, i11);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.dismissAllAlert();
        } else {
            super.dismissAllAlert();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        return mBridgeVideoView != null ? mBridgeVideoView.getBorderViewHeight() : super.getBorderViewHeight();
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        return mBridgeVideoView != null ? mBridgeVideoView.getBorderViewLeft() : super.getBorderViewLeft();
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        return mBridgeVideoView != null ? mBridgeVideoView.getBorderViewRadius() : super.getBorderViewRadius();
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        return mBridgeVideoView != null ? mBridgeVideoView.getBorderViewTop() : super.getBorderViewTop();
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        return mBridgeVideoView != null ? mBridgeVideoView.getBorderViewWidth() : super.getBorderViewWidth();
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        return mBridgeVideoView != null ? mBridgeVideoView.getCurrentProgress() : super.getCurrentProgress();
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.hideAlertView(i10);
        } else {
            super.hideAlertView(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        return mBridgeVideoView != null ? mBridgeVideoView.isH5Canvas() : super.isH5Canvas();
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        super.progressBarOperate(i10);
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.progressBarOperate(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        super.progressOperate(i10, i11);
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.progressOperate(i10, i11);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(z10);
        } else {
            super.setCover(z10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setMiniEndCardState(z10);
        } else {
            super.setMiniEndCardState(z10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setScaleFitXY(i10);
        } else {
            super.setScaleFitXY(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setVisible(i10);
        } else {
            super.setVisible(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.showAlertView();
        } else {
            super.showAlertView();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.showIVRewardAlertView(str);
        } else {
            super.showIVRewardAlertView(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        super.showVideoLocation(i10, i11, i12, i13, i14, i15, i16, i17, i18);
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.showVideoLocation(i10, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        super.soundOperate(i10, i11);
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.soundOperate(i10, i11);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        super.videoOperate(i10);
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.videoOperate(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.h, com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        super.soundOperate(i10, i11, str);
        MBridgeVideoView mBridgeVideoView = this.f45242a;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.soundOperate(i10, i11, str);
        }
    }
}
