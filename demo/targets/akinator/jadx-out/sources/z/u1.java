package z;

import com.ironsource.G5;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class u1 implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f96948b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int[] f96949c;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object[] f96950e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f96951f;

    public u1() {
        this(0, 1, null);
    }

    public void append(int i10, Object obj) {
        int i11 = this.f96951f;
        if (i11 != 0 && i10 <= this.f96949c[i11 - 1]) {
            put(i10, obj);
            return;
        }
        if (this.f96948b && i11 >= this.f96949c.length) {
            v1.access$gc(this);
        }
        int i12 = this.f96951f;
        if (i12 >= this.f96949c.length) {
            int iIdealIntArraySize = a0.a.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f96949c, iIdealIntArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f96949c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f96950e, iIdealIntArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f96950e = objArrCopyOf;
        }
        this.f96949c[i12] = i10;
        this.f96950e[i12] = obj;
        this.f96951f = i12 + 1;
    }

    public void clear() {
        int i10 = this.f96951f;
        Object[] objArr = this.f96950e;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f96951f = 0;
        this.f96948b = false;
    }

    public boolean containsKey(int i10) {
        return indexOfKey(i10) >= 0;
    }

    public boolean containsValue(Object obj) {
        if (this.f96948b) {
            v1.access$gc(this);
        }
        int i10 = this.f96951f;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (this.f96950e[i11] == obj) {
                break;
            }
            i11++;
        }
        return i11 >= 0;
    }

    @tu.f
    public void delete(int i10) {
        remove(i10);
    }

    public Object get(int i10) {
        return v1.commonGet(this, i10);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i10) {
        if (this.f96948b) {
            v1.access$gc(this);
        }
        return a0.a.binarySearch(this.f96949c, this.f96951f, i10);
    }

    public int indexOfValue(Object obj) {
        if (this.f96948b) {
            v1.access$gc(this);
        }
        int i10 = this.f96951f;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f96950e[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i10) {
        if (this.f96948b) {
            v1.access$gc(this);
        }
        return this.f96949c[i10];
    }

    public void put(int i10, Object obj) {
        int iBinarySearch = a0.a.binarySearch(this.f96949c, this.f96951f, i10);
        if (iBinarySearch >= 0) {
            this.f96950e[iBinarySearch] = obj;
            return;
        }
        int i11 = ~iBinarySearch;
        if (i11 < this.f96951f && this.f96950e[i11] == v1.f96957a) {
            this.f96949c[i11] = i10;
            this.f96950e[i11] = obj;
            return;
        }
        if (this.f96948b && this.f96951f >= this.f96949c.length) {
            v1.access$gc(this);
            i11 = ~a0.a.binarySearch(this.f96949c, this.f96951f, i10);
        }
        int i12 = this.f96951f;
        if (i12 >= this.f96949c.length) {
            int iIdealIntArraySize = a0.a.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f96949c, iIdealIntArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f96949c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f96950e, iIdealIntArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f96950e = objArrCopyOf;
        }
        int i13 = this.f96951f;
        if (i13 - i11 != 0) {
            int[] iArr = this.f96949c;
            int i14 = i11 + 1;
            uu.f0.copyInto(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f96950e;
            uu.f0.copyInto(objArr, objArr, i14, i11, this.f96951f);
        }
        this.f96949c[i11] = i10;
        this.f96950e[i11] = obj;
        this.f96951f++;
    }

    public void putAll(u1 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = other.keyAt(i10);
            Object objValueAt = other.valueAt(i10);
            int iBinarySearch = a0.a.binarySearch(this.f96949c, this.f96951f, iKeyAt);
            if (iBinarySearch >= 0) {
                this.f96950e[iBinarySearch] = objValueAt;
            } else {
                int i11 = ~iBinarySearch;
                if (i11 >= this.f96951f || this.f96950e[i11] != v1.f96957a) {
                    if (this.f96948b && this.f96951f >= this.f96949c.length) {
                        v1.access$gc(this);
                        i11 = ~a0.a.binarySearch(this.f96949c, this.f96951f, iKeyAt);
                    }
                    int i12 = this.f96951f;
                    if (i12 >= this.f96949c.length) {
                        int iIdealIntArraySize = a0.a.idealIntArraySize(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.f96949c, iIdealIntArraySize);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                        this.f96949c = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.f96950e, iIdealIntArraySize);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        this.f96950e = objArrCopyOf;
                    }
                    int i13 = this.f96951f;
                    if (i13 - i11 != 0) {
                        int[] iArr = this.f96949c;
                        int i14 = i11 + 1;
                        uu.f0.copyInto(iArr, iArr, i14, i11, i13);
                        Object[] objArr = this.f96950e;
                        uu.f0.copyInto(objArr, objArr, i14, i11, this.f96951f);
                    }
                    this.f96949c[i11] = iKeyAt;
                    this.f96950e[i11] = objValueAt;
                    this.f96951f++;
                } else {
                    this.f96949c[i11] = iKeyAt;
                    this.f96950e[i11] = objValueAt;
                }
            }
        }
    }

    public Object putIfAbsent(int i10, Object obj) {
        Object objCommonGet = v1.commonGet(this, i10);
        if (objCommonGet == null) {
            int iBinarySearch = a0.a.binarySearch(this.f96949c, this.f96951f, i10);
            if (iBinarySearch >= 0) {
                this.f96950e[iBinarySearch] = obj;
                return objCommonGet;
            }
            int i11 = ~iBinarySearch;
            if (i11 < this.f96951f && this.f96950e[i11] == v1.f96957a) {
                this.f96949c[i11] = i10;
                this.f96950e[i11] = obj;
                return objCommonGet;
            }
            if (this.f96948b && this.f96951f >= this.f96949c.length) {
                v1.access$gc(this);
                i11 = ~a0.a.binarySearch(this.f96949c, this.f96951f, i10);
            }
            int i12 = this.f96951f;
            if (i12 >= this.f96949c.length) {
                int iIdealIntArraySize = a0.a.idealIntArraySize(i12 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.f96949c, iIdealIntArraySize);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                this.f96949c = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f96950e, iIdealIntArraySize);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                this.f96950e = objArrCopyOf;
            }
            int i13 = this.f96951f;
            if (i13 - i11 != 0) {
                int[] iArr = this.f96949c;
                int i14 = i11 + 1;
                uu.f0.copyInto(iArr, iArr, i14, i11, i13);
                Object[] objArr = this.f96950e;
                uu.f0.copyInto(objArr, objArr, i14, i11, this.f96951f);
            }
            this.f96949c[i11] = i10;
            this.f96950e[i11] = obj;
            this.f96951f++;
        }
        return objCommonGet;
    }

    public void remove(int i10) {
        v1.commonRemove(this, i10);
    }

    public void removeAt(int i10) {
        if (this.f96950e[i10] != v1.f96957a) {
            this.f96950e[i10] = v1.f96957a;
            this.f96948b = true;
        }
    }

    public void removeAtRange(int i10, int i11) {
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            removeAt(i10);
            i10++;
        }
    }

    public Object replace(int i10, Object obj) {
        int iIndexOfKey = indexOfKey(i10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.f96950e;
        Object obj2 = objArr[iIndexOfKey];
        objArr[iIndexOfKey] = obj;
        return obj2;
    }

    public void setValueAt(int i10, Object obj) {
        if (this.f96948b) {
            v1.access$gc(this);
        }
        this.f96950e[i10] = obj;
    }

    public int size() {
        if (this.f96948b) {
            v1.access$gc(this);
        }
        return this.f96951f;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f96951f * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this.f96951f;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(keyAt(i11));
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
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public Object valueAt(int i10) {
        if (this.f96948b) {
            v1.access$gc(this);
        }
        Object[] objArr = this.f96950e;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public u1(int i10) {
        if (i10 == 0) {
            this.f96949c = a0.a.f3382a;
            this.f96950e = a0.a.f3384c;
        } else {
            int iIdealIntArraySize = a0.a.idealIntArraySize(i10);
            this.f96949c = new int[iIdealIntArraySize];
            this.f96950e = new Object[iIdealIntArraySize];
        }
    }

    public u1 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.e0.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        u1 u1Var = (u1) objClone;
        u1Var.f96949c = (int[]) this.f96949c.clone();
        u1Var.f96950e = (Object[]) this.f96950e.clone();
        return u1Var;
    }

    public Object get(int i10, Object obj) {
        return v1.commonGet(this, i10, obj);
    }

    public boolean remove(int i10, Object obj) {
        int iIndexOfKey = indexOfKey(i10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(obj, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(int i10, Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(i10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(this.f96950e[iIndexOfKey], obj)) {
            return false;
        }
        this.f96950e[iIndexOfKey] = obj2;
        return true;
    }

    public /* synthetic */ u1(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
