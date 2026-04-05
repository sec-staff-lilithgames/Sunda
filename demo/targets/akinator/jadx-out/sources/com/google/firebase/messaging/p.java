package com.google.firebase.messaging;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class p implements OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f29865c;

    public /* synthetic */ p(FirebaseMessaging firebaseMessaging, int i10) {
        this.f29864b = i10;
        this.f29865c = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = this.f29864b;
        FirebaseMessaging firebaseMessaging = this.f29865c;
        switch (i10) {
            case 0:
                CloudMessage cloudMessage = (CloudMessage) obj;
                j0 j0Var = FirebaseMessaging.f29723l;
                if (cloudMessage != null) {
                    x.logNotificationReceived(cloudMessage.getIntent());
                    firebaseMessaging.f29728c.f29894c.getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f29731f, new p(firebaseMessaging, 0));
                    break;
                }
                break;
            case 1:
                jh.i.N(firebaseMessaging.f29727b, firebaseMessaging.f29728c, firebaseMessaging.f());
                break;
            default:
                n0 n0Var = (n0) obj;
                j0 j0Var2 = FirebaseMessaging.f29723l;
                if (firebaseMessaging.isAutoInitEnabled()) {
                    n0Var.f();
                    break;
                }
                break;
        }
    }
}
