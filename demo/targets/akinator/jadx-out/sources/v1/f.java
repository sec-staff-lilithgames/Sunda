package v1;

import i1.h;
import s2.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f88855a;

    /* renamed from: b, reason: collision with root package name */
    public int f88856b;

    public f() {
        c[] cVarArr = new c[20];
        for (int i10 = 0; i10 < 20; i10++) {
            cVarArr[i10] = null;
        }
        this.f88855a = cVarArr;
    }

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m7424addPositionUv8p0NA(long j10, long j11) {
        int i10 = (this.f88856b + 1) % 20;
        this.f88856b = i10;
        this.f88855a[i10] = new c(j11, j10, null);
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m7425calculateVelocity9UxMQ8M() {
        int i10 = this.f88856b;
        c[] cVarArr = this.f88855a;
        c cVar = cVarArr[i10];
        if (cVar == null) {
            return f0.Velocity(0.0f, 0.0f);
        }
        a aVar = new a();
        a aVar2 = new a();
        int i11 = this.f88856b;
        int i12 = 0;
        do {
            i11 = (i11 + 1) % 20;
            c cVar2 = cVarArr[i11];
            if (cVar2 != null) {
                long time = cVar.getTime() - cVar2.getTime();
                long jAbs = Math.abs(cVar2.getTime() - cVar.getTime());
                if (time <= 100) {
                    if (jAbs > 40) {
                        aVar.reset();
                        aVar2.reset();
                    }
                    long j10 = -time;
                    aVar.addPosition(j10, h.m4185getXimpl(cVar2.m7423getPointF1C5BW0()));
                    aVar2.addPosition(j10, h.m4186getYimpl(cVar2.m7423getPointF1C5BW0()));
                    i12++;
                }
            }
            if (i11 == this.f88856b) {
                break;
            }
        } while (i12 < 20);
        return i12 < 3 ? f0.Velocity(0.0f, 0.0f) : f0.Velocity(aVar.getVelocity(), aVar2.getVelocity());
    }

    public final void resetTracking() {
        uu.f0.fill$default(this.f88855a, (Object) null, 0, 0, 6, (Object) null);
    }
}
