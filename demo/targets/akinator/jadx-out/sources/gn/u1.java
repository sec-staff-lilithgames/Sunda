package gn;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f58195a = new q1();

    /* renamed from: b, reason: collision with root package name */
    public static final String f58196b = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: c, reason: collision with root package name */
    public static final String f58197c = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: d, reason: collision with root package name */
    public static final String f58198d = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    public static u1 fromBundle(Bundle bundle) {
        ao.c cVar = new ao.c(21);
        IBinder binder = bundle.getBinder(f58196b);
        b5 b5VarOf = binder == null ? b5.of() : io.bidmachine.media3.common.util.f.fromBundleList(cVar, k.getList(binder));
        ao.c cVar2 = new ao.c(22);
        IBinder binder2 = bundle.getBinder(f58197c);
        b5 b5VarOf2 = binder2 == null ? b5.of() : io.bidmachine.media3.common.util.f.fromBundleList(cVar2, k.getList(binder2));
        int[] intArray = bundle.getIntArray(f58198d);
        if (intArray == null) {
            int size = b5VarOf.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = i10;
            }
            intArray = iArr;
        }
        return new s1(b5VarOf, b5VarOf2, intArray);
    }

    public final u1 copyWithSingleWindow(int i10) {
        if (getWindowCount() == 1) {
            return this;
        }
        t1 window = getWindow(i10, new t1(), 0L);
        x4 x4VarBuilder = b5.builder();
        int i11 = window.f58188n;
        while (true) {
            int i12 = window.f58189o;
            if (i11 > i12) {
                window.f58189o = i12 - window.f58188n;
                window.f58188n = 0;
                return new s1(b5.of(window), x4VarBuilder.build(), new int[]{0});
            }
            r1 period = getPeriod(i11, new r1(), true);
            period.f58110c = 0;
            x4VarBuilder.add((Object) period);
            i11++;
        }
    }

    public boolean equals(Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (u1Var.getWindowCount() != getWindowCount() || u1Var.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        t1 t1Var = new t1();
        r1 r1Var = new r1();
        t1 t1Var2 = new t1();
        r1 r1Var2 = new r1();
        for (int i10 = 0; i10 < getWindowCount(); i10++) {
            if (!getWindow(i10, t1Var).equals(u1Var.getWindow(i10, t1Var2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < getPeriodCount(); i11++) {
            if (!getPeriod(i11, r1Var, true).equals(u1Var.getPeriod(i11, r1Var2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != u1Var.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != u1Var.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != u1Var.getNextWindowIndex(firstWindowIndex, 0, true)) {
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

    public final int getNextPeriodIndex(int i10, r1 r1Var, t1 t1Var, int i11, boolean z10) {
        int i12 = getPeriod(i10, r1Var).f58110c;
        if (getWindow(i12, t1Var).f58189o != i10) {
            return i10 + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i12, i11, z10);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, t1Var).f58188n;
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

    public final r1 getPeriod(int i10, r1 r1Var) {
        return getPeriod(i10, r1Var, false);
    }

    public abstract r1 getPeriod(int i10, r1 r1Var, boolean z10);

    public r1 getPeriodByUid(Object obj, r1 r1Var) {
        return getPeriod(getIndexOfPeriod(obj), r1Var, true);
    }

    public abstract int getPeriodCount();

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(t1 t1Var, r1 r1Var, int i10, long j10) {
        return getPeriodPositionUs(t1Var, r1Var, i10, j10);
    }

    public final Pair<Object, Long> getPeriodPositionUs(t1 t1Var, r1 r1Var, int i10, long j10) {
        return (Pair) io.bidmachine.media3.common.util.a.checkNotNull(getPeriodPositionUs(t1Var, r1Var, i10, j10, 0L));
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

    public final t1 getWindow(int i10, t1 t1Var) {
        return getWindow(i10, t1Var, 0L);
    }

    public abstract t1 getWindow(int i10, t1 t1Var, long j10);

    public abstract int getWindowCount();

    public int hashCode() {
        t1 t1Var = new t1();
        r1 r1Var = new r1();
        int windowCount = getWindowCount() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i10 = 0; i10 < getWindowCount(); i10++) {
            windowCount = (windowCount * 31) + getWindow(i10, t1Var).hashCode();
        }
        int periodCount = getPeriodCount() + (windowCount * 31);
        for (int i11 = 0; i11 < getPeriodCount(); i11++) {
            periodCount = (periodCount * 31) + getPeriod(i11, r1Var, true).hashCode();
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

    public final boolean isLastPeriod(int i10, r1 r1Var, t1 t1Var, int i11, boolean z10) {
        return getNextPeriodIndex(i10, r1Var, t1Var, i11, z10) == -1;
    }

    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        t1 t1Var = new t1();
        for (int i10 = 0; i10 < windowCount; i10++) {
            arrayList.add(getWindow(i10, t1Var, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        r1 r1Var = new r1();
        for (int i11 = 0; i11 < periodCount; i11++) {
            arrayList2.add(getPeriod(i11, r1Var, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i12 = 1; i12 < windowCount; i12++) {
            iArr[i12] = getNextWindowIndex(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(f58196b, new k(arrayList));
        bundle.putBinder(f58197c, new k(arrayList2));
        bundle.putIntArray(f58198d, iArr);
        return bundle;
    }

    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(t1 t1Var, r1 r1Var, int i10, long j10, long j11) {
        return getPeriodPositionUs(t1Var, r1Var, i10, j10, j11);
    }

    public final Pair<Object, Long> getPeriodPositionUs(t1 t1Var, r1 r1Var, int i10, long j10, long j11) {
        io.bidmachine.media3.common.util.a.checkIndex(i10, 0, getWindowCount());
        getWindow(i10, t1Var, j11);
        if (j10 == C.TIME_UNSET) {
            j10 = t1Var.getDefaultPositionUs();
            if (j10 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = t1Var.f58188n;
        getPeriod(i11, r1Var);
        while (i11 < t1Var.f58189o && r1Var.f58112e != j10) {
            int i12 = i11 + 1;
            if (getPeriod(i12, r1Var).f58112e > j10) {
                break;
            }
            i11 = i12;
        }
        getPeriod(i11, r1Var, true);
        long jMin = j10 - r1Var.f58112e;
        long j12 = r1Var.f58111d;
        if (j12 != C.TIME_UNSET) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(io.bidmachine.media3.common.util.a.checkNotNull(r1Var.f58109b), Long.valueOf(Math.max(0L, jMin)));
    }
}
