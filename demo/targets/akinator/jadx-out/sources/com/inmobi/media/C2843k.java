package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2843k {

    /* renamed from: a, reason: collision with root package name */
    public int f32985a;

    /* renamed from: b, reason: collision with root package name */
    public int f32986b;

    /* renamed from: c, reason: collision with root package name */
    public String f32987c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f32988d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f32989e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32990f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f32991g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f32992h;

    public C2843k(String batchId, Set rawAssets, InterfaceC3048w1 listener, String str, int i10) {
        str = (i10 & 16) != 0 ? null : str;
        kotlin.jvm.internal.e0.checkNotNullParameter(batchId, "batchId");
        kotlin.jvm.internal.e0.checkNotNullParameter(rawAssets, "rawAssets");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f32988d = new WeakReference(listener);
        this.f32991g = new ArrayList();
        this.f32989e = new HashSet();
        this.f32992h = rawAssets;
        this.f32990f = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdAssetBatch{rawAssets=");
        sb2.append(this.f32992h);
        sb2.append(", batchDownloadSuccessCount=");
        sb2.append(this.f32985a);
        sb2.append(", batchDownloadFailureCount=");
        return e3.g.m(sb2, this.f32986b, AbstractJsonLexerKt.END_OBJ);
    }
}
