package com.sfbx.appconsentv3.ui;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentTheme$Companion$loadColors$1$18 extends f0 implements l {
    final /* synthetic */ AppConsentTheme $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppConsentTheme$Companion$loadColors$1$18(AppConsentTheme appConsentTheme) {
        super(1);
        this.$this_apply = appConsentTheme;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return x0.f87415a;
    }

    public final void invoke(String it) {
        e0.checkNotNullParameter(it, "it");
        this.$this_apply.acceptAllButtonBorder = AppConsentTheme.Companion.getSafeColorValue(it);
    }
}
