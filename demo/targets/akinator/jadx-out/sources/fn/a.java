package fn;

import android.webkit.WebView;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.CreativeType;
import com.iab.omid.library.appodeal.adsession.ImpressionType;
import com.iab.omid.library.appodeal.adsession.Owner;
import com.iab.omid.library.appodeal.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f55738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f55739c;

    public a(c cVar, WebView webView) {
        this.f55739c = cVar;
        this.f55738b = webView;
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.f55739c;
        try {
            Partner partner = t.getPartner();
            if (partner != null) {
                if (cVar.f55766e != null) {
                    return;
                }
                CreativeType creativeType = CreativeType.HTML_DISPLAY;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                Owner owner = Owner.NATIVE;
                cVar.c(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(partner, this.f55738b, "", ""));
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
