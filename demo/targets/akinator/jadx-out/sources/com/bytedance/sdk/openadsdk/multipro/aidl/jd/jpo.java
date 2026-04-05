package com.bytedance.sdk.openadsdk.multipro.aidl.jd;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.jpo.cm.jd jpo;

    public jpo(com.bytedance.sdk.openadsdk.jpo.cm.jd jdVar) {
        this.jpo = jdVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.jpo.2
            @Override // java.lang.Runnable
            public void run() {
                if (jpo.this.jpo != null) {
                    jpo.this.jpo.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                if (jpo.this.jpo != null) {
                    jpo.this.jpo.jpo();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.jpo.3
            @Override // java.lang.Runnable
            public void run() {
                if (jpo.this.jpo != null) {
                    jpo.this.jpo.jd();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.jpo.4
            @Override // java.lang.Runnable
            public void run() {
                if (jpo.this.jpo != null) {
                    jpo.this.jpo.wqx();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() throws RemoteException {
        jpo();
    }

    private void jpo() {
        this.jpo = null;
    }
}
