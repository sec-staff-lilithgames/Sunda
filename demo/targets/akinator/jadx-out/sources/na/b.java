package na;

import android.content.Context;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.e0;
import ma.f;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f75862a = new b();

    public static final void init(Context context) {
        e0.checkNotNullParameter(context, "context");
        f.f74133a.init(context);
    }

    public static final void playBip() {
        f.f74133a.play(R.raw.bip);
    }

    public static final void playClap() {
        f.f74133a.play(R.raw.clap);
    }

    public static final void playDescente() {
        f.f74133a.play(R.raw.descente);
    }

    public static final void playGzSound(int i10) {
        switch (i10) {
            case 1:
                f.f74133a.play(R.raw.sfx_son1);
                break;
            case 2:
                f.f74133a.play(R.raw.sfx_son2);
                break;
            case 3:
                f.f74133a.play(R.raw.sfx_son3);
                break;
            case 4:
                f.f74133a.play(R.raw.sfx_son4);
                break;
            case 5:
                f.f74133a.play(R.raw.sfx_son5);
                break;
            case 6:
                f.f74133a.play(R.raw.sfx_son6);
                break;
            default:
                f.f74133a.play(R.raw.sfx_son1);
                break;
        }
    }

    public static final void playMonte() {
        f.f74133a.play(R.raw.monte);
    }

    public static final void playPropose() {
        f.f74133a.play(R.raw.propose);
    }

    public static final void playReponse() {
        f.f74133a.play(R.raw.reponse);
    }

    public static final void playStartPlaying() {
        f.f74133a.play(R.raw.play);
    }

    public static final void playWin() {
        f.f74133a.play(R.raw.win);
    }

    public static final b sharedInstance() {
        return f75862a;
    }

    public static final void stopSoundService() {
        f.f74133a.release();
        Timber.Forest.v("stopSoundService() no-op with SoundPool", new Object[0]);
    }
}
