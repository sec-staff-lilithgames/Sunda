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
public final class z extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f84400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84401c;

    /* renamed from: e, reason: collision with root package name */
    public final int f84402e;

    public z(long[] jArr, int i10, int i11) {
        this.f84400b = jArr;
        this.f84401c = i10;
        this.f84402e = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Long) {
            return b0.a(this.f84400b, ((Long) obj).longValue(), this.f84401c, this.f84402e) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        int size = size();
        if (zVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84400b[this.f84401c + i10] != zVar.f84400b[zVar.f84401c + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f84401c; i10 < this.f84402e; i10++) {
            iHashCode = (iHashCode * 31) + Long.hashCode(this.f84400b[i10]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f84402e;
        long[] jArr = this.f84400b;
        int i11 = this.f84401c;
        int iA = b0.a(jArr, jLongValue, i11, i10);
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
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            int i11 = this.f84402e;
            while (true) {
                i11--;
                i10 = this.f84401c;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f84400b[i11] == jLongValue) {
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
        return this.f84402e - this.f84401c;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Long> subList(int i10, int i11) {
        p1.checkPositionIndexes(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f84401c;
        return new z(this.f84400b, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 10);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        long[] jArr = this.f84400b;
        int i10 = this.f84401c;
        sb2.append(jArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f84402e) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(jArr[i10]);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i10) {
        p1.checkElementIndex(i10, size());
        return Long.valueOf(this.f84400b[this.f84401c + i10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public Long set(int i10, Long l9) {
        p1.checkElementIndex(i10, size());
        int i11 = this.f84401c;
        long[] jArr = this.f84400b;
        long j10 = jArr[i11 + i10];
        jArr[i11 + i10] = ((Long) p1.checkNotNull(l9)).longValue();
        return Long.valueOf(j10);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator.OfLong spliterator() {
        return Spliterators.spliterator(this.f84400b, this.f84401c, this.f84402e, 0);
    }
}
