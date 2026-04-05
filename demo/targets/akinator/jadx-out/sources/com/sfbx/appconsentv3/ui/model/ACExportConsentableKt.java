package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.ExportConsentable;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACExportConsentableKt {
    public static final ACExportConsentable convertTo(ExportConsentable exportConsentable) {
        e0.checkNotNullParameter(exportConsentable, "<this>");
        return new ACExportConsentable(exportConsentable.getIabId(), exportConsentable.getExtraId(), ACConsentableTypeKt.convertTo(exportConsentable.getType()), ACConsentStatusKt.convertTo(exportConsentable.getStatus()));
    }
}
