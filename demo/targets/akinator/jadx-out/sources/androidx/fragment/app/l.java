package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6399b;

    public l(ArrayList arrayList) {
        this.f6399b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        i2.b(4, this.f6399b);
    }
}
