package com.google.android.exoplayer2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w2 extends a {

    /* renamed from: j, reason: collision with root package name */
    public final int f28687j;

    /* renamed from: k, reason: collision with root package name */
    public final int f28688k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f28689l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f28690m;

    /* renamed from: n, reason: collision with root package name */
    public final m3[] f28691n;

    /* renamed from: o, reason: collision with root package name */
    public final Object[] f28692o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f28693p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(m3[] m3VarArr, Object[] objArr, bf.f1 f1Var) {
        super(false, f1Var);
        int i10 = 0;
        int length = m3VarArr.length;
        this.f28691n = m3VarArr;
        this.f28689l = new int[length];
        this.f28690m = new int[length];
        this.f28692o = objArr;
        this.f28693p = new HashMap();
        int length2 = m3VarArr.length;
        int windowCount = 0;
        int periodCount = 0;
        int i11 = 0;
        while (i10 < length2) {
            m3 m3Var = m3VarArr[i10];
            this.f28691n[i11] = m3Var;
            this.f28690m[i11] = windowCount;
            this.f28689l[i11] = periodCount;
            windowCount += m3Var.getWindowCount();
            periodCount += this.f28691n[i11].getPeriodCount();
            this.f28693p.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.f28687j = windowCount;
        this.f28688k = periodCount;
    }

    @Override // com.google.android.exoplayer2.a
    public final int a(Object obj) {
        Integer num = (Integer) this.f28693p.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.a
    public final int b(int i10) {
        return com.google.android.exoplayer2.util.n1.binarySearchFloor(this.f28689l, i10 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.a
    public final int c(int i10) {
        return com.google.android.exoplayer2.util.n1.binarySearchFloor(this.f28690m, i10 + 1, false, false);
    }

    public w2 copyWithPlaceholderTimeline(bf.f1 f1Var) {
        m3[] m3VarArr = this.f28691n;
        m3[] m3VarArr2 = new m3[m3VarArr.length];
        for (int i10 = 0; i10 < m3VarArr.length; i10++) {
            m3VarArr2[i10] = new v2(m3VarArr[i10]);
        }
        return new w2(m3VarArr2, this.f28692o, f1Var);
    }

    @Override // com.google.android.exoplayer2.a
    public final Object d(int i10) {
        return this.f28692o[i10];
    }

    @Override // com.google.android.exoplayer2.a
    public final int e(int i10) {
        return this.f28689l[i10];
    }

    @Override // com.google.android.exoplayer2.a
    public final int f(int i10) {
        return this.f28690m[i10];
    }

    @Override // com.google.android.exoplayer2.m3
    public int getPeriodCount() {
        return this.f28688k;
    }

    @Override // com.google.android.exoplayer2.m3
    public int getWindowCount() {
        return this.f28687j;
    }

    @Override // com.google.android.exoplayer2.a
    public final m3 h(int i10) {
        return this.f28691n[i10];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w2(Collection<? extends a2> collection, bf.f1 f1Var) {
        m3[] m3VarArr = new m3[collection.size()];
        Iterator<? extends a2> it = collection.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            m3VarArr[i11] = it.next().getTimeline();
            i11++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends a2> it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i10] = it2.next().getUid();
            i10++;
        }
        this(m3VarArr, objArr, f1Var);
    }
}
