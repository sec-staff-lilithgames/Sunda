package nh;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s4 extends t4 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f76620a;

    /* renamed from: b, reason: collision with root package name */
    public int f76621b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76622c;

    public s4(int i10) {
        jh.i.o(i10, "initialCapacity");
        this.f76620a = new Object[i10];
        this.f76621b = 0;
    }

    @Override // nh.t4
    public t4 addAll(Iterable<Object> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            c(collection.size());
            if (collection instanceof u4) {
                this.f76621b = ((u4) collection).a(this.f76621b, this.f76620a);
                return this;
            }
        }
        super.addAll(iterable);
        return this;
    }

    public final void b(int i10, Object[] objArr) {
        pe.a(i10, objArr);
        c(i10);
        System.arraycopy(objArr, 0, this.f76620a, this.f76621b, i10);
        this.f76621b += i10;
    }

    public final void c(int i10) {
        Object[] objArr = this.f76620a;
        int iA = t4.a(objArr.length, this.f76621b + i10);
        if (iA > objArr.length || this.f76622c) {
            this.f76620a = Arrays.copyOf(this.f76620a, iA);
            this.f76622c = false;
        }
    }

    @Override // nh.t4
    public s4 add(Object obj) {
        mh.p1.checkNotNull(obj);
        c(1);
        Object[] objArr = this.f76620a;
        int i10 = this.f76621b;
        this.f76621b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    @Override // nh.t4
    public t4 add(Object... objArr) {
        b(objArr.length, objArr);
        return this;
    }
}
