package z;

import com.ironsource.G5;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t1 {

    /* renamed from: b, reason: collision with root package name */
    public int[] f96942b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f96943c;

    /* renamed from: e, reason: collision with root package name */
    public int f96944e;

    public t1() {
        this(0, 1, null);
    }

    public final int __restricted$indexOfValue(Object obj) {
        int i10 = this.f96944e * 2;
        Object[] objArr = this.f96943c;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (kotlin.jvm.internal.e0.areEqual(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final int a(int i10, Object obj) {
        int i11 = this.f96944e;
        if (i11 == 0) {
            return -1;
        }
        int iBinarySearch = a0.a.binarySearch(this.f96942b, i11, i10);
        if (iBinarySearch < 0 || kotlin.jvm.internal.e0.areEqual(obj, this.f96943c[iBinarySearch << 1])) {
            return iBinarySearch;
        }
        int i12 = iBinarySearch + 1;
        while (i12 < i11 && this.f96942b[i12] == i10) {
            if (kotlin.jvm.internal.e0.areEqual(obj, this.f96943c[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iBinarySearch - 1; i13 >= 0 && this.f96942b[i13] == i10; i13--) {
            if (kotlin.jvm.internal.e0.areEqual(obj, this.f96943c[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int b() {
        int i10 = this.f96944e;
        if (i10 == 0) {
            return -1;
        }
        int iBinarySearch = a0.a.binarySearch(this.f96942b, i10, 0);
        if (iBinarySearch < 0 || this.f96943c[iBinarySearch << 1] == null) {
            return iBinarySearch;
        }
        int i11 = iBinarySearch + 1;
        while (i11 < i10 && this.f96942b[i11] == 0) {
            if (this.f96943c[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iBinarySearch - 1; i12 >= 0 && this.f96942b[i12] == 0; i12--) {
            if (this.f96943c[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public void clear() {
        if (this.f96944e > 0) {
            this.f96942b = a0.a.f3382a;
            this.f96943c = a0.a.f3384c;
            this.f96944e = 0;
        }
        if (this.f96944e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return __restricted$indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int i10) {
        int i11 = this.f96944e;
        int[] iArr = this.f96942b;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f96942b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f96943c, i10 * 2);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f96943c = objArrCopyOf;
        }
        if (this.f96944e != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof t1) {
                if (size() != ((t1) obj).size()) {
                    return false;
                }
                t1 t1Var = (t1) obj;
                int i10 = this.f96944e;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objKeyAt = keyAt(i11);
                    Object objValueAt = valueAt(i11);
                    Object obj2 = t1Var.get(objKeyAt);
                    if (objValueAt == null) {
                        if (obj2 != null || !t1Var.containsKey(objKeyAt)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.e0.areEqual(objValueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f96944e;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objKeyAt2 = keyAt(i13);
                Object objValueAt2 = valueAt(i13);
                Object obj3 = ((Map) obj).get(objKeyAt2);
                if (objValueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objKeyAt2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.e0.areEqual(objValueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return this.f96943c[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? this.f96943c[(iIndexOfKey << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f96942b;
        Object[] objArr = this.f96943c;
        int i10 = this.f96944e;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public int indexOfKey(Object obj) {
        return obj == null ? b() : a(obj.hashCode(), obj);
    }

    public boolean isEmpty() {
        return this.f96944e <= 0;
    }

    public Object keyAt(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f96944e) {
            z10 = true;
        }
        if (!z10) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f96943c[i10 << 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f96944e;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iA = obj != null ? a(iHashCode, obj) : b();
        if (iA >= 0) {
            int i11 = (iA << 1) + 1;
            Object[] objArr = this.f96943c;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iA;
        int[] iArr = this.f96942b;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f96942b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f96943c, i13 << 1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f96943c = objArrCopyOf;
            if (i10 != this.f96944e) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f96942b;
            int i14 = i12 + 1;
            uu.f0.copyInto(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f96943c;
            uu.f0.copyInto(objArr2, objArr2, i14 << 1, i12 << 1, this.f96944e << 1);
        }
        int i15 = this.f96944e;
        if (i10 == i15) {
            int[] iArr3 = this.f96942b;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f96943c;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f96944e = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(t1 map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "map");
        int i10 = map.f96944e;
        ensureCapacity(this.f96944e + i10);
        if (this.f96944e != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.keyAt(i11), map.valueAt(i11));
            }
        } else if (i10 > 0) {
            uu.f0.copyInto(map.f96942b, this.f96942b, 0, 0, i10);
            uu.f0.copyInto(map.f96943c, this.f96943c, 0, 0, i10 << 1);
            this.f96944e = i10;
        }
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public Object removeAt(int i10) {
        if (!(i10 >= 0 && i10 < this.f96944e)) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f96943c;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f96944e;
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f96942b;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                uu.f0.copyInto(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f96943c;
                uu.f0.copyInto(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f96943c;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f96942b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f96943c, i16 << 1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f96943c = objArrCopyOf;
            if (i12 != this.f96944e) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                uu.f0.copyInto(iArr, this.f96942b, 0, 0, i10);
                uu.f0.copyInto(objArr, this.f96943c, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                uu.f0.copyInto(iArr, this.f96942b, i10, i17, i12);
                uu.f0.copyInto(objArr, this.f96943c, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f96944e) {
            throw new ConcurrentModificationException();
        }
        this.f96944e = i13;
        return obj;
    }

    public Object replace(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, obj2);
        }
        return null;
    }

    public Object setValueAt(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f96944e) {
            z10 = true;
        }
        if (!z10) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f96943c;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public int size() {
        return this.f96944e;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f96944e * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this.f96944e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objKeyAt = keyAt(i11);
            if (objKeyAt != sb2) {
                sb2.append(objKeyAt);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(G5.T);
            Object objValueAt = valueAt(i11);
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

    public Object valueAt(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f96944e) {
            z10 = true;
        }
        if (!z10) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f96943c[(i10 << 1) + 1];
    }

    public t1(int i10) {
        this.f96942b = i10 == 0 ? a0.a.f3382a : new int[i10];
        this.f96943c = i10 == 0 ? a0.a.f3384c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(obj2, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(obj2, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, obj3);
        return true;
    }

    public /* synthetic */ t1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public t1(t1 t1Var) {
        this(0, 1, null);
        if (t1Var != null) {
            putAll(t1Var);
        }
    }
}
