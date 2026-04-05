package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final k f25922a;

    /* renamed from: b, reason: collision with root package name */
    public final h f25923b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f25924c;

    /* renamed from: d, reason: collision with root package name */
    public volatile com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e f25925d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f25926e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f25927f;

    public d0(h hVar, Uri uri, c0 c0Var) {
        this.f25923b = hVar;
        this.f25922a = new k(uri, 0L, 0L, -1L, null, 1);
        this.f25924c = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f25926e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f25926e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() throws IOException {
        j jVar = new j(this.f25923b, this.f25922a);
        try {
            jVar.f25938a.a(jVar.f25939b);
            jVar.f25941d = true;
            this.f25925d = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g) this.f25924c).a(this.f25923b.a(), jVar);
        } finally {
            this.f25927f = jVar.f25943f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jVar);
        }
    }
}
