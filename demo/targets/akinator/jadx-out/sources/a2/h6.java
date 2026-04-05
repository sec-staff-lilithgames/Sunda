package a2;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlinx.coroutines.channels.Channel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h6 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Channel f3614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(Channel channel, Handler handler) {
        super(handler);
        this.f3614a = channel;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10, Uri uri) {
        this.f3614a.mo5139trySendJP2dKIU(tu.x0.f87415a);
    }
}
