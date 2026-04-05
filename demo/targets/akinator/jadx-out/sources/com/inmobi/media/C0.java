package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class C0 implements InterfaceC3048w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D0 f31698a;

    public C0(D0 d02) {
        this.f31698a = d02;
    }

    public static final void a(D0 this$0, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f31721a.a(this$0.f31723c, false, b10 == 1 ? (short) 78 : b10 == 2 ? (short) 79 : b10 == 3 ? (short) 80 : b10 == 4 ? (short) 81 : b10 == 5 ? (short) 5 : b10 == 6 ? (short) 77 : b10 == 7 ? (short) 31 : b10 == 8 ? (short) 27 : (short) 82);
    }

    public static final void a(D0 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f31721a.a(this$0.f31723c, true, (short) 0);
    }

    @Override // com.inmobi.media.InterfaceC3048w1
    public final void a(C2843k assetBatch, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "assetBatch");
        this.f31698a.f31728h.a(assetBatch, b10);
        D0 d02 = this.f31698a;
        F5 f52 = d02.f31726f;
        if (f52 != null) {
            String str = d02.f31724d;
            StringBuilder sbA = N6.a(str, "access$getTAG$p(...)", "Notifying failure  to ad unit with placement ID (");
            sbA.append(this.f31698a.f31723c);
            sbA.append(')');
            ((G5) f52).b(str, sbA.toString());
        }
        new Handler(Looper.getMainLooper()).post(new zk.k(this.f31698a, b10, 0));
    }

    @Override // com.inmobi.media.InterfaceC3048w1
    public final void a(C2843k assetBatch) {
        kotlin.jvm.internal.e0.checkNotNullParameter(assetBatch, "assetBatch");
        this.f31698a.f31728h.a(assetBatch);
        D0 d02 = this.f31698a;
        F5 f52 = d02.f31726f;
        if (f52 != null) {
            String str = d02.f31724d;
            StringBuilder sbA = N6.a(str, "access$getTAG$p(...)", "Notifying ad unit with placement ID (");
            sbA.append(this.f31698a.f31723c);
            sbA.append(')');
            ((G5) f52).a(str, sbA.toString());
        }
        new Handler(Looper.getMainLooper()).post(new zg.h(this.f31698a, 1));
    }
}
