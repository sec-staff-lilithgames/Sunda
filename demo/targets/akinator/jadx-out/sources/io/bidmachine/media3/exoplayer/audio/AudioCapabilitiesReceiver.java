package io.bidmachine.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AudioCapabilitiesReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f60892a;

    /* renamed from: b, reason: collision with root package name */
    public final g f60893b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f60894c;

    /* renamed from: d, reason: collision with root package name */
    public final f f60895d;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f60896e;

    /* renamed from: f, reason: collision with root package name */
    public final a f60897f;

    /* renamed from: g, reason: collision with root package name */
    public d f60898g;

    /* renamed from: h, reason: collision with root package name */
    public h f60899h;

    /* renamed from: i, reason: collision with root package name */
    public gn.h f60900i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f60901j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        public HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.a(d.b(context, intent, audioCapabilitiesReceiver.f60900i, audioCapabilitiesReceiver.f60899h));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f60903a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f60904b;

        public a(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f60903a = contentResolver;
            this.f60904b = uri;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.a(d.c(audioCapabilitiesReceiver.f60892a, audioCapabilitiesReceiver.f60900i, audioCapabilitiesReceiver.f60899h));
        }

        public void register() {
            this.f60903a.registerContentObserver(this.f60904b, false, this);
        }

        public void unregister() {
            this.f60903a.unregisterContentObserver(this);
        }
    }

    @Deprecated
    public AudioCapabilitiesReceiver(Context context, g gVar) {
        this(context, gVar, gn.h.f57892g, (AudioDeviceInfo) null);
    }

    public final void a(d dVar) {
        if (!this.f60901j || dVar.equals(this.f60898g)) {
            return;
        }
        this.f60898g = dVar;
        ((d0) this.f60893b).onAudioCapabilitiesChanged(dVar);
    }

    public d register() {
        f fVar;
        if (this.f60901j) {
            return (d) io.bidmachine.media3.common.util.a.checkNotNull(this.f60898g);
        }
        this.f60901j = true;
        a aVar = this.f60897f;
        if (aVar != null) {
            aVar.register();
        }
        int i10 = io.bidmachine.media3.common.util.a1.f60679a;
        Handler handler = this.f60894c;
        Context context = this.f60892a;
        if (i10 >= 23 && (fVar = this.f60895d) != null) {
            e.registerAudioDeviceCallback(context, fVar, handler);
        }
        d dVarB = d.b(context, context.registerReceiver(this.f60896e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f60900i, this.f60899h);
        this.f60898g = dVarB;
        return dVarB;
    }

    public void setAudioAttributes(gn.h hVar) {
        this.f60900i = hVar;
        a(d.c(this.f60892a, hVar, this.f60899h));
    }

    public void setRoutedDevice(AudioDeviceInfo audioDeviceInfo) {
        h hVar = this.f60899h;
        if (Objects.equals(audioDeviceInfo, hVar == null ? null : hVar.f60946a)) {
            return;
        }
        h hVar2 = audioDeviceInfo != null ? new h(audioDeviceInfo) : null;
        this.f60899h = hVar2;
        a(d.c(this.f60892a, this.f60900i, hVar2));
    }

    public void unregister() {
        f fVar;
        if (this.f60901j) {
            this.f60898g = null;
            int i10 = io.bidmachine.media3.common.util.a1.f60679a;
            Context context = this.f60892a;
            if (i10 >= 23 && (fVar = this.f60895d) != null) {
                e.unregisterAudioDeviceCallback(context, fVar);
            }
            context.unregisterReceiver(this.f60896e);
            a aVar = this.f60897f;
            if (aVar != null) {
                aVar.unregister();
            }
            this.f60901j = false;
        }
    }

    public AudioCapabilitiesReceiver(Context context, g gVar, gn.h hVar, AudioDeviceInfo audioDeviceInfo) {
        this(context, gVar, hVar, (io.bidmachine.media3.common.util.a1.f60679a < 23 || audioDeviceInfo == null) ? null : new h(audioDeviceInfo));
    }

    public AudioCapabilitiesReceiver(Context context, g gVar, gn.h hVar, h hVar2) {
        Context applicationContext = context.getApplicationContext();
        this.f60892a = applicationContext;
        this.f60893b = (g) io.bidmachine.media3.common.util.a.checkNotNull(gVar);
        this.f60900i = hVar;
        this.f60899h = hVar2;
        Handler handlerCreateHandlerForCurrentOrMainLooper = io.bidmachine.media3.common.util.a1.createHandlerForCurrentOrMainLooper();
        this.f60894c = handlerCreateHandlerForCurrentOrMainLooper;
        this.f60895d = io.bidmachine.media3.common.util.a1.f60679a >= 23 ? new f(this) : null;
        this.f60896e = new HdmiAudioPlugBroadcastReceiver();
        d dVar = d.f60913c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f60897f = uriFor != null ? new a(handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), uriFor) : null;
    }
}
