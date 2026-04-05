package nh;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j4 extends e4 implements ud {
    @Override // nh.ud
    public int add(Object obj, int i10) {
        return delegate().add(obj, i10);
    }

    @Override // nh.ud
    public int count(Object obj) {
        return delegate().count(obj);
    }

    @Override // nh.e4, nh.l4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract ud delegate();

    public Set<Object> elementSet() {
        return delegate().elementSet();
    }

    @Override // nh.ud
    public Set<td> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Collection, nh.ud
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, nh.ud
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // nh.ud
    public int remove(Object obj, int i10) {
        return delegate().remove(obj, i10);
    }

    @Override // nh.ud
    public int setCount(Object obj, int i10) {
        return delegate().setCount(obj, i10);
    }

    @Override // nh.ud
    public boolean setCount(Object obj, int i10, int i11) {
        return delegate().setCount(obj, i10, i11);
    }
}
