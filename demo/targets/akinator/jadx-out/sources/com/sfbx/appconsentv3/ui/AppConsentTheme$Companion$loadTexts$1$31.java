package com.sfbx.appconsentv3.ui;

import ao.kwoC.zAQQWzBxnS;
import com.sfbx.appconsent.core.model.TranslatableText;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentTheme$Companion$loadTexts$1$31 extends f0 implements l {
    final /* synthetic */ String $language;
    final /* synthetic */ AppConsentTheme $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentTheme$Companion$loadTexts$1$31(AppConsentTheme appConsentTheme, String str) {
        super(1);
        this.$this_apply = appConsentTheme;
        this.$language = str;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<TranslatableText>) obj);
        return x0.f87415a;
    }

    public final void invoke(List<TranslatableText> list) {
        e0.checkNotNullParameter(list, zAQQWzBxnS.xhaLooLMRnQWn);
        AppConsentTheme appConsentTheme = this.$this_apply;
        String textValue = AppConsentTheme.Companion.getTextValue(list, this.$language);
        if (textValue == null) {
            textValue = this.$this_apply.getVendorPurpose$appconsent_ui_v3_prodXchangeRelease();
        }
        appConsentTheme.vendorPurpose = textValue;
    }
}
