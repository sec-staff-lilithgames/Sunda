package nh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k6 extends s4 {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f76416d;

    /* renamed from: e, reason: collision with root package name */
    public int f76417e;

    public k6() {
        super(4);
    }

    @Override // nh.s4, nh.t4
    public /* bridge */ /* synthetic */ t4 addAll(Iterable iterable) {
        return addAll((Iterable<Object>) iterable);
    }

    public k6 d(k6 k6Var) {
        if (this.f76416d == null) {
            b(k6Var.f76621b, k6Var.f76620a);
            return this;
        }
        for (int i10 = 0; i10 < k6Var.f76621b; i10++) {
            Object obj = k6Var.f76620a[i10];
            Objects.requireNonNull(obj);
            add(obj);
        }
        return this;
    }

    @Override // nh.t4
    public /* bridge */ /* synthetic */ t4 addAll(Iterator it) {
        return addAll((Iterator<Object>) it);
    }

    @Override // nh.t4
    public l6 build() {
        l6 l6VarG;
        int i10 = this.f76621b;
        if (i10 == 0) {
            return l6.of();
        }
        if (i10 == 1) {
            Object obj = this.f76620a[0];
            Objects.requireNonNull(obj);
            return l6.of(obj);
        }
        if (this.f76416d == null || l6.f(i10) != this.f76416d.length) {
            l6VarG = l6.g(this.f76621b, this.f76620a);
            this.f76621b = l6VarG.size();
        } else {
            int i11 = this.f76621b;
            Object[] objArrCopyOf = this.f76620a;
            int length = objArrCopyOf.length;
            if (i11 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            l6VarG = new of(objArrCopyOf, this.f76417e, this.f76416d, r6.length - 1, this.f76621b);
        }
        this.f76622c = true;
        this.f76416d = null;
        return l6VarG;
    }

    @Override // nh.s4, nh.t4
    public k6 addAll(Iterable<Object> iterable) {
        mh.p1.checkNotNull(iterable);
        if (this.f76416d != null) {
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
        super.addAll(iterable);
        return this;
    }

    @Override // nh.s4, nh.t4
    public k6 add(Object obj) {
        mh.p1.checkNotNull(obj);
        if (this.f76416d != null) {
            int iF = l6.f(this.f76621b);
            Object[] objArr = this.f76416d;
            if (iF <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.f76416d.length - 1;
                int iHashCode = obj.hashCode();
                int iF2 = kotlin.jvm.internal.d0.F(iHashCode);
                while (true) {
                    int i10 = iF2 & length;
                    Object[] objArr2 = this.f76416d;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.f76417e += iHashCode;
                        super.add(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iF2 = i10 + 1;
                }
            }
        }
        this.f76416d = null;
        super.add(obj);
        return this;
    }

    @Override // nh.t4
    public k6 addAll(Iterator<Object> it) {
        mh.p1.checkNotNull(it);
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }

    @Override // nh.s4, nh.t4
    public k6 add(Object... objArr) {
        if (this.f76416d != null) {
            for (Object obj : objArr) {
                add(obj);
            }
            return this;
        }
        super.add(objArr);
        return this;
    }
}
