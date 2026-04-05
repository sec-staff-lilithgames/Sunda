package androidx.localbroadcastmanager.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalBroadcastManager f6755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LocalBroadcastManager localBroadcastManager, Looper looper) {
        super(looper);
        this.f6755a = localBroadcastManager;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else {
            this.f6755a.executePendingBroadcasts();
        }
    }
}
