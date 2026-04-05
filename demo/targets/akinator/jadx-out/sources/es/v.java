package es;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f55106a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.m f55107b;

    public v(b0 b0Var, wr.m mVar) {
        this.f55106a = b0Var;
        this.f55107b = mVar;
    }

    @Override // es.i0
    public void ejectOutliers(s sVar, long j10) {
        y yVar = this.f55106a.f55022f;
        ArrayList arrayListB = k0.b(sVar, yVar.f55122d.intValue());
        if (arrayListB.size() < yVar.f55121c.intValue() || arrayListB.size() == 0) {
            return;
        }
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (sVar.d() >= r0.f55020d.intValue()) {
                return;
            }
            if (rVar.c() >= yVar.f55122d.intValue()) {
                if (((AtomicLong) rVar.f55096c.f6757b).get() / rVar.c() > yVar.f55119a.intValue() / 100.0d) {
                    this.f55107b.log(wr.l.f91017b, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", rVar, Double.valueOf(((AtomicLong) rVar.f55096c.f6757b).get() / rVar.c()));
                    if (new Random().nextInt(100) < yVar.f55120b.intValue()) {
                        rVar.b(j10);
                    }
                }
            }
        }
    }
}
