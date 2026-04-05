package io.odeeo.internal.b0;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.b.g;
import io.odeeo.internal.q0.g0;
import j1.u;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final a f63205g = new a(null, new C0591a[0], 0, C.TIME_UNSET, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final C0591a f63206h = new C0591a(0).withAdCount(0);

    /* renamed from: i, reason: collision with root package name */
    public static final g.a<a> f63207i = new u(6);

    /* renamed from: a, reason: collision with root package name */
    public final Object f63208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63209b;

    /* renamed from: c, reason: collision with root package name */
    public final long f63210c;

    /* renamed from: d, reason: collision with root package name */
    public final long f63211d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63212e;

    /* renamed from: f, reason: collision with root package name */
    public final C0591a[] f63213f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.b0.a$a, reason: collision with other inner class name */
    public static final class C0591a implements g {

        /* renamed from: h, reason: collision with root package name */
        public static final g.a<C0591a> f63214h = new u(7);

        /* renamed from: a, reason: collision with root package name */
        public final long f63215a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63216b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri[] f63217c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f63218d;

        /* renamed from: e, reason: collision with root package name */
        public final long[] f63219e;

        /* renamed from: f, reason: collision with root package name */
        public final long f63220f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f63221g;

        public C0591a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public static int[] a(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0591a.class == obj.getClass()) {
                C0591a c0591a = (C0591a) obj;
                if (this.f63215a == c0591a.f63215a && this.f63216b == c0591a.f63216b && Arrays.equals(this.f63217c, c0591a.f63217c) && Arrays.equals(this.f63218d, c0591a.f63218d) && Arrays.equals(this.f63219e, c0591a.f63219e) && this.f63220f == c0591a.f63220f && this.f63221g == c0591a.f63221g) {
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
                int[] iArr = this.f63218d;
                if (i12 >= iArr.length || this.f63221g || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean hasUnplayedAds() {
            if (this.f63216b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f63216b; i10++) {
                int i11 = this.f63218d[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f63216b * 31;
            long j10 = this.f63215a;
            int iHashCode = (Arrays.hashCode(this.f63219e) + ((Arrays.hashCode(this.f63218d) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f63217c)) * 31)) * 31)) * 31;
            long j11 = this.f63220f;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f63221g ? 1 : 0);
        }

        public boolean shouldPlayAdGroup() {
            return this.f63216b == -1 || getFirstAdIndexToPlay() < this.f63216b;
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(a(0), this.f63215a);
            bundle.putInt(a(1), this.f63216b);
            bundle.putParcelableArrayList(a(2), new ArrayList<>(Arrays.asList(this.f63217c)));
            bundle.putIntArray(a(3), this.f63218d);
            bundle.putLongArray(a(4), this.f63219e);
            bundle.putLong(a(5), this.f63220f);
            bundle.putBoolean(a(6), this.f63221g);
            return bundle;
        }

        public C0591a withAdCount(int i10) {
            int[] iArrA = a(this.f63218d, i10);
            long[] jArrA = a(this.f63219e, i10);
            return new C0591a(this.f63215a, i10, iArrA, (Uri[]) Arrays.copyOf(this.f63217c, i10), jArrA, this.f63220f, this.f63221g);
        }

        public C0591a withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.f63217c;
            if (length < uriArr.length) {
                jArr = a(jArr, uriArr.length);
            } else if (this.f63216b != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new C0591a(this.f63215a, this.f63216b, this.f63218d, this.f63217c, jArr, this.f63220f, this.f63221g);
        }

        public C0591a withAdState(int i10, int i11) {
            int i12 = this.f63216b;
            io.odeeo.internal.q0.a.checkArgument(i12 == -1 || i11 < i12);
            int[] iArrA = a(this.f63218d, i11 + 1);
            int i13 = iArrA[i11];
            io.odeeo.internal.q0.a.checkArgument(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArrA = this.f63219e;
            if (jArrA.length != iArrA.length) {
                jArrA = a(jArrA, iArrA.length);
            }
            long[] jArr = jArrA;
            Uri[] uriArr = this.f63217c;
            if (uriArr.length != iArrA.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrA.length);
            }
            Uri[] uriArr2 = uriArr;
            iArrA[i11] = i10;
            return new C0591a(this.f63215a, this.f63216b, iArrA, uriArr2, jArr, this.f63220f, this.f63221g);
        }

        public C0591a withAdUri(Uri uri, int i10) {
            int[] iArrA = a(this.f63218d, i10 + 1);
            long[] jArrA = this.f63219e;
            if (jArrA.length != iArrA.length) {
                jArrA = a(jArrA, iArrA.length);
            }
            long[] jArr = jArrA;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f63217c, iArrA.length);
            uriArr[i10] = uri;
            iArrA[i10] = 1;
            return new C0591a(this.f63215a, this.f63216b, iArrA, uriArr, jArr, this.f63220f, this.f63221g);
        }

        public C0591a withAllAdsSkipped() {
            if (this.f63216b == -1) {
                return new C0591a(this.f63215a, 0, new int[0], new Uri[0], new long[0], this.f63220f, this.f63221g);
            }
            int[] iArr = this.f63218d;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new C0591a(this.f63215a, length, iArrCopyOf, this.f63217c, this.f63219e, this.f63220f, this.f63221g);
        }

        public C0591a withContentResumeOffsetUs(long j10) {
            return new C0591a(this.f63215a, this.f63216b, this.f63218d, this.f63217c, this.f63219e, j10, this.f63221g);
        }

        public C0591a withIsServerSideInserted(boolean z10) {
            return new C0591a(this.f63215a, this.f63216b, this.f63218d, this.f63217c, this.f63219e, this.f63220f, z10);
        }

        public C0591a withTimeUs(long j10) {
            return new C0591a(j10, this.f63216b, this.f63218d, this.f63217c, this.f63219e, this.f63220f, this.f63221g);
        }

        public C0591a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            io.odeeo.internal.q0.a.checkArgument(iArr.length == uriArr.length);
            this.f63215a = j10;
            this.f63216b = i10;
            this.f63218d = iArr;
            this.f63217c = uriArr;
            this.f63219e = jArr;
            this.f63220f = j11;
            this.f63221g = z10;
        }

        public static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        public static C0591a a(Bundle bundle) {
            long j10 = bundle.getLong(a(0));
            int i10 = bundle.getInt(a(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(a(2));
            int[] intArray = bundle.getIntArray(a(3));
            long[] longArray = bundle.getLongArray(a(4));
            long j11 = bundle.getLong(a(5));
            boolean z10 = bundle.getBoolean(a(6));
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new C0591a(j10, i10, iArr, uriArr, longArray, j11, z10);
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    public a(Object obj, long... jArr) {
        this(obj, a(jArr), 0L, C.TIME_UNSET, 0);
    }

    public final boolean a(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = getAdGroup(i10).f63215a;
        return j12 == Long.MIN_VALUE ? j11 == C.TIME_UNSET || j10 < j11 : j10 < j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (g0.areEqual(this.f63208a, aVar.f63208a) && this.f63209b == aVar.f63209b && this.f63210c == aVar.f63210c && this.f63211d == aVar.f63211d && this.f63212e == aVar.f63212e && Arrays.equals(this.f63213f, aVar.f63213f)) {
                return true;
            }
        }
        return false;
    }

    public C0591a getAdGroup(int i10) {
        int i11 = this.f63212e;
        return i10 < i11 ? f63206h : this.f63213f[i10 - i11];
    }

    public int getAdGroupIndexAfterPositionUs(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == C.TIME_UNSET || j10 < j11)) {
            int i10 = this.f63212e;
            while (i10 < this.f63209b && ((getAdGroup(i10).f63215a != Long.MIN_VALUE && getAdGroup(i10).f63215a <= j10) || !getAdGroup(i10).shouldPlayAdGroup())) {
                i10++;
            }
            if (i10 < this.f63209b) {
                return i10;
            }
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j10, long j11) {
        int i10 = this.f63209b - 1;
        while (i10 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!a(j12, j13, i10)) {
                break;
            }
            i10--;
            j10 = j12;
            j11 = j13;
        }
        if (i10 < 0 || !getAdGroup(i10).hasUnplayedAds()) {
            return -1;
        }
        return i10;
    }

    public int hashCode() {
        int i10 = this.f63209b * 31;
        Object obj = this.f63208a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f63210c)) * 31) + ((int) this.f63211d)) * 31) + this.f63212e) * 31) + Arrays.hashCode(this.f63213f);
    }

    public boolean isAdInErrorState(int i10, int i11) {
        C0591a adGroup;
        int i12;
        return i10 < this.f63209b && (i12 = (adGroup = getAdGroup(i10)).f63216b) != -1 && i11 < i12 && adGroup.f63218d[i11] == 4;
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C0591a c0591a : this.f63213f) {
            arrayList.add(c0591a.toBundle());
        }
        bundle.putParcelableArrayList(a(1), arrayList);
        bundle.putLong(a(2), this.f63210c);
        bundle.putLong(a(3), this.f63211d);
        bundle.putInt(a(4), this.f63212e);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f63208a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f63210c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f63213f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f63213f[i10].f63215a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f63213f[i10].f63218d.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f63213f[i10].f63218d[i11];
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
                sb2.append(this.f63213f[i10].f63219e[i11]);
                sb2.append(')');
                if (i11 < this.f63213f[i10].f63218d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f63213f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public a withAdCount(int i10, int i11) {
        io.odeeo.internal.q0.a.checkArgument(i11 > 0);
        int i12 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        if (c0591aArr[i12].f63216b == i11) {
            return this;
        }
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i12] = this.f63213f[i12].withAdCount(i11);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withAdDurationsUs(long[][] jArr) {
        io.odeeo.internal.q0.a.checkState(this.f63212e == 0);
        C0591a[] c0591aArr = this.f63213f;
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        for (int i10 = 0; i10 < this.f63209b; i10++) {
            c0591aArr2[i10] = c0591aArr2[i10].withAdDurationsUs(jArr[i10]);
        }
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withAdGroupTimeUs(int i10, long j10) {
        int i11 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i11] = this.f63213f[i11].withTimeUs(j10);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withAdLoadError(int i10, int i11) {
        int i12 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i12] = c0591aArr2[i12].withAdState(4, i11);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withAdResumePositionUs(long j10) {
        return this.f63210c == j10 ? this : new a(this.f63208a, this.f63213f, j10, this.f63211d, this.f63212e);
    }

    public a withAdUri(int i10, int i11, Uri uri) {
        int i12 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i12] = c0591aArr2[i12].withAdUri(uri, i11);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withContentDurationUs(long j10) {
        return this.f63211d == j10 ? this : new a(this.f63208a, this.f63213f, this.f63210c, j10, this.f63212e);
    }

    public a withContentResumeOffsetUs(int i10, long j10) {
        int i11 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        if (c0591aArr[i11].f63220f == j10) {
            return this;
        }
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i11] = c0591aArr2[i11].withContentResumeOffsetUs(j10);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withIsServerSideInserted(int i10, boolean z10) {
        int i11 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        if (c0591aArr[i11].f63221g == z10) {
            return this;
        }
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i11] = c0591aArr2[i11].withIsServerSideInserted(z10);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withNewAdGroup(int i10, long j10) {
        int i11 = i10 - this.f63212e;
        C0591a c0591a = new C0591a(j10);
        C0591a[] c0591aArr = (C0591a[]) g0.nullSafeArrayAppend(this.f63213f, c0591a);
        System.arraycopy(c0591aArr, i11, c0591aArr, i11 + 1, this.f63213f.length - i11);
        c0591aArr[i11] = c0591a;
        return new a(this.f63208a, c0591aArr, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withPlayedAd(int i10, int i11) {
        int i12 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i12] = c0591aArr2[i12].withAdState(3, i11);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withRemovedAdGroupCount(int i10) {
        int i11 = this.f63212e;
        if (i11 == i10) {
            return this;
        }
        io.odeeo.internal.q0.a.checkArgument(i10 > i11);
        int i12 = this.f63209b - i10;
        C0591a[] c0591aArr = new C0591a[i12];
        System.arraycopy(this.f63213f, i10 - this.f63212e, c0591aArr, 0, i12);
        return new a(this.f63208a, c0591aArr, this.f63210c, this.f63211d, i10);
    }

    public a withSkippedAd(int i10, int i11) {
        int i12 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i12] = c0591aArr2[i12].withAdState(2, i11);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public a withSkippedAdGroup(int i10) {
        int i11 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i11] = c0591aArr2[i11].withAllAdsSkipped();
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public static a a(Bundle bundle) {
        C0591a[] c0591aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(a(1));
        if (parcelableArrayList == null) {
            c0591aArr = new C0591a[0];
        } else {
            C0591a[] c0591aArr2 = new C0591a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                c0591aArr2[i10] = (C0591a) C0591a.f63214h.mo3834fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            c0591aArr = c0591aArr2;
        }
        return new a(null, c0591aArr, bundle.getLong(a(2), 0L), bundle.getLong(a(3), C.TIME_UNSET), bundle.getInt(a(4)));
    }

    public a(Object obj, C0591a[] c0591aArr, long j10, long j11, int i10) {
        this.f63208a = obj;
        this.f63210c = j10;
        this.f63211d = j11;
        this.f63209b = c0591aArr.length + i10;
        this.f63213f = c0591aArr;
        this.f63212e = i10;
    }

    public a withAdDurationsUs(int i10, long... jArr) {
        int i11 = i10 - this.f63212e;
        C0591a[] c0591aArr = this.f63213f;
        C0591a[] c0591aArr2 = (C0591a[]) g0.nullSafeArrayCopy(c0591aArr, c0591aArr.length);
        c0591aArr2[i11] = c0591aArr2[i11].withAdDurationsUs(jArr);
        return new a(this.f63208a, c0591aArr2, this.f63210c, this.f63211d, this.f63212e);
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static C0591a[] a(long[] jArr) {
        int length = jArr.length;
        C0591a[] c0591aArr = new C0591a[length];
        for (int i10 = 0; i10 < length; i10++) {
            c0591aArr[i10] = new C0591a(jArr[i10]);
        }
        return c0591aArr;
    }
}
