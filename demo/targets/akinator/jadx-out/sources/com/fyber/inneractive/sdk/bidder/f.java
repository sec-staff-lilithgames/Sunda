package com.fyber.inneractive.sdk.bidder;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final e f23118a;

    public f(e eVar) {
        this.f23118a = eVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.f.onReceive(android.content.Context, android.content.Intent):void");
    }

    public final void a() {
        com.fyber.inneractive.sdk.util.o.f26796a.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f26796a.registerReceiver(this, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f26796a.registerReceiver(this, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f26796a.registerReceiver(this, new IntentFilter(NyKZx.CoKItJojwnMPim));
        com.fyber.inneractive.sdk.util.o.f26796a.registerReceiver(this, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        if (com.fyber.inneractive.sdk.util.o.a("android.permission.BLUETOOTH")) {
            com.fyber.inneractive.sdk.util.o.f26796a.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            com.fyber.inneractive.sdk.util.o.f26796a.registerReceiver(this, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }
}
