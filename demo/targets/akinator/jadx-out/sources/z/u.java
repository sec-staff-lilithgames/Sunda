package z;

import bp.oM.DwaEpyvxz;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C3191e4;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public long[] f96945a;

    /* renamed from: b, reason: collision with root package name */
    public int f96946b;

    public u(int i10, kotlin.jvm.internal.u uVar) {
        this.f96945a = i10 == 0 ? w.getEmptyLongArray() : new long[i10];
    }

    public static /* synthetic */ int binarySearch$default(u uVar, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = uVar.f96946b;
        }
        return uVar.binarySearch(i10, i11, i12);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(u uVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return uVar.joinToString(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean any() {
        return this.f96946b != 0;
    }

    public final int binarySearch(int i10) {
        return binarySearch$default(this, i10, 0, 0, 6, null);
    }

    public final boolean contains(long j10) {
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (jArr[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(u elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        qv.m mVarUntil = qv.v.until(0, elements.f96946b);
        int first = mVarUntil.getFirst();
        int last = mVarUntil.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final int count() {
        return this.f96946b;
    }

    public final long elementAt(int i10) {
        if (i10 < 0 || i10 >= this.f96946b) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.f96945a[i10];
    }

    public final long elementAtOrElse(int i10, kv.l defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= this.f96946b) ? ((Number) defaultValue.invoke(Integer.valueOf(i10))).longValue() : this.f96945a[i10];
    }

    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            int i10 = uVar.f96946b;
            int i11 = this.f96946b;
            if (i10 == i11) {
                long[] jArr = this.f96945a;
                long[] jArr2 = uVar.f96945a;
                qv.m mVarUntil = qv.v.until(0, i11);
                int first = mVarUntil.getFirst();
                int last = mVarUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (jArr[first] == jArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final long first() {
        if (this.f96946b == 0) {
            a0.d.throwNoSuchElementException("LongList is empty.");
        }
        return this.f96945a[0];
    }

    public final <R> R fold(R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = (R) operation.invoke(r10, Long.valueOf(jArr[i11]));
        }
        return r10;
    }

    public final <R> R foldIndexed(R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = (R) operation.invoke(Integer.valueOf(i11), r11, Long.valueOf(jArr[i11]));
        }
        return r10;
    }

    public final <R> R foldRight(R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(Long.valueOf(jArr[i10]), r10);
        }
    }

    public final <R> R foldRightIndexed(R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = (R) operation.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]), r10);
        }
    }

    public final void forEach(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Long.valueOf(jArr[i11]));
        }
    }

    public final void forEachIndexed(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i11]));
        }
    }

    public final void forEachReversed(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Long.valueOf(jArr[i10]));
            }
        }
    }

    public final void forEachReversedIndexed(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]));
            }
        }
    }

    public final long get(int i10) {
        if (i10 < 0 || i10 >= this.f96946b) {
            a0.d.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.f96945a[i10];
    }

    public final qv.m getIndices() {
        return qv.v.until(0, this.f96946b);
    }

    public final int getLastIndex() {
        return this.f96946b - 1;
    }

    public final int getSize() {
        return this.f96946b;
    }

    public int hashCode() {
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(long j10) {
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j10 == jArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfFirst(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i11]))).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(jArr[i10]))).booleanValue());
        return i10;
    }

    public final boolean isEmpty() {
        return this.f96946b == 0;
    }

    public final boolean isNotEmpty() {
        return this.f96946b != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final long last() {
        if (this.f96946b == 0) {
            a0.d.throwNoSuchElementException("LongList is empty.");
        }
        return this.f96945a[this.f96946b - 1];
    }

    public final int lastIndexOf(long j10) {
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (jArr[i10] != j10);
        return i10;
    }

    public final boolean none() {
        return this.f96946b == 0;
    }

    public final boolean reversedAny(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96945a;
        for (int i10 = this.f96946b - 1; -1 < i10; i10--) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i10]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, 25, null);
    }

    public final boolean any(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i11]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int binarySearch(int i10, int i11) {
        return binarySearch$default(this, i10, i11, 0, 4, null);
    }

    public final int count(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((Boolean) predicate.invoke(Long.valueOf(jArr[i12]))).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final String joinToString(CharSequence separator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final int binarySearch(int i10, int i11, int i12) {
        if (i11 < 0 || i11 >= i12 || i12 > this.f96946b) {
            a0.d.throwIndexOutOfBoundsException("");
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            long j10 = this.f96945a[i14];
            long j11 = i10;
            if (j10 < j11) {
                i11 = i14 + 1;
            } else {
                if (j10 <= j11) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final long first(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j10 = jArr[i11];
            if (((Boolean) predicate.invoke(Long.valueOf(j10))).booleanValue()) {
                return j10;
            }
        }
        throw new NoSuchElementException("LongList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(u uVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence charSequence, kv.l lVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                separator = ", ";
            }
            if ((i11 & 2) != 0) {
                prefix = "";
            }
            if ((i11 & 4) != 0) {
                postfix = "";
            }
            if ((i11 & 8) != 0) {
                i10 = -1;
            }
            if ((i11 & 16) != 0) {
                charSequence = APSSharedUtil.TRUNCATE_SEPARATOR;
            }
            kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
            kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
            kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
            StringBuilder sbG = w0.i.g(charSequence, "truncated", lVar, "transform", prefix);
            long[] jArr = uVar.f96945a;
            int i12 = uVar.f96946b;
            int i13 = 0;
            while (true) {
                if (i13 < i12) {
                    long j10 = jArr[i13];
                    if (i13 == i10) {
                        sbG.append(charSequence);
                        break;
                    }
                    if (i13 != 0) {
                        sbG.append(separator);
                    }
                    sbG.append((CharSequence) lVar.invoke(Long.valueOf(j10)));
                    i13++;
                } else {
                    sbG.append(postfix);
                    break;
                }
            }
            String string = sbG.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    public final long last(kv.l predicate) {
        long j10;
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        do {
            i10--;
            if (-1 < i10) {
                j10 = jArr[i10];
            } else {
                throw new NoSuchElementException("LongList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Long.valueOf(j10))).booleanValue());
        return j10;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i10, CharSequence charSequence2, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, DwaEpyvxz.zcU);
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        StringBuilder sbG = w0.i.g(charSequence2, "truncated", lVar, "transform", prefix);
        long[] jArr = this.f96945a;
        int i11 = this.f96946b;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                long j10 = jArr[i12];
                if (i12 == i10) {
                    sbG.append(charSequence2);
                    break;
                }
                if (i12 != 0) {
                    sbG.append(charSequence);
                }
                sbG.append((CharSequence) lVar.invoke(Long.valueOf(j10)));
                i12++;
            } else {
                sbG.append(postfix);
                break;
            }
        }
        String string = sbG.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i10, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbG = w0.i.g(charSequence, "postfix", lVar, "transform", prefix);
        long[] jArr = this.f96945a;
        int i11 = this.f96946b;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                long j10 = jArr[i12];
                if (i12 == i10) {
                    sbG.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i12 != 0) {
                    sbG.append(separator);
                }
                sbG.append((CharSequence) lVar.invoke(Long.valueOf(j10)));
                i12++;
            } else {
                sbG.append(charSequence);
                break;
            }
        }
        String string = sbG.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbG = w0.i.g(charSequence, "postfix", lVar, "transform", prefix);
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                long j10 = jArr[i11];
                if (i11 == -1) {
                    sbG.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i11 != 0) {
                    sbG.append(separator);
                }
                sbG.append((CharSequence) lVar.invoke(Long.valueOf(j10)));
                i11++;
            } else {
                sbG.append(charSequence);
                break;
            }
        }
        String string = sbG.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence charSequence, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        StringBuilder sbG = w0.i.g(charSequence, "prefix", lVar, "transform", charSequence);
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                long j10 = jArr[i11];
                if (i11 == -1) {
                    sbG.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i11 != 0) {
                    sbG.append(separator);
                }
                sbG.append((CharSequence) lVar.invoke(Long.valueOf(j10)));
                i11++;
            } else {
                sbG.append((CharSequence) "");
                break;
            }
        }
        String string = sbG.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f96945a;
        int i11 = this.f96946b;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                long j10 = jArr[i12];
                if (i12 == i10) {
                    sb2.append(truncated);
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(j10);
                i12++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String joinToString(CharSequence separator, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                long j10 = jArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append((CharSequence) transform.invoke(Long.valueOf(j10)));
                i11++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String joinToString(kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        long[] jArr = this.f96945a;
        int i10 = this.f96946b;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                long j10 = jArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i11 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) transform.invoke(Long.valueOf(j10)));
                i11++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
