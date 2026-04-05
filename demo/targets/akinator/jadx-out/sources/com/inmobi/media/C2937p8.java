package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C2937p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.p8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2937p8 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33261a;

    /* renamed from: b, reason: collision with root package name */
    public final C3039v9 f33262b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33263c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33264d;

    /* renamed from: e, reason: collision with root package name */
    public final AudioAttributes f33265e;

    /* renamed from: f, reason: collision with root package name */
    public AudioFocusRequest f33266f;

    /* renamed from: g, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f33267g;

    public C2937p8(Context context, C3039v9 audioFocusListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(audioFocusListener, "audioFocusListener");
        this.f33261a = context;
        this.f33262b = audioFocusListener;
        this.f33264d = new Object();
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(audioAttributesBuild, "build(...)");
        this.f33265e = audioAttributesBuild;
    }

    public final void a() {
        synchronized (this.f33264d) {
            try {
                Object systemService = this.f33261a.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        AudioFocusRequest audioFocusRequest = this.f33266f;
                        if (audioFocusRequest != null) {
                            audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        }
                    } else {
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f33267g;
                        if (onAudioFocusChangeListener != null) {
                            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: zk.r0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                C2937p8.a(this.f98179a, i10);
            }
        };
    }

    public final void c() {
        int iRequestAudioFocus;
        synchronized (this.f33264d) {
            try {
                Object systemService = this.f33261a.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    if (this.f33267g == null) {
                        this.f33267g = b();
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (this.f33266f == null) {
                            AudioFocusRequest.Builder audioAttributes = new AudioFocusRequest.Builder(2).setAudioAttributes(this.f33265e);
                            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f33267g;
                            kotlin.jvm.internal.e0.checkNotNull(onAudioFocusChangeListener);
                            AudioFocusRequest audioFocusRequestBuild = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, new Handler(Looper.getMainLooper())).build();
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(audioFocusRequestBuild, "build(...)");
                            this.f33266f = audioFocusRequestBuild;
                        }
                        AudioFocusRequest audioFocusRequest = this.f33266f;
                        kotlin.jvm.internal.e0.checkNotNull(audioFocusRequest);
                        iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                    } else {
                        iRequestAudioFocus = audioManager.requestAudioFocus(this.f33267g, 3, 2);
                    }
                } else {
                    iRequestAudioFocus = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iRequestAudioFocus == 1) {
            C3039v9 c3039v9 = this.f33262b;
            c3039v9.i();
            C2921o9 c2921o9 = c3039v9.f33498n;
            if (c2921o9 == null || c2921o9.f33195d == null) {
                return;
            }
            c2921o9.f33201j = false;
            c2921o9.f33200i.removeView(c2921o9.f33198g);
            c2921o9.f33200i.removeView(c2921o9.f33197f);
            c2921o9.a();
            return;
        }
        C3039v9 c3039v92 = this.f33262b;
        c3039v92.h();
        C2921o9 c2921o92 = c3039v92.f33498n;
        if (c2921o92 == null || c2921o92.f33195d == null) {
            return;
        }
        c2921o92.f33201j = true;
        c2921o92.f33200i.removeView(c2921o92.f33197f);
        c2921o92.f33200i.removeView(c2921o92.f33198g);
        c2921o92.b();
    }

    public static final void a(C2937p8 this$0, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (i10 == -2) {
            synchronized (this$0.f33264d) {
                this$0.f33263c = true;
            }
            C3039v9 c3039v9 = this$0.f33262b;
            c3039v9.h();
            C2921o9 c2921o9 = c3039v9.f33498n;
            if (c2921o9 == null || c2921o9.f33195d == null) {
                return;
            }
            c2921o9.f33201j = true;
            c2921o9.f33200i.removeView(c2921o9.f33197f);
            c2921o9.f33200i.removeView(c2921o9.f33198g);
            c2921o9.b();
            return;
        }
        if (i10 == -1) {
            synchronized (this$0.f33264d) {
                this$0.f33263c = false;
            }
            C3039v9 c3039v92 = this$0.f33262b;
            c3039v92.h();
            C2921o9 c2921o92 = c3039v92.f33498n;
            if (c2921o92 == null || c2921o92.f33195d == null) {
                return;
            }
            c2921o92.f33201j = true;
            c2921o92.f33200i.removeView(c2921o92.f33197f);
            c2921o92.f33200i.removeView(c2921o92.f33198g);
            c2921o92.b();
            return;
        }
        if (i10 != 1) {
            return;
        }
        synchronized (this$0.f33264d) {
            try {
                if (this$0.f33263c) {
                    C3039v9 c3039v93 = this$0.f33262b;
                    if (c3039v93.isPlaying()) {
                        c3039v93.i();
                        C2921o9 c2921o93 = c3039v93.f33498n;
                        if (c2921o93 != null && c2921o93.f33195d != null) {
                            c2921o93.f33201j = false;
                            c2921o93.f33200i.removeView(c2921o93.f33198g);
                            c2921o93.f33200i.removeView(c2921o93.f33197f);
                            c2921o93.a();
                        }
                    }
                }
                this$0.f33263c = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
