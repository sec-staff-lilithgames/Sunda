package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e implements x {

    /* renamed from: a, reason: collision with root package name */
    private int f43952a;

    /* renamed from: b, reason: collision with root package name */
    private long f43953b;

    /* renamed from: c, reason: collision with root package name */
    private int f43954c;

    /* renamed from: d, reason: collision with root package name */
    private final int f43955d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f43953b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f43952a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f43954c;
    }

    public e(int i10, int i11) {
        this(i10, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f43954c + 1;
        this.f43954c = i10;
        return i10 <= this.f43955d;
    }

    public e(int i10, long j10, int i11) {
        this.f43953b = j10;
        this.f43952a = i10;
        this.f43955d = i11;
    }
}
