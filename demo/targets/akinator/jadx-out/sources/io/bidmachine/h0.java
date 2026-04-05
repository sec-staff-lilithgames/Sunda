package io.bidmachine;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f60370a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public volatile String f60371b;

    public String getIfv() {
        return this.f60371b;
    }

    public void updateIfv(final Context context) {
        if (this.f60370a.compareAndSet(false, true)) {
            v1.get().execute(new cn.a() { // from class: io.bidmachine.f0
                @Override // cn.a, pr.l
                public final void onRun() {
                    AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new g0(this.f60350b));
                }
            });
        }
    }
}
