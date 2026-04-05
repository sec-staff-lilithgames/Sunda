package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3O {
    public static byte[] A02;
    public static String[] A03 = {"xt7OJkzoRAU9F21vTA99nWdYHEgU1aqe", "agkrpda7Xp", "R", "5vNqnHOJCumqZOnLm9qFfz6JcwPphcfm", "ZSdlC9FQn5pQkXbUirih3rU8AE2dOqgO", "058ZJGrrLXJjuDHx9oXjnYONx8ueRFml", "p8wyR2SRaX4jfTsJEE0Ho6ErxYgTWBLm", "ZJmK2n287z"};
    public final File A00;
    public final File A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-69, 15, 10, -69, -3, -4, -2, 6, 16, 11, -69, 1, 4, 7, 0, -69, -43, 9, 8, 18, -64, -13, -18, -20, -24, -30, -59, -24, -21, -28, 6, 50, 56, 47, 39, 49, -22, 55, -29, 38, 53, 40, 36, 55, 40, -29, -13, 31, 37, 28, 20, 30, -41, 36, -48, 34, 21, 30, 17, 29, 21, -48, 22, 25, 28, 21, -48};
    }

    static {
        A02();
    }

    public C3O(File file) {
        this.A01 = file;
        this.A00 = new File(file.getPath() + A00(16, 4, 88));
    }

    private void A01() {
        if (this.A00.exists()) {
            this.A01.delete();
            this.A00.renameTo(this.A01);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3N] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.ads.redexgen.X.3N] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.C3N A03() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3O.A03():com.facebook.ads.redexgen.X.3N");
    }

    public final InputStream A04() throws FileNotFoundException {
        A01();
        return new FileInputStream(this.A01);
    }

    public final void A05() {
        this.A01.delete();
        this.A00.delete();
    }

    public final void A06(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.A00.delete();
    }

    public final boolean A07() {
        return this.A01.exists() || this.A00.exists();
    }
}
