package com.iab.omid.library.amazon.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30103a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f30104b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30105c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30106d;

    /* renamed from: e, reason: collision with root package name */
    private float f30107e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f30103a = context;
        this.f30104b = (AudioManager) context.getSystemService("audio");
        this.f30105c = aVar;
        this.f30106d = cVar;
    }

    private float a() {
        return this.f30105c.a(this.f30104b.getStreamVolume(3), this.f30104b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f30106d.a(this.f30107e);
    }

    public void c() {
        this.f30107e = a();
        b();
        this.f30103a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f30103a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f30107e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f30107e;
    }
}
