package pf;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import nh.we;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f81114a;

    public f(c cVar) {
        this.f81114a = cVar;
    }

    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        we weVar = c.f81029k;
        this.f81114a.e();
    }

    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        we weVar = c.f81029k;
        this.f81114a.e();
    }
}
