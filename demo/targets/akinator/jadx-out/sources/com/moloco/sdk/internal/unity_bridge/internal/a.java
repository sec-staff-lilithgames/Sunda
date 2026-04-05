package com.moloco.sdk.internal.unity_bridge.internal;

import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.internal.unity_bridge.internal.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MolocoUnityLoadCallback f47203c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f47204e;

    public /* synthetic */ a(MolocoUnityLoadCallback molocoUnityLoadCallback, String str, int i10) {
        this.f47202b = i10;
        this.f47203c = molocoUnityLoadCallback;
        this.f47204e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47202b) {
            case 0:
                b.a(this.f47203c, this.f47204e);
                break;
            default:
                b.a.a(this.f47203c, this.f47204e);
                break;
        }
    }
}
