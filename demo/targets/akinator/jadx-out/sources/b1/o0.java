package b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8659a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8660b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    public z0.l0[] f8661c = new z0.l0[16];

    public final boolean add(Object obj) {
        int i10 = this.f8659a;
        int iIdentityHashCode = z0.f0.identityHashCode(obj);
        int i11 = -1;
        if (i10 > 0) {
            int i12 = this.f8659a - 1;
            int i13 = 0;
            while (true) {
                if (i13 > i12) {
                    i11 = -(i13 + 1);
                    break;
                }
                int i14 = (i13 + i12) >>> 1;
                int i15 = this.f8660b[i14];
                if (i15 < iIdentityHashCode) {
                    i13 = i14 + 1;
                } else if (i15 <= iIdentityHashCode) {
                    z0.l0 l0Var = this.f8661c[i14];
                    if (obj != (l0Var != null ? l0Var.get() : null)) {
                        for (int i16 = i14 - 1; -1 < i16 && this.f8660b[i16] == iIdentityHashCode; i16--) {
                            z0.l0 l0Var2 = this.f8661c[i16];
                            if ((l0Var2 != null ? l0Var2.get() : null) == obj) {
                                i11 = i16;
                                break;
                            }
                        }
                        i14++;
                        int i17 = this.f8659a;
                        while (true) {
                            if (i14 >= i17) {
                                i11 = -(this.f8659a + 1);
                                break;
                            }
                            if (this.f8660b[i14] != iIdentityHashCode) {
                                i11 = -(i14 + 1);
                                break;
                            }
                            z0.l0 l0Var3 = this.f8661c[i14];
                            if ((l0Var3 != null ? l0Var3.get() : null) == obj) {
                                break;
                            }
                            i14++;
                        }
                    } else {
                        i11 = i14;
                    }
                } else {
                    i12 = i14 - 1;
                }
            }
            if (i11 >= 0) {
                return false;
            }
        }
        int i18 = -(i11 + 1);
        z0.l0[] l0VarArr = this.f8661c;
        int length = l0VarArr.length;
        if (i10 == length) {
            int i19 = length * 2;
            z0.l0[] l0VarArr2 = new z0.l0[i19];
            int[] iArr = new int[i19];
            int i20 = i18 + 1;
            System.arraycopy(l0VarArr, i18, l0VarArr2, i20, i10 - i18);
            System.arraycopy(this.f8661c, 0, l0VarArr2, 0, i18);
            uu.f0.copyInto(this.f8660b, iArr, i20, i18, i10);
            uu.f0.copyInto$default(this.f8660b, iArr, 0, 0, i18, 6, (Object) null);
            this.f8661c = l0VarArr2;
            this.f8660b = iArr;
        } else {
            int i21 = i18 + 1;
            System.arraycopy(l0VarArr, i18, l0VarArr, i21, i10 - i18);
            int[] iArr2 = this.f8660b;
            uu.f0.copyInto(iArr2, iArr2, i21, i18, i10);
        }
        this.f8661c[i18] = new z0.l0(obj);
        this.f8660b[i18] = iIdentityHashCode;
        this.f8659a++;
        return true;
    }

    public final int[] getHashes$runtime() {
        return this.f8660b;
    }

    public final int getSize$runtime() {
        return this.f8659a;
    }

    public final z0.l0[] getValues$runtime() {
        return this.f8661c;
    }

    public final boolean isValid$runtime() {
        z0.l0 l0Var;
        int i10 = this.f8659a;
        z0.l0[] l0VarArr = this.f8661c;
        int[] iArr = this.f8660b;
        int length = l0VarArr.length;
        if (i10 > length) {
            return false;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = iArr[i12];
            if (i13 < i11 || (l0Var = l0VarArr[i12]) == null) {
                return false;
            }
            T t10 = l0Var.get();
            if (t10 != 0 && i13 != z0.f0.identityHashCode(t10)) {
                return false;
            }
            i12++;
            i11 = i13;
        }
        while (i10 < length) {
            if (iArr[i10] != 0 || l0VarArr[i10] != null) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final void removeIf(kv.l lVar) {
        int size$runtime = getSize$runtime();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size$runtime) {
                break;
            }
            z0.l0 l0Var = getValues$runtime()[i10];
            Object obj = l0Var != null ? l0Var.get() : null;
            if (obj != null && !((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (i11 != i10) {
                    getValues$runtime()[i11] = l0Var;
                    getHashes$runtime()[i11] = getHashes$runtime()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < size$runtime; i12++) {
            getValues$runtime()[i12] = null;
            getHashes$runtime()[i12] = 0;
        }
        if (i11 != size$runtime) {
            setSize$runtime(i11);
        }
    }

    public final void setHashes$runtime(int[] iArr) {
        this.f8660b = iArr;
    }

    public final void setSize$runtime(int i10) {
        this.f8659a = i10;
    }

    public final void setValues$runtime(z0.l0[] l0VarArr) {
        this.f8661c = l0VarArr;
    }
}
