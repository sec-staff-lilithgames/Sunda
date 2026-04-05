package z;

import bp.oM.DwaEpyvxz;
import com.ironsource.G5;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f96957a = new Object();

    public static final void access$gc(u1 u1Var) {
        int i10 = u1Var.f96951f;
        int[] iArr = u1Var.f96949c;
        Object[] objArr = u1Var.f96950e;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f96957a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        u1Var.f96948b = false;
        u1Var.f96951f = i11;
    }

    public static final <E> void commonAppend(u1 u1Var, int i10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int i11 = u1Var.f96951f;
        if (i11 != 0 && i10 <= u1Var.f96949c[i11 - 1]) {
            u1Var.put(i10, e10);
            return;
        }
        if (u1Var.f96948b && i11 >= u1Var.f96949c.length) {
            access$gc(u1Var);
        }
        int i12 = u1Var.f96951f;
        if (i12 >= u1Var.f96949c.length) {
            int iIdealIntArraySize = a0.a.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(u1Var.f96949c, iIdealIntArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            u1Var.f96949c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(u1Var.f96950e, iIdealIntArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            u1Var.f96950e = objArrCopyOf;
        }
        u1Var.f96949c[i12] = i10;
        u1Var.f96950e[i12] = e10;
        u1Var.f96951f = i12 + 1;
    }

    public static final <E> void commonClear(u1 u1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int i10 = u1Var.f96951f;
        Object[] objArr = u1Var.f96950e;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        u1Var.f96951f = 0;
        u1Var.f96948b = false;
    }

    public static final <E> boolean commonContainsKey(u1 u1Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        return u1Var.indexOfKey(i10) >= 0;
    }

    public static final <E> boolean commonContainsValue(u1 u1Var, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        if (u1Var.f96948b) {
            access$gc(u1Var);
        }
        int i10 = u1Var.f96951f;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (u1Var.f96950e[i11] == e10) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    public static final <E> E commonGet(u1 u1Var, int i10) {
        E e10;
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int iBinarySearch = a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, i10);
        if (iBinarySearch < 0 || (e10 = (E) u1Var.f96950e[iBinarySearch]) == f96957a) {
            return null;
        }
        return e10;
    }

    public static final <E> int commonIndexOfValue(u1 u1Var, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        if (u1Var.f96948b) {
            access$gc(u1Var);
        }
        int i10 = u1Var.f96951f;
        for (int i11 = 0; i11 < i10; i11++) {
            if (u1Var.f96950e[i11] == e10) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(u1 u1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        return u1Var.size() == 0;
    }

    public static final <E> int commonKeyAt(u1 u1Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        if (u1Var.f96948b) {
            access$gc(u1Var);
        }
        return u1Var.f96949c[i10];
    }

    public static final <E> void commonPut(u1 u1Var, int i10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int iBinarySearch = a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, i10);
        if (iBinarySearch >= 0) {
            u1Var.f96950e[iBinarySearch] = e10;
            return;
        }
        int i11 = ~iBinarySearch;
        if (i11 < u1Var.f96951f && u1Var.f96950e[i11] == f96957a) {
            u1Var.f96949c[i11] = i10;
            u1Var.f96950e[i11] = e10;
            return;
        }
        if (u1Var.f96948b && u1Var.f96951f >= u1Var.f96949c.length) {
            access$gc(u1Var);
            i11 = ~a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, i10);
        }
        int i12 = u1Var.f96951f;
        if (i12 >= u1Var.f96949c.length) {
            int iIdealIntArraySize = a0.a.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(u1Var.f96949c, iIdealIntArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            u1Var.f96949c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(u1Var.f96950e, iIdealIntArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            u1Var.f96950e = objArrCopyOf;
        }
        int i13 = u1Var.f96951f;
        if (i13 - i11 != 0) {
            int[] iArr = u1Var.f96949c;
            int i14 = i11 + 1;
            uu.f0.copyInto(iArr, iArr, i14, i11, i13);
            Object[] objArr = u1Var.f96950e;
            uu.f0.copyInto(objArr, objArr, i14, i11, u1Var.f96951f);
        }
        u1Var.f96949c[i11] = i10;
        u1Var.f96950e[i11] = e10;
        u1Var.f96951f++;
    }

    public static final <E> void commonPutAll(u1 u1Var, u1 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = other.keyAt(i10);
            Object objValueAt = other.valueAt(i10);
            int iBinarySearch = a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, iKeyAt);
            if (iBinarySearch >= 0) {
                u1Var.f96950e[iBinarySearch] = objValueAt;
            } else {
                int i11 = ~iBinarySearch;
                if (i11 >= u1Var.f96951f || u1Var.f96950e[i11] != f96957a) {
                    if (u1Var.f96948b && u1Var.f96951f >= u1Var.f96949c.length) {
                        access$gc(u1Var);
                        i11 = ~a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, iKeyAt);
                    }
                    int i12 = u1Var.f96951f;
                    if (i12 >= u1Var.f96949c.length) {
                        int iIdealIntArraySize = a0.a.idealIntArraySize(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(u1Var.f96949c, iIdealIntArraySize);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                        u1Var.f96949c = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(u1Var.f96950e, iIdealIntArraySize);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        u1Var.f96950e = objArrCopyOf;
                    }
                    int i13 = u1Var.f96951f;
                    if (i13 - i11 != 0) {
                        int[] iArr = u1Var.f96949c;
                        int i14 = i11 + 1;
                        uu.f0.copyInto(iArr, iArr, i14, i11, i13);
                        Object[] objArr = u1Var.f96950e;
                        uu.f0.copyInto(objArr, objArr, i14, i11, u1Var.f96951f);
                    }
                    u1Var.f96949c[i11] = iKeyAt;
                    u1Var.f96950e[i11] = objValueAt;
                    u1Var.f96951f++;
                } else {
                    u1Var.f96949c[i11] = iKeyAt;
                    u1Var.f96950e[i11] = objValueAt;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(u1 u1Var, int i10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        E e11 = (E) commonGet(u1Var, i10);
        if (e11 == null) {
            int iBinarySearch = a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, i10);
            if (iBinarySearch >= 0) {
                u1Var.f96950e[iBinarySearch] = e10;
                return e11;
            }
            int i11 = ~iBinarySearch;
            if (i11 < u1Var.f96951f && u1Var.f96950e[i11] == f96957a) {
                u1Var.f96949c[i11] = i10;
                u1Var.f96950e[i11] = e10;
                return e11;
            }
            if (u1Var.f96948b && u1Var.f96951f >= u1Var.f96949c.length) {
                access$gc(u1Var);
                i11 = ~a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, i10);
            }
            int i12 = u1Var.f96951f;
            if (i12 >= u1Var.f96949c.length) {
                int iIdealIntArraySize = a0.a.idealIntArraySize(i12 + 1);
                int[] iArrCopyOf = Arrays.copyOf(u1Var.f96949c, iIdealIntArraySize);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                u1Var.f96949c = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(u1Var.f96950e, iIdealIntArraySize);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                u1Var.f96950e = objArrCopyOf;
            }
            int i13 = u1Var.f96951f;
            if (i13 - i11 != 0) {
                int[] iArr = u1Var.f96949c;
                int i14 = i11 + 1;
                uu.f0.copyInto(iArr, iArr, i14, i11, i13);
                Object[] objArr = u1Var.f96950e;
                uu.f0.copyInto(objArr, objArr, i14, i11, u1Var.f96951f);
            }
            u1Var.f96949c[i11] = i10;
            u1Var.f96950e[i11] = e10;
            u1Var.f96951f++;
        }
        return e11;
    }

    public static final <E> void commonRemove(u1 u1Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int iBinarySearch = a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, i10);
        if (iBinarySearch >= 0) {
            Object[] objArr = u1Var.f96950e;
            Object obj = objArr[iBinarySearch];
            Object obj2 = f96957a;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                u1Var.f96948b = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(u1 u1Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        if (u1Var.f96950e[i10] != f96957a) {
            u1Var.f96950e[i10] = f96957a;
            u1Var.f96948b = true;
        }
    }

    public static final <E> void commonRemoveAtRange(u1 u1Var, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            u1Var.removeAt(i10);
            i10++;
        }
    }

    public static final <E> E commonReplace(u1 u1Var, int i10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int iIndexOfKey = u1Var.indexOfKey(i10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = u1Var.f96950e;
        E e11 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e10;
        return e11;
    }

    public static final <E> void commonSetValueAt(u1 u1Var, int i10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        if (u1Var.f96948b) {
            access$gc(u1Var);
        }
        u1Var.f96950e[i10] = e10;
    }

    public static final <E> int commonSize(u1 u1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        if (u1Var.f96948b) {
            access$gc(u1Var);
        }
        return u1Var.f96951f;
    }

    public static final <E> String commonToString(u1 u1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        if (u1Var.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(u1Var.f96951f * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = u1Var.f96951f;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(u1Var.keyAt(i11));
            sb2.append(G5.T);
            Object objValueAt = u1Var.valueAt(i11);
            if (objValueAt != u1Var) {
                sb2.append(objValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <E> E commonValueAt(u1 u1Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        if (u1Var.f96948b) {
            access$gc(u1Var);
        }
        Object[] objArr = u1Var.f96950e;
        if (i10 < objArr.length) {
            return (E) objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static final <E> int commonIndexOfKey(u1 u1Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, uQjDr.jmKt);
        if (u1Var.f96948b) {
            access$gc(u1Var);
        }
        return a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, i10);
    }

    public static final <E> E commonGet(u1 u1Var, int i10, E e10) {
        E e11;
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, DwaEpyvxz.jMnzHdg);
        int iBinarySearch = a0.a.binarySearch(u1Var.f96949c, u1Var.f96951f, i10);
        return (iBinarySearch < 0 || (e11 = (E) u1Var.f96950e[iBinarySearch]) == f96957a) ? e10 : e11;
    }

    public static final <E> boolean commonReplace(u1 u1Var, int i10, E e10, E e11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int iIndexOfKey = u1Var.indexOfKey(i10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(u1Var.f96950e[iIndexOfKey], e10)) {
            return false;
        }
        u1Var.f96950e[iIndexOfKey] = e11;
        return true;
    }

    public static final <E> boolean commonRemove(u1 u1Var, int i10, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(u1Var, "<this>");
        int iIndexOfKey = u1Var.indexOfKey(i10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(obj, u1Var.valueAt(iIndexOfKey))) {
            return false;
        }
        u1Var.removeAt(iIndexOfKey);
        return true;
    }
}
