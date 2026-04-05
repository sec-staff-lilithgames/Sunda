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
public final class a extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f84344b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84345c;

    /* renamed from: e, reason: collision with root package name */
    public final int f84346e;

    public a(boolean[] zArr, int i10, int i11) {
        this.f84344b = zArr;
        this.f84345c = i10;
        this.f84346e = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Boolean) {
            return d.a(this.f84344b, ((Boolean) obj).booleanValue(), this.f84345c, this.f84346e) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        a aVar = (a) obj;
        int size = size();
        if (aVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84344b[this.f84345c + i10] != aVar.f84344b[aVar.f84345c + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f84345c; i10 < this.f84346e; i10++) {
            iHashCode = (iHashCode * 31) + Boolean.hashCode(this.f84344b[i10]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f84346e;
        boolean[] zArr = this.f84344b;
        int i11 = this.f84345c;
        int iA = d.a(zArr, zBooleanValue, i11, i10);
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
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            int i11 = this.f84346e;
            while (true) {
                i11--;
                i10 = this.f84345c;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f84344b[i11] == zBooleanValue) {
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
        return this.f84346e - this.f84345c;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Boolean> subList(int i10, int i11) {
        p1.checkPositionIndexes(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f84345c;
        return new a(this.f84344b, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 7);
        boolean[] zArr = this.f84344b;
        int i10 = this.f84345c;
        sb2.append(zArr[i10] ? "[true" : "[false");
        while (true) {
            i10++;
            if (i10 >= this.f84346e) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(zArr[i10] ? ", true" : ", false");
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i10) {
        p1.checkElementIndex(i10, size());
        return Boolean.valueOf(this.f84344b[this.f84345c + i10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean set(int i10, Boolean bool) {
        p1.checkElementIndex(i10, size());
        int i11 = this.f84345c;
        boolean[] zArr = this.f84344b;
        boolean z10 = zArr[i11 + i10];
        zArr[i11 + i10] = ((Boolean) p1.checkNotNull(bool)).booleanValue();
        return Boolean.valueOf(z10);
    }
}
