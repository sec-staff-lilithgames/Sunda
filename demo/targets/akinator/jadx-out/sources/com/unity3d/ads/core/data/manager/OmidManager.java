package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface OmidManager {
    void activate(Context context);

    AdEvents createAdEvents(AdSession adSession);

    AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext);

    AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10);

    AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str, String str2);

    AdSessionContext createJavaScriptAdSessionContext(Partner partner, WebView webView, String str, String str2);

    String getVersion();

    boolean isActive();
}
