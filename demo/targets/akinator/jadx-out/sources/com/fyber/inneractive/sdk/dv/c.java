package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.k;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends k {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23437m;

    public c() throws ClassNotFoundException {
        boolean z10;
        try {
            Class.forName("com.google.android.gms.ads.InterstitialAd");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        this.f23437m = !z10;
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        x xVar = this.f23663c;
        if (xVar != null) {
            a aVar = (a) xVar;
            aVar.f23428g = null;
            aVar.f23430i = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f23663c;
        if (xVar != null) {
            a aVar = (a) xVar;
            aVar.f23428g = null;
            aVar.f23430i = null;
        }
        this.f23671k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        r.f26804b.removeCallbacks(this.f23672l);
        this.f23661a = null;
        this.f23662b = null;
        this.f23663c = null;
        this.f23664d = null;
        this.f23665e = null;
        this.f23666f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.response.e eVar = this.f23662b;
        if (eVar == null || ((i) eVar).f26649u == null) {
            j();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f23661a;
        if (inneractiveAdRequest != null) {
            boolean muteVideo = inneractiveAdRequest.getMuteVideo();
            try {
                MobileAds.setAppMuted(muteVideo);
                MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
            } catch (Throwable unused) {
            }
        }
        i iVar = (i) this.f23662b;
        UnitDisplayType unitDisplayType = iVar.f26644p;
        QueryInfo queryInfo = iVar.f26649u.f23457a;
        int i10 = b.f23431a[unitDisplayType.ordinal()];
        x bVar = i10 != 1 ? (i10 == 2 || i10 == 3) ? new com.fyber.inneractive.sdk.dv.banner.b(f(), this.f23667g, (i) this.f23662b) : i10 != 4 ? null : this.f23437m ? new com.fyber.inneractive.sdk.dv.rewarded.d(f(), this.f23667g, (i) this.f23662b) : new com.fyber.inneractive.sdk.dv.rewarded.g(f(), this.f23667g, (i) this.f23662b) : this.f23437m ? new com.fyber.inneractive.sdk.dv.interstitial.d(f(), this.f23667g, (i) this.f23662b) : new com.fyber.inneractive.sdk.dv.interstitial.g(f(), this.f23667g, (i) this.f23662b);
        this.f23663c = bVar;
        if (queryInfo == null || bVar == null || this.f23662b == null) {
            j();
            return;
        }
        try {
            AdRequest.Builder builder = new AdRequest.Builder();
            try {
                AdRequest.Builder.class.getMethod("setAdString", String.class).invoke(builder, ((i) this.f23662b).N);
            } catch (Exception unused2) {
                builder.setAdInfo(new AdInfo(queryInfo, ((i) this.f23662b).N));
            }
            ((a) this.f23663c).a(builder.build(), this);
        } catch (Throwable unused3) {
            j();
        }
    }

    public final void j() {
        b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.NETWORK_ERROR));
    }
}
