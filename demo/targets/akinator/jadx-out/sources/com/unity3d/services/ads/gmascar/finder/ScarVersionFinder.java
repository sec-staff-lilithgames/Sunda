package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge;
import com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ScarVersionFinder implements IInitializationStatusListener {
    private static IMobileAdsBridge _mobileAdsBridge;
    private GMAEventSender _gmaEventSender;
    private GMAInitializer _gmaInitializer;
    private int _gmaSdkVersionCode = -1;
    private PresenceDetector _presenceDetector;

    public ScarVersionFinder(IMobileAdsBridge iMobileAdsBridge, PresenceDetector presenceDetector, GMAInitializer gMAInitializer, GMAEventSender gMAEventSender) {
        _mobileAdsBridge = iMobileAdsBridge;
        this._presenceDetector = presenceDetector;
        this._gmaInitializer = gMAInitializer;
        this._gmaEventSender = gMAEventSender;
        gMAInitializer.getInitializeListenerBridge().setStatusListener(this);
    }

    public void findAndSendVersion(boolean z10) {
        this._gmaEventSender.sendVersion(z10 ? _mobileAdsBridge.getVersionString() : "0.0.0");
    }

    public void getVersion() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (!this._presenceDetector.areGMAClassesPresent()) {
                this._gmaEventSender.sendVersion("0.0.0");
            } else if (this._gmaInitializer.shouldInitialize()) {
                this._gmaInitializer.initializeGMA();
            } else {
                findAndSendVersion(true);
            }
        } catch (Exception e10) {
            DeviceLog.debug("Got exception finding GMA SDK: %s", e10.getLocalizedMessage());
        }
    }

    public int getVersionCode() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String versionString;
        if (this._gmaSdkVersionCode == -1 && (versionString = _mobileAdsBridge.getVersionString()) != null) {
            String[] strArrSplit = versionString.split("\\.");
            if (strArrSplit.length > _mobileAdsBridge.getVersionCodeIndex()) {
                try {
                    this._gmaSdkVersionCode = Integer.parseInt(strArrSplit[_mobileAdsBridge.getVersionCodeIndex()]);
                } catch (NumberFormatException e10) {
                    DeviceLog.debug("Could not parse %s to an Integer: %s", strArrSplit[_mobileAdsBridge.getVersionCodeIndex()], e10.getLocalizedMessage());
                }
            }
        }
        return this._gmaSdkVersionCode;
    }

    @Override // com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener
    public void onInitializationComplete(Object obj) {
        findAndSendVersion(this._gmaInitializer.initSuccessful(obj));
    }
}
