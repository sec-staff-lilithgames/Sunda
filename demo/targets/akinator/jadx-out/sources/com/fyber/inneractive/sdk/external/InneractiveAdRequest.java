package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.flow.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveAdRequest extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f23488c;

    /* renamed from: d, reason: collision with root package name */
    public s0 f23489d;

    public InneractiveAdRequest(String str) {
        this.f23488c = str;
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    public s0 getSelectedUnitConfig() {
        return this.f23489d;
    }

    public String getSpotId() {
        return this.f23488c;
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    @Deprecated
    public void setMuteVideo(boolean z10) {
        InneractiveAdManager.setMuteVideo(z10);
    }

    public void setSelectedUnitConfig(s0 s0Var) {
        this.f23489d = s0Var;
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
