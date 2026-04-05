package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.C3518wf;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.c;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {
    private final LevelPlay.AdFormat mAdFormat;
    protected final UUID mAdUnitObjectId;
    protected final NetworkSettings mNetworkSettings;

    public BaseAdAdapter(LevelPlay.AdFormat adFormat, NetworkSettings networkSettings) {
        this(adFormat, networkSettings, null);
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) c.b().b(this.mNetworkSettings, C3518wf.b(this.mAdFormat), this.mAdUnitObjectId);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    public NetworkSettings getNetworkSettings() {
        return this.mNetworkSettings;
    }

    public BaseAdAdapter(LevelPlay.AdFormat adFormat, NetworkSettings networkSettings, UUID uuid) {
        this.mAdFormat = adFormat;
        this.mNetworkSettings = networkSettings;
        this.mAdUnitObjectId = uuid;
    }
}
