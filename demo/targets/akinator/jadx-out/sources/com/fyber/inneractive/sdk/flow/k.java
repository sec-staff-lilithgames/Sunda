package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import be.nVUQ.UupKET;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import j1.o2;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k implements com.fyber.inneractive.sdk.interfaces.c, com.fyber.inneractive.sdk.interfaces.b {

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f23661a;

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f23662b;

    /* renamed from: c, reason: collision with root package name */
    public x f23663c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.a f23664d;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.b f23665e;

    /* renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.r0 f23666f;

    /* renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f23667g;

    /* renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.timeouts.content.a f23670j;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23668h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f23669i = 0;

    /* renamed from: l, reason: collision with root package name */
    public final j f23672l = new j(this);

    /* renamed from: k, reason: collision with root package name */
    public d f23671k = new d(this);

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.interfaces.a aVar, com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f23661a = inneractiveAdRequest;
        this.f23662b = eVar;
        this.f23664d = aVar;
        this.f23665e = bVar;
        this.f23671k = new d(this);
        this.f23667g = rVar;
        UnitDisplayType unitDisplayType = eVar.f26644p;
        this.f23670j = new com.fyber.inneractive.sdk.network.timeouts.content.a((unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.NATIVE) ? unitDisplayType.name().toLowerCase(Locale.US) : UnitDisplayType.BANNER.name().toLowerCase(Locale.US), com.fyber.inneractive.sdk.response.a.a(eVar.f26635g) == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST ? "video" : "display", (int) eVar.K, eVar.D, IAConfigManager.O.f23217l, this.f23667g);
        if (this.f23661a == null) {
            this.f23666f = com.fyber.inneractive.sdk.config.a.a(eVar.f26643o);
        }
        try {
            i();
        } catch (Throwable th2) {
            IAlog.f("Failed to start ContentLoader", IAlog.a(this));
            com.fyber.inneractive.sdk.network.z.a(th2, inneractiveAdRequest, eVar);
            this.f23671k.a();
            b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.CONTENT_LOADER_START_FAILED));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f23669i - 1);
        int i10 = this.f23669i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f23670j;
        if (aVar != null) {
            if (aVar.f24303g) {
                i10 = aVar.f24297a - i10;
            }
            iB = o2.B(aVar.f24298b, i10, aVar.f24300d, i10 == aVar.f24297a ? aVar.f24304h : 0);
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onRetry() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(iB));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f23665e;
        if (bVar != null) {
            bVar.b();
        }
        i();
    }

    public void c() {
        g();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public abstract void cancel();

    public InneractiveInfrastructureError d() {
        i iVar = i.WEBVIEW_LOAD_TIMEOUT;
        com.fyber.inneractive.sdk.response.e eVar = this.f23662b;
        if ("video".equalsIgnoreCase((eVar == null || com.fyber.inneractive.sdk.response.a.a(eVar.f26635g) != com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST) ? "display" : "video")) {
            iVar = i.VIDEO_AD_LOAD_TIMEOUT;
        }
        return new InneractiveInfrastructureError(InneractiveErrorCode.LOAD_TIMEOUT, iVar);
    }

    public abstract String e();

    public final com.fyber.inneractive.sdk.config.s0 f() {
        InneractiveAdRequest inneractiveAdRequest = this.f23661a;
        return inneractiveAdRequest == null ? this.f23666f : inneractiveAdRequest.getSelectedUnitConfig();
    }

    public final void g() {
        String str;
        this.f23671k.a();
        InneractiveAdRequest inneractiveAdRequest = this.f23661a;
        if (inneractiveAdRequest != null) {
            str = inneractiveAdRequest.f23899b;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = this.f23662b;
            if (eVar == null || (str = eVar.B) == null) {
                str = null;
            }
        }
        com.fyber.inneractive.sdk.metrics.d.f24047d.a(str).i();
        x xVar = this.f23663c;
        if (xVar != null) {
            xVar.a(str);
        }
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f23664d;
        if (aVar != null) {
            aVar.a(this.f23661a);
        }
    }

    public abstract void h();

    public final void i() {
        int i10 = this.f23669i;
        this.f23669i = i10 + 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f23670j;
        if (aVar != null) {
            if (aVar.f24303g) {
                i10 = aVar.f24297a - i10;
            }
            iB = o2.B(aVar.f24298b, i10, aVar.f24300d, i10 == aVar.f24297a ? aVar.f24304h : 0);
        }
        IAlog.a("%s : IAAdContentLoaderImpl : Start timeout: %d, attempt number: %d", IAlog.a(this), Integer.valueOf(iB), Integer.valueOf(this.f23669i - 1));
        d dVar = this.f23671k;
        if (dVar.f23545a == null) {
            HandlerThread handlerThread = new HandlerThread("TimeoutHandlerThread");
            handlerThread.start();
            dVar.f23545a = new Handler(handlerThread.getLooper());
        }
        dVar.f23545a.postDelayed(dVar.f23548d, iB);
        h();
    }

    public final void b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        String string;
        IAlog.a("%s : IAAdContentLoaderImpl : Handle Retry for error: %s", IAlog.a(this), inneractiveInfrastructureError.getErrorCode().toString());
        d dVar = this.f23671k;
        dVar.getClass();
        IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(dVar));
        Handler handler = dVar.f23545a;
        if (handler != null) {
            handler.removeCallbacks(dVar.f23548d);
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f23670j;
        boolean z10 = this.f23669i <= (aVar != null ? aVar.f24297a : 0);
        IAlog.a("%s : IAAdContentLoaderImpl : should retry: %s", IAlog.a(this), Boolean.valueOf(z10));
        if (z10) {
            x xVar = this.f23663c;
            if (xVar != null) {
                xVar.destroy();
                this.f23663c = null;
            }
            com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f23670j;
            int i10 = aVar2 != null ? aVar2.f24301e : 0;
            IAlog.a("%s : IAAdContentLoaderImpl : retryLoad : post load ad content retry task with delay: %d", IAlog.a(this), Integer.valueOf(i10));
            com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(this.f23672l, i10);
            return;
        }
        com.fyber.inneractive.sdk.interfaces.a aVar3 = this.f23664d;
        if (aVar3 != null) {
            aVar3.a(inneractiveInfrastructureError);
        }
        InneractiveAdRequest inneractiveAdRequest = this.f23661a;
        com.fyber.inneractive.sdk.response.e eVar = this.f23662b;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f23667g;
        JSONArray jSONArrayB = rVar == null ? null : rVar.b();
        if (inneractiveInfrastructureError.getErrorCode() == InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_FAILED_TO_LOAD_AD;
            if (!inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                IAlog.a("Firing Event 402 - NativeAdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                JSONObject jSONObject = new JSONObject();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                wVar.f24325b = tVar;
                wVar.f24324a = inneractiveAdRequest;
                wVar.f24327d = jSONArrayB;
                if (inneractiveInfrastructureError.getCause() != null) {
                    string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    for (int i11 = 7; i11 >= 0 && i11 < 13 && i11 < stackTrace.length; i11++) {
                        sb2.append(stackTrace[i11].toString());
                        sb2.append(",");
                    }
                    Log.d("stack trace:", sb2.toString());
                    string = sb2.toString();
                }
                String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
                String str = UupKET.diPqrm;
                try {
                    jSONObject.put(str, string2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", str, string2);
                }
                try {
                    jSONObject.put("description", string);
                } catch (Exception unused2) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "description", string);
                }
                String strDescription = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", strDescription);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
                }
                wVar.f24329f.put(jSONObject);
                wVar.a((String) null);
                inneractiveInfrastructureError.addReportedError(tVar);
            }
        } else {
            a.a(inneractiveAdRequest, inneractiveInfrastructureError, this.f23663c, eVar, jSONArrayB);
        }
        cancel();
    }

    public void a() {
        int iB;
        InneractiveInfrastructureError inneractiveInfrastructureError;
        String strA = IAlog.a(this);
        Integer numValueOf = Integer.valueOf(this.f23669i - 1);
        int i10 = this.f23669i - 1;
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar = this.f23670j;
        if (aVar != null) {
            if (aVar.f24303g) {
                i10 = aVar.f24297a - i10;
            }
            iB = o2.B(aVar.f24298b, i10, aVar.f24300d, i10 == aVar.f24297a ? aVar.f24304h : 0);
        } else {
            iB = 0;
        }
        IAlog.a("%s : IAAdContentLoaderImpl : onTimeout() attempt: %d timeout: %d", strA, numValueOf, Integer.valueOf(iB));
        com.fyber.inneractive.sdk.interfaces.b bVar = this.f23665e;
        if (bVar != null) {
            bVar.a();
        }
        com.fyber.inneractive.sdk.network.timeouts.content.a aVar2 = this.f23670j;
        if (this.f23669i <= (aVar2 != null ? aVar2.f24297a : 0)) {
            inneractiveInfrastructureError = d();
        } else {
            inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.IN_FLIGHT_TIMEOUT, i.NO_TIME_TO_LOAD_AD_CONTENT);
        }
        com.fyber.inneractive.sdk.util.r.f26803a.execute(new e(new f(this.f23662b, this.f23661a, e(), this.f23667g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }
}
