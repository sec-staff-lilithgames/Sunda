package mf;

import com.google.android.exoplayer2.util.n1;
import ef.j;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements j {

    /* renamed from: b, reason: collision with root package name */
    public final e f74576b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f74577c;

    /* renamed from: e, reason: collision with root package name */
    public final Map f74578e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f74579f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f74580g;

    public i(e eVar, Map<String, h> map, Map<String, f> map2, Map<String, String> map3) {
        this.f74576b = eVar;
        this.f74579f = map2;
        this.f74580g = map3;
        this.f74578e = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f74577c = eVar.getEventTimesUs();
    }

    @Override // ef.j
    public List<ef.b> getCues(long j10) {
        return this.f74576b.getCues(j10, this.f74578e, this.f74579f, this.f74580g);
    }

    @Override // ef.j
    public long getEventTime(int i10) {
        return this.f74577c[i10];
    }

    @Override // ef.j
    public int getEventTimeCount() {
        return this.f74577c.length;
    }

    @Override // ef.j
    public int getNextEventTimeIndex(long j10) {
        long[] jArr = this.f74577c;
        int iBinarySearchCeil = n1.binarySearchCeil(jArr, j10, false, false);
        if (iBinarySearchCeil < jArr.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
