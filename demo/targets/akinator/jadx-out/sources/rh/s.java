package rh;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final s f84387f = new s(new int[0], 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final int[] f84388b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f84389c;

    /* renamed from: e, reason: collision with root package name */
    public final int f84390e;

    public s(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static r builder(int i10) {
        p1.checkArgument(i10 >= 0, "Invalid initialCapacity: %s", i10);
        return new r(i10);
    }

    public static s copyOf(int[] iArr) {
        return iArr.length == 0 ? f84387f : new s(Arrays.copyOf(iArr, iArr.length));
    }

    public static s of() {
        return f84387f;
    }

    public List<Integer> asList() {
        return new p(this);
    }

    public boolean contains(int i10) {
        return indexOf(i10) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (length() != sVar.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length(); i10++) {
            if (get(i10) != sVar.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public void forEach(IntConsumer intConsumer) {
        p1.checkNotNull(intConsumer);
        for (int i10 = this.f84389c; i10 < this.f84390e; i10++) {
            intConsumer.accept(this.f84388b[i10]);
        }
    }

    public int get(int i10) {
        p1.checkElementIndex(i10, length());
        return this.f84388b[this.f84389c + i10];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f84389c; i10 < this.f84390e; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f84388b[i10]);
        }
        return iHashCode;
    }

    public int indexOf(int i10) {
        int i11 = this.f84389c;
        for (int i12 = i11; i12 < this.f84390e; i12++) {
            if (this.f84388b[i12] == i10) {
                return i12 - i11;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f84390e == this.f84389c;
    }

    public int lastIndexOf(int i10) {
        int i11;
        int i12 = this.f84390e;
        do {
            i12--;
            i11 = this.f84389c;
            if (i12 < i11) {
                return -1;
            }
        } while (this.f84388b[i12] != i10);
        return i12 - i11;
    }

    public int length() {
        return this.f84390e - this.f84389c;
    }

    public IntStream stream() {
        return Arrays.stream(this.f84388b, this.f84389c, this.f84390e);
    }

    public s subArray(int i10, int i11) {
        p1.checkPositionIndexes(i10, i11, length());
        if (i10 == i11) {
            return f84387f;
        }
        int i12 = this.f84389c;
        return new s(this.f84388b, i10 + i12, i12 + i11);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.f84388b, this.f84389c, this.f84390e);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.f84388b;
        int i10 = this.f84389c;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f84390e) {
                sb2.append(AbstractJsonLexerKt.END_LIST);
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }

    public s trimmed() {
        if (this.f84389c <= 0) {
            if (this.f84390e >= this.f84388b.length) {
                return this;
            }
        }
        return new s(toArray());
    }

    public s(int[] iArr, int i10, int i11) {
        this.f84388b = iArr;
        this.f84389c = i10;
        this.f84390e = i11;
    }

    public static s copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? f84387f : new s(w.toArray(collection));
    }

    public static s of(int i10) {
        return new s(new int[]{i10}, 0, 1);
    }

    public static r builder() {
        return new r(10);
    }

    public static s copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Integer>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static s of(int i10, int i11) {
        return new s(new int[]{i10, i11}, 0, 2);
    }

    public static s copyOf(IntStream intStream) {
        int[] array = intStream.toArray();
        return array.length == 0 ? f84387f : new s(array, 0, array.length);
    }

    public static s of(int i10, int i11, int i12) {
        return new s(new int[]{i10, i11, i12}, 0, 3);
    }

    public static s of(int i10, int i11, int i12, int i13) {
        return new s(new int[]{i10, i11, i12, i13}, 0, 4);
    }

    public static s of(int i10, int i11, int i12, int i13, int i14) {
        return new s(new int[]{i10, i11, i12, i13, i14}, 0, 5);
    }

    public static s of(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new s(new int[]{i10, i11, i12, i13, i14, i15}, 0, 6);
    }

    public static s of(int i10, int... iArr) {
        p1.checkArgument(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = i10;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new s(iArr2, 0, length);
    }
}
