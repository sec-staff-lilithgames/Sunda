package com.unity3d.ads.adplayer;

import com.unity3d.services.core.device.Storage;
import kotlinx.coroutines.CoroutineExceptionHandler;
import zu.a;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 extends a implements CoroutineExceptionHandler {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, WebViewAdPlayer webViewAdPlayer) {
        super(key);
        this.this$0 = webViewAdPlayer;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(m mVar, Throwable th2) {
        Storage.Companion.removeStorageEventCallback(this.this$0.storageEventCallback);
    }
}
