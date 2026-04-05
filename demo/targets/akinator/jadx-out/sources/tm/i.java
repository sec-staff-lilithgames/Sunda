package tm;

import android.webkit.WebView;
import br.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i {
    void onCalendarEventIntention(g gVar, String str);

    void onChangeOrientationIntention(g gVar, x xVar);

    void onCloseIntention(g gVar);

    boolean onExpandIntention(g gVar, WebView webView, x xVar, boolean z10);

    void onExpanded(g gVar);

    void onMraidAdViewExpired(g gVar, qm.b bVar);

    void onMraidAdViewLoadFailed(g gVar, qm.b bVar);

    void onMraidAdViewPageLoaded(g gVar, String str, WebView webView, boolean z10);

    void onMraidAdViewShowFailed(g gVar, qm.b bVar);

    void onMraidAdViewShown(g gVar);

    void onMraidLoadedIntention(g gVar);

    void onOpenPrivacySheet(g gVar, p1 p1Var);

    void onOpenUrlIntention(g gVar, String str);

    void onPlayVideoIntention(g gVar, String str);

    boolean onResizeIntention(g gVar, WebView webView, z zVar, a0 a0Var);

    void onStorePictureIntention(g gVar, String str);

    void onSyncCustomCloseIntention(g gVar, boolean z10);
}
