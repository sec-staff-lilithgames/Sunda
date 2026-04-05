package com.iab.omid.library.mmadbridge.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31039a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f31040b;

    /* renamed from: c, reason: collision with root package name */
    private final a f31041c;

    /* renamed from: d, reason: collision with root package name */
    private final c f31042d;

    /* renamed from: e, reason: collision with root package name */
    private float f31043e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f31039a = context;
        this.f31040b = (AudioManager) context.getSystemService("audio");
        this.f31041c = aVar;
        this.f31042d = cVar;
    }

    private float a() {
        return this.f31041c.a(this.f31040b.getStreamVolume(3), this.f31040b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f31042d.a(this.f31043e);
    }

    public void c() {
        this.f31043e = a();
        b();
        this.f31039a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f31039a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f31043e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f31043e;
    }
}
