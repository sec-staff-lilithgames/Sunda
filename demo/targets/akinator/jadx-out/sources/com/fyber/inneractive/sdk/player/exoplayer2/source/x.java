package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends com.fyber.inneractive.sdk.player.exoplayer2.x {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f25815g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f25816b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25817c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25818d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25819e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25820f;

    public x(long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f25816b = j10;
        this.f25817c = j11;
        this.f25818d = j12;
        this.f25819e = j13;
        this.f25820f = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int b() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.w a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.w wVar, long j10) {
        if (i10 < 0 || i10 >= 1) {
            throw new IndexOutOfBoundsException();
        }
        long j11 = this.f25819e;
        boolean z10 = this.f25820f;
        if (z10) {
            j11 += j10;
            if (j11 > this.f25817c) {
                j11 = C.TIME_UNSET;
            }
        }
        long j12 = this.f25817c;
        long j13 = this.f25818d;
        wVar.f26152a = null;
        wVar.f26153b = z10;
        wVar.f26156e = j11;
        wVar.f26157f = j12;
        wVar.f26154c = 0;
        wVar.f26155d = 0;
        wVar.f26158g = j13;
        return wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final com.fyber.inneractive.sdk.player.exoplayer2.v a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.v vVar, boolean z10) {
        if (i10 >= 0 && i10 < 1) {
            Object obj = z10 ? f25815g : null;
            long j10 = this.f25816b;
            long j11 = -this.f25818d;
            vVar.f26078a = obj;
            vVar.f26079b = obj;
            vVar.f26080c = 0;
            vVar.f26081d = j10;
            vVar.f26082e = j11;
            return vVar;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.x
    public final int a(Object obj) {
        return f25815g.equals(obj) ? 0 : -1;
    }
}
