package wr;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b5 implements e5 {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f90835a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f90836b;

    public b5(Object[] objArr, Object[] objArr2) {
        this.f90835a = objArr;
        this.f90836b = objArr2;
    }

    @Override // wr.e5
    public Object get(Object obj, int i10, int i11) {
        int i12 = 0;
        while (true) {
            Object[] objArr = this.f90835a;
            if (i12 >= objArr.length) {
                return null;
            }
            if (objArr[i12] == obj) {
                return this.f90836b[i12];
            }
            i12++;
        }
    }

    @Override // wr.e5
    public e5 put(Object obj, Object obj2, int i10, int i11) {
        Object[] objArr = this.f90835a;
        int i12 = 0;
        int iHashCode = objArr[0].hashCode();
        if (iHashCode != i10) {
            return c5.a(new d5(obj, obj2), i10, this, iHashCode, i11);
        }
        while (true) {
            if (i12 >= objArr.length) {
                i12 = -1;
                break;
            }
            if (objArr[i12] == obj) {
                break;
            }
            i12++;
        }
        Object[] objArr2 = this.f90836b;
        if (i12 != -1) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr.length);
            objArrCopyOf[i12] = obj;
            objArrCopyOf2[i12] = obj2;
            return new b5(objArrCopyOf, objArrCopyOf2);
        }
        Object[] objArrCopyOf3 = Arrays.copyOf(objArr, objArr.length + 1);
        Object[] objArrCopyOf4 = Arrays.copyOf(objArr2, objArr.length + 1);
        objArrCopyOf3[objArr.length] = obj;
        objArrCopyOf4[objArr.length] = obj2;
        return new b5(objArrCopyOf3, objArrCopyOf4);
    }

    @Override // wr.e5
    public int size() {
        return this.f90836b.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CollisionLeaf(");
        int i10 = 0;
        while (true) {
            Object[] objArr = this.f90836b;
            if (i10 >= objArr.length) {
                sb2.append(")");
                return sb2.toString();
            }
            sb2.append("(key=");
            sb2.append(this.f90835a[i10]);
            sb2.append(" value=");
            sb2.append(objArr[i10]);
            sb2.append(") ");
            i10++;
        }
    }
}
