package w9;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.speech.tts.UtteranceProgressListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends UtteranceProgressListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f90463a;

    public d(e eVar) {
        this.f90463a = eVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onDone(String str) {
        e eVar;
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest;
        if (Build.VERSION.SDK_INT < 26 || (audioManager = (eVar = this.f90463a).f90468c) == null || (audioFocusRequest = eVar.f90469d) == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onError(String str) {
        e eVar;
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest;
        if (Build.VERSION.SDK_INT < 26 || (audioManager = (eVar = this.f90463a).f90468c) == null || (audioFocusRequest = eVar.f90469d) == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onStart(String str) {
        e eVar;
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest;
        if (Build.VERSION.SDK_INT < 26 || (audioManager = (eVar = this.f90463a).f90468c) == null || (audioFocusRequest = eVar.f90469d) == null) {
            return;
        }
        audioManager.requestAudioFocus(audioFocusRequest);
    }
}
