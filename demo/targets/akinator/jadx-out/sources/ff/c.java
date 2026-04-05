package ff;

import ef.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends p implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public long f55697l;

    @Override // java.lang.Comparable
    public int compareTo(c cVar) {
        if (isEndOfStream() != cVar.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j10 = this.f12239g - cVar.f12239g;
        if (j10 == 0) {
            j10 = this.f55697l - cVar.f55697l;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
