package io.odeeo.internal.w1;

import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final long f67385a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f67386b;

    /* renamed from: c, reason: collision with root package name */
    public long f67387c;

    public d(long j10, kv.a action) {
        e0.checkNotNullParameter(action, "action");
        this.f67385a = j10;
        this.f67386b = action;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        e0.checkNotNullParameter(v10, "v");
        if (SystemClock.elapsedRealtime() - this.f67387c <= this.f67385a) {
            return;
        }
        this.f67386b.invoke();
        this.f67387c = SystemClock.elapsedRealtime();
    }

    public /* synthetic */ d(long j10, kv.a aVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? 1000L : j10, aVar);
    }
}
