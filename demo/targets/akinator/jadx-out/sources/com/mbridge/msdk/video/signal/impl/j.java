package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class j extends c {

    /* renamed from: b, reason: collision with root package name */
    private Activity f45222b;

    /* renamed from: c, reason: collision with root package name */
    private MBridgeBTContainer f45223c;

    public j(Activity activity, MBridgeBTContainer mBridgeBTContainer) {
        this.f45222b = activity;
        this.f45223c = mBridgeBTContainer;
    }

    @Override // com.mbridge.msdk.video.signal.impl.c, com.mbridge.msdk.video.signal.c
    public void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f45223c;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reactDeveloper(obj, str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.c, com.mbridge.msdk.video.signal.c
    public void reportUrls(Object obj, String str) {
        super.reportUrls(obj, str);
        MBridgeBTContainer mBridgeBTContainer = this.f45223c;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.reportUrls(obj, str);
        } else {
            com.mbridge.msdk.video.bt.component.d.c().c(obj, str);
        }
    }
}
