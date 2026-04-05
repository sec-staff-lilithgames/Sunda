package qn;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.StreamKey;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c implements zn.p {

    /* renamed from: a, reason: collision with root package name */
    public final long f83305a;

    /* renamed from: b, reason: collision with root package name */
    public final long f83306b;

    /* renamed from: c, reason: collision with root package name */
    public final long f83307c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f83308d;

    /* renamed from: e, reason: collision with root package name */
    public final long f83309e;

    /* renamed from: f, reason: collision with root package name */
    public final long f83310f;

    /* renamed from: g, reason: collision with root package name */
    public final long f83311g;

    /* renamed from: h, reason: collision with root package name */
    public final long f83312h;

    /* renamed from: i, reason: collision with root package name */
    public final q f83313i;

    /* renamed from: j, reason: collision with root package name */
    public final n f83314j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f83315k;

    /* renamed from: l, reason: collision with root package name */
    public final h f83316l;

    /* renamed from: m, reason: collision with root package name */
    public final List f83317m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, q qVar, n nVar, Uri uri, List<g> list) {
        this.f83305a = j10;
        this.f83306b = j11;
        this.f83307c = j12;
        this.f83308d = z10;
        this.f83309e = j13;
        this.f83310f = j14;
        this.f83311g = j15;
        this.f83312h = j16;
        this.f83316l = hVar;
        this.f83313i = qVar;
        this.f83315k = uri;
        this.f83314j = nVar;
        this.f83317m = list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // zn.p
    public /* bridge */ /* synthetic */ Object copy(List list) {
        return copy((List<StreamKey>) list);
    }

    public final g getPeriod(int i10) {
        return (g) this.f83317m.get(i10);
    }

    public final int getPeriodCount() {
        return this.f83317m.size();
    }

    public final long getPeriodDurationMs(int i10) {
        long j10;
        long j11;
        List list = this.f83317m;
        if (i10 == list.size() - 1) {
            j10 = this.f83306b;
            if (j10 == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j11 = ((g) list.get(i10)).f83341b;
        } else {
            j10 = ((g) list.get(i10 + 1)).f83341b;
            j11 = ((g) list.get(i10)).f83341b;
        }
        return j10 - j11;
    }

    public final long getPeriodDurationUs(int i10) {
        return a1.msToUs(getPeriodDurationMs(i10));
    }

    @Override // zn.p
    public final c copy(List<StreamKey> list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i10 = 0;
        while (true) {
            int periodCount = getPeriodCount();
            j10 = C.TIME_UNSET;
            if (i10 >= periodCount) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f60624b != i10) {
                long periodDurationMs = getPeriodDurationMs(i10);
                if (periodDurationMs != C.TIME_UNSET) {
                    j12 += periodDurationMs;
                }
            } else {
                g period = getPeriod(i10);
                List list2 = period.f83342c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i11 = streamKey.f60624b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = streamKey.f60625c;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f83297c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((l) list3.get(streamKey.f60626e));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f60624b != i11) {
                            break;
                        }
                    } while (streamKey.f60625c == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f83295a, aVar.f83296b, arrayList3, aVar.f83298d, aVar.f83299e, aVar.f83300f));
                    if (streamKey.f60624b != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new g(period.f83340a, period.f83341b - j11, arrayList2, period.f83343d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f83306b;
        if (j14 != C.TIME_UNSET) {
            j10 = j14 - j13;
        }
        return new c(this.f83305a, j10, this.f83307c, this.f83308d, this.f83309e, this.f83310f, this.f83311g, this.f83312h, this.f83316l, this.f83313i, this.f83314j, this.f83315k, arrayList);
    }
}
