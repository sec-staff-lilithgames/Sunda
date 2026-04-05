package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final b.o f5268a;

    public p0(b.o oVar) {
        this.f5268a = oVar;
    }

    @Override // androidx.browser.customtabs.o0
    public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
        try {
            this.f5268a.onGreatestScrollPercentageIncreased(i10, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.o0
    public void onSessionEnded(boolean z10, Bundle bundle) {
        try {
            this.f5268a.onSessionEnded(z10, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.o0
    public void onVerticalScrollEvent(boolean z10, Bundle bundle) {
        try {
            this.f5268a.onVerticalScrollEvent(z10, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
