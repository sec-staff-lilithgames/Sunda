package com.bytedance.sdk.openadsdk.multipro.aidl.jpo;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile cm f21278jd;
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> jpo = new ConcurrentHashMap<>();

    public static cm jpo() {
        if (f21278jd == null) {
            synchronized (cm.class) {
                try {
                    if (f21278jd == null) {
                        f21278jd = new cm();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21278jd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) throws RemoteException {
        jpo(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) throws RemoteException {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        jpo.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) throws RemoteException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        jpo.remove(str);
    }

    private synchronized void jpo(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = jpo;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i10);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (Throwable th2) {
                        nmd.jpo("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th3) {
            nmd.jpo("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th3);
        }
    }
}
