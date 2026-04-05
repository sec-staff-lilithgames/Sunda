package com.bytedance.sdk.openadsdk.multipro.aidl.jpo;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile wqx f21282jd;
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> jpo = new HashMap<>();

    public static wqx jpo() {
        if (f21282jd == null) {
            synchronized (wqx.class) {
                try {
                    if (f21282jd == null) {
                        f21282jd = new wqx();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21282jd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) throws RemoteException {
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackListRemove = jpo.remove(str);
        if (remoteCallbackListRemove == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
        for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
            ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remoteCallbackListRemove.getBroadcastItem(i10);
            if (iCommonPermissionListener != null) {
                if (str2 == null) {
                    iCommonPermissionListener.onGranted();
                } else {
                    iCommonPermissionListener.onDenied(str2);
                }
            }
        }
        remoteCallbackListRemove.finishBroadcast();
        remoteCallbackListRemove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) throws RemoteException {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        jpo.put(str, remoteCallbackList);
    }
}
