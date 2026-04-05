package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.video.module.MBridgeContainerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class m extends e {

    /* renamed from: a, reason: collision with root package name */
    private MBridgeContainerView f45238a;

    public m(MBridgeContainerView mBridgeContainerView) {
        this.f45238a = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
        super.configurationChanged(i10, i11, i12);
        try {
            MBridgeContainerView mBridgeContainerView = this.f45238a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.configurationChanged(i10, i11, i12);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f45238a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.endCardShowing();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return super.endCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        super.hideAlertWebview();
        MBridgeContainerView mBridgeContainerView = this.f45238a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.hideAlertWebview();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        super.ivRewardAdsWithoutVideo(str);
        MBridgeContainerView mBridgeContainerView = this.f45238a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.ivRewardAdsWithoutVideo(str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        try {
            MBridgeContainerView mBridgeContainerView = this.f45238a;
            if (mBridgeContainerView != null) {
                return mBridgeContainerView.miniCardShowing();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return super.miniCardShowing();
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        try {
            MBridgeContainerView mBridgeContainerView = this.f45238a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.readyStatus(i10);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        super.readyStatus(i10);
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        super.resizeMiniCard(i10, i11, i12);
        try {
            MBridgeContainerView mBridgeContainerView = this.f45238a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.resizeMiniCard(i10, i11, i12);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        super.showAlertWebView();
        MBridgeContainerView mBridgeContainerView = this.f45238a;
        if (mBridgeContainerView != null) {
            return mBridgeContainerView.showAlertWebView();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        super.showEndcard(i10);
        try {
            MBridgeContainerView mBridgeContainerView = this.f45238a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showEndcard(i10);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        super.showMiniCard(i10, i11, i12, i13, i14);
        try {
            MBridgeContainerView mBridgeContainerView = this.f45238a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showMiniCard(i10, i11, i12, i13, i14);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        super.showVideoClickView(i10);
        MBridgeContainerView mBridgeContainerView = this.f45238a;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.showVideoClickView(i10);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.e, com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        super.showVideoEndCover();
        try {
            MBridgeContainerView mBridgeContainerView = this.f45238a;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.showVideoEndCover();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
