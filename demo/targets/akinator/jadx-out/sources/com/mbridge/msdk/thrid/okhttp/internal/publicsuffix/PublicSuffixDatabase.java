package com.mbridge.msdk.thrid.okhttp.internal.publicsuffix;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.thrid.okhttp.internal.c;
import com.mbridge.msdk.thrid.okhttp.internal.platform.g;
import com.mbridge.msdk.thrid.okio.e;
import com.mbridge.msdk.thrid.okio.j;
import com.mbridge.msdk.thrid.okio.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f43634e = {42};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f43635f = new String[0];

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f43636g = {"*"};

    /* renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f43637h = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f43638a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final CountDownLatch f43639b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    private byte[] f43640c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f43641d;

    public static PublicSuffixDatabase a() {
        return f43637h;
    }

    private void b() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        e eVarA = l.a(new j(l.a(resourceAsStream)));
        try {
            byte[] bArr = new byte[eVarA.readInt()];
            eVarA.readFully(bArr);
            byte[] bArr2 = new byte[eVarA.readInt()];
            eVarA.readFully(bArr2);
            synchronized (this) {
                this.f43640c = bArr;
                this.f43641d = bArr2;
            }
            this.f43639b.countDown();
        } finally {
            c.a(eVarA);
        }
    }

    private void c() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    b();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    g.d().a(5, "Failed to read public suffix list", e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public String a(String str) throws InterruptedException {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrA = a(strArrSplit);
        if (strArrSplit.length == strArrA.length && strArrA[0].charAt(0) != '!') {
            return null;
        }
        if (strArrA[0].charAt(0) == '!') {
            length = strArrSplit.length;
            length2 = strArrA.length;
        } else {
            length = strArrSplit.length;
            length2 = strArrA.length + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i10 = length - length2; i10 < strArrSplit2.length; i10++) {
            sb2.append(strArrSplit2[i10]);
            sb2.append('.');
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    private String[] a(String[] strArr) throws InterruptedException {
        String str;
        String strA;
        String strA2;
        int i10 = 0;
        if (!this.f43638a.get() && this.f43638a.compareAndSet(false, true)) {
            c();
        } else {
            try {
                this.f43639b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (this) {
            if (this.f43640c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            bArr[i11] = strArr[i11].getBytes(c.f43296j);
        }
        int i12 = 0;
        while (true) {
            str = null;
            if (i12 >= length) {
                strA = null;
                break;
            }
            strA = a(this.f43640c, bArr, i12);
            if (strA != null) {
                break;
            }
            i12++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i13 = 0; i13 < bArr2.length - 1; i13++) {
                bArr2[i13] = f43634e;
                strA2 = a(this.f43640c, bArr2, i13);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            while (true) {
                if (i10 >= length - 1) {
                    break;
                }
                String strA3 = a(this.f43641d, bArr, i10);
                if (strA3 != null) {
                    str = strA3;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return "!".concat(str).split("\\.");
        }
        if (strA == null && strA2 == null) {
            return f43636g;
        }
        String[] strArrSplit = strA != null ? strA.split("\\.") : f43635f;
        String[] strArrSplit2 = strA2 != null ? strA2.split("\\.") : f43635f;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    private static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    i12 = bArr2[i19][i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                }
                i13 = i12 - (bArr[i16 + i21] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (i13 == 0) {
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        i20 = -1;
                        z11 = true;
                    }
                } else {
                    break;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i22 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    while (true) {
                        i19++;
                        if (i19 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            return new String(bArr, i16, i18, c.f43296j);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }
}
