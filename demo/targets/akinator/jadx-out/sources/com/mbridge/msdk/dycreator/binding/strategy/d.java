package com.mbridge.msdk.dycreator.binding.strategy;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class d<T extends View, K> implements BaseStrategy {
    @Override // com.mbridge.msdk.dycreator.binding.base.BaseStrategy
    public void bindClickData(View view, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        SplashResData splashResData = new SplashResData();
        splashResData.setBaseViewData(aVar);
        splashResData.seteAction(EAction.FEEDBACK);
        EventBus.getDefault().post(splashResData);
    }
}
