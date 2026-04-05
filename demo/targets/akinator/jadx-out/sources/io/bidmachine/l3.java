package io.bidmachine;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l3 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f60592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f60593c;

    public l3(Context context, o3 o3Var) {
        this.f60592b = context;
        this.f60593c = o3Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        super.run();
        NetworkRegistry.initializeNetworksAwait(this.f60592b);
        o3 o3Var = this.f60593c;
        if (o3Var != null) {
            ((u0) o3Var).onExecuted();
        }
    }
}
