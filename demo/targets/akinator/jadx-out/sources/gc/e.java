package gc;

import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;
import ub.f0;
import ub.j;
import ub.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final e f57542a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f57543b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f57544c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57545d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57546e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f57547f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f57548g;

    /* renamed from: h, reason: collision with root package name */
    public c[] f57549h;

    /* renamed from: i, reason: collision with root package name */
    public int f57550i;

    /* renamed from: j, reason: collision with root package name */
    public int f57551j;

    /* renamed from: k, reason: collision with root package name */
    public int f57552k;

    /* renamed from: l, reason: collision with root package name */
    public int f57553l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f57554m;

    /* renamed from: n, reason: collision with root package name */
    public BitSet f57555n;

    public e(f0 f0Var, int i10, int i11) {
        this.f57542a = null;
        this.f57545d = i11;
        this.f57544c = f0Var;
        this.f57547f = true;
        this.f57546e = i10;
        this.f57554m = false;
        this.f57553l = 0;
        this.f57543b = new AtomicReference(d.createInitial(64));
    }

    @Deprecated
    public static e createRoot() {
        return createRoot((m0) null);
    }

    public int _hashToIndex(int i10) {
        int i11 = i10 + (i10 >>> 15);
        int i12 = i11 ^ (i11 << 7);
        return (i12 + (i12 >>> 3)) & this.f57552k;
    }

    public int bucketCount() {
        return this.f57548g.length;
    }

    public int calcHash(char[] cArr, int i10, int i11) {
        int i12 = i11 + i10;
        int i13 = this.f57545d;
        while (i10 < i12) {
            i13 = (i13 * 33) + cArr[i10];
            i10++;
        }
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    public int collisionCount() {
        int i10 = 0;
        for (c cVar : this.f57549h) {
            if (cVar != null) {
                i10 += cVar.f57537c;
            }
        }
        return i10;
    }

    public int hashSeed() {
        return this.f57545d;
    }

    public e makeChild() {
        return new e(this, this.f57544c, this.f57546e, this.f57545d, (d) this.f57543b.get());
    }

    public int maxCollisionLength() {
        return this.f57553l;
    }

    public boolean maybeDirty() {
        return !this.f57554m;
    }

    public void release() {
        e eVar;
        if (maybeDirty() && (eVar = this.f57542a) != null && this.f57547f) {
            d dVar = new d(this);
            eVar.getClass();
            AtomicReference atomicReference = eVar.f57543b;
            d dVar2 = (d) atomicReference.get();
            int i10 = dVar2.f57538a;
            int i11 = dVar.f57538a;
            if (i11 != i10) {
                if (i11 > 12000) {
                    dVar = d.createInitial(64);
                }
                while (!atomicReference.compareAndSet(dVar2, dVar) && atomicReference.get() == dVar2) {
                }
            }
            this.f57554m = true;
        }
    }

    public int size() {
        AtomicReference atomicReference = this.f57543b;
        return atomicReference != null ? ((d) atomicReference.get()).f57538a : this.f57550i;
    }

    @Deprecated
    public static e createRoot(int i10) {
        return createRoot(null, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String findSymbol(char[] r18, int r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.e.findSymbol(char[], int, int, int):java.lang.String");
    }

    public static e createRoot(m0 m0Var) {
        return createRoot(m0Var, 0);
    }

    public int calcHash(String str) {
        int length = str.length();
        int iCharAt = this.f57545d;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt * 33) + str.charAt(i10);
        }
        if (iCharAt == 0) {
            return 1;
        }
        return iCharAt;
    }

    @Deprecated
    public e makeChild(int i10) {
        return makeChild();
    }

    public static e createRoot(m0 m0Var, int i10) {
        int factoryFeatures;
        f0 f0VarDefaults;
        if (i10 == 0) {
            i10 = System.identityHashCode(m0Var);
        }
        if (m0Var == null) {
            f0VarDefaults = f0.defaults();
            factoryFeatures = 0;
        } else {
            f0 f0VarStreamReadConstraints = m0Var.streamReadConstraints();
            factoryFeatures = m0Var.getFactoryFeatures();
            f0VarDefaults = f0VarStreamReadConstraints;
        }
        return new e(f0VarDefaults, factoryFeatures, i10);
    }

    public e(e eVar, f0 f0Var, int i10, int i11, d dVar) {
        this.f57542a = eVar;
        this.f57544c = f0Var;
        this.f57545d = i11;
        this.f57543b = null;
        this.f57546e = i10;
        this.f57547f = j.f88243c.enabledIn(i10);
        String[] strArr = dVar.f57540c;
        this.f57548g = strArr;
        this.f57549h = dVar.f57541d;
        this.f57550i = dVar.f57538a;
        this.f57553l = dVar.f57539b;
        int length = strArr.length;
        this.f57551j = length - (length >> 2);
        this.f57552k = length - 1;
        this.f57554m = true;
    }
}
