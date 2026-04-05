package com.fyber.inneractive.sdk.player;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.model.vast.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3434s;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f implements com.fyber.inneractive.sdk.player.controller.p, com.fyber.inneractive.sdk.player.controller.o {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.q f26160a;

    /* renamed from: b, reason: collision with root package name */
    public t0 f26161b;

    /* renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f26162c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.e f26163d;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.f f26164e;

    /* renamed from: l, reason: collision with root package name */
    public q f26171l;

    /* renamed from: m, reason: collision with root package name */
    public int f26172m;

    /* renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.r f26173n;

    /* renamed from: f, reason: collision with root package name */
    public p f26165f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26166g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26167h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f26168i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26169j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f26170k = 0;

    /* renamed from: o, reason: collision with root package name */
    public final c f26174o = new c(this);

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r5, com.fyber.inneractive.sdk.config.global.r r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f26165f = r0
            r1 = 1
            r4.f26166g = r1
            r1 = 0
            r4.f26167h = r1
            r4.f26168i = r1
            r4.f26169j = r1
            r4.f26170k = r1
            com.fyber.inneractive.sdk.player.c r2 = new com.fyber.inneractive.sdk.player.c
            r2.<init>(r4)
            r4.f26174o = r2
            if (r6 == 0) goto L32
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.u> r2 = com.fyber.inneractive.sdk.config.global.features.u.class
            com.fyber.inneractive.sdk.config.global.features.h r2 = r6.a(r2)     // Catch: java.lang.Throwable -> L30
            com.fyber.inneractive.sdk.config.global.features.u r2 = (com.fyber.inneractive.sdk.config.global.features.u) r2     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "use_fmp_cache_mechanism"
            java.lang.Boolean r2 = r2.c(r3)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r6 = move-exception
            goto L3a
        L32:
            r2 = r1
        L33:
            com.fyber.inneractive.sdk.player.controller.f r3 = new com.fyber.inneractive.sdk.player.controller.f     // Catch: java.lang.Throwable -> L30
            r3.<init>(r5, r2, r6)     // Catch: java.lang.Throwable -> L30
            r0 = r3
            goto L49
        L3a:
            int r2 = com.fyber.inneractive.sdk.util.IAlog.f26748a
            r3 = 3
            if (r2 > r3) goto L49
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed creating exo player"
            com.fyber.inneractive.sdk.util.IAlog.a(r2, r1)
            r6.printStackTrace()
        L49:
            if (r0 != 0) goto L50
            com.fyber.inneractive.sdk.player.controller.a r0 = new com.fyber.inneractive.sdk.player.controller.a
            r0.<init>(r5)
        L50:
            r4.f26160a = r0
            java.util.concurrent.CopyOnWriteArrayList r5 = r0.f24431b
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L5f
            java.util.concurrent.CopyOnWriteArrayList r5 = r0.f24431b
            r5.add(r4)
        L5f:
            com.fyber.inneractive.sdk.player.controller.q r5 = r4.f26160a
            java.util.concurrent.CopyOnWriteArrayList r6 = r5.f24432c
            boolean r6 = r6.contains(r4)
            if (r6 != 0) goto L6e
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f24432c
            r5.add(r4)
        L6e:
            com.fyber.inneractive.sdk.player.controller.q r5 = r4.f26160a
            com.fyber.inneractive.sdk.player.c r6 = r4.f26174o
            r5.f24435f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.f.<init>(android.content.Context, com.fyber.inneractive.sdk.config.global.r):void");
    }

    public abstract void a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
        IAlog.a("IMediaPlayerFlowManager: onPlayerError called with: %s", oVar.getMessage());
        a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, oVar), new JSONObject());
        if (this.f26167h) {
            IAlog.a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, oVar), new JSONObject());
        }
    }

    public abstract void a(com.fyber.inneractive.sdk.response.i iVar, VideoClickOrigin videoClickOrigin, x... xVarArr);

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
        try {
            t0 t0Var = this.f26161b;
            com.fyber.inneractive.sdk.response.g gVar = t0Var != null ? (com.fyber.inneractive.sdk.response.g) t0Var.f23945b : null;
            u uVar = u.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f26162c;
            t0 t0Var2 = this.f26161b;
            JSONArray jSONArrayB = t0Var2 == null ? null : t0Var2.f23946c.b();
            w wVar = new w(gVar);
            wVar.f24326c = uVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArrayB;
            if (this.f26173n != null && gVar != null) {
                wVar.f24329f.put(new com.fyber.inneractive.sdk.network.x().a(String.valueOf(z10), "waudio").a(this.f26173n.f24141g, "url").a(this.f26173n.f24139e, "bitrate").a(TextUtils.isEmpty(this.f26173n.f24138d) ? "na" : this.f26173n.f24138d, "mime").a(this.f26173n.f24135a, C3434s.f38306g).a(Integer.valueOf(this.f26170k), "media_file_index").a(this.f26160a.d(), "player").f24331a);
            }
            wVar.a((String) null);
        } catch (Exception unused) {
        }
    }

    public static boolean a(int i10, int i11, s0 s0Var) {
        if (i11 == 1 || InneractiveAdManager.isCurrentUserAChild()) {
            return true;
        }
        if (i10 <= 15999) {
            return false;
        }
        com.fyber.inneractive.sdk.config.t0 t0Var = s0Var != null ? ((r0) s0Var).f23348f : null;
        return (t0Var == null || t0Var.f23406h == Skip.DEFAULT || t0Var.f23408j == UnitDisplayType.REWARDED) ? false : true;
    }

    public static int a(f fVar) {
        com.fyber.inneractive.sdk.response.e eVar;
        t0 t0Var = fVar.f26161b;
        if (t0Var == null || (eVar = t0Var.f23945b) == null) {
            return -1;
        }
        return ((com.fyber.inneractive.sdk.response.g) eVar).f26653y;
    }

    public final void a() {
        com.fyber.inneractive.sdk.measurement.f fVar = this.f26164e;
        if (fVar != null) {
            if (fVar.f24013a != null) {
                IAlog.a("%s destroy", "OMVideo");
                try {
                    fVar.f24013a.finish();
                } catch (Throwable th2) {
                    fVar.a(th2);
                }
            }
            fVar.f24014b = null;
            fVar.f24013a = null;
            fVar.f24015c = null;
        }
    }

    public static boolean a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        mVar.getClass();
        if (mVar != com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP || !IAConfigManager.O.E.n() || rVar == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class) == null) {
            return false;
        }
        Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.n) rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class)).c("enable_app_info_button");
        return boolC != null ? boolC.booleanValue() : true;
    }
}
