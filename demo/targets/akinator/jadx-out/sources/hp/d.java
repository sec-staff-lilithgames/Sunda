package hp;

import io.bidmachine.media3.common.util.a1;
import nh.b5;
import nh.we;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final we f59103e = we.natural().onResultOf(new ao.c(29));

    /* renamed from: b, reason: collision with root package name */
    public final b5 f59104b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f59105c;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.util.List<hp.c> r19) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hp.d.<init>(java.util.List):void");
    }

    @Override // hp.i
    public long getEventTime(int i10) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 < this.f59104b.size());
        return this.f59105c[i10];
    }

    @Override // hp.i
    public int getEventTimeCount() {
        return this.f59104b.size();
    }

    @Override // hp.i
    public int getNextEventTimeIndex(long j10) {
        int iBinarySearchCeil = a1.binarySearchCeil(this.f59105c, j10, false, false);
        if (iBinarySearchCeil < this.f59104b.size()) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @Override // hp.i
    public b5 getCues(long j10) {
        int iBinarySearchFloor = a1.binarySearchFloor(this.f59105c, j10, true, false);
        return iBinarySearchFloor == -1 ? b5.of() : (b5) this.f59104b.get(iBinarySearchFloor);
    }
}
