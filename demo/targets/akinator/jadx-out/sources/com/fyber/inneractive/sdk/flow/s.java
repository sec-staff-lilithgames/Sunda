package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s extends k {

    /* renamed from: m, reason: collision with root package name */
    public IAmraidWebViewController f23779m;

    /* renamed from: n, reason: collision with root package name */
    public final q f23780n = new q(this);

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        IAmraidWebViewController iAmraidWebViewController;
        AdSession adSession;
        IAlog.a("%s : IAMraidContentLoader : destroyController", IAlog.a(this));
        if (this.f23663c != null && (iAmraidWebViewController = this.f23779m) != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f24029a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f24029a = null;
                eVar.f24030b = null;
            }
            this.f23779m.e();
            this.f23779m = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        IAmraidWebViewController iAmraidWebViewController;
        AdSession adSession;
        IAlog.a("%s : IAMraidContentLoader : destroyController", IAlog.a(this));
        if (this.f23663c != null && (iAmraidWebViewController = this.f23779m) != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f24029a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f24029a = null;
                eVar.f24030b = null;
            }
            this.f23779m.e();
            this.f23779m = null;
        }
        this.f23671k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(this.f23672l);
        this.f23661a = null;
        this.f23662b = null;
        this.f23663c = null;
        this.f23664d = null;
        this.f23665e = null;
        this.f23666f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final InneractiveInfrastructureError d() {
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f23670j;
        if (aVar != null) {
            int i10 = this.f23669i;
            if (aVar.f24303g) {
                i10 = aVar.f24297a - i10;
            }
            iB = o2.B(aVar.f24298b, i10, aVar.f24300d, i10 == aVar.f24297a ? aVar.f24304h : 0);
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, i.WEBVIEW_LOAD_TIMEOUT, new Exception(p0.o2.k(iB, "LoadTimeout after ", " ms")));
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_display_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.web.z zVar;
        String str;
        q0 q0Var = new q0(f(), this.f23667g);
        this.f23663c = q0Var;
        com.fyber.inneractive.sdk.response.e eVar = this.f23662b;
        q0Var.f23945b = (com.fyber.inneractive.sdk.response.f) eVar;
        q0Var.f23949f = this.f23668h;
        com.fyber.inneractive.sdk.measurement.e eVar2 = null;
        UnitDisplayType unitDisplayType = eVar != null ? ((com.fyber.inneractive.sdk.response.f) eVar).f26644p : null;
        com.fyber.inneractive.sdk.web.c0 c0Var = com.fyber.inneractive.sdk.web.c0.INLINE;
        if (unitDisplayType == null) {
            this.f23780n.a(null, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.EMPTY_UNIT_DISPLAY_TYPE, new Exception("Unit display type was not found")));
            return;
        }
        int i10 = r.f23778a[unitDisplayType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
            InneractiveAdRequest inneractiveAdRequest = this.f23661a;
            if (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen()) {
                c0Var = com.fyber.inneractive.sdk.web.c0.INTERSTITIAL;
            }
        } else {
            zVar = com.fyber.inneractive.sdk.web.z.ENABLED;
        }
        com.fyber.inneractive.sdk.web.c0 c0Var2 = c0Var;
        com.fyber.inneractive.sdk.web.z zVar2 = zVar;
        com.fyber.inneractive.sdk.response.e eVar3 = this.f23662b;
        boolean z10 = (eVar3 == null || (str = ((com.fyber.inneractive.sdk.response.f) eVar3).N) == null || str.contains("iaNotifyLoadFinished")) ? false : true;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        boolean z11 = !unitDisplayType.isFullscreenUnit() || iAConfigManager.f23226u.f23394b.a(true, "use_fraud_detection_fullscreen");
        try {
            com.fyber.inneractive.sdk.web.d0 d0Var = com.fyber.inneractive.sdk.web.d0.AD_CONTROLLED;
            com.fyber.inneractive.sdk.config.global.r rVar = this.f23667g;
            if (rVar != null) {
                Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.l) rVar.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c(com.ironsource.mediationsdk.metadata.a.f37604j);
                boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
                IAlog.a("OMSDK AB %s", String.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    eVar2 = iAConfigManager.K;
                }
            }
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(z11, c0Var2, zVar2, d0Var, z10, eVar2, this.f23667g);
            this.f23779m = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f23663c);
            this.f23779m.setAdRequest(this.f23661a);
            IAmraidWebViewController iAmraidWebViewController2 = this.f23779m;
            q0 q0Var2 = (q0) this.f23663c;
            q0Var2.getClass();
            iAmraidWebViewController2.setMuteMraidVideo(iAConfigManager.f23216k || q0Var2.f23949f);
            ((q0) this.f23663c).f23777i = this.f23779m;
            com.fyber.inneractive.sdk.response.e eVar4 = this.f23662b;
            if (eVar4 != null) {
                UnitDisplayType unitDisplayType2 = ((com.fyber.inneractive.sdk.response.f) eVar4).f26644p;
                InneractiveAdRequest inneractiveAdRequest2 = this.f23661a;
                boolean z12 = inneractiveAdRequest2 == null || inneractiveAdRequest2.getAllowFullscreen();
                StringBuilder sb2 = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z12) {
                    sb2.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                if (unitDisplayType2 != null && !unitDisplayType2.isFullscreenUnit()) {
                    if (unitDisplayType2 == UnitDisplayType.BANNER) {
                        sb3.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
                    } else {
                        sb3.append(" #iawrapper { position:unset !important; display: unset !important; }");
                    }
                }
                String string2 = sb3.toString();
                this.f23779m.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit() || UnitDisplayType.MRECT.equals(unitDisplayType));
                IAmraidWebViewController iAmraidWebViewController3 = this.f23779m;
                int i11 = com.fyber.inneractive.sdk.config.k.f23321a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                String strL = TextUtils.isEmpty(property) ? "wv.inner-active.mobi/simpleM2M/" : o2.l(property, ".inner-active.mobi/simpleM2M/");
                String str2 = "" + ((com.fyber.inneractive.sdk.response.f) this.f23662b).N;
                iAmraidWebViewController3.f26883f = this.f23780n;
                try {
                    iAmraidWebViewController3.h();
                    com.fyber.inneractive.sdk.web.e eVar5 = new com.fyber.inneractive.sdk.web.e(iAmraidWebViewController3, str2, true, string, string2, strL);
                    iAmraidWebViewController3.f26892o = eVar5;
                    eVar5.a().post(new com.fyber.inneractive.sdk.util.c(eVar5));
                } catch (Throwable th2) {
                    InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CONFIGURE_WEBVIEW, th2);
                    com.fyber.inneractive.sdk.web.g gVar = iAmraidWebViewController3.f26883f;
                    if (gVar != null) {
                        gVar.a(iAmraidWebViewController3, inneractiveInfrastructureError);
                    }
                    iAmraidWebViewController3.b(true);
                }
            }
        } catch (Throwable th3) {
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CREATE_WEBVIEW_CONTROLLER, th3));
        }
    }
}
