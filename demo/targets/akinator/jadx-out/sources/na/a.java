package na;

import android.content.Context;
import ca.m;
import kotlin.jvm.internal.e0;
import ma.c;
import ma.d;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static Context f75860b;

    /* renamed from: a, reason: collision with root package name */
    public static final a f75859a = new a();

    /* renamed from: c, reason: collision with root package name */
    public static c f75861c = c.f74124b;

    public static final void init(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (f75860b != null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        f75860b = applicationContext;
        e0.checkNotNull(applicationContext);
        d.f74129a.init(applicationContext);
        Timber.Forest.v("MusicFactory init OK", new Object[0]);
    }

    public static final void onAppBackgrounded() {
        if (m.sharedInstance().isMusicEnabled()) {
            pauseMusic();
        }
    }

    public static final void pauseMusic() {
        try {
            d.f74129a.pauseMusic();
            Timber.Forest.v("Music paused", new Object[0]);
        } catch (Throwable th2) {
            Timber.Forest.e(th2, "Failed to pause music", new Object[0]);
        }
    }

    public static final void playMusic() {
        if (m.sharedInstance().isMusicEnabled()) {
            startMusic(f75861c);
        } else {
            Timber.Forest.v("Music disabled in config; ignoring playMusic()", new Object[0]);
        }
    }

    public static final void release() {
        try {
            d.f74129a.release();
            Timber.Forest.v("Music released", new Object[0]);
        } catch (Throwable th2) {
            Timber.Forest.e(th2, "Failed to release music", new Object[0]);
        }
    }

    public static final a sharedInstance() {
        return f75859a;
    }

    public static final void startMusic(c type) {
        e0.checkNotNullParameter(type, "type");
        f75861c = type;
        if (!m.sharedInstance().isMusicEnabled()) {
            Timber.Forest.v("Music disabled in config; ignoring startMusic(%s)", type);
            return;
        }
        try {
            d.f74129a.startMusic(type);
            Timber.Forest.v("Music started with type: %s", type);
        } catch (Throwable th2) {
            Timber.Forest.e(th2, "Failed to start music", new Object[0]);
        }
    }

    public static final void stopMusic() {
        try {
            d.f74129a.stopMusic();
            Timber.Forest.v("Music stopped", new Object[0]);
        } catch (Throwable th2) {
            Timber.Forest.e(th2, "Failed to stop music", new Object[0]);
        }
    }
}
