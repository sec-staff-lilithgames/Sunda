package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30503a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f30504b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30505c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30506d;

    /* renamed from: e, reason: collision with root package name */
    private float f30507e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f30503a = context;
        this.f30504b = (AudioManager) context.getSystemService("audio");
        this.f30505c = aVar;
        this.f30506d = cVar;
    }

    private float a() {
        return this.f30505c.a(this.f30504b.getStreamVolume(3), this.f30504b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f30506d.a(this.f30507e);
    }

    public void c() {
        this.f30507e = a();
        b();
        this.f30503a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f30503a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f30507e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f30507e;
    }
}
