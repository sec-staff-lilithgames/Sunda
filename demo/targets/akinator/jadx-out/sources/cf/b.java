package cf;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.exoplayer2.i;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final b f12271i = new b(null, new a[0], 0, C.TIME_UNSET, 0);

    /* renamed from: j, reason: collision with root package name */
    public static final a f12272j = new a(0).withAdCount(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f12273k = n1.intToStringMaxRadix(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f12274l = n1.intToStringMaxRadix(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f12275m = n1.intToStringMaxRadix(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f12276n = n1.intToStringMaxRadix(4);

    /* renamed from: o, reason: collision with root package name */
    public static final cf.a f12277o = new cf.a(0);

    /* renamed from: b, reason: collision with root package name */
    public final Object f12278b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12279c;

    /* renamed from: e, reason: collision with root package name */
    public final long f12280e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12281f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12282g;

    /* renamed from: h, reason: collision with root package name */
    public final a[] f12283h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements i {

        /* renamed from: k, reason: collision with root package name */
        public static final String f12284k = n1.intToStringMaxRadix(0);

        /* renamed from: l, reason: collision with root package name */
        public static final String f12285l = n1.intToStringMaxRadix(1);

        /* renamed from: m, reason: collision with root package name */
        public static final String f12286m = n1.intToStringMaxRadix(2);

        /* renamed from: n, reason: collision with root package name */
        public static final String f12287n = n1.intToStringMaxRadix(3);

        /* renamed from: o, reason: collision with root package name */
        public static final String f12288o = n1.intToStringMaxRadix(4);

        /* renamed from: p, reason: collision with root package name */
        public static final String f12289p = n1.intToStringMaxRadix(5);

        /* renamed from: q, reason: collision with root package name */
        public static final String f12290q = n1.intToStringMaxRadix(6);

        /* renamed from: r, reason: collision with root package name */
        public static final String f12291r = n1.intToStringMaxRadix(7);

        /* renamed from: s, reason: collision with root package name */
        public static final cf.a f12292s = new cf.a(1);

        /* renamed from: b, reason: collision with root package name */
        public final long f12293b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12294c;

        /* renamed from: e, reason: collision with root package name */
        public final int f12295e;

        /* renamed from: f, reason: collision with root package name */
        public final Uri[] f12296f;

        /* renamed from: g, reason: collision with root package name */
        public final int[] f12297g;

        /* renamed from: h, reason: collision with root package name */
        public final long[] f12298h;

        /* renamed from: i, reason: collision with root package name */
        public final long f12299i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f12300j;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f12293b == aVar.f12293b && this.f12294c == aVar.f12294c && this.f12295e == aVar.f12295e && Arrays.equals(this.f12296f, aVar.f12296f) && Arrays.equals(this.f12297g, aVar.f12297g) && Arrays.equals(this.f12298h, aVar.f12298h) && this.f12299i == aVar.f12299i && this.f12300j == aVar.f12300j) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f12297g;
                if (i12 >= iArr.length || this.f12300j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean hasUnplayedAds() {
            int i10 = this.f12294c;
            if (i10 == -1) {
                return true;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.f12297g[i11];
                if (i12 == 0 || i12 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f12294c * 31) + this.f12295e) * 31;
            long j10 = this.f12293b;
            int iHashCode = (Arrays.hashCode(this.f12298h) + ((Arrays.hashCode(this.f12297g) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f12296f)) * 31)) * 31)) * 31;
            long j11 = this.f12299i;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f12300j ? 1 : 0);
        }

        public boolean shouldPlayAdGroup() {
            int i10 = this.f12294c;
            return i10 == -1 || getFirstAdIndexToPlay() < i10;
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f12284k, this.f12293b);
            bundle.putInt(f12285l, this.f12294c);
            bundle.putInt(f12291r, this.f12295e);
            bundle.putParcelableArrayList(f12286m, new ArrayList<>(Arrays.asList(this.f12296f)));
            bundle.putIntArray(f12287n, this.f12297g);
            bundle.putLongArray(f12288o, this.f12298h);
            bundle.putLong(f12289p, this.f12299i);
            bundle.putBoolean(f12290q, this.f12300j);
            return bundle;
        }

        public a withAdCount(int i10) {
            int[] iArr = this.f12297g;
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArrA = a(this.f12298h, i10);
            return new a(this.f12293b, i10, this.f12295e, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f12296f, i10), jArrA, this.f12299i, this.f12300j);
        }

        public a withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.f12296f;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            } else if (this.f12294c != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new a(this.f12293b, this.f12294c, this.f12295e, this.f12297g, this.f12296f, jArr, this.f12299i, this.f12300j);
        }

        public a withAdState(int i10, int i11) {
            int i12 = this.f12294c;
            com.google.android.exoplayer2.util.a.checkArgument(i12 == -1 || i11 < i12);
            int[] iArr = this.f12297g;
            int length = iArr.length;
            int iMax = Math.max(i11 + 1, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            int i13 = iArrCopyOf[i11];
            com.google.android.exoplayer2.util.a.checkArgument(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArrA = this.f12298h;
            if (jArrA.length != iArrCopyOf.length) {
                jArrA = a(jArrA, iArrCopyOf.length);
            }
            long[] jArr = jArrA;
            Uri[] uriArr = this.f12296f;
            if (uriArr.length != iArrCopyOf.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrCopyOf.length);
            }
            Uri[] uriArr2 = uriArr;
            iArrCopyOf[i11] = i10;
            return new a(this.f12293b, this.f12294c, this.f12295e, iArrCopyOf, uriArr2, jArr, this.f12299i, this.f12300j);
        }

        public a withAdUri(Uri uri, int i10) {
            int[] iArr = this.f12297g;
            int length = iArr.length;
            int iMax = Math.max(i10 + 1, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArrA = this.f12298h;
            if (jArrA.length != iArrCopyOf.length) {
                jArrA = a(jArrA, iArrCopyOf.length);
            }
            long[] jArr = jArrA;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f12296f, iArrCopyOf.length);
            uriArr[i10] = uri;
            iArrCopyOf[i10] = 1;
            return new a(this.f12293b, this.f12294c, this.f12295e, iArrCopyOf, uriArr, jArr, this.f12299i, this.f12300j);
        }

        public a withAllAdsReset() {
            if (this.f12294c == -1) {
                return this;
            }
            int[] iArr = this.f12297g;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 3 || i11 == 2 || i11 == 4) {
                    iArrCopyOf[i10] = this.f12296f[i10] == null ? 0 : 1;
                }
            }
            return new a(this.f12293b, length, this.f12295e, iArrCopyOf, this.f12296f, this.f12298h, this.f12299i, this.f12300j);
        }

        public a withAllAdsSkipped() {
            if (this.f12294c == -1) {
                long j10 = this.f12299i;
                boolean z10 = this.f12300j;
                return new a(this.f12293b, 0, this.f12295e, new int[0], new Uri[0], new long[0], j10, z10);
            }
            int[] iArr = this.f12297g;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new a(this.f12293b, length, this.f12295e, iArrCopyOf, this.f12296f, this.f12298h, this.f12299i, this.f12300j);
        }

        public a withContentResumeOffsetUs(long j10) {
            return new a(this.f12293b, this.f12294c, this.f12295e, this.f12297g, this.f12296f, this.f12298h, j10, this.f12300j);
        }

        public a withIsServerSideInserted(boolean z10) {
            return new a(this.f12293b, this.f12294c, this.f12295e, this.f12297g, this.f12296f, this.f12298h, this.f12299i, z10);
        }

        public a withLastAdRemoved() {
            int[] iArr = this.f12297g;
            int length = iArr.length - 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f12296f, length);
            long[] jArrCopyOf = this.f12298h;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new a(this.f12293b, length, this.f12295e, iArrCopyOf, uriArr, jArr, n1.sum(jArr), this.f12300j);
        }

        public a withOriginalAdCount(int i10) {
            return new a(this.f12293b, this.f12294c, i10, this.f12297g, this.f12296f, this.f12298h, this.f12299i, this.f12300j);
        }

        public a withTimeUs(long j10) {
            return new a(j10, this.f12294c, this.f12295e, this.f12297g, this.f12296f, this.f12298h, this.f12299i, this.f12300j);
        }

        public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            com.google.android.exoplayer2.util.a.checkArgument(iArr.length == uriArr.length);
            this.f12293b = j10;
            this.f12294c = i10;
            this.f12295e = i11;
            this.f12297g = iArr;
            this.f12296f = uriArr;
            this.f12298h = jArr;
            this.f12299i = j11;
            this.f12300j = z10;
        }
    }

    public b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f12278b = obj;
        this.f12280e = j10;
        this.f12281f = j11;
        this.f12279c = aVarArr.length + i10;
        this.f12283h = aVarArr;
        this.f12282g = i10;
    }

    public static b fromAdPlaybackState(Object obj, b bVar) {
        int i10 = bVar.f12279c - bVar.f12282g;
        a[] aVarArr = new a[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = bVar.f12283h[i11];
            long j10 = aVar.f12293b;
            int i12 = aVar.f12294c;
            int i13 = aVar.f12295e;
            int[] iArr = aVar.f12297g;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            Uri[] uriArr = aVar.f12296f;
            Uri[] uriArr2 = (Uri[]) Arrays.copyOf(uriArr, uriArr.length);
            long[] jArr = aVar.f12298h;
            aVarArr[i11] = new a(j10, i12, i13, iArrCopyOf, uriArr2, Arrays.copyOf(jArr, jArr.length), aVar.f12299i, aVar.f12300j);
        }
        return new b(obj, aVarArr, bVar.f12280e, bVar.f12281f, bVar.f12282g);
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i10 = this.f12279c - 1;
        return i10 >= 0 && isLivePostrollPlaceholder(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (n1.areEqual(this.f12278b, bVar.f12278b) && this.f12279c == bVar.f12279c && this.f12280e == bVar.f12280e && this.f12281f == bVar.f12281f && this.f12282g == bVar.f12282g && Arrays.equals(this.f12283h, bVar.f12283h)) {
                return true;
            }
        }
        return false;
    }

    public a getAdGroup(int i10) {
        int i11 = this.f12282g;
        return i10 < i11 ? f12272j : this.f12283h[i10 - i11];
    }

    public int getAdGroupIndexAfterPositionUs(long j10, long j11) {
        int i10;
        if (j10 != Long.MIN_VALUE && (j11 == C.TIME_UNSET || j10 < j11)) {
            int i11 = this.f12282g;
            while (true) {
                i10 = this.f12279c;
                if (i11 >= i10 || ((getAdGroup(i11).f12293b == Long.MIN_VALUE || getAdGroup(i11).f12293b > j10) && getAdGroup(i11).shouldPlayAdGroup())) {
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
        int i10 = this.f12279c - 1;
        int i11 = i10 - (isLivePostrollPlaceholder(i10) ? 1 : 0);
        while (i11 >= 0 && j10 != Long.MIN_VALUE) {
            a adGroup = getAdGroup(i11);
            long j12 = adGroup.f12293b;
            if (j12 != Long.MIN_VALUE) {
                if (j10 >= j12) {
                    break;
                }
                i11--;
            } else {
                if (j11 != C.TIME_UNSET && ((!adGroup.f12300j || adGroup.f12294c != -1) && j10 >= j11)) {
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

    public int hashCode() {
        int i10 = this.f12279c * 31;
        Object obj = this.f12278b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f12280e)) * 31) + ((int) this.f12281f)) * 31) + this.f12282g) * 31) + Arrays.hashCode(this.f12283h);
    }

    public boolean isAdInErrorState(int i10, int i11) {
        a adGroup;
        int i12;
        return i10 < this.f12279c && (i12 = (adGroup = getAdGroup(i10)).f12294c) != -1 && i11 < i12 && adGroup.f12297g[i11] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i10) {
        if (i10 != this.f12279c - 1) {
            return false;
        }
        a adGroup = getAdGroup(i10);
        return adGroup.f12300j && adGroup.f12293b == Long.MIN_VALUE && adGroup.f12294c == -1;
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f12283h) {
            arrayList.add(aVar.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f12273k, arrayList);
        }
        long j10 = this.f12280e;
        if (j10 != 0) {
            bundle.putLong(f12274l, j10);
        }
        long j11 = this.f12281f;
        if (j11 != C.TIME_UNSET) {
            bundle.putLong(f12275m, j11);
        }
        int i10 = this.f12282g;
        if (i10 != 0) {
            bundle.putInt(f12276n, i10);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f12278b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f12280e);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f12283h;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i10].f12293b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < aVarArr[i10].f12297g.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].f12297g[i11];
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
                sb2.append(aVarArr[i10].f12298h[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].f12297g.length - 1) {
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
        com.google.android.exoplayer2.util.a.checkArgument(i11 > 0);
        int i12 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        if (aVarArr[i12].f12294c == i11) {
            return this;
        }
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr[i12].withAdCount(i11);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withAdDurationsUs(long[][] jArr) {
        com.google.android.exoplayer2.util.a.checkState(this.f12282g == 0);
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        for (int i10 = 0; i10 < this.f12279c; i10++) {
            aVarArr2[i10] = aVarArr2[i10].withAdDurationsUs(jArr[i10]);
        }
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withAdGroupTimeUs(int i10, long j10) {
        int i11 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr[i11].withTimeUs(j10);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withAdLoadError(int i10, int i11) {
        int i12 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withAdState(4, i11);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withAdResumePositionUs(long j10) {
        if (this.f12280e == j10) {
            return this;
        }
        return new b(this.f12278b, this.f12283h, j10, this.f12281f, this.f12282g);
    }

    public b withAvailableAd(int i10, int i11) {
        return withAvailableAdUri(i10, i11, Uri.EMPTY);
    }

    public b withAvailableAdUri(int i10, int i11, Uri uri) {
        int i12 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        com.google.android.exoplayer2.util.a.checkState(!Uri.EMPTY.equals(uri) || aVarArr2[i12].f12300j);
        aVarArr2[i12] = aVarArr2[i12].withAdUri(uri, i11);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withContentDurationUs(long j10) {
        if (this.f12281f == j10) {
            return this;
        }
        return new b(this.f12278b, this.f12283h, this.f12280e, j10, this.f12282g);
    }

    public b withContentResumeOffsetUs(int i10, long j10) {
        int i11 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        if (aVarArr[i11].f12299i == j10) {
            return this;
        }
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withContentResumeOffsetUs(j10);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withIsServerSideInserted(int i10, boolean z10) {
        int i11 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        if (aVarArr[i11].f12300j == z10) {
            return this;
        }
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withIsServerSideInserted(z10);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withLastAdRemoved(int i10) {
        int i11 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withLastAdRemoved();
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withLivePostrollPlaceholderAppended() {
        int i10 = this.f12279c;
        return withNewAdGroup(i10, Long.MIN_VALUE).withIsServerSideInserted(i10, true);
    }

    public b withNewAdGroup(int i10, long j10) {
        int i11 = i10 - this.f12282g;
        a aVar = new a(j10);
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayAppend(aVarArr, aVar);
        System.arraycopy(aVarArr2, i11, aVarArr2, i11 + 1, aVarArr.length - i11);
        aVarArr2[i11] = aVar;
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withOriginalAdCount(int i10, int i11) {
        int i12 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        if (aVarArr[i12].f12295e == i11) {
            return this;
        }
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withOriginalAdCount(i11);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withPlayedAd(int i10, int i11) {
        int i12 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withAdState(3, i11);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withRemovedAdGroupCount(int i10) {
        int i11 = this.f12282g;
        if (i11 == i10) {
            return this;
        }
        com.google.android.exoplayer2.util.a.checkArgument(i10 > i11);
        int i12 = this.f12279c - i10;
        a[] aVarArr = new a[i12];
        System.arraycopy(this.f12283h, i10 - i11, aVarArr, 0, i12);
        return new b(this.f12278b, aVarArr, this.f12280e, this.f12281f, i10);
    }

    public b withResetAdGroup(int i10) {
        int i11 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withAllAdsReset();
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withSkippedAd(int i10, int i11) {
        int i12 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].withAdState(2, i11);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withSkippedAdGroup(int i10) {
        int i11 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withAllAdsSkipped();
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
    }

    public b withAdDurationsUs(int i10, long... jArr) {
        int i11 = i10 - this.f12282g;
        a[] aVarArr = this.f12283h;
        a[] aVarArr2 = (a[]) n1.nullSafeArrayCopy(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].withAdDurationsUs(jArr);
        return new b(this.f12278b, aVarArr2, this.f12280e, this.f12281f, this.f12282g);
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
