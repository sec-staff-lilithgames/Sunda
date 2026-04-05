package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class ga implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14019b;

    public /* synthetic */ ga(int i10) {
        this.f14019b = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f14019b) {
            case 0:
                AppLovinSdkUtils.runOnUiThread(runnable);
                break;
            case 1:
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                r.a.getInstance().postToMainThread(runnable);
                break;
            default:
                r.a.getInstance().executeOnDiskIO(runnable);
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
