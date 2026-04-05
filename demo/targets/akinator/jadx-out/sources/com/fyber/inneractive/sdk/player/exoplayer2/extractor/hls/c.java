package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a {

    /* renamed from: i, reason: collision with root package name */
    public byte[] f24720i;

    /* renamed from: j, reason: collision with root package name */
    public int f24721j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f24722k;

    /* renamed from: l, reason: collision with root package name */
    public final String f24723l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f24724m;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i10, Object obj, byte[] bArr, String str) {
        super(3, i10, C.TIME_UNSET, C.TIME_UNSET, oVar, hVar, kVar, obj);
        this.f24720i = bArr;
        this.f24723l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f24722k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f24722k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.f24721j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        try {
            this.f25746h.a(this.f25739a);
            int i10 = 0;
            this.f24721j = 0;
            while (i10 != -1 && !this.f24722k) {
                byte[] bArr = this.f24720i;
                if (bArr == null) {
                    this.f24720i = new byte[16384];
                } else if (bArr.length < this.f24721j + 16384) {
                    this.f24720i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f25746h.read(this.f24720i, this.f24721j, 16384);
                if (i10 != -1) {
                    this.f24721j += i10;
                }
            }
            if (!this.f24722k) {
                this.f24724m = Arrays.copyOf(this.f24720i, this.f24721j);
            }
            z.a(this.f25746h);
        } catch (Throwable th2) {
            z.a(this.f25746h);
            throw th2;
        }
    }
}
