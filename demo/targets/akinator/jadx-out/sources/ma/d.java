package ma;

import android.content.Context;
import android.net.Uri;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.audio.j;
import com.google.android.exoplayer2.audio.k;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.h1;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.y;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlin.jvm.internal.e0;
import qf.x0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f74129a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static Context f74130b;

    /* renamed from: c, reason: collision with root package name */
    public static c0 f74131c;

    /* renamed from: d, reason: collision with root package name */
    public static c f74132d;

    public final void init(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (f74131c != null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        f74130b = applicationContext;
        e0.checkNotNull(applicationContext);
        c0 c0VarBuild = new y(applicationContext).build();
        k kVarBuild = new j().setUsage(1).setContentType(2).build();
        e0.checkNotNullExpressionValue(kVarBuild, "build(...)");
        c0VarBuild.setAudioAttributes(kVarBuild, true);
        c0VarBuild.setRepeatMode(1);
        c0VarBuild.setVolume(0.5f);
        f74131c = c0VarBuild;
    }

    public final boolean isPlaying() {
        c0 c0Var = f74131c;
        return c0Var != null && c0Var.isPlaying();
    }

    public final void pauseMusic() {
        c0 c0Var = f74131c;
        if (c0Var != null) {
            if (!c0Var.isPlaying()) {
                c0Var = null;
            }
            if (c0Var != null) {
                c0Var.pause();
            }
        }
    }

    public final void release() {
        c0 c0Var = f74131c;
        if (c0Var != null) {
            c0Var.release();
        }
        f74131c = null;
        f74132d = null;
    }

    public final void startMusic(c type) {
        int i10;
        e0.checkNotNullParameter(type, "type");
        if (f74131c == null) {
            throw new IllegalStateException("MusicPlayerManager.init(context) doit être appelé avant usage");
        }
        if (type != c.f74126e && f74132d != type) {
            int iOrdinal = type.ordinal();
            if (iOrdinal == 0) {
                i10 = R.raw.music_full;
            } else if (iOrdinal == 1) {
                i10 = R.raw.music_short_orient;
            } else if (iOrdinal != 2) {
                throw new t();
            }
            c0 c0Var = f74131c;
            if (c0Var != null) {
                Uri uriBuildRawResourceUri = x0.buildRawResourceUri(i10);
                e0.checkNotNullExpressionValue(uriBuildRawResourceUri, "buildRawResourceUri(...)");
                u1 u1VarBuild = new h1().setUri(uriBuildRawResourceUri).setMimeType(MimeTypes.AUDIO_MPEG).build();
                e0.checkNotNullExpressionValue(u1VarBuild, "build(...)");
                c0Var.setMediaItem(u1VarBuild, true);
                c0Var.prepare();
            }
            f74132d = type;
        }
        c0 c0Var2 = f74131c;
        if (c0Var2 != null) {
            c0Var2.play();
        }
    }

    public final void stopMusic() {
        c0 c0Var = f74131c;
        if (c0Var != null) {
            c0Var.stop();
        }
        f74132d = null;
    }
}
