package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/ContextAwareXHEAACDRCTypeUtil;", "", "<init>", "()V", "LATE_NIGHT_MODE", "", "LIMITED_PLAYBACK_RANGE", "DIALOG_ENHANCEMENT", "getDRCEffectTypeForLateNight", "lateNightLowerThreshold", "lateNightHigherThreshold", "getDRCEffectTypeForConnectedHeadSet", "audioManager", "Landroid/media/AudioManager;", "isHeadSetOn", "", "shouldUseLateNightMode", "lateNightHourLowerThreshold", "lateNightHourUpperThreshold", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.hI, reason: from Kotlin metadata */
/* loaded from: assets/audience_network.dex */
public final class ContextAwareXHEAACDRCTypeUtil {
    public static byte[] A00;
    public static final ContextAwareXHEAACDRCTypeUtil A01;

    static {
        A03();
        A01 = new ContextAwareXHEAACDRCTypeUtil();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, 40, 57, 52, 50, 16, 60, 51, 60, 58, 56, 47};
    }

    @JvmStatic
    public static final int A00(int i10, int i11) {
        if (A01.A04(i10, i11)) {
            return 1;
        }
        return 3;
    }

    @JvmStatic
    public static final int A01(AudioManager audioManager) {
        C2628p6.A09(audioManager, A02(0, 12, 34));
        if (A01.A05(audioManager)) {
            return 5;
        }
        return 3;
    }

    private final boolean A04(int i10, int i11) {
        int i12 = Calendar.getInstance().get(11);
        return i12 >= i10 || i12 <= i11;
    }

    private final boolean A05(AudioManager audioManager) {
        return audioManager.isWiredHeadsetOn() || audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn();
    }
}
