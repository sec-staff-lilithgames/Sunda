package tm;

import android.net.Uri;
import android.text.TextUtils;
import br.p1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.beta.xyn.RnJusJ;
import j1.o2;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f87073a;

    public k(g gVar) {
        this.f87073a = gVar;
    }

    @Override // tm.t0
    public void onCalendarEvent(String str) {
        String string;
        t.d("MraidAdView", "Callback - onCalendarEvent: %s", str);
        g gVar = this.f87073a;
        gVar.f87054s.getClass();
        try {
            string = new Uri.Builder().scheme("calendar").authority(CampaignEx.JSON_KEY_MRAID).appendQueryParameter("eventJson", str).build().toString();
        } catch (Exception e10) {
            t.e("MraidNativeFeatureUrlFactory", e10);
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        gVar.c(string, new j(this, 1));
    }

    @Override // tm.t0
    public void onClose() {
        t.d("MraidAdView", "Callback - onClose", new Object[0]);
        g gVar = this.f87073a;
        gVar.f87056u.onCloseIntention(gVar);
    }

    @Override // tm.t0
    public void onError(qm.b bVar) {
        t.d("MraidAdView", "Callback - onError: %s", bVar);
        int i10 = g.f87037y;
        g gVar = this.f87073a;
        i iVar = gVar.f87056u;
        if (!gVar.isLoaded()) {
            iVar.onMraidAdViewLoadFailed(gVar, bVar);
        } else if (gVar.f87044i.get()) {
            iVar.onMraidAdViewShowFailed(gVar, bVar);
        } else {
            iVar.onMraidAdViewExpired(gVar, bVar);
        }
    }

    @Override // tm.t0
    public void onExpand(String str) throws UnsupportedEncodingException {
        w0 w0Var;
        t.d("MraidAdView", "Callback - onExpand: %s", str);
        g gVar = this.f87073a;
        if (gVar.isInterstitial()) {
            return;
        }
        i iVar = gVar.f87056u;
        if (gVar.isInterstitial()) {
            return;
        }
        n0 n0Var = gVar.f87058w;
        if (n0Var == n0.f87103c || n0Var == n0.f87104e) {
            if (str == null) {
                w0Var = gVar.f87055t;
            } else {
                try {
                    String strDecode = URLDecoder.decode(str, C.UTF8_NAME);
                    if (!ir.q.isHttpUrl(strDecode)) {
                        strDecode = o2.o(new StringBuilder(), gVar.f87039c, strDecode);
                    }
                    w0 w0Var2 = new w0(gVar.getContext(), new m(gVar));
                    gVar.f87057v = w0Var2;
                    w0Var2.load(strDecode);
                    w0Var = w0Var2;
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            if (iVar.onExpandIntention(gVar, w0Var.getWebView(), w0Var.getLastOrientationProperties(), w0Var.isUseCustomClose())) {
                gVar.setViewState(n0.f87105f);
                iVar.onExpanded(gVar);
            }
        }
    }

    @Override // tm.t0
    public void onLoaded() {
        t.d("MraidAdView", "Callback - onLoaded", new Object[0]);
        g gVar = this.f87073a;
        gVar.f87056u.onMraidLoadedIntention(gVar);
    }

    @Override // tm.t0
    public void onOpen(String str) {
        t.d("MraidAdView", "Callback - onOpen: %s", str);
        int i10 = g.f87037y;
        g gVar = this.f87073a;
        gVar.c(str, new b3(gVar, 15));
    }

    @Override // tm.t0
    public void onOpenPrivacySheet(String str) {
        t.d("MraidAdView", "Callback - onOpenPrivacySheet: %s", str);
        int i10 = g.f87037y;
        p1 json = cr.o.parseJson(str);
        if (json == null) {
            t.e("MraidAdView", "Callback - can't parse privacy sheet", new Object[0]);
        } else {
            g gVar = this.f87073a;
            gVar.f87056u.onOpenPrivacySheet(gVar, json);
        }
    }

    @Override // tm.t0
    public abstract /* synthetic */ void onPageFinished(String str);

    @Override // tm.t0
    public void onPlayVideo(String str) {
        t.d("MraidAdView", "Callback - onPlayVideo: %s", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            g gVar = this.f87073a;
            gVar.f87056u.onPlayVideoIntention(gVar, URLDecoder.decode(str, C.UTF8_NAME));
        } catch (UnsupportedEncodingException e10) {
            t.e("MraidAdView", e10);
        }
    }

    @Override // tm.t0
    public void onResize(z zVar) {
        t.d("MraidAdView", "Callback - onResize: %s", zVar);
        g gVar = this.f87073a;
        n0 n0Var = gVar.f87058w;
        if (n0Var == n0.f87102b || n0Var == n0.f87106g || n0Var == n0.f87105f || gVar.isInterstitial()) {
            t.d("MraidAdView", "Callback: onResize (invalidate state: %s)", gVar.f87058w);
        } else if (gVar.f87056u.onResizeIntention(gVar, gVar.f87055t.getWebView(), zVar, gVar.f87050o)) {
            gVar.setViewState(n0.f87104e);
        }
    }

    @Override // tm.t0
    public void onStorePicture(String str) {
        String string;
        t.d("MraidAdView", "Callback - onStorePicture: %s", str);
        g gVar = this.f87073a;
        gVar.f87054s.getClass();
        try {
            string = new Uri.Builder().scheme("storePicture").authority(CampaignEx.JSON_KEY_MRAID).appendQueryParameter("url", str).build().toString();
        } catch (Exception e10) {
            t.e("MraidNativeFeatureUrlFactory", e10);
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        gVar.c(string, new j(this, 0));
    }

    @Override // tm.t0
    public abstract /* synthetic */ void onUseCustomClose(boolean z10);

    @Override // tm.t0
    public abstract /* synthetic */ void onViewableChanged(boolean z10);

    @Override // tm.t0
    public void onOrientation(x xVar) {
        t.d(RnJusJ.LJgxj, "Callback - onOrientation: %s", xVar);
        g gVar = this.f87073a;
        if (!gVar.isInterstitial() && gVar.f87058w != n0.f87105f) {
            return;
        }
        gVar.f87056u.onChangeOrientationIntention(gVar, xVar);
    }
}
