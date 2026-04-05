package com.google.android.exoplayer2;

import android.os.Bundle;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m3 implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final j3 f27695b = new j3();

    /* renamed from: c, reason: collision with root package name */
    public static final String f27696c = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f27697e = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(1);

    /* renamed from: f, reason: collision with root package name */
    public static final String f27698f = com.google.android.exoplayer2.util.n1.intToStringMaxRadix(2);

    public boolean equals(Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        if (m3Var.getWindowCount() != getWindowCount() || m3Var.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        l3 l3Var = new l3();
        k3 k3Var = new k3();
        l3 l3Var2 = new l3();
        k3 k3Var2 = new k3();
        for (int i10 = 0; i10 < getWindowCount(); i10++) {
            if (!getWindow(i10, l3Var).equals(m3Var.getWindow(i10, l3Var2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < getPeriodCount(); i11++) {
            if (!getPeriod(i11, k3Var, true).equals(m3Var.getPeriod(i11, k3Var2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != m3Var.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != m3Var.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != m3Var.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
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

    public final int getNextPeriodIndex(int i10, k3 k3Var, l3 l3Var, int i11, boolean z10) {
        int i12 = getPeriod(i10, k3Var).f27598e;
        if (getWindow(i12, l3Var).f27662r != i10) {
            return i10 + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i12, i11, z10);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, l3Var).f27661q;
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

    public final k3 getPeriod(int i10, k3 k3Var) {
        return getPeriod(i10, k3Var, false);
    }

    public abstract k3 getPeriod(int i10, k3 k3Var, boolean z10);

    public k3 getPeriodByUid(Object obj, k3 k3Var) {
        return getPeriod(getIndexOfPeriod(obj), k3Var, true);
    }

    public abstract int getPeriodCount();

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(l3 l3Var, k3 k3Var, int i10, long j10) {
        return getPeriodPositionUs(l3Var, k3Var, i10, j10);
    }

    public final Pair<Object, Long> getPeriodPositionUs(l3 l3Var, k3 k3Var, int i10, long j10) {
        return (Pair) com.google.android.exoplayer2.util.a.checkNotNull(getPeriodPositionUs(l3Var, k3Var, i10, j10, 0L));
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

    public final l3 getWindow(int i10, l3 l3Var) {
        return getWindow(i10, l3Var, 0L);
    }

    public abstract l3 getWindow(int i10, l3 l3Var, long j10);

    public abstract int getWindowCount();

    public int hashCode() {
        l3 l3Var = new l3();
        k3 k3Var = new k3();
        int windowCount = getWindowCount() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i10 = 0; i10 < getWindowCount(); i10++) {
            windowCount = (windowCount * 31) + getWindow(i10, l3Var).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i11 = 0; i11 < getPeriodCount(); i11++) {
            periodCount = (periodCount * 31) + getPeriod(i11, k3Var, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i10, k3 k3Var, l3 l3Var, int i11, boolean z10) {
        return getNextPeriodIndex(i10, k3Var, l3Var, i11, z10) == -1;
    }

    @Override // com.google.android.exoplayer2.i
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        l3 l3Var = new l3();
        for (int i10 = 0; i10 < windowCount; i10++) {
            arrayList.add(getWindow(i10, l3Var, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        k3 k3Var = new k3();
        for (int i11 = 0; i11 < periodCount; i11++) {
            arrayList2.add(getPeriod(i11, k3Var, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i12 = 1; i12 < windowCount; i12++) {
            iArr[i12] = getNextWindowIndex(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        com.google.android.exoplayer2.util.b.putBinder(bundle, f27696c, new g(arrayList));
        com.google.android.exoplayer2.util.b.putBinder(bundle, f27697e, new g(arrayList2));
        bundle.putIntArray(f27698f, iArr);
        return bundle;
    }

    public final Bundle toBundleWithOneWindowOnly(int i10) {
        l3 window = getWindow(i10, new l3(), 0L);
        ArrayList arrayList = new ArrayList();
        k3 k3Var = new k3();
        int i11 = window.f27661q;
        while (true) {
            int i12 = window.f27662r;
            if (i11 > i12) {
                window.f27662r = i12 - window.f27661q;
                window.f27661q = 0;
                Bundle bundle = window.toBundle();
                Bundle bundle2 = new Bundle();
                com.google.android.exoplayer2.util.b.putBinder(bundle2, f27696c, new g(b5.of(bundle)));
                com.google.android.exoplayer2.util.b.putBinder(bundle2, f27697e, new g(arrayList));
                bundle2.putIntArray(f27698f, new int[]{0});
                return bundle2;
            }
            getPeriod(i11, k3Var, false);
            k3Var.f27598e = 0;
            arrayList.add(k3Var.toBundle());
            i11++;
        }
    }

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(l3 l3Var, k3 k3Var, int i10, long j10, long j11) {
        return getPeriodPositionUs(l3Var, k3Var, i10, j10, j11);
    }

    public final Pair<Object, Long> getPeriodPositionUs(l3 l3Var, k3 k3Var, int i10, long j10, long j11) {
        com.google.android.exoplayer2.util.a.checkIndex(i10, 0, getWindowCount());
        getWindow(i10, l3Var, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = l3Var.getDefaultPositionUs();
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = l3Var.f27661q;
        getPeriod(i11, k3Var);
        while (i11 < l3Var.f27662r && k3Var.f27600g != j10) {
            int i12 = i11 + 1;
            if (getPeriod(i12, k3Var).f27600g > j10) {
                break;
            }
            i11 = i12;
        }
        getPeriod(i11, k3Var, true);
        long jMin = j10 - k3Var.f27600g;
        long j12 = k3Var.f27599f;
        if (j12 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(com.google.android.exoplayer2.util.a.checkNotNull(k3Var.f27597c), Long.valueOf(Math.max(0L, jMin)));
    }
}
