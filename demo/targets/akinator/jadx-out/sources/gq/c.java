package gq;

import android.webkit.WebView;
import ar.d;
import br.h0;
import br.p1;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import kotlin.jvm.internal.e0;
import tm.a0;
import tm.g;
import tm.i;
import tm.x;
import tm.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final b f58394a;

    /* renamed from: b, reason: collision with root package name */
    public final eq.c f58395b;

    /* renamed from: c, reason: collision with root package name */
    public final tq.b f58396c;

    /* renamed from: d, reason: collision with root package name */
    public final d f58397d;

    public c(b htmlAdForm, eq.c adFormListener, tq.b eventCallback, d dVar) {
        e0.checkNotNullParameter(htmlAdForm, "htmlAdForm");
        e0.checkNotNullParameter(adFormListener, "adFormListener");
        e0.checkNotNullParameter(eventCallback, "eventCallback");
        this.f58394a = htmlAdForm;
        this.f58395b = adFormListener;
        this.f58396c = eventCallback;
        this.f58397d = dVar;
    }

    @Override // tm.i
    public void onChangeOrientationIntention(g mraidAdView, x mraidOrientationProperties) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(mraidOrientationProperties, "mraidOrientationProperties");
    }

    @Override // tm.i
    public void onCloseIntention(g mraidAdView) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        this.f58396c.onClose();
    }

    @Override // tm.i
    public void onExpanded(g mraidAdView) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
    }

    @Override // tm.i
    public void onMraidAdViewExpired(g mraidAdView, qm.b iabError) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(iabError, "iabError");
        String message = iabError.getMessage();
        e0.checkNotNullExpressionValue(message, "iabError.message");
        this.f58395b.b(this.f58394a, new h0(message));
    }

    @Override // tm.i
    public void onMraidAdViewPageLoaded(g mraidAdView, String url, WebView webView, boolean z10) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(webView, "webView");
        d dVar = this.f58397d;
        if (dVar != null) {
            dVar.onViewReady(webView);
        }
        this.f58395b.b(this.f58394a);
    }

    @Override // tm.i
    public void onMraidAdViewShowFailed(g mraidAdView, qm.b iabError) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(iabError, "iabError");
        String message = iabError.getMessage();
        e0.checkNotNullExpressionValue(message, "iabError.message");
        this.f58394a.b(new h0(message));
    }

    @Override // tm.i
    public void onMraidAdViewShown(g mraidAdView) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
    }

    @Override // tm.i
    public void onMraidLoadedIntention(g mraidAdView) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
    }

    @Override // tm.i
    public void onOpenPrivacySheet(g mraidAdView, p1 privacySheetParams) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
    }

    @Override // tm.i
    public void onOpenUrlIntention(g mraidAdView, String url) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(url, "url");
        d dVar = this.f58397d;
        if (dVar != null) {
            dVar.onClicked();
        }
        this.f58396c.a(url);
    }

    @Override // tm.i
    public void onPlayVideoIntention(g mraidAdView, String url) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(url, "url");
    }

    @Override // tm.i
    public boolean onResizeIntention(g mraidAdView, WebView webView, z mraidResizeProperties, a0 mraidScreenMetrics) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(webView, "webView");
        e0.checkNotNullParameter(mraidResizeProperties, "mraidResizeProperties");
        e0.checkNotNullParameter(mraidScreenMetrics, "mraidScreenMetrics");
        return false;
    }

    @Override // tm.i
    public void onStorePictureIntention(g mraidAdView, String url) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(url, "url");
        onOpenUrlIntention(mraidAdView, url);
    }

    @Override // tm.i
    public void onSyncCustomCloseIntention(g mraidAdView, boolean z10) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        this.f58396c.onUseCustomClose(z10);
    }

    @Override // tm.i
    public void onCalendarEventIntention(g gVar, String url) {
        e0.checkNotNullParameter(gVar, LJjmO.ciUw);
        e0.checkNotNullParameter(url, "url");
        onOpenUrlIntention(gVar, url);
    }

    @Override // tm.i
    public boolean onExpandIntention(g mraidAdView, WebView webView, x xVar, boolean z10) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(webView, PcrIk.Rjwtg);
        return false;
    }

    @Override // tm.i
    public void onMraidAdViewLoadFailed(g mraidAdView, qm.b bVar) {
        e0.checkNotNullParameter(mraidAdView, "mraidAdView");
        e0.checkNotNullParameter(bVar, SFPXhf.VoiuKhclDAsyQ);
        String message = bVar.getMessage();
        e0.checkNotNullExpressionValue(message, "iabError.message");
        this.f58394a.a(new h0(message));
    }
}
