package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.api.proto.I18NString;
import kotlin.jvm.internal.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class I18NStringCoreKt {
    public static final I18NStringCore convertTo(I18NString i18NString) {
        e0.checkNotNullParameter(i18NString, "<this>");
        return new I18NStringCore(p1.toMap(i18NString.getValues()));
    }
}
