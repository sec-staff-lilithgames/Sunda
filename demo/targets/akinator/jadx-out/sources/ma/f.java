package ma;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.util.SparseIntArray;
import ca.m;
import com.digidust.elokence.akinator.freemium.R;
import kotlin.jvm.internal.e0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static Context f74134b;

    /* renamed from: c, reason: collision with root package name */
    public static SoundPool f74135c;

    /* renamed from: a, reason: collision with root package name */
    public static final f f74133a = new f();

    /* renamed from: d, reason: collision with root package name */
    public static final SparseIntArray f74136d = new SparseIntArray();

    public final void init(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (f74135c != null) {
            return;
        }
        f74134b = context.getApplicationContext();
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(6).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).build();
        soundPoolBuild.setOnLoadCompleteListener(new e());
        f74135c = soundPoolBuild;
        int[] iArr = {R.raw.bip, R.raw.clap, R.raw.descente, R.raw.monte, R.raw.play, R.raw.propose, R.raw.reponse, R.raw.win, R.raw.sfx_son1, R.raw.sfx_son2, R.raw.sfx_son3, R.raw.sfx_son4, R.raw.sfx_son5, R.raw.sfx_son6};
        Context context2 = f74134b;
        if (context2 == null) {
            return;
        }
        for (int i10 = 0; i10 < 14; i10++) {
            int i11 = iArr[i10];
            SparseIntArray sparseIntArray = f74136d;
            if (sparseIntArray.get(i11, -1) == -1) {
                sparseIntArray.put(i11, soundPoolBuild.load(context2, i11, 1));
            }
        }
    }

    public final void play(int i10) {
        SoundPool soundPool;
        if (m.sharedInstance().isSoundEnabled() && (soundPool = f74135c) != null) {
            int i11 = f74136d.get(i10, -1);
            if (i11 == -1) {
                Timber.Forest.w("Sound not preloaded: %s", Integer.valueOf(i10));
            } else {
                soundPool.play(i11, 1.0f, 1.0f, 1, 0, 1.0f);
            }
        }
    }

    public final void release() {
        SoundPool soundPool = f74135c;
        if (soundPool != null) {
            soundPool.release();
        }
        f74135c = null;
        f74136d.clear();
        f74134b = null;
    }
}
