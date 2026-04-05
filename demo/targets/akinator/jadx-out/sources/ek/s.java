package ek;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class s implements com.google.firebase.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f54627a;

    @Override // com.google.firebase.h
    public final void onDeleted(String str, com.google.firebase.k kVar) {
        Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
        this.f54627a.onAppDelete();
    }
}
