package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ConnectivityMonitor {
    private static int _connected = -1;
    private static Set<IConnectivityListener> _listeners = null;
    private static boolean _listening = false;
    private static int _networkType = -1;
    private static boolean _webappMonitoring = false;
    private static boolean _wifi = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.services.core.connectivity.ConnectivityMonitor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent;

        static {
            int[] iArr = new int[ConnectivityEvent.values().length];
            $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent = iArr;
            try {
                iArr[ConnectivityEvent.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent[ConnectivityEvent.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent[ConnectivityEvent.NETWORK_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void addListener(IConnectivityListener iConnectivityListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (_listeners == null) {
            _listeners = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        _listeners.add(iConnectivityListener);
        updateListeningStatus();
    }

    public static void connected() {
        if (_connected == 1) {
            return;
        }
        DeviceLog.debug("Unity Ads connectivity change: connected");
        initConnectionStatus();
        Set<IConnectivityListener> set = _listeners;
        if (set != null) {
            Iterator<IConnectivityListener> it = set.iterator();
            while (it.hasNext()) {
                it.next().onConnected();
            }
        }
        sendToWebview(ConnectivityEvent.CONNECTED, _wifi, _networkType);
    }

    public static void connectionStatusChanged() {
        NetworkInfo activeNetworkInfo;
        int networkType;
        if (_connected == 1 && (activeNetworkInfo = ((ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            boolean z10 = activeNetworkInfo.getType() == 1;
            try {
                networkType = ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
            } catch (SecurityException unused) {
                DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                networkType = -1;
            }
            boolean z11 = _wifi;
            if (z10 == z11 && (networkType == _networkType || z11)) {
                return;
            }
            _wifi = z10;
            _networkType = networkType;
            DeviceLog.debug("Unity Ads connectivity change: network change");
            sendToWebview(ConnectivityEvent.NETWORK_CHANGE, z10, networkType);
        }
    }

    public static void disconnected() {
        if (_connected == 0) {
            return;
        }
        _connected = 0;
        DeviceLog.debug("Unity Ads connectivity change: disconnected");
        Set<IConnectivityListener> set = _listeners;
        if (set != null) {
            Iterator<IConnectivityListener> it = set.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected();
            }
        }
        sendToWebview(ConnectivityEvent.DISCONNECTED, false, 0);
    }

    private static void initConnectionStatus() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ConnectivityManager connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            _connected = 0;
            return;
        }
        _connected = 1;
        boolean z10 = activeNetworkInfo.getType() == 1;
        _wifi = z10;
        if (z10) {
            return;
        }
        try {
            _networkType = ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
        } catch (SecurityException unused) {
            DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
        }
    }

    public static void removeListener(IConnectivityListener iConnectivityListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Set<IConnectivityListener> set = _listeners;
        if (set == null) {
            return;
        }
        set.remove(iConnectivityListener);
        updateListeningStatus();
    }

    private static void sendToWebview(ConnectivityEvent connectivityEvent, boolean z10, int i10) {
        WebViewApp currentApp;
        if (_webappMonitoring && (currentApp = WebViewApp.getCurrentApp()) != null && currentApp.isWebAppLoaded()) {
            int i11 = AnonymousClass1.$SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent[connectivityEvent.ordinal()];
            if (i11 == 1) {
                if (z10) {
                    currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.CONNECTED, Boolean.valueOf(z10), 0);
                    return;
                } else {
                    currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.CONNECTED, Boolean.valueOf(z10), Integer.valueOf(i10));
                    return;
                }
            }
            if (i11 == 2) {
                currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.DISCONNECTED, new Object[0]);
            } else {
                if (i11 != 3) {
                    return;
                }
                if (z10) {
                    currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.NETWORK_CHANGE, Boolean.valueOf(z10), 0);
                } else {
                    currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.NETWORK_CHANGE, Boolean.valueOf(z10), Integer.valueOf(i10));
                }
            }
        }
    }

    public static void setConnectionMonitoring(boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        _webappMonitoring = z10;
        updateListeningStatus();
    }

    private static void startListening() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (_listening) {
            return;
        }
        _listening = true;
        initConnectionStatus();
        ConnectivityNetworkCallback.register();
    }

    public static void stopAll() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        _listeners = null;
        _webappMonitoring = false;
        updateListeningStatus();
    }

    private static void stopListening() {
        if (_listening) {
            _listening = false;
            ConnectivityNetworkCallback.unregister();
        }
    }

    private static void updateListeningStatus() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Set<IConnectivityListener> set;
        if (_webappMonitoring || !((set = _listeners) == null || set.isEmpty())) {
            startListening();
        } else {
            stopListening();
        }
    }
}
