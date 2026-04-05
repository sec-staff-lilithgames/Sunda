package ip;

import hp.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends n implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    public long f68342m;

    @Override // java.lang.Comparable
    public int compareTo(c cVar) {
        if (isEndOfStream() != cVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j10 = this.f77082h - cVar.f77082h;
        if (j10 == 0) {
            j10 = this.f68342m - cVar.f68342m;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
