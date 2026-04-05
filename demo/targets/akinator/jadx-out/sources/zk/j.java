package zk;

import android.media.MediaPlayer;
import android.view.View;
import com.inmobi.media.B7;
import com.inmobi.media.C3039v9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class j implements MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f98131c;

    public /* synthetic */ j(View view, int i10) {
        this.f98130b = i10;
        this.f98131c = view;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        switch (this.f98130b) {
            case 0:
                B7.a((B7) this.f98131c, mediaPlayer, i10, i11);
                break;
            default:
                C3039v9.c((C3039v9) this.f98131c, mediaPlayer, i10, i11);
                break;
        }
    }
}
