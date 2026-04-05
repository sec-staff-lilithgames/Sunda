package com.amazon.aps.shared.util;

import com.amazon.aps.shared.util.ApsAsyncUtil;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ApsAsyncUtil.ApsReturnRunnable f12509c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ApsAsyncUtil.ApsExecutionListener f12510e;

    public /* synthetic */ a(ApsAsyncUtil.ApsReturnRunnable apsReturnRunnable, ApsAsyncUtil.ApsExecutionListener apsExecutionListener, int i10) {
        this.f12508b = i10;
        this.f12509c = apsReturnRunnable;
        this.f12510e = apsExecutionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12508b) {
            case 0:
                ApsAsyncUtil.lambda$runAsyncAndCallback$4(this.f12509c, this.f12510e);
                break;
            case 1:
                ApsAsyncUtil.lambda$runOnUiThreadAndAsyncCallback$1(this.f12509c, this.f12510e);
                break;
            default:
                ApsAsyncUtil.lambda$runAsyncAndCallbackOnUiThread$3(this.f12509c, this.f12510e);
                break;
        }
    }
}
