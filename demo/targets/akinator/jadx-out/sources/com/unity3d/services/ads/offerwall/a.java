package com.unity3d.services.ads.offerwall;

import android.graphics.Bitmap;
import im.k;
import io.bidmachine.media3.ui.c0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50738b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f50737a = i10;
        this.f50738b = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int i10 = this.f50737a;
        Object obj2 = this.f50738b;
        switch (i10) {
            case 0:
                return OfferwallAdapterBridge.tapjoyPlacementListener$lambda$0((OfferwallAdapterBridge) obj2, obj, method, objArr);
            default:
                c0 c0Var = (c0) obj2;
                int i11 = c0.I;
                if (!method.getName().equals("onImageAvailable")) {
                    return null;
                }
                c0Var.f61708q.post(new k(12, c0Var, (Bitmap) objArr[1]));
                return null;
        }
    }
}
