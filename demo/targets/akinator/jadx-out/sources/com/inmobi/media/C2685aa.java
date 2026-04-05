package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2685aa implements Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32650a;

    public C2685aa(String resolvedUrl, int i10, pw.l bodyBytes, U9 responseMetaData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(resolvedUrl, "resolvedUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(bodyBytes, "bodyBytes");
        kotlin.jvm.internal.e0.checkNotNullParameter(responseMetaData, "responseMetaData");
        this.f32650a = i10;
    }

    @Override // com.inmobi.media.Y9
    public final int a() {
        return this.f32650a;
    }

    @Override // com.inmobi.media.Y9
    public final String b() {
        return null;
    }
}
