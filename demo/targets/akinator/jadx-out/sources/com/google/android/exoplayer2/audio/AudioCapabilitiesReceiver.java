package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class AudioCapabilitiesReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27031a;

    /* renamed from: b, reason: collision with root package name */
    public final q f27032b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f27033c;

    /* renamed from: d, reason: collision with root package name */
    public final p f27034d;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f27035e;

    /* renamed from: f, reason: collision with root package name */
    public final a f27036f;

    /* renamed from: g, reason: collision with root package name */
    public n f27037g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27038h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        public HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver.a(AudioCapabilitiesReceiver.this, n.a(context, intent));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f27040a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f27041b;

        public a(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f27040a = contentResolver;
            this.f27041b = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            AudioCapabilitiesReceiver.a(audioCapabilitiesReceiver, n.getCapabilities(audioCapabilitiesReceiver.f27031a));
        }

        public void register() {
            this.f27040a.registerContentObserver(this.f27041b, false, this);
        }

        public void unregister() {
            this.f27040a.unregisterContentObserver(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudioCapabilitiesReceiver(android.content.Context r4, com.google.android.exoplayer2.audio.q r5) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r4 = r4.getApplicationContext()
            r3.f27031a = r4
            java.lang.Object r5 = com.google.android.exoplayer2.util.a.checkNotNull(r5)
            com.google.android.exoplayer2.audio.q r5 = (com.google.android.exoplayer2.audio.q) r5
            r3.f27032b = r5
            android.os.Handler r5 = com.google.android.exoplayer2.util.n1.createHandlerForCurrentOrMainLooper()
            r3.f27033c = r5
            int r0 = com.google.android.exoplayer2.util.n1.f28506a
            r1 = 23
            r2 = 0
            if (r0 < r1) goto L24
            com.google.android.exoplayer2.audio.p r1 = new com.google.android.exoplayer2.audio.p
            r1.<init>(r3)
            goto L25
        L24:
            r1 = r2
        L25:
            r3.f27034d = r1
            r1 = 21
            if (r0 < r1) goto L31
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver r1 = new com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver
            r1.<init>()
            goto L32
        L31:
            r1 = r2
        L32:
            r3.f27035e = r1
            com.google.android.exoplayer2.audio.n r1 = com.google.android.exoplayer2.audio.n.f27212c
            r1 = 17
            if (r0 < r1) goto L53
            java.lang.String r0 = com.google.android.exoplayer2.util.n1.f28508c
            java.lang.String r1 = "Amazon"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4c
            java.lang.String r1 = "Xiaomi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L53
        L4c:
            java.lang.String r0 = "external_surround_sound_enabled"
            android.net.Uri r0 = android.provider.Settings.Global.getUriFor(r0)
            goto L54
        L53:
            r0 = r2
        L54:
            if (r0 == 0) goto L5f
            com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$a r2 = new com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver$a
            android.content.ContentResolver r4 = r4.getContentResolver()
            r2.<init>(r5, r4, r0)
        L5f:
            r3.f27036f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver.<init>(android.content.Context, com.google.android.exoplayer2.audio.q):void");
    }

    public static void a(AudioCapabilitiesReceiver audioCapabilitiesReceiver, n nVar) {
        if (!audioCapabilitiesReceiver.f27038h || nVar.equals(audioCapabilitiesReceiver.f27037g)) {
            return;
        }
        audioCapabilitiesReceiver.f27037g = nVar;
        ((o0) audioCapabilitiesReceiver.f27032b).onAudioCapabilitiesChanged(nVar);
    }

    public n register() {
        p pVar;
        if (this.f27038h) {
            return (n) com.google.android.exoplayer2.util.a.checkNotNull(this.f27037g);
        }
        this.f27038h = true;
        a aVar = this.f27036f;
        if (aVar != null) {
            aVar.register();
        }
        int i10 = com.google.android.exoplayer2.util.n1.f28506a;
        Handler handler = this.f27033c;
        Context context = this.f27031a;
        if (i10 >= 23 && (pVar = this.f27034d) != null) {
            o.registerAudioDeviceCallback(context, pVar, handler);
        }
        BroadcastReceiver broadcastReceiver = this.f27035e;
        n nVarA = n.a(context, broadcastReceiver != null ? context.registerReceiver(broadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null);
        this.f27037g = nVarA;
        return nVarA;
    }

    public void unregister() {
        p pVar;
        if (this.f27038h) {
            this.f27037g = null;
            int i10 = com.google.android.exoplayer2.util.n1.f28506a;
            Context context = this.f27031a;
            if (i10 >= 23 && (pVar = this.f27034d) != null) {
                o.unregisterAudioDeviceCallback(context, pVar);
            }
            BroadcastReceiver broadcastReceiver = this.f27035e;
            if (broadcastReceiver != null) {
                context.unregisterReceiver(broadcastReceiver);
            }
            a aVar = this.f27036f;
            if (aVar != null) {
                aVar.unregister();
            }
            this.f27038h = false;
        }
    }
}
