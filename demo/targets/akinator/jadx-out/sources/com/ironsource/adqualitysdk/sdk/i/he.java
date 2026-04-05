package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.KeyEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class he extends ha<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2472 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2473 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2474 = 55979;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2475 = 59635;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f2476 = 13866;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f2477 = 10054;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private b f2478;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        /* renamed from: ｋ */
        void mo2161(he heVar, MediaPlayer mediaPlayer);
    }

    public he(MediaPlayer.OnCompletionListener onCompletionListener, b bVar) {
        super(onCompletionListener);
        this.f2478 = bVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m2570(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.f3166) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3167 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3167;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2476)) ^ ((c11 >>> 5) + f2474)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2475) ^ ((c12 + i12) ^ ((c12 << 4) + f2477))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3167;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3167 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.f2478.mo2161(this, mediaPlayer);
        } catch (Throwable th2) {
            kd.m3203(m2570("ஆ侨凞\udd72迿댵≴泚荊条筺\ud904덁논ʂ矄푌荳ﯔ࠾晗젩㊽蛳\ue3d8歟ꙟ綾奊飗", 29 - KeyEvent.normalizeMetaState(0)).intern(), m2570("\ud9aaᑡ\ue98d易䨳霪\ud97dꄪ➱폫帙걖덁논ʂ矄푌荳ﯔ࠾ꪍ㹙騗飧똍\uedf5\ue6e7䳤\ua8cdꟆ쫝塩篝恏", 33 - Color.blue(0)).intern(), th2, false);
        }
        if (mo1115() != null) {
            f2473 = (f2472 + 55) % 128;
            mo1115().onCompletion(mediaPlayer);
            f2472 = (f2473 + 21) % 128;
        }
    }
}
