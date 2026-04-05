package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J7 extends ContentObserver implements InterfaceC3071x7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31906a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f31907b;

    /* renamed from: c, reason: collision with root package name */
    public int f31908c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L7 f31909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7(L7 l72, String mJsCallbackNamespace, Context context, Handler handler) {
        super(handler);
        kotlin.jvm.internal.e0.checkNotNullParameter(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.f31909d = l72;
        this.f31906a = mJsCallbackNamespace;
        this.f31907b = context;
        this.f31908c = -1;
    }

    public static final void a(J7 this$0, L7 this$1, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$1, "this$1");
        Context context = this$0.f31907b;
        if (context != null) {
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume != this$0.f31908c) {
                        this$0.f31908c = streamVolume;
                        F5 f52 = this$1.f32002b;
                        if (f52 != null) {
                            ((G5) f52).a("MraidMediaProcessor", "volume change detected - " + z10);
                        }
                        String str = this$0.f31906a;
                        F5 f53 = this$1.f32002b;
                        if (f53 != null) {
                            ((G5) f53).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
                        }
                        GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = this$1.f32001a;
                        if (gestureDetectorOnGestureListenerC3093yc != null) {
                            gestureDetectorOnGestureListenerC3093yc.a(str, "fireDeviceVolumeChangeEvent(" + streamVolume + ");");
                        }
                    }
                } catch (Exception e10) {
                    F5 f54 = this$1.f32002b;
                    if (f54 != null) {
                        ((G5) f54).a("MraidMediaProcessor", "Unexpected error in volume listener", e10);
                    }
                }
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC3071x7
    public final void b() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        contextD.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).execute(new com.applovin.impl.d9(this, this.f31909d, z10, 7));
    }

    @Override // com.inmobi.media.InterfaceC3071x7
    public final void a() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        contextD.getContentResolver().unregisterContentObserver(this);
    }
}
