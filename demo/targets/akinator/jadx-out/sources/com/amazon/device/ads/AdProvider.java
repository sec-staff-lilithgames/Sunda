package com.amazon.device.ads;

import android.view.ViewGroup;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface AdProvider {
    String getFlavor();

    String[] getProprietaryKeys();

    boolean matches(String str, String str2, DTBAdResponse dTBAdResponse);

    void onBidRequested(Map<String, Object> map);

    void onBidResponse(DTBAdResponse dTBAdResponse);

    void takeOwnership(ViewGroup viewGroup, DTBAdResponse dTBAdResponse, DTBRendererObserver dTBRendererObserver, DTBRenderer dTBRenderer, Map<String, Object> map);
}
