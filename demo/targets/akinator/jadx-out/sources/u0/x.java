package u0;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {
    public static final Object[] access$insertEntryAtIndex(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        f0.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        f0.copyInto(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] access$removeEntryAtIndex(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        f0.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        f0.copyInto(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] access$removeNodeAtIndex(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        f0.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        f0.copyInto(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] access$replaceEntryWithNode(Object[] objArr, int i10, int i11, t tVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        f0.copyInto$default(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        f0.copyInto(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i11 - 2] = tVar;
        f0.copyInto(objArr, objArr2, i11 - 1, i11, objArr.length);
        return objArr2;
    }

    public static final Object[] access$replaceNodeWithEntry(Object[] objArr, int i10, int i11, Object obj, Object obj2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        f0.copyInto(objArrCopyOf, objArrCopyOf, i10 + 2, i10 + 1, objArr.length);
        f0.copyInto(objArrCopyOf, objArrCopyOf, i11 + 2, i11, i10);
        objArrCopyOf[i11] = obj;
        objArrCopyOf[i11 + 1] = obj2;
        return objArrCopyOf;
    }

    public static final int indexSegment(int i10, int i11) {
        return (i10 >> i11) & 31;
    }
}
