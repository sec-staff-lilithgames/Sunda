package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f27340a;

    /* renamed from: b, reason: collision with root package name */
    public final a f27341b;

    /* renamed from: c, reason: collision with root package name */
    public d f27342c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.exoplayer2.audio.k f27343d;

    /* renamed from: f, reason: collision with root package name */
    public int f27345f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f27347h;

    /* renamed from: g, reason: collision with root package name */
    public float f27346g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f27344e = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f27348a;

        public a(Handler handler) {
            this.f27348a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            this.f27348a.post(new com.applovin.impl.adview.p(this, i10, 3));
        }
    }

    public c(Context context, Handler handler, d dVar) {
        this.f27340a = (AudioManager) com.google.android.exoplayer2.util.a.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f27342c = dVar;
        this.f27341b = new a(handler);
    }

    public final void a() {
        if (this.f27344e == 0) {
            return;
        }
        int i10 = com.google.android.exoplayer2.util.n1.f28506a;
        AudioManager audioManager = this.f27340a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f27347h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f27341b);
        }
        b(0);
    }

    public final void b(int i10) {
        if (this.f27344e == i10) {
            return;
        }
        this.f27344e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f27346g == f10) {
            return;
        }
        this.f27346g = f10;
        d dVar = this.f27342c;
        if (dVar != null) {
            ((p0) dVar).setVolumeMultiplier(f10);
        }
    }

    public float getVolumeMultiplier() {
        return this.f27346g;
    }

    public void release() {
        this.f27342c = null;
        a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAudioAttributes(com.google.android.exoplayer2.audio.k r7) {
        /*
            r6 = this;
            com.google.android.exoplayer2.audio.k r0 = r6.f27343d
            boolean r0 = com.google.android.exoplayer2.util.n1.areEqual(r0, r7)
            if (r0 != 0) goto L42
            r6.f27343d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L10
        Le:
            r3 = r0
            goto L36
        L10:
            int r2 = r7.f27160e
            r3 = 3
            java.lang.String r4 = "AudioFocusManager"
            r5 = 2
            switch(r2) {
                case 0: goto L30;
                case 1: goto L2e;
                case 2: goto L27;
                case 3: goto Le;
                case 4: goto L27;
                case 5: goto L36;
                case 6: goto L36;
                case 7: goto L36;
                case 8: goto L36;
                case 9: goto L36;
                case 10: goto L36;
                case 11: goto L29;
                case 12: goto L36;
                case 13: goto L36;
                case 14: goto L2e;
                case 15: goto L19;
                case 16: goto L1f;
                default: goto L19;
            }
        L19:
            java.lang.String r7 = "Unidentified audio usage: "
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(r2, r7, r4)
            goto Le
        L1f:
            int r7 = com.google.android.exoplayer2.util.n1.f28506a
            r2 = 19
            if (r7 < r2) goto L27
            r3 = 4
            goto L36
        L27:
            r3 = r5
            goto L36
        L29:
            int r7 = r7.f27158b
            if (r7 != r1) goto L36
            goto L27
        L2e:
            r3 = r1
            goto L36
        L30:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            com.google.android.exoplayer2.util.f0.w(r4, r7)
            goto L2e
        L36:
            r6.f27345f = r3
            if (r3 == r1) goto L3c
            if (r3 != 0) goto L3d
        L3c:
            r0 = r1
        L3d:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            com.google.android.exoplayer2.util.a.checkArgument(r0, r7)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.c.setAudioAttributes(com.google.android.exoplayer2.audio.k):void");
    }

    public int updateAudioFocus(boolean z10, int i10) {
        int iRequestAudioFocus;
        if (i10 == 1 || this.f27345f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.f27344e != 1) {
                int i11 = com.google.android.exoplayer2.util.n1.f28506a;
                AudioManager audioManager = this.f27340a;
                a aVar = this.f27341b;
                if (i11 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f27347h;
                    if (audioFocusRequest == null) {
                        AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f27345f) : new AudioFocusRequest.Builder(this.f27347h);
                        com.google.android.exoplayer2.audio.k kVar = this.f27343d;
                        this.f27347h = builder.setAudioAttributes(((com.google.android.exoplayer2.audio.k) com.google.android.exoplayer2.util.a.checkNotNull(kVar)).getAudioAttributesV21().f27128a).setWillPauseWhenDucked(kVar != null && kVar.f27158b == 1).setOnAudioFocusChangeListener(aVar).build();
                    }
                    iRequestAudioFocus = audioManager.requestAudioFocus(this.f27347h);
                } else {
                    iRequestAudioFocus = audioManager.requestAudioFocus(aVar, com.google.android.exoplayer2.util.n1.getStreamTypeForAudioUsage(((com.google.android.exoplayer2.audio.k) com.google.android.exoplayer2.util.a.checkNotNull(this.f27343d)).f27160e), this.f27345f);
                }
                if (iRequestAudioFocus == 1) {
                    b(1);
                    return 1;
                }
                b(0);
                return -1;
            }
        }
    }
}
