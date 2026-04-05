package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30232a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f30233b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30234c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30235d;

    /* renamed from: e, reason: collision with root package name */
    private float f30236e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f30232a = context;
        this.f30233b = (AudioManager) context.getSystemService("audio");
        this.f30234c = aVar;
        this.f30235d = cVar;
    }

    private float a() {
        return this.f30234c.a(this.f30233b.getStreamVolume(3), this.f30233b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f30235d.a(this.f30236e);
    }

    public void c() {
        this.f30236e = a();
        b();
        this.f30232a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f30232a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f30236e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f30236e;
    }
}
