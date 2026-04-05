package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* renamed from: a, reason: collision with root package name */
    public VideoView f23045a;

    /* renamed from: b, reason: collision with root package name */
    public int f23046b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final m f23047c = new m(this);

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra("video_url", str);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            IAlog.a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f23046b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(R.layout.ia_layout_rich_media_video);
        this.f23045a = (VideoView) findViewById(R.id.mraid_video_view);
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra("video_url")) ? null : intent.getStringExtra("video_url");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f23045a.setVideoPath(stringExtra);
            this.f23045a.setOnCompletionListener(new o(this));
            this.f23045a.setOnErrorListener(new p(this));
            this.f23045a.setOnPreparedListener(this.f23047c);
        }
        findViewById(R.id.ia_iv_close_button).setOnClickListener(new n(this));
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f23046b = this.f23045a.getCurrentPosition();
        this.f23045a.pause();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f23045a;
        bundle.putInt(VIDEO_CURRENT_POSITION, videoView == null ? 0 : videoView.getCurrentPosition());
    }
}
