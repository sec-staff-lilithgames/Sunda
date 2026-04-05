package z;

import com.ironsource.G5;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f96768a = new Object();

    public static final <E> void commonAppend(x xVar, long j10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int i10 = xVar.f96985f;
        if (i10 != 0 && j10 <= xVar.f96983c[i10 - 1]) {
            xVar.put(j10, e10);
            return;
        }
        if (xVar.f96982b) {
            long[] jArr = xVar.f96983c;
            if (i10 >= jArr.length) {
                Object[] objArr = xVar.f96984e;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != f96768a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                xVar.f96982b = false;
                xVar.f96985f = i11;
            }
        }
        int i13 = xVar.f96985f;
        if (i13 >= xVar.f96983c.length) {
            int iIdealLongArraySize = a0.a.idealLongArraySize(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(xVar.f96983c, iIdealLongArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            xVar.f96983c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(xVar.f96984e, iIdealLongArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            xVar.f96984e = objArrCopyOf;
        }
        xVar.f96983c[i13] = j10;
        xVar.f96984e[i13] = e10;
        xVar.f96985f = i13 + 1;
    }

    public static final <E> void commonClear(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int i10 = xVar.f96985f;
        Object[] objArr = xVar.f96984e;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        xVar.f96985f = 0;
        xVar.f96982b = false;
    }

    public static final <E> boolean commonContainsKey(x xVar, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return xVar.indexOfKey(j10) >= 0;
    }

    public static final <E> boolean commonContainsValue(x xVar, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return xVar.indexOfValue(e10) >= 0;
    }

    public static final <E> void commonGc(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int i10 = xVar.f96985f;
        long[] jArr = xVar.f96983c;
        Object[] objArr = xVar.f96984e;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f96768a) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        xVar.f96982b = false;
        xVar.f96985f = i11;
    }

    public static final <E> E commonGet(x xVar, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int iBinarySearch = a0.a.binarySearch(xVar.f96983c, xVar.f96985f, j10);
        if (iBinarySearch < 0 || xVar.f96984e[iBinarySearch] == f96768a) {
            return null;
        }
        return (E) xVar.f96984e[iBinarySearch];
    }

    public static final Object commonGetInternal(x xVar, long j10, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int iBinarySearch = a0.a.binarySearch(xVar.f96983c, xVar.f96985f, j10);
        return (iBinarySearch < 0 || xVar.f96984e[iBinarySearch] == f96768a) ? obj : xVar.f96984e[iBinarySearch];
    }

    public static final <E> int commonIndexOfKey(x xVar, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        if (xVar.f96982b) {
            int i10 = xVar.f96985f;
            long[] jArr = xVar.f96983c;
            Object[] objArr = xVar.f96984e;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f96768a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            xVar.f96982b = false;
            xVar.f96985f = i11;
        }
        return a0.a.binarySearch(xVar.f96983c, xVar.f96985f, j10);
    }

    public static final <E> int commonIndexOfValue(x xVar, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        if (xVar.f96982b) {
            int i10 = xVar.f96985f;
            long[] jArr = xVar.f96983c;
            Object[] objArr = xVar.f96984e;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f96768a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            xVar.f96982b = false;
            xVar.f96985f = i11;
        }
        int i13 = xVar.f96985f;
        for (int i14 = 0; i14 < i13; i14++) {
            if (xVar.f96984e[i14] == e10) {
                return i14;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return xVar.size() == 0;
    }

    public static final <E> long commonKeyAt(x xVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        if (i10 < 0 || i10 >= xVar.f96985f) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (xVar.f96982b) {
            int i11 = xVar.f96985f;
            long[] jArr = xVar.f96983c;
            Object[] objArr = xVar.f96984e;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f96768a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            xVar.f96982b = false;
            xVar.f96985f = i12;
        }
        return xVar.f96983c[i10];
    }

    public static final <E> void commonPut(x xVar, long j10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int iBinarySearch = a0.a.binarySearch(xVar.f96983c, xVar.f96985f, j10);
        if (iBinarySearch >= 0) {
            xVar.f96984e[iBinarySearch] = e10;
            return;
        }
        int i10 = ~iBinarySearch;
        if (i10 < xVar.f96985f && xVar.f96984e[i10] == f96768a) {
            xVar.f96983c[i10] = j10;
            xVar.f96984e[i10] = e10;
            return;
        }
        if (xVar.f96982b) {
            int i11 = xVar.f96985f;
            long[] jArr = xVar.f96983c;
            if (i11 >= jArr.length) {
                Object[] objArr = xVar.f96984e;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != f96768a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                xVar.f96982b = false;
                xVar.f96985f = i12;
                i10 = ~a0.a.binarySearch(xVar.f96983c, i12, j10);
            }
        }
        int i14 = xVar.f96985f;
        if (i14 >= xVar.f96983c.length) {
            int iIdealLongArraySize = a0.a.idealLongArraySize(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(xVar.f96983c, iIdealLongArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            xVar.f96983c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(xVar.f96984e, iIdealLongArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            xVar.f96984e = objArrCopyOf;
        }
        int i15 = xVar.f96985f;
        if (i15 - i10 != 0) {
            long[] jArr2 = xVar.f96983c;
            int i16 = i10 + 1;
            uu.f0.copyInto(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = xVar.f96984e;
            uu.f0.copyInto(objArr2, objArr2, i16, i10, xVar.f96985f);
        }
        xVar.f96983c[i10] = j10;
        xVar.f96984e[i10] = e10;
        xVar.f96985f++;
    }

    public static final <E> void commonPutAll(x xVar, x other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            xVar.put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    public static final <E> E commonPutIfAbsent(x xVar, long j10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        E e11 = (E) xVar.get(j10);
        if (e11 == null) {
            xVar.put(j10, e10);
        }
        return e11;
    }

    public static final <E> void commonRemove(x xVar, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int iBinarySearch = a0.a.binarySearch(xVar.f96983c, xVar.f96985f, j10);
        if (iBinarySearch < 0 || xVar.f96984e[iBinarySearch] == f96768a) {
            return;
        }
        xVar.f96984e[iBinarySearch] = f96768a;
        xVar.f96982b = true;
    }

    public static final <E> void commonRemoveAt(x xVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        if (xVar.f96984e[i10] != f96768a) {
            xVar.f96984e[i10] = f96768a;
            xVar.f96982b = true;
        }
    }

    public static final <E> E commonReplace(x xVar, long j10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int iIndexOfKey = xVar.indexOfKey(j10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = xVar.f96984e;
        E e11 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e10;
        return e11;
    }

    public static final <E> void commonSetValueAt(x xVar, int i10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        if (i10 < 0 || i10 >= xVar.f96985f) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (xVar.f96982b) {
            int i11 = xVar.f96985f;
            long[] jArr = xVar.f96983c;
            Object[] objArr = xVar.f96984e;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f96768a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            xVar.f96982b = false;
            xVar.f96985f = i12;
        }
        xVar.f96984e[i10] = e10;
    }

    public static final <E> int commonSize(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        if (xVar.f96982b) {
            int i10 = xVar.f96985f;
            long[] jArr = xVar.f96983c;
            Object[] objArr = xVar.f96984e;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != f96768a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            xVar.f96982b = false;
            xVar.f96985f = i11;
        }
        return xVar.f96985f;
    }

    public static final <E> String commonToString(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        if (xVar.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(xVar.f96985f * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = xVar.f96985f;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(xVar.keyAt(i11));
            sb2.append(G5.T);
            Object objValueAt = xVar.valueAt(i11);
            if (objValueAt != sb2) {
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

    public static final <E> E commonValueAt(x xVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        if (i10 < 0 || i10 >= xVar.f96985f) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (xVar.f96982b) {
            int i11 = xVar.f96985f;
            long[] jArr = xVar.f96983c;
            Object[] objArr = xVar.f96984e;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != f96768a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            xVar.f96982b = false;
            xVar.f96985f = i12;
        }
        return (E) xVar.f96984e[i10];
    }

    public static final <T> void forEach(x xVar, kv.p action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        int size = xVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Long.valueOf(xVar.keyAt(i10)), xVar.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(x xVar, long j10, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return (T) xVar.get(j10, t10);
    }

    public static final <T> T getOrElse(x xVar, long j10, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        T t10 = (T) xVar.get(j10);
        return t10 == null ? (T) defaultValue.invoke() : t10;
    }

    public static final <T> int getSize(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return xVar.size();
    }

    public static /* synthetic */ void getSize$annotations(x xVar) {
    }

    public static final <T> boolean isNotEmpty(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return !xVar.isEmpty();
    }

    public static final <T> uu.k1 keyIterator(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return new y(xVar);
    }

    public static final <T> x plus(x xVar, x other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        x xVar2 = new x(other.size() + xVar.size());
        xVar2.putAll(xVar);
        xVar2.putAll(other);
        return xVar2;
    }

    @tu.f
    public static final /* synthetic */ boolean remove(x xVar, long j10, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return xVar.remove(j10, obj);
    }

    public static final <T> void set(x xVar, long j10, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        xVar.put(j10, t10);
    }

    public static final <T> Iterator<T> valueIterator(x xVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        return new z(xVar);
    }

    public static final <T> boolean contains(x xVar, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, yFkbx.huYCLDFVZFy);
        return xVar.containsKey(j10);
    }

    public static final <E> E commonGet(x xVar, long j10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int iBinarySearch = a0.a.binarySearch(xVar.f96983c, xVar.f96985f, j10);
        return (iBinarySearch < 0 || xVar.f96984e[iBinarySearch] == f96768a) ? e10 : (E) xVar.f96984e[iBinarySearch];
    }

    public static final <E> boolean commonReplace(x xVar, long j10, E e10, E e11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int iIndexOfKey = xVar.indexOfKey(j10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(xVar.f96984e[iIndexOfKey], e10)) {
            return false;
        }
        xVar.f96984e[iIndexOfKey] = e11;
        return true;
    }

    public static final <E> boolean commonRemove(x xVar, long j10, E e10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(xVar, "<this>");
        int iIndexOfKey = xVar.indexOfKey(j10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(e10, xVar.valueAt(iIndexOfKey))) {
            return false;
        }
        xVar.removeAt(iIndexOfKey);
        return true;
    }
}
