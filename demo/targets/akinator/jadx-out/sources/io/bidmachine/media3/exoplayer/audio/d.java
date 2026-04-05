package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.util.Pair;
import android.util.SparseArray;
import com.ironsource.C3191e4;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import nh.b5;
import nh.ej;
import nh.g5;
import nh.k6;
import nh.l6;
import nh.m5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f60913c = new d(b5.of(a.f60918d));

    /* renamed from: d, reason: collision with root package name */
    public static final b5 f60914d = b5.of(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final m5 f60915e = new g5().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f60916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60917b;

    @Deprecated
    public d(int[] iArr, int i10) {
        this(a(i10, iArr));
    }

    public static b5 a(int i10, int[] iArr) {
        x4 x4VarBuilder = b5.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            x4VarBuilder.add((Object) new a(i11, i10));
        }
        return x4VarBuilder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.bidmachine.media3.exoplayer.audio.d b(android.content.Context r5, android.content.Intent r6, gn.h r7, io.bidmachine.media3.exoplayer.audio.h r8) {
        /*
            android.media.AudioManager r0 = hn.d.getAudioManager(r5)
            r1 = 33
            if (r8 == 0) goto L9
            goto L13
        L9:
            int r8 = io.bidmachine.media3.common.util.a1.f60679a
            if (r8 < r1) goto L12
            io.bidmachine.media3.exoplayer.audio.h r8 = io.bidmachine.media3.exoplayer.audio.c.getDefaultRoutedDeviceForAttributes(r0, r7)
            goto L13
        L12:
            r8 = 0
        L13:
            int r2 = io.bidmachine.media3.common.util.a1.f60679a
            if (r2 < r1) goto L28
            boolean r1 = io.bidmachine.media3.common.util.a1.isTv(r5)
            if (r1 != 0) goto L23
            boolean r1 = io.bidmachine.media3.common.util.a1.isAutomotive(r5)
            if (r1 == 0) goto L28
        L23:
            io.bidmachine.media3.exoplayer.audio.d r5 = io.bidmachine.media3.exoplayer.audio.c.getCapabilitiesInternalForDirectPlayback(r0, r7)
            return r5
        L28:
            r1 = 23
            if (r2 < r1) goto L35
            boolean r8 = io.bidmachine.media3.exoplayer.audio.a.isBluetoothConnected(r0, r8)
            if (r8 == 0) goto L35
            io.bidmachine.media3.exoplayer.audio.d r5 = io.bidmachine.media3.exoplayer.audio.d.f60913c
            return r5
        L35:
            nh.k6 r8 = new nh.k6
            r8.<init>()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.add(r0)
            r0 = 29
            r1 = 10
            if (r2 < r0) goto L6d
            boolean r0 = io.bidmachine.media3.common.util.a1.isTv(r5)
            if (r0 != 0) goto L54
            boolean r0 = io.bidmachine.media3.common.util.a1.isAutomotive(r5)
            if (r0 == 0) goto L6d
        L54:
            nh.b5 r5 = io.bidmachine.media3.exoplayer.audio.b.getDirectPlaybackSupportedEncodings(r7)
            r8.addAll(r5)
            io.bidmachine.media3.exoplayer.audio.d r5 = new io.bidmachine.media3.exoplayer.audio.d
            nh.l6 r6 = r8.build()
            int[] r6 = rh.w.toArray(r6)
            nh.b5 r6 = a(r1, r6)
            r5.<init>(r6)
            return r5
        L6d:
            android.content.ContentResolver r5 = r5.getContentResolver()
            java.lang.String r7 = "use_external_surround_sound_flag"
            r0 = 0
            int r7 = android.provider.Settings.Global.getInt(r5, r7, r0)
            r2 = 1
            if (r7 != r2) goto L7d
            r7 = r2
            goto L7e
        L7d:
            r7 = r0
        L7e:
            if (r7 != 0) goto L92
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Amazon"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L92
            java.lang.String r4 = "Xiaomi"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L9f
        L92:
            java.lang.String r3 = "external_surround_sound_enabled"
            int r5 = android.provider.Settings.Global.getInt(r5, r3, r0)
            if (r5 != r2) goto L9f
            nh.b5 r5 = io.bidmachine.media3.exoplayer.audio.d.f60914d
            r8.addAll(r5)
        L9f:
            if (r6 == 0) goto Ld2
            if (r7 != 0) goto Ld2
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r6.getIntExtra(r5, r0)
            if (r5 != r2) goto Ld2
            java.lang.String r5 = "android.media.extra.ENCODINGS"
            int[] r5 = r6.getIntArrayExtra(r5)
            if (r5 == 0) goto Lba
            java.util.List r5 = rh.w.asList(r5)
            r8.addAll(r5)
        Lba:
            io.bidmachine.media3.exoplayer.audio.d r5 = new io.bidmachine.media3.exoplayer.audio.d
            nh.l6 r7 = r8.build()
            int[] r7 = rh.w.toArray(r7)
            java.lang.String r8 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r6 = r6.getIntExtra(r8, r1)
            nh.b5 r6 = a(r6, r7)
            r5.<init>(r6)
            return r5
        Ld2:
            io.bidmachine.media3.exoplayer.audio.d r5 = new io.bidmachine.media3.exoplayer.audio.d
            nh.l6 r6 = r8.build()
            int[] r6 = rh.w.toArray(r6)
            nh.b5 r6 = a(r1, r6)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.d.b(android.content.Context, android.content.Intent, gn.h, io.bidmachine.media3.exoplayer.audio.h):io.bidmachine.media3.exoplayer.audio.d");
    }

    public static d c(Context context, gn.h hVar, h hVar2) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), hVar, hVar2);
    }

    @Deprecated
    public static d getCapabilities(Context context) {
        return getCapabilities(context, gn.h.f57892g, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return io.bidmachine.media3.common.util.a1.contentEquals(this.f60916a, dVar.f60916a) && this.f60917b == dVar.f60917b;
    }

    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(io.bidmachine.media3.common.b bVar) {
        return getEncodingAndChannelConfigForPassthrough(bVar, gn.h.f57892g);
    }

    public int getMaxChannelCount() {
        return this.f60917b;
    }

    public int hashCode() {
        return (io.bidmachine.media3.common.util.a1.contentHashCode(this.f60916a) * 31) + this.f60917b;
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(io.bidmachine.media3.common.b bVar) {
        return isPassthroughPlaybackSupported(bVar, gn.h.f57892g);
    }

    public boolean supportsEncoding(int i10) {
        return io.bidmachine.media3.common.util.a1.contains(this.f60916a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f60917b + ", audioProfiles=" + this.f60916a + C3191e4.i.f36531e;
    }

    public d(b5 b5Var) {
        this.f60916a = new SparseArray();
        for (int i10 = 0; i10 < b5Var.size(); i10++) {
            a aVar = (a) b5Var.get(i10);
            this.f60916a.put(aVar.f60919a, aVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f60916a.size(); i11++) {
            iMax = Math.max(iMax, ((a) this.f60916a.valueAt(i11)).f60920b);
        }
        this.f60917b = iMax;
    }

    public static d getCapabilities(Context context, gn.h hVar, AudioDeviceInfo audioDeviceInfo) {
        return c(context, hVar, (io.bidmachine.media3.common.util.a1.f60679a < 23 || audioDeviceInfo == null) ? null : new h(audioDeviceInfo));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<java.lang.Integer, java.lang.Integer> getEncodingAndChannelConfigForPassthrough(io.bidmachine.media3.common.b r10, gn.h r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f60665o
            java.lang.Object r0 = io.bidmachine.media3.common.util.a.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r10.f60661k
            int r0 = gn.x0.getEncoding(r0, r1)
            nh.m5 r1 = io.bidmachine.media3.exoplayer.audio.d.f60915e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            r2 = 0
            if (r1 != 0) goto L1c
            return r2
        L1c:
            r1 = 7
            r3 = 6
            r4 = 8
            r5 = 18
            if (r0 != r5) goto L2c
            boolean r6 = r9.supportsEncoding(r5)
            if (r6 != 0) goto L2c
            r0 = r3
            goto L3f
        L2c:
            if (r0 != r4) goto L34
            boolean r6 = r9.supportsEncoding(r4)
            if (r6 == 0) goto L3e
        L34:
            r6 = 30
            if (r0 != r6) goto L3f
            boolean r6 = r9.supportsEncoding(r6)
            if (r6 != 0) goto L3f
        L3e:
            r0 = r1
        L3f:
            boolean r6 = r9.supportsEncoding(r0)
            if (r6 != 0) goto L46
            return r2
        L46:
            android.util.SparseArray r6 = r9.f60916a
            java.lang.Object r6 = r6.get(r0)
            io.bidmachine.media3.exoplayer.audio.d$a r6 = (io.bidmachine.media3.exoplayer.audio.d.a) r6
            java.lang.Object r6 = io.bidmachine.media3.common.util.a.checkNotNull(r6)
            io.bidmachine.media3.exoplayer.audio.d$a r6 = (io.bidmachine.media3.exoplayer.audio.d.a) r6
            int r7 = r10.E
            r8 = -1
            if (r7 == r8) goto L78
            if (r0 != r5) goto L5c
            goto L78
        L5c:
            java.lang.String r10 = r10.f60665o
            java.lang.String r11 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L71
            int r10 = io.bidmachine.media3.common.util.a1.f60679a
            r11 = 33
            if (r10 >= r11) goto L71
            r10 = 10
            if (r7 <= r10) goto L84
            return r2
        L71:
            boolean r10 = r6.supportsChannelCount(r7)
            if (r10 != 0) goto L84
            return r2
        L78:
            int r10 = r10.F
            if (r10 == r8) goto L7d
            goto L80
        L7d:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L80:
            int r7 = r6.getMaxSupportedChannelCountForPassthrough(r10, r11)
        L84:
            int r10 = io.bidmachine.media3.common.util.a1.f60679a
            r11 = 28
            if (r10 > r11) goto L98
            if (r7 != r1) goto L8e
            r3 = r4
            goto L99
        L8e:
            r11 = 3
            if (r7 == r11) goto L99
            r11 = 4
            if (r7 == r11) goto L99
            r11 = 5
            if (r7 != r11) goto L98
            goto L99
        L98:
            r3 = r7
        L99:
            r11 = 26
            if (r10 > r11) goto Lab
            java.lang.String r10 = "fugu"
            java.lang.String r11 = android.os.Build.DEVICE
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lab
            r10 = 1
            if (r3 != r10) goto Lab
            r3 = 2
        Lab:
            int r10 = io.bidmachine.media3.common.util.a1.getAudioTrackChannelConfig(r3)
            if (r10 != 0) goto Lb2
            return r2
        Lb2:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.d.getEncodingAndChannelConfigForPassthrough(io.bidmachine.media3.common.b, gn.h):android.util.Pair");
    }

    public boolean isPassthroughPlaybackSupported(io.bidmachine.media3.common.b bVar, gn.h hVar) {
        return getEncodingAndChannelConfigForPassthrough(bVar, hVar) != null;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final a f60918d;

        /* renamed from: a, reason: collision with root package name */
        public final int f60919a;

        /* renamed from: b, reason: collision with root package name */
        public final int f60920b;

        /* renamed from: c, reason: collision with root package name */
        public final l6 f60921c;

        static {
            a aVar;
            if (io.bidmachine.media3.common.util.a1.f60679a >= 33) {
                k6 k6Var = new k6();
                for (int i10 = 1; i10 <= 10; i10++) {
                    k6Var.add((Object) Integer.valueOf(io.bidmachine.media3.common.util.a1.getAudioTrackChannelConfig(i10)));
                }
                aVar = new a(2, k6Var.build());
            } else {
                aVar = new a(2, 10);
            }
            f60918d = aVar;
        }

        public a(int i10, Set<Integer> set) {
            this.f60919a = i10;
            l6 l6VarCopyOf = l6.copyOf((Collection) set);
            this.f60921c = l6VarCopyOf;
            ej it = l6VarCopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f60920b = iMax;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f60919a == aVar.f60919a && this.f60920b == aVar.f60920b && Objects.equals(this.f60921c, aVar.f60921c);
        }

        public int getMaxSupportedChannelCountForPassthrough(int i10, gn.h hVar) {
            if (this.f60921c != null) {
                return this.f60920b;
            }
            int i11 = io.bidmachine.media3.common.util.a1.f60679a;
            int i12 = this.f60919a;
            return i11 >= 29 ? b.getMaxSupportedChannelCountForPassthrough(i12, i10, hVar) : ((Integer) io.bidmachine.media3.common.util.a.checkNotNull((Integer) d.f60915e.getOrDefault(Integer.valueOf(i12), 0))).intValue();
        }

        public int hashCode() {
            int i10 = ((this.f60919a * 31) + this.f60920b) * 31;
            l6 l6Var = this.f60921c;
            return i10 + (l6Var == null ? 0 : l6Var.hashCode());
        }

        public boolean supportsChannelCount(int i10) {
            l6 l6Var = this.f60921c;
            if (l6Var == null) {
                return i10 <= this.f60920b;
            }
            int audioTrackChannelConfig = io.bidmachine.media3.common.util.a1.getAudioTrackChannelConfig(i10);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return l6Var.contains(Integer.valueOf(audioTrackChannelConfig));
        }

        public String toString() {
            return "AudioProfile[format=" + this.f60919a + ", maxChannelCount=" + this.f60920b + ", channelMasks=" + this.f60921c + C3191e4.i.f36531e;
        }

        public a(int i10, int i11) {
            this.f60919a = i10;
            this.f60920b = i11;
            this.f60921c = null;
        }
    }
}
