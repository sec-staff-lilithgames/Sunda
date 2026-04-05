package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.j;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j.a f4600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j.a aVar, Looper looper) {
        super(looper);
        this.f4600b = aVar;
        this.f4599a = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (this.f4599a) {
            int i10 = message.what;
            j.a aVar = this.f4600b;
            switch (i10) {
                case 1:
                    Bundle data = message.getData();
                    MediaSessionCompat.ensureClassLoader(data);
                    aVar.onSessionEvent((String) message.obj, data);
                    break;
                case 2:
                    aVar.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                    break;
                case 3:
                    aVar.onMetadataChanged((MediaMetadataCompat) message.obj);
                    break;
                case 4:
                    aVar.onAudioInfoChanged((o) message.obj);
                    break;
                case 5:
                    aVar.onQueueChanged((List) message.obj);
                    break;
                case 6:
                    aVar.onQueueTitleChanged((CharSequence) message.obj);
                    break;
                case 7:
                    Bundle bundle = (Bundle) message.obj;
                    MediaSessionCompat.ensureClassLoader(bundle);
                    aVar.onExtrasChanged(bundle);
                    break;
                case 8:
                    aVar.onSessionDestroyed();
                    break;
                case 9:
                    aVar.onRepeatModeChanged(((Integer) message.obj).intValue());
                    break;
                case 11:
                    aVar.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                    break;
                case 12:
                    aVar.onShuffleModeChanged(((Integer) message.obj).intValue());
                    break;
                case 13:
                    aVar.onSessionReady();
                    break;
            }
        }
    }
}
