package nj;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class e0 implements OnSuccessListener, OnFailureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mt.u f76883b;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        zt.q qVar = (zt.q) this.f76883b;
        qVar.onError(exc);
        qVar.onComplete();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        zt.q qVar = (zt.q) this.f76883b;
        qVar.onSuccess(obj);
        qVar.onComplete();
    }
}
