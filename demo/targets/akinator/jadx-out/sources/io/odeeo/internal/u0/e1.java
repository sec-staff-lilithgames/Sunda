package io.odeeo.internal.u0;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e1<K, V> extends f<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final K f66726a;

    /* renamed from: b, reason: collision with root package name */
    public final V f66727b;

    public e1(K k10, V v10) {
        this.f66726a = k10;
        this.f66727b = v10;
    }

    @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
    public final K getKey() {
        return this.f66726a;
    }

    @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
    public final V getValue() {
        return this.f66727b;
    }

    @Override // io.odeeo.internal.u0.f, java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
