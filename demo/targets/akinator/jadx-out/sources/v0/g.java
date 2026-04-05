package v0;

import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {
    public static final Object[] access$addElementAtIndex(Object[] objArr, int i10, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        f0.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        f0.copyInto(objArr, objArr2, i10 + 1, i10, objArr.length);
        objArr2[i10] = obj;
        return objArr2;
    }

    public static final Object[] access$removeCellAtIndex(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        f0.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        f0.copyInto(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final int indexSegment(int i10, int i11) {
        return (i10 >> i11) & 31;
    }
}
