package cw;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f51106a;

    /* renamed from: b, reason: collision with root package name */
    public final long f51107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51108c;

    public a() {
        this(0, 0L, 0, 7, null);
    }

    public a(int i10, long j10, int i11) {
        this.f51106a = i10;
        this.f51107b = j10;
        this.f51108c = i11;
    }

    public /* synthetic */ a(int i10, long j10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS : j10, (i12 & 4) != 0 ? 100 : i11);
    }
}
