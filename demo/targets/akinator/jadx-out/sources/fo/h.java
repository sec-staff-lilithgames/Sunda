package fo;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import nh.we;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f55907a;

    public h(e eVar) {
        this.f55907a = eVar;
    }

    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        we weVar = e.f55823j;
        this.f55907a.d();
    }

    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        we weVar = e.f55823j;
        this.f55907a.d();
    }
}
