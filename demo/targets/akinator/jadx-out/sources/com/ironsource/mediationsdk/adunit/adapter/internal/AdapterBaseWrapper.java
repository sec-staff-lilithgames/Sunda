package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.model.NetworkSettings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class AdapterBaseWrapper {
    AdapterBaseInterface adapterBaseInterface;
    NetworkSettings settings;

    public AdapterBaseWrapper(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        this.adapterBaseInterface = adapterBaseInterface;
        this.settings = networkSettings;
    }

    public AdapterBaseInterface getAdapterBaseInterface() {
        return this.adapterBaseInterface;
    }

    public NetworkSettings getSettings() {
        return this.settings;
    }
}
