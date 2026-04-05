package io.odeeo.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.l1;
import androidx.lifecycle.t1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.KProperty;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i implements io.odeeo.internal.b1.d, AudioManager.OnAudioFocusChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f68106k = {com.google.android.gms.internal.play_billing.a.n(i.class, "isAudioFocused", "isAudioFocused$odeeoSdk_release()Z", 0)};

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f68107a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.o f68108b;

    /* renamed from: c, reason: collision with root package name */
    public final t1 f68109c;

    /* renamed from: d, reason: collision with root package name */
    public final l1 f68110d;

    /* renamed from: e, reason: collision with root package name */
    public final t1 f68111e;

    /* renamed from: f, reason: collision with root package name */
    public final l1 f68112f;

    /* renamed from: g, reason: collision with root package name */
    public int f68113g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f68114h;

    /* renamed from: i, reason: collision with root package name */
    public AudioFocusRequest f68115i;

    /* renamed from: j, reason: collision with root package name */
    public final io.odeeo.internal.v1.a f68116j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f68117a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f68118b;

        public a(int i10, boolean z10) {
            this.f68117a = i10;
            this.f68118b = z10;
        }

        public static /* synthetic */ a copy$default(a aVar, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f68117a;
            }
            if ((i11 & 2) != 0) {
                z10 = aVar.f68118b;
            }
            return aVar.copy(i10, z10);
        }

        public final int component1() {
            return this.f68117a;
        }

        public final boolean component2() {
            return this.f68118b;
        }

        public final a copy(int i10, boolean z10) {
            return new a(i10, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f68117a == aVar.f68117a && this.f68118b == aVar.f68118b;
        }

        public final int getVolume() {
            return this.f68117a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f68117a) * 31;
            boolean z10 = this.f68118b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iHashCode + i10;
        }

        public final boolean isVolumeChangedByUser() {
            return this.f68118b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("VolumeChangeEvent(volume=");
            sb2.append(this.f68117a);
            sb2.append(", isVolumeChangedByUser=");
            return a.b.p(sb2, this.f68118b, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.b1.d f68119a;

        /* renamed from: b, reason: collision with root package name */
        public final String f68120b;

        public b(io.odeeo.internal.b1.d listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.f68119a = listener;
            this.f68120b = "android.media.EXTRA_VOLUME_STREAM_TYPE";
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(intent, "intent");
            Bundle extras = intent.getExtras();
            Integer numValueOf = extras == null ? null : Integer.valueOf(extras.getInt(this.f68120b));
            if (numValueOf != null && numValueOf.intValue() == 3) {
                this.f68119a.onAudioVolumeChanged();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f0 implements kv.a {
        public c() {
            super(0);
        }

        @Override // kv.a
        public final Float invoke() {
            return Float.valueOf(i.this.f68107a.getStreamMaxVolume(3));
        }
    }

    public i(AudioManager audioManager, Context context) {
        e0.checkNotNullParameter(audioManager, "audioManager");
        e0.checkNotNullParameter(context, "context");
        this.f68107a = audioManager;
        this.f68108b = tu.q.lazy(new c());
        t1 t1Var = new t1();
        this.f68109c = t1Var;
        this.f68110d = t1Var;
        t1 t1Var2 = new t1();
        this.f68111e = t1Var2;
        this.f68112f = t1Var2;
        this.f68113g = -1;
        this.f68116j = new io.odeeo.internal.v1.a(false);
        b bVar = new b(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        context.registerReceiver(bVar, intentFilter);
    }

    public static /* synthetic */ float getDeviceVolumePercent$default(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 3;
        }
        return iVar.getDeviceVolumePercent(i10);
    }

    public final void a(int i10) {
        setAudioFocused$odeeoSdk_release(i10 == 1);
        io.odeeo.internal.b2.a.d("handleAudioFocusChange focusChange: " + i10 + " isAudioFocused: " + isAudioFocused$odeeoSdk_release(), new Object[0]);
    }

    public final void abandonAudioFocus$odeeoSdk_release() {
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager = this.f68107a;
            AudioFocusRequest audioFocusRequest = this.f68115i;
            e0.checkNotNull(audioFocusRequest);
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        } else {
            this.f68107a.abandonAudioFocus(this);
        }
        setAudioFocused$odeeoSdk_release(false);
    }

    public final int b(int i10) {
        return (int) ((getStreamMaxVolume() * i10) / 100.0f);
    }

    public final int getAudioManagerStreamVolume$odeeoSdk_release() {
        return this.f68107a.getStreamVolume(3);
    }

    public final float getDeviceVolumePercent(int i10) {
        return io.odeeo.internal.v1.b.getDeviceVolumePercent(this.f68107a, i10);
    }

    public final l1 getFocusChangeEvents$odeeoSdk_release() {
        return this.f68112f;
    }

    public final int getLastLogicChangedVolume$odeeoSdk_release() {
        return this.f68113g;
    }

    public final float getStreamMaxVolume() {
        return ((Number) this.f68108b.getValue()).floatValue();
    }

    public final l1 getVolumeChangeEvents$odeeoSdk_release() {
        return this.f68110d;
    }

    public final boolean isAudioFocused$odeeoSdk_release() {
        return this.f68116j.getValue(this, f68106k[0]);
    }

    public final boolean isMuteEnabled() {
        return this.f68114h;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        io.odeeo.internal.b2.a.d(e0.stringPlus("onAudioFocusChange focusChange: ", Integer.valueOf(i10)), new Object[0]);
        this.f68111e.postValue(Integer.valueOf(i10));
        a(i10);
    }

    @Override // io.odeeo.internal.b1.d
    public void onAudioVolumeChanged() {
        int audioManagerStreamVolume$odeeoSdk_release = getAudioManagerStreamVolume$odeeoSdk_release();
        boolean z10 = this.f68113g != audioManagerStreamVolume$odeeoSdk_release;
        StringBuilder sbT = o2.t(audioManagerStreamVolume$odeeoSdk_release, "onAudioVolumeChanged currentVolume: ", " isVolumeChangeTriggeredByLogic: ");
        sbT.append(!z10);
        sbT.append(" isMuteEnabled: ");
        sbT.append(this.f68114h);
        io.odeeo.internal.b2.a.d(sbT.toString(), new Object[0]);
        this.f68109c.postValue(new a(audioManagerStreamVolume$odeeoSdk_release, z10));
        this.f68113g = -1;
    }

    public final void requestAudioFocus$odeeoSdk_release() {
        int iRequestAudioFocus;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(1).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this).build();
            this.f68115i = audioFocusRequestBuild;
            AudioManager audioManager = this.f68107a;
            e0.checkNotNull(audioFocusRequestBuild);
            iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
        } else {
            iRequestAudioFocus = this.f68107a.requestAudioFocus(this, 3, 3);
        }
        a(iRequestAudioFocus);
    }

    public final void setAudioFocused$odeeoSdk_release(boolean z10) {
        this.f68116j.setValue(this, f68106k[0], z10);
    }

    public final void setLastLogicChangedVolume$odeeoSdk_release(int i10) {
        this.f68113g = i10;
    }

    public final void setMuteEnabled(boolean z10) {
        this.f68114h = z10;
        if (z10) {
            abandonAudioFocus$odeeoSdk_release();
        } else {
            if (z10) {
                return;
            }
            requestAudioFocus$odeeoSdk_release();
        }
    }

    public final void setVolumeToPercentLevel(int i10) {
        int iB = b(i10);
        float streamMaxVolume = 100.0f / getStreamMaxVolume();
        while (iB * streamMaxVolume < i10) {
            iB++;
            i10 = b(iB);
        }
        setVolumeToRawLevel(iB);
    }

    public final void setVolumeToRawLevel(int i10) {
        this.f68113g = i10;
        this.f68107a.setStreamVolume(3, i10, 0);
    }
}
