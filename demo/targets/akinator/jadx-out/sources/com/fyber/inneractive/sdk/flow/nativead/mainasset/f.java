package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.player.s;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements d, s {

    /* renamed from: a, reason: collision with root package name */
    public final r f23726a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.nativead.f f23727b;

    /* renamed from: c, reason: collision with root package name */
    public g f23728c;

    /* renamed from: d, reason: collision with root package name */
    public InneractiveAdRequest f23729d;

    /* renamed from: e, reason: collision with root package name */
    public c f23730e;

    /* renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.b f23732g = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    public u f23731f = new u();

    public f(com.fyber.inneractive.sdk.response.nativead.f fVar, r rVar, g gVar, InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.flow.nativead.f fVar2) {
        this.f23727b = fVar;
        this.f23726a = rVar;
        this.f23728c = gVar;
        this.f23729d = inneractiveAdRequest;
        this.f23730e = fVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(inneractiveInfrastructureError.getErrorCode(), i.NATIVE_AD_VIDEO_LOAD_FAILED);
        this.f23732g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        c cVar = this.f23730e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError2, "onAdFailedToLoad");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.f fVar;
        com.fyber.inneractive.sdk.response.nativead.e eVar;
        String str;
        g gVar;
        if (this.f23731f != null && (fVar = this.f23727b) != null && (eVar = fVar.f26665c) != null && (str = eVar.f26662a) != null && !str.trim().isEmpty() && (gVar = this.f23728c) != null) {
            this.f23732g = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            this.f23731f.a(this.f23726a, gVar, this.f23729d, this);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.VIDEO_ERROR_NULL);
        this.f23732g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        c cVar = this.f23730e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, "mVideoContentLoader is null, can't start loading");
        }
        IAlog.b("%smVideoContentLoader is null, can't start loading", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void c() throws Throwable {
        u uVar;
        this.f23732g = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        c cVar = this.f23730e;
        if (cVar == null || (uVar = this.f23731f) == null) {
            IAlog.b("%sCan't notify success, required member is null in onAdLoaded. Is null: mLoadListener: %s, mVideoContentLoader: %s", IAlog.a(this), Boolean.valueOf(this.f23730e == null), Boolean.valueOf(this.f23731f == null));
            return;
        }
        t0 t0Var = (t0) uVar.f23663c;
        com.fyber.inneractive.sdk.flow.nativead.f fVar = (com.fyber.inneractive.sdk.flow.nativead.f) cVar;
        if (t0Var == null) {
            fVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, i.NATIVE_AD_EMPTY_CONTENT), "Undetectable main media");
        } else {
            fVar.f23690e = t0Var;
            fVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        u uVar = this.f23731f;
        if (uVar != null) {
            x xVar = uVar.f23663c;
            if (xVar != null) {
                ((t0) xVar).destroy();
            }
            u uVar2 = this.f23731f;
            uVar2.getClass();
            IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(uVar2));
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(uVar2.f23672l);
            uVar2.f23671k.a();
            this.f23731f = null;
        }
        this.f23730e = null;
        this.f23729d = null;
        this.f23728c = null;
        this.f23732g = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.f23732g == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}
