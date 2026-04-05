package com.fyber.inneractive.sdk.ui;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.mraid.f0;
import com.fyber.inneractive.sdk.mraid.k;
import com.fyber.inneractive.sdk.mraid.l;
import com.fyber.inneractive.sdk.mraid.n;
import com.fyber.inneractive.sdk.mraid.o;
import com.fyber.inneractive.sdk.mraid.p;
import com.fyber.inneractive.sdk.mraid.q;
import com.fyber.inneractive.sdk.mraid.s;
import com.fyber.inneractive.sdk.mraid.t;
import com.fyber.inneractive.sdk.mraid.u;
import com.fyber.inneractive.sdk.mraid.v;
import com.fyber.inneractive.sdk.mraid.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.b0;
import com.fyber.inneractive.sdk.web.c0;
import com.fyber.inneractive.sdk.web.d0;
import com.fyber.inneractive.sdk.web.g0;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import com.fyber.inneractive.sdk.web.m;
import com.fyber.inneractive.sdk.web.z;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class IAmraidWebViewController extends i0 {

    /* renamed from: p0, reason: collision with root package name */
    public final f f26719p0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError() {
            super("an MRAID video has not started playing in a timely fashion");
        }
    }

    public IAmraidWebViewController(boolean z10, c0 c0Var, z zVar, d0 d0Var, boolean z11, com.fyber.inneractive.sdk.measurement.e eVar, r rVar) {
        super(z10, c0Var, zVar, d0Var, eVar, rVar);
        this.f26719p0 = new f(this);
        this.F = z11;
        this.f26879b.setId(R.id.ia_inneractive_webview_mraid);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final boolean a(String str, g1 g1Var) {
        com.fyber.inneractive.sdk.mraid.f gVar;
        com.fyber.inneractive.sdk.mraid.f fVar;
        m mVar;
        Uri uri = Uri.parse(str);
        String string = uri.toString();
        uri.getScheme();
        if (string.startsWith("iaadfinishedloading")) {
            if (string.endsWith("success")) {
                IAlog.e("received iaadfinishedloading success", new Object[0]);
                if (!this.f26878a && this.f26883f != null && (mVar = this.f26879b) != null) {
                    mVar.a();
                    this.f26878a = true;
                    q();
                }
            }
            return true;
        }
        String scheme = Uri.parse(str).getScheme();
        m mVar2 = this.f26879b;
        if (mVar2 != null && mVar2.isShown() && this.N != f0.HIDDEN) {
            if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
                return false;
            }
            URI uriCreate = URI.create(str);
            String host = uriCreate.getHost();
            try {
                LinkedHashMap linkedHashMapA = i0.a(uriCreate);
                switch (com.fyber.inneractive.sdk.mraid.j.f24176a[k.a(host).ordinal()]) {
                    case 1:
                        gVar = new com.fyber.inneractive.sdk.mraid.g(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 2:
                        gVar = new com.fyber.inneractive.sdk.mraid.i(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 3:
                        gVar = new w(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 4:
                        gVar = new q(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 5:
                        gVar = new s(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 6:
                        gVar = new o(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 7:
                        gVar = new u(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 8:
                        gVar = new t(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 9:
                        gVar = new com.fyber.inneractive.sdk.mraid.r(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 10:
                        gVar = new v(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 11:
                        gVar = new l(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 12:
                        gVar = new com.fyber.inneractive.sdk.mraid.m(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 13:
                        gVar = new n(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 14:
                        gVar = new p(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    case 15:
                        gVar = new com.fyber.inneractive.sdk.mraid.h(linkedHashMapA, this, g1Var);
                        fVar = gVar;
                        break;
                    default:
                        fVar = null;
                        break;
                }
                if (fVar == null || ((fVar instanceof com.fyber.inneractive.sdk.mraid.i) && this.Q == c0.INTERSTITIAL)) {
                    m mVar3 = this.f26879b;
                    if (mVar3 != null) {
                        mVar3.a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                } else {
                    fVar.f24171a = host;
                    IAlog.e("Processing MRaid command: %s", host);
                    if (fVar instanceof com.fyber.inneractive.sdk.mraid.e) {
                        a(new com.fyber.inneractive.sdk.web.f0(this, (com.fyber.inneractive.sdk.mraid.e) fVar));
                    } else {
                        if (fVar.b()) {
                            i();
                        }
                        fVar.a();
                    }
                    m mVar4 = this.f26879b;
                    if (mVar4 != null) {
                        mVar4.a("window.mraidbridge.nativeCallComplete('" + host + "');");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void e() {
        b(false);
        Handler handler = com.fyber.inneractive.sdk.util.r.f26804b;
        handler.removeCallbacks(this.f26719p0);
        handler.removeCallbacks(this.J);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.measurement.tracker.e f() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r5 = this;
            super.k()
            com.fyber.inneractive.sdk.web.m r0 = r5.f26879b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L30
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L30
            com.fyber.inneractive.sdk.web.m r0 = r5.f26879b
            android.content.Context r0 = r0.getContext()
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore> r4 = com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore.class
            r3.<init>(r0, r4)
            android.app.Application r0 = com.fyber.inneractive.sdk.util.o.f26796a     // Catch: java.lang.Throwable -> L2b
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2b
            java.util.List r0 = r0.queryIntentActivities(r3, r2)     // Catch: java.lang.Throwable -> L2b
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L2b
            goto L2c
        L2b:
            r0 = r2
        L2c:
            if (r0 <= 0) goto L30
            r0 = r1
            goto L31
        L30:
            r0 = r2
        L31:
            com.fyber.inneractive.sdk.mraid.e0 r3 = new com.fyber.inneractive.sdk.mraid.e0
            r3.<init>()
            boolean r4 = com.fyber.inneractive.sdk.util.k.n()
            r3.f24167b = r4
            boolean r4 = com.fyber.inneractive.sdk.util.k.n()
            r3.f24166a = r4
            r3.f24168c = r1
            r3.f24170e = r0
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            java.lang.String r0 = ""
        L4d:
            java.lang.String r4 = "mounted"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L60
            android.app.Application r0 = com.fyber.inneractive.sdk.util.o.f26796a
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r0 = r0.checkCallingOrSelfPermission(r4)
            if (r0 != 0) goto L60
            goto L61
        L60:
            r1 = r2
        L61:
            r3.f24169d = r1
            r5.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.ui.IAmraidWebViewController.k():void");
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void n() {
        m mVar;
        if (this.C && this.D && this.A && (mVar = this.f26879b) != null) {
            mVar.a("FyberMraidVideoController.play()");
            f fVar = this.f26719p0;
            if (fVar != null) {
                com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(fVar, 5000L);
            }
            if (this.E) {
                this.f26879b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final boolean a(WebView webView, String str) {
        r rVar;
        IAlog.a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f26879b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        String lowerCase = str != null ? str.toLowerCase(Locale.US) : null;
        if (lowerCase != null) {
            Locale locale = Locale.US;
            if (lowerCase.startsWith("FyMraidVideo".toLowerCase(locale))) {
                if (lowerCase.endsWith("fyMraidVideoAd".toLowerCase(locale))) {
                    IAlog.e("Dispatching MRAID Video detection event", new Object[0]);
                    com.fyber.inneractive.sdk.response.e eVarB = this.f26897t;
                    if (eVarB == null) {
                        x xVar = this.f26896s;
                        eVarB = xVar == null ? null : xVar.b();
                    }
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_VIDEO_DETECTED;
                    InneractiveAdRequest inneractiveAdRequest = this.f26895r;
                    x xVar2 = this.f26896s;
                    JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f23946c) == null) ? null : rVar.b();
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                    wVar.f24326c = uVar;
                    wVar.f24324a = inneractiveAdRequest;
                    wVar.f24327d = jSONArrayB;
                    wVar.a((String) null);
                    this.D = true;
                    n();
                } else if (lowerCase.endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase(locale))) {
                    IAlog.b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                    j1 j1Var = this.f26884g;
                    if (j1Var != null) {
                        this.X = false;
                        ((b0) j1Var).b(false);
                        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                        InneractiveAdRequest inneractiveAdRequest2 = this.f26895r;
                        x xVar3 = this.f26896s;
                        com.fyber.inneractive.sdk.response.e eVarB2 = xVar3 == null ? null : xVar3.b();
                        x xVar4 = this.f26896s;
                        JSONArray jSONArrayB2 = xVar4 == null ? null : xVar4.f23946c.b();
                        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVarB2);
                        wVar2.f24325b = tVar;
                        wVar2.f24324a = inneractiveAdRequest2;
                        wVar2.f24327d = jSONArrayB2;
                        wVar2.a("video_timeout_in_msecs", String.valueOf(5000)).a((String) null);
                    }
                    j1 j1Var2 = this.f26884g;
                    if (j1Var2 != null) {
                        ((b0) j1Var2).a(new MraidVideoFailedToDisplayError());
                    }
                } else if (str.toLowerCase(locale).endsWith("fyMraidVideoAdCompleted".toLowerCase(locale))) {
                    j1 j1Var3 = this.f26884g;
                    if (j1Var3 instanceof g0) {
                        ((com.fyber.inneractive.sdk.renderers.s) ((g0) j1Var3)).f26606a.J();
                    }
                }
                return true;
            }
        }
        return super.a(webView, str);
    }

    @Override // com.fyber.inneractive.sdk.web.i0, com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public final void a(boolean z10) {
        m mVar;
        super.a(z10);
        if (this.D && this.C && this.A && (mVar = this.f26879b) != null) {
            StringBuilder sb2 = new StringBuilder("FyberMraidVideoController.");
            sb2.append(z10 ? "play" : CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            sb2.append("();");
            mVar.a(sb2.toString());
        }
        if (this.f26879b == null || !z10) {
            return;
        }
        Handler handler = com.fyber.inneractive.sdk.util.r.f26804b;
        handler.postDelayed(new g(this), 1L);
        handler.postDelayed(new g(this), 100L);
        handler.postDelayed(new g(this), 250L);
        handler.postDelayed(new g(this), 1000L);
    }
}
