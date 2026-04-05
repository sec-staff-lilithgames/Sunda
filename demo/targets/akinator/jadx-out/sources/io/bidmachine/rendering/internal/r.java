package io.bidmachine.rendering.internal;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import cr.q;
import dq.d0;
import ir.d;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f61998a;

        public a(d dVar) {
            this.f61998a = dVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(intent, "intent");
            context.unregisterReceiver(this);
            q.onUiThreadWithArgSafely(Boolean.TRUE, this.f61998a);
        }
    }

    public final void a(Context context, Uri uri, d dVar) {
        DownloadManager downloadManager;
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(uri, "uri");
        Context applicationContext = context.getApplicationContext();
        try {
            e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
            downloadManager = ir.q.getDownloadManager(applicationContext);
        } catch (Exception e10) {
            d0.b(e10);
        }
        long jEnqueue = downloadManager != null ? downloadManager.enqueue(new DownloadManager.Request(uri).setNotificationVisibility(1)) : -1L;
        if (jEnqueue == -1) {
            q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
            return;
        }
        a aVar = new a(dVar);
        e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
        ir.q.registerBroadcastReceiver(aVar, applicationContext, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }
}
