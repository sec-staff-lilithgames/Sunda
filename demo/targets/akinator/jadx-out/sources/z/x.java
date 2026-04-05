package z;

import com.ironsource.G5;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class x implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f96982b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long[] f96983c;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object[] f96984e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f96985f;

    public x() {
        this(0, 1, null);
    }

    public void append(long j10, Object obj) {
        int i10 = this.f96985f;
        if (i10 != 0 && j10 <= this.f96983c[i10 - 1]) {
            put(j10, obj);
            return;
        }
        if (this.f96982b) {
            long[] jArr = this.f96983c;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f96984e;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = objArr[i12];
                    if (obj2 != a0.f96768a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj2;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f96982b = false;
                this.f96985f = i11;
            }
        }
        int i13 = this.f96985f;
        if (i13 >= this.f96983c.length) {
            int iIdealLongArraySize = a0.a.idealLongArraySize(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f96983c, iIdealLongArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f96983c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f96984e, iIdealLongArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f96984e = objArrCopyOf;
        }
        this.f96983c[i13] = j10;
        this.f96984e[i13] = obj;
        this.f96985f = i13 + 1;
    }

    public void clear() {
        int i10 = this.f96985f;
        Object[] objArr = this.f96984e;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f96985f = 0;
        this.f96982b = false;
    }

    public boolean containsKey(long j10) {
        return indexOfKey(j10) >= 0;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    @tu.f
    public void delete(long j10) {
        int iBinarySearch = a0.a.binarySearch(this.f96983c, this.f96985f, j10);
        if (iBinarySearch < 0 || this.f96984e[iBinarySearch] == a0.f96768a) {
            return;
        }
        this.f96984e[iBinarySearch] = a0.f96768a;
        this.f96982b = true;
    }

    public Object get(long j10) {
        int iBinarySearch = a0.a.binarySearch(this.f96983c, this.f96985f, j10);
        if (iBinarySearch < 0 || this.f96984e[iBinarySearch] == a0.f96768a) {
            return null;
        }
        return this.f96984e[iBinarySearch];
    }

    public int indexOfKey(long j10) {
        if (this.f96982b) {
            int i10 = this.f96985f;
            long[] jArr = this.f96983c;
            Object[] objArr = this.f96984e;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != a0.f96768a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f96982b = false;
            this.f96985f = i11;
        }
        return a0.a.binarySearch(this.f96983c, this.f96985f, j10);
    }

    public int indexOfValue(Object obj) {
        if (this.f96982b) {
            int i10 = this.f96985f;
            long[] jArr = this.f96983c;
            Object[] objArr = this.f96984e;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj2 = objArr[i12];
                if (obj2 != a0.f96768a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj2;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f96982b = false;
            this.f96985f = i11;
        }
        int i13 = this.f96985f;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f96984e[i14] == obj) {
                return i14;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i10) {
        if (i10 < 0 || i10 >= this.f96985f) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f96982b) {
            int i11 = this.f96985f;
            long[] jArr = this.f96983c;
            Object[] objArr = this.f96984e;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != a0.f96768a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f96982b = false;
            this.f96985f = i12;
        }
        return this.f96983c[i10];
    }

    public void put(long j10, Object obj) {
        int iBinarySearch = a0.a.binarySearch(this.f96983c, this.f96985f, j10);
        if (iBinarySearch >= 0) {
            this.f96984e[iBinarySearch] = obj;
            return;
        }
        int i10 = ~iBinarySearch;
        if (i10 < this.f96985f && this.f96984e[i10] == a0.f96768a) {
            this.f96983c[i10] = j10;
            this.f96984e[i10] = obj;
            return;
        }
        if (this.f96982b) {
            int i11 = this.f96985f;
            long[] jArr = this.f96983c;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f96984e;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != a0.f96768a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f96982b = false;
                this.f96985f = i12;
                i10 = ~a0.a.binarySearch(this.f96983c, i12, j10);
            }
        }
        int i14 = this.f96985f;
        if (i14 >= this.f96983c.length) {
            int iIdealLongArraySize = a0.a.idealLongArraySize(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f96983c, iIdealLongArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f96983c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f96984e, iIdealLongArraySize);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f96984e = objArrCopyOf;
        }
        int i15 = this.f96985f;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f96983c;
            int i16 = i10 + 1;
            uu.f0.copyInto(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f96984e;
            uu.f0.copyInto(objArr2, objArr2, i16, i10, this.f96985f);
        }
        this.f96983c[i10] = j10;
        this.f96984e[i10] = obj;
        this.f96985f++;
    }

    public void putAll(x other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    public Object putIfAbsent(long j10, Object obj) {
        Object obj2 = get(j10);
        if (obj2 == null) {
            put(j10, obj);
        }
        return obj2;
    }

    public void remove(long j10) {
        int iBinarySearch = a0.a.binarySearch(this.f96983c, this.f96985f, j10);
        if (iBinarySearch < 0 || this.f96984e[iBinarySearch] == a0.f96768a) {
            return;
        }
        this.f96984e[iBinarySearch] = a0.f96768a;
        this.f96982b = true;
    }

    public void removeAt(int i10) {
        if (this.f96984e[i10] != a0.f96768a) {
            this.f96984e[i10] = a0.f96768a;
            this.f96982b = true;
        }
    }

    public Object replace(long j10, Object obj) {
        int iIndexOfKey = indexOfKey(j10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.f96984e;
        Object obj2 = objArr[iIndexOfKey];
        objArr[iIndexOfKey] = obj;
        return obj2;
    }

    public void setValueAt(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f96985f) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f96982b) {
            int i11 = this.f96985f;
            long[] jArr = this.f96983c;
            Object[] objArr = this.f96984e;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj2 = objArr[i13];
                if (obj2 != a0.f96768a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj2;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f96982b = false;
            this.f96985f = i12;
        }
        this.f96984e[i10] = obj;
    }

    public int size() {
        if (this.f96982b) {
            int i10 = this.f96985f;
            long[] jArr = this.f96983c;
            Object[] objArr = this.f96984e;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != a0.f96768a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f96982b = false;
            this.f96985f = i11;
        }
        return this.f96985f;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f96985f * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = this.f96985f;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(keyAt(i11));
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
        if (i10 < 0 || i10 >= this.f96985f) {
            a0.d.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f96982b) {
            int i11 = this.f96985f;
            long[] jArr = this.f96983c;
            Object[] objArr = this.f96984e;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != a0.f96768a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f96982b = false;
            this.f96985f = i12;
        }
        return this.f96984e[i10];
    }

    public x(int i10) {
        if (i10 == 0) {
            this.f96983c = a0.a.f3383b;
            this.f96984e = a0.a.f3384c;
        } else {
            int iIdealLongArraySize = a0.a.idealLongArraySize(i10);
            this.f96983c = new long[iIdealLongArraySize];
            this.f96984e = new Object[iIdealLongArraySize];
        }
    }

    public x clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.e0.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        x xVar = (x) objClone;
        xVar.f96983c = (long[]) this.f96983c.clone();
        xVar.f96984e = (Object[]) this.f96984e.clone();
        return xVar;
    }

    public Object get(long j10, Object obj) {
        int iBinarySearch = a0.a.binarySearch(this.f96983c, this.f96985f, j10);
        return (iBinarySearch < 0 || this.f96984e[iBinarySearch] == a0.f96768a) ? obj : this.f96984e[iBinarySearch];
    }

    public boolean replace(long j10, Object obj, Object obj2) {
        int iIndexOfKey = indexOfKey(j10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(this.f96984e[iIndexOfKey], obj)) {
            return false;
        }
        this.f96984e[iIndexOfKey] = obj2;
        return true;
    }

    public boolean remove(long j10, Object obj) {
        int iIndexOfKey = indexOfKey(j10);
        if (iIndexOfKey < 0 || !kotlin.jvm.internal.e0.areEqual(obj, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public /* synthetic */ x(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
