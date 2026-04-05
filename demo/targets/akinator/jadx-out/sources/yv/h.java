package yv;

import b0.e2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import pw.j;
import pw.k;
import pw.l;
import pw.l0;
import pw.n0;
import pw.r;
import uu.k0;
import uu.o0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f96665a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f96666b;

    static {
        l0.a aVar = l0.f81916e;
        l.a aVar2 = l.f81911f;
        f96666b = aVar.of(aVar2.decodeHex("efbbbf"), aVar2.decodeHex("feff"), aVar2.decodeHex("fffe0000"), aVar2.decodeHex("fffe"), aVar2.decodeHex("0000feff"));
    }

    public static final <E> void addIfAbsent(List<E> list, E e10) {
        e0.checkNotNullParameter(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbR = e2.r(j10, "length=", ", offset=");
            sbR.append(j11);
            throw new ArrayIndexOutOfBoundsException(e2.i(j11, ", count=", sbR));
        }
    }

    public static final void closeQuietly(Closeable closeable) throws IOException {
        e0.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String value) {
        e0.checkNotNullParameter(strArr, "<this>");
        e0.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[k0.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static final void deleteContents(r rVar, n0 directory) throws IOException {
        e0.checkNotNullParameter(rVar, "<this>");
        e0.checkNotNullParameter(directory, "directory");
        try {
            IOException iOException = null;
            for (n0 n0Var : rVar.list(directory)) {
                try {
                    if (rVar.metadata(n0Var).isDirectory()) {
                        deleteContents(rVar, n0Var);
                    }
                    rVar.delete(n0Var);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void deleteIfExists(r rVar, n0 path) throws IOException {
        e0.checkNotNullParameter(rVar, "<this>");
        e0.checkNotNullParameter(path, "path");
        try {
            rVar.delete(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int delimiterOffset(String str, String delimiters, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (sv.n0.contains$default((CharSequence) delimiters, str.charAt(i10), false, 2, (Object) null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, str2, i10, i11);
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, kv.l predicate) {
        e0.checkNotNullParameter(iterable, "<this>");
        e0.checkNotNullParameter(predicate, "predicate");
        List<T> listEmptyList = p0.emptyList();
        for (T t10 : iterable) {
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                e0.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>");
                h1.asMutableList(listEmptyList).add(t10);
            }
        }
        return listEmptyList;
    }

    public static final l0 getUNICODE_BOMS() {
        return f96666b;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        e0.checkNotNullParameter(strArr, "<this>");
        e0.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator it = kotlin.jvm.internal.i.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void ignoreIoExceptions(kv.a block) {
        e0.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    public static final int indexOf(String[] strArr, String value, Comparator<String> comparator) {
        e0.checkNotNullParameter(strArr, "<this>");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        e0.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (e0.compare((int) cCharAt, 31) <= 0 || e0.compare((int) cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfNonWhitespace(String str, int i10) {
        e0.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return indexOfNonWhitespace(str, i10);
    }

    public static final <T> List<T> interleave(Iterable<? extends T> a10, Iterable<? extends T> b10) {
        e0.checkNotNullParameter(a10, "a");
        e0.checkNotNullParameter(b10, "b");
        Iterator<? extends T> it = a10.iterator();
        Iterator<? extends T> it2 = b10.iterator();
        List listCreateListBuilder = o0.createListBuilder();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return o0.build(listCreateListBuilder);
            }
            if (it.hasNext()) {
                listCreateListBuilder.add(it.next());
            }
            if (it2.hasNext()) {
                listCreateListBuilder.add(it2.next());
            }
        }
    }

    public static final String[] intersect(String[] strArr, String[] other, Comparator<? super String> comparator) {
        e0.checkNotNullParameter(strArr, "<this>");
        e0.checkNotNullParameter(other, "other");
        e0.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isCivilized(pw.r r2, pw.n0 r3) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r0)
            pw.z0 r0 = r2.sink(r3)
            r2.delete(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L24
            r2 = 1
            if (r0 == 0) goto L17
            r0.close()     // Catch: java.lang.Throwable -> L17
        L17:
            return r2
        L18:
            r1 = move-exception
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Throwable -> L1f
            goto L2f
        L1f:
            r0 = move-exception
            tu.h.addSuppressed(r1, r0)
            goto L2f
        L24:
            if (r0 == 0) goto L2d
            r0.close()     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r0 = move-exception
        L2b:
            r1 = r0
            goto L2f
        L2d:
            r0 = 0
            goto L2b
        L2f:
            if (r1 != 0) goto L36
            r2.delete(r3)
            r2 = 0
            return r2
        L36:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.h.isCivilized(pw.r, pw.n0):boolean");
    }

    public static final boolean isSensitiveHeader(String name) {
        e0.checkNotNullParameter(name, "name");
        return sv.k0.equals(name, "Authorization", true) || sv.k0.equals(name, "Cookie", true) || sv.k0.equals(name, "Proxy-Authorization", true) || sv.k0.equals(name, "Set-Cookie", true);
    }

    public static final int parseHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final int readMedium(k kVar) throws IOException {
        e0.checkNotNullParameter(kVar, "<this>");
        return and(kVar.readByte(), 255) | (and(kVar.readByte(), 255) << 16) | (and(kVar.readByte(), 255) << 8);
    }

    public static final int skipAll(pw.g gVar, byte b10) throws EOFException {
        e0.checkNotNullParameter(gVar, "<this>");
        int i10 = 0;
        while (!gVar.exhausted() && gVar.getByte(0L) == b10) {
            i10++;
            gVar.readByte();
        }
        return i10;
    }

    public static final long toLongOrDefault(String str, long j10) {
        e0.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int toNonNegativeInt(String str, int i10) throws NumberFormatException {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String trimSubstring(String str, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i10, i11);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i11));
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return trimSubstring(str, i10, i11);
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> suppressed) {
        e0.checkNotNullParameter(exc, "<this>");
        e0.checkNotNullParameter(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            tu.h.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(j jVar, int i10) throws IOException {
        e0.checkNotNullParameter(jVar, "<this>");
        jVar.writeByte((i10 >>> 16) & 255);
        jVar.writeByte((i10 >>> 8) & 255);
        jVar.writeByte(i10 & 255);
    }

    public static final int and(short s10, int i10) {
        return s10 & i10;
    }

    public static final int delimiterOffset(String str, char c10, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final long and(int i10, long j10) {
        return i10 & j10;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, c10, i10, i11);
    }
}
