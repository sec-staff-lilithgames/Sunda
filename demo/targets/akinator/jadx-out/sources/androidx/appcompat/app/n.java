package androidx.appcompat.app;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements v5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f4813a;

    public n(AppCompatActivity appCompatActivity) {
        this.f4813a = appCompatActivity;
    }

    @Override // v5.g
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        this.f4813a.getDelegate().onSaveInstanceState(bundle);
        return bundle;
    }
}
