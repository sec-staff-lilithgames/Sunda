package l6;

import android.webkit.WebView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k6.z f72438c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WebView f72439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k6.y f72440f;

    public /* synthetic */ a1(k6.z zVar, WebView webView, d1 d1Var, int i10) {
        this.f72437b = i10;
        this.f72438c = zVar;
        this.f72439e = webView;
        this.f72440f = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f72437b) {
            case 0:
                this.f72438c.onRenderProcessResponsive(this.f72439e, this.f72440f);
                break;
            default:
                this.f72438c.onRenderProcessUnresponsive(this.f72439e, this.f72440f);
                break;
        }
    }
}
