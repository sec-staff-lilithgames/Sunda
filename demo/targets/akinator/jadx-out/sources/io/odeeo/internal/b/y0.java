package io.odeeo.internal.b;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import io.odeeo.internal.b.g;
import io.odeeo.internal.b.z;
import io.odeeo.internal.b0.a;
import io.odeeo.internal.u0.h1;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class y0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f63072a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final g.a<y0> f63073b = new is.b(9);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends y0 {
        @Override // io.odeeo.internal.b.y0
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // io.odeeo.internal.b.y0
        public b getPeriod(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // io.odeeo.internal.b.y0
        public int getPeriodCount() {
            return 0;
        }

        @Override // io.odeeo.internal.b.y0
        public Object getUidOfPeriod(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // io.odeeo.internal.b.y0
        public d getWindow(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // io.odeeo.internal.b.y0
        public int getWindowCount() {
            return 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements g {

        /* renamed from: h, reason: collision with root package name */
        public static final g.a<b> f63074h = new is.b(10);

        /* renamed from: a, reason: collision with root package name */
        public Object f63075a;

        /* renamed from: b, reason: collision with root package name */
        public Object f63076b;

        /* renamed from: c, reason: collision with root package name */
        public int f63077c;

        /* renamed from: d, reason: collision with root package name */
        public long f63078d;

        /* renamed from: e, reason: collision with root package name */
        public long f63079e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f63080f;

        /* renamed from: g, reason: collision with root package name */
        public io.odeeo.internal.b0.a f63081g = io.odeeo.internal.b0.a.f63205g;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (io.odeeo.internal.q0.g0.areEqual(this.f63075a, bVar.f63075a) && io.odeeo.internal.q0.g0.areEqual(this.f63076b, bVar.f63076b) && this.f63077c == bVar.f63077c && this.f63078d == bVar.f63078d && this.f63079e == bVar.f63079e && this.f63080f == bVar.f63080f && io.odeeo.internal.q0.g0.areEqual(this.f63081g, bVar.f63081g)) {
                    return true;
                }
            }
            return false;
        }

        public int getAdCountInAdGroup(int i10) {
            return this.f63081g.getAdGroup(i10).f63216b;
        }

        public long getAdDurationUs(int i10, int i11) {
            a.C0591a adGroup = this.f63081g.getAdGroup(i10);
            return adGroup.f63216b != -1 ? adGroup.f63219e[i11] : C.TIME_UNSET;
        }

        public int getAdGroupCount() {
            return this.f63081g.f63209b;
        }

        public int getAdGroupIndexAfterPositionUs(long j10) {
            return this.f63081g.getAdGroupIndexAfterPositionUs(j10, this.f63078d);
        }

        public int getAdGroupIndexForPositionUs(long j10) {
            return this.f63081g.getAdGroupIndexForPositionUs(j10, this.f63078d);
        }

        public long getAdGroupTimeUs(int i10) {
            return this.f63081g.getAdGroup(i10).f63215a;
        }

        public long getAdResumePositionUs() {
            return this.f63081g.f63210c;
        }

        public Object getAdsId() {
            return this.f63081g.f63208a;
        }

        public long getContentResumeOffsetUs(int i10) {
            return this.f63081g.getAdGroup(i10).f63220f;
        }

        public long getDurationMs() {
            return io.odeeo.internal.q0.g0.usToMs(this.f63078d);
        }

        public long getDurationUs() {
            return this.f63078d;
        }

        public int getFirstAdIndexToPlay(int i10) {
            return this.f63081g.getAdGroup(i10).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i10, int i11) {
            return this.f63081g.getAdGroup(i10).getNextAdIndexToPlay(i11);
        }

        public long getPositionInWindowMs() {
            return io.odeeo.internal.q0.g0.usToMs(this.f63079e);
        }

        public long getPositionInWindowUs() {
            return this.f63079e;
        }

        public int getRemovedAdGroupCount() {
            return this.f63081g.f63212e;
        }

        public boolean hasPlayedAdGroup(int i10) {
            return !this.f63081g.getAdGroup(i10).hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.f63075a;
            int iHashCode = ((obj == null ? 0 : obj.hashCode()) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31;
            Object obj2 = this.f63076b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f63077c) * 31;
            long j10 = this.f63078d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f63079e;
            return this.f63081g.hashCode() + ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f63080f ? 1 : 0)) * 31);
        }

        public boolean isServerSideInsertedAdGroup(int i10) {
            return this.f63081g.getAdGroup(i10).f63221g;
        }

        public b set(Object obj, Object obj2, int i10, long j10, long j11) {
            return set(obj, obj2, i10, j10, j11, io.odeeo.internal.b0.a.f63205g, false);
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(a(0), this.f63077c);
            bundle.putLong(a(1), this.f63078d);
            bundle.putLong(a(2), this.f63079e);
            bundle.putBoolean(a(3), this.f63080f);
            bundle.putBundle(a(4), this.f63081g.toBundle());
            return bundle;
        }

        public static b a(Bundle bundle) {
            int i10 = bundle.getInt(a(0), 0);
            long j10 = bundle.getLong(a(1), C.TIME_UNSET);
            long j11 = bundle.getLong(a(2), 0L);
            boolean z10 = bundle.getBoolean(a(3));
            Bundle bundle2 = bundle.getBundle(a(4));
            io.odeeo.internal.b0.a aVar = bundle2 != null ? (io.odeeo.internal.b0.a) io.odeeo.internal.b0.a.f63207i.mo3834fromBundle(bundle2) : io.odeeo.internal.b0.a.f63205g;
            b bVar = new b();
            bVar.set(null, null, i10, j10, j11, aVar, z10);
            return bVar;
        }

        public b set(Object obj, Object obj2, int i10, long j10, long j11, io.odeeo.internal.b0.a aVar, boolean z10) {
            this.f63075a = obj;
            this.f63076b = obj2;
            this.f63077c = i10;
            this.f63078d = j10;
            this.f63079e = j11;
            this.f63081g = aVar;
            this.f63080f = z10;
            return this;
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends y0 {

        /* renamed from: c, reason: collision with root package name */
        public final h1<d> f63082c;

        /* renamed from: d, reason: collision with root package name */
        public final h1<b> f63083d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f63084e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f63085f;

        public c(h1<d> h1Var, h1<b> h1Var2, int[] iArr) {
            io.odeeo.internal.q0.a.checkArgument(h1Var.size() == iArr.length);
            this.f63082c = h1Var;
            this.f63083d = h1Var2;
            this.f63084e = iArr;
            this.f63085f = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f63085f[iArr[i10]] = i10;
            }
        }

        @Override // io.odeeo.internal.b.y0
        public int getFirstWindowIndex(boolean z10) {
            if (isEmpty()) {
                return -1;
            }
            if (z10) {
                return this.f63084e[0];
            }
            return 0;
        }

        @Override // io.odeeo.internal.b.y0
        public int getIndexOfPeriod(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.b.y0
        public int getLastWindowIndex(boolean z10) {
            if (isEmpty()) {
                return -1;
            }
            return z10 ? this.f63084e[getWindowCount() - 1] : getWindowCount() - 1;
        }

        @Override // io.odeeo.internal.b.y0
        public int getNextWindowIndex(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != getLastWindowIndex(z10)) {
                return z10 ? this.f63084e[this.f63085f[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return getFirstWindowIndex(z10);
            }
            return -1;
        }

        @Override // io.odeeo.internal.b.y0
        public b getPeriod(int i10, b bVar, boolean z10) {
            b bVar2 = this.f63083d.get(i10);
            bVar.set(bVar2.f63075a, bVar2.f63076b, bVar2.f63077c, bVar2.f63078d, bVar2.f63079e, bVar2.f63081g, bVar2.f63080f);
            return bVar;
        }

        @Override // io.odeeo.internal.b.y0
        public int getPeriodCount() {
            return this.f63083d.size();
        }

        @Override // io.odeeo.internal.b.y0
        public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != getFirstWindowIndex(z10)) {
                return z10 ? this.f63084e[this.f63085f[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return getLastWindowIndex(z10);
            }
            return -1;
        }

        @Override // io.odeeo.internal.b.y0
        public Object getUidOfPeriod(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.b.y0
        public d getWindow(int i10, d dVar, long j10) {
            d dVar2 = this.f63082c.get(i10);
            dVar.set(dVar2.f63090a, dVar2.f63092c, dVar2.f63093d, dVar2.f63094e, dVar2.f63095f, dVar2.f63096g, dVar2.f63097h, dVar2.f63098i, dVar2.f63100k, dVar2.f63102m, dVar2.f63103n, dVar2.f63104o, dVar2.f63105p, dVar2.f63106q);
            dVar.f63101l = dVar2.f63101l;
            return dVar;
        }

        @Override // io.odeeo.internal.b.y0
        public int getWindowCount() {
            return this.f63082c.size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements g {

        /* renamed from: r, reason: collision with root package name */
        public static final Object f63086r = new Object();

        /* renamed from: s, reason: collision with root package name */
        public static final Object f63087s = new Object();

        /* renamed from: t, reason: collision with root package name */
        public static final z f63088t = new z.c().setMediaId("com.google.android.exoplayer2.Timeline").setUri(Uri.EMPTY).build();

        /* renamed from: u, reason: collision with root package name */
        public static final g.a<d> f63089u = new is.b(11);

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f63091b;

        /* renamed from: d, reason: collision with root package name */
        public Object f63093d;

        /* renamed from: e, reason: collision with root package name */
        public long f63094e;

        /* renamed from: f, reason: collision with root package name */
        public long f63095f;

        /* renamed from: g, reason: collision with root package name */
        public long f63096g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f63097h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f63098i;

        /* renamed from: j, reason: collision with root package name */
        @Deprecated
        public boolean f63099j;

        /* renamed from: k, reason: collision with root package name */
        public z.g f63100k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f63101l;

        /* renamed from: m, reason: collision with root package name */
        public long f63102m;

        /* renamed from: n, reason: collision with root package name */
        public long f63103n;

        /* renamed from: o, reason: collision with root package name */
        public int f63104o;

        /* renamed from: p, reason: collision with root package name */
        public int f63105p;

        /* renamed from: q, reason: collision with root package name */
        public long f63106q;

        /* renamed from: a, reason: collision with root package name */
        public Object f63090a = f63086r;

        /* renamed from: c, reason: collision with root package name */
        public z f63092c = f63088t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (io.odeeo.internal.q0.g0.areEqual(this.f63090a, dVar.f63090a) && io.odeeo.internal.q0.g0.areEqual(this.f63092c, dVar.f63092c) && io.odeeo.internal.q0.g0.areEqual(this.f63093d, dVar.f63093d) && io.odeeo.internal.q0.g0.areEqual(this.f63100k, dVar.f63100k) && this.f63094e == dVar.f63094e && this.f63095f == dVar.f63095f && this.f63096g == dVar.f63096g && this.f63097h == dVar.f63097h && this.f63098i == dVar.f63098i && this.f63101l == dVar.f63101l && this.f63102m == dVar.f63102m && this.f63103n == dVar.f63103n && this.f63104o == dVar.f63104o && this.f63105p == dVar.f63105p && this.f63106q == dVar.f63106q) {
                    return true;
                }
            }
            return false;
        }

        public long getCurrentUnixTimeMs() {
            return io.odeeo.internal.q0.g0.getNowUnixTimeMs(this.f63096g);
        }

        public long getDefaultPositionMs() {
            return io.odeeo.internal.q0.g0.usToMs(this.f63102m);
        }

        public long getDefaultPositionUs() {
            return this.f63102m;
        }

        public long getDurationMs() {
            return io.odeeo.internal.q0.g0.usToMs(this.f63103n);
        }

        public long getDurationUs() {
            return this.f63103n;
        }

        public long getPositionInFirstPeriodMs() {
            return io.odeeo.internal.q0.g0.usToMs(this.f63106q);
        }

        public long getPositionInFirstPeriodUs() {
            return this.f63106q;
        }

        public int hashCode() {
            int iHashCode = (this.f63092c.hashCode() + ((this.f63090a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
            Object obj = this.f63093d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            z.g gVar = this.f63100k;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f63094e;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f63095f;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f63096g;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f63097h ? 1 : 0)) * 31) + (this.f63098i ? 1 : 0)) * 31) + (this.f63101l ? 1 : 0)) * 31;
            long j13 = this.f63102m;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f63103n;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f63104o) * 31) + this.f63105p) * 31;
            long j15 = this.f63106q;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public boolean isLive() {
            io.odeeo.internal.q0.a.checkState(this.f63099j == (this.f63100k != null));
            return this.f63100k != null;
        }

        public d set(Object obj, z zVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, z.g gVar, long j13, long j14, int i10, int i11, long j15) {
            z.h hVar;
            this.f63090a = obj;
            this.f63092c = zVar != null ? zVar : f63088t;
            this.f63091b = (zVar == null || (hVar = zVar.f63110b) == null) ? null : hVar.f63184i;
            this.f63093d = obj2;
            this.f63094e = j10;
            this.f63095f = j11;
            this.f63096g = j12;
            this.f63097h = z10;
            this.f63098i = z11;
            this.f63099j = gVar != null;
            this.f63100k = gVar;
            this.f63102m = j13;
            this.f63103n = j14;
            this.f63104o = i10;
            this.f63105p = i11;
            this.f63106q = j15;
            this.f63101l = false;
            return this;
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            return a(false);
        }

        public final Bundle a(boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putBundle(a(1), (z10 ? z.f63107h : this.f63092c).toBundle());
            bundle.putLong(a(2), this.f63094e);
            bundle.putLong(a(3), this.f63095f);
            bundle.putLong(a(4), this.f63096g);
            bundle.putBoolean(a(5), this.f63097h);
            bundle.putBoolean(a(6), this.f63098i);
            z.g gVar = this.f63100k;
            if (gVar != null) {
                bundle.putBundle(a(7), gVar.toBundle());
            }
            bundle.putBoolean(a(8), this.f63101l);
            bundle.putLong(a(9), this.f63102m);
            bundle.putLong(a(10), this.f63103n);
            bundle.putInt(a(11), this.f63104o);
            bundle.putInt(a(12), this.f63105p);
            bundle.putLong(a(13), this.f63106q);
            return bundle;
        }

        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            z zVar = bundle2 != null ? (z) z.f63108i.mo3834fromBundle(bundle2) : null;
            long j10 = bundle.getLong(a(2), C.TIME_UNSET);
            long j11 = bundle.getLong(a(3), C.TIME_UNSET);
            long j12 = bundle.getLong(a(4), C.TIME_UNSET);
            boolean z10 = bundle.getBoolean(a(5), false);
            boolean z11 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            z.g gVar = bundle3 != null ? (z.g) z.g.f63165g.mo3834fromBundle(bundle3) : null;
            boolean z12 = bundle.getBoolean(a(8), false);
            long j13 = bundle.getLong(a(9), 0L);
            long j14 = bundle.getLong(a(10), C.TIME_UNSET);
            int i10 = bundle.getInt(a(11), 0);
            int i11 = bundle.getInt(a(12), 0);
            long j15 = bundle.getLong(a(13), 0L);
            d dVar = new d();
            dVar.set(f63087s, zVar, null, j10, j11, j12, z10, z11, gVar, j13, j14, i10, i11, j15);
            dVar.f63101l = z12;
            return dVar;
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    public static y0 a(Bundle bundle) {
        h1 h1VarA = a(d.f63089u, io.odeeo.internal.q0.b.getBinder(bundle, b(0)));
        h1 h1VarA2 = a(b.f63074h, io.odeeo.internal.q0.b.getBinder(bundle, b(1)));
        int[] intArray = bundle.getIntArray(b(2));
        if (intArray == null) {
            intArray = a(h1VarA.size());
        }
        return new c(h1VarA, h1VarA2, intArray);
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (y0Var.getWindowCount() != getWindowCount() || y0Var.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < getWindowCount(); i10++) {
            if (!getWindow(i10, dVar).equals(y0Var.getWindow(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < getPeriodCount(); i11++) {
            if (!getPeriod(i11, bVar, true).equals(y0Var.getPeriod(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z10) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z10) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = getPeriod(i10, bVar).f63077c;
        if (getWindow(i12, dVar).f63105p != i10) {
            return i10 + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i12, i11, z10);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, dVar).f63104o;
    }

    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == getLastWindowIndex(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == getLastWindowIndex(z10) ? getFirstWindowIndex(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b getPeriod(int i10, b bVar) {
        return getPeriod(i10, bVar, false);
    }

    public abstract b getPeriod(int i10, b bVar, boolean z10);

    public b getPeriodByUid(Object obj, b bVar) {
        return getPeriod(getIndexOfPeriod(obj), bVar, true);
    }

    public abstract int getPeriodCount();

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(d dVar, b bVar, int i10, long j10) {
        return getPeriodPositionUs(dVar, bVar, i10, j10);
    }

    public final Pair<Object, Long> getPeriodPositionUs(d dVar, b bVar, int i10, long j10) {
        return (Pair) io.odeeo.internal.q0.a.checkNotNull(getPeriodPosition(dVar, bVar, i10, j10, 0L));
    }

    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == getFirstWindowIndex(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == getFirstWindowIndex(z10) ? getLastWindowIndex(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int i10);

    public final d getWindow(int i10, d dVar) {
        return getWindow(i10, dVar, 0L);
    }

    public abstract d getWindow(int i10, d dVar, long j10);

    public abstract int getWindowCount();

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int windowCount = getWindowCount() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i10 = 0; i10 < getWindowCount(); i10++) {
            windowCount = (windowCount * 31) + getWindow(i10, dVar).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i11 = 0; i11 < getPeriodCount(); i11++) {
            periodCount = (periodCount * 31) + getPeriod(i11, bVar, true).hashCode();
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i10, b bVar, d dVar, int i11, boolean z10) {
        return getNextPeriodIndex(i10, bVar, dVar, i11, z10) == -1;
    }

    public final Bundle toBundle(boolean z10) {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        d dVar = new d();
        for (int i10 = 0; i10 < windowCount; i10++) {
            arrayList.add(getWindow(i10, dVar, 0L).a(z10));
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        b bVar = new b();
        for (int i11 = 0; i11 < periodCount; i11++) {
            arrayList2.add(getPeriod(i11, bVar, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i12 = 1; i12 < windowCount; i12++) {
            iArr[i12] = getNextWindowIndex(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        io.odeeo.internal.q0.b.putBinder(bundle, b(0), new f(arrayList));
        io.odeeo.internal.q0.b.putBinder(bundle, b(1), new f(arrayList2));
        bundle.putIntArray(b(2), iArr);
        return bundle;
    }

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(d dVar, b bVar, int i10, long j10, long j11) {
        return getPeriodPositionUs(dVar, bVar, i10, j10, j11);
    }

    public final Pair<Object, Long> getPeriodPositionUs(d dVar, b bVar, int i10, long j10, long j11) {
        io.odeeo.internal.q0.a.checkIndex(i10, 0, getWindowCount());
        getWindow(i10, dVar, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = dVar.getDefaultPositionUs();
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = dVar.f63104o;
        getPeriod(i11, bVar);
        while (i11 < dVar.f63105p && bVar.f63079e != j10) {
            int i12 = i11 + 1;
            if (getPeriod(i12, bVar).f63079e > j10) {
                break;
            }
            i11 = i12;
        }
        getPeriod(i11, bVar, true);
        long jMin = j10 - bVar.f63079e;
        long j12 = bVar.f63078d;
        if (j12 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(io.odeeo.internal.q0.a.checkNotNull(bVar.f63076b), Long.valueOf(Math.max(0L, jMin)));
    }

    public static <T extends g> h1<T> a(g.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return h1.of();
        }
        h1.a aVar2 = new h1.a();
        h1<Bundle> list = f.getList(iBinder);
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVar2.add((h1.a) aVar.mo3834fromBundle(list.get(i10)));
        }
        return aVar2.build();
    }

    public static int[] a(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    @Override // io.odeeo.internal.b.g
    public final Bundle toBundle() {
        return toBundle(false);
    }
}
