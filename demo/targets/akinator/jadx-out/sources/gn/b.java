package gn;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f57772g = new b(null, new a[0], 0, C.TIME_UNSET, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final a f57773h = new a(0).withAdCount(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f57774i = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f57775j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f57776k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: l, reason: collision with root package name */
    public static final String f57777l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f57778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57779b;

    /* renamed from: c, reason: collision with root package name */
    public final long f57780c;

    /* renamed from: d, reason: collision with root package name */
    public final long f57781d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57782e;

    /* renamed from: f, reason: collision with root package name */
    public final a[] f57783f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: l, reason: collision with root package name */
        public static final String f57784l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

        /* renamed from: m, reason: collision with root package name */
        public static final String f57785m = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

        /* renamed from: n, reason: collision with root package name */
        public static final String f57786n = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

        /* renamed from: o, reason: collision with root package name */
        public static final String f57787o = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

        /* renamed from: p, reason: collision with root package name */
        public static final String f57788p = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

        /* renamed from: q, reason: collision with root package name */
        public static final String f57789q = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

        /* renamed from: r, reason: collision with root package name */
        public static final String f57790r = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(6);

        /* renamed from: s, reason: collision with root package name */
        public static final String f57791s = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(7);

        /* renamed from: t, reason: collision with root package name */
        public static final String f57792t = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(8);

        /* renamed from: u, reason: collision with root package name */
        public static final String f57793u = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(9);

        /* renamed from: v, reason: collision with root package name */
        public static final String f57794v = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(10);

        /* renamed from: a, reason: collision with root package name */
        public final long f57795a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57796b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57797c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri[] f57798d;

        /* renamed from: e, reason: collision with root package name */
        public final p0[] f57799e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f57800f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f57801g;

        /* renamed from: h, reason: collision with root package name */
        public final String[] f57802h;

        /* renamed from: i, reason: collision with root package name */
        public final long f57803i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f57804j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f57805k;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new p0[0], new long[0], 0L, false, new String[0], false);
        }

        public static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static gn.b.a fromBundle(android.os.Bundle r16) {
            /*
                r0 = r16
                java.lang.String r1 = gn.b.a.f57784l
                long r3 = r0.getLong(r1)
                java.lang.String r1 = gn.b.a.f57785m
                int r5 = r0.getInt(r1)
                java.lang.String r1 = gn.b.a.f57791s
                int r6 = r0.getInt(r1)
                java.lang.String r1 = gn.b.a.f57786n
                java.util.ArrayList r1 = r0.getParcelableArrayList(r1)
                java.lang.String r2 = gn.b.a.f57792t
                java.util.ArrayList r2 = r0.getParcelableArrayList(r2)
                java.lang.String r7 = gn.b.a.f57787o
                int[] r7 = r0.getIntArray(r7)
                java.lang.String r8 = gn.b.a.f57788p
                long[] r8 = r0.getLongArray(r8)
                java.lang.String r9 = gn.b.a.f57789q
                long r10 = r0.getLong(r9)
                java.lang.String r9 = gn.b.a.f57790r
                boolean r12 = r0.getBoolean(r9)
                java.lang.String r9 = gn.b.a.f57793u
                java.util.ArrayList r9 = r0.getStringArrayList(r9)
                java.lang.String r13 = gn.b.a.f57794v
                boolean r14 = r0.getBoolean(r13)
                gn.b$a r0 = new gn.b$a
                r13 = 0
                if (r7 != 0) goto L4b
                int[] r7 = new int[r13]
            L4b:
                if (r2 == 0) goto L70
                int r1 = r2.size()
                gn.p0[] r1 = new gn.p0[r1]
                r15 = r13
            L54:
                int r13 = r2.size()
                if (r15 >= r13) goto L6d
                java.lang.Object r13 = r2.get(r15)
                android.os.Bundle r13 = (android.os.Bundle) r13
                if (r13 != 0) goto L64
                r13 = 0
                goto L68
            L64:
                gn.p0 r13 = gn.p0.fromBundle(r13)
            L68:
                r1[r15] = r13
                int r15 = r15 + 1
                goto L54
            L6d:
                r2 = r1
            L6e:
                r1 = 0
                goto L95
            L70:
                if (r1 == 0) goto L92
                int r2 = r1.size()
                gn.p0[] r2 = new gn.p0[r2]
                r13 = 0
            L79:
                int r15 = r1.size()
                if (r13 >= r15) goto L6e
                java.lang.Object r15 = r1.get(r13)
                android.net.Uri r15 = (android.net.Uri) r15
                if (r15 != 0) goto L89
                r15 = 0
                goto L8d
            L89:
                gn.p0 r15 = gn.p0.fromUri(r15)
            L8d:
                r2[r13] = r15
                int r13 = r13 + 1
                goto L79
            L92:
                r1 = 0
                gn.p0[] r2 = new gn.p0[r1]
            L95:
                if (r8 != 0) goto L99
                long[] r8 = new long[r1]
            L99:
                java.lang.String[] r1 = new java.lang.String[r1]
                if (r9 != 0) goto La2
            L9d:
                r13 = r1
                r9 = r8
                r8 = r2
                r2 = r0
                goto La9
            La2:
                java.lang.Object[] r1 = r9.toArray(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                goto L9d
            La9:
                r2.<init>(r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: gn.b.a.fromBundle(android.os.Bundle):gn.b$a");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f57795a == aVar.f57795a && this.f57796b == aVar.f57796b && this.f57797c == aVar.f57797c && Arrays.equals(this.f57799e, aVar.f57799e) && Arrays.equals(this.f57800f, aVar.f57800f) && Arrays.equals(this.f57801g, aVar.f57801g) && this.f57803i == aVar.f57803i && this.f57804j == aVar.f57804j && Arrays.equals(this.f57802h, aVar.f57802h) && this.f57805k == aVar.f57805k) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getIndexOfAdId(String str) {
            int i10 = 0;
            while (true) {
                String[] strArr = this.f57802h;
                if (i10 >= strArr.length) {
                    return -1;
                }
                if (Objects.equals(strArr[i10], str)) {
                    return i10;
                }
                i10++;
            }
        }

        public int getNextAdIndexToPlay(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f57800f;
                if (i12 >= iArr.length || this.f57804j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean hasUnplayedAds() {
            int i10 = this.f57796b;
            if (i10 == -1) {
                return true;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.f57800f[i11];
                if (i12 == 0 || i12 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f57796b * 31) + this.f57797c) * 31;
            long j10 = this.f57795a;
            int iHashCode = (Arrays.hashCode(this.f57801g) + ((Arrays.hashCode(this.f57800f) + ((Arrays.hashCode(this.f57799e) + ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31)) * 31)) * 31;
            long j11 = this.f57803i;
            return ((((((iHashCode + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f57804j ? 1 : 0)) * 31) + Arrays.hashCode(this.f57802h)) * 31) + (this.f57805k ? 1 : 0);
        }

        public boolean isLivePostrollPlaceholder(boolean z10) {
            return this.f57804j == z10 && isLivePostrollPlaceholder();
        }

        public boolean shouldPlayAdGroup() {
            int i10 = this.f57796b;
            return i10 == -1 || getFirstAdIndexToPlay() < i10;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f57784l, this.f57795a);
            bundle.putInt(f57785m, this.f57796b);
            bundle.putInt(f57791s, this.f57797c);
            bundle.putParcelableArrayList(f57786n, new ArrayList<>(Arrays.asList(this.f57798d)));
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            p0[] p0VarArr = this.f57799e;
            int length = p0VarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                p0 p0Var = p0VarArr[i10];
                arrayList.add(p0Var == null ? null : p0Var.toBundleIncludeLocalConfiguration());
            }
            bundle.putParcelableArrayList(f57792t, arrayList);
            bundle.putIntArray(f57787o, this.f57800f);
            bundle.putLongArray(f57788p, this.f57801g);
            bundle.putLong(f57789q, this.f57803i);
            bundle.putBoolean(f57790r, this.f57804j);
            bundle.putStringArrayList(f57793u, new ArrayList<>(Arrays.asList(this.f57802h)));
            bundle.putBoolean(f57794v, this.f57805k);
            return bundle;
        }

        public a withAdCount(int i10) {
            int[] iArr = this.f57800f;
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArrA = a(this.f57801g, i10);
            p0[] p0VarArr = (p0[]) Arrays.copyOf(this.f57799e, i10);
            String[] strArr = (String[]) Arrays.copyOf(this.f57802h, i10);
            return new a(this.f57795a, i10, this.f57797c, iArrCopyOf, p0VarArr, jArrA, this.f57803i, this.f57804j, strArr, this.f57805k);
        }

        public a withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            p0[] p0VarArr = this.f57799e;
            if (length < p0VarArr.length) {
                jArr = a(jArr, p0VarArr.length);
            } else if (this.f57796b != -1 && jArr.length > p0VarArr.length) {
                jArr = Arrays.copyOf(jArr, p0VarArr.length);
            }
            return new a(this.f57795a, this.f57796b, this.f57797c, this.f57800f, this.f57799e, jArr, this.f57803i, this.f57804j, this.f57802h, this.f57805k);
        }

        public a withAdId(String str, int i10) {
            int[] iArr = this.f57800f;
            int length = iArr.length;
            int iMax = Math.max(i10 + 1, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArrA = this.f57801g;
            if (jArrA.length != iArrCopyOf.length) {
                jArrA = a(jArrA, iArrCopyOf.length);
            }
            long[] jArr = jArrA;
            p0[] p0VarArr = this.f57799e;
            if (p0VarArr.length != iArrCopyOf.length) {
                p0VarArr = (p0[]) Arrays.copyOf(p0VarArr, iArrCopyOf.length);
            }
            p0[] p0VarArr2 = p0VarArr;
            String[] strArr = this.f57802h;
            if (strArr.length != iArrCopyOf.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyOf.length);
            }
            String[] strArr2 = strArr;
            strArr2[i10] = str;
            return new a(this.f57795a, this.f57796b, this.f57797c, iArrCopyOf, p0VarArr2, jArr, this.f57803i, this.f57804j, strArr2, this.f57805k);
        }

        public a withAdMediaItem(p0 p0Var, int i10) {
            int[] iArr = this.f57800f;
            int length = iArr.length;
            int iMax = Math.max(i10 + 1, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArrA = this.f57801g;
            if (jArrA.length != iArrCopyOf.length) {
                jArrA = a(jArrA, iArrCopyOf.length);
            }
            long[] jArr = jArrA;
            p0[] p0VarArr = (p0[]) Arrays.copyOf(this.f57799e, iArrCopyOf.length);
            p0VarArr[i10] = p0Var;
            iArrCopyOf[i10] = 1;
            String[] strArr = this.f57802h;
            if (strArr.length != iArrCopyOf.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyOf.length);
            }
            String[] strArr2 = strArr;
            return new a(this.f57795a, this.f57796b, this.f57797c, iArrCopyOf, p0VarArr, jArr, this.f57803i, this.f57804j, strArr2, this.f57805k);
        }

        public a withAdState(int i10, int i11) {
            int i12 = this.f57796b;
            io.bidmachine.media3.common.util.a.checkArgument(i12 == -1 || i11 < i12);
            int[] iArr = this.f57800f;
            int length = iArr.length;
            int iMax = Math.max(i11 + 1, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            int i13 = iArrCopyOf[i11];
            io.bidmachine.media3.common.util.a.checkArgument(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArrA = this.f57801g;
            if (jArrA.length != iArrCopyOf.length) {
                jArrA = a(jArrA, iArrCopyOf.length);
            }
            long[] jArr = jArrA;
            p0[] p0VarArr = this.f57799e;
            if (p0VarArr.length != iArrCopyOf.length) {
                p0VarArr = (p0[]) Arrays.copyOf(p0VarArr, iArrCopyOf.length);
            }
            p0[] p0VarArr2 = p0VarArr;
            String[] strArr = this.f57802h;
            if (strArr.length != iArrCopyOf.length) {
                strArr = (String[]) Arrays.copyOf(strArr, iArrCopyOf.length);
            }
            String[] strArr2 = strArr;
            iArrCopyOf[i11] = i10;
            return new a(this.f57795a, this.f57796b, this.f57797c, iArrCopyOf, p0VarArr2, jArr, this.f57803i, this.f57804j, strArr2, this.f57805k);
        }

        @Deprecated
        public a withAdUri(Uri uri, int i10) {
            return withAdMediaItem(p0.fromUri(uri), i10);
        }

        public a withAllAdsReset() {
            if (this.f57796b == -1) {
                return this;
            }
            int[] iArr = this.f57800f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 3 || i11 == 2 || i11 == 4) {
                    iArrCopyOf[i10] = this.f57799e[i10] == null ? 0 : 1;
                }
            }
            return new a(this.f57795a, length, this.f57797c, iArrCopyOf, this.f57799e, this.f57801g, this.f57803i, this.f57804j, this.f57802h, this.f57805k);
        }

        public a withAllAdsSkipped() {
            if (this.f57796b == -1) {
                String[] strArr = this.f57802h;
                boolean z10 = this.f57805k;
                return new a(this.f57795a, 0, this.f57797c, new int[0], new p0[0], new long[0], this.f57803i, this.f57804j, strArr, z10);
            }
            int[] iArr = this.f57800f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new a(this.f57795a, length, this.f57797c, iArrCopyOf, this.f57799e, this.f57801g, this.f57803i, this.f57804j, this.f57802h, this.f57805k);
        }

        public a withContentResumeOffsetUs(long j10) {
            return new a(this.f57795a, this.f57796b, this.f57797c, this.f57800f, this.f57799e, this.f57801g, j10, this.f57804j, this.f57802h, this.f57805k);
        }

        public a withIsServerSideInserted(boolean z10) {
            return new a(this.f57795a, this.f57796b, this.f57797c, this.f57800f, this.f57799e, this.f57801g, this.f57803i, z10, this.f57802h, this.f57805k);
        }

        public a withLastAdRemoved() {
            int[] iArr = this.f57800f;
            int length = iArr.length - 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            p0[] p0VarArr = (p0[]) Arrays.copyOf(this.f57799e, length);
            long[] jArrCopyOf = this.f57801g;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new a(this.f57795a, length, this.f57797c, iArrCopyOf, p0VarArr, jArr, io.bidmachine.media3.common.util.a1.sum(jArr), this.f57804j, (String[]) Arrays.copyOf(this.f57802h, length), this.f57805k);
        }

        public a withOriginalAdCount(int i10) {
            return new a(this.f57795a, this.f57796b, i10, this.f57800f, this.f57799e, this.f57801g, this.f57803i, this.f57804j, this.f57802h, this.f57805k);
        }

        public a withTimeUs(long j10) {
            return new a(j10, this.f57796b, this.f57797c, this.f57800f, this.f57799e, this.f57801g, this.f57803i, this.f57804j, this.f57802h, this.f57805k);
        }

        public a(long j10, int i10, int i11, int[] iArr, p0[] p0VarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            io.bidmachine.media3.common.util.a.checkArgument(iArr.length == p0VarArr.length);
            this.f57795a = j10;
            this.f57796b = i10;
            this.f57797c = i11;
            this.f57800f = iArr;
            this.f57799e = p0VarArr;
            this.f57801g = jArr;
            this.f57803i = j11;
            this.f57804j = z10;
            this.f57798d = new Uri[p0VarArr.length];
            while (true) {
                Uri[] uriArr = this.f57798d;
                if (i12 >= uriArr.length) {
                    this.f57802h = strArr;
                    this.f57805k = z11;
                    return;
                } else {
                    p0 p0Var = p0VarArr[i12];
                    uriArr[i12] = p0Var == null ? null : ((j0) io.bidmachine.media3.common.util.a.checkNotNull(p0Var.f58053b)).f57963a;
                    i12++;
                }
            }
        }

        public boolean isLivePostrollPlaceholder() {
            return this.f57805k && this.f57795a == Long.MIN_VALUE && this.f57796b == -1;
        }
    }

    public b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f57778a = obj;
        this.f57780c = j10;
        this.f57781d = j11;
        this.f57779b = aVarArr.length + i10;
        this.f57783f = aVarArr;
        this.f57782e = i10;
    }

    public static b fromAdPlaybackState(Object obj, b bVar) {
        int i10 = bVar.f57779b - bVar.f57782e;
        a[] aVarArr = new a[i10];
        int i11 = 0;
        while (i11 < i10) {
            a aVar = bVar.f57783f[i11];
            long j10 = aVar.f57795a;
            int i12 = aVar.f57796b;
            int i13 = aVar.f57797c;
            int[] iArr = aVar.f57800f;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            p0[] p0VarArr = aVar.f57799e;
            p0[] p0VarArr2 = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
            long[] jArr = aVar.f57801g;
            aVarArr[i11] = new a(j10, i12, i13, iArrCopyOf, p0VarArr2, Arrays.copyOf(jArr, jArr.length), aVar.f57803i, aVar.f57804j, aVar.f57802h, aVar.f57805k);
            i11++;
            i10 = i10;
        }
        return new b(obj, aVarArr, bVar.f57780c, bVar.f57781d, bVar.f57782e);
    }

    public static b fromBundle(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f57774i);
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new b(null, aVarArr, bundle.getLong(f57775j, 0L), bundle.getLong(f57776k, C.TIME_UNSET), bundle.getInt(f57777l, 0));
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i10 = this.f57779b - 1;
        return i10 >= 0 && isLivePostrollPlaceholder(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (Objects.equals(this.f57778a, bVar.f57778a) && this.f57779b == bVar.f57779b && this.f57780c == bVar.f57780c && this.f57781d == bVar.f57781d && this.f57782e == bVar.f57782e && Arrays.equals(this.f57783f, bVar.f57783f)) {
                return true;
            }
        }
        return false;
    }

    public a getAdGroup(int i10) {
        int i11 = this.f57782e;
        return i10 < i11 ? f57773h : this.f57783f[i10 - i11];
    }

    public int getAdGroupIndexAfterPositionUs(long j10, long j11) {
        int i10;
        if (j10 != Long.MIN_VALUE && (j11 == C.TIME_UNSET || j10 < j11)) {
            int i11 = this.f57782e;
            while (true) {
                i10 = this.f57779b;
                if (i11 >= i10 || ((getAdGroup(i11).f57795a == Long.MIN_VALUE || getAdGroup(i11).f57795a > j10) && getAdGroup(i11).shouldPlayAdGroup())) {
                    break;
                }
                i11++;
            }
            if (i11 < i10) {
                return i11;
            }
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j10, long j11) {
        int i10 = this.f57779b - 1;
        int i11 = i10 - (isLivePostrollPlaceholder(i10) ? 1 : 0);
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            a adGroup = getAdGroup(i11);
            long j12 = adGroup.f57795a;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i11--;
            } else {
                if (j11 != C.TIME_UNSET && !adGroup.isLivePostrollPlaceholder() && j10 >= j11) {
                    break;
                }
                i11--;
            }
        }
        if (i11 < 0 || !getAdGroup(i11).hasUnplayedAds()) {
            return -1;
        }
        return i11;
    }

    public int getAdIndexOfAdId(int i10, String str) {
        return getAdGroup(i10).getIndexOfAdId(str);
    }

    public int hashCode() {
        int i10 = this.f57779b * 31;
        Object obj = this.f57778a;
        return Arrays.hashCode(this.f57783f) + ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f57780c)) * 31) + ((int) this.f57781d)) * 31) + this.f57782e) * 31);
    }

    public boolean isAdInErrorState(int i10, int i11) {
        a adGroup;
        int i12;
        return i10 < this.f57779b && (i12 = (adGroup = getAdGroup(i10)).f57796b) != -1 && i11 < i12 && adGroup.f57800f[i11] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i10) {
        return i10 == this.f57779b - 1 && getAdGroup(i10).isLivePostrollPlaceholder();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f57783f) {
            arrayList.add(aVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f57774i, arrayList);
        }
        long j10 = this.f57780c;
        if (j10 != 0) {
            bundle.putLong(f57775j, j10);
        }
        long j11 = this.f57781d;
        if (j11 != C.TIME_UNSET) {
            bundle.putLong(f57776k, j11);
        }
        int i10 = this.f57782e;
        if (i10 != 0) {
            bundle.putInt(f57777l, i10);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f57778a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f57780c);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f57783f;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i10].f57795a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < aVarArr[i10].f57800f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].f57800f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i10].f57801g[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].f57800f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }

    public b withAdCount(int i10, int i11) {
        io.bidmachine.media3.common.util.a.checkArgument(i11 > 0);
        int i12 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        if (aVarArr[i12].f57796b == i11) {
            return this;
        }
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr[i12].withAdCount(i11);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withAdDurationsUs(long[][] jArr) {
        int length = jArr.length;
        int i10 = 0;
        int i11 = this.f57779b;
        io.bidmachine.media3.common.util.a.checkArgument(length == i11);
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        while (true) {
            int i12 = this.f57782e;
            if (i10 >= i11 - i12) {
                return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, i12);
            }
            aVarArr2[i10] = aVarArr2[i10].withAdDurationsUs(jArr[i12 + i10]);
            i10++;
        }
    }

    public b withAdGroupTimeUs(int i10, long j10) {
        int i11 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr[i11].withTimeUs(j10);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withAdId(int i10, int i11, String str) {
        int i12 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withAdId(str, i11);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withAdLoadError(int i10, int i11) {
        int i12 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withAdState(4, i11);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withAdResumePositionUs(long j10) {
        if (this.f57780c == j10) {
            return this;
        }
        return new b(this.f57778a, this.f57783f, j10, this.f57781d, this.f57782e);
    }

    public b withAdsId(Object obj) {
        return new b(obj, this.f57783f, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withAvailableAd(int i10, int i11) {
        return withAvailableAdMediaItem(i10, i11, p0.fromUri(Uri.EMPTY));
    }

    public b withAvailableAdMediaItem(int i10, int i11, p0 p0Var) {
        j0 j0Var;
        int i12 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        io.bidmachine.media3.common.util.a.checkState(aVarArr2[i12].f57804j || !((j0Var = p0Var.f58053b) == null || j0Var.f57963a.equals(Uri.EMPTY)));
        aVarArr2[i12] = aVarArr2[i12].withAdMediaItem(p0Var, i11);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    @Deprecated
    public b withAvailableAdUri(int i10, int i11, Uri uri) {
        return withAvailableAdMediaItem(i10, i11, p0.fromUri(uri));
    }

    public b withContentDurationUs(long j10) {
        if (this.f57781d == j10) {
            return this;
        }
        return new b(this.f57778a, this.f57783f, this.f57780c, j10, this.f57782e);
    }

    public b withContentResumeOffsetUs(int i10, long j10) {
        int i11 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        if (aVarArr[i11].f57803i == j10) {
            return this;
        }
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withContentResumeOffsetUs(j10);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withIsServerSideInserted(int i10, boolean z10) {
        int i11 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        if (aVarArr[i11].f57804j == z10) {
            return this;
        }
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withIsServerSideInserted(z10);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withLastAdRemoved(int i10) {
        int i11 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withLastAdRemoved();
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    @Deprecated
    public b withLivePostrollPlaceholderAppended() {
        return withLivePostrollPlaceholderAppended(true);
    }

    public b withNewAdGroup(int i10, long j10) {
        int i11 = i10 - this.f57782e;
        a aVar = new a(j10);
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayAppend(aVarArr, aVar);
        System.arraycopy(aVarArr2, i11, aVarArr2, i11 + 1, aVarArr.length - i11);
        aVarArr2[i11] = aVar;
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withOriginalAdCount(int i10, int i11) {
        int i12 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        if (aVarArr[i12].f57797c == i11) {
            return this;
        }
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withOriginalAdCount(i11);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withPlayedAd(int i10, int i11) {
        int i12 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withAdState(3, i11);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withRemovedAdGroupCount(int i10) {
        int i11 = this.f57782e;
        if (i11 == i10) {
            return this;
        }
        io.bidmachine.media3.common.util.a.checkArgument(i10 > i11);
        int i12 = this.f57779b - i10;
        a[] aVarArr = new a[i12];
        System.arraycopy(this.f57783f, i10 - i11, aVarArr, 0, i12);
        return new b(this.f57778a, aVarArr, this.f57780c, this.f57781d, i10);
    }

    public b withResetAdGroup(int i10) {
        int i11 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withAllAdsReset();
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withSkippedAd(int i10, int i11) {
        int i12 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withAdState(2, i11);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public b withSkippedAdGroup(int i10) {
        int i11 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withAllAdsSkipped();
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    public boolean isLivePostrollPlaceholder(int i10, boolean z10) {
        return i10 == this.f57779b - 1 && getAdGroup(i10).isLivePostrollPlaceholder(z10);
    }

    public b withLivePostrollPlaceholderAppended(boolean z10) {
        boolean z11;
        int i10 = this.f57779b;
        b bVarWithNewAdGroup = withNewAdGroup(i10, Long.MIN_VALUE);
        int i11 = i10 - bVarWithNewAdGroup.f57782e;
        a[] aVarArr = bVarWithNewAdGroup.f57783f;
        a aVar = aVarArr[i11];
        if (aVar.f57805k) {
            z11 = z10;
            if (aVar.f57804j == z11) {
                return bVarWithNewAdGroup;
            }
        } else {
            z11 = z10;
        }
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        a aVar2 = aVarArr2[i11];
        aVarArr2[i11] = new a(aVar2.f57795a, aVar2.f57796b, aVar2.f57797c, aVar2.f57800f, aVar2.f57799e, aVar2.f57801g, aVar2.f57803i, z11, aVar2.f57802h, true);
        return new b(bVarWithNewAdGroup.f57778a, aVarArr2, bVarWithNewAdGroup.f57780c, bVarWithNewAdGroup.f57781d, bVarWithNewAdGroup.f57782e);
    }

    public boolean endsWithLivePostrollPlaceHolder(boolean z10) {
        int i10 = this.f57779b - 1;
        return i10 >= 0 && isLivePostrollPlaceholder(i10, z10);
    }

    public b withAdDurationsUs(int i10, long... jArr) {
        int i11 = i10 - this.f57782e;
        a[] aVarArr = this.f57783f;
        a[] aVarArr2 = (a[]) io.bidmachine.media3.common.util.a1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withAdDurationsUs(jArr);
        return new b(this.f57778a, aVarArr2, this.f57780c, this.f57781d, this.f57782e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Object obj, long... jArr) {
        int length = jArr.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = new a(jArr[i10]);
        }
        this(obj, aVarArr, 0L, C.TIME_UNSET, 0);
    }
}
