package com.bytedance.sdk.openadsdk.multipro.aidl.jd;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.cm.qk;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.wqx.yd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends IDislikeClosedListener.Stub {

    /* renamed from: jd, reason: collision with root package name */
    private final String f21273jd;
    private final qk.jpo jpo;

    public jd(String str, qk.jpo jpoVar) {
        this.f21273jd = str;
        this.jpo = jpoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() throws RemoteException {
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jd.jd.1
            @Override // java.lang.Runnable
            public void run() {
                if (jd.this.jpo != null) {
                    jd.this.jpo.jpo();
                    yd.jpo(6, jd.this.f21273jd);
                }
            }
        });
    }
}
