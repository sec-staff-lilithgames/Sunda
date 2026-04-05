package io.odeeo.internal.u0;

import io.odeeo.internal.u0.w2;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u2<K, V> extends c1<K, V> {

    /* renamed from: k, reason: collision with root package name */
    public static final u2<Object, Object> f67098k = new u2<>();

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f67099f;

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f67100g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f67101h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f67102i;

    /* renamed from: j, reason: collision with root package name */
    public final transient u2<V, K> f67103j;

    /* JADX WARN: Multi-variable type inference failed */
    public u2() {
        this.f67099f = null;
        this.f67100g = new Object[0];
        this.f67101h = 0;
        this.f67102i = 0;
        this.f67103j = this;
    }

    @Override // io.odeeo.internal.u0.j1
    public q1<Map.Entry<K, V>> a() {
        return new w2.a(this, this.f67100g, this.f67101h, this.f67102i);
    }

    @Override // io.odeeo.internal.u0.j1
    public q1<K> b() {
        return new w2.b(this, new w2.c(this.f67100g, this.f67101h, this.f67102i));
    }

    @Override // io.odeeo.internal.u0.j1
    public boolean e() {
        return false;
    }

    @Override // io.odeeo.internal.u0.j1, java.util.Map
    public V get(Object obj) {
        return (V) w2.a(this.f67099f, this.f67100g, this.f67102i, this.f67101h, obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f67102i;
    }

    @Override // io.odeeo.internal.u0.c1, io.odeeo.internal.u0.n
    public c1<V, K> inverse() {
        return this.f67103j;
    }

    public u2(Object[] objArr, int i10) {
        this.f67100g = objArr;
        this.f67102i = i10;
        this.f67101h = 0;
        int iA = i10 >= 2 ? q1.a(i10) : 0;
        this.f67099f = w2.a(objArr, i10, iA, 0);
        this.f67103j = new u2<>(w2.a(objArr, i10, iA, 1), objArr, i10, this);
    }

    public u2(int[] iArr, Object[] objArr, int i10, u2<V, K> u2Var) {
        this.f67099f = iArr;
        this.f67100g = objArr;
        this.f67101h = 1;
        this.f67102i = i10;
        this.f67103j = u2Var;
    }
}
