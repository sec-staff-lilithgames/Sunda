package io.odeeo.internal.b;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f62636a;

    /* renamed from: b, reason: collision with root package name */
    public final a f62637b;

    /* renamed from: c, reason: collision with root package name */
    public b f62638c;

    /* renamed from: d, reason: collision with root package name */
    public io.odeeo.internal.d.d f62639d;

    /* renamed from: f, reason: collision with root package name */
    public int f62641f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f62643h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f62644i;

    /* renamed from: g, reason: collision with root package name */
    public float f62642g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f62640e = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f62645a;

        public a(Handler handler) {
            this.f62645a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            this.f62645a.post(new com.applovin.impl.adview.p(this, i10, 6));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            c.this.b(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void executePlayerCommand(int i10);

        void setVolumeMultiplier(float f10);
    }

    public c(Context context, Handler handler, b bVar) {
        this.f62636a = (AudioManager) io.odeeo.internal.q0.a.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f62638c = bVar;
        this.f62637b = new a(handler);
    }

    public final void b() {
        if (this.f62640e == 0) {
            return;
        }
        if (io.odeeo.internal.q0.g0.f65861a >= 26) {
            c();
        } else {
            a();
        }
        c(0);
    }

    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f62643h;
        if (audioFocusRequest != null) {
            this.f62636a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final boolean d(int i10) {
        return i10 == 1 || this.f62641f != 1;
    }

    public final int e() {
        return this.f62636a.requestAudioFocus(this.f62637b, io.odeeo.internal.q0.g0.getStreamTypeForAudioUsage(((io.odeeo.internal.d.d) io.odeeo.internal.q0.a.checkNotNull(this.f62639d)).f63338c), this.f62641f);
    }

    public final int f() {
        AudioFocusRequest audioFocusRequest = this.f62643h;
        if (audioFocusRequest == null || this.f62644i) {
            this.f62643h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f62641f) : new AudioFocusRequest.Builder(this.f62643h)).setAudioAttributes(((io.odeeo.internal.d.d) io.odeeo.internal.q0.a.checkNotNull(this.f62639d)).getAudioAttributesV21()).setWillPauseWhenDucked(g()).setOnAudioFocusChangeListener(this.f62637b).build();
            this.f62644i = false;
        }
        return this.f62636a.requestAudioFocus(this.f62643h);
    }

    public final boolean g() {
        io.odeeo.internal.d.d dVar = this.f62639d;
        return dVar != null && dVar.f63336a == 1;
    }

    public float getVolumeMultiplier() {
        return this.f62642g;
    }

    public void release() {
        this.f62638c = null;
        b();
    }

    public void setAudioAttributes(io.odeeo.internal.d.d dVar) {
        if (io.odeeo.internal.q0.g0.areEqual(this.f62639d, dVar)) {
            return;
        }
        this.f62639d = dVar;
        int iA = a(dVar);
        this.f62641f = iA;
        boolean z10 = true;
        if (iA != 1 && iA != 0) {
            z10 = false;
        }
        io.odeeo.internal.q0.a.checkArgument(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int updateAudioFocus(boolean z10, int i10) {
        if (d(i10)) {
            b();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return d();
        }
        return -1;
    }

    public final void a() {
        this.f62636a.abandonAudioFocus(this.f62637b);
    }

    public final int d() {
        if (this.f62640e == 1) {
            return 1;
        }
        if ((io.odeeo.internal.q0.g0.f65861a >= 26 ? f() : e()) == 1) {
            c(1);
            return 1;
        }
        c(0);
        return -1;
    }

    public static int a(io.odeeo.internal.d.d dVar) {
        if (dVar == null) {
            return 0;
        }
        switch (dVar.f63338c) {
            case 0:
                io.odeeo.internal.q0.p.w("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (dVar.f63336a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                io.odeeo.internal.q0.p.w("AudioFocusManager", "Unidentified audio usage: " + dVar.f63338c);
                return 0;
            case 16:
                return io.odeeo.internal.q0.g0.f65861a >= 19 ? 4 : 2;
        }
    }

    public final void c(int i10) {
        if (this.f62640e == i10) {
            return;
        }
        this.f62640e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f62642g == f10) {
            return;
        }
        this.f62642g = f10;
        b bVar = this.f62638c;
        if (bVar != null) {
            bVar.setVolumeMultiplier(f10);
        }
    }

    public final void b(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !g()) {
                c(3);
                return;
            } else {
                a(0);
                c(2);
                return;
            }
        }
        if (i10 == -1) {
            a(-1);
            b();
        } else if (i10 != 1) {
            e3.g.z(i10, "Unknown focus change type: ", "AudioFocusManager");
        } else {
            c(1);
            a(1);
        }
    }

    public final void a(int i10) {
        b bVar = this.f62638c;
        if (bVar != null) {
            bVar.executePlayerCommand(i10);
        }
    }
}
