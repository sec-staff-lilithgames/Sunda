package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I7 extends BroadcastReceiver implements InterfaceC3071x7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L7 f31868b;

    public I7(L7 l72, String jsCallbackNamespace) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        this.f31868b = l72;
        this.f31867a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.InterfaceC3071x7
    public final void a() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        contextD.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.InterfaceC3071x7
    public final void b() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        D2.a(contextD, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(intent, "intent");
        if (kotlin.jvm.internal.e0.areEqual("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            F5 f52 = this.f31868b.f32002b;
            if (f52 != null) {
                ((G5) f52).a("MraidMediaProcessor", a.b.e(intExtra, "Ringer mode action changed: "));
            }
            L7 l72 = this.f31868b;
            String str = this.f31867a;
            boolean z10 = 2 != intExtra;
            F5 f53 = l72.f32002b;
            if (f53 != null) {
                ((G5) f53).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
            }
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = l72.f32001a;
            if (gestureDetectorOnGestureListenerC3093yc != null) {
                gestureDetectorOnGestureListenerC3093yc.a(str, "fireDeviceMuteChangeEvent(" + z10 + ");");
            }
        }
    }
}
