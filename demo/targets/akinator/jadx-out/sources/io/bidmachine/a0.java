package io.bidmachine;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f59834a = new AtomicBoolean(true);

    public abstract AdvertisingDataManager$AdvertisingData a(Context context);

    public AdvertisingDataManager$AdvertisingData retrieve(Context context) {
        AtomicBoolean atomicBoolean = this.f59834a;
        if (!atomicBoolean.get()) {
            return null;
        }
        try {
            return a(context);
        } catch (NoClassDefFoundError e10) {
            atomicBoolean.set(false);
            nm.a.w(e10);
            return null;
        } catch (Throwable th2) {
            nm.a.w(th2);
            return null;
        }
    }
}
