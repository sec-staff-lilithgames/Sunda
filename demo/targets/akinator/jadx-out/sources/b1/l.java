package b1;

import com.google.android.gms.tasks.OnSuccessListener;
import com.inmobi.media.AbstractC2812i1;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements h, OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.l f8627c;

    public /* synthetic */ l(int i10, kv.l lVar) {
        this.f8626b = i10;
        this.f8627c = lVar;
    }

    @Override // b1.h
    public void dispose() {
        kv.l lVar = this.f8627c;
        synchronized (y.getLock()) {
            y.f8710i = uu.y0.minus(y.f8710i, lVar);
        }
        y.a(y.f8702a);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f8626b) {
            case 1:
                AndroidAppSetIdDataSource.invoke$lambda$1(this.f8627c, obj);
                break;
            default:
                AbstractC2812i1.a(this.f8627c, obj);
                break;
        }
    }
}
