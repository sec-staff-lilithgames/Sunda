package com.mbridge.msdk.tracker;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class q implements l {

    /* renamed from: a, reason: collision with root package name */
    private final g f44096a;

    public q(g gVar) {
        this.f44096a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f44096a)) {
            return;
        }
        this.f44096a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f44096a)) {
            return;
        }
        try {
            h hVarE = eVar.e();
            if (y.a(hVarE)) {
                eVar.a(hVarE.a(eVar));
            }
            this.f44096a.b(eVar);
        } catch (Exception e10) {
            if (a.f43882a) {
                Log.e("TrackManager", "process event error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        if (y.b(this.f44096a)) {
            return new long[]{0, 0};
        }
        return this.f44096a.a();
    }
}
