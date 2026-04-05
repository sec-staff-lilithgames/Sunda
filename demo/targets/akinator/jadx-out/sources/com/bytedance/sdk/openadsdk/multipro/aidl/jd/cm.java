package com.bytedance.sdk.openadsdk.multipro.aidl.jd;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.jpo.my.jpo jpo;

    public cm(com.bytedance.sdk.openadsdk.jpo.my.jpo jpoVar) {
        this.jpo = jpoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.cm.3
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.jpo != null) {
                    cm.this.jpo.jd();
                }
                cm.this.jpo();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.cm.1
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.jpo != null) {
                    cm.this.jpo.jpo();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.cm.2
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.jpo != null) {
                    cm.this.jpo.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z10, final int i10, final String str, final int i11, final String str2) throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.cm.4
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.jpo != null) {
                    cm.this.jpo.jpo(z10, i10, str, i11, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo() {
        this.jpo = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() throws RemoteException {
    }
}
