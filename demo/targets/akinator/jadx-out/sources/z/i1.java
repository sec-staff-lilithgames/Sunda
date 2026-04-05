package z;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f96827a = m1.f96876a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f96828b = a0.a.f3384c;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f96829c = s1.getEmptyNodes();

    /* renamed from: d, reason: collision with root package name */
    public final int f96830d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public final int f96831e = Integer.MAX_VALUE;

    public i1(kotlin.jvm.internal.u uVar) {
    }

    public static /* synthetic */ String joinToString$default(i1 i1Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, kv.l lVar, int i11, Object obj) {
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
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        kv.l lVar2 = lVar;
        return i1Var.joinToString(charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public final boolean all(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96827a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        if (!((Boolean) predicate.invoke(this.f96828b[(i10 << 3) + i12])).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return false;
    }

    public final Set<Object> asSet() {
        return new k1(this);
    }

    public final boolean contains(Object obj) {
        long j10;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = (iHashCode ^ (iHashCode << 16)) & 127;
        do {
            long[] jArr = this.f96827a;
            j10 = jArr[0] | ((jArr[1] << 64) & ((-0) >> 63));
            long j11 = (i10 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                Long.numberOfTrailingZeros(j12);
                if (kotlin.jvm.internal.e0.areEqual(this.f96828b[0], obj)) {
                    return true;
                }
            }
        } while ((j10 & ((~j10) << 6) & (-9187201950435737472L)) == 0);
        return false;
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1
            if (r15 != r14) goto L4
            return r0
        L4:
            boolean r1 = r15 instanceof z.i1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z.i1 r15 = (z.i1) r15
            int r1 = r15.getSize()
            int r3 = r14.getSize()
            if (r1 == r3) goto L17
            return r2
        L17:
            long[] r1 = r14.f96827a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5d
            r4 = r2
        L1f:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L58
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L39:
            if (r9 >= r7) goto L56
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L52
            int r10 = r4 << 3
            int r10 = r10 + r9
            java.lang.Object[] r11 = r14.f96828b
            r10 = r11[r10]
            boolean r10 = r15.contains(r10)
            if (r10 != 0) goto L52
            return r2
        L52:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L56:
            if (r7 != r8) goto L5d
        L58:
            if (r4 == r3) goto L5d
            int r4 = r4 + 1
            goto L1f
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.i1.equals(java.lang.Object):boolean");
    }

    public final int findElementIndex$collection(Object obj) {
        long j10;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = (iHashCode ^ (iHashCode << 16)) & 127;
        do {
            long[] jArr = this.f96827a;
            j10 = jArr[0] | ((jArr[1] << 64) & ((-0) >> 63));
            long j11 = (i10 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                Long.numberOfTrailingZeros(j12);
                if (kotlin.jvm.internal.e0.areEqual(this.f96828b[0], obj)) {
                    return 0;
                }
            }
        } while ((j10 & ((~j10) << 6) & (-9187201950435737472L)) == 0);
        return -1;
    }

    public final Object first() {
        int i10 = this.f96831e;
        if (i10 != Integer.MAX_VALUE) {
            long j10 = this.f96829c[i10];
            return this.f96828b[i10];
        }
        a0.d.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new tu.k();
    }

    public final Object firstOrNull(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = this.f96831e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((this.f96829c[i10] >> 31) & 2147483647L);
            Object obj = this.f96828b[i10];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return obj;
            }
            i10 = i11;
        }
        return null;
    }

    public final void forEach(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int i10 = this.f96831e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((this.f96829c[i10] >> 31) & 2147483647L);
            block.invoke(this.f96828b[i10]);
            i10 = i11;
        }
    }

    public final void forEachIndex$collection(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int i10 = this.f96831e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((this.f96829c[i10] >> 31) & 2147483647L);
            block.invoke(Integer.valueOf(i10));
            i10 = i11;
        }
    }

    public final void forEachReverse(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        int i10 = this.f96830d;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (this.f96829c[i10] & 2147483647L);
            block.invoke(this.f96828b[i10]);
            i10 = i11;
        }
    }

    public final int getCapacity() {
        return 0;
    }

    public final int getSize() {
        return 0;
    }

    public int hashCode() {
        long[] jArr = this.f96827a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = this.f96828b[(i10 << 3) + i12];
                        if (!kotlin.jvm.internal.e0.areEqual(obj, this)) {
                            iHashCode += obj != null ? obj.hashCode() : 0;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean isNotEmpty() {
        return false;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final Object last() {
        int i10 = this.f96830d;
        if (i10 != Integer.MAX_VALUE) {
            long j10 = this.f96829c[i10];
            return this.f96828b[i10];
        }
        a0.d.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new tu.k();
    }

    public final Object lastOrNull(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = this.f96830d;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (this.f96829c[i10] & 2147483647L);
            Object obj = this.f96828b[i10];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return obj;
            }
            i10 = i11;
        }
        return null;
    }

    public final boolean none() {
        return true;
    }

    public final List<Object> toList() {
        ArrayList arrayList = new ArrayList(getSize());
        int i10 = this.f96831e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((this.f96829c[i10] >> 31) & 2147483647L);
            arrayList.add(this.f96828b[i10]);
            i10 = i11;
        }
        return arrayList;
    }

    public String toString() {
        return joinToString$default(this, null, C3191e4.i.f36529d, C3191e4.i.f36531e, 0, null, new h1(this), 25, null);
    }

    public final void unorderedForEach(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96827a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(this.f96828b[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void unorderedForEachIndex(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        long[] jArr = this.f96827a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean any(kv.l r14) {
        /*
            r13 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.e0.checkNotNullParameter(r14, r0)
            long[] r0 = r13.f96827a
            int r1 = r0.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L53
            r3 = r2
        Le:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L4e
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L28:
            if (r8 >= r6) goto L4c
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L48
            int r9 = r3 << 3
            int r9 = r9 + r8
            java.lang.Object[] r10 = r13.f96828b
            r9 = r10[r9]
            java.lang.Object r9 = r14.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L48
            r14 = 1
            return r14
        L48:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L28
        L4c:
            if (r6 != r7) goto L53
        L4e:
            if (r3 == r1) goto L53
            int r3 = r3 + 1
            goto Le
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.i1.any(kv.l):boolean");
    }

    public final int count(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.f96827a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        if (((Boolean) predicate.invoke(this.f96828b[(i10 << 3) + i13])).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final String joinToString(CharSequence separator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final Object first(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = this.f96831e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((this.f96829c[i10] >> 31) & 2147483647L);
            Object obj = this.f96828b[i10];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return obj;
            }
            i10 = i11;
        }
        a0.d.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new tu.k();
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    public final Object last(kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = this.f96830d;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (this.f96829c[i10] & 2147483647L);
            Object obj = this.f96828b[i10];
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                return obj;
            }
            i10 = i11;
        }
        a0.d.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new tu.k();
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int i11 = 0;
        int i12 = this.f96831e;
        while (true) {
            if (i12 != Integer.MAX_VALUE) {
                int i13 = (int) ((this.f96829c[i12] >> 31) & 2147483647L);
                Object obj = this.f96828b[i12];
                if (i11 == i10) {
                    sb2.append(truncated);
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                if (lVar == null) {
                    sb2.append(obj);
                } else {
                    sb2.append((CharSequence) lVar.invoke(obj));
                }
                i11++;
                i12 = i13;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getHead$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getNodes$annotations() {
    }

    public static /* synthetic */ void getTail$annotations() {
    }
}
