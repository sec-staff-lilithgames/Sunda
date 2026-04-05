package io.odeeo.internal.d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.u0.h1;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f63345c = new e(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final e f63346d = new e(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f63347e = {5, 6, 18, 17, 14, 7, 8};

    /* renamed from: a, reason: collision with root package name */
    public final int[] f63348a;

    /* renamed from: b, reason: collision with root package name */
    public final int f63349b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public static int[] getDirectPlaybackSupportedEncodings() {
            h1.a aVarBuilder = h1.builder();
            for (int i10 : e.f63347e) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i10).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    aVarBuilder.add((h1.a) Integer.valueOf(i10));
                }
            }
            aVarBuilder.add((h1.a) 2);
            return io.odeeo.internal.w0.d.toArray(aVarBuilder.build());
        }
    }

    public e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f63348a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f63348a = new int[0];
        }
        this.f63349b = i10;
    }

    public static boolean b() {
        if (g0.f65861a < 17) {
            return false;
        }
        String str = g0.f65863c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    public static e getCapabilities(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.f63348a, eVar.f63348a) && this.f63349b == eVar.f63349b;
    }

    public int getMaxChannelCount() {
        return this.f63349b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f63348a) * 31) + this.f63349b;
    }

    public boolean supportsEncoding(int i10) {
        return Arrays.binarySearch(this.f63348a, i10) >= 0;
    }

    public static e a(Context context, Intent intent) {
        return (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f63346d : (g0.f65861a < 29 || !(g0.isTv(context) || g0.isAutomotive(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f63345c : new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new e(a.getDirectPlaybackSupportedEncodings(), 8);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f63349b + ", supportedEncodings=" + Arrays.toString(this.f63348a) + KGUkpTlXZlJLy.qrEKtJlH;
    }
}
