package io.bidmachine;

import android.view.View;
import io.bidmachine.AdObjectImpl;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i4 extends AdObjectImpl.BaseUnifiedAdCallback implements hr.f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f60380a;

    public i4(ViewAdObject viewAdObject, AdProcessCallback adProcessCallback) {
        super(adProcessCallback);
        this.f60380a = new WeakReference(viewAdObject);
    }

    @Override // hr.f
    public void onAdLoaded(View view) {
        ViewAdObject viewAdObject = (ViewAdObject) this.f60380a.get();
        if (viewAdObject == null) {
            this.processCallback.processLoadFail(pr.a.internal("ViewAdObject is null"));
        } else {
            viewAdObject.setAdView(view);
            this.processCallback.processLoadSuccess();
        }
    }
}
