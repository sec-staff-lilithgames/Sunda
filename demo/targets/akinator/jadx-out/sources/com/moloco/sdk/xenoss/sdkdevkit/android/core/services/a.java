package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a, reason: collision with other inner class name */
    public static final class C0489a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0489a f50241a = new C0489a();

        public C0489a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final long f50242a;

        public b(long j10) {
            super(null);
            this.f50242a = j10;
        }

        public final long a() {
            return this.f50242a;
        }

        public final long b() {
            return this.f50242a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f50242a == ((b) obj).f50242a;
        }

        public int hashCode() {
            return Long.hashCode(this.f50242a);
        }

        public String toString() {
            return e3.g.n(new StringBuilder("AppForeground(lastBgTimestamp="), this.f50242a, ')');
        }

        public final b a(long j10) {
            return new b(j10);
        }

        public static /* synthetic */ b a(b bVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = bVar.f50242a;
            }
            return bVar.a(j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC0490a f50243a;

        /* renamed from: b, reason: collision with root package name */
        public final f f50244b;

        /* renamed from: c, reason: collision with root package name */
        public final g f50245c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$c$a, reason: collision with other inner class name */
        public static final class EnumC0490a {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0490a f50246b = new EnumC0490a("NONE", 0);

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0490a f50247c = new EnumC0490a("CLOSE", 1);

            /* renamed from: e, reason: collision with root package name */
            public static final EnumC0490a f50248e = new EnumC0490a("SKIP", 2);

            /* renamed from: f, reason: collision with root package name */
            public static final EnumC0490a f50249f = new EnumC0490a("SKIP_DEC", 3);

            /* renamed from: g, reason: collision with root package name */
            public static final EnumC0490a f50250g = new EnumC0490a("MUTE", 4);

            /* renamed from: h, reason: collision with root package name */
            public static final EnumC0490a f50251h = new EnumC0490a("UNMUTE", 5);

            /* renamed from: i, reason: collision with root package name */
            public static final EnumC0490a f50252i = new EnumC0490a(NativeAdContent.ViewTag.CTA, 6);

            /* renamed from: j, reason: collision with root package name */
            public static final EnumC0490a f50253j = new EnumC0490a("REPLAY", 7);

            /* renamed from: k, reason: collision with root package name */
            public static final EnumC0490a f50254k = new EnumC0490a("AD_BADGE", 8);

            /* renamed from: l, reason: collision with root package name */
            public static final /* synthetic */ EnumC0490a[] f50255l;

            /* renamed from: m, reason: collision with root package name */
            public static final /* synthetic */ cv.a f50256m;

            static {
                EnumC0490a[] enumC0490aArrA = a();
                f50255l = enumC0490aArrA;
                f50256m = cv.b.enumEntries(enumC0490aArrA);
            }

            public EnumC0490a(String str, int i10) {
            }

            public static final /* synthetic */ EnumC0490a[] a() {
                return new EnumC0490a[]{f50246b, f50247c, f50248e, f50249f, f50250g, f50251h, f50252i, f50253j, f50254k};
            }

            public static cv.a b() {
                return f50256m;
            }

            public static EnumC0490a valueOf(String str) {
                return (EnumC0490a) Enum.valueOf(EnumC0490a.class, str);
            }

            public static EnumC0490a[] values() {
                return (EnumC0490a[]) f50255l.clone();
            }
        }

        public c(EnumC0490a buttonType, f position, g size) {
            e0.checkNotNullParameter(buttonType, "buttonType");
            e0.checkNotNullParameter(position, "position");
            e0.checkNotNullParameter(size, "size");
            this.f50243a = buttonType;
            this.f50244b = position;
            this.f50245c = size;
        }

        public final EnumC0490a a() {
            return this.f50243a;
        }

        public final f b() {
            return this.f50244b;
        }

        public final g c() {
            return this.f50245c;
        }

        public final EnumC0490a d() {
            return this.f50243a;
        }

        public final f e() {
            return this.f50244b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f50243a == cVar.f50243a && e0.areEqual(this.f50244b, cVar.f50244b) && e0.areEqual(this.f50245c, cVar.f50245c);
        }

        public final g f() {
            return this.f50245c;
        }

        public int hashCode() {
            return this.f50245c.hashCode() + ((this.f50244b.hashCode() + (this.f50243a.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Button(buttonType=" + this.f50243a + ", position=" + this.f50244b + ", size=" + this.f50245c + ')';
        }

        public final c a(EnumC0490a buttonType, f position, g size) {
            e0.checkNotNullParameter(buttonType, "buttonType");
            e0.checkNotNullParameter(position, "position");
            e0.checkNotNullParameter(size, "size");
            return new c(buttonType, position, size);
        }

        public static /* synthetic */ c a(c cVar, EnumC0490a enumC0490a, f fVar, g gVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                enumC0490a = cVar.f50243a;
            }
            if ((i10 & 2) != 0) {
                fVar = cVar.f50244b;
            }
            if ((i10 & 4) != 0) {
                gVar = cVar.f50245c;
            }
            return cVar.a(enumC0490a, fVar, gVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f50261a = new e();

        public e() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final float f50262a;

        /* renamed from: b, reason: collision with root package name */
        public final float f50263b;

        public f(float f10, float f11) {
            this.f50262a = f10;
            this.f50263b = f11;
        }

        public final float a() {
            return this.f50262a;
        }

        public final float b() {
            return this.f50263b;
        }

        public final float c() {
            return this.f50262a;
        }

        public final float d() {
            return this.f50263b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f50262a, fVar.f50262a) == 0 && Float.compare(this.f50263b, fVar.f50263b) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f50263b) + (Float.hashCode(this.f50262a) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Position(topLeftXDp=");
            sb2.append(this.f50262a);
            sb2.append(", topLeftYDp=");
            return a.b.n(sb2, this.f50263b, ')');
        }

        public final f a(float f10, float f11) {
            return new f(f10, f11);
        }

        public static /* synthetic */ f a(f fVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = fVar.f50262a;
            }
            if ((i10 & 2) != 0) {
                f11 = fVar.f50263b;
            }
            return fVar.a(f10, f11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final float f50264a;

        /* renamed from: b, reason: collision with root package name */
        public final float f50265b;

        public g(float f10, float f11) {
            this.f50264a = f10;
            this.f50265b = f11;
        }

        public final float a() {
            return this.f50264a;
        }

        public final float b() {
            return this.f50265b;
        }

        public final float c() {
            return this.f50265b;
        }

        public final float d() {
            return this.f50264a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f50264a, gVar.f50264a) == 0 && Float.compare(this.f50265b, gVar.f50265b) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f50265b) + (Float.hashCode(this.f50264a) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Size(widthDp=");
            sb2.append(this.f50264a);
            sb2.append(", heightDp=");
            return a.b.n(sb2, this.f50265b, ')');
        }

        public final g a(float f10, float f11) {
            return new g(f10, f11);
        }

        public static /* synthetic */ g a(g gVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = gVar.f50264a;
            }
            if ((i10 & 2) != 0) {
                f11 = gVar.f50265b;
            }
            return gVar.a(f10, f11);
        }
    }

    public /* synthetic */ a(u uVar) {
        this();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final f f50257a;

        /* renamed from: b, reason: collision with root package name */
        public final f f50258b;

        /* renamed from: c, reason: collision with root package name */
        public final g f50259c;

        /* renamed from: d, reason: collision with root package name */
        public final List f50260d;

        public /* synthetic */ d(f fVar, f fVar2, g gVar, List list, int i10, u uVar) {
            this(fVar, (i10 & 2) != 0 ? null : fVar2, (i10 & 4) != 0 ? null : gVar, (i10 & 8) != 0 ? p0.emptyList() : list);
        }

        public final List<c> a() {
            return this.f50260d;
        }

        public final f b() {
            return this.f50257a;
        }

        public final f c() {
            return this.f50258b;
        }

        public final g d() {
            return this.f50259c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f clickPosition, f fVar, g gVar, List<c> buttonLayout) {
            super(null);
            e0.checkNotNullParameter(clickPosition, "clickPosition");
            e0.checkNotNullParameter(buttonLayout, "buttonLayout");
            this.f50257a = clickPosition;
            this.f50258b = fVar;
            this.f50259c = gVar;
            this.f50260d = buttonLayout;
        }
    }

    public a() {
    }
}
