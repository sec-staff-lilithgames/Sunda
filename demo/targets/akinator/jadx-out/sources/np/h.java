package np;

import hp.i;
import io.bidmachine.media3.common.util.a1;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements i {

    /* renamed from: b, reason: collision with root package name */
    public final c f77173b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f77174c;

    /* renamed from: e, reason: collision with root package name */
    public final Map f77175e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f77176f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f77177g;

    public h(c cVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f77173b = cVar;
        this.f77176f = map2;
        this.f77177g = map3;
        this.f77175e = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f77174c = cVar.getEventTimesUs();
    }

    @Override // hp.i
    public List<in.b> getCues(long j10) {
        return this.f77173b.getCues(j10, this.f77175e, this.f77176f, this.f77177g);
    }

    @Override // hp.i
    public long getEventTime(int i10) {
        return this.f77174c[i10];
    }

    @Override // hp.i
    public int getEventTimeCount() {
        return this.f77174c.length;
    }

    @Override // hp.i
    public int getNextEventTimeIndex(long j10) {
        long[] jArr = this.f77174c;
        int iBinarySearchCeil = a1.binarySearchCeil(jArr, j10, false, false);
        if (iBinarySearchCeil < jArr.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
