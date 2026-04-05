package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hf extends ha<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2479 = 8112596109064534292L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2480 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2481;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private a f2482;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        /* renamed from: ｋ */
        void mo2160(hf hfVar, MediaPlayer mediaPlayer);
    }

    public hf(MediaPlayer.OnPreparedListener onPreparedListener, a aVar) {
        super(onPreparedListener);
        this.f2482 = aVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2571(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2479, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2479));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i10 = f2480 + 3;
        f2481 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m3203(m2571("\ue946\uf726\ue909㙐\u0e5c廂쐨떌൳⨲\ue049鄼Ↄ㛶賔\ued77䗅兖꤭욀硣紀땼⋛鲵駭冚㹯냒ꖽ稪", ExpandableListView.getPackedPositionGroup(0L)).intern(), m2571("ऴ\ue45cॱ饭ᴺﴍ欷ᙞ\ued16㤘佼㋯솴▅⏱亳ꖈ䈱؆敕頑湦᩠脃粄誗ﺻ鶑傦뛍픕롰㝶퍽ꥑ", 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), th2, false);
        }
        if (i10 % 2 != 0) {
            this.f2482.mo2160(this, mediaPlayer);
            throw null;
        }
        this.f2482.mo2160(this, mediaPlayer);
        if (mo1115() != null) {
            f2480 = (f2481 + 33) % 128;
            mo1115().onPrepared(mediaPlayer);
        }
        f2481 = (f2480 + 39) % 128;
    }
}
