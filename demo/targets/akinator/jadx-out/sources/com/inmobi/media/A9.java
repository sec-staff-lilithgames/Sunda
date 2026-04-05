package com.inmobi.media;

import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A9 implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C2903n8 f31629a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f31630b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f31631c;

    public A9(Context context, ImageView imageView, C2903n8 imageAsset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(imageView, "imageView");
        kotlin.jvm.internal.e0.checkNotNullParameter(imageAsset, "imageAsset");
        this.f31629a = imageAsset;
        this.f31630b = new WeakReference(context);
        this.f31631c = new WeakReference(imageView);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String strA;
        HashMap map = N9.f32067c;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("N9", "access$getTAG$cp(...)");
        Objects.toString(method);
        if (sv.k0.equals("onError", method != null ? method.getName() : null, true)) {
            Context context = (Context) this.f31630b.get();
            ImageView imageView = (ImageView) this.f31631c.get();
            C2903n8 c2903n8 = this.f31629a;
            if (context != null && imageView != null) {
                String str = c2903n8.f33151p;
                if (sv.k0.equals("cross_button", c2903n8.f33137b, true)) {
                    if (str != null) {
                        int length = str.length() - 1;
                        int i10 = 0;
                        boolean z10 = false;
                        while (i10 <= length) {
                            boolean z11 = kotlin.jvm.internal.e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                            if (z10) {
                                if (!z11) {
                                    break;
                                }
                                length--;
                            } else if (z11) {
                                i10++;
                            } else {
                                z10 = true;
                            }
                        }
                        strA = S7.a(length, 1, str, i10);
                    } else {
                        strA = null;
                    }
                    if (strA == null || strA.length() == 0) {
                        C3073x9.a(context, imageView);
                    }
                }
            }
            c2903n8.a("error", b0.e2.s("[ERRORCODE]", "603"), (V7) null, (F5) null);
        }
        return null;
    }
}
