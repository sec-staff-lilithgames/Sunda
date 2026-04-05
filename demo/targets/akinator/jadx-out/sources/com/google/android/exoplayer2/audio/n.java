package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import com.ironsource.C3191e4;
import java.util.Arrays;
import nh.b5;
import nh.g5;
import nh.k6;
import nh.l6;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f27212c = new n(new int[]{2}, 10);

    /* renamed from: d, reason: collision with root package name */
    public static final b5 f27213d = b5.of(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final m5 f27214e = new g5().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f27215a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27216b;

    public n(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f27215a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f27215a = new int[0];
        }
        this.f27216b = i10;
    }

    public static n a(Context context, Intent intent) {
        int i10 = com.google.android.exoplayer2.util.n1.f28506a;
        if (i10 < 23 || !l.isBluetoothConnected(context)) {
            k6 k6Var = new k6();
            if (i10 >= 17) {
                String str = com.google.android.exoplayer2.util.n1.f28508c;
                if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                    k6Var.addAll((Iterable<Object>) f27213d);
                }
            }
            if (i10 >= 29 && (com.google.android.exoplayer2.util.n1.isTv(context) || com.google.android.exoplayer2.util.n1.isAutomotive(context))) {
                k6Var.addAll((Iterable<Object>) m.getDirectPlaybackSupportedEncodings());
                return new n(rh.w.toArray(k6Var.build()), 10);
            }
            if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    k6Var.addAll((Iterable<Object>) rh.w.asList(intArrayExtra));
                }
                return new n(rh.w.toArray(k6Var.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
            }
            l6 l6VarBuild = k6Var.build();
            if (!l6VarBuild.isEmpty()) {
                return new n(rh.w.toArray(l6VarBuild), 10);
            }
        }
        return f27212c;
    }

    public static n getCapabilities(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Arrays.equals(this.f27215a, nVar.f27215a) && this.f27216b == nVar.f27216b;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(com.google.android.exoplayer2.z0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f28802n
            java.lang.Object r0 = com.google.android.exoplayer2.util.a.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r10.f28799k
            int r0 = com.google.android.exoplayer2.util.l0.getEncoding(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            nh.m5 r2 = com.google.android.exoplayer2.audio.n.f27214e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L1c
            return r3
        L1c:
            r1 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2c
            boolean r7 = r9.supportsEncoding(r6)
            if (r7 != 0) goto L2c
            r0 = r4
            goto L3f
        L2c:
            if (r0 != r5) goto L34
            boolean r7 = r9.supportsEncoding(r5)
            if (r7 == 0) goto L3e
        L34:
            r7 = 30
            if (r0 != r7) goto L3f
            boolean r7 = r9.supportsEncoding(r7)
            if (r7 != 0) goto L3f
        L3e:
            r0 = r1
        L3f:
            boolean r7 = r9.supportsEncoding(r0)
            if (r7 != 0) goto L46
            return r3
        L46:
            int r7 = r10.A
            r8 = -1
            if (r7 == r8) goto L62
            if (r0 != r6) goto L4e
            goto L62
        L4e:
            java.lang.String r10 = r10.f28802n
            java.lang.String r2 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L5d
            r10 = 10
            if (r7 <= r10) goto L90
            return r3
        L5d:
            int r10 = r9.f27216b
            if (r7 <= r10) goto L90
            return r3
        L62:
            int r10 = r10.B
            if (r10 == r8) goto L67
            goto L6a
        L67:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L6a:
            int r6 = com.google.android.exoplayer2.util.n1.f28506a
            r7 = 29
            if (r6 < r7) goto L76
            int r10 = com.google.android.exoplayer2.audio.m.getMaxSupportedChannelCountForPassthrough(r0, r10)
        L74:
            r7 = r10
            goto L90
        L76:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r2.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r10 = com.google.android.exoplayer2.util.a.checkNotNull(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            goto L74
        L90:
            int r10 = com.google.android.exoplayer2.util.n1.f28506a
            r2 = 28
            if (r10 > r2) goto La4
            if (r7 != r1) goto L9a
            r4 = r5
            goto La5
        L9a:
            r1 = 3
            if (r7 == r1) goto La5
            r1 = 4
            if (r7 == r1) goto La5
            r1 = 5
            if (r7 != r1) goto La4
            goto La5
        La4:
            r4 = r7
        La5:
            r1 = 26
            if (r10 > r1) goto Lb7
            java.lang.String r10 = "fugu"
            java.lang.String r1 = com.google.android.exoplayer2.util.n1.f28507b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto Lb7
            r10 = 1
            if (r4 != r10) goto Lb7
            r4 = 2
        Lb7:
            int r10 = com.google.android.exoplayer2.util.n1.getAudioTrackChannelConfig(r4)
            if (r10 != 0) goto Lbe
            return r3
        Lbe:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.n.getEncodingAndChannelConfigForPassthrough(com.google.android.exoplayer2.z0):android.util.Pair");
    }

    public int getMaxChannelCount() {
        return this.f27216b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f27215a) * 31) + this.f27216b;
    }

    public boolean isPassthroughPlaybackSupported(com.google.android.exoplayer2.z0 z0Var) {
        return getEncodingAndChannelConfigForPassthrough(z0Var) != null;
    }

    public boolean supportsEncoding(int i10) {
        return Arrays.binarySearch(this.f27215a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f27216b + ", supportedEncodings=" + Arrays.toString(this.f27215a) + C3191e4.i.f36531e;
    }
}
