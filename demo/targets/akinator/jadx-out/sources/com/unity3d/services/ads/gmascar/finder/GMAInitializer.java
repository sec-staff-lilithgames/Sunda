package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class GMAInitializer {
    private AdapterStatusBridge _adapterStatusBridge;
    private GMAEventSender _gmaEventSender;
    private InitializeListenerBridge _initializationListenerBridge;
    private InitializationStatusBridge _initializationStatusBridge;
    private MobileAdsBridgeBase _mobileAdsBridge;

    public GMAInitializer(MobileAdsBridgeBase mobileAdsBridgeBase, InitializeListenerBridge initializeListenerBridge, InitializationStatusBridge initializationStatusBridge, AdapterStatusBridge adapterStatusBridge, GMAEventSender gMAEventSender) {
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._initializationListenerBridge = initializeListenerBridge;
        this._initializationStatusBridge = initializationStatusBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._gmaEventSender = gMAEventSender;
    }

    public InitializeListenerBridge getInitializeListenerBridge() {
        return this._initializationListenerBridge;
    }

    public boolean initSuccessful(Object obj) {
        Object obj2 = this._initializationStatusBridge.getAdapterStatusMap(obj).get(this._mobileAdsBridge.getClassName());
        if (obj2 != null) {
            if (this._adapterStatusBridge.isGMAInitialized(obj2)) {
                this._gmaEventSender.send(c.f50708f, new Object[0]);
                return true;
            }
            this._gmaEventSender.send(c.f50709g, new Object[0]);
        }
        return false;
    }

    public void initializeGMA() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (shouldInitialize()) {
            this._mobileAdsBridge.initialize(ClientProperties.getApplicationContext(), this._initializationListenerBridge.createInitializeListenerProxy());
        }
    }

    public boolean isInitialized() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            return initSuccessful(this._mobileAdsBridge.getInitializationStatus());
        } catch (Exception e10) {
            DeviceLog.debug("ERROR: Could not get initialization status of GMA SDK - %s", e10.getLocalizedMessage());
            return false;
        }
    }

    public boolean shouldInitialize() {
        if (!isInitialized()) {
            return this._mobileAdsBridge.shouldInitialize();
        }
        this._gmaEventSender.send(c.f50707e, new Object[0]);
        return false;
    }
}
