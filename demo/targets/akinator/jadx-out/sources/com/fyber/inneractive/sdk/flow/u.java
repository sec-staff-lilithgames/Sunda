package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import b0.e2;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends k implements com.fyber.inneractive.sdk.player.s {

    /* renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f23894m;

    /* renamed from: n, reason: collision with root package name */
    public String f23895n;

    /* renamed from: o, reason: collision with root package name */
    public final t f23896o = new t(this);

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (this.f23894m != null) {
            com.fyber.inneractive.sdk.response.e eVar = this.f23662b;
            this.f23894m.a((eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).O) == null) ? null : bVar.f24073d.size() == 0 ? new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, null) : new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, null), null, true);
        }
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(this.f23672l);
        this.f23671k.a();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(this.f23672l);
        this.f23671k.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_vast_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        IAlog.a(IAlog.a(this) + "start called", new Object[0]);
        a(this.f23667g, (com.fyber.inneractive.sdk.response.g) this.f23662b, this.f23661a, this);
    }

    public final com.fyber.inneractive.sdk.player.ui.remote.g j() {
        com.fyber.inneractive.sdk.player.a aVar;
        com.fyber.inneractive.sdk.player.ui.remote.g gVar;
        com.fyber.inneractive.sdk.player.t tVar = this.f23894m;
        if (tVar == null || (aVar = tVar.f26241f) == null || (gVar = ((com.fyber.inneractive.sdk.player.n) aVar).f26227u) == null) {
            return null;
        }
        return gVar;
    }

    public final void a(Exception exc, String str, boolean z10) {
        HashMap mapS = e2.s("description", str);
        if (exc != null) {
            mapS.put("exception", exc.getMessage());
        }
        if (j() != null) {
            j().f26316a.a();
        }
        com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR.name(), this.f23895n, this.f23661a, this.f23662b, mapS, Boolean.valueOf(z10));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.util.r.f26803a.execute(new e(new f(this.f23662b, this.f23661a, "send_failed_vast_creatives", this.f23667g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.player.s sVar) {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration;
        String str;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        com.fyber.inneractive.sdk.config.s0 s0VarF = f();
        if (s0VarF == null && gVar != null) {
            s0VarF = com.fyber.inneractive.sdk.config.a.a(gVar.f26643o);
        }
        AdSessionContext adSessionContextCreateNativeAdSessionContext = null;
        com.fyber.inneractive.sdk.model.vast.b bVar3 = gVar == null ? null : gVar.O;
        if (bVar3 != null && bVar3.f24073d.size() < bVar3.f24078i) {
            bVar3.f24073d.clear();
            bVar3.f24076g.clear();
            bVar3.f24073d.addAll(bVar3.f24080k);
            bVar3.f24076g.addAll(bVar3.f24081l);
        }
        t0 t0Var = new t0(s0VarF, rVar, gVar, inneractiveAdRequest);
        this.f23663c = t0Var;
        com.fyber.inneractive.sdk.player.t tVar2 = new com.fyber.inneractive.sdk.player.t(gVar, inneractiveAdRequest, t0Var, sVar);
        this.f23894m = tVar2;
        t0 t0Var2 = (t0) this.f23663c;
        t0Var2.f23892i = tVar2;
        t0Var2.f23949f = this.f23668h;
        this.f23895n = bVar3 != null ? bVar3.f24083n : null;
        tVar2.f26240e = null;
        if (gVar != null && (bVar2 = gVar.O) != null) {
            tVar2.f26240e = (com.fyber.inneractive.sdk.model.vast.r) bVar2.f24073d.poll();
        }
        if (tVar2.f26240e == null) {
            InneractiveVideoError.Error playerError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i10 = com.fyber.inneractive.sdk.player.r.f26235a[playerError.ordinal()];
            if (i10 == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i10 == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i10 == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i10 == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i10 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest2 = tVar2.f26237b;
            com.fyber.inneractive.sdk.response.g gVar2 = tVar2.f26238c;
            JSONArray jSONArrayB = tVar2.f26243h.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar2);
            wVar.f24325b = tVar;
            wVar.f24324a = inneractiveAdRequest2;
            wVar.f24327d = jSONArrayB;
            wVar.a((String) null);
            sVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.VAST_NO_MEDIA_FILES));
        } else {
            try {
                tVar2.f26241f = tVar2.f26236a.a();
            } catch (Throwable th2) {
                tVar2.f26239d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CREATE_FLOW_MANAGER, th2));
            }
            com.fyber.inneractive.sdk.player.a aVar = tVar2.f26241f;
            if (aVar != null) {
                com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) aVar;
                com.fyber.inneractive.sdk.measurement.e eVar = nVar.f26163d;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.measurement.f fVar = new com.fyber.inneractive.sdk.measurement.f();
                    ArrayList arrayList = nVar.f26222p.f24074e;
                    t0 t0Var3 = nVar.f26161b;
                    try {
                        try {
                            CreativeType creativeType = CreativeType.VIDEO;
                            ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                            Owner owner = Owner.NATIVE;
                            adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
                        } catch (Throwable th3) {
                            fVar.a(th3);
                            adSessionConfigurationCreateAdSessionConfiguration = null;
                        }
                        ArrayList arrayListA = fVar.a(arrayList);
                        Partner partner = eVar.f24008e;
                        if (partner != null && (str = eVar.f24005b) != null) {
                            try {
                                adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, str, arrayListA, "", "");
                            } catch (Throwable th4) {
                                fVar.a(th4);
                            }
                        }
                        AdSession adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateNativeAdSessionContext);
                        fVar.f24013a = adSessionCreateAdSession;
                        fVar.f24014b = AdEvents.createAdEvents(adSessionCreateAdSession);
                        fVar.f24015c = MediaEvents.createMediaEvents(fVar.f24013a);
                        fVar.f24013a.start();
                        fVar.f24018f = t0Var3;
                    } catch (Throwable th5) {
                        fVar.a(th5);
                    }
                    nVar.f26164e = fVar;
                    nVar.f26165f = new com.fyber.inneractive.sdk.player.p(fVar);
                }
                if (nVar.f26164e == null && (bVar = nVar.f26222p) != null) {
                    Iterator it = bVar.f24074e.iterator();
                    while (it.hasNext()) {
                        com.fyber.inneractive.sdk.measurement.h hVar = (com.fyber.inneractive.sdk.measurement.h) it.next();
                        com.fyber.inneractive.sdk.measurement.i iVar = com.fyber.inneractive.sdk.measurement.i.ERROR_DURING_RESOURCE_LOAD;
                        com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_VERIFICATION_NOT_EXECUTED;
                        com.fyber.inneractive.sdk.player.n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar), iVar), xVar);
                    }
                }
            }
            tVar2.a();
        }
        if (TextUtils.isEmpty(this.f23895n)) {
            return;
        }
        IAConfigManager.O.f23224s.a(new com.fyber.inneractive.sdk.network.v0(this.f23896o, com.fyber.inneractive.sdk.util.o.f26796a, new com.fyber.inneractive.sdk.cache.l(this.f23895n)));
    }
}
