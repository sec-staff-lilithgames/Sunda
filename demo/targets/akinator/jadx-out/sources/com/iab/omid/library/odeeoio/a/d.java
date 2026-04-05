package com.iab.omid.library.odeeoio.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f31151a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f31152b;

    /* renamed from: c, reason: collision with root package name */
    private final a f31153c;

    /* renamed from: d, reason: collision with root package name */
    private final c f31154d;

    /* renamed from: e, reason: collision with root package name */
    private float f31155e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f31151a = context;
        this.f31152b = (AudioManager) context.getSystemService("audio");
        this.f31153c = aVar;
        this.f31154d = cVar;
    }

    private float c() {
        return this.f31153c.a(this.f31152b.getStreamVolume(3), this.f31152b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f31154d.a(this.f31155e);
    }

    public void a() {
        this.f31155e = c();
        d();
        this.f31151a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f31151a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (a(fC)) {
            this.f31155e = fC;
            d();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f31155e;
    }
}
