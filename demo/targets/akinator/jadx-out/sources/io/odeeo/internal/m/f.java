package io.odeeo.internal.m;

import b0.e2;
import io.odeeo.internal.d.r;
import io.odeeo.internal.g.v;
import io.odeeo.internal.g.w;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f64623a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f64624b;

    /* renamed from: c, reason: collision with root package name */
    public final long f64625c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64626d;

    public f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f64623a = jArr;
        this.f64624b = jArr2;
        this.f64625c = j10;
        this.f64626d = j11;
    }

    public static f create(long j10, long j11, r.a aVar, x xVar) {
        int unsignedByte;
        xVar.skipBytes(10);
        int i10 = xVar.readInt();
        f fVar = null;
        if (i10 <= 0) {
            return null;
        }
        int i11 = aVar.f63484d;
        long jScaleLargeTimestamp = g0.scaleLargeTimestamp(i10, (i11 >= 32000 ? 1152 : 576) * 1000000, i11);
        int unsignedShort = xVar.readUnsignedShort();
        int unsignedShort2 = xVar.readUnsignedShort();
        int unsignedShort3 = xVar.readUnsignedShort();
        xVar.skipBytes(2);
        long j12 = j11 + aVar.f63483c;
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i12 = 0;
        long j13 = j11;
        while (i12 < unsignedShort) {
            f fVar2 = fVar;
            int i13 = unsignedShort2;
            long[] jArr3 = jArr;
            jArr3[i12] = (i12 * jScaleLargeTimestamp) / unsignedShort;
            jArr2[i12] = Math.max(j13, j12);
            if (unsignedShort3 == 1) {
                unsignedByte = xVar.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = xVar.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = xVar.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return fVar2;
                }
                unsignedByte = xVar.readUnsignedIntToInt();
            }
            j13 += unsignedByte * i13;
            i12++;
            fVar = fVar2;
            unsignedShort2 = i13;
            jArr = jArr3;
        }
        long[] jArr4 = jArr;
        if (j10 != -1 && j10 != j13) {
            StringBuilder sbR = e2.r(j10, "VBRI data size mismatch: ", ", ");
            sbR.append(j13);
            p.w("VbriSeeker", sbR.toString());
        }
        return new f(jArr4, jArr2, jScaleLargeTimestamp, j13);
    }

    @Override // io.odeeo.internal.m.e
    public long getDataEndPosition() {
        return this.f64626d;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64625c;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        int iBinarySearchFloor = g0.binarySearchFloor(this.f64623a, j10, true, true);
        w wVar = new w(this.f64623a[iBinarySearchFloor], this.f64624b[iBinarySearchFloor]);
        if (wVar.f64177a >= j10 || iBinarySearchFloor == this.f64623a.length - 1) {
            return new v.a(wVar);
        }
        int i10 = iBinarySearchFloor + 1;
        return new v.a(wVar, new w(this.f64623a[i10], this.f64624b[i10]));
    }

    @Override // io.odeeo.internal.m.e
    public long getTimeUs(long j10) {
        return this.f64623a[g0.binarySearchFloor(this.f64624b, j10, true, true)];
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public boolean isSeekable() {
        return true;
    }
}
