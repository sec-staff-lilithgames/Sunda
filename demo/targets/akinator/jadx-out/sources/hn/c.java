package hn;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import io.bidmachine.media3.common.util.a1;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f59024a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f59025b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f59026c;

    /* renamed from: d, reason: collision with root package name */
    public final gn.h f59027d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f59028e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f59029f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, gn.h hVar, boolean z10) {
        this.f59024a = i10;
        this.f59026c = handler;
        this.f59027d = hVar;
        this.f59028e = z10;
        int i11 = a1.f60679a;
        if (i11 < 26) {
            this.f59025b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f59025b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f59029f = new AudioFocusRequest.Builder(i10).setAudioAttributes(hVar.getAudioAttributesV21().f57876a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f59029f = null;
        }
    }

    public a buildUpon() {
        a aVar = new a();
        aVar.f59017a = getFocusGain();
        aVar.f59018b = getOnAudioFocusChangeListener();
        aVar.f59019c = getFocusChangeHandler();
        aVar.f59020d = getAudioAttributes();
        aVar.f59021e = willPauseWhenDucked();
        return aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f59024a == cVar.f59024a && this.f59028e == cVar.f59028e && Objects.equals(this.f59025b, cVar.f59025b) && Objects.equals(this.f59026c, cVar.f59026c) && Objects.equals(this.f59027d, cVar.f59027d);
    }

    public gn.h getAudioAttributes() {
        return this.f59027d;
    }

    public Handler getFocusChangeHandler() {
        return this.f59026c;
    }

    public int getFocusGain() {
        return this.f59024a;
    }

    public AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.f59025b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f59024a), this.f59025b, this.f59026c, this.f59027d, Boolean.valueOf(this.f59028e));
    }

    public boolean willPauseWhenDucked() {
        return this.f59028e;
    }
}
