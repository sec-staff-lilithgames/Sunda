package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okio.Buffer;
import com.ironsource.C3191e4;
import j1.o2;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (e0.compare((int) cCharAt, 31) <= 0 || e0.compare((int) cCharAt, 127) >= 0 || n0.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (e0.compare((int) cCharAt, 48) < 0 || e0.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r0 = r11 - r12;
        java.lang.System.arraycopy(r8, r12, r8, 16 - r0, r0);
        java.util.Arrays.fill(r8, r12, (16 - r11) + r12, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        return java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r16, int r17, int r18) {
        /*
            r6 = r18
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = r9
            r12 = r10
            r13 = r12
        Ld:
            r14 = 0
            if (r2 >= r6) goto L91
            if (r11 != r7) goto L13
            return r14
        L13:
            int r15 = r2 + 2
            if (r15 > r6) goto L33
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            r0 = r16
            boolean r1 = sv.k0.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L33
            if (r12 == r10) goto L27
            return r14
        L27:
            int r11 = r11 + 2
            if (r15 != r6) goto L2e
            r12 = r11
            goto L91
        L2e:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L62
        L33:
            if (r11 == 0) goto L44
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = sv.k0.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L48
            int r2 = r2 + 1
        L44:
            r0 = r16
            r13 = r2
            goto L62
        L48:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = sv.k0.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L61
            int r1 = r11 + (-2)
            boolean r0 = decodeIpv4Suffix(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L5e
            return r14
        L5e:
            int r11 = r11 + 2
            goto L91
        L61:
            return r14
        L62:
            r1 = r9
            r2 = r13
        L64:
            if (r2 >= r6) goto L76
            char r3 = r0.charAt(r2)
            int r3 = com.applovin.shadow.okhttp3.internal.Util.parseHexDigit(r3)
            if (r3 == r10) goto L76
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L64
        L76:
            int r3 = r2 - r13
            if (r3 == 0) goto L90
            r4 = 4
            if (r3 <= r4) goto L7e
            goto L90
        L7e:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto Ld
        L90:
            return r14
        L91:
            if (r11 == r7) goto La2
            if (r12 != r10) goto L96
            return r14
        L96:
            int r0 = r11 - r12
            int r1 = 16 - r0
            java.lang.System.arraycopy(r8, r12, r8, r1, r0)
            int r7 = r7 - r11
            int r7 = r7 + r12
            java.util.Arrays.fill(r8, r12, r7, r9)
        La2:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        Buffer buffer = new Buffer();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                buffer.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i11], 255) << 8) | Util.and(bArr[i11 + 1], 255));
                i11 += 2;
            }
        }
        return buffer.readUtf8();
    }

    public static final String toCanonicalHost(String str) {
        e0.checkNotNullParameter(str, "<this>");
        if (n0.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
            InetAddress inetAddressDecodeIpv6 = (k0.startsWith$default(str, C3191e4.i.f36529d, false, 2, null) && k0.endsWith$default(str, C3191e4.i.f36531e, false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                e0.checkNotNullExpressionValue(address, "address");
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new AssertionError(o2.f('\'', "Invalid IPv6 address: '", str));
        }
        try {
            String ascii = IDN.toASCII(str);
            e0.checkNotNullExpressionValue(ascii, "toASCII(host)");
            Locale US = Locale.US;
            e0.checkNotNullExpressionValue(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                return null;
            }
            if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
