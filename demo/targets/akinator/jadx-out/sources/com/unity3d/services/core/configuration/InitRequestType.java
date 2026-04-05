package com.unity3d.services.core.configuration;

import com.amazon.device.ads.DtbDeviceRegistration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum InitRequestType {
    PRIVACY(DtbDeviceRegistration.CONFIG_PRIVACY_KEY),
    TOKEN("token_srr");

    private String _callType;

    InitRequestType(String str) {
        this._callType = str;
    }

    public String getCallType() {
        return this._callType;
    }
}
