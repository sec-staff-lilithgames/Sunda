package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final a.AbstractC0378a f46571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46572b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46573c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends b {

        /* renamed from: d, reason: collision with root package name */
        public final String f46574d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a.AbstractC0378a.C0379a originAsset) {
            super(originAsset, null);
            e0.checkNotNullParameter(originAsset, "originAsset");
            this.f46574d = originAsset.e();
        }

        public final String d() {
            return this.f46574d;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$b, reason: collision with other inner class name */
    public static final class C0380b extends b {

        /* renamed from: d, reason: collision with root package name */
        public final Uri f46575d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0380b(a.AbstractC0378a.b originAsset, Uri precachedAssetUri) {
            super(originAsset, null);
            e0.checkNotNullParameter(originAsset, "originAsset");
            e0.checkNotNullParameter(precachedAssetUri, "precachedAssetUri");
            this.f46575d = precachedAssetUri;
        }

        public final Uri d() {
            return this.f46575d;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends b {

        /* renamed from: d, reason: collision with root package name */
        public final String f46576d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a.AbstractC0378a.c originAsset) {
            super(originAsset, null);
            e0.checkNotNullParameter(originAsset, "originAsset");
            this.f46576d = originAsset.d();
        }

        public final String d() {
            return this.f46576d;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends b {

        /* renamed from: d, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f46577d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a.AbstractC0378a.d originAsset, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a vastAd) {
            super(originAsset, null);
            e0.checkNotNullParameter(originAsset, "originAsset");
            e0.checkNotNullParameter(vastAd, "vastAd");
            this.f46577d = vastAd;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d() {
            return this.f46577d;
        }
    }

    public /* synthetic */ b(a.AbstractC0378a abstractC0378a, u uVar) {
        this(abstractC0378a);
    }

    public final int a() {
        return this.f46572b;
    }

    public final a.AbstractC0378a b() {
        return this.f46571a;
    }

    public final boolean c() {
        return this.f46573c;
    }

    public b(a.AbstractC0378a abstractC0378a) {
        this.f46571a = abstractC0378a;
        this.f46572b = abstractC0378a.a();
        this.f46573c = abstractC0378a.b();
    }
}
