package io.odeeo.internal.w0;

import hr.kNq.ikJMrW;
import io.odeeo.internal.t0.u;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.w0.a$a, reason: collision with other inner class name */
    public static class C0680a extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final boolean[] f67302a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67303b;

        /* renamed from: c, reason: collision with root package name */
        public final int f67304c;

        public C0680a(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        public boolean[] a() {
            return Arrays.copyOfRange(this.f67302a, this.f67303b, this.f67304c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && a.c(this.f67302a, ((Boolean) obj).booleanValue(), this.f67303b, this.f67304c) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0680a)) {
                return super.equals(obj);
            }
            C0680a c0680a = (C0680a) obj;
            int size = size();
            if (c0680a.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f67302a[this.f67303b + i10] != c0680a.f67302a[c0680a.f67303b + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i10 = this.f67303b; i10 < this.f67304c; i10++) {
                iHashCode = (iHashCode * 31) + a.hashCode(this.f67302a[i10]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iC;
            if (!(obj instanceof Boolean) || (iC = a.c(this.f67302a, ((Boolean) obj).booleanValue(), this.f67303b, this.f67304c)) < 0) {
                return -1;
            }
            return iC - this.f67303b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iD;
            if (!(obj instanceof Boolean) || (iD = a.d(this.f67302a, ((Boolean) obj).booleanValue(), this.f67303b, this.f67304c)) < 0) {
                return -1;
            }
            return iD - this.f67303b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f67304c - this.f67303b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i10, int i11) {
            u.checkPositionIndexes(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.f67302a;
            int i12 = this.f67303b;
            return new C0680a(zArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 7);
            sb2.append(this.f67302a[this.f67303b] ? "[true" : "[false");
            int i10 = this.f67303b;
            while (true) {
                i10++;
                if (i10 >= this.f67304c) {
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                    return sb2.toString();
                }
                sb2.append(this.f67302a[i10] ? ", true" : ", false");
            }
        }

        public C0680a(boolean[] zArr, int i10, int i11) {
            this.f67302a = zArr;
            this.f67303b = i10;
            this.f67304c = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i10) {
            u.checkElementIndex(i10, size());
            return Boolean.valueOf(this.f67302a[this.f67303b + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i10, Boolean bool) {
            u.checkElementIndex(i10, size());
            boolean[] zArr = this.f67302a;
            int i11 = this.f67303b + i10;
            boolean z10 = zArr[i11];
            zArr[i11] = ((Boolean) u.checkNotNull(bool)).booleanValue();
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b implements Comparator<Boolean> {
        TRUE_FIRST(1, ikJMrW.wLf),
        FALSE_FIRST(-1, "Booleans.falseFirst()");


        /* renamed from: a, reason: collision with root package name */
        public final int f67308a;

        /* renamed from: b, reason: collision with root package name */
        public final String f67309b;

        b(int i10, String str) {
            this.f67308a = i10;
            this.f67309b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f67309b;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.f67308a : 0) - (bool.booleanValue() ? this.f67308a : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i10 = 0; i10 < iMin; i10++) {
                int iCompare = a.compare(zArr[i10], zArr2[i10]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    public static List<Boolean> asList(boolean... zArr) {
        return zArr.length == 0 ? Collections.EMPTY_LIST : new C0680a(zArr);
    }

    public static int c(boolean[] zArr, boolean z10, int i10, int i11) {
        while (i10 < i11) {
            if (zArr[i10] == z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int compare(boolean z10, boolean z11) {
        if (z10 == z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    public static boolean[] concat(boolean[]... zArr) {
        int length = 0;
        for (boolean[] zArr2 : zArr) {
            length += zArr2.length;
        }
        boolean[] zArr3 = new boolean[length];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z10) {
        for (boolean z11 : zArr) {
            if (z11 == z10) {
                return true;
            }
        }
        return false;
    }

    public static int countTrue(boolean... zArr) {
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (z10) {
                i10++;
            }
        }
        return i10;
    }

    public static int d(boolean[] zArr, boolean z10, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (zArr[i12] == z10) {
                return i12;
            }
        }
        return -1;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i10, int i11) {
        u.checkArgument(i10 >= 0, "Invalid minLength: %s", i10);
        u.checkArgument(i11 >= 0, "Invalid padding: %s", i11);
        return zArr.length < i10 ? Arrays.copyOf(zArr, i10 + i11) : zArr;
    }

    public static Comparator<Boolean> falseFirst() {
        return b.FALSE_FIRST;
    }

    public static int hashCode(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int indexOf(boolean[] zArr, boolean z10) {
        return c(zArr, z10, 0, zArr.length);
    }

    public static String join(String str, boolean... zArr) {
        u.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zArr.length * 7);
        sb2.append(zArr[0]);
        for (int i10 = 1; i10 < zArr.length; i10++) {
            sb2.append(str);
            sb2.append(zArr[i10]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(boolean[] zArr, boolean z10) {
        return d(zArr, z10, 0, zArr.length);
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return c.INSTANCE;
    }

    public static void reverse(boolean[] zArr) {
        u.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof C0680a) {
            return ((C0680a) collection).a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = ((Boolean) u.checkNotNull(array[i10])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> trueFirst() {
        return b.TRUE_FIRST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(boolean[] r5, boolean[] r6) {
        /*
            java.lang.String r0 = "array"
            io.odeeo.internal.t0.u.checkNotNull(r5, r0)
            java.lang.String r0 = "target"
            io.odeeo.internal.t0.u.checkNotNull(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            boolean r3 = r5[r3]
            boolean r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.w0.a.indexOf(boolean[], boolean[]):int");
    }

    public static void reverse(boolean[] zArr, int i10, int i11) {
        u.checkNotNull(zArr);
        u.checkPositionIndexes(i10, i11, zArr.length);
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[i12];
            zArr[i12] = z10;
            i10++;
        }
    }
}
