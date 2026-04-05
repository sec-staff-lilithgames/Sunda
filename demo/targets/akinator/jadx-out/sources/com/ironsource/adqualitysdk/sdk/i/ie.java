package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.app.NotificationCompat;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ie {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2639 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2640 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2641;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static long f2642;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2643;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2644;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Cipher f2645;

    /* renamed from: ｋ, reason: contains not printable characters */
    private SecretKey f2646;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Cipher f2647;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    static {
        m2800();
        f2644 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        int i10 = f2641 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2640 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 7 / 0;
        }
    }

    public ie(byte[] bArr, String str, String str2, String str3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrDigest;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(m2798((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(str2);
            sb2.append(str3);
            bArrDigest = secretKeyFactory.generateSecret(new PBEKeySpec(sb2.toString().toCharArray(), bArr, 1024, NotificationCompat.FLAG_LOCAL_ONLY)).getEncoded();
        } catch (GeneralSecurityException unused) {
            ih.m2807(m2798((char) (Process.myPid() >> 22), Process.getGidForName("") + 20, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29).intern(), m2798((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 59, Color.blue(0) + 48).intern());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m2799("\u0000\u0001\u0000", true, new int[]{0, 3, 0, 2}).intern());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(str2);
                sb3.append(str3);
                for (char c10 : sb3.toString().toCharArray()) {
                    messageDigest.update((byte) c10);
                }
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(m2799("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{3, 19, 0, 3}).intern(), e10);
            }
        }
        this.f2646 = new SecretKeySpec(bArrDigest, m2799("\u0000\u0000\u0000", false, new int[]{22, 3, 21, 1}).intern());
        m2797();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2797() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance(m2798((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4730), View.MeasureSpec.makeMeasureSpec(0, 0) + 20, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 107).intern());
            this.f2647 = cipher;
            SecretKey secretKey = this.f2646;
            byte[] bArr = f2644;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(m2798((char) (4731 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 107).intern());
            this.f2645 = cipher2;
            cipher2.init(2, this.f2646, new IvParameterSpec(bArr));
            int i10 = f2641 + 103;
            f2640 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 13 / 0;
            }
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException(m2798((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 21, View.MeasureSpec.makeMeasureSpec(0, 0) + 127).intern(), e10);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2798(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2643[i11 + i12] ^ (i12 * f2642)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m2800() {
        f2643 = new char[]{'P', 14249, 28563, 42902, 57317, 6083, 20426, 34622, 48912, 63234, 12143, 26455, 40768, 55005, 3823, 18163, 32498, 46802, 61138, 9776, 24089, 38420, 52767, 1630, 15946, 30128, 44531, 58763, 7671, 'K', 14254, 28563, 42903, 57325, 6071, 20419, 34600, 48907, 63244, 12108, 26495, 40817, 54940, 3769, 18084, 32452, 46836, 61172, 'P', 14233, 28601, 42915, 57293, 6133, 20462, 34580, 49016, 63266, 12096, 26425, 40813, 54913, 3769, 18090, 32477, 46827, 61159, 9733, 24117, 38437, 52830, 1656, 15912, 30103, 44475, 58815, 7645, 22012, 36335, 50523, 64832, 13599, 27972, 42328, 56677, 5273, 19589, 34029, 48348, 62666, 11496, 25631, 39937, 54333, 3167, 17483, 31844, 46043, 60295, 9121, 23500, 37845, 52221, 796, 15115, 29499, 43792, 4666, 9685, 32254, 46485, 52628, 1454, 23994, 38201, 44403, 58739, 15638, 30001, 36170, 50372, 7360, 21722, 27823, 42121, 64659, 13421, 'I', 14213, 28576, 42912, 57280, 6142, 20454, 34637, 48957, 63277, 12120, 26480, 40822, 54912, 3764, 18088, 32469, 46837, 61170, 9809, 24174, 'U', 14271, 28560, 42988, 57236, 36216};
        f2642 = 875307770958985195L;
        f2639 = new char[]{AbstractJsonLexerKt.STRING, 'H', 'A', ';', 'r', AbstractJsonLexerKt.BEGIN_LIST, '^', 'q', 'i', 'i', GMTDateParser.MINUTES, 'n', 'p', GMTDateParser.MINUTES, 'o', 'r', 'i', 'B', 'B', 'f', 'j', 'f', '4', '_', 'X', AbstractJsonLexerKt.STRING, 'C', '7', GMTDateParser.MONTH, 'j', 'n', 't', 'Q', 'J', 'j', 'k', 'j', 'l', 'j', 'e', 'H', 'G', 'f', 'l', 'n', 'o', 'q', 'P', GMTDateParser.MONTH, 'n', 'i', 'o', 'V', '/', 'O', 'p', 'q', 'j', 'b', 'k', 't', GMTDateParser.MINUTES, GMTDateParser.DAY_OF_MONTH, 'X', 'Q', '$', 'V', 'c', 'b', GMTDateParser.DAY_OF_MONTH, 'k', 'I', 'G', 'n', 'q', 'J', 'C', 'j', 'r', 'q', 'i', 'B', '$', 'H', 'k', 'r', 'k', 'f', 'j', 'f', 'B', 'B', 'b', 'j', 'j', '@', 'G', 'p', 'I', 'E', GMTDateParser.HOURS, 'o', 'Q', '1'};
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized String m2801(String str) throws a {
        if (TextUtils.isEmpty(str)) {
            int i10 = f2640 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f2641 = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        try {
            try {
                try {
                    String str2 = new String(this.f2645.doFinal(ic.m2794(str)), m2798((char) TextUtils.indexOf("", "", 0, 0), 5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.combineMeasuredStates(0, 0) + 148).intern());
                    if (str2.indexOf(m2799("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{25, 40, 0, 26}).intern()) == 0) {
                        return str2.substring(m2799("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{25, 40, 0, 26}).intern().length(), str2.length());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2799("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001", false, new int[]{65, 39, 0, 0}).intern());
                    sb2.append(str);
                    throw new a(sb2.toString());
                } catch (BadPaddingException e10) {
                    m2797();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(e10.getMessage());
                    sb3.append(m2798((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36162), TextUtils.getCapsMode("", 0, 0) + 1, 153 - Color.green(0)).intern());
                    sb3.append(str);
                    throw new a(sb3.toString());
                }
            } catch (IllegalBlockSizeException e11) {
                m2797();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(e11.getMessage());
                sb4.append(m2798((char) (36161 - ImageFormat.getBitsPerPixel(0)), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 'i').intern());
                sb4.append(str);
                throw new a(sb4.toString());
            }
        } catch (id e12) {
            m2797();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(e12.getMessage());
            sb5.append(m2798((char) (36162 - TextUtils.indexOf("", "", 0)), TextUtils.getOffsetBefore("", 0) + 1, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 152).intern());
            sb5.append(str);
            throw new a(sb5.toString());
        } catch (UnsupportedEncodingException e13) {
            throw new RuntimeException(m2799("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{3, 19, 0, 3}).intern(), e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        r4 = r10.f2647;
        r5 = new java.lang.StringBuilder();
        r5.append(m2799("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", true, new int[]{25, 40, 0, 26}).intern());
        r5.append(r11);
        r11 = com.ironsource.adqualitysdk.sdk.i.ic.m2788(r4.doFinal(r5.toString().getBytes(m2798((char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (-16777211) - android.graphics.Color.rgb(0, 0, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 148).intern())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.ie.f2640 + 23;
        com.ironsource.adqualitysdk.sdk.i.ie.f2641 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if ((r0 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        m2797();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        throw new java.lang.RuntimeException(m2799("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{3, 19, 0, 3}).intern(), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        m2797();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        throw new java.lang.RuntimeException(m2799("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{3, 19, 0, 3}).intern(), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) != false) goto L16;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String m2802(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = com.ironsource.adqualitysdk.sdk.i.ie.f2641     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 + 91
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2640 = r1     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L1d
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L1a
            r2 = 71
            int r2 = r2 / r1
            if (r0 == 0) goto L25
            goto L23
        L18:
            r11 = move-exception
            throw r11     // Catch: java.lang.Throwable -> L1a
        L1a:
            r11 = move-exception
            goto Lba
        L1d:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L25
        L23:
            monitor-exit(r10)
            return r11
        L25:
            r0 = 19
            r2 = 3
            r3 = 1
            javax.crypto.Cipher r4 = r10.f2647     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            r5.<init>()     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            java.lang.String r6 = "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000"
            r7 = 40
            r8 = 26
            r9 = 25
            int[] r7 = new int[]{r9, r7, r1, r8}     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            java.lang.String r6 = m2799(r6, r3, r7)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            java.lang.String r6 = r6.intern()     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            r5.append(r6)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            r5.append(r11)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            int r5 = android.graphics.ImageFormat.getBitsPerPixel(r1)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            int r5 = r5 + r3
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            int r6 = android.graphics.Color.rgb(r1, r1, r1)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            r7 = -16777211(0xffffffffff000005, float:-1.7014128E38)
            int r7 = r7 - r6
            int r6 = android.view.ViewConfiguration.getMaximumFlingVelocity()     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            int r6 = r6 >> 16
            int r6 = r6 + 148
            java.lang.String r5 = m2798(r5, r7, r6)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            java.lang.String r5 = r5.intern()     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            byte[] r11 = r11.getBytes(r5)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            byte[] r11 = r4.doFinal(r11)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            java.lang.String r11 = com.ironsource.adqualitysdk.sdk.i.ic.m2788(r11)     // Catch: java.lang.Throwable -> L1a java.security.GeneralSecurityException -> L88 java.io.UnsupportedEncodingException -> L8a
            int r0 = com.ironsource.adqualitysdk.sdk.i.ie.f2640     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 + 23
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2641 = r1     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 % 2
            if (r0 != 0) goto L86
            monitor-exit(r10)
            return r11
        L86:
            r11 = 0
            throw r11     // Catch: java.lang.Throwable -> L18
        L88:
            r11 = move-exception
            goto L8c
        L8a:
            r11 = move-exception
            goto La3
        L8c:
            r10.m2797()     // Catch: java.lang.Throwable -> L1a
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001"
            int[] r0 = new int[]{r2, r0, r1, r2}     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = m2799(r5, r3, r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r0, r11)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        La3:
            r10.m2797()     // Catch: java.lang.Throwable -> L1a
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001"
            int[] r0 = new int[]{r2, r0, r1, r2}     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = m2799(r5, r3, r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r0, r11)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        Lba:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L1a
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ie.m2802(java.lang.String):java.lang.String");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2799(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f2639, i10, cArr, 0, i11);
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
}
