package com.sfbx.appconsentv3.ui.ui.consentable.detail;

import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsentv3.ui.model.Response;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableDetailActivity$onCreate$vendorHeaderAdapter$1$onSwitchChanged$1 extends f0 implements l {
    final /* synthetic */ ConsentStatus $newStatus;
    final /* synthetic */ ConsentableDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentableDetailActivity$onCreate$vendorHeaderAdapter$1$onSwitchChanged$1(ConsentableDetailActivity consentableDetailActivity, ConsentStatus consentStatus) {
        super(1);
        this.this$0 = consentableDetailActivity;
        this.$newStatus = consentStatus;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Response<Boolean>) obj);
        return x0.f87415a;
    }

    public final void invoke(Response<Boolean> response) {
        if (response instanceof Response.Success) {
            Consentable consentable = this.this$0.mConsentable;
            if (consentable == null) {
                e0.throwUninitializedPropertyAccessException("mConsentable");
                consentable = null;
            }
            consentable.setStatus(this.$newStatus);
        }
    }
}
