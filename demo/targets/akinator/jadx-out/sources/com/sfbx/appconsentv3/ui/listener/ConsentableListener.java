package com.sfbx.appconsentv3.ui.listener;

import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.Consentable;
import com.sfbx.appconsent.core.model.ConsentableType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ConsentableListener {
    void consentableStatusChanged(int i10, ConsentableType consentableType, ConsentStatus consentStatus);

    void seeMore(Consentable consentable);
}
