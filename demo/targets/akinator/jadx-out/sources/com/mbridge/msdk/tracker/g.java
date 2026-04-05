package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f43898a;

    /* renamed from: b, reason: collision with root package name */
    private final s f43899b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f43900c = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private final long[] f43901d = new long[2];

    public g(c cVar, s sVar) {
        this.f43898a = cVar;
        this.f43899b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.f43900c.incrementAndGet();
            this.f43901d[0] = System.currentTimeMillis();
            this.f43901d[1] = jIncrementAndGet;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("TrackManager", "notice error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.f());
            this.f43898a.a(iVar);
            this.f43899b.k();
            this.f43899b.e();
            this.f43899b.a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("TrackManager", "process error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.f43901d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
