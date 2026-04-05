package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24611a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f24612b;

    static {
        f24611a = z.f26070a < 23 ? 1020 : 6396;
        f24612b = new UUID(0L, 0L);
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j10) {
        return j10 == C.TIME_UNSET ? C.TIME_UNSET : j10 / 1000;
    }
}
