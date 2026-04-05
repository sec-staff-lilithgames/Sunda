package k2;

import com.ironsource.G5;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f70126a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f70127b;

    /* renamed from: c, reason: collision with root package name */
    public int f70128c;

    public c() {
        this(0, 1, null);
    }

    public final int a(int i10, Object key) {
        e0.checkNotNullParameter(key, "key");
        int i11 = this.f70128c;
        if (i11 == 0) {
            return -1;
        }
        int iBinarySearchInternal = a.binarySearchInternal(this.f70126a, i11, i10);
        if (iBinarySearchInternal < 0 || e0.areEqual(key, this.f70127b[iBinarySearchInternal << 1])) {
            return iBinarySearchInternal;
        }
        int i12 = iBinarySearchInternal + 1;
        while (i12 < i11 && this.f70126a[i12] == i10) {
            if (e0.areEqual(key, this.f70127b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iBinarySearchInternal - 1; i13 >= 0 && this.f70126a[i13] == i10; i13--) {
            if (e0.areEqual(key, this.f70127b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int b() {
        int i10 = this.f70128c;
        if (i10 == 0) {
            return -1;
        }
        int iBinarySearchInternal = a.binarySearchInternal(this.f70126a, i10, 0);
        if (iBinarySearchInternal < 0 || this.f70127b[iBinarySearchInternal << 1] == null) {
            return iBinarySearchInternal;
        }
        int i11 = iBinarySearchInternal + 1;
        while (i11 < i10 && this.f70126a[i11] == 0) {
            if (this.f70127b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iBinarySearchInternal - 1; i12 >= 0 && this.f70126a[i12] == 0; i12--) {
            if (this.f70127b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f70128c > 0) {
            this.f70126a = a.f70115a;
            this.f70127b = a.f70116b;
            this.f70128c = 0;
        }
        if (this.f70128c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return indexOfValue$ui_text_release(obj) >= 0;
    }

    public final void ensureCapacity(int i10) {
        int i11 = this.f70128c;
        int[] iArr = this.f70126a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f70126a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f70127b, i10 << 1);
            e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f70127b = objArrCopyOf;
        }
        if (this.f70128c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f70128c;
                if (i10 != cVar.f70128c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objKeyAt = keyAt(i11);
                    Object objValueAt = valueAt(i11);
                    Object obj2 = cVar.get(objKeyAt);
                    if (objValueAt == null) {
                        if (obj2 != null || !cVar.containsKey(objKeyAt)) {
                            return false;
                        }
                    } else if (!e0.areEqual(objValueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f70128c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f70128c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objKeyAt2 = keyAt(i13);
                Object objValueAt2 = valueAt(i13);
                Object obj3 = ((Map) obj).get(objKeyAt2);
                if (objValueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objKeyAt2)) {
                        return false;
                    }
                } else if (!e0.areEqual(objValueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object get(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return this.f70127b[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? this.f70127b[(iIndexOfKey << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f70126a;
        Object[] objArr = this.f70127b;
        int i10 = this.f70128c;
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

    public final int indexOfKey(Object obj) {
        return obj == null ? b() : a(obj.hashCode(), obj);
    }

    public final int indexOfValue$ui_text_release(Object obj) {
        int i10 = this.f70128c << 1;
        Object[] objArr = this.f70127b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (e0.areEqual(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f70128c <= 0;
    }

    public final Object keyAt(int i10) {
        return this.f70127b[i10 << 1];
    }

    public final Object put(Object obj, Object obj2) {
        int iHashCode;
        int iA;
        int i10 = this.f70128c;
        if (obj == null) {
            iA = b();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iA = a(iHashCode, obj);
        }
        if (iA >= 0) {
            int i11 = (iA << 1) + 1;
            Object[] objArr = this.f70127b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iA;
        int[] iArr = this.f70126a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f70126a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f70127b, i13 << 1);
            e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f70127b = objArrCopyOf;
            if (i10 != this.f70128c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f70126a;
            int i14 = i12 + 1;
            f0.copyInto(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f70127b;
            f0.copyInto(objArr2, objArr2, i14 << 1, i12 << 1, this.f70128c << 1);
        }
        int i15 = this.f70128c;
        if (i10 == i15) {
            int[] iArr3 = this.f70126a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f70127b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f70128c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(c array) {
        e0.checkNotNullParameter(array, "array");
        int i10 = array.f70128c;
        ensureCapacity(this.f70128c + i10);
        if (this.f70128c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(array.keyAt(i11), array.valueAt(i11));
            }
        } else if (i10 > 0) {
            f0.copyInto(array.f70126a, this.f70126a, 0, 0, i10);
            f0.copyInto(array.f70127b, this.f70127b, 0, 0, i10 << 1);
            this.f70128c = i10;
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public final Object removeAt(int i10) {
        Object[] objArr = this.f70127b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f70128c;
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f70126a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                f0.copyInto(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f70127b;
                f0.copyInto(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f70127b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArr2 = new int[i16];
            this.f70126a = iArr2;
            this.f70127b = new Object[i16 << 1];
            if (i10 > 0) {
                f0.copyInto(iArr, iArr2, 0, 0, i10);
                f0.copyInto(objArr, this.f70127b, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                f0.copyInto(iArr, this.f70126a, i10, i17, i12);
                f0.copyInto(objArr, this.f70127b, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f70128c) {
            throw new ConcurrentModificationException();
        }
        this.f70128c = i13;
        return obj;
    }

    public final Object replace(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, obj2);
        }
        return null;
    }

    public final Object setValueAt(int i10, Object obj) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f70127b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final int size() {
        return this.f70128c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f70128c * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this.f70128c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objKeyAt = keyAt(i11);
            if (objKeyAt != this) {
                sb2.append(objKeyAt);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(G5.T);
            Object objValueAt = valueAt(i11);
            if (objValueAt != this) {
                sb2.append(objValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public final Object valueAt(int i10) {
        return this.f70127b[(i10 << 1) + 1];
    }

    public c(int i10) {
        if (i10 == 0) {
            this.f70126a = a.f70115a;
            this.f70127b = a.f70116b;
        } else {
            this.f70126a = new int[i10];
            this.f70127b = new Object[i10 << 1];
        }
        this.f70128c = 0;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0 || !e0.areEqual(obj2, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey < 0 || valueAt(iIndexOfKey) != obj2) {
            return false;
        }
        setValueAt(iIndexOfKey, obj3);
        return true;
    }

    public /* synthetic */ c(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public c(c cVar) {
        this(0, 1, null);
        if (cVar != null) {
            putAll(cVar);
        }
    }

    public static /* synthetic */ void size$annotations() {
    }
}
