package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n3 {

    /* renamed from: f, reason: collision with root package name */
    public static final n3 f26442f = new n3(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f26443a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f26444b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f26445c;

    /* renamed from: d, reason: collision with root package name */
    public int f26446d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26447e;

    public n3() {
        this(0, new int[8], new Object[8], true);
    }

    public static n3 a(n3 n3Var, n3 n3Var2) {
        int i10 = n3Var.f26443a + n3Var2.f26443a;
        int[] iArrCopyOf = Arrays.copyOf(n3Var.f26444b, i10);
        System.arraycopy(n3Var2.f26444b, 0, iArrCopyOf, n3Var.f26443a, n3Var2.f26443a);
        Object[] objArrCopyOf = Arrays.copyOf(n3Var.f26445c, i10);
        System.arraycopy(n3Var2.f26445c, 0, objArrCopyOf, n3Var.f26443a, n3Var2.f26443a);
        return new n3(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        int i10 = this.f26443a;
        if (i10 == n3Var.f26443a) {
            int[] iArr = this.f26444b;
            int[] iArr2 = n3Var.f26444b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f26445c;
                    Object[] objArr2 = n3Var.f26445c;
                    int i12 = this.f26443a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f26443a;
        int i11 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f26444b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f26445c;
        int i15 = this.f26443a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public n3(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f26446d = -1;
        this.f26443a = i10;
        this.f26444b = iArr;
        this.f26445c = objArr;
        this.f26447e = z10;
    }

    public final boolean a(int i10, w wVar) throws m1 {
        int iT;
        if (!this.f26447e) {
            throw new UnsupportedOperationException();
        }
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            a(i10, Long.valueOf(wVar.l()));
            return true;
        }
        if (i12 == 1) {
            a(i10, Long.valueOf(wVar.i()));
            return true;
        }
        if (i12 == 2) {
            a(i10, wVar.e());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 == 5) {
                a(i10, Integer.valueOf(wVar.h()));
                return true;
            }
            int i13 = n1.f26441a;
            throw new m1();
        }
        n3 n3Var = new n3();
        do {
            iT = wVar.t();
            if (iT == 0) {
                break;
            }
        } while (n3Var.a(iT, wVar));
        wVar.a((i11 << 3) | 4);
        a(i10, n3Var);
        return true;
    }

    public final void a(int i10, Object obj) {
        if (this.f26447e) {
            int i11 = this.f26443a;
            int[] iArr = this.f26444b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f26444b = Arrays.copyOf(iArr, i12);
                this.f26445c = Arrays.copyOf(this.f26445c, i12);
            }
            int[] iArr2 = this.f26444b;
            int i13 = this.f26443a;
            iArr2[i13] = i10;
            this.f26445c[i13] = obj;
            this.f26443a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void a(c0 c0Var) {
        if (this.f26443a == 0) {
            return;
        }
        c0Var.getClass();
        for (int i10 = 0; i10 < this.f26443a; i10++) {
            int i11 = this.f26444b[i10];
            Object obj = this.f26445c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                c0Var.f26355a.b(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                c0Var.f26355a.a(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                c0Var.f26355a.a(i12, (s) obj);
            } else if (i13 == 3) {
                c0Var.f26355a.c(i12, 3);
                ((n3) obj).a(c0Var);
                c0Var.f26355a.c(i12, 4);
            } else if (i13 == 5) {
                c0Var.f26355a.a(i12, ((Integer) obj).intValue());
            } else {
                int i14 = n1.f26441a;
                throw new RuntimeException(new m1());
            }
        }
    }

    public final int a() {
        int iB;
        int i10 = this.f26446d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f26443a; i11++) {
            int i12 = this.f26444b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iB = b0.b(i13) + b0.a(((Long) this.f26445c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f26445c[i11]).getClass();
                iB = b0.b(i13) + 8;
            } else if (i14 == 2) {
                iB = b0.a((s) this.f26445c[i11]) + b0.b(i13);
            } else if (i14 == 3) {
                iA = ((n3) this.f26445c[i11]).a() + (b0.b(i13) * 2) + iA;
            } else if (i14 == 5) {
                ((Integer) this.f26445c[i11]).getClass();
                iB = b0.b(i13) + 4;
            } else {
                int i15 = n1.f26441a;
                throw new IllegalStateException(new m1());
            }
            iA = iB + iA;
        }
        this.f26446d = iA;
        return iA;
    }
}
