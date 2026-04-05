package com.mbridge.msdk.dycreator.binding.response;

import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.viewdata.base.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SplashResData extends BaseRespData {

    /* renamed from: a, reason: collision with root package name */
    private a f40136a;

    /* renamed from: b, reason: collision with root package name */
    private EAction f40137b;

    public a getBaseViewData() {
        return this.f40136a;
    }

    public EAction geteAction() {
        return this.f40137b;
    }

    public void setBaseViewData(a aVar) {
        this.f40136a = aVar;
    }

    public void seteAction(EAction eAction) {
        this.f40137b = eAction;
    }
}
