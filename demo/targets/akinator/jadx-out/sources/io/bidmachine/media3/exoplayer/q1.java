package io.bidmachine.media3.exoplayer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q1 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final int f61524h;

    /* renamed from: i, reason: collision with root package name */
    public final int f61525i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f61526j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f61527k;

    /* renamed from: l, reason: collision with root package name */
    public final gn.u1[] f61528l;

    /* renamed from: m, reason: collision with root package name */
    public final Object[] f61529m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f61530n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(gn.u1[] u1VarArr, Object[] objArr, ao.s1 s1Var) {
        super(false, s1Var);
        int i10 = 0;
        int length = u1VarArr.length;
        this.f61528l = u1VarArr;
        this.f61526j = new int[length];
        this.f61527k = new int[length];
        this.f61529m = objArr;
        this.f61530n = new HashMap();
        int length2 = u1VarArr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i11 = 0;
        while (i10 < length2) {
            gn.u1 u1Var = u1VarArr[i10];
            this.f61528l[i11] = u1Var;
            this.f61527k[i11] = windowCount;
            this.f61526j[i11] = periodCount;
            windowCount += u1Var.getWindowCount();
            periodCount += this.f61528l[i11].getPeriodCount();
            this.f61530n.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f61524h = windowCount;
        this.f61525i = periodCount;
    }

    @Override // io.bidmachine.media3.exoplayer.a
    public final int a(Object obj) {
        Integer num = (Integer) this.f61530n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // io.bidmachine.media3.exoplayer.a
    public final int b(int i10) {
        return io.bidmachine.media3.common.util.a1.binarySearchFloor(this.f61526j, i10 + 1, false, false);
    }

    @Override // io.bidmachine.media3.exoplayer.a
    public final int c(int i10) {
        return io.bidmachine.media3.common.util.a1.binarySearchFloor(this.f61527k, i10 + 1, false, false);
    }

    public q1 copyWithPlaceholderTimeline(ao.s1 s1Var) {
        gn.u1[] u1VarArr = this.f61528l;
        gn.u1[] u1VarArr2 = new gn.u1[u1VarArr.length];
        for (int i10 = 0; i10 < u1VarArr.length; i10++) {
            u1VarArr2[i10] = new p1(u1VarArr[i10]);
        }
        return new q1(u1VarArr2, this.f61529m, s1Var);
    }

    @Override // io.bidmachine.media3.exoplayer.a
    public final Object d(int i10) {
        return this.f61529m[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.a
    public final int e(int i10) {
        return this.f61526j[i10];
    }

    @Override // io.bidmachine.media3.exoplayer.a
    public final int f(int i10) {
        return this.f61527k[i10];
    }

    @Override // gn.u1
    public int getPeriodCount() {
        return this.f61525i;
    }

    @Override // gn.u1
    public int getWindowCount() {
        return this.f61524h;
    }

    @Override // io.bidmachine.media3.exoplayer.a
    public final gn.u1 h(int i10) {
        return this.f61528l[i10];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q1(Collection<? extends d1> collection, ao.s1 s1Var) {
        gn.u1[] u1VarArr = new gn.u1[collection.size()];
        Iterator<? extends d1> it = collection.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            u1VarArr[i11] = it.next().getTimeline();
            i11++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends d1> it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i10] = it2.next().getUid();
            i10++;
        }
        this(u1VarArr, objArr, s1Var);
    }
}
