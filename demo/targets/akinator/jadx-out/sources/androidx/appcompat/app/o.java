package androidx.appcompat.app;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements h.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f4816a;

    public o(AppCompatActivity appCompatActivity) {
        this.f4816a = appCompatActivity;
    }

    @Override // h.c
    public void onContextAvailable(Context context) {
        AppCompatActivity appCompatActivity = this.f4816a;
        v delegate = appCompatActivity.getDelegate();
        delegate.installViewFactory();
        delegate.onCreate(appCompatActivity.getSavedStateRegistry().consumeRestoredStateForKey("androidx:appcompat"));
    }
}
