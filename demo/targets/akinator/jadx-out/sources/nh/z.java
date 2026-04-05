package nh;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z extends h0 implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public transient se f76801e;

    /* renamed from: f, reason: collision with root package name */
    public transient long f76802f;

    @Override // nh.h0, nh.ud
    public final int add(Object obj, int i10) {
        se seVar = this.f76801e;
        if (i10 == 0) {
            return count(obj);
        }
        mh.p1.checkArgument(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iE = seVar.e(obj);
        if (iE == -1) {
            seVar.put(obj, i10);
            this.f76802f += i10;
            return 0;
        }
        int iD = seVar.d(iE);
        long j10 = i10;
        long j11 = iD + j10;
        mh.p1.checkArgument(j11 <= 2147483647L, "too many occurrences: %s", j11);
        mh.p1.checkElementIndex(iE, seVar.f76606c);
        seVar.f76605b[iE] = (int) j11;
        this.f76802f += j10;
        return iD;
    }

    @Override // nh.h0, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f76801e.clear();
        this.f76802f = 0L;
    }

    @Override // nh.h0, nh.ud
    public final int count(Object obj) {
        return this.f76801e.get(obj);
    }

    @Override // nh.h0
    public final int e() {
        return this.f76801e.f76606c;
    }

    @Override // nh.h0
    public final Iterator f() {
        return new x(this, 0);
    }

    @Override // nh.h0
    public final Iterator g() {
        return new x(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, nh.ud, nh.qg, java.util.Set, java.util.NavigableSet
    public final Iterator<Object> iterator() {
        return new ie(this, entrySet().iterator());
    }

    @Override // nh.h0, nh.ud
    public final int remove(Object obj, int i10) {
        se seVar = this.f76801e;
        if (i10 == 0) {
            return count(obj);
        }
        mh.p1.checkArgument(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iE = seVar.e(obj);
        if (iE == -1) {
            return 0;
        }
        int iD = seVar.d(iE);
        if (iD > i10) {
            mh.p1.checkElementIndex(iE, seVar.f76606c);
            seVar.f76605b[iE] = iD - i10;
        } else {
            seVar.k(iE);
            i10 = iD;
        }
        this.f76802f -= i10;
        return iD;
    }

    @Override // nh.h0, nh.ud
    public final int setCount(Object obj, int i10) {
        se seVar = this.f76801e;
        jh.i.o(i10, "count");
        int iRemove = i10 == 0 ? seVar.remove(obj) : seVar.put(obj, i10);
        this.f76802f += i10 - iRemove;
        return iRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public final int size() {
        return rh.w.saturatedCast(this.f76802f);
    }

    @Override // nh.h0, nh.ud
    public final boolean setCount(Object obj, int i10, int i11) {
        jh.i.o(i10, "oldCount");
        jh.i.o(i11, "newCount");
        se seVar = this.f76801e;
        int iE = seVar.e(obj);
        if (iE == -1) {
            if (i10 != 0) {
                return false;
            }
            if (i11 > 0) {
                seVar.put(obj, i11);
                this.f76802f += i11;
            }
            return true;
        }
        if (seVar.d(iE) != i10) {
            return false;
        }
        if (i11 == 0) {
            seVar.k(iE);
            this.f76802f -= i10;
            return true;
        }
        mh.p1.checkElementIndex(iE, seVar.f76606c);
        seVar.f76605b[iE] = i11;
        this.f76802f += i11 - i10;
        return true;
    }
}
