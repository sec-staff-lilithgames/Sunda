package iu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final float f68426a;

    /* renamed from: b, reason: collision with root package name */
    public int f68427b;

    /* renamed from: c, reason: collision with root package name */
    public int f68428c;

    /* renamed from: d, reason: collision with root package name */
    public int f68429d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f68430e;

    public w() {
        this(16, 0.75f);
    }

    public final void a(int i10, int i11, Object[] objArr) {
        int i12;
        Object obj;
        this.f68428c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i10] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i14 = (iHashCode ^ (iHashCode >>> 16)) & i11;
                if (i10 <= i12) {
                    if (i10 >= i14 || i14 > i12) {
                        break;
                    } else {
                        i13 = i12 + 1;
                    }
                } else if (i10 < i14 || i14 <= i12) {
                    i13 = i12 + 1;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }

    public boolean add(Object obj) {
        Object obj2;
        Object obj3;
        Object[] objArr = this.f68430e;
        int i10 = this.f68427b;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i11 = (iHashCode ^ (iHashCode >>> 16)) & i10;
        Object obj4 = objArr[i11];
        if (obj4 != null) {
            if (obj4.equals(obj)) {
                return false;
            }
            do {
                i11 = (i11 + 1) & i10;
                obj3 = objArr[i11];
                if (obj3 == null) {
                }
            } while (!obj3.equals(obj));
            return false;
        }
        objArr[i11] = obj;
        int i12 = this.f68428c + 1;
        this.f68428c = i12;
        if (i12 >= this.f68429d) {
            Object[] objArr2 = this.f68430e;
            int length = objArr2.length;
            int i13 = length << 1;
            int i14 = i13 - 1;
            Object[] objArr3 = new Object[i13];
            while (true) {
                int i15 = i12 - 1;
                if (i12 == 0) {
                    break;
                }
                do {
                    length--;
                    obj2 = objArr2[length];
                } while (obj2 == null);
                int iHashCode2 = obj2.hashCode() * (-1640531527);
                int i16 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i14;
                if (objArr3[i16] != null) {
                    do {
                        i16 = (i16 + 1) & i14;
                    } while (objArr3[i16] != null);
                }
                objArr3[i16] = objArr2[length];
                i12 = i15;
            }
            this.f68427b = i14;
            this.f68429d = (int) (i13 * this.f68426a);
            this.f68430e = objArr3;
        }
        return true;
    }

    public Object[] keys() {
        return this.f68430e;
    }

    public boolean remove(Object obj) {
        Object obj2;
        Object[] objArr = this.f68430e;
        int i10 = this.f68427b;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i11 = (iHashCode ^ (iHashCode >>> 16)) & i10;
        Object obj3 = objArr[i11];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            a(i11, i10, objArr);
            return true;
        }
        do {
            i11 = (i11 + 1) & i10;
            obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        a(i11, i10, objArr);
        return true;
    }

    public int size() {
        return this.f68428c;
    }

    public w(int i10) {
        this(i10, 0.75f);
    }

    public w(int i10, float f10) {
        this.f68426a = f10;
        int iRoundToPowerOfTwo = x.roundToPowerOfTwo(i10);
        this.f68427b = iRoundToPowerOfTwo - 1;
        this.f68429d = (int) (f10 * iRoundToPowerOfTwo);
        this.f68430e = new Object[iRoundToPowerOfTwo];
    }
}
