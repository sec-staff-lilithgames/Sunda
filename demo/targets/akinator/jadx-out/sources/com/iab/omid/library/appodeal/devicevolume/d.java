package com.iab.omid.library.appodeal.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30367a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f30368b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.a f30369c;

    /* renamed from: d, reason: collision with root package name */
    private final c f30370d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<Float> f30371e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            if (((Float) d.this.f30371e.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f30370d.a(fA);
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.appodeal.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f30371e = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f30367a = context;
        this.f30368b = (AudioManager) context.getSystemService("audio");
        this.f30369c = aVar;
        this.f30370d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f30369c.a(this.f30368b.getStreamVolume(3), this.f30368b.getStreamMaxVolume(3));
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
        this.f30367a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f30367a.getContentResolver().unregisterContentObserver(this);
    }
}
