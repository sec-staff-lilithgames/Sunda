package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f49526a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h f49527b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, boolean z10) {
            super(z10, null);
            e0.checkNotNullParameter(viewModel, "viewModel");
            this.f49527b = viewModel;
            this.f49528c = z10;
        }

        public final a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, boolean z10) {
            e0.checkNotNullParameter(viewModel, "viewModel");
            return new a(viewModel, z10);
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h b() {
            return this.f49527b;
        }

        public final boolean c() {
            return this.f49528c;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h d() {
            return this.f49527b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return e0.areEqual(this.f49527b, aVar.f49527b) && this.f49528c == aVar.f49528c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f49528c) + (this.f49527b.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Companion(viewModel=");
            sb2.append(this.f49527b);
            sb2.append(", isLastAdPart=");
            return a.b.p(sb2, this.f49528c, ')');
        }

        public static /* synthetic */ a a(a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                hVar = aVar.f49527b;
            }
            if ((i10 & 2) != 0) {
                z10 = aVar.f49528c;
            }
            return aVar.a(hVar, z10);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k
        public boolean a() {
            return this.f49528c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e f49529b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49530c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e viewModel, boolean z10) {
            super(z10, null);
            e0.checkNotNullParameter(viewModel, "viewModel");
            this.f49529b = viewModel;
            this.f49530c = z10;
        }

        public final b a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e viewModel, boolean z10) {
            e0.checkNotNullParameter(viewModel, "viewModel");
            return new b(viewModel, z10);
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e b() {
            return this.f49529b;
        }

        public final boolean c() {
            return this.f49530c;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e d() {
            return this.f49529b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return e0.areEqual(this.f49529b, bVar.f49529b) && this.f49530c == bVar.f49530c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f49530c) + (this.f49529b.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("DEC(viewModel=");
            sb2.append(this.f49529b);
            sb2.append(", isLastAdPart=");
            return a.b.p(sb2, this.f49530c, ')');
        }

        public static /* synthetic */ b a(b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e eVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eVar = bVar.f49529b;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f49530c;
            }
            return bVar.a(eVar, z10);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k
        public boolean a() {
            return this.f49530c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends k {

        /* renamed from: b, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l f49531b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49532c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l viewModel, boolean z10) {
            super(z10, null);
            e0.checkNotNullParameter(viewModel, "viewModel");
            this.f49531b = viewModel;
            this.f49532c = z10;
        }

        public final c a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l viewModel, boolean z10) {
            e0.checkNotNullParameter(viewModel, "viewModel");
            return new c(viewModel, z10);
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l b() {
            return this.f49531b;
        }

        public final boolean c() {
            return this.f49532c;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l d() {
            return this.f49531b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return e0.areEqual(this.f49531b, cVar.f49531b) && this.f49532c == cVar.f49532c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f49532c) + (this.f49531b.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Linear(viewModel=");
            sb2.append(this.f49531b);
            sb2.append(", isLastAdPart=");
            return a.b.p(sb2, this.f49532c, ')');
        }

        public static /* synthetic */ c a(c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = cVar.f49531b;
            }
            if ((i10 & 2) != 0) {
                z10 = cVar.f49532c;
            }
            return cVar.a(lVar, z10);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k
        public boolean a() {
            return this.f49532c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends k {

        /* renamed from: b, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k f49533b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f49534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k viewModel, boolean z10) {
            super(z10, null);
            e0.checkNotNullParameter(viewModel, "viewModel");
            this.f49533b = viewModel;
            this.f49534c = z10;
        }

        public final d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k viewModel, boolean z10) {
            e0.checkNotNullParameter(viewModel, "viewModel");
            return new d(viewModel, z10);
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k b() {
            return this.f49533b;
        }

        public final boolean c() {
            return this.f49534c;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k d() {
            return this.f49533b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return e0.areEqual(this.f49533b, dVar.f49533b) && this.f49534c == dVar.f49534c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f49534c) + (this.f49533b.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Mraid(viewModel=");
            sb2.append(this.f49533b);
            sb2.append(", isLastAdPart=");
            return a.b.p(sb2, this.f49534c, ')');
        }

        public static /* synthetic */ d a(d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k kVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                kVar = dVar.f49533b;
            }
            if ((i10 & 2) != 0) {
                z10 = dVar.f49534c;
            }
            return dVar.a(kVar, z10);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k
        public boolean a() {
            return this.f49534c;
        }
    }

    public /* synthetic */ k(boolean z10, u uVar) {
        this(z10);
    }

    public boolean a() {
        return this.f49526a;
    }

    public k(boolean z10) {
        this.f49526a = z10;
    }
}
