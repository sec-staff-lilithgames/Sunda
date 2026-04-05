package io.bidmachine;

import io.bidmachine.protobuf.InitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q2 implements nm.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r2 f61989a;

    public q2(r2 r2Var) {
        this.f61989a = r2Var;
    }

    @Override // nm.b
    public void onFail(pr.a aVar) {
        s2 s2Var = this.f61989a.f61994b;
        int i10 = s2.f62005k;
        final long j10 = 0;
        if (s2Var.f62011f.isEmpty()) {
            long j11 = s2Var.f62013h;
            if (j11 <= 0) {
                s2Var.f62013h = s2.f62003i;
            } else {
                long j12 = j11 * 2;
                s2Var.f62013h = j12;
                long j13 = s2.f62004j;
                if (j12 >= j13) {
                    s2Var.f62013h = j13;
                }
            }
            j10 = s2Var.f62013h;
            nm.a.d(new rr.b() { // from class: io.bidmachine.p2
                @Override // rr.b
                public final Object get() {
                    return p0.o2.n(j10, "reschedule init request (", ")");
                }
            });
            v2 v2Var = s2Var.f62012g;
            if (v2Var != null) {
                v2Var.onFail((Object) aVar);
            }
        }
        nm.j.onBackgroundThread(s2Var.f62009d, j10);
        s2Var.f62008c.eventFinish(TrackEventType.InitLoading, (AdsType) null, (gr.a) null, aVar);
    }

    @Override // nm.b
    public void onSuccess(InitResponse initResponse) {
        s2 s2Var = this.f61989a.f61994b;
        int i10 = s2.f62005k;
        s2Var.f62013h = 0L;
        nm.j.cancelBackgroundThreadTask(s2Var.f62009d);
        v2 v2Var = s2Var.f62012g;
        if (v2Var != null) {
            v2Var.onSuccess((Object) initResponse);
        }
        s2Var.f62008c.eventFinish(TrackEventType.InitLoading, (AdsType) null, (gr.a) null, (pr.a) null);
    }
}
