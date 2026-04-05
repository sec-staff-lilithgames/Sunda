package io.odeeo.internal.b;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 extends a {

    /* renamed from: f, reason: collision with root package name */
    public final int f62840f;

    /* renamed from: g, reason: collision with root package name */
    public final int f62841g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f62842h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f62843i;

    /* renamed from: j, reason: collision with root package name */
    public final y0[] f62844j;

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f62845k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap<Object, Integer> f62846l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Collection<? extends e0> collection, io.odeeo.internal.a0.f0 f0Var) {
        super(false, f0Var);
        int windowCount = 0;
        int size = collection.size();
        this.f62842h = new int[size];
        this.f62843i = new int[size];
        this.f62844j = new y0[size];
        this.f62845k = new Object[size];
        this.f62846l = new HashMap<>();
        int periodCount = 0;
        int i10 = 0;
        for (e0 e0Var : collection) {
            this.f62844j[i10] = e0Var.getTimeline();
            this.f62843i[i10] = windowCount;
            this.f62842h[i10] = periodCount;
            windowCount += this.f62844j[i10].getWindowCount();
            periodCount += this.f62844j[i10].getPeriodCount();
            this.f62845k[i10] = e0Var.getUid();
            this.f62846l.put(this.f62845k[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f62840f = windowCount;
        this.f62841g = periodCount;
    }

    public List<y0> a() {
        return Arrays.asList(this.f62844j);
    }

    @Override // io.odeeo.internal.b.a
    public int c(int i10) {
        return io.odeeo.internal.q0.g0.binarySearchFloor(this.f62842h, i10 + 1, false, false);
    }

    @Override // io.odeeo.internal.b.a
    public int d(int i10) {
        return io.odeeo.internal.q0.g0.binarySearchFloor(this.f62843i, i10 + 1, false, false);
    }

    @Override // io.odeeo.internal.b.a
    public Object e(int i10) {
        return this.f62845k[i10];
    }

    @Override // io.odeeo.internal.b.a
    public int f(int i10) {
        return this.f62842h[i10];
    }

    @Override // io.odeeo.internal.b.a
    public int g(int i10) {
        return this.f62843i[i10];
    }

    @Override // io.odeeo.internal.b.y0
    public int getPeriodCount() {
        return this.f62841g;
    }

    @Override // io.odeeo.internal.b.y0
    public int getWindowCount() {
        return this.f62840f;
    }

    @Override // io.odeeo.internal.b.a
    public y0 h(int i10) {
        return this.f62844j[i10];
    }

    @Override // io.odeeo.internal.b.a
    public int a(Object obj) {
        Integer num = this.f62846l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
