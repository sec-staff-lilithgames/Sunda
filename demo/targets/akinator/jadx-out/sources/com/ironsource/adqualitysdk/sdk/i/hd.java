package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.os.Process;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hd extends ha<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2465 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2466 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2467 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2468 = 96;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2469 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2470 = {175, 206, 169, 198, 207, 172, 201, 211, 212, 197, 210, 164, 195, 193, 165, 128, 205, 180, 194};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private d f2471;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        /* renamed from: ﻛ */
        boolean mo2159(hd hdVar, MediaPlayer mediaPlayer, int i10, int i11);
    }

    public hd(MediaPlayer.OnInfoListener onInfoListener, d dVar) {
        super(onInfoListener);
        this.f2471 = dVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2569(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f2470;
                int i11 = f2468;
                if (f2469) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2467) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        int i12 = f2465 + 85;
        f2466 = i12 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2569(null, KeyEvent.keyCodeFromString("") + 127, null, "\u008b\u0085\u0089\u008e\u008b\u0085\u008d\u008a\u008c\u008b\u008a\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081").intern(), m2569(null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), null, "\u0085\u0084\u0082\u0083\u0082\u0085\u0090\u008b\u008a\u0082\u008a\u0089\u0088\u0087\u0086\u0093\u0092\u0091\u0090\u0082\u0087\u0090\u008b\u0085\u008b\u008b\u008f").intern(), th2, false);
        }
        if (i12 % 2 == 0) {
            this.f2471.mo2159(this, mediaPlayer, i10, i11);
            throw null;
        }
        this.f2471.mo2159(this, mediaPlayer, i10, i11);
        if (mo1115() != null) {
            return mo1115().onInfo(mediaPlayer, i10, i11);
        }
        int i13 = f2466 + 87;
        f2465 = i13 % 128;
        if (i13 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
