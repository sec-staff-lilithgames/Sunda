package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3063x {
    void a(byte b10, Map map);

    void b();

    boolean c();

    void e();

    AdConfig getAdConfig();

    String getAdType();

    String getCreativeId();

    Object getDataModel();

    InterfaceC3046w getFullScreenEventsListener();

    String getImpressionId();

    String getMarkupType();

    byte getPlacementType();

    View getVideoContainerView();

    AbstractC3062wf getViewableAd();

    void setFullScreenActivityContext(Activity activity);
}
