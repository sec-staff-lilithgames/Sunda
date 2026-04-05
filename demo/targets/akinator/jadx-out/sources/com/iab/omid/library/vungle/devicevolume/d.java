package com.iab.omid.library.vungle.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31419a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f31420b;

    /* renamed from: c, reason: collision with root package name */
    private final a f31421c;

    /* renamed from: d, reason: collision with root package name */
    private final c f31422d;

    /* renamed from: e, reason: collision with root package name */
    private float f31423e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f31419a = context;
        this.f31420b = (AudioManager) context.getSystemService("audio");
        this.f31421c = aVar;
        this.f31422d = cVar;
    }

    private float a() {
        return this.f31421c.a(this.f31420b.getStreamVolume(3), this.f31420b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f31422d.a(this.f31423e);
    }

    public void c() {
        this.f31423e = a();
        b();
        this.f31419a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f31419a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f31423e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f31423e;
    }
}
