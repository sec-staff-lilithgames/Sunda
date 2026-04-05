package com.fyber.inneractive.sdk.player;

import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.network.x;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.media.Position;
import com.iab.omid.library.fyber.adsession.media.VastProperties;
import com.ironsource.C3434s;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n extends f implements a {

    /* renamed from: x, reason: collision with root package name */
    public static final k f26221x = new k();

    /* renamed from: p, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.b f26222p;

    /* renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.a f26223q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26224r;

    /* renamed from: s, reason: collision with root package name */
    public final s0 f26225s;

    /* renamed from: t, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.k f26226t;

    /* renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.remote.g f26227u;

    /* renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.b f26228v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f26229w;

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) throws NumberFormatException {
        boolean zA;
        w wVar;
        String str;
        int i10;
        int i11;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.response.e eVar2;
        com.fyber.inneractive.sdk.response.e eVar3;
        s0 s0Var;
        IAlog.a("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar);
        p pVar = this.f26165f;
        if (pVar != null && bVar != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            pVar.a(bVar);
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared && pVar != null) {
            pVar.f26234d = true;
        }
        int i12 = d.f24480a[bVar.ordinal()];
        if (i12 == 1) {
            IAlog.a("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.f26168i) {
                IAlog.a("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            } else {
                this.f26167h = true;
                if (this.f26164e != null && this.f26161b != null && (s0Var = this.f26225s) != null) {
                    int iIntValue = ((r0) s0Var).f23348f.f23406h.value().intValue();
                    boolean zA2 = f.a(this.f26160a.c(), ((com.fyber.inneractive.sdk.response.g) this.f26161b.f23945b).f26653y, this.f26225s);
                    boolean zBooleanValue = ((r0) this.f26225s).f23348f.f23399a.booleanValue();
                    com.fyber.inneractive.sdk.measurement.f fVar = this.f26164e;
                    if (!zA2) {
                        iIntValue = 0;
                    }
                    if (fVar.f24014b != null) {
                        try {
                            fVar.f24014b.loaded(zA2 ? VastProperties.createVastPropertiesForSkippableMedia(iIntValue, zBooleanValue, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(zBooleanValue, Position.STANDALONE));
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                }
                if (this.f26171l != null) {
                    t0 t0Var = this.f26161b;
                    if (t0Var == null || (eVar3 = t0Var.f23945b) == null) {
                        zA = false;
                    } else {
                        zA = f.a(this.f26160a.c(), eVar3.f26653y, this.f26225s);
                        eVar3.f26648t.setVideo(new ImpressionData.Video(zA, (int) TimeUnit.MILLISECONDS.toSeconds(this.f26160a.c())));
                    }
                    try {
                        t0 t0Var2 = this.f26161b;
                        com.fyber.inneractive.sdk.response.g gVar = t0Var2 != null ? (com.fyber.inneractive.sdk.response.g) t0Var2.f23945b : null;
                        u uVar = u.EVENT_READY_ON_CLIENT;
                        InneractiveAdRequest inneractiveAdRequest = this.f26162c;
                        t0 t0Var3 = this.f26161b;
                        JSONArray jSONArrayB = t0Var3 == null ? null : t0Var3.f23946c.b();
                        w wVar2 = new w(gVar);
                        wVar2.f24326c = uVar;
                        wVar2.f24324a = inneractiveAdRequest;
                        wVar2.f24327d = jSONArrayB;
                        if (this.f26173n == null || gVar == null) {
                            wVar = wVar2;
                        } else {
                            IAlog.a("Video content loader: Vast load took: " + (System.currentTimeMillis() - gVar.N) + " msec", new Object[0]);
                            t0 t0Var4 = this.f26161b;
                            if (t0Var4 == null || (eVar2 = t0Var4.f23945b) == null || ((com.fyber.inneractive.sdk.response.g) eVar2).O == null) {
                                str = "";
                                i10 = 0;
                                i11 = 0;
                            } else {
                                i10 = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f24078i;
                                i11 = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f24079j;
                                str = ((com.fyber.inneractive.sdk.response.g) eVar2).O.f24070a;
                            }
                            String str2 = "0";
                            if (t0Var4 != null && (eVar = t0Var4.f23945b) != null && !TextUtils.isEmpty(((com.fyber.inneractive.sdk.response.g) eVar).E)) {
                                str2 = ((com.fyber.inneractive.sdk.response.g) this.f26161b.f23945b).E;
                            }
                            x xVar = new x();
                            xVar.a(Integer.valueOf(this.f26160a.c() / 1000), IronSourceConstants.EVENTS_DURATION).a(this.f26173n.f24141g, "url").a(this.f26173n.f24139e, "bitrate").a(TextUtils.isEmpty(this.f26173n.f24138d) ? "na" : this.f26173n.f24138d, "mime").a(this.f26173n.f24135a, C3434s.f38306g).a(Long.valueOf(System.currentTimeMillis() - gVar.N), "load_time").a(Integer.valueOf(this.f26170k), "media_file_index").a(this.f26160a.d(), "player").a(Boolean.valueOf(zA), "is_video_skippable").a(Integer.valueOf(i10), "supported_media_files").a(Integer.valueOf(i11), "total_media_files").a(str, "vast_version");
                            if (str2 != null && str2.equals("1")) {
                                xVar.a(str2, "hide_endcard");
                            }
                            wVar = wVar2;
                            wVar.f24329f.put(xVar.f24331a);
                        }
                        wVar.a((String) null);
                    } catch (Exception unused) {
                    }
                    t tVar = (t) this.f26171l;
                    if (!tVar.f26242g) {
                        tVar.f26242g = true;
                        s sVar = tVar.f26239d;
                        if (sVar != null) {
                            sVar.c();
                        }
                    }
                }
            }
        } else if (i12 == 2) {
            IAlog.a("IAMediaPlayerFlowManager: onPlayerBuffering", new Object[0]);
        } else if (i12 == 3) {
            this.f26160a.b();
        }
        int i13 = l.f26180a[bVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                if (this.f26223q.equals(com.fyber.inneractive.sdk.player.enums.a.Completed)) {
                    a(com.fyber.inneractive.sdk.player.enums.a.Restarted);
                    return;
                }
                return;
            } else {
                if (i13 != 3) {
                    return;
                }
                b(this.f26160a.c());
                a(com.fyber.inneractive.sdk.player.enums.a.Completed);
                return;
            }
        }
        com.fyber.inneractive.sdk.model.vast.b bVar2 = this.f26222p;
        if (bVar2 == null || bVar2.f24082m.size() == 0) {
            return;
        }
        int iC = this.f26160a.c();
        Iterator it = this.f26222p.f24082m.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.model.vast.e eVar4 = (com.fyber.inneractive.sdk.model.vast.e) it.next();
            int i14 = -1;
            if (eVar4.f24097c == -1) {
                if (!TextUtils.isEmpty(eVar4.f24096b)) {
                    String str3 = eVar4.f24096b;
                    i14 = Integer.parseInt(str3.substring(0, str3.length() - 1));
                }
                eVar4.f24097c = (i14 * iC) / 100;
            }
        }
        Collections.sort(this.f26222p.f24082m, new com.fyber.inneractive.sdk.model.vast.d());
    }

    public final void b(int i10) {
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f26222p;
        if (bVar == null || bVar.f24082m.isEmpty()) {
            return;
        }
        while (this.f26222p.f24082m.size() > 0 && i10 >= ((com.fyber.inneractive.sdk.model.vast.e) this.f26222p.f24082m.get(0)).f24097c) {
            com.fyber.inneractive.sdk.model.vast.e eVar = (com.fyber.inneractive.sdk.model.vast.e) this.f26222p.f24082m.get(0);
            String str = eVar.f24095a;
            if (!TextUtils.isEmpty(str)) {
                IAlog.a("IAVastMediaPlayerFlowManager: Firing event for type: progress", new Object[0]);
                z0.b(str);
            }
            this.f26222p.f24082m.remove(eVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(android.content.Context r22, com.fyber.inneractive.sdk.response.g r23, com.fyber.inneractive.sdk.config.s0 r24, com.fyber.inneractive.sdk.external.InneractiveAdRequest r25, com.fyber.inneractive.sdk.flow.t0 r26, com.fyber.inneractive.sdk.measurement.e r27) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.n.<init>(android.content.Context, com.fyber.inneractive.sdk.response.g, com.fyber.inneractive.sdk.config.s0, com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.flow.t0, com.fyber.inneractive.sdk.measurement.e):void");
    }

    public final void b(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) throws JSONException {
        try {
            if (this.f26173n != null && inneractiveVideoError.getPlayerError() != InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES) {
                jSONObject.put("url", this.f26173n.f24141g);
                jSONObject.put("bitrate", this.f26173n.f24139e);
                jSONObject.put("mime", this.f26173n.f24138d);
                jSONObject.put(C3434s.f38306g, this.f26173n.f24135a);
            }
            com.fyber.inneractive.sdk.player.controller.q qVar = this.f26160a;
            jSONObject.put("player", qVar != null ? qVar.d() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.a("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.o
    public final void a(int i10) {
        int iC = this.f26160a.c();
        b(i10);
        int i11 = l.f26181b[this.f26223q.ordinal()];
        if (i11 == 1) {
            if (this.f26160a.f24434e != com.fyber.inneractive.sdk.player.enums.b.Buffering) {
                a(com.fyber.inneractive.sdk.player.enums.a.Started);
                com.fyber.inneractive.sdk.measurement.f fVar = this.f26164e;
                if (fVar != null) {
                    if (fVar.f24014b != null && !fVar.f24017e) {
                        IAlog.a("%s impression", "OMVideo");
                        fVar.f24017e = true;
                        try {
                            fVar.f24014b.impressionOccurred();
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                    com.fyber.inneractive.sdk.measurement.f fVar2 = this.f26164e;
                    long jC = this.f26160a.c();
                    float f10 = this.f26160a.g() ? 0.0f : 1.0f;
                    if (fVar2.f24015c == null || fVar2.f24016d) {
                        return;
                    }
                    fVar2.f24016d = true;
                    IAlog.a("%s start", "OMVideo");
                    try {
                        fVar2.f24015c.start(jC, f10);
                        return;
                    } catch (Throwable th3) {
                        fVar2.a(th3);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (i10 > iC / 4) {
                a(com.fyber.inneractive.sdk.player.enums.a.FirstQuarter);
                com.fyber.inneractive.sdk.measurement.f fVar3 = this.f26164e;
                if (fVar3 == null || fVar3.f24015c == null) {
                    return;
                }
                IAlog.a("%s firstQuartile", "OMVideo");
                try {
                    fVar3.f24015c.firstQuartile();
                    return;
                } catch (Throwable th4) {
                    fVar3.a(th4);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && i10 > (iC / 4) * 3) {
                a(com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter);
                com.fyber.inneractive.sdk.measurement.f fVar4 = this.f26164e;
                if (fVar4 == null || fVar4.f24015c == null) {
                    return;
                }
                IAlog.a("%s thirdQuartile", "OMVideo");
                try {
                    fVar4.f24015c.thirdQuartile();
                    return;
                } catch (Throwable th5) {
                    fVar4.a(th5);
                    return;
                }
            }
            return;
        }
        if (i10 > iC / 2) {
            a(com.fyber.inneractive.sdk.player.enums.a.MidPoint);
            com.fyber.inneractive.sdk.measurement.f fVar5 = this.f26164e;
            if (fVar5 == null || fVar5.f24015c == null) {
                return;
            }
            IAlog.a("%s midpoint", "OMVideo");
            try {
                fVar5.f24015c.midpoint();
            } catch (Throwable th6) {
                fVar5.a(th6);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.f
    public final void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) throws JSONException {
        a(this.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_ERROR);
        b(inneractiveVideoError, jSONObject);
        IAlog.f("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        q qVar = this.f26171l;
        if (qVar != null) {
            try {
                ((t) qVar).a(inneractiveVideoError, jSONObject, false);
            } catch (Exception e10) {
                if (IAlog.f26748a <= 3) {
                    e10.printStackTrace();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.f
    public final void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x... xVarArr) {
        if (xVarArr.length == 0) {
            IAlog.f("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
            return;
        }
        if (iVar == null) {
            IAlog.f("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (com.fyber.inneractive.sdk.model.vast.x xVar : xVarArr) {
            String strA = xVar.a();
            IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", strA);
            List<String> listA = iVar.a(xVar);
            if (listA != null && !listA.isEmpty()) {
                arrayList.addAll(listA);
                IAlog.a("found %d events for type: %s, url: %s", Integer.valueOf(listA.size()), strA, listA.get(0));
                for (String str : listA) {
                    IAlog.a("   event url: %s", str);
                    if (!TextUtils.isEmpty(str)) {
                        IAlog.d("%s %s %s", "VAST_EVENT", xVar.a(), str);
                        IAlog.d("Tracking URLs array: %s", "VPAID", str);
                    }
                }
            } else {
                IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", strA);
            }
            if (xVar == com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK) {
                for (Map.Entry entry : f26221x.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String strA2 = ((m) entry.getValue()).a(this.f26160a, videoClickOrigin);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        String str3 = (String) arrayList.get(i10);
                        if (str3.contains(str2)) {
                            arrayList.set(i10, str3.replace(str2, strA2));
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (!TextUtils.isEmpty(str4)) {
                z0.b(str4);
            }
        }
    }

    public static void a(com.fyber.inneractive.sdk.response.i iVar, com.fyber.inneractive.sdk.model.vast.x... xVarArr) {
        ArrayList arrayList = new ArrayList();
        for (com.fyber.inneractive.sdk.model.vast.x xVar : xVarArr) {
            String strA = xVar.a();
            IAlog.a("IAVastMediaPlayerFlowManager: Firing events for type: %s", strA);
            List<String> listA = iVar.a(xVar);
            if (listA != null && listA.size() != 0) {
                arrayList.addAll(listA);
                IAlog.a("found %d events for type: %s", Integer.valueOf(listA.size()), strA);
                for (String str : listA) {
                    IAlog.a("   event url: %s", str);
                    if (!TextUtils.isEmpty(str)) {
                        IAlog.d("%s %s %s", "VAST_EVENT", xVar.a(), str);
                        IAlog.d("Tracking URLs array: %s", "VPAID", str);
                    }
                }
            } else {
                IAlog.a("IAVastMediaPlayerFlowManager: no events for type: %s", strA);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2)) {
                z0.b(str2);
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.a aVar) {
        if (this.f26223q == aVar) {
            return;
        }
        if (aVar == com.fyber.inneractive.sdk.player.enums.a.Started) {
            this.f26224r = false;
            if (this.f26229w.compareAndSet(false, true)) {
                a(this.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_IMPRESSION, com.fyber.inneractive.sdk.model.vast.x.EVENT_START);
            } else {
                IAlog.a("%sreportPlayStartEvents called, but start events was already reported", IAlog.a(this));
            }
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.FirstQuarter) {
            a(this.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_FIRSTQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.MidPoint) {
            a(this.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_MID);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.ThirdPQuarter) {
            a(this.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_THIRDQ);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Completed && !this.f26224r) {
            this.f26224r = true;
            a(this.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_COMPLETE);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Restarted) {
            a(this.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_REWIND);
        } else if (aVar == com.fyber.inneractive.sdk.player.enums.a.Progress) {
            a(this.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_PROGRESS);
        }
        this.f26223q = aVar;
    }
}
