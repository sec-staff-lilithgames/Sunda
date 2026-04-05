package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class InitializationNotificationCenter implements IInitializationNotificationCenter {
    private static InitializationNotificationCenter instance;
    private HashMap<Integer, IInitializationListener> _sdkListeners = new HashMap<>();

    public static InitializationNotificationCenter getInstance() {
        if (instance == null) {
            instance = new InitializationNotificationCenter();
        }
        return instance;
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void addListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                try {
                    this._sdkListeners.put(new Integer(iInitializationListener.hashCode()), iInitializationListener);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void removeListener(IInitializationListener iInitializationListener) {
        synchronized (this._sdkListeners) {
            if (iInitializationListener != null) {
                try {
                    removeListener(new Integer(iInitializationListener.hashCode()));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitializationFailed(String str, ErrorState errorState, int i10) throws Throwable {
        final ErrorState errorState2;
        final int i11;
        synchronized (this._sdkListeners) {
            try {
                try {
                    final String str2 = "SDK Failed to Initialize due to " + str;
                    DeviceLog.error(str2);
                    ArrayList arrayList = new ArrayList();
                    for (final Map.Entry<Integer, IInitializationListener> entry : this._sdkListeners.entrySet()) {
                        if (entry.getValue() != null) {
                            errorState2 = errorState;
                            i11 = i10;
                            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((IInitializationListener) entry.getValue()).onSdkInitializationFailed(str2, errorState2, i11);
                                }
                            });
                        } else {
                            errorState2 = errorState;
                            i11 = i10;
                            arrayList.add(entry.getKey());
                        }
                        errorState = errorState2;
                        i10 = i11;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        this._sdkListeners.remove((Integer) it.next());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitialized() {
        synchronized (this._sdkListeners) {
            try {
                ArrayList arrayList = new ArrayList();
                for (final Map.Entry<Integer, IInitializationListener> entry : this._sdkListeners.entrySet()) {
                    if (entry.getValue() != null) {
                        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.configuration.InitializationNotificationCenter.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((IInitializationListener) entry.getValue()).onSdkInitialized();
                            }
                        });
                    } else {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this._sdkListeners.remove((Integer) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void removeListener(Integer num) {
        this._sdkListeners.remove(num);
    }
}
