package rh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f84391b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84392c;

    /* renamed from: e, reason: collision with root package name */
    public final int f84393e;

    public t(int[] iArr, int i10, int i11) {
        this.f84391b = iArr;
        this.f84392c = i10;
        this.f84393e = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return w.a(this.f84391b, ((Integer) obj).intValue(), this.f84392c, this.f84393e) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return super.equals(obj);
        }
        t tVar = (t) obj;
        int size = size();
        if (tVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84391b[this.f84392c + i10] != tVar.f84391b[tVar.f84392c + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f84392c; i10 < this.f84393e; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f84391b[i10]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f84393e;
        int[] iArr = this.f84391b;
        int i11 = this.f84392c;
        int iA = w.a(iArr, iIntValue, i11, i10);
        if (iA >= 0) {
            return iA - i11;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f84393e;
            while (true) {
                i11--;
                i10 = this.f84392c;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f84391b[i11] == iIntValue) {
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f84393e - this.f84392c;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Integer> subList(int i10, int i11) {
        p1.checkPositionIndexes(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f84392c;
        return new t(this.f84391b, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.f84391b;
        int i10 = this.f84392c;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f84393e) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i10) {
        p1.checkElementIndex(i10, size());
        return Integer.valueOf(this.f84391b[this.f84392c + i10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer set(int i10, Integer num) {
        p1.checkElementIndex(i10, size());
        int i11 = this.f84392c;
        int[] iArr = this.f84391b;
        int i12 = iArr[i11 + i10];
        iArr[i11 + i10] = ((Integer) p1.checkNotNull(num)).intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator.OfInt spliterator() {
        return Spliterators.spliterator(this.f84391b, this.f84392c, this.f84393e, 0);
    }
}
