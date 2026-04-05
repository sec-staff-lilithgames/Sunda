package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import io.odeeo.internal.h.vfsA.QCmNMSGd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class n0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager f4814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f4815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(t0 t0Var, Context context) {
        super(t0Var);
        this.f4815d = t0Var;
        this.f4814c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // androidx.appcompat.app.o0
    public int getApplyableNightMode() {
        return h0.a(this.f4814c) ? 2 : 1;
    }

    @Override // androidx.appcompat.app.o0
    public void onChange() {
        this.f4815d.applyDayNight();
    }

    @Override // androidx.appcompat.app.o0
    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(QCmNMSGd.gZlKWAysF);
        return intentFilter;
    }
}
