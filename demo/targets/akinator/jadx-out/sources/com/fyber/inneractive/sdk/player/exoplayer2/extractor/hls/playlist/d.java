package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final int f24836b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24837c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24838d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24839e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24840f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24841g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24842h;

    /* renamed from: i, reason: collision with root package name */
    public final long f24843i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f24844j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f24845k;

    /* renamed from: l, reason: collision with root package name */
    public final c f24846l;

    /* renamed from: m, reason: collision with root package name */
    public final List f24847m;

    /* renamed from: n, reason: collision with root package name */
    public final List f24848n;

    /* renamed from: o, reason: collision with root package name */
    public final long f24849o;

    public d(int i10, String str, long j10, long j11, boolean z10, int i11, int i12, int i13, long j12, boolean z11, boolean z12, c cVar, List list, List list2) {
        super(str);
        this.f24836b = i10;
        this.f24838d = j11;
        this.f24839e = z10;
        this.f24840f = i11;
        this.f24841g = i12;
        this.f24842h = i13;
        this.f24843i = j12;
        this.f24844j = z11;
        this.f24845k = z12;
        this.f24846l = cVar;
        this.f24847m = Collections.unmodifiableList(list);
        if (list.isEmpty()) {
            this.f24849o = 0L;
        } else {
            c cVar2 = (c) o2.g(1, list);
            this.f24849o = cVar2.f24830d + cVar2.f24828b;
        }
        if (j10 == C.TIME_UNSET) {
            j10 = -9223372036854775807L;
        } else if (j10 < 0) {
            j10 += this.f24849o;
        }
        this.f24837c = j10;
        this.f24848n = Collections.unmodifiableList(list2);
    }
}
