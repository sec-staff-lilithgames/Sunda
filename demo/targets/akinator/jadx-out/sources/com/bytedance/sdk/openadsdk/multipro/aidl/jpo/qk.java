package com.bytedance.sdk.openadsdk.multipro.aidl.jpo;

import a.b;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class qk extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile qk f21281jd;
    private static final Map<String, RemoteCallbackList<IRewardAdInteractionListener>> jpo = b.u();

    public static qk jpo() {
        if (f21281jd == null) {
            synchronized (qk.class) {
                try {
                    if (f21281jd == null) {
                        f21281jd = new qk();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21281jd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeRewardVideoCallback(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) throws RemoteException {
        jpo(str, str2, z10, i10, str3, i11, str4);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerRewardVideoListener(String str, IRewardAdInteractionListener iRewardAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iRewardAdInteractionListener);
        jpo.put(str, remoteCallbackList);
    }

    private synchronized void jpo(String str, String str2, boolean z10, int i10, String str3, int i11, String str4) {
        RemoteCallbackList<IRewardAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IRewardAdInteractionListener>> map = jpo;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                if (remoteCallbackListRemove != null) {
                    int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
                    for (int i12 = 0; i12 < iBeginBroadcast; i12++) {
                        try {
                            IRewardAdInteractionListener iRewardAdInteractionListener = (IRewardAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i12);
                            if (iRewardAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iRewardAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iRewardAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iRewardAdInteractionListener.onAdVideoBarClick();
                                } else if ("onRewardVerify".equals(str2)) {
                                    iRewardAdInteractionListener.onRewardVerify(z10, i10, str3, i11, str4);
                                } else if ("recycleRes".equals(str2)) {
                                    iRewardAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th2) {
                            nmd.jpo("MultiProcess", "reward1 '" + str2 + RnJusJ.PFJaBQmqoe, th2);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            nmd.jpo("MultiProcess", "reward2 '" + str2 + "'  throws Exception :", th3);
        }
    }
}
