package com.iab.omid.library.inmobi.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30768a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f30769b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.a f30770c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30771d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<Float> f30772e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            if (((Float) d.this.f30772e.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f30771d.a(fA);
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.inmobi.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f30772e = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f30768a = context;
        this.f30769b = (AudioManager) context.getSystemService("audio");
        this.f30770c = aVar;
        this.f30771d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f30770c.a(this.f30769b.getStreamVolume(3), this.f30769b.getStreamMaxVolume(3));
    }

    private void d() {
        new Thread(new a()).start();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        d();
    }

    public void b() {
        d();
        this.f30768a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f30768a.getContentResolver().unregisterContentObserver(this);
    }
}
