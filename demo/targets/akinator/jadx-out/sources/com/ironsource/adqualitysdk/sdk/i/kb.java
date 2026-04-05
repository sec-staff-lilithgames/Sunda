package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class kb {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements InvocationHandler {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f3129 = {AbstractJsonLexerKt.COLON, GMTDateParser.DAY_OF_MONTH, 'g', 'x', GMTDateParser.SECONDS, 'p', 'a', 'a', 'o', 'j', 16, 'B', 'i', 'k', 'n', 'l', 'i', 'F', 'L', 'v', 'n', 'j', 'f', 'k', 'c', 'Z', 'b', '@', 'B', GMTDateParser.HOURS, GMTDateParser.MINUTES, 'r', 'r', 'k', 'D', 'I', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST, 16, '-', 'V', 'k', 'i', 'i', 'l', GMTDateParser.SECONDS, 'n', 'j', 'F', 'B', GMTDateParser.HOURS, GMTDateParser.MINUTES, 'r', 'r', 'k', 'D', 'I', 'p', 'p', 'r', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.COLON, 'p', 'l', GMTDateParser.MINUTES, 'O', 180, 206, 208, 211, 209, 206, 171, ';', 'r', 'i', 'b', 'j', 'n', 'l', 'n', 'G', '@', 'i', 'l', GMTDateParser.MINUTES, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'C', 'f', 'l', 't', 'n', 'k', 'j', 'C', 'D', 'k', '1', 'i', 'p', 'i', 'j', 'l', GMTDateParser.DAY_OF_MONTH, 'S', 'R', 'f', 'l', 'g', 'a', 'b', 'g', 'i', 'f', 'l', AbstractJsonLexerKt.STRING_ESC, 'T'};

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f3130 = 0;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f3131 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private Object f3132;

        /* renamed from: ｋ, reason: contains not printable characters */
        private c f3133;

        public a(Object obj, c cVar) {
            this.f3132 = obj;
            this.f3133 = cVar;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private Object m3173() {
            int i10 = f3131;
            Object obj = this.f3132;
            int i11 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f3130 = i11 % 128;
            if (i11 % 2 == 0) {
                return obj;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m3174(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
            String str2;
            byte[] bytes = str;
            if (str != null) {
                bytes = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = bytes;
            synchronized (g.f2307) {
                try {
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    int i12 = iArr[2];
                    int i13 = iArr[3];
                    char[] cArr = new char[i11];
                    System.arraycopy(f3129, i10, cArr, 0, i11);
                    if (bArr != null) {
                        char[] cArr2 = new char[i11];
                        g.f2306 = 0;
                        char c10 = 0;
                        while (true) {
                            int i14 = g.f2306;
                            if (i14 >= i11) {
                                break;
                            }
                            if (bArr[i14] == 1) {
                                cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                            } else {
                                cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                            }
                            c10 = cArr2[i14];
                            g.f2306 = i14 + 1;
                        }
                        cArr = cArr2;
                    }
                    if (i13 > 0) {
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr, 0, cArr3, 0, i11);
                        int i15 = i11 - i13;
                        System.arraycopy(cArr3, 0, cArr, i15, i13);
                        System.arraycopy(cArr3, i13, cArr, 0, i15);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        g.f2306 = 0;
                        while (true) {
                            int i16 = g.f2306;
                            if (i16 >= i11) {
                                break;
                            }
                            cArr4[i16] = cArr[(i11 - i16) - 1];
                            g.f2306 = i16 + 1;
                        }
                        cArr = cArr4;
                    }
                    if (i12 > 0) {
                        g.f2306 = 0;
                        while (true) {
                            int i17 = g.f2306;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr[i17] = (char) (cArr[i17] - iArr[2]);
                            g.f2306 = i17 + 1;
                        }
                    }
                    str2 = new String(cArr);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private Object m3175(Method method) {
            int i10 = (f3130 + 101) % 128;
            f3131 = i10;
            if (method == null) {
                return null;
            }
            f3130 = (i10 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            String name = method.getName();
            if (name.hashCode() != 1622498214 || !name.equals(m3174("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", false, new int[]{104, 20, 0, 15}).intern())) {
                return null;
            }
            int i11 = f3130 + 7;
            f3131 = i11 % 128;
            if (i11 % 2 == 0) {
                return null;
            }
            return m3173();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static Object[] m3176(Object[] objArr) {
            int i10 = f3130 + 99;
            f3131 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : objArr) {
                        if (Proxy.isProxyClass(obj.getClass())) {
                            int i11 = f3131 + 15;
                            f3130 = i11 % 128;
                            if (i11 % 2 != 0) {
                                arrayList.add(Proxy.getInvocationHandler(obj));
                                throw null;
                            }
                            arrayList.add(Proxy.getInvocationHandler(obj));
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList.toArray();
                } catch (Throwable th2) {
                    kd.m3203(m3174("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{0, 10, 0, 7}).intern(), m3174("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{75, 29, 0, 13}).intern(), th2, true);
                }
            }
            return objArr;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static boolean m3177(Method method) {
            String name = method.getName();
            if (name.hashCode() == 1622498214 && name.equals(m3174("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", false, new int[]{104, 20, 0, 15}).intern())) {
                f3130 = (f3131 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
                return true;
            }
            int i10 = f3131 + 73;
            f3130 = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object objM3175;
            int i10;
            int i11 = f3130 + 37;
            f3131 = i11 % 128;
            if (i11 % 2 == 0) {
                m3177(method);
                throw null;
            }
            if (m3177(method)) {
                try {
                    objM3175 = m3175(method);
                    i10 = f3131 + 57;
                } catch (Throwable th2) {
                    String strIntern = m3174("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{0, 10, 0, 7}).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m3174("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true, new int[]{10, 30, 0, 0}).intern());
                    sb2.append(method.getName());
                    kd.m3203(strIntern, sb2.toString(), th2, true);
                    return null;
                }
            } else {
                try {
                    this.f3133.mo2168(obj, method, objArr);
                } catch (Throwable th3) {
                    String strIntern2 = m3174("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{0, 10, 0, 7}).intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m3174("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true, new int[]{40, 23, 0, 0}).intern());
                    Object obj2 = this.f3132;
                    sb3.append(obj2 != null ? obj2.toString() : m3174("\u0001\u0001\u0000\u0000", false, new int[]{63, 4, 0, 3}).intern());
                    sb3.append(m3174("\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001", true, new int[]{67, 8, 101, 0}).intern());
                    sb3.append(method.getName());
                    kd.m3203(strIntern2, sb3.toString(), th3, true);
                }
                Object obj3 = this.f3132;
                if (obj3 != null) {
                    return method.invoke(obj3, objArr);
                }
                if (!Object.class.equals(method.getDeclaringClass())) {
                    return null;
                }
                objM3175 = method.invoke(this, m3176(objArr));
                i10 = f3131 + 93;
            }
            f3130 = i10 % 128;
            return objM3175;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        /* renamed from: ﻐ */
        void mo2168(Object obj, Method method, Object[] objArr);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m3171(Object obj) {
        return obj != null && Proxy.isProxyClass(obj.getClass()) && (obj instanceof hc);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m3172(Class<?> cls, Object obj, c cVar) {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, hc.class}, new a(obj, cVar));
    }
}
