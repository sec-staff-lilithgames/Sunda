package com.unity3d.ads.adplayer.model;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OnMuteChangeEvent implements WebViewEvent {
    private final String category = "ADVIEWER";
    private final String name = "ON_MUTE_CHANGE";
    private final Object[] parameters;

    public OnMuteChangeEvent(boolean z10) {
        this.parameters = new Object[]{Boolean.valueOf(z10)};
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
