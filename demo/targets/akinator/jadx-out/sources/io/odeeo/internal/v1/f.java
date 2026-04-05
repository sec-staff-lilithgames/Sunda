package io.odeeo.internal.v1;

import androidx.lifecycle.r1;
import androidx.lifecycle.u1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f<X> implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final r1 f67274a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f67275b;

    public f(r1 outputLiveData) {
        e0.checkNotNullParameter(outputLiveData, "outputLiveData");
        this.f67274a = outputLiveData;
        this.f67275b = true;
    }

    @Override // androidx.lifecycle.u1
    public void onChanged(X x10) {
        Object value = this.f67274a.getValue();
        if (this.f67275b || ((value == null && x10 != null) || !(value == null || e0.areEqual(value, x10)))) {
            this.f67275b = false;
            this.f67274a.setValue(x10);
        }
    }
}
