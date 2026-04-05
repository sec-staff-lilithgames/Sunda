package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class k {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        public final int f49963a;

        public a(int i10) {
            super(null);
            this.f49963a = i10;
        }

        public final int a() {
            return this.f49963a;
        }

        public final int b() {
            return this.f49963a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f49963a == ((a) obj).f49963a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f49963a);
        }

        public String toString() {
            return e3.g.m(new StringBuilder("Html(webViewId="), this.f49963a, ')');
        }

        public final a a(int i10) {
            return new a(i10);
        }

        public static /* synthetic */ a a(a aVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f49963a;
            }
            return aVar.a(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public final String f49964a;

        /* renamed from: b, reason: collision with root package name */
        public final int f49965b;

        /* renamed from: c, reason: collision with root package name */
        public final int f49966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String imageUrl, int i10, int i11) {
            super(null);
            e0.checkNotNullParameter(imageUrl, "imageUrl");
            this.f49964a = imageUrl;
            this.f49965b = i10;
            this.f49966c = i11;
        }

        public final String a() {
            return this.f49964a;
        }

        public final int b() {
            return this.f49965b;
        }

        public final int c() {
            return this.f49966c;
        }

        public final int d() {
            return this.f49966c;
        }

        public final String e() {
            return this.f49964a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return e0.areEqual(this.f49964a, bVar.f49964a) && this.f49965b == bVar.f49965b && this.f49966c == bVar.f49966c;
        }

        public final int f() {
            return this.f49965b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f49966c) + e3.g.d(this.f49965b, this.f49964a.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Image(imageUrl=");
            sb2.append(this.f49964a);
            sb2.append(", w=");
            sb2.append(this.f49965b);
            sb2.append(", h=");
            return e3.g.m(sb2, this.f49966c, ')');
        }

        public final b a(String imageUrl, int i10, int i11) {
            e0.checkNotNullParameter(imageUrl, "imageUrl");
            return new b(imageUrl, i10, i11);
        }

        public static /* synthetic */ b a(b bVar, String str, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = bVar.f49964a;
            }
            if ((i12 & 2) != 0) {
                i10 = bVar.f49965b;
            }
            if ((i12 & 4) != 0) {
                i11 = bVar.f49966c;
            }
            return bVar.a(str, i10, i11);
        }
    }

    public /* synthetic */ k(u uVar) {
        this();
    }

    public k() {
    }
}
