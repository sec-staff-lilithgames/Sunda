package hn;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f59017a;

    /* renamed from: b, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f59018b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f59019c;

    /* renamed from: d, reason: collision with root package name */
    public gn.h f59020d = gn.h.f57892g;

    /* renamed from: e, reason: collision with root package name */
    public boolean f59021e;

    public a(int i10) {
        this.f59017a = i10;
    }

    public c build() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f59018b;
        if (onAudioFocusChangeListener != null) {
            return new c(this.f59017a, onAudioFocusChangeListener, (Handler) io.bidmachine.media3.common.util.a.checkNotNull(this.f59019c), this.f59020d, this.f59021e);
        }
        throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
    }

    public a setAudioAttributes(gn.h hVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(hVar);
        this.f59020d = hVar;
        return this;
    }

    public a setFocusGain(int i10) {
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            z10 = false;
        }
        io.bidmachine.media3.common.util.a.checkArgument(z10);
        this.f59017a = i10;
        return this;
    }

    public a setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return setOnAudioFocusChangeListener(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
    }

    public a setWillPauseWhenDucked(boolean z10) {
        this.f59021e = z10;
        return this;
    }

    public a setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        io.bidmachine.media3.common.util.a.checkNotNull(onAudioFocusChangeListener);
        io.bidmachine.media3.common.util.a.checkNotNull(handler);
        this.f59018b = onAudioFocusChangeListener;
        this.f59019c = handler;
        return this;
    }
}
