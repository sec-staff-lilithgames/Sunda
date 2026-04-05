package com.sfbx.appconsentv3.ui;

import com.sfbx.appconsent.core.model.TranslatableText;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentTheme$Companion$loadTexts$1$9 extends f0 implements l {
    final /* synthetic */ String $language;
    final /* synthetic */ AppConsentTheme $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentTheme$Companion$loadTexts$1$9(AppConsentTheme appConsentTheme, String str) {
        super(1);
        this.$this_apply = appConsentTheme;
        this.$language = str;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<TranslatableText>) obj);
        return x0.f87415a;
    }

    public final void invoke(List<TranslatableText> it) {
        e0.checkNotNullParameter(it, "it");
        this.$this_apply.buttonSeeMandatoryFeature = AppConsentTheme.Companion.getTextValue(it, this.$language);
    }
}
