package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.media.MediaPlayer;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hj extends ha<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2508 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2509 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private e f2511;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2510 = {46457, 24115, 25523, 30482, 6399, 11338, 12791, 55988, 60931, 62341, 34676, 43210, 48198, 16700, 27296, 32282, 1013, 5977, 14549, 52649, 53519, 64131, 36416, 37838, 42845, 18474, 23962, 24862, 2806, 7750, 9166, 39438, 29010, 19695, 22629, 14229, 892, 7840, 62920, 49459, 56549, 43057, 34736, 37635, 28237, 17890, 20858, 11422, 14398, 6056, 58056, 65079, 54755, 41239, 48261, 34854, 26461, 29438, 20033, 9616, 12601, 3249, 7122, 63310, 49908, 56856};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2507 = 789044889205992299L;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
        /* renamed from: ｋ */
        void mo2162(hj hjVar, MediaPlayer mediaPlayer);
    }

    public hj(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, e eVar) {
        super(onSeekCompleteListener);
        this.f2511 = eVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2583(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f2510[i11 + i12] ^ (i12 * f2507)) ^ c10);
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

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            this.f2511.mo2162(this, mediaPlayer);
            f2508 = (f2509 + 13) % 128;
        } catch (Throwable th2) {
            kd.m3203(m2583((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46390), AndroidCharacter.getMirror('0') - 17, View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m2583((char) (39498 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "", 0) + 35, 31 - TextUtils.getCapsMode("", 0, 0)).intern(), th2, false);
        }
        if (mo1115() != null) {
            int i10 = f2508 + 7;
            f2509 = i10 % 128;
            if (i10 % 2 == 0) {
                mo1115().onSeekComplete(mediaPlayer);
                throw null;
            }
            mo1115().onSeekComplete(mediaPlayer);
            f2508 = (f2509 + 43) % 128;
        }
        int i11 = f2509 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2508 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }
}
