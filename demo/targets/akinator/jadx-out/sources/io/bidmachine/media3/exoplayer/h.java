package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import mh.e3;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final v2 f61207a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f61208b;

    /* renamed from: c, reason: collision with root package name */
    public g f61209c;

    /* renamed from: d, reason: collision with root package name */
    public gn.h f61210d;

    /* renamed from: f, reason: collision with root package name */
    public int f61212f;

    /* renamed from: h, reason: collision with root package name */
    public hn.c f61214h;

    /* renamed from: g, reason: collision with root package name */
    public float f61213g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f61211e = 0;

    public h(Context context, Looper looper, g gVar) {
        this.f61207a = e3.memoize(new f(context, 0));
        this.f61209c = gVar;
        this.f61208b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.f61211e;
        if (i10 == 1 || i10 == 0 || this.f61214h == null) {
            return;
        }
        hn.d.abandonAudioFocusRequest((AudioManager) this.f61207a.get(), this.f61214h);
    }

    public final void b(int i10) {
        if (this.f61211e == i10) {
            return;
        }
        this.f61211e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f61213g == f10) {
            return;
        }
        this.f61213g = f10;
        g gVar = this.f61209c;
        if (gVar != null) {
            gVar.setVolumeMultiplier(f10);
        }
    }

    public float getVolumeMultiplier() {
        return this.f61213g;
    }

    public void release() {
        this.f61209c = null;
        a();
        b(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setAudioAttributes(gn.h r7) {
        /*
            r6 = this;
            gn.h r0 = r6.f61210d
            boolean r0 = java.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L3b
            r6.f61210d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L10
        Le:
            r3 = r0
            goto L2f
        L10:
            int r2 = r7.f57900c
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L29;
                case 1: goto L27;
                case 2: goto L25;
                case 3: goto Le;
                case 4: goto L25;
                case 5: goto L2f;
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                case 9: goto L2f;
                case 10: goto L2f;
                case 11: goto L21;
                case 12: goto L2f;
                case 13: goto L2f;
                case 14: goto L27;
                case 15: goto L19;
                case 16: goto L1f;
                default: goto L19;
            }
        L19:
            java.lang.String r7 = "Unidentified audio usage: "
            e3.g.t(r2, r7, r5)
            goto Le
        L1f:
            r3 = 4
            goto L2f
        L21:
            int r7 = r7.f57898a
            if (r7 != r1) goto L2f
        L25:
            r3 = r4
            goto L2f
        L27:
            r3 = r1
            goto L2f
        L29:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            io.bidmachine.media3.common.util.b0.w(r5, r7)
            goto L27
        L2f:
            r6.f61212f = r3
            if (r3 == r1) goto L35
            if (r3 != 0) goto L36
        L35:
            r0 = r1
        L36:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            io.bidmachine.media3.common.util.a.checkArgument(r0, r7)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.h.setAudioAttributes(gn.h):void");
    }

    public int updateAudioFocus(boolean z10, int i10) {
        int i11;
        boolean z11 = false;
        if (i10 == 1 || (i11 = this.f61212f) != 1) {
            a();
            b(0);
            return 1;
        }
        if (!z10) {
            int i12 = this.f61211e;
            if (i12 == 1) {
                return -1;
            }
            if (i12 == 3) {
                return 0;
            }
        } else if (this.f61211e != 2) {
            hn.c cVar = this.f61214h;
            if (cVar == null) {
                hn.a aVar = cVar == null ? new hn.a(i11) : cVar.buildUpon();
                gn.h hVar = this.f61210d;
                if (hVar != null && hVar.f57898a == 1) {
                    z11 = true;
                }
                this.f61214h = aVar.setAudioAttributes((gn.h) io.bidmachine.media3.common.util.a.checkNotNull(hVar)).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: io.bidmachine.media3.exoplayer.e
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i13) {
                        gn.h hVar2;
                        h hVar3 = this.f61183a;
                        if (i13 == -3 || i13 == -2) {
                            if (i13 != -2 && ((hVar2 = hVar3.f61210d) == null || hVar2.f57898a != 1)) {
                                hVar3.b(4);
                                return;
                            }
                            g gVar = hVar3.f61209c;
                            if (gVar != null) {
                                gVar.executePlayerCommand(0);
                            }
                            hVar3.b(3);
                            return;
                        }
                        if (i13 == -1) {
                            g gVar2 = hVar3.f61209c;
                            if (gVar2 != null) {
                                gVar2.executePlayerCommand(-1);
                            }
                            hVar3.a();
                            hVar3.b(1);
                            return;
                        }
                        if (i13 != 1) {
                            e3.g.t(i13, "Unknown focus change type: ", "AudioFocusManager");
                            return;
                        }
                        hVar3.b(2);
                        g gVar3 = hVar3.f61209c;
                        if (gVar3 != null) {
                            gVar3.executePlayerCommand(1);
                        }
                    }
                }, this.f61208b).build();
            }
            if (hn.d.requestAudioFocus((AudioManager) this.f61207a.get(), this.f61214h) == 1) {
                b(2);
                return 1;
            }
            b(1);
            return -1;
        }
        return 1;
    }
}
