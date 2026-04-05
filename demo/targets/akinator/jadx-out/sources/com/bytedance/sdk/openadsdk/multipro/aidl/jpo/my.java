package com.bytedance.sdk.openadsdk.multipro.aidl.jpo;

import a.b;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile my f21280jd;
    private static final Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> jpo = b.u();

    public static my jpo() {
        if (f21280jd == null) {
            synchronized (my.class) {
                try {
                    if (f21280jd == null) {
                        f21280jd = new my();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21280jd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeFullVideoCallback(String str, String str2) throws RemoteException {
        jpo(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerFullVideoListener(String str, IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iFullScreenVideoAdInteractionListener);
        jpo.put(str, remoteCallbackList);
    }

    private synchronized void jpo(String str, String str2) {
        RemoteCallbackList<IFullScreenVideoAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IFullScreenVideoAdInteractionListener>> map = jpo;
            if (map != null) {
                if ("recycleRes".equals(str2)) {
                    remoteCallbackListRemove = map.remove(str);
                } else {
                    remoteCallbackListRemove = map.get(str);
                }
                if (remoteCallbackListRemove != null) {
                    int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
                    for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                        try {
                            IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener = (IFullScreenVideoAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i10);
                            if (iFullScreenVideoAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdShow();
                                } else if ("onAdClose".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdClose();
                                } else if ("onAdVideoBarClick".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onAdVideoBarClick();
                                } else if ("recycleRes".equals(str2)) {
                                    iFullScreenVideoAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th2) {
                            nmd.jpo("MultiProcess", "fullScreen2 method " + str2 + " throws Exception :", th2);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            nmd.jpo("MultiProcess", "fullScreen1 method " + str2 + " throws Exception :", th3);
        }
    }
}
