package com.inmobi.media;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.i9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2820i9 implements Df {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2853k9 f32929a;

    public C2820i9(C2853k9 c2853k9) {
        this.f32929a = c2853k9;
    }

    @Override // com.inmobi.media.Df
    public final void a(View view, boolean z10) {
        C2727d1 c2727d1;
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        C2853k9 c2853k9 = this.f32929a;
        if (z10) {
            c2853k9.p();
        } else {
            N8 n8H = c2853k9.h();
            if (n8H != null && (c2727d1 = n8H.f32062l) != null) {
                c2727d1.a();
            }
        }
        this.f32929a.a(view, z10);
    }
}
