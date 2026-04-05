package com.inmobi.media;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K0 extends I1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U0 f31930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f31931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2745e2 f31932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f31933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f31934h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(U0 u02, String str, InterfaceC2745e2 interfaceC2745e2, String str2, String str3) {
        super(u02);
        this.f31930d = u02;
        this.f31931e = str;
        this.f31932f = interfaceC2745e2;
        this.f31933g = str2;
        this.f31934h = str3;
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        U0 u02 = (U0) this.f31862b.get();
        if (u02 != null) {
            try {
                C2793h c2793hM = u02.m();
                if (c2793hM == null || !kotlin.jvm.internal.e0.areEqual(c2793hM.s(), this.f31931e)) {
                    F5 f52 = this.f31930d.f32321j;
                    if (f52 != null) {
                        String strE = U0.e();
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE, "<get-TAG>(...)");
                        ((G5) f52).c(strE, "Returning blob as empty string");
                    }
                    InterfaceC2745e2 interfaceC2745e2 = this.f31932f;
                    String jsCallbackNamespace = this.f31933g;
                    String callback = this.f31934h;
                    GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = (GestureDetectorOnGestureListenerC3093yc) interfaceC2745e2;
                    gestureDetectorOnGestureListenerC3093yc.getClass();
                    kotlin.jvm.internal.e0.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
                    kotlin.jvm.internal.e0.checkNotNullParameter("", "blob");
                    F5 f53 = gestureDetectorOnGestureListenerC3093yc.f33628i;
                    if (f53 != null) {
                        String TAG = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                        ((G5) f53).a(TAG, "retrievedBlob");
                    }
                    gestureDetectorOnGestureListenerC3093yc.a(jsCallbackNamespace, callback + "();");
                    return;
                }
                String blob = c2793hM.F();
                InterfaceC2745e2 interfaceC2745e22 = this.f31932f;
                String jsCallbackNamespace2 = this.f31933g;
                String callback2 = this.f31934h;
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc2 = (GestureDetectorOnGestureListenerC3093yc) interfaceC2745e22;
                gestureDetectorOnGestureListenerC3093yc2.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(jsCallbackNamespace2, "jsCallbackNamespace");
                kotlin.jvm.internal.e0.checkNotNullParameter(callback2, "callback");
                kotlin.jvm.internal.e0.checkNotNullParameter(blob, "blob");
                F5 f54 = gestureDetectorOnGestureListenerC3093yc2.f33628i;
                if (f54 != null) {
                    String TAG2 = GestureDetectorOnGestureListenerC3093yc.f33611b1;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    ((G5) f54).a(TAG2, "retrievedBlob");
                }
                gestureDetectorOnGestureListenerC3093yc2.a(jsCallbackNamespace2, callback2 + '(' + blob + ");");
                F5 f55 = this.f31930d.f32321j;
                if (f55 != null) {
                    String strE2 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE2, "<get-TAG>(...)");
                    ((G5) f55).c(strE2, "Returning blob " + blob);
                }
            } catch (Exception e10) {
                F5 f56 = this.f31930d.f32321j;
                if (f56 != null) {
                    String strE3 = U0.e();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strE3, "<get-TAG>(...)");
                    ((G5) f56).a(strE3, "Exception while getBlob", e10);
                }
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }
}
