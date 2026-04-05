package com.digidust.elokence.akinator.activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.core.content.FileProvider;
import com.digidust.elokence.akinator.activities.PartageVideoActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import o9.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PartageVideoActivity extends AkActivity {
    public static final /* synthetic */ int D = 0;
    public MediaController C;

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_partage_video);
        final File file = (File) getIntent().getSerializableExtra(C3191e4.h.f36473b);
        final int i10 = 0;
        findViewById(R.id.partageButton).setOnClickListener(new View.OnClickListener(this) { // from class: o9.f4

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PartageVideoActivity f78138c;

            {
                this.f78138c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                File file2 = file;
                PartageVideoActivity partageVideoActivity = this.f78138c;
                switch (i11) {
                    case 0:
                        int i12 = PartageVideoActivity.D;
                        partageVideoActivity.disableAdOneTime();
                        Uri uriForFile = FileProvider.getUriForFile(partageVideoActivity, partageVideoActivity.getResources().getString(R.string.authority), file2);
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.STREAM", uriForFile);
                        intent.setType(MimeTypes.VIDEO_MP4);
                        partageVideoActivity.startActivity(Intent.createChooser(intent, lb.b1.sharedInstance().getTraductionFromToken("PARTAGER")));
                        break;
                    default:
                        int i13 = PartageVideoActivity.D;
                        da.f fVar = new da.f(partageVideoActivity);
                        fVar.setTypeYesNo(lb.b1.sharedInstance().getTraductionFromToken("ON_CONTINUE"));
                        fVar.setConfirmeListener(new h4(partageVideoActivity, file2));
                        break;
                }
            }
        });
        final int i11 = 1;
        findViewById(R.id.deleteButton).setOnClickListener(new View.OnClickListener(this) { // from class: o9.f4

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PartageVideoActivity f78138c;

            {
                this.f78138c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                File file2 = file;
                PartageVideoActivity partageVideoActivity = this.f78138c;
                switch (i112) {
                    case 0:
                        int i12 = PartageVideoActivity.D;
                        partageVideoActivity.disableAdOneTime();
                        Uri uriForFile = FileProvider.getUriForFile(partageVideoActivity, partageVideoActivity.getResources().getString(R.string.authority), file2);
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.STREAM", uriForFile);
                        intent.setType(MimeTypes.VIDEO_MP4);
                        partageVideoActivity.startActivity(Intent.createChooser(intent, lb.b1.sharedInstance().getTraductionFromToken("PARTAGER")));
                        break;
                    default:
                        int i13 = PartageVideoActivity.D;
                        da.f fVar = new da.f(partageVideoActivity);
                        fVar.setTypeYesNo(lb.b1.sharedInstance().getTraductionFromToken("ON_CONTINUE"));
                        fVar.setConfirmeListener(new h4(partageVideoActivity, file2));
                        break;
                }
            }
        });
        findViewById(R.id.cancelButton).setOnClickListener(new j0(this, 4));
        final VideoView videoView = (VideoView) findViewById(R.id.videoPreview);
        videoView.setVideoPath(file.getPath());
        if (this.C == null) {
            MediaController mediaController = new MediaController(this);
            this.C = mediaController;
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(this.C);
        }
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: o9.g4
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                int i12 = PartageVideoActivity.D;
                PartageVideoActivity partageVideoActivity = this.f78161b;
                partageVideoActivity.getClass();
                videoView.seekTo(0);
                partageVideoActivity.C.show();
            }
        });
    }

    @Override // com.digidust.elokence.akinator.activities.AkActivity, ca.q
    public void onPseudoChange(String str) {
    }
}
