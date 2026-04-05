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
public final class e extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final char[] f84358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84359c;

    /* renamed from: e, reason: collision with root package name */
    public final int f84360e;

    public e(char[] cArr, int i10, int i11) {
        this.f84358b = cArr;
        this.f84359c = i10;
        this.f84360e = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof Character) {
            return g.a(this.f84358b, ((Character) obj).charValue(), this.f84359c, this.f84360e) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        int size = size();
        if (eVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f84358b[this.f84359c + i10] != eVar.f84358b[eVar.f84359c + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f84359c; i10 < this.f84360e; i10++) {
            iHashCode = (iHashCode * 31) + Character.hashCode(this.f84358b[i10]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Character)) {
            return -1;
        }
        char cCharValue = ((Character) obj).charValue();
        int i10 = this.f84360e;
        char[] cArr = this.f84358b;
        int i11 = this.f84359c;
        int iA = g.a(cArr, cCharValue, i11, i10);
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
        if (obj instanceof Character) {
            char cCharValue = ((Character) obj).charValue();
            int i11 = this.f84360e;
            while (true) {
                i11--;
                i10 = this.f84359c;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f84358b[i11] == cCharValue) {
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
        return this.f84360e - this.f84359c;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Character> subList(int i10, int i11) {
        p1.checkPositionIndexes(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f84359c;
        return new e(this.f84358b, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 3);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        char[] cArr = this.f84358b;
        int i10 = this.f84359c;
        sb2.append(cArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f84360e) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(cArr[i10]);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Character get(int i10) {
        p1.checkElementIndex(i10, size());
        return Character.valueOf(this.f84358b[this.f84359c + i10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public Character set(int i10, Character ch2) {
        p1.checkElementIndex(i10, size());
        int i11 = this.f84359c;
        char[] cArr = this.f84358b;
        char c10 = cArr[i11 + i10];
        cArr[i11 + i10] = ((Character) p1.checkNotNull(ch2)).charValue();
        return Character.valueOf(c10);
    }
}
