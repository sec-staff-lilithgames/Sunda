package nh;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class fa extends AbstractMap implements ConcurrentMap, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final t8 f76258l = new t8();

    /* renamed from: b, reason: collision with root package name */
    public final transient int f76259b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f76260c;

    /* renamed from: e, reason: collision with root package name */
    public final transient e9[] f76261e;

    /* renamed from: f, reason: collision with root package name */
    public final int f76262f;

    /* renamed from: g, reason: collision with root package name */
    public final mh.u0 f76263g;

    /* renamed from: h, reason: collision with root package name */
    public final transient b9 f76264h;

    /* renamed from: i, reason: collision with root package name */
    public transient d9 f76265i;

    /* renamed from: j, reason: collision with root package name */
    public transient s9 f76266j;

    /* renamed from: k, reason: collision with root package name */
    public transient y8 f76267k;

    public fa(s8 s8Var, b9 b9Var) {
        int i10 = s8Var.f76635c;
        this.f76262f = Math.min(i10 == -1 ? 4 : i10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.f76263g = (mh.u0) mh.g1.firstNonNull(null, ((h9) mh.g1.firstNonNull(s8Var.f76636d, h9.f76324b)).a());
        this.f76264h = b9Var;
        int i11 = s8Var.f76634b;
        int iMin = Math.min(i11 == -1 ? 16 : i11, 1073741824);
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        int i15 = 1;
        while (i15 < this.f76262f) {
            i14++;
            i15 <<= 1;
        }
        this.f76260c = 32 - i14;
        this.f76259b = i15 - 1;
        this.f76261e = new e9[i15];
        int i16 = iMin / i15;
        while (i13 < (i15 * i16 < iMin ? i16 + 1 : i16)) {
            i13 <<= 1;
        }
        while (true) {
            e9[] e9VarArr = this.f76261e;
            if (i12 >= e9VarArr.length) {
                return;
            }
            e9VarArr[i12] = this.f76264h.newSegment(this, i13);
            i12++;
        }
    }

    public final int a(Object obj) {
        int iHash = this.f76263g.hash(obj);
        int i10 = iHash + ((iHash << 15) ^ (-12931));
        int i11 = i10 ^ (i10 >>> 10);
        int i12 = i11 + (i11 << 3);
        int i13 = i12 ^ (i12 >>> 6);
        int i14 = (i13 << 2) + (i13 << 14) + i13;
        return (i14 >>> 16) ^ i14;
    }

    public final e9 b(int i10) {
        return this.f76261e[(i10 >>> this.f76260c) & this.f76259b];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (e9 e9Var : this.f76261e) {
            if (e9Var.f76215c != 0) {
                e9Var.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = e9Var.f76218g;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    e9Var.e();
                    e9Var.f76219h.set(0);
                    e9Var.f76216e++;
                    e9Var.f76215c = 0;
                    e9Var.unlock();
                } catch (Throwable th2) {
                    e9Var.unlock();
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        e9 e9VarB = b(iA);
        e9VarB.getClass();
        try {
            if (e9VarB.f76215c == 0) {
                return false;
            }
            a9 a9VarD = e9VarB.d(iA, obj);
            if (a9VarD != null) {
                if (a9VarD.getValue() != null) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            e9VarB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Object value;
        if (obj != null) {
            e9[] e9VarArr = this.f76261e;
            long j10 = -1;
            int i10 = 0;
            while (i10 < 3) {
                int length = e9VarArr.length;
                long j11 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    e9 e9Var = e9VarArr[i11];
                    int i12 = e9Var.f76215c;
                    AtomicReferenceArray atomicReferenceArray = e9Var.f76218g;
                    for (int i13 = 0; i13 < atomicReferenceArray.length(); i13++) {
                        for (a9 next = (a9) atomicReferenceArray.get(i13); next != null; next = next.getNext()) {
                            if (next.getKey() == null || (value = next.getValue()) == null) {
                                e9Var.m();
                                value = null;
                            }
                            if (value != null && this.f76264h.valueStrength().a().equivalent(obj, value)) {
                                return true;
                            }
                        }
                    }
                    j11 += e9Var.f76216e;
                }
                if (j11 == j10) {
                    return false;
                }
                i10++;
                j10 = j11;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        y8 y8Var = this.f76267k;
        if (y8Var != null) {
            return y8Var;
        }
        y8 y8Var2 = new y8(this);
        this.f76267k = y8Var2;
        return y8Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        e9 e9VarB = b(iA);
        e9VarB.getClass();
        try {
            a9 a9VarD = e9VarB.d(iA, obj);
            if (a9VarD == null) {
                return null;
            }
            Object value = a9VarD.getValue();
            if (value == null) {
                e9VarB.m();
            }
            return value;
        } finally {
            e9VarB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        e9[] e9VarArr = this.f76261e;
        long j10 = 0;
        for (int i10 = 0; i10 < e9VarArr.length; i10++) {
            if (e9VarArr[i10].f76215c != 0) {
                return false;
            }
            j10 += e9VarArr[i10].f76216e;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < e9VarArr.length; i11++) {
            if (e9VarArr[i11].f76215c != 0) {
                return false;
            }
            j10 -= e9VarArr[i11].f76216e;
        }
        return j10 == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        d9 d9Var = this.f76265i;
        if (d9Var != null) {
            return d9Var;
        }
        d9 d9Var2 = new d9(this);
        this.f76265i = d9Var2;
        return d9Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        mh.p1.checkNotNull(obj);
        mh.p1.checkNotNull(obj2);
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object putIfAbsent(Object obj, Object obj2) {
        mh.p1.checkNotNull(obj);
        mh.p1.checkNotNull(obj2);
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        e9 e9VarB = b(iA);
        e9VarB.lock();
        try {
            e9VarB.j();
            AtomicReferenceArray atomicReferenceArray = e9VarB.f76218g;
            int length = (atomicReferenceArray.length() - 1) & iA;
            a9 a9Var = (a9) atomicReferenceArray.get(length);
            for (a9 next = a9Var; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iA && key != null && e9VarB.f76214b.f76263g.equivalent(obj, key)) {
                    Object value = next.getValue();
                    if (value == null && next.getValue() != null) {
                        return null;
                    }
                    e9VarB.f76216e++;
                    a9 a9VarI = e9VarB.i(a9Var, next);
                    int i10 = e9VarB.f76215c - 1;
                    atomicReferenceArray.set(length, a9VarI);
                    e9VarB.f76215c = i10;
                    return value;
                }
            }
            return null;
        } finally {
            e9VarB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(Object obj, Object obj2, Object obj3) {
        mh.p1.checkNotNull(obj);
        mh.p1.checkNotNull(obj3);
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        e9 e9VarB = b(iA);
        e9VarB.lock();
        try {
            e9VarB.j();
            AtomicReferenceArray atomicReferenceArray = e9VarB.f76218g;
            int length = (atomicReferenceArray.length() - 1) & iA;
            a9 a9Var = (a9) atomicReferenceArray.get(length);
            for (a9 next = a9Var; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iA && key != null && e9VarB.f76214b.f76263g.equivalent(obj, key)) {
                    Object value = next.getValue();
                    if (value != null) {
                        if (!e9VarB.f76214b.f76264h.valueStrength().a().equivalent(obj2, value)) {
                            return false;
                        }
                        e9VarB.f76216e++;
                        e9VarB.l(next, obj3);
                        return true;
                    }
                    if (next.getValue() == null) {
                        e9VarB.f76216e++;
                        a9 a9VarI = e9VarB.i(a9Var, next);
                        int i10 = e9VarB.f76215c - 1;
                        atomicReferenceArray.set(length, a9VarI);
                        e9VarB.f76215c = i10;
                    }
                    return false;
                }
            }
            return false;
        } finally {
            e9VarB.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f76261e.length; i10++) {
            j10 += r0[i10].f76215c;
        }
        return rh.w.saturatedCast(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        s9 s9Var = this.f76266j;
        if (s9Var != null) {
            return s9Var;
        }
        s9 s9Var2 = new s9(this);
        this.f76266j = s9Var2;
        return s9Var2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        boolean z10 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        e9 e9VarB = b(iA);
        e9VarB.lock();
        try {
            e9VarB.j();
            AtomicReferenceArray atomicReferenceArray = e9VarB.f76218g;
            int length = (atomicReferenceArray.length() - 1) & iA;
            a9 a9Var = (a9) atomicReferenceArray.get(length);
            for (a9 next = a9Var; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iA && key != null && e9VarB.f76214b.f76263g.equivalent(obj, key)) {
                    if (e9VarB.f76214b.f76264h.valueStrength().a().equivalent(obj2, next.getValue())) {
                        z10 = true;
                    } else if (next.getValue() != null) {
                        return false;
                    }
                    e9VarB.f76216e++;
                    a9 a9VarI = e9VarB.i(a9Var, next);
                    int i10 = e9VarB.f76215c - 1;
                    atomicReferenceArray.set(length, a9VarI);
                    e9VarB.f76215c = i10;
                    return z10;
                }
            }
            return false;
        } finally {
            e9VarB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public Object replace(Object obj, Object obj2) {
        mh.p1.checkNotNull(obj);
        mh.p1.checkNotNull(obj2);
        int iA = a(obj);
        e9 e9VarB = b(iA);
        e9VarB.lock();
        try {
            e9VarB.j();
            AtomicReferenceArray atomicReferenceArray = e9VarB.f76218g;
            int length = (atomicReferenceArray.length() - 1) & iA;
            a9 a9Var = (a9) atomicReferenceArray.get(length);
            for (a9 next = a9Var; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iA && key != null && e9VarB.f76214b.f76263g.equivalent(obj, key)) {
                    Object value = next.getValue();
                    if (value == null) {
                        if (next.getValue() == null) {
                            e9VarB.f76216e++;
                            a9 a9VarI = e9VarB.i(a9Var, next);
                            int i10 = e9VarB.f76215c - 1;
                            atomicReferenceArray.set(length, a9VarI);
                            e9VarB.f76215c = i10;
                        }
                        return null;
                    }
                    e9VarB.f76216e++;
                    e9VarB.l(next, obj2);
                    return value;
                }
            }
            return null;
        } finally {
            e9VarB.unlock();
        }
    }
}
