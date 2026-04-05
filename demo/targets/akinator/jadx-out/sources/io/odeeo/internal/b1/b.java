package io.odeeo.internal.b1;

import android.app.Activity;
import io.odeeo.internal.a0.a0;
import io.odeeo.internal.b.i0;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.b.o;
import io.odeeo.internal.b.z;
import io.odeeo.internal.d.d;
import io.odeeo.internal.p0.p;
import io.odeeo.sdk.AdUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends io.odeeo.internal.b1.a implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final a f63248f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final o f63249a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.z0.f f63250b;

    /* renamed from: c, reason: collision with root package name */
    public final Activity f63251c;

    /* renamed from: d, reason: collision with root package name */
    public final tu.o f63252d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f63253e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.b1.b$b, reason: collision with other inner class name */
    public static final class C0593b extends f0 implements kv.a {
        public C0593b() {
            super(0);
        }

        @Override // kv.a
        public final String invoke() {
            return b.this.f63250b.getAdInfo().getUrl$odeeoSdk_release();
        }
    }

    public b(o player, io.odeeo.internal.z0.f viewModel, Activity mActivity) {
        e0.checkNotNullParameter(player, "player");
        e0.checkNotNullParameter(viewModel, "viewModel");
        e0.checkNotNullParameter(mActivity, "mActivity");
        this.f63249a = player;
        this.f63250b = viewModel;
        this.f63251c = mActivity;
        this.f63252d = q.lazy(new C0593b());
    }

    public final String a() {
        return (String) this.f63252d.getValue();
    }

    @Override // io.odeeo.internal.b1.c
    public void attachPlayerEventListener() {
        this.f63249a.addListener((l0.e) this);
    }

    public final void b() {
        this.f63250b.getPlayerState().postValue(this.f63253e ? new g(f.BufferingStarted, null, 2, null) : new g(f.BufferingFinished, null, 2, null));
    }

    @Override // io.odeeo.internal.b1.c
    public long getCurrentPosition() {
        return this.f63249a.getCurrentPosition();
    }

    @Override // io.odeeo.internal.b1.c
    public long getDuration() {
        return this.f63249a.getDuration();
    }

    @Override // io.odeeo.internal.b1.c
    public int getPlayerState() {
        return this.f63249a.getPlaybackState();
    }

    @Override // io.odeeo.internal.b1.c
    public boolean isPlaying() {
        return this.f63249a.isPlaying();
    }

    @Override // io.odeeo.internal.b1.a, io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlaybackStateChanged(int i10) {
        if (i10 == 2) {
            b();
        } else if (i10 == 3) {
            this.f63250b.getPlayerState().postValue(new g(f.Ready, null, 2, null));
        } else {
            if (i10 != 4) {
                return;
            }
            this.f63250b.getPlayerState().postValue(new g(f.Ended, null, 2, null));
        }
    }

    @Override // io.odeeo.internal.b1.a, io.odeeo.internal.b.l0.e, io.odeeo.internal.b.l0.c
    public void onPlayerError(i0 error) {
        e0.checkNotNullParameter(error, "error");
        io.odeeo.internal.b2.a.w(error, e0.stringPlus("Player.onPlayerError() exception:", error.getMessage()), new Object[0]);
        this.f63250b.getPlayerState().postValue(new g(f.FinishFailure, new e(AdUnit.ERROR_MEDIA_PLAYER_ERROR, error)));
    }

    @Override // io.odeeo.internal.b1.c
    public void pause(boolean z10) {
        if (z10) {
            this.f63249a.removeListener((l0.e) this);
        }
        this.f63249a.pause();
    }

    @Override // io.odeeo.internal.b1.c
    public void play(boolean z10) {
        this.f63249a.play();
        if (z10) {
            return;
        }
        attachPlayerEventListener();
    }

    @Override // io.odeeo.internal.b1.c
    public void prepare() {
        try {
            io.odeeo.internal.d.d dVarBuild = new d.b().setUsage(1).setContentType(1).build();
            e0.checkNotNullExpressionValue(dVarBuild, "Builder()\n              …                 .build()");
            this.f63249a.setAudioAttributes(dVarBuild, false);
            attachPlayerEventListener();
            io.odeeo.internal.g.f mp3ExtractorFlags = new io.odeeo.internal.g.f().setMp3ExtractorFlags(8);
            e0.checkNotNullExpressionValue(mp3ExtractorFlags, "DefaultExtractorsFactory…LAG_DISABLE_ID3_METADATA)");
            a0 a0VarCreateMediaSource = new a0.b(new p.a(this.f63251c), mp3ExtractorFlags).createMediaSource(z.fromUri(a()));
            e0.checkNotNullExpressionValue(a0VarCreateMediaSource, "Factory(dataSource, extr…iaItem.fromUri(mediaUrl))");
            this.f63249a.setMediaSource(a0VarCreateMediaSource);
            this.f63249a.prepare();
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.w(e10, e0.stringPlus("Player.setDataSource() exception:", e10.getMessage()), new Object[0]);
            this.f63250b.getPlayerState().postValue(new g(f.FinishFailure, new e(AdUnit.ERROR_MEDIA_PLAYER_ERROR, e10)));
        }
    }

    @Override // io.odeeo.internal.b1.c
    public void refreshPlayerState() {
        onPlaybackStateChanged(this.f63249a.getPlaybackState());
    }

    @Override // io.odeeo.internal.b1.c
    public void release() {
        this.f63249a.release();
    }

    @Override // io.odeeo.internal.b1.c
    public void setVolume(float f10) {
        this.f63249a.setVolume(f10);
    }

    @Override // io.odeeo.internal.b1.c
    public void stop() {
        this.f63249a.stop();
    }
}
