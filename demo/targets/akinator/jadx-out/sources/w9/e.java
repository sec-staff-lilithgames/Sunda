package w9;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import ca.m;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
import java.util.Set;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static e f90464e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f90465f;

    /* renamed from: a, reason: collision with root package name */
    public TextToSpeech f90466a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f90467b;

    /* renamed from: c, reason: collision with root package name */
    public AudioManager f90468c;

    /* renamed from: d, reason: collision with root package name */
    public AudioFocusRequest f90469d;

    static {
        c cVar = new c();
        cVar.put("fr", "fr-fr-x-frb");
        cVar.put("en", "en-us-x-tpd");
        cVar.put("it", "it-it-x-itd");
        cVar.put("es", "es-es-x-eed");
        cVar.put("zh", "cmn-cn-x-ssa");
        cVar.put("ko", "ko-kr-x-ism");
        cVar.put("ru", "ru-ru-x-rud");
        cVar.put("nl", "nl-nl-x-dma");
        cVar.put(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "de-de-x-deg");
        cVar.put("pt", "pt-pt-x-jmn");
        cVar.put("id", "id-id-x-dfz");
        cVar.put("he", "he-il-x-hed");
        cVar.put("tr", "tr-tr-x-ama");
        cVar.put("pl", "pl-pl-x-jmk");
        cVar.put("vi", "vi-vn-x-vid");
        cVar.put("ja", "ja-jp-x-jab");
        cVar.put("ar", "ar-xa-x-ard");
        f90465f = cVar;
    }

    public static synchronized e getInstance() {
        try {
            if (f90464e == null) {
                e eVar = new e();
                eVar.f90467b = false;
                f90464e = eVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f90464e;
    }

    public void initialize(Context context) {
        if (m.sharedInstance().isTTSEnabled()) {
            if (!this.f90467b || this.f90466a == null) {
                if (this.f90468c == null) {
                    this.f90468c = (AudioManager) context.getSystemService("audio");
                    AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
                    if (Build.VERSION.SDK_INT >= 26) {
                        this.f90469d = new AudioFocusRequest.Builder(3).setAudioAttributes(audioAttributesBuild).setOnAudioFocusChangeListener(new b()).build();
                    }
                }
                TextToSpeech textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() { // from class: w9.a
                    @Override // android.speech.tts.TextToSpeech.OnInitListener
                    public final void onInit(int i10) {
                        if (i10 == 0) {
                            String currentLanguage = m.sharedInstance().getCurrentLanguage();
                            Locale locale = new Locale(currentLanguage);
                            e eVar = this.f90462a;
                            eVar.f90466a.setLanguage(locale);
                            Set<Voice> voices = eVar.f90466a.getVoices();
                            if (voices != null) {
                                String str = (String) e.f90465f.get(currentLanguage);
                                if (str != null) {
                                    for (Voice voice : voices) {
                                        if (voice.getName().contains(str)) {
                                            eVar.f90466a.setVoice(voice);
                                            Timber.tag("TTSManager").d("Voix masculine trouvée et configurée: %s", voice.getName());
                                            break;
                                        }
                                    }
                                    eVar.f90466a.setPitch(0.6f);
                                    Timber.tag("TTSManager").d("Aucune voix masculine trouvée, pitch ajusté à 0.6", new Object[0]);
                                } else {
                                    eVar.f90466a.setPitch(0.6f);
                                    Timber.tag("TTSManager").d("Aucune voix masculine trouvée, pitch ajusté à 0.6", new Object[0]);
                                }
                            } else {
                                eVar.f90466a.setPitch(0.6f);
                                Timber.tag("TTSManager").d("Aucune liste de voix disponible, pitch ajusté à 0.6", new Object[0]);
                            }
                            eVar.f90467b = true;
                        }
                    }
                });
                this.f90466a = textToSpeech;
                textToSpeech.setOnUtteranceProgressListener(new d(this));
            }
        }
    }

    public void shutdown() {
        if (m.sharedInstance().isTTSEnabled()) {
            TextToSpeech textToSpeech = this.f90466a;
            if (textToSpeech != null) {
                textToSpeech.stop();
                this.f90466a.shutdown();
                this.f90466a = null;
            }
            this.f90467b = false;
        }
    }

    public void speak(String str) {
        if (this.f90467b && this.f90466a != null && m.sharedInstance().isTTSEnabled()) {
            stop();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("utteranceId", "tts1");
            String str2 = (String) f90465f.get(m.sharedInstance().getCurrentLanguage());
            if (str2 != null) {
                bundle.putString("voice_name", str2.concat("-network"));
            }
            this.f90466a.speak(str, 0, bundle, "tts1");
            Timber.tag("TTSManager").d(">>> speak: %s", str);
        } catch (Exception e10) {
            Timber.tag("TTSManager").e(e10, "Error during TTS speak", new Object[0]);
        }
    }

    public void stop() {
        Timber.tag("TTSManager").d(">>> stop called", new Object[0]);
        if (m.sharedInstance().isTTSEnabled()) {
            try {
                TextToSpeech textToSpeech = this.f90466a;
                if (textToSpeech == null || !textToSpeech.isSpeaking()) {
                    return;
                }
                this.f90466a.stop();
            } catch (Exception e10) {
                Timber.tag("TTSManager").e(e10, "Error stopping TTS", new Object[0]);
            }
        }
    }

    public void updateLanguage(Context context) {
        if (m.sharedInstance().isTTSEnabled()) {
            TextToSpeech textToSpeech = this.f90466a;
            if (textToSpeech != null) {
                textToSpeech.stop();
                this.f90466a.shutdown();
                this.f90466a = null;
                this.f90467b = false;
            }
            initialize(context);
        }
    }
}
