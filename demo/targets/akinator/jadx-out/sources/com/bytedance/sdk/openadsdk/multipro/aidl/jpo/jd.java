package com.bytedance.sdk.openadsdk.multipro.aidl.jpo;

import a.b;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.ironsource.Mf;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile jd f21279jd;
    private static final Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> jpo = b.u();

    public static jd jpo() {
        if (f21279jd == null) {
            synchronized (jd.class) {
                try {
                    if (f21279jd == null) {
                        f21279jd = new jd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21279jd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeAppOpenAdCallback(String str, String str2) throws RemoteException {
        jpo(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerAppOpenAdListener(String str, IAppOpenAdInteractionListener iAppOpenAdInteractionListener) throws RemoteException {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iAppOpenAdInteractionListener);
        jpo.put(str, remoteCallbackList);
    }

    private synchronized void jpo(String str, String str2) {
        RemoteCallbackList<IAppOpenAdInteractionListener> remoteCallbackListRemove;
        try {
            Map<String, RemoteCallbackList<IAppOpenAdInteractionListener>> map = jpo;
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
                            IAppOpenAdInteractionListener iAppOpenAdInteractionListener = (IAppOpenAdInteractionListener) remoteCallbackListRemove.getBroadcastItem(i10);
                            if (iAppOpenAdInteractionListener != null) {
                                if ("onAdShow".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdShow();
                                } else if (Mf.f34998f.equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdClicked();
                                } else if ("onAdSkip".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdSkip();
                                } else if ("onAdTimeOver".equals(str2)) {
                                    iAppOpenAdInteractionListener.onAdTimeOver();
                                } else if ("recycleRes".equals(str2)) {
                                    iAppOpenAdInteractionListener.onDestroy();
                                }
                            }
                        } catch (Throwable th2) {
                            nmd.jpo("MultiProcess", "appOpenAd2 method " + str2 + " throws Exception :", th2);
                        }
                    }
                    remoteCallbackListRemove.finishBroadcast();
                    if ("recycleRes".equals(str2)) {
                        remoteCallbackListRemove.kill();
                    }
                }
            }
        } catch (Throwable th3) {
            nmd.jpo("MultiProcess", "appOpenAd1 method " + str2 + " throws Exception :", th3);
        }
    }
}
