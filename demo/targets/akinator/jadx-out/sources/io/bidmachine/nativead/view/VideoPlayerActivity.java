package io.bidmachine.nativead.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import b0.e2;
import nm.a;
import nm.j;
import o9.b3;
import yp.k;
import yp.o;
import yp.p;
import yp.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class VideoPlayerActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f61961f = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f61962b;

    /* renamed from: c, reason: collision with root package name */
    public VideoView f61963c;

    /* renamed from: e, reason: collision with root package name */
    public q f61964e;

    public static Intent getIntent(Context context, String str, int i10) {
        Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
        intent.putExtra("io.bidmachine.fileUri", str);
        intent.putExtra("io.bidmachine.seekTo", i10);
        return intent;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f61964e != null) {
            this.f61964e.videoPlayerActivityClosed(this.f61963c.isPlaying() ? this.f61963c.getCurrentPosition() : 0, false);
        }
        runOnUiThread(new p(this));
        finish();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        q qVar = this.f61964e;
        if (qVar != null) {
            qVar.videoPlayerActivityClosed(0, true);
        }
        runOnUiThread(new p(this));
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("io.bidmachine.fileUri");
        this.f61962b = intent.getIntExtra("io.bidmachine.seekTo", 0);
        a.d(new b3(this, 28));
        if (stringExtra == null) {
            return;
        }
        this.f61964e = k.D;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f61963c = new VideoView(this);
        this.f61963c.setLayoutParams(e2.e(-1, -1, 13));
        this.f61963c.setOnCompletionListener(this);
        this.f61963c.setOnPreparedListener(this);
        this.f61963c.setVideoPath(stringExtra);
        relativeLayout.addView(this.f61963c);
        float screenDensity = j.getScreenDensity(this);
        int iRound = Math.round(24.0f * screenDensity);
        int iRound2 = Math.round(screenDensity * 8.0f);
        zm.a aVar = new zm.a(this);
        aVar.setColors(um.a.f88522a, um.a.f88523b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iRound, iRound);
        layoutParams.addRule(11, -1);
        layoutParams.addRule(10, -1);
        layoutParams.setMargins(iRound2, iRound2, iRound2, iRound2);
        aVar.setImage(um.a.getBitmapFromBase64("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
        aVar.setLayoutParams(layoutParams);
        aVar.setOnClickListener(new o(this));
        relativeLayout.addView(aVar);
        setContentView(relativeLayout);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        runOnUiThread(new p(this));
        finish();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoView videoView = this.f61963c;
        if (videoView == null || !videoView.canSeekForward()) {
            return;
        }
        this.f61963c.seekTo(this.f61962b);
        this.f61963c.start();
    }
}
