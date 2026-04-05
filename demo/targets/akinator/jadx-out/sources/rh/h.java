package rh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final double[] f84365b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84366c;

    /* renamed from: e, reason: collision with root package name */
    public final int f84367e;

    public h(double[] dArr, int i10, int i11) {
        this.f84365b = dArr;
        this.f84366c = i10;
        this.f84367e = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Double) {
            return k.K(this.f84365b, ((Double) obj).doubleValue(), this.f84366c, this.f84367e) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        int size = size();
        if (hVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84365b[this.f84366c + i10] != hVar.f84365b[hVar.f84366c + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f84366c; i10 < this.f84367e; i10++) {
            iHashCode = (iHashCode * 31) + Double.hashCode(this.f84365b[i10]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f84367e;
        double[] dArr = this.f84365b;
        int i11 = this.f84366c;
        int iK = k.K(dArr, dDoubleValue, i11, i10);
        if (iK >= 0) {
            return iK - i11;
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
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            Pattern pattern = k.f84376b;
            int i11 = this.f84367e;
            while (true) {
                i11--;
                i10 = this.f84366c;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f84365b[i11] == dDoubleValue) {
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
        return this.f84367e - this.f84366c;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Double> subList(int i10, int i11) {
        p1.checkPositionIndexes(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f84366c;
        return new h(this.f84365b, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 12);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        double[] dArr = this.f84365b;
        int i10 = this.f84366c;
        sb2.append(dArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f84367e) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(dArr[i10]);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i10) {
        p1.checkElementIndex(i10, size());
        return Double.valueOf(this.f84365b[this.f84366c + i10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public Double set(int i10, Double d10) {
        p1.checkElementIndex(i10, size());
        int i11 = this.f84366c;
        double[] dArr = this.f84365b;
        double d11 = dArr[i11 + i10];
        dArr[i11 + i10] = ((Double) p1.checkNotNull(d10)).doubleValue();
        return Double.valueOf(d11);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator.OfDouble spliterator() {
        return Spliterators.spliterator(this.f84365b, this.f84366c, this.f84367e, 0);
    }
}
