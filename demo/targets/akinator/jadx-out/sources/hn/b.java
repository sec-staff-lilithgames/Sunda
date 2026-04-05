package hn;

import android.media.AudioManager;
import android.os.Handler;
import com.applovin.impl.adview.p;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f59022a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f59023b;

    public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f59023b = onAudioFocusChangeListener;
        this.f59022a = a1.createHandler(handler.getLooper(), null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        a1.postOrRun(this.f59022a, new p(this, i10, 4));
    }
}
