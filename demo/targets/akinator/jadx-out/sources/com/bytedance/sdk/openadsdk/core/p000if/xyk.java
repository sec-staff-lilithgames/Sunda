package com.bytedance.sdk.openadsdk.core.p000if;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {
    public static qk jpo(View view, Set<yd> set) {
        AdSession adSessionJpo = jpo(CreativeType.VIDEO, set, Owner.NATIVE);
        return new zz(adSessionJpo, AdEvents.createAdEvents(adSessionJpo), view, MediaEvents.createMediaEvents(adSessionJpo));
    }

    public static qk jpo(WebView webView) {
        Partner partnerJpo = my.jpo();
        if (partnerJpo != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerJpo, webView, "", ""));
            return new qk(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession jpo(CreativeType creativeType, Set<yd> set, Owner owner) {
        List<VerificationScriptResource> listJpo = jpo(set);
        listJpo.isEmpty();
        Partner partnerJpo = my.jpo();
        if (partnerJpo == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerJpo, my.jd(), listJpo, "", ""));
    }

    private static List<VerificationScriptResource> jpo(Set<yd> set) {
        ArrayList arrayList = new ArrayList();
        for (yd ydVar : set) {
            try {
                if (!TextUtils.isEmpty(ydVar.jpo()) && !TextUtils.isEmpty(ydVar.jd())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(ydVar.jpo(), ydVar.wqx(), ydVar.jd()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(ydVar.wqx()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
