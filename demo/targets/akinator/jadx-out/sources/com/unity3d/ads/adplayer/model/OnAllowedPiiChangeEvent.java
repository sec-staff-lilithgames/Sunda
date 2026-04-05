package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OnAllowedPiiChangeEvent implements WebViewEvent {
    private final String category;
    private final String name;
    private final Object[] parameters;

    public OnAllowedPiiChangeEvent(String value) {
        e0.checkNotNullParameter(value, "value");
        this.category = "ADVIEWER";
        this.name = "ON_ALLOWED_PII_CHANGE";
        this.parameters = new Object[]{value};
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    public Object[] getParameters() {
        return this.parameters;
    }
}
