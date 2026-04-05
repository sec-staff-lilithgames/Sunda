package vn;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import nh.b5;
import nh.i7;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends i {

    /* renamed from: d, reason: collision with root package name */
    public final int f89367d;

    /* renamed from: e, reason: collision with root package name */
    public final long f89368e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f89369f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f89370g;

    /* renamed from: h, reason: collision with root package name */
    public final long f89371h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f89372i;

    /* renamed from: j, reason: collision with root package name */
    public final int f89373j;

    /* renamed from: k, reason: collision with root package name */
    public final long f89374k;

    /* renamed from: l, reason: collision with root package name */
    public final int f89375l;

    /* renamed from: m, reason: collision with root package name */
    public final long f89376m;

    /* renamed from: n, reason: collision with root package name */
    public final long f89377n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f89378o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f89379p;

    /* renamed from: q, reason: collision with root package name */
    public final DrmInitData f89380q;

    /* renamed from: r, reason: collision with root package name */
    public final b5 f89381r;

    /* renamed from: s, reason: collision with root package name */
    public final b5 f89382s;

    /* renamed from: t, reason: collision with root package name */
    public final m5 f89383t;

    /* renamed from: u, reason: collision with root package name */
    public final long f89384u;

    /* renamed from: v, reason: collision with root package name */
    public final C0801f f89385v;

    /* renamed from: w, reason: collision with root package name */
    public final b5 f89386w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f89391a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f89392b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f89393c;

        /* renamed from: d, reason: collision with root package name */
        public final long f89394d;

        /* renamed from: e, reason: collision with root package name */
        public final long f89395e;

        /* renamed from: f, reason: collision with root package name */
        public final long f89396f;

        /* renamed from: g, reason: collision with root package name */
        public final long f89397g;

        /* renamed from: h, reason: collision with root package name */
        public final List f89398h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f89399i;

        /* renamed from: j, reason: collision with root package name */
        public final long f89400j;

        /* renamed from: k, reason: collision with root package name */
        public final long f89401k;

        /* renamed from: l, reason: collision with root package name */
        public final b5 f89402l;

        /* renamed from: m, reason: collision with root package name */
        public final b5 f89403m;

        /* renamed from: n, reason: collision with root package name */
        public final b5 f89404n;

        public b(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, List<String> list, boolean z10, long j14, long j15, List<String> list2, List<String> list3, List<a> list4) {
            io.bidmachine.media3.common.util.a.checkArgument((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.f89391a = str;
            this.f89392b = uri;
            this.f89393c = uri2;
            this.f89394d = j10;
            this.f89395e = j11;
            this.f89396f = j12;
            this.f89397g = j13;
            this.f89398h = list;
            this.f89399i = z10;
            this.f89400j = j14;
            this.f89401k = j15;
            this.f89402l = b5.copyOf((Collection) list2);
            this.f89403m = b5.copyOf((Collection) list3);
            this.f89404n = b5.copyOf((Collection) list4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f89394d == bVar.f89394d && this.f89395e == bVar.f89395e && this.f89396f == bVar.f89396f && this.f89397g == bVar.f89397g && this.f89399i == bVar.f89399i && this.f89400j == bVar.f89400j && this.f89401k == bVar.f89401k && Objects.equals(this.f89391a, bVar.f89391a) && Objects.equals(this.f89392b, bVar.f89392b) && Objects.equals(this.f89393c, bVar.f89393c) && Objects.equals(this.f89398h, bVar.f89398h) && Objects.equals(this.f89402l, bVar.f89402l) && Objects.equals(this.f89403m, bVar.f89403m) && Objects.equals(this.f89404n, bVar.f89404n);
        }

        public int hashCode() {
            return Objects.hash(this.f89391a, this.f89392b, this.f89393c, Long.valueOf(this.f89394d), Long.valueOf(this.f89395e), Long.valueOf(this.f89396f), Long.valueOf(this.f89397g), this.f89398h, Boolean.valueOf(this.f89399i), Long.valueOf(this.f89400j), Long.valueOf(this.f89401k), this.f89402l, this.f89403m, this.f89404n);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends g {

        /* renamed from: n, reason: collision with root package name */
        public final boolean f89405n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f89406o;

        public c(String str, e eVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, eVar, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f89405n = z11;
            this.f89406o = z12;
        }

        public c copyWith(long j10, int i10) {
            return new c(this.f89417b, this.f89418c, this.f89419e, i10, j10, this.f89422h, this.f89423i, this.f89424j, this.f89425k, this.f89426l, this.f89427m, this.f89405n, this.f89406o);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f89407a;

        /* renamed from: b, reason: collision with root package name */
        public final long f89408b;

        /* renamed from: c, reason: collision with root package name */
        public final int f89409c;

        public d(Uri uri, long j10, int i10) {
            this.f89407a = uri;
            this.f89408b = j10;
            this.f89409c = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: vn.f$f, reason: collision with other inner class name */
    public static final class C0801f {

        /* renamed from: a, reason: collision with root package name */
        public final long f89412a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f89413b;

        /* renamed from: c, reason: collision with root package name */
        public final long f89414c;

        /* renamed from: d, reason: collision with root package name */
        public final long f89415d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f89416e;

        public C0801f(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f89412a = j10;
            this.f89413b = z10;
            this.f89414c = j11;
            this.f89415d = j12;
            this.f89416e = z11;
        }
    }

    public f(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List<e> list2, List<c> list3, C0801f c0801f, Map<Uri, d> map, List<b> list4) {
        super(str, list, z12);
        this.f89367d = i10;
        this.f89371h = j11;
        this.f89370g = z10;
        this.f89372i = z11;
        this.f89373j = i11;
        this.f89374k = j12;
        this.f89375l = i12;
        this.f89376m = j13;
        this.f89377n = j14;
        this.f89378o = z13;
        this.f89379p = z14;
        this.f89380q = drmInitData;
        this.f89381r = b5.copyOf((Collection) list2);
        this.f89382s = b5.copyOf((Collection) list3);
        this.f89383t = m5.copyOf((Map) map);
        this.f89386w = b5.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            c cVar = (c) i7.getLast(list3);
            this.f89384u = cVar.f89421g + cVar.f89419e;
        } else if (list2.isEmpty()) {
            this.f89384u = 0L;
        } else {
            e eVar = (e) i7.getLast(list2);
            this.f89384u = eVar.f89421g + eVar.f89419e;
        }
        this.f89368e = j10 != C.TIME_UNSET ? j10 >= 0 ? Math.min(this.f89384u, j10) : Math.max(0L, this.f89384u + j10) : C.TIME_UNSET;
        this.f89369f = j10 >= 0;
        this.f89385v = c0801f;
    }

    @Override // vn.i, zn.p
    public /* bridge */ /* synthetic */ Object copy(List list) {
        return copy((List<StreamKey>) list);
    }

    public f copyWith(long j10, int i10) {
        return new f(this.f89367d, this.f89448a, this.f89449b, this.f89368e, this.f89370g, j10, true, i10, this.f89374k, this.f89375l, this.f89376m, this.f89377n, this.f89450c, this.f89378o, this.f89379p, this.f89380q, this.f89381r, this.f89382s, this.f89385v, this.f89383t, this.f89386w);
    }

    public f copyWithEndTag() {
        if (this.f89378o) {
            return this;
        }
        return new f(this.f89367d, this.f89448a, this.f89449b, this.f89368e, this.f89370g, this.f89371h, this.f89372i, this.f89373j, this.f89374k, this.f89375l, this.f89376m, this.f89377n, this.f89450c, true, this.f89379p, this.f89380q, this.f89381r, this.f89382s, this.f89385v, this.f89383t, this.f89386w);
    }

    public long getEndTimeUs() {
        return this.f89371h + this.f89384u;
    }

    public boolean isNewerThan(f fVar) {
        if (fVar == null) {
            return true;
        }
        long j10 = this.f89374k;
        long j11 = fVar.f89374k;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f89381r.size() - fVar.f89381r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f89382s.size();
        int size3 = fVar.f89382s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f89378o && !fVar.f89378o;
        }
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends g {

        /* renamed from: n, reason: collision with root package name */
        public final String f89410n;

        /* renamed from: o, reason: collision with root package name */
        public final b5 f89411o;

        public e(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j10, j11, false, b5.of());
        }

        public e copyWith(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            long j11 = j10;
            while (true) {
                b5 b5Var = this.f89411o;
                if (i11 >= b5Var.size()) {
                    return new e(this.f89417b, this.f89418c, this.f89410n, this.f89419e, i10, j10, this.f89422h, this.f89423i, this.f89424j, this.f89425k, this.f89426l, this.f89427m, arrayList);
                }
                c cVar = (c) b5Var.get(i11);
                arrayList.add(cVar.copyWith(j11, i10));
                j11 += cVar.f89419e;
                i11++;
            }
        }

        public e(String str, e eVar, String str2, long j10, int i10, long j11, DrmInitData drmInitData, String str3, String str4, long j12, long j13, boolean z10, List<c> list) {
            super(str, eVar, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f89410n = str2;
            this.f89411o = b5.copyOf((Collection) list);
        }
    }

    @Override // vn.i, zn.p
    public f copy(List<StreamKey> list) {
        return this;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f89387a;

        /* renamed from: b, reason: collision with root package name */
        public final int f89388b;

        /* renamed from: c, reason: collision with root package name */
        public final double f89389c;

        /* renamed from: d, reason: collision with root package name */
        public final String f89390d;

        public a(String str, double d10) {
            this.f89387a = str;
            this.f89388b = 2;
            this.f89389c = d10;
            this.f89390d = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f89388b == aVar.f89388b && Double.compare(this.f89389c, aVar.f89389c) == 0 && Objects.equals(this.f89387a, aVar.f89387a) && Objects.equals(this.f89390d, aVar.f89390d);
        }

        public double getDoubleValue() {
            io.bidmachine.media3.common.util.a.checkState(this.f89388b == 2);
            return this.f89389c;
        }

        public String getTextValue() {
            io.bidmachine.media3.common.util.a.checkState(this.f89388b != 2);
            return (String) io.bidmachine.media3.common.util.a.checkNotNull(this.f89390d);
        }

        public int hashCode() {
            return Objects.hash(this.f89387a, Integer.valueOf(this.f89388b), Double.valueOf(this.f89389c), this.f89390d);
        }

        public a(String str, String str2, int i10) {
            boolean z10 = true;
            if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z10 = false;
            }
            io.bidmachine.media3.common.util.a.checkState(z10);
            this.f89387a = str;
            this.f89388b = i10;
            this.f89390d = str2;
            this.f89389c = 0.0d;
        }
    }
}
