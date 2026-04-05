package com.mbridge.msdk.dycreator.viewdata;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a implements com.mbridge.msdk.dycreator.viewdata.base.a {

    /* renamed from: a, reason: collision with root package name */
    private DyOption f40274a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f40275b;

    public a(DyOption dyOption) {
        this.f40274a = dyOption;
        this.f40275b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f40275b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f40274a;
    }
}
