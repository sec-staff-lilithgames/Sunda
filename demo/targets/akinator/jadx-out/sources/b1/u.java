package b1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements Iterable, lv.a {

    /* renamed from: g, reason: collision with root package name */
    public static final s f8690g = new s(null);

    /* renamed from: h, reason: collision with root package name */
    public static final u f8691h = new u(null, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f8692b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8693c;

    /* renamed from: e, reason: collision with root package name */
    public final long f8694e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f8695f;

    public u(long[] jArr, long j10, long j11, long j12) {
        this.f8692b = j10;
        this.f8693c = j11;
        this.f8694e = j12;
        this.f8695f = jArr;
    }

    public final u and(u uVar) {
        u uVar2 = f8691h;
        if (kotlin.jvm.internal.e0.areEqual(uVar, uVar2) || kotlin.jvm.internal.e0.areEqual(this, uVar2)) {
            return uVar2;
        }
        long j10 = uVar.f8694e;
        long j11 = this.f8694e;
        if (j10 == j11) {
            long[] jArr = uVar.f8695f;
            long[] jArr2 = this.f8695f;
            if (jArr == jArr2) {
                long j12 = uVar.f8692b;
                long j13 = this.f8692b;
                long j14 = j13 & j12;
                long j15 = uVar.f8693c;
                long j16 = this.f8693c;
                return (j14 == 0 && (j16 & j15) == 0 && jArr2 == null) ? uVar2 : new u(jArr2, j12 & j13, j16 & j15, j11);
            }
        }
        u uVar3 = uVar2;
        int i10 = 0;
        if (this.f8695f == null) {
            long[] jArr3 = this.f8695f;
            if (jArr3 != null) {
                for (long j17 : jArr3) {
                    if (uVar.get(j17)) {
                        uVar3 = uVar3.set(j17);
                    }
                }
            }
            u uVar4 = uVar3;
            if (this.f8693c != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.f8693c & (1 << i11)) != 0) {
                        long j18 = this.f8694e + i11;
                        if (uVar.get(j18)) {
                            uVar4 = uVar4.set(j18);
                        }
                    }
                }
            }
            if (this.f8692b != 0) {
                while (i10 < 64) {
                    if ((this.f8692b & (1 << i10)) != 0) {
                        long j19 = this.f8694e + i10 + 64;
                        if (uVar.get(j19)) {
                            uVar4 = uVar4.set(j19);
                        }
                    }
                    i10++;
                }
            }
            return uVar4;
        }
        long[] jArr4 = uVar.f8695f;
        if (jArr4 != null) {
            for (long j20 : jArr4) {
                if (get(j20)) {
                    uVar3 = uVar3.set(j20);
                }
            }
        }
        u uVar5 = uVar3;
        if (uVar.f8693c != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((uVar.f8693c & (1 << i12)) != 0) {
                    long j21 = uVar.f8694e + i12;
                    if (get(j21)) {
                        uVar5 = uVar5.set(j21);
                    }
                }
            }
        }
        if (uVar.f8692b != 0) {
            while (i10 < 64) {
                if ((uVar.f8692b & (1 << i10)) != 0) {
                    long j22 = uVar.f8694e + i10 + 64;
                    if (get(j22)) {
                        uVar5 = uVar5.set(j22);
                    }
                }
                i10++;
            }
        }
        return uVar5;
    }

    public final u andNot(u uVar) {
        u uVarClear;
        u uVar2 = f8691h;
        if (uVar == uVar2) {
            return this;
        }
        if (this == uVar2) {
            return uVar2;
        }
        long j10 = uVar.f8694e;
        long j11 = this.f8694e;
        if (j10 == j11) {
            long[] jArr = uVar.f8695f;
            long[] jArr2 = this.f8695f;
            if (jArr == jArr2) {
                return new u(jArr2, this.f8692b & (~uVar.f8692b), this.f8693c & (~uVar.f8693c), j11);
            }
        }
        long[] jArr3 = uVar.f8695f;
        if (jArr3 != null) {
            uVarClear = this;
            for (long j12 : jArr3) {
                uVarClear = uVarClear.clear(j12);
            }
        } else {
            uVarClear = this;
        }
        if (uVar.f8693c != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((uVar.f8693c & (1 << i10)) != 0) {
                    uVarClear = uVarClear.clear(uVar.f8694e + i10);
                }
            }
        }
        if (uVar.f8692b != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((uVar.f8692b & (1 << i11)) != 0) {
                    uVarClear = uVarClear.clear(uVar.f8694e + i11 + 64);
                }
            }
        }
        return uVarClear;
    }

    public final u clear(long j10) {
        long[] jArr;
        int iBinarySearch;
        long j11 = j10 - this.f8694e;
        long j12 = 0;
        if (kotlin.jvm.internal.e0.compare(j11, j12) >= 0 && kotlin.jvm.internal.e0.compare(j11, 64) < 0) {
            long j13 = 1 << ((int) j11);
            long j14 = this.f8693c;
            if ((j14 & j13) != 0) {
                return new u(this.f8695f, this.f8692b, j14 & (~j13), this.f8694e);
            }
        } else if (kotlin.jvm.internal.e0.compare(j11, 64) >= 0 && kotlin.jvm.internal.e0.compare(j11, 128) < 0) {
            long j15 = 1 << (((int) j11) - 64);
            long j16 = this.f8692b;
            if ((j16 & j15) != 0) {
                return new u(this.f8695f, j16 & (~j15), this.f8693c, this.f8694e);
            }
        } else if (kotlin.jvm.internal.e0.compare(j11, j12) < 0 && (jArr = this.f8695f) != null && (iBinarySearch = v.binarySearch(jArr, j10)) >= 0) {
            return new u(v.withIdRemovedAt(jArr, iBinarySearch), this.f8692b, this.f8693c, this.f8694e);
        }
        return this;
    }

    public final void fastForEach(kv.l lVar) {
        long[] jArr = this.f8695f;
        if (jArr != null) {
            for (long j10 : jArr) {
                lVar.invoke(Long.valueOf(j10));
            }
        }
        if (this.f8693c != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((this.f8693c & (1 << i10)) != 0) {
                    lVar.invoke(Long.valueOf(this.f8694e + i10));
                }
            }
        }
        if (this.f8692b != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((this.f8692b & (1 << i11)) != 0) {
                    lVar.invoke(Long.valueOf(this.f8694e + i11 + 64));
                }
            }
        }
    }

    public final boolean get(long j10) {
        long[] jArr;
        long j11 = j10 - this.f8694e;
        long j12 = 0;
        return (kotlin.jvm.internal.e0.compare(j11, j12) < 0 || kotlin.jvm.internal.e0.compare(j11, (long) 64) >= 0) ? (kotlin.jvm.internal.e0.compare(j11, (long) 64) < 0 || kotlin.jvm.internal.e0.compare(j11, (long) 128) >= 0) ? kotlin.jvm.internal.e0.compare(j11, j12) <= 0 && (jArr = this.f8695f) != null && v.binarySearch(jArr, j10) >= 0 : ((1 << (((int) j11) - 64)) & this.f8692b) != 0 : ((1 << ((int) j11)) & this.f8693c) != 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return rv.w.sequence(new t(this, null)).iterator();
    }

    public final long lowest(long j10) {
        int iNumberOfTrailingZeros;
        long[] jArr = this.f8695f;
        if (jArr != null) {
            return jArr[0];
        }
        long j11 = this.f8693c;
        long j12 = this.f8694e;
        if (j11 != 0) {
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
        } else {
            long j13 = this.f8692b;
            if (j13 == 0) {
                return j10;
            }
            j12 += 64;
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
        }
        return j12 + iNumberOfTrailingZeros;
    }

    public final u or(u uVar) {
        u uVar2;
        u uVar3 = f8691h;
        if (uVar == uVar3) {
            return this;
        }
        if (this == uVar3) {
            return uVar;
        }
        long j10 = uVar.f8694e;
        long j11 = this.f8694e;
        if (j10 == j11) {
            long[] jArr = uVar.f8695f;
            long[] jArr2 = this.f8695f;
            if (jArr == jArr2) {
                return new u(jArr2, uVar.f8692b | this.f8692b, uVar.f8693c | this.f8693c, j11);
            }
        }
        int i10 = 0;
        if (this.f8695f == null) {
            long[] jArr3 = this.f8695f;
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    uVar = uVar.set(j12);
                }
            }
            if (this.f8693c != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.f8693c & (1 << i11)) != 0) {
                        uVar = uVar.set(this.f8694e + i11);
                    }
                }
            }
            if (this.f8692b != 0) {
                while (i10 < 64) {
                    if ((this.f8692b & (1 << i10)) != 0) {
                        uVar = uVar.set(this.f8694e + i10 + 64);
                    }
                    i10++;
                }
            }
            return uVar;
        }
        long[] jArr4 = uVar.f8695f;
        if (jArr4 != null) {
            uVar2 = this;
            for (long j13 : jArr4) {
                uVar2 = uVar2.set(j13);
            }
        } else {
            uVar2 = this;
        }
        if (uVar.f8693c != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((uVar.f8693c & (1 << i12)) != 0) {
                    uVar2 = uVar2.set(uVar.f8694e + i12);
                }
            }
        }
        if (uVar.f8692b != 0) {
            while (i10 < 64) {
                if ((uVar.f8692b & (1 << i10)) != 0) {
                    uVar2 = uVar2.set(uVar.f8694e + i10 + 64);
                }
                i10++;
            }
        }
        return uVar2;
    }

    public final u set(long j10) {
        long j11;
        long j12;
        long[] array;
        long j13 = this.f8694e;
        long j14 = j10 - j13;
        long j15 = 0;
        int iCompare = kotlin.jvm.internal.e0.compare(j14, j15);
        long j16 = this.f8693c;
        if (iCompare < 0 || kotlin.jvm.internal.e0.compare(j14, 64) >= 0) {
            long j17 = 64;
            int iCompare2 = kotlin.jvm.internal.e0.compare(j14, j17);
            long j18 = this.f8692b;
            if (iCompare2 < 0 || kotlin.jvm.internal.e0.compare(j14, 128) >= 0) {
                long j19 = 128;
                int iCompare3 = kotlin.jvm.internal.e0.compare(j14, j19);
                long[] jArr = this.f8695f;
                if (iCompare3 >= 0) {
                    if (!get(j10)) {
                        long j20 = 1;
                        long j21 = ((j10 + j20) / j17) * j17;
                        if (kotlin.jvm.internal.e0.compare(j21, j15) < 0) {
                            j21 = (Long.MAX_VALUE - j19) + j20;
                        }
                        r rVar = null;
                        long j22 = j13;
                        long j23 = j18;
                        while (true) {
                            if (kotlin.jvm.internal.e0.compare(j22, j21) >= 0) {
                                j11 = j22;
                                j12 = j16;
                                break;
                            }
                            if (j16 != 0) {
                                if (rVar == null) {
                                    rVar = new r(jArr);
                                }
                                int i10 = 0;
                                while (i10 < 64) {
                                    long j24 = j21;
                                    if ((j16 & (1 << i10)) != 0) {
                                        rVar.add(i10 + j22);
                                    }
                                    i10++;
                                    j21 = j24;
                                }
                            }
                            long j25 = j21;
                            if (j23 == 0) {
                                j12 = 0;
                                j11 = j25;
                                break;
                            }
                            j22 += j17;
                            j21 = j25;
                            j16 = j23;
                            j23 = 0;
                        }
                        return new u((rVar == null || (array = rVar.toArray()) == null) ? jArr : array, j23, j12, j11).set(j10);
                    }
                } else {
                    if (jArr == null) {
                        return new u(new long[]{j10}, this.f8692b, this.f8693c, this.f8694e);
                    }
                    int iBinarySearch = v.binarySearch(jArr, j10);
                    if (iBinarySearch < 0) {
                        return new u(v.withIdInsertedAt(jArr, -(iBinarySearch + 1), j10), this.f8692b, this.f8693c, this.f8694e);
                    }
                }
            } else {
                long j26 = 1 << (((int) j14) - 64);
                if ((j18 & j26) == 0) {
                    return new u(this.f8695f, j18 | j26, this.f8693c, this.f8694e);
                }
            }
        } else {
            long j27 = 1 << ((int) j14);
            if ((j16 & j27) == 0) {
                return new u(this.f8695f, this.f8692b, j16 | j27, this.f8694e);
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return o2.q(sb2, d.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null), AbstractJsonLexerKt.END_LIST);
    }
}
