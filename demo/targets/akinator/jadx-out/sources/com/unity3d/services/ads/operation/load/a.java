package com.unity3d.services.ads.operation.load;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LoadOperationState f50741c;

    public /* synthetic */ a(LoadOperationState loadOperationState, int i10) {
        this.f50740b = i10;
        this.f50741c = loadOperationState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50740b) {
            case 0:
                LoadModuleDecoratorTimeout.lambda$onOperationTimeout$0(this.f50741c);
                break;
            default:
                this.f50741c.lambda$onUnityAdsAdLoaded$1();
                break;
        }
    }
}
