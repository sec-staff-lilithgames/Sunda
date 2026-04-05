package com.sfbx.appconsentv3.business;

import android.content.Context;
import com.sfbx.appconsent.core.model.api.XChangeUserData;
import com.sfbx.appconsent.core.ui.AppConsentContract;
import com.sfbx.appconsentv3.ui.AppConsentBusinessImpl;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentBusiness extends AppConsentBusinessImpl implements AppConsentContract {
    public /* synthetic */ AppConsentBusiness(Context context, CoroutineDispatcher coroutineDispatcher, int i10, u uVar) {
        this(context, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentContract
    public void sendXchangeData() {
        getAppConsentCoreInstance().sendXchangeData();
    }

    @Override // com.sfbx.appconsent.core.ui.AppConsentContract
    public void setXchangeUserData(XChangeUserData xChangeUserData) {
        getAppConsentCoreInstance().setXChangeUserData(xChangeUserData);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentBusiness(Context context, CoroutineDispatcher coroutineDispatcher) {
        super(context, coroutineDispatcher);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
    }
}
