package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f25961a;

    /* renamed from: b, reason: collision with root package name */
    public final s f25962b;

    /* renamed from: c, reason: collision with root package name */
    public final d f25963c;

    /* renamed from: d, reason: collision with root package name */
    public final f f25964d;

    /* renamed from: e, reason: collision with root package name */
    public h f25965e;

    public n(Context context, m mVar, h hVar) {
        hVar.getClass();
        this.f25961a = hVar;
        this.f25962b = new s(mVar);
        this.f25963c = new d(context, mVar);
        this.f25964d = new f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        if (this.f25965e != null) {
            throw new IllegalStateException();
        }
        String scheme = kVar.f25944a.getScheme();
        Uri uri = kVar.f25944a;
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || scheme2.equals(C3191e4.h.f36473b)) {
            if (kVar.f25944a.getPath().startsWith("/android_asset/")) {
                this.f25965e = this.f25963c;
            } else {
                this.f25965e = this.f25962b;
            }
        } else if ("asset".equals(scheme)) {
            this.f25965e = this.f25963c;
        } else if ("content".equals(scheme)) {
            this.f25965e = this.f25964d;
        } else {
            this.f25965e = this.f25961a;
        }
        return this.f25965e.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        h hVar = this.f25965e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f25965e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f25965e.read(bArr, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        h hVar = this.f25965e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
