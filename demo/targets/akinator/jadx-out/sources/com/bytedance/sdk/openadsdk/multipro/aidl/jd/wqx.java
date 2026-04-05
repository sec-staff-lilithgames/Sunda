package com.bytedance.sdk.openadsdk.multipro.aidl.jd;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.jpo.wqx.jd jpo;

    public wqx(com.bytedance.sdk.openadsdk.jpo.wqx.jd jdVar) {
        this.jpo = jdVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.wqx.3
            @Override // java.lang.Runnable
            public void run() {
                if (wqx.this.jpo != null) {
                    wqx.this.jpo.jd();
                }
                wqx.this.jpo();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.wqx.1
            @Override // java.lang.Runnable
            public void run() {
                if (wqx.this.jpo != null) {
                    wqx.this.jpo.jpo();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() throws RemoteException {
        if (this.jpo == null) {
            return;
        }
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.wqx.2
            @Override // java.lang.Runnable
            public void run() {
                if (wqx.this.jpo != null) {
                    wqx.this.jpo.onAdClicked();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo() {
        this.jpo = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() throws RemoteException {
    }
}
