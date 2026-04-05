package com.unity3d.services.core.configuration;

import com.unity3d.services.core.misc.IObserver;
import com.unity3d.services.core.misc.Observable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class PrivacyConfigStorage extends Observable<PrivacyConfig> {
    private static PrivacyConfigStorage _instance;
    private PrivacyConfig _privacyConfig = new PrivacyConfig();

    private PrivacyConfigStorage() {
    }

    public static PrivacyConfigStorage getInstance() {
        if (_instance == null) {
            _instance = new PrivacyConfigStorage();
        }
        return _instance;
    }

    public synchronized PrivacyConfig getPrivacyConfig() {
        return this._privacyConfig;
    }

    @Override // com.unity3d.services.core.misc.Observable
    public synchronized void registerObserver(IObserver<PrivacyConfig> iObserver) {
        super.registerObserver(iObserver);
        if (this._privacyConfig.getPrivacyStatus() != PrivacyConfigStatus.UNKNOWN) {
            iObserver.updated(this._privacyConfig);
        }
    }

    public synchronized void setPrivacyConfig(PrivacyConfig privacyConfig) {
        this._privacyConfig = privacyConfig;
        notifyObservers(privacyConfig);
    }
}
