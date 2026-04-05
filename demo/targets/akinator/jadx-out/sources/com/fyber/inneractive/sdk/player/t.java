package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t implements q {

    /* renamed from: a, reason: collision with root package name */
    public final b f26236a;

    /* renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f26237b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f26238c;

    /* renamed from: d, reason: collision with root package name */
    public final s f26239d;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.r f26240e;

    /* renamed from: f, reason: collision with root package name */
    public a f26241f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26242g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f26243h;

    public t(com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, t0 t0Var, s sVar) {
        this.f26237b = inneractiveAdRequest;
        this.f26238c = gVar;
        this.f26239d = sVar;
        this.f26243h = t0Var.f23946c;
        this.f26236a = new b(t0Var);
    }

    public final void a() {
        a aVar = this.f26241f;
        if (aVar == null) {
            this.f26239d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_USING_FLOW_MANAGER, new Exception("loadNextMediaFile flowManager is null")));
            return;
        }
        com.fyber.inneractive.sdk.model.vast.r rVar = this.f26240e;
        n nVar = (n) aVar;
        nVar.f26171l = this;
        if (rVar != null) {
            String str = rVar.f24141g;
            nVar.f26173n = rVar;
            nVar.f26170k++;
            nVar.f26167h = false;
            nVar.f26169j = false;
            IAlog.a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
            IAlog.a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
            if (nVar.f26168i) {
                return;
            }
            nVar.f26160a.a(str, nVar.f26172m);
        }
    }

    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject, boolean z10) {
        JSONObject jSONObject2;
        InneractiveErrorCode inneractiveErrorCode;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.network.t tVar2;
        if (jSONObject != null || inneractiveVideoError == null) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            ((n) this.f26241f).b(inneractiveVideoError, jSONObject2);
        }
        com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.UNSPECIFIED;
        if (inneractiveVideoError != null) {
            InneractiveVideoError.Error playerError = inneractiveVideoError.getPlayerError();
            int i10 = r.f26235a[playerError.ordinal()];
            if (i10 == 1) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i10 == 2) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i10 == 3) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i10 == 4) {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i10 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest = this.f26237b;
            com.fyber.inneractive.sdk.response.g gVar = this.f26238c;
            JSONArray jSONArrayB = this.f26243h.b();
            w wVar = new w(gVar);
            wVar.f24325b = tVar2;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArrayB;
            if (jSONObject2 != null) {
                try {
                    wVar.f24329f.put(new JSONObject(jSONObject2.toString()));
                } catch (Exception unused) {
                }
            }
            wVar.a((String) null);
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            com.fyber.inneractive.sdk.network.t tVar3 = com.fyber.inneractive.sdk.network.t.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f26237b;
            com.fyber.inneractive.sdk.response.g gVar2 = this.f26238c;
            JSONArray jSONArrayB2 = this.f26243h.b();
            w wVar2 = new w(gVar2);
            wVar2.f24325b = tVar3;
            wVar2.f24324a = inneractiveAdRequest2;
            wVar2.f24327d = jSONArrayB2;
            wVar2.a((String) null);
        }
        if (inneractiveVideoError != null) {
            IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
            if (z10) {
                inneractiveErrorCode = InneractiveErrorCode.LOAD_TIMEOUT;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_AD_LOAD_TIMEOUT;
            } else {
                inneractiveErrorCode = null;
            }
            IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
            if (inneractiveVideoError.getPlayerError().isFatal()) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_FATAL_ERROR;
            }
            if (inneractiveErrorCode == null) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                iVar = com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_UNSPECIFIED;
            }
        } else {
            inneractiveErrorCode = null;
        }
        if (z10) {
            return;
        }
        this.f26240e = null;
        com.fyber.inneractive.sdk.response.g gVar3 = this.f26238c;
        if (gVar3 != null && (bVar = gVar3.O) != null) {
            this.f26240e = (com.fyber.inneractive.sdk.model.vast.r) bVar.f24073d.poll();
        }
        if (this.f26240e == null) {
            InneractiveVideoError.Error playerError2 = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i11 = r.f26235a[playerError2.ordinal()];
            if (i11 == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i11 == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i11 == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i11 == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i11 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError2.getErrorString(), new Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest3 = this.f26237b;
            com.fyber.inneractive.sdk.response.g gVar4 = this.f26238c;
            JSONArray jSONArrayB3 = this.f26243h.b();
            w wVar3 = new w(gVar4);
            wVar3.f24325b = tVar;
            wVar3.f24324a = inneractiveAdRequest3;
            wVar3.f24327d = jSONArrayB3;
            wVar3.a((String) null);
            s sVar = this.f26239d;
            if (sVar != null) {
                if (inneractiveVideoError != null) {
                    sVar.a(new InneractiveInfrastructureError(inneractiveErrorCode, iVar, inneractiveVideoError.getCause()));
                    return;
                } else {
                    sVar.a(new InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_NULL));
                    return;
                }
            }
            return;
        }
        if (this.f26242g) {
            return;
        }
        try {
            this.f26241f = this.f26236a.a();
        } catch (Throwable th2) {
            this.f26239d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_CREATE_FLOW_MANAGER, th2));
        }
        a();
    }

    public final void a(String str, String... strArr) {
        a aVar = this.f26241f;
        if (aVar != null) {
            n nVar = (n) aVar;
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                nVar.f26224r = true;
                return;
            }
            if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String str2 : strArr) {
                    nVar.a(nVar.f26222p, VideoClickOrigin.InvalidOrigin, x.a(str2));
                }
            }
        }
    }
}
