package dx;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C3191e4;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {
    public static void a(StringBuilder sb2, Object obj, HashMap map) {
        if (obj == null) {
            sb2.append(AbstractJsonLexerKt.NULL);
            return;
        }
        if (!obj.getClass().isArray()) {
            try {
                sb2.append(obj.toString());
                return;
            } catch (Throwable th2) {
                k.report("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + C3191e4.i.f36531e, th2);
                sb2.append("[FAILED toString()]");
                return;
            }
        }
        int i10 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int length = zArr.length;
            while (i10 < length) {
                sb2.append(zArr[i10]);
                if (i10 != length - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int length2 = bArr.length;
            while (i10 < length2) {
                sb2.append((int) bArr[i10]);
                if (i10 != length2 - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int length3 = cArr.length;
            while (i10 < length3) {
                sb2.append(cArr[i10]);
                if (i10 != length3 - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int length4 = sArr.length;
            while (i10 < length4) {
                sb2.append((int) sArr[i10]);
                if (i10 != length4 - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int length5 = iArr.length;
            while (i10 < length5) {
                sb2.append(iArr[i10]);
                if (i10 != length5 - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int length6 = jArr.length;
            while (i10 < length6) {
                sb2.append(jArr[i10]);
                if (i10 != length6 - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int length7 = fArr.length;
            while (i10 < length7) {
                sb2.append(fArr[i10]);
                if (i10 != length7 - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int length8 = dArr.length;
            while (i10 < length8) {
                sb2.append(dArr[i10]);
                if (i10 != length8 - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        Object[] objArr = (Object[]) obj;
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        if (map.containsKey(objArr)) {
            sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        } else {
            map.put(objArr, null);
            int length9 = objArr.length;
            while (i10 < length9) {
                a(sb2, objArr[i10], map);
                if (i10 != length9 - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
            map.remove(objArr);
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
    }

    public static final a arrayFormat(String str, Object[] objArr) {
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            objArr = trimmedCopy(objArr);
        }
        return arrayFormat(str, objArr, throwableCandidate);
    }

    public static final a format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    public static Throwable getThrowableCandidate(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }

    public static final a format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dx.a arrayFormat(java.lang.String r7, java.lang.Object[] r8, java.lang.Throwable r9) {
        /*
            if (r7 != 0) goto L9
            dx.a r7 = new dx.a
            r0 = 0
            r7.<init>(r0, r8, r9)
            return r7
        L9:
            if (r8 != 0) goto L11
            dx.a r8 = new dx.a
            r8.<init>(r7)
            return r8
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length()
            int r1 = r1 + 50
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L1e:
            int r3 = r8.length
            if (r1 >= r3) goto L8a
            java.lang.String r3 = "{}"
            int r3 = r7.indexOf(r3, r2)
            r4 = -1
            if (r3 != r4) goto L43
            if (r2 != 0) goto L32
            dx.a r0 = new dx.a
            r0.<init>(r7, r8, r9)
            return r0
        L32:
            int r1 = r7.length()
            r0.append(r7, r2, r1)
            dx.a r7 = new dx.a
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r8, r9)
            return r7
        L43:
            if (r3 != 0) goto L46
            goto L79
        L46:
            int r4 = r3 + (-1)
            char r5 = r7.charAt(r4)
            r6 = 92
            if (r5 != r6) goto L79
            r5 = 2
            if (r3 < r5) goto L6c
            int r5 = r3 + (-2)
            char r5 = r7.charAt(r5)
            if (r5 != r6) goto L6c
            r0.append(r7, r2, r4)
            r2 = r8[r1]
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            a(r0, r2, r4)
        L68:
            int r3 = r3 + 2
        L6a:
            r2 = r3
            goto L87
        L6c:
            int r1 = r1 + (-1)
            r0.append(r7, r2, r4)
            r2 = 123(0x7b, float:1.72E-43)
            r0.append(r2)
            int r3 = r3 + 1
            goto L6a
        L79:
            r0.append(r7, r2, r3)
            r2 = r8[r1]
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            a(r0, r2, r4)
            goto L68
        L87:
            int r1 = r1 + 1
            goto L1e
        L8a:
            int r1 = r7.length()
            r0.append(r7, r2, r1)
            dx.a r7 = new dx.a
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dx.c.arrayFormat(java.lang.String, java.lang.Object[], java.lang.Throwable):dx.a");
    }
}
