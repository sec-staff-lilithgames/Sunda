package com.inmobi.media;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31818a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31820c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31821d;

    /* renamed from: e, reason: collision with root package name */
    public final F5 f31822e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31823f = "G7";

    /* renamed from: g, reason: collision with root package name */
    public X9 f31824g;

    public G7(String str, int i10, int i11, long j10, F5 f52) {
        this.f31818a = str;
        this.f31819b = i10;
        this.f31820c = i11;
        this.f31821d = j10;
        this.f31822e = f52;
    }

    public final void a() {
        String str = this.f31818a;
        if (str == null) {
            F5 f52 = this.f31822e;
            if (f52 != null) {
                String TAG = this.f31823f;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                ((G5) f52).b(TAG, "MRAID Js Url provided is invalid.");
                return;
            }
            return;
        }
        X9 x92 = new X9(str, this.f31822e);
        x92.f32511t = false;
        x92.f32512u = false;
        x92.f32515x = false;
        this.f31824g = x92;
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).submit(new zg.h(this, 5));
    }

    public static final void a(G7 this$0) {
        byte[] bArr;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        X9 mRequest = this$0.f31824g;
        Context contextD = C2925od.d();
        if (contextD != null) {
            if ((System.currentTimeMillis() / 1000) - new C2720cb(contextD, "mraid_js_store").b() <= this$0.f31821d || mRequest == null) {
                return;
            }
            int i10 = 0;
            while (i10 <= this$0.f31819b) {
                F5 f52 = this$0.f31822e;
                if (f52 != null) {
                    String TAG = this$0.f31823f;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    ((G5) f52).a(TAG, "Attempting to get MRAID Js.");
                }
                kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "mRequest");
                Z9 z9B = mRequest.b();
                Context contextD2 = C2925od.d();
                if (z9B.b()) {
                    F5 f53 = this$0.f31822e;
                    if (f53 != null) {
                        String TAG2 = this$0.f31823f;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                        ((G5) f53).b(TAG2, "Getting MRAID Js from server failed.");
                    }
                    i10++;
                    if (i10 > this$0.f31819b) {
                        return;
                    }
                    try {
                        Thread.sleep(this$0.f31820c * 1000);
                    } catch (InterruptedException e10) {
                        F5 f54 = this$0.f31822e;
                        if (f54 != null) {
                            String TAG3 = this$0.f31823f;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
                            ((G5) f54).a(TAG3, "MRAID Js client interrupted while sleeping.", e10);
                        }
                    }
                } else if (contextD2 != null) {
                    C2720cb c2720cb = new C2720cb(contextD2, "mraid_js_store");
                    Map map = z9B.f32604f;
                    String strA = null;
                    List list = map != null ? (List) map.get("Content-Encoding") : null;
                    if (kotlin.jvm.internal.e0.areEqual(list != null ? (String) list.get(0) : null, "gzip")) {
                        F5 f55 = this$0.f31822e;
                        if (f55 != null) {
                            String TAG4 = this$0.f31823f;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG4, "TAG");
                            ((G5) f55).a(TAG4, "Response is GZIP-compressed, uncompressing it");
                        }
                        boolean z10 = C2736da.f32781a;
                        byte[] bArr2 = z9B.f32600b;
                        if (bArr2 != null && bArr2.length != 0) {
                            kotlin.jvm.internal.e0.checkNotNull(bArr2);
                            bArr = new byte[bArr2.length];
                            byte[] bArr3 = z9B.f32600b;
                            kotlin.jvm.internal.e0.checkNotNull(bArr3);
                            System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                        } else {
                            bArr = new byte[0];
                        }
                        byte[] bArrA = C2736da.a(bArr);
                        if (bArrA != null) {
                            try {
                                String str = new String(bArrA, sv.g.f86134b);
                                F5 f56 = this$0.f31822e;
                                if (f56 != null) {
                                    String TAG5 = this$0.f31823f;
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG5, "TAG");
                                    ((G5) f56).a(TAG5, "Getting MRAID Js from server succeeded.");
                                }
                                strA = str;
                            } catch (UnsupportedEncodingException e11) {
                                F5 f57 = this$0.f31822e;
                                if (f57 != null) {
                                    String str2 = this$0.f31823f;
                                    StringBuilder sbA = N6.a(str2, "TAG", "Failed to get MRAID JS \n");
                                    sbA.append(e11.getMessage());
                                    ((G5) f57).b(str2, sbA.toString());
                                }
                            }
                        }
                    } else {
                        F5 f58 = this$0.f31822e;
                        if (f58 != null) {
                            String TAG6 = this$0.f31823f;
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG6, "TAG");
                            ((G5) f58).a(TAG6, "Getting MRAID Js from server succeeded.");
                        }
                        strA = z9B.a();
                    }
                    if (strA != null) {
                        c2720cb.b("mraid_js_string", strA);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
