package com.iab.omid.library.fyber.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30633a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f30634b;

    /* renamed from: c, reason: collision with root package name */
    private final a f30635c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30636d;

    /* renamed from: e, reason: collision with root package name */
    private float f30637e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f30633a = context;
        this.f30634b = (AudioManager) context.getSystemService("audio");
        this.f30635c = aVar;
        this.f30636d = cVar;
    }

    private float a() {
        return this.f30635c.a(this.f30634b.getStreamVolume(3), this.f30634b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f30636d.a(this.f30637e);
    }

    public void c() {
        this.f30637e = a();
        b();
        this.f30633a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f30633a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f30637e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f30637e;
    }
}
