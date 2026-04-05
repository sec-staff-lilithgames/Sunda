package yv;

import com.ironsource.C3191e4;
import j1.o2;
import java.io.EOFException;
import kotlin.jvm.internal.e0;
import qv.v;
import sv.n0;
import sv.x;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final x f96664a = new x("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return f96664a.matches(str);
    }

    public static final byte[] canonicalizeInetAddress(byte[] address) {
        e0.checkNotNullParameter(address, "address");
        if (address.length == 16) {
            int i10 = 0;
            while (true) {
                if (i10 < 10) {
                    if (address[i10] != 0) {
                        break;
                    }
                    i10++;
                } else if (address[10] == -1 && address[11] == -1) {
                    return k0.sliceArray(address, v.until(12, 16));
                }
            }
        }
        return address;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(String str) {
        e0.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (e0.compare((int) cCharAt, 31) <= 0 || e0.compare((int) cCharAt, 127) >= 0 || n0.indexOf$default((CharSequence) " #%/:?@[\\]", cCharAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsInvalidLabelLengths(String str) {
        e0.checkNotNullParameter(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i10 = 0;
            while (true) {
                String str2 = str;
                int iIndexOf$default = n0.indexOf$default((CharSequence) str2, '.', i10, false, 4, (Object) null);
                int length2 = iIndexOf$default == -1 ? str2.length() - i10 : iIndexOf$default - i10;
                if (1 > length2 || length2 >= 64) {
                    break;
                }
                if (iIndexOf$default == -1 || iIndexOf$default == str2.length() - 1) {
                    break;
                }
                i10 = iIndexOf$default + 1;
                str = str2;
            }
            return false;
        }
        return true;
    }

    public static final boolean decodeIpv4Suffix(String input, int i10, int i11, byte[] address, int i12) {
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(address, "address");
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == address.length) {
                return false;
            }
            if (i13 != i12) {
                if (input.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = input.charAt(i14);
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
            address[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        uu.f0.copyInto(r8, r8, 16 - (r11 - r12), r12, r11);
        uu.f0.fill(r8, (byte) 0, r12, (16 - r11) + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] decodeIpv6(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r6 = r18
            java.lang.String r1 = "input"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r1)
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = r9
            r12 = r10
            r13 = r12
        L14:
            r14 = 0
            if (r2 >= r6) goto L95
            if (r11 != r7) goto L1a
            return r14
        L1a:
            int r15 = r2 + 2
            if (r15 > r6) goto L38
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            boolean r1 = sv.k0.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L38
            if (r12 == r10) goto L2c
            return r14
        L2c:
            int r11 = r11 + 2
            if (r15 != r6) goto L33
            r12 = r11
            goto L95
        L33:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L67
        L38:
            if (r11 == 0) goto L49
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = sv.k0.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L4d
            int r2 = r2 + 1
        L49:
            r0 = r16
            r13 = r2
            goto L67
        L4d:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = sv.k0.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L66
            int r1 = r11 + (-2)
            boolean r0 = decodeIpv4Suffix(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L63
            return r14
        L63:
            int r11 = r11 + 2
            goto L95
        L66:
            return r14
        L67:
            r1 = r9
            r2 = r13
        L69:
            if (r2 >= r6) goto L7b
            char r3 = r0.charAt(r2)
            int r3 = yv.h.parseHexDigit(r3)
            if (r3 == r10) goto L7b
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L69
        L7b:
            int r3 = r2 - r13
            if (r3 == 0) goto L94
            r4 = 4
            if (r3 <= r4) goto L83
            goto L94
        L83:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto L14
        L94:
            return r14
        L95:
            if (r11 == r7) goto La6
            if (r12 != r10) goto L9a
            return r14
        L9a:
            int r0 = r11 - r12
            int r0 = 16 - r0
            uu.f0.copyInto(r8, r8, r0, r12, r11)
            int r7 = r7 - r11
            int r7 = r7 + r12
            uu.f0.fill(r8, r9, r12, r7)
        La6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yv.f.decodeIpv6(java.lang.String, int, int):byte[]");
    }

    public static final String idnToAscii(String host) throws EOFException {
        e0.checkNotNullParameter(host, "host");
        pw.g gVarWriteUtf8 = new pw.g().writeUtf8(host);
        pw.g gVar = new pw.g();
        while (!gVarWriteUtf8.exhausted()) {
            if (!hw.b.getIDNA_MAPPING_TABLE().map(gVarWriteUtf8.readUtf8CodePoint(), gVar)) {
                return null;
            }
        }
        gVarWriteUtf8.writeUtf8(g.normalizeNfc(gVar.readUtf8()));
        hw.d dVar = hw.d.f59270a;
        String strDecode = dVar.decode(gVarWriteUtf8.readUtf8());
        if (strDecode != null && e0.areEqual(strDecode, g.normalizeNfc(strDecode))) {
            return dVar.encode(strDecode);
        }
        return null;
    }

    public static final String inet4AddressToAscii(byte[] address) {
        e0.checkNotNullParameter(address, "address");
        if (address.length == 4) {
            return new pw.g().writeDecimalLong(h.and(address[0], 255)).writeByte(46).writeDecimalLong(h.and(address[1], 255)).writeByte(46).writeDecimalLong(h.and(address[2], 255)).writeByte(46).writeDecimalLong(h.and(address[3], 255)).readUtf8();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final String inet6AddressToAscii(byte[] address) {
        e0.checkNotNullParameter(address, "address");
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        pw.g gVar = new pw.g();
        while (i11 < address.length) {
            if (i11 == i10) {
                gVar.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    gVar.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    gVar.writeByte(58);
                }
                gVar.writeHexadecimalUnsignedLong((h.and(address[i11], 255) << 8) | h.and(address[i11 + 1], 255));
                i11 += 2;
            }
        }
        return gVar.readUtf8();
    }

    public static final String toCanonicalHost(String str) {
        e0.checkNotNullParameter(str, "<this>");
        if (!n0.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
            String strIdnToAscii = idnToAscii(str);
            if (strIdnToAscii == null || strIdnToAscii.length() == 0 || containsInvalidHostnameAsciiCodes(strIdnToAscii) || containsInvalidLabelLengths(strIdnToAscii)) {
                return null;
            }
            return strIdnToAscii;
        }
        byte[] bArrDecodeIpv6 = (sv.k0.startsWith$default(str, C3191e4.i.f36529d, false, 2, null) && sv.k0.endsWith$default(str, C3191e4.i.f36531e, false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (bArrDecodeIpv6 == null) {
            return null;
        }
        byte[] bArrCanonicalizeInetAddress = canonicalizeInetAddress(bArrDecodeIpv6);
        if (bArrCanonicalizeInetAddress.length == 16) {
            return inet6AddressToAscii(bArrCanonicalizeInetAddress);
        }
        if (bArrCanonicalizeInetAddress.length == 4) {
            return inet4AddressToAscii(bArrCanonicalizeInetAddress);
        }
        throw new AssertionError(o2.f('\'', "Invalid IPv6 address: '", str));
    }
}
