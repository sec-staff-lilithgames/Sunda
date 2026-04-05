package com.bykv.vk.openvk.preload.a.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16901a;

    static {
        String property = System.getProperty("java.version");
        int iA = a(property);
        if (iA == -1) {
            iA = b(property);
        }
        if (iA == -1) {
            iA = 6;
        }
        f16901a = iA;
    }

    private static int a(String str) throws NumberFormatException {
        try {
            String[] strArrSplit = str.split("[._]");
            int i10 = Integer.parseInt(strArrSplit[0]);
            return (i10 != 1 || strArrSplit.length <= 1) ? i10 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb2.append(cCharAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int a() {
        return f16901a;
    }

    public static boolean b() {
        return f16901a >= 9;
    }
}
