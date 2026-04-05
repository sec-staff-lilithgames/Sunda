package rh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f84377b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84378c;

    /* renamed from: e, reason: collision with root package name */
    public final int f84379e;

    public l(float[] fArr, int i10, int i11) {
        this.f84377b = fArr;
        this.f84378c = i10;
        this.f84379e = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Float) {
            return o.a(this.f84377b, ((Float) obj).floatValue(), this.f84378c, this.f84379e) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        int size = size();
        if (lVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84377b[this.f84378c + i10] != lVar.f84377b[lVar.f84378c + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f84378c; i10 < this.f84379e; i10++) {
            iHashCode = (iHashCode * 31) + Float.hashCode(this.f84377b[i10]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f84379e;
        float[] fArr = this.f84377b;
        int i11 = this.f84378c;
        int iA = o.a(fArr, fFloatValue, i11, i10);
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
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            int i11 = this.f84379e;
            while (true) {
                i11--;
                i10 = this.f84378c;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f84377b[i11] == fFloatValue) {
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
        return this.f84379e - this.f84378c;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Float> subList(int i10, int i11) {
        p1.checkPositionIndexes(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f84378c;
        return new l(this.f84377b, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 12);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        float[] fArr = this.f84377b;
        int i10 = this.f84378c;
        sb2.append(fArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f84379e) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(fArr[i10]);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i10) {
        p1.checkElementIndex(i10, size());
        return Float.valueOf(this.f84377b[this.f84378c + i10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public Float set(int i10, Float f10) {
        p1.checkElementIndex(i10, size());
        int i11 = this.f84378c;
        float[] fArr = this.f84377b;
        float f11 = fArr[i11 + i10];
        fArr[i11 + i10] = ((Float) p1.checkNotNull(f10)).floatValue();
        return Float.valueOf(f11);
    }
}
