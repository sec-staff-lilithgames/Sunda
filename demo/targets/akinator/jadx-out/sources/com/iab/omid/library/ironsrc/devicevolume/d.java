package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30904a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f30905b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30906c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30907d;

    /* renamed from: e, reason: collision with root package name */
    private float f30908e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f30904a = context;
        this.f30905b = (AudioManager) context.getSystemService("audio");
        this.f30906c = aVar;
        this.f30907d = cVar;
    }

    private float a() {
        return this.f30906c.a(this.f30905b.getStreamVolume(3), this.f30905b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f30907d.a(this.f30908e);
    }

    public void c() {
        this.f30908e = a();
        b();
        this.f30904a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f30904a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f30908e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f30908e;
    }
}
