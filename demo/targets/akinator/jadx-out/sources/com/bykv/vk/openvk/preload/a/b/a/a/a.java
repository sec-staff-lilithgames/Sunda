package com.bykv.vk.openvk.preload.a.b.a.a;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f16784a = DesugarTimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0 A[Catch: IllegalArgumentException -> 0x004c, NumberFormatException -> 0x004f, IndexOutOfBoundsException -> 0x0052, TryCatch #2 {IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:23:0x005c, B:25:0x006c, B:26:0x006e, B:28:0x007a, B:29:0x007d, B:31:0x0083, B:35:0x008d, B:40:0x009d, B:42:0x00a5, B:53:0x00da, B:55:0x00e0, B:57:0x00e6, B:81:0x0176, B:61:0x00f0, B:62:0x0108, B:63:0x0109, B:67:0x0119, B:69:0x0126, B:72:0x012f, B:74:0x0143, B:77:0x0152, B:78:0x0171, B:80:0x0174, B:66:0x0115, B:83:0x01a7, B:84:0x01ae, B:46:0x00bd, B:47:0x00c0), top: B:95:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a7 A[Catch: IllegalArgumentException -> 0x004c, NumberFormatException -> 0x004f, IndexOutOfBoundsException -> 0x0052, TryCatch #2 {IndexOutOfBoundsException -> 0x0052, NumberFormatException -> 0x004f, IllegalArgumentException -> 0x004c, blocks: (B:3:0x0006, B:5:0x0019, B:6:0x001b, B:8:0x0027, B:9:0x0029, B:11:0x0038, B:13:0x003e, B:23:0x005c, B:25:0x006c, B:26:0x006e, B:28:0x007a, B:29:0x007d, B:31:0x0083, B:35:0x008d, B:40:0x009d, B:42:0x00a5, B:53:0x00da, B:55:0x00e0, B:57:0x00e6, B:81:0x0176, B:61:0x00f0, B:62:0x0108, B:63:0x0109, B:67:0x0119, B:69:0x0126, B:72:0x012f, B:74:0x0143, B:77:0x0152, B:78:0x0171, B:80:0x0174, B:66:0x0115, B:83:0x01a7, B:84:0x01ae, B:46:0x00bd, B:47:0x00c0), top: B:95:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date a(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.a.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    private static int a(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }

    private static int a(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
