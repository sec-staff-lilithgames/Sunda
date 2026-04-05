package io.bidmachine;

import io.bidmachine.AdRequestParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class UnifiedAdRequestParamsImpl<AdRequestParametersType extends AdRequestParameters> implements hr.d {
    private final AdRequestParametersType adRequestParameters;
    private final up.d dataRestrictions;
    private final up.e deviceInfo;
    private final up.p targetingInfo;

    public UnifiedAdRequestParamsImpl(AdRequestParametersType adrequestparameterstype, TargetingParams targetingParams, up.d dVar) {
        this.adRequestParameters = adrequestparameterstype;
        this.targetingInfo = new c4(dVar, targetingParams);
        this.deviceInfo = new b2(dVar);
        this.dataRestrictions = dVar;
    }

    @Override // hr.d
    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    @Override // io.bidmachine.GeneralParams
    public up.d getDataRestrictions() {
        return this.dataRestrictions;
    }

    @Override // hr.d
    public up.e getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // io.bidmachine.GeneralParams
    public up.p getTargetingInfo() {
        return this.targetingInfo;
    }

    @Override // io.bidmachine.GeneralParams
    public boolean isTestMode() {
        return n1.a().f61937t;
    }
}
