package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.pairip.VMRunner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public BroadcastReceiver f4817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f4818b;

    public o0(t0 t0Var) {
        this.f4818b = t0Var;
    }

    public final void a() {
        BroadcastReceiver broadcastReceiver = this.f4817a;
        if (broadcastReceiver != null) {
            try {
                this.f4818b.f4859m.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f4817a = null;
        }
    }

    public abstract IntentFilter b();

    public final void c() {
        a();
        IntentFilter intentFilterB = b();
        if (intentFilterB.countActions() == 0) {
            return;
        }
        if (this.f4817a == null) {
            this.f4817a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    VMRunner.invoke("AxDzCMeN3ox6EhZr", new Object[]{this, context, intent});
                }
            };
        }
        this.f4818b.f4859m.registerReceiver(this.f4817a, intentFilterB);
    }

    public abstract int getApplyableNightMode();

    public abstract void onChange();
}
