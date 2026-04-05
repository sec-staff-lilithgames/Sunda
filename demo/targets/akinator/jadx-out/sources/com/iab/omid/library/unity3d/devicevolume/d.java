package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31292a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f31293b;

    /* renamed from: c, reason: collision with root package name */
    private final a f31294c;

    /* renamed from: d, reason: collision with root package name */
    private final c f31295d;

    /* renamed from: e, reason: collision with root package name */
    private float f31296e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f31292a = context;
        this.f31293b = (AudioManager) context.getSystemService("audio");
        this.f31294c = aVar;
        this.f31295d = cVar;
    }

    private float a() {
        return this.f31294c.a(this.f31293b.getStreamVolume(3), this.f31293b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f31295d.a(this.f31296e);
    }

    public void c() {
        this.f31296e = a();
        b();
        this.f31292a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f31292a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f31296e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f31296e;
    }
}
