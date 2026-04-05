package com.sfbx.appconsentv3.ui.ui.consentable.detail;

import androidx.lifecycle.l1;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.ConsentableType;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.sfbx.appconsentv3.ui.listener.SwitchViewListener;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableDetailActivity$onCreate$vendorHeaderAdapter$1 implements SwitchViewListener {
    final /* synthetic */ ConsentableDetailActivity this$0;

    public ConsentableDetailActivity$onCreate$vendorHeaderAdapter$1(ConsentableDetailActivity consentableDetailActivity) {
        this.this$0 = consentableDetailActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSwitchChanged$lambda$0(l tmp0, Object obj) {
        e0.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.sfbx.appconsentv3.ui.listener.SwitchViewListener
    public void onSwitchChanged(ConsentStatus newStatus) {
        e0.checkNotNullParameter(newStatus, "newStatus");
        ConsentableDetailActivity consentableDetailActivity = this.this$0;
        int i10 = consentableDetailActivity.f50545id;
        ConsentableType consentableType = this.this$0.type;
        ConsentableType consentableType2 = null;
        if (consentableType == null) {
            e0.throwUninitializedPropertyAccessException("type");
            consentableType = null;
        }
        consentableDetailActivity.sendSpecialMetricByType(new AppConsentActivity.SpecialMetricParam(i10, consentableType, newStatus), this.this$0.getMViewModel());
        ConsentableDetailViewModel mViewModel = this.this$0.getMViewModel();
        int i11 = this.this$0.f50545id;
        ConsentableType consentableType3 = this.this$0.type;
        if (consentableType3 == null) {
            e0.throwUninitializedPropertyAccessException("type");
        } else {
            consentableType2 = consentableType3;
        }
        l1 consentableStatus = mViewModel.setConsentableStatus(i11, consentableType2, newStatus);
        ConsentableDetailActivity consentableDetailActivity2 = this.this$0;
        consentableStatus.observe(consentableDetailActivity2, new a(1, new ConsentableDetailActivity$onCreate$vendorHeaderAdapter$1$onSwitchChanged$1(consentableDetailActivity2, newStatus)));
    }
}
