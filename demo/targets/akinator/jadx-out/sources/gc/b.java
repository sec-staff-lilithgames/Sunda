package gc;

import ic.i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import ub.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final b f57520a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f57521b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57522c;

    /* renamed from: d, reason: collision with root package name */
    public final i f57523d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f57524e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f57525f;

    /* renamed from: g, reason: collision with root package name */
    public int f57526g;

    /* renamed from: h, reason: collision with root package name */
    public int f57527h;

    /* renamed from: i, reason: collision with root package name */
    public int f57528i;

    /* renamed from: j, reason: collision with root package name */
    public int f57529j;

    /* renamed from: k, reason: collision with root package name */
    public int f57530k;

    /* renamed from: l, reason: collision with root package name */
    public String[] f57531l;

    /* renamed from: m, reason: collision with root package name */
    public int f57532m;

    /* renamed from: n, reason: collision with root package name */
    public int f57533n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f57534o;

    public b(int i10) {
        this.f57520a = null;
        this.f57530k = 0;
        this.f57534o = true;
        this.f57522c = i10;
        this.f57523d = null;
        this.f57524e = true;
        this.f57521b = new AtomicReference(a.createInitial(64));
    }

    public static b createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return new b((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public final int a(int i10) {
        return (i10 & (this.f57526g - 1)) << 2;
    }

    public String addName(String str, int i10) throws xb.b {
        f();
        i iVar = this.f57523d;
        if (iVar != null) {
            str = iVar.intern(str);
        }
        int iB = b(calcHash(i10));
        int[] iArr = this.f57525f;
        iArr[iB] = i10;
        iArr[iB + 3] = 1;
        this.f57531l[iB >> 2] = str;
        this.f57530k++;
        return str;
    }

    public final int b(int i10) throws xb.b {
        int iA = a(i10);
        int[] iArr = this.f57525f;
        if (iArr[iA + 3] == 0) {
            return iA;
        }
        if (this.f57530k > (this.f57526g >> 1)) {
            int iD = (this.f57532m - d()) >> 2;
            int i11 = this.f57530k;
            if (iD > ((i11 + 1) >> 7) || i11 > ((int) ((this.f57526g * 3435973837L) >>> 32))) {
                return c(i10);
            }
        }
        int i12 = this.f57527h + ((iA >> 3) << 2);
        if (iArr[i12 + 3] == 0) {
            return i12;
        }
        int i13 = this.f57528i;
        int i14 = this.f57529j;
        int i15 = i13 + ((iA >> (i14 + 2)) << i14);
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            if (iArr[i15 + 3] == 0) {
                return i15;
            }
            i15 += 4;
        }
        int i17 = this.f57532m;
        int i18 = i17 + 4;
        this.f57532m = i18;
        int i19 = this.f57526g;
        if (i18 < (i19 << 3)) {
            return i17;
        }
        if (!this.f57524e || i19 <= 1024) {
            return c(i10);
        }
        StringBuilder sb2 = new StringBuilder("Spill-over slots in symbol table with ");
        sb2.append(this.f57530k);
        sb2.append(" entries, hash area of ");
        sb2.append(this.f57526g);
        sb2.append(" slots is now full (all ");
        throw new xb.b(a.b.f(this.f57526g >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`", sb2));
    }

    public int bucketCount() {
        return this.f57526g;
    }

    public final int c(int i10) throws xb.b {
        this.f57534o = false;
        int[] iArr = this.f57525f;
        String[] strArr = this.f57531l;
        int i11 = this.f57526g;
        int i12 = this.f57530k;
        int i13 = i11 + i11;
        int i14 = this.f57532m;
        if (i13 > 65536) {
            g(true);
        } else {
            this.f57525f = new int[iArr.length + (i11 << 3)];
            this.f57526g = i13;
            int i15 = i13 << 2;
            this.f57527h = i15;
            this.f57528i = i15 + (i15 >> 1);
            int i16 = i13 >> 2;
            this.f57529j = i16 < 64 ? 4 : i16 <= 256 ? 5 : i16 <= 1024 ? 6 : 7;
            this.f57531l = new String[strArr.length << 1];
            g(false);
            int[] iArr2 = new int[16];
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18 += 4) {
                int i19 = iArr[i18 + 3];
                if (i19 != 0) {
                    i17++;
                    String str = strArr[i18 >> 2];
                    if (i19 == 1) {
                        iArr2[0] = iArr[i18];
                        addName(str, iArr2, 1);
                    } else if (i19 == 2) {
                        iArr2[0] = iArr[i18];
                        iArr2[1] = iArr[i18 + 1];
                        addName(str, iArr2, 2);
                    } else if (i19 != 3) {
                        if (i19 > iArr2.length) {
                            iArr2 = new int[i19];
                        }
                        System.arraycopy(iArr, iArr[i18 + 1], iArr2, 0, i19);
                        addName(str, iArr2, i19);
                    } else {
                        iArr2[0] = iArr[i18];
                        iArr2[1] = iArr[i18 + 1];
                        iArr2[2] = iArr[i18 + 2];
                        addName(str, iArr2, 3);
                    }
                }
            }
            if (i17 != i12) {
                throw new IllegalStateException(w0.i.a(i12, i17, "Internal error: Failed rehash(), old count=", ", copyCount="));
            }
        }
        int iA = a(i10);
        int[] iArr3 = this.f57525f;
        if (iArr3[iA + 3] == 0) {
            return iA;
        }
        int i20 = this.f57527h + ((iA >> 3) << 2);
        if (iArr3[i20 + 3] == 0) {
            return i20;
        }
        int i21 = this.f57528i;
        int i22 = this.f57529j;
        int i23 = i21 + ((iA >> (i22 + 2)) << i22);
        int i24 = (1 << i22) + i23;
        while (i23 < i24) {
            if (iArr3[i23 + 3] == 0) {
                return i23;
            }
            i23 += 4;
        }
        int i25 = this.f57532m;
        this.f57532m = i25 + 4;
        return i25;
    }

    public int calcHash(int i10) {
        int i11 = i10 ^ this.f57522c;
        int i12 = i11 + (i11 >>> 16);
        int i13 = i12 ^ (i12 << 3);
        return i13 + (i13 >>> 12);
    }

    public final int d() {
        int i10 = this.f57526g;
        return (i10 << 3) - i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r8, int r9, int[] r10) {
        /*
            r7 = this;
            int[] r0 = r7.f57525f
            r1 = 1
            r2 = 0
            switch(r8) {
                case 4: goto L51;
                case 5: goto L43;
                case 6: goto L35;
                case 7: goto L27;
                case 8: goto L1b;
                default: goto L7;
            }
        L7:
            r0 = r2
        L8:
            int r3 = r0 + 1
            r0 = r10[r0]
            int[] r4 = r7.f57525f
            int r5 = r9 + 1
            r9 = r4[r9]
            if (r0 == r9) goto L15
            return r2
        L15:
            if (r3 < r8) goto L18
            return r1
        L18:
            r0 = r3
            r9 = r5
            goto L8
        L1b:
            r8 = r10[r2]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L24
            return r2
        L24:
            r8 = r1
            r9 = r3
            goto L28
        L27:
            r8 = r2
        L28:
            int r3 = r8 + 1
            r8 = r10[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L33
            return r2
        L33:
            r9 = r4
            goto L36
        L35:
            r3 = r2
        L36:
            int r8 = r3 + 1
            r3 = r10[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L41
            return r2
        L41:
            r9 = r4
            goto L44
        L43:
            r8 = r2
        L44:
            int r3 = r8 + 1
            r8 = r10[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L4f
            return r2
        L4f:
            r9 = r4
            goto L52
        L51:
            r3 = r2
        L52:
            int r8 = r3 + 1
            r4 = r10[r3]
            int r5 = r9 + 1
            r6 = r0[r9]
            if (r4 == r6) goto L5d
            return r2
        L5d:
            int r4 = r3 + 2
            r8 = r10[r8]
            int r6 = r9 + 2
            r5 = r0[r5]
            if (r8 == r5) goto L68
            return r2
        L68:
            int r3 = r3 + 3
            r8 = r10[r4]
            int r9 = r9 + 3
            r4 = r0[r6]
            if (r8 == r4) goto L73
            return r2
        L73:
            r8 = r10[r3]
            r9 = r0[r9]
            if (r8 == r9) goto L7a
            return r2
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.b.e(int, int, int[]):boolean");
    }

    public final void f() {
        if (this.f57534o) {
            if (this.f57520a == null) {
                if (this.f57530k != 0) {
                    throw new IllegalStateException("Internal error: Cannot add names to Placeholder symbol table");
                }
                throw new IllegalStateException("Internal error: Cannot add names to Root symbol table");
            }
            int[] iArr = this.f57525f;
            this.f57525f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f57531l;
            this.f57531l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f57534o = false;
        }
    }

    public String findName(int i10) {
        int iA = a(calcHash(i10));
        int[] iArr = this.f57525f;
        int i11 = iArr[iA + 3];
        if (i11 == 1) {
            if (iArr[iA] == i10) {
                return this.f57531l[iA >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this.f57527h + ((iA >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 1) {
            if (iArr[i12] == i10) {
                return this.f57531l[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f57528i;
        int i15 = this.f57529j;
        int i16 = i14 + ((iA >> (i15 + 2)) << i15);
        int i17 = (1 << i15) + i16;
        while (true) {
            if (i16 < i17) {
                int i18 = iArr[i16 + 3];
                if (i10 == iArr[i16] && 1 == i18) {
                    return this.f57531l[i16 >> 2];
                }
                if (i18 == 0) {
                    break;
                }
                i16 += 4;
            } else {
                for (int iD = d(); iD < this.f57532m; iD += 4) {
                    if (i10 == iArr[iD] && 1 == iArr[iD + 3]) {
                        return this.f57531l[iD >> 2];
                    }
                }
            }
        }
        return null;
    }

    public final void g(boolean z10) {
        this.f57530k = 0;
        this.f57532m = d();
        this.f57533n = this.f57526g << 3;
        if (z10) {
            Arrays.fill(this.f57525f, 0);
            Arrays.fill(this.f57531l, (Object) null);
        }
    }

    public int hashSeed() {
        return this.f57522c;
    }

    public boolean isCanonicalizing() {
        return this.f57520a != null;
    }

    public b makeChild(int i10) {
        return new b(this, this.f57522c, (a) this.f57521b.get(), j.f88242b.enabledIn(i10), j.f88244e.enabledIn(i10));
    }

    public b makeChildOrPlaceholder(int i10) {
        boolean zEnabledIn = j.f88243c.enabledIn(i10);
        AtomicReference atomicReference = this.f57521b;
        if (!zEnabledIn) {
            return new b((a) atomicReference.get());
        }
        return new b(this, this.f57522c, (a) atomicReference.get(), j.f88242b.enabledIn(i10), j.f88244e.enabledIn(i10));
    }

    public boolean maybeDirty() {
        return !this.f57534o;
    }

    public int primaryCount() {
        int i10 = this.f57527h;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f57525f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public void release() {
        b bVar = this.f57520a;
        if (bVar == null || !maybeDirty()) {
            return;
        }
        a aVar = new a(this);
        bVar.getClass();
        AtomicReference atomicReference = bVar.f57521b;
        a aVar2 = (a) atomicReference.get();
        int i10 = aVar2.f57514b;
        int i11 = aVar.f57514b;
        if (i11 != i10) {
            if (i11 > 6000) {
                aVar = a.createInitial(64);
            }
            while (!atomicReference.compareAndSet(aVar2, aVar) && atomicReference.get() == aVar2) {
            }
        }
        this.f57534o = true;
    }

    public int secondaryCount() {
        int i10 = this.f57528i;
        int i11 = 0;
        for (int i12 = this.f57527h + 3; i12 < i10; i12 += 4) {
            if (this.f57525f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int size() {
        AtomicReference atomicReference = this.f57521b;
        return atomicReference != null ? ((a) atomicReference.get()).f57514b : this.f57530k;
    }

    public int spilloverCount() {
        return (this.f57532m - d()) >> 2;
    }

    public int tertiaryCount() {
        int i10 = this.f57528i + 3;
        int i11 = this.f57526g + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this.f57525f[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public String toString() {
        int iPrimaryCount = primaryCount();
        int iSecondaryCount = secondaryCount();
        int iTertiaryCount = tertiaryCount();
        int iSpilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", b.class.getName(), Integer.valueOf(this.f57530k), Integer.valueOf(this.f57526g), Integer.valueOf(iPrimaryCount), Integer.valueOf(iSecondaryCount), Integer.valueOf(iTertiaryCount), Integer.valueOf(iSpilloverCount), Integer.valueOf(iPrimaryCount + iSecondaryCount + iTertiaryCount + iSpilloverCount), Integer.valueOf(totalCount()));
    }

    public int totalCount() {
        int i10 = this.f57526g << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f57525f[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int calcHash(int i10, int i11) {
        int i12 = i10 + (i10 >>> 15);
        int i13 = this.f57522c ^ ((i11 * 33) + (i12 ^ (i12 >>> 9)));
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 >>> 4);
        return i15 + (i15 << 3);
    }

    public int calcHash(int i10, int i11, int i12) {
        int i13 = i10 ^ this.f57522c;
        int iD = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(i13, i13 >>> 9, 31, i11, 33);
        int i14 = (iD + (iD >>> 15)) ^ i12;
        int i15 = i14 + (i14 >>> 4);
        int i16 = i15 + (i15 >>> 15);
        return i16 ^ (i16 << 9);
    }

    public int calcHash(int[] iArr, int i10) {
        if (i10 >= 4) {
            int i11 = iArr[0] ^ this.f57522c;
            int i12 = i11 + (i11 >>> 9) + iArr[1];
            int i13 = ((i12 + (i12 >>> 15)) * 33) ^ iArr[2];
            int i14 = i13 + (i13 >>> 4);
            for (int i15 = 3; i15 < i10; i15++) {
                int i16 = iArr[i15];
                i14 += i16 ^ (i16 >> 21);
            }
            int i17 = i14 * 65599;
            int i18 = i17 + (i17 >>> 19);
            return (i18 << 5) ^ i18;
        }
        throw new IllegalArgumentException("qlen is too short, needs to be at least 4");
    }

    public b(b bVar, int i10, a aVar, boolean z10, boolean z11) {
        this.f57520a = bVar;
        this.f57522c = i10;
        this.f57523d = z10 ? i.f59487c : null;
        this.f57524e = z11;
        this.f57521b = null;
        this.f57530k = aVar.f57514b;
        int i11 = aVar.f57513a;
        this.f57526g = i11;
        int i12 = i11 << 2;
        this.f57527h = i12;
        this.f57528i = i12 + (i12 >> 1);
        this.f57529j = aVar.f57515c;
        this.f57525f = aVar.f57516d;
        this.f57531l = aVar.f57517e;
        this.f57532m = aVar.f57518f;
        this.f57533n = aVar.f57519g;
        this.f57534o = true;
    }

    public String addName(String str, int i10, int i11) throws xb.b {
        f();
        i iVar = this.f57523d;
        if (iVar != null) {
            str = iVar.intern(str);
        }
        int iB = b(calcHash(i10, i11));
        int[] iArr = this.f57525f;
        iArr[iB] = i10;
        iArr[iB + 1] = i11;
        iArr[iB + 3] = 2;
        this.f57531l[iB >> 2] = str;
        this.f57530k++;
        return str;
    }

    public String findName(int i10, int i11) {
        int iA = a(calcHash(i10, i11));
        int[] iArr = this.f57525f;
        int i12 = iArr[iA + 3];
        if (i12 == 2) {
            if (i10 == iArr[iA] && i11 == iArr[iA + 1]) {
                return this.f57531l[iA >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this.f57527h + ((iA >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 2) {
            if (i10 == iArr[i13] && i11 == iArr[i13 + 1]) {
                return this.f57531l[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        int i15 = this.f57528i;
        int i16 = this.f57529j;
        int i17 = i15 + ((iA >> (i16 + 2)) << i16);
        int i18 = (1 << i16) + i17;
        while (true) {
            if (i17 < i18) {
                int i19 = iArr[i17 + 3];
                if (i10 == iArr[i17] && i11 == iArr[i17 + 1] && 2 == i19) {
                    return this.f57531l[i17 >> 2];
                }
                if (i19 == 0) {
                    break;
                }
                i17 += 4;
            } else {
                for (int iD = d(); iD < this.f57532m; iD += 4) {
                    if (i10 == iArr[iD] && i11 == iArr[iD + 1] && 2 == iArr[iD + 3]) {
                        return this.f57531l[iD >> 2];
                    }
                }
            }
        }
        return null;
    }

    public String addName(String str, int i10, int i11, int i12) throws xb.b {
        f();
        i iVar = this.f57523d;
        if (iVar != null) {
            str = iVar.intern(str);
        }
        int iB = b(calcHash(i10, i11, i12));
        int[] iArr = this.f57525f;
        iArr[iB] = i10;
        iArr[iB + 1] = i11;
        iArr[iB + 2] = i12;
        iArr[iB + 3] = 3;
        this.f57531l[iB >> 2] = str;
        this.f57530k++;
        return str;
    }

    public b(a aVar) {
        this.f57520a = null;
        this.f57522c = 0;
        this.f57523d = null;
        this.f57524e = true;
        this.f57521b = null;
        this.f57530k = -1;
        int[] iArr = aVar.f57516d;
        this.f57525f = iArr;
        this.f57531l = aVar.f57517e;
        this.f57526g = aVar.f57513a;
        int length = iArr.length;
        this.f57527h = length;
        this.f57528i = length;
        this.f57529j = 1;
        this.f57532m = length;
        this.f57533n = length;
        this.f57534o = true;
    }

    public String addName(String str, int[] iArr, int i10) throws xb.b {
        int iB;
        f();
        i iVar = this.f57523d;
        if (iVar != null) {
            str = iVar.intern(str);
        }
        if (i10 == 1) {
            iB = b(calcHash(iArr[0]));
            int[] iArr2 = this.f57525f;
            iArr2[iB] = iArr[0];
            iArr2[iB + 3] = 1;
        } else if (i10 == 2) {
            iB = b(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this.f57525f;
            iArr3[iB] = iArr[0];
            iArr3[iB + 1] = iArr[1];
            iArr3[iB + 3] = 2;
        } else if (i10 != 3) {
            int iCalcHash = calcHash(iArr, i10);
            iB = b(iCalcHash);
            int[] iArr4 = this.f57525f;
            iArr4[iB] = iCalcHash;
            int i11 = this.f57533n;
            int i12 = i11 + i10;
            if (i12 >= 0) {
                if (i12 > iArr4.length) {
                    this.f57525f = Arrays.copyOf(this.f57525f, Math.max(i12 - iArr4.length, Math.min(4096, this.f57526g)) + this.f57525f.length);
                }
                System.arraycopy(iArr, 0, this.f57525f, i11, i10);
                this.f57533n = i12;
                int[] iArr5 = this.f57525f;
                iArr5[iB + 1] = i11;
                iArr5[iB + 3] = i10;
            } else {
                throw new IllegalStateException(w0.i.a(i11, i10, "Internal error: long name offset overflow; start=", ", qlen="));
            }
        } else {
            iB = b(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr6 = this.f57525f;
            iArr6[iB] = iArr[0];
            iArr6[iB + 1] = iArr[1];
            iArr6[iB + 2] = iArr[2];
            iArr6[iB + 3] = 3;
        }
        this.f57531l[iB >> 2] = str;
        this.f57530k++;
        return str;
    }

    public String findName(int i10, int i11, int i12) {
        int iA = a(calcHash(i10, i11, i12));
        int[] iArr = this.f57525f;
        int i13 = iArr[iA + 3];
        if (i13 == 3) {
            if (i10 == iArr[iA] && iArr[iA + 1] == i11 && iArr[iA + 2] == i12) {
                return this.f57531l[iA >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f57527h + ((iA >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 3) {
            if (i10 == iArr[i14] && iArr[i14 + 1] == i11 && iArr[i14 + 2] == i12) {
                return this.f57531l[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        int i16 = this.f57528i;
        int i17 = this.f57529j;
        int i18 = i16 + ((iA >> (i17 + 2)) << i17);
        int i19 = (1 << i17) + i18;
        while (true) {
            if (i18 < i19) {
                int i20 = iArr[i18 + 3];
                if (i10 == iArr[i18] && i11 == iArr[i18 + 1] && i12 == iArr[i18 + 2] && 3 == i20) {
                    return this.f57531l[i18 >> 2];
                }
                if (i20 == 0) {
                    break;
                }
                i18 += 4;
            } else {
                for (int iD = d(); iD < this.f57532m; iD += 4) {
                    if (i10 == iArr[iD] && i11 == iArr[iD + 1] && i12 == iArr[iD + 2] && 3 == iArr[iD + 3]) {
                        return this.f57531l[iD >> 2];
                    }
                }
            }
        }
        return null;
    }

    public String findName(int[] iArr, int i10) {
        if (i10 < 4) {
            if (i10 == 1) {
                return findName(iArr[0]);
            }
            if (i10 == 2) {
                return findName(iArr[0], iArr[1]);
            }
            if (i10 != 3) {
                return "";
            }
            return findName(iArr[0], iArr[1], iArr[2]);
        }
        int iCalcHash = calcHash(iArr, i10);
        int iA = a(iCalcHash);
        int[] iArr2 = this.f57525f;
        int i11 = iArr2[iA + 3];
        if (iCalcHash == iArr2[iA] && i11 == i10 && e(i10, iArr2[iA + 1], iArr)) {
            return this.f57531l[iA >> 2];
        }
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f57527h + ((iA >> 3) << 2);
        int i13 = iArr2[i12 + 3];
        if (iCalcHash == iArr2[i12] && i13 == i10 && e(i10, iArr2[i12 + 1], iArr)) {
            return this.f57531l[i12 >> 2];
        }
        int i14 = this.f57528i;
        int i15 = this.f57529j;
        int i16 = i14 + ((iA >> (i15 + 2)) << i15);
        int[] iArr3 = this.f57525f;
        int i17 = (1 << i15) + i16;
        while (true) {
            if (i16 < i17) {
                int i18 = iArr3[i16 + 3];
                if (iCalcHash == iArr3[i16] && i10 == i18 && e(i10, iArr3[i16 + 1], iArr)) {
                    return this.f57531l[i16 >> 2];
                }
                if (i18 == 0) {
                    break;
                }
                i16 += 4;
            } else {
                for (int iD = d(); iD < this.f57532m; iD += 4) {
                    if (iCalcHash == iArr3[iD] && i10 == iArr3[iD + 3] && e(i10, iArr3[iD + 1], iArr)) {
                        return this.f57531l[iD >> 2];
                    }
                }
            }
        }
        return null;
    }
}
