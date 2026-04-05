package com.unity3d.ads.core.domain;

import android.content.Context;
import bv.d;
import bv.f;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final AndroidWebViewClient androidWebViewClient;
    private final Context context;
    private final CoroutineDispatcher defaultDispatcher;
    private final CoroutineDispatcher mainDispatcher;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase", f = "AndroidGetWebViewContainerUseCase.kt", i = {0, 0}, l = {24}, m = "invoke", n = {"this", "adPlayerScope"}, s = {"L$0", "L$1"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetWebViewContainerUseCase.this.invoke(null, this);
        }
    }

    public AndroidGetWebViewContainerUseCase(Context context, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, CoroutineDispatcher mainDispatcher, CoroutineDispatcher defaultDispatcher) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(androidWebViewClient, "androidWebViewClient");
        e0.checkNotNullParameter(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        e0.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = mainDispatcher;
        this.defaultDispatcher = defaultDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r11, zu.d<? super com.unity3d.ads.adplayer.AndroidWebViewContainer> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase) r0
            tu.a0.throwOnFailure(r12)
        L30:
            r8 = r11
            goto L54
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            tu.a0.throwOnFailure(r12)
            kotlinx.coroutines.CoroutineDispatcher r12 = r10.mainDispatcher
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1 r2 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1
            r4 = 0
            r2.<init>(r10, r4)
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r2, r0)
            if (r12 != r1) goto L52
            return r1
        L52:
            r0 = r10
            goto L30
        L54:
            r3 = r12
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            com.unity3d.ads.adplayer.AndroidWebViewContainer r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer
            com.unity3d.ads.adplayer.AndroidWebViewClient r4 = r0.androidWebViewClient
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r5 = r0.sendWebViewClientErrorDiagnostics
            kotlinx.coroutines.CoroutineDispatcher r6 = r0.mainDispatcher
            kotlinx.coroutines.CoroutineDispatcher r7 = r0.defaultDispatcher
            android.content.Context r9 = r0.context
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke(kotlinx.coroutines.CoroutineScope, zu.d):java.lang.Object");
    }
}
