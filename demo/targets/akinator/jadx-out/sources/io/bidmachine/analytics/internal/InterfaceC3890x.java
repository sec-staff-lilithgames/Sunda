package io.bidmachine.analytics.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC3890x extends IInterface {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.x$a */
    public static final class a implements InterfaceC3890x {

        /* renamed from: d, reason: collision with root package name */
        public static final d f60276d = new d(null);

        /* renamed from: e, reason: collision with root package name */
        private static final tu.o f60277e = tu.q.lazy(c.f60304a);

        /* renamed from: f, reason: collision with root package name */
        private static final b f60278f;

        /* renamed from: g, reason: collision with root package name */
        private static final b f60279g;

        /* renamed from: h, reason: collision with root package name */
        private static final b f60280h;

        /* renamed from: i, reason: collision with root package name */
        private static final b f60281i;

        /* renamed from: j, reason: collision with root package name */
        private static final b f60282j;

        /* renamed from: k, reason: collision with root package name */
        private static final b f60283k;

        /* renamed from: l, reason: collision with root package name */
        private static final b f60284l;

        /* renamed from: m, reason: collision with root package name */
        private static final b f60285m;

        /* renamed from: n, reason: collision with root package name */
        private static final b f60286n;

        /* renamed from: o, reason: collision with root package name */
        private static final b f60287o;

        /* renamed from: p, reason: collision with root package name */
        private static final b f60288p;

        /* renamed from: q, reason: collision with root package name */
        private static final b f60289q;

        /* renamed from: r, reason: collision with root package name */
        private static final b f60290r;

        /* renamed from: s, reason: collision with root package name */
        private static final b f60291s;

        /* renamed from: a, reason: collision with root package name */
        private final IBinder f60292a;

        /* renamed from: b, reason: collision with root package name */
        private b f60293b;

        /* renamed from: c, reason: collision with root package name */
        private final kv.a f60294c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.bidmachine.analytics.internal.x$a$a, reason: collision with other inner class name */
        public static final class C0583a extends kotlin.jvm.internal.f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0583a f60295a = new C0583a();

            public C0583a() {
                super(0);
            }

            @Override // kv.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Parcel invoke() {
                return Parcel.obtain();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.bidmachine.analytics.internal.x$a$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            private final int f60296a;

            /* renamed from: b, reason: collision with root package name */
            private final int f60297b;

            /* renamed from: c, reason: collision with root package name */
            private final int f60298c;

            /* renamed from: d, reason: collision with root package name */
            private final int f60299d;

            /* renamed from: e, reason: collision with root package name */
            private final int f60300e;

            /* renamed from: f, reason: collision with root package name */
            private final int f60301f;

            /* renamed from: g, reason: collision with root package name */
            private final int f60302g;

            /* renamed from: h, reason: collision with root package name */
            private final int f60303h;

            public b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f60296a = i10;
                this.f60297b = i11;
                this.f60298c = i12;
                this.f60299d = i13;
                this.f60300e = i14;
                this.f60301f = i15;
                this.f60302g = i16;
                this.f60303h = i17;
            }

            public final b a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                return new b(i10, i11, i12, i13, i14, i15, i16, i17);
            }

            public final int b() {
                return this.f60303h;
            }

            public final int c() {
                return this.f60301f;
            }

            public final int d() {
                return this.f60297b;
            }

            public final int e() {
                return this.f60298c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f60296a == bVar.f60296a && this.f60297b == bVar.f60297b && this.f60298c == bVar.f60298c && this.f60299d == bVar.f60299d && this.f60300e == bVar.f60300e && this.f60301f == bVar.f60301f && this.f60302g == bVar.f60302g && this.f60303h == bVar.f60303h;
            }

            public final int f() {
                return this.f60302g;
            }

            public final int g() {
                return this.f60300e;
            }

            public final int h() {
                return this.f60296a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f60303h) + e3.g.d(this.f60302g, e3.g.d(this.f60301f, e3.g.d(this.f60300e, e3.g.d(this.f60299d, e3.g.d(this.f60298c, e3.g.d(this.f60297b, Integer.hashCode(this.f60296a) * 31, 31), 31), 31), 31), 31), 31);
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ b a(b bVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
                if ((i18 & 1) != 0) {
                    i10 = bVar.f60296a;
                }
                if ((i18 & 2) != 0) {
                    i11 = bVar.f60297b;
                }
                if ((i18 & 4) != 0) {
                    i12 = bVar.f60298c;
                }
                if ((i18 & 8) != 0) {
                    i13 = bVar.f60299d;
                }
                if ((i18 & 16) != 0) {
                    i14 = bVar.f60300e;
                }
                if ((i18 & 32) != 0) {
                    i15 = bVar.f60301f;
                }
                if ((i18 & 64) != 0) {
                    i16 = bVar.f60302g;
                }
                if ((i18 & 128) != 0) {
                    i17 = bVar.f60303h;
                }
                int i19 = i16;
                int i20 = i17;
                int i21 = i14;
                int i22 = i15;
                return bVar.a(i10, i11, i12, i13, i21, i22, i19, i20);
            }

            public final int a() {
                return this.f60299d;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.bidmachine.analytics.internal.x$a$c */
        public static final class c extends kotlin.jvm.internal.f0 implements kv.a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f60304a = new c();

            public c() {
                super(0);
            }

            @Override // kv.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return s0.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLklJbkFwcEJpbGxpbmdTZXJ2aWNl");
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.bidmachine.analytics.internal.x$a$d */
        public static final class d {
            public /* synthetic */ d(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final String a() {
                return (String) a.f60277e.getValue();
            }

            public final b b() {
                return a.f60279g;
            }

            public final b c() {
                return a.f60280h;
            }

            public final b d() {
                return a.f60281i;
            }

            public final b e() {
                return a.f60282j;
            }

            public final b f() {
                return a.f60283k;
            }

            public final b g() {
                return a.f60284l;
            }

            public final b h() {
                return a.f60285m;
            }

            public final b i() {
                return a.f60286n;
            }

            public final b j() {
                return a.f60287o;
            }

            public final b k() {
                return a.f60288p;
            }

            public final b l() {
                return a.f60289q;
            }

            public final b m() {
                return a.f60290r;
            }

            public final b n() {
                return a.f60291s;
            }

            public final b o() {
                return a.f60278f;
            }

            private d() {
            }

            public final b a(t0 t0Var) {
                return t0Var.compareTo(new t0(5, 1, 0)) < 0 ? b() : t0Var.compareTo(new t0(5, 2, 0)) < 0 ? c() : t0Var.compareTo(new t0(5, 2, 1)) < 0 ? d() : t0Var.compareTo(new t0(6, 0, 0)) < 0 ? e() : t0Var.compareTo(new t0(6, 0, 1)) < 0 ? f() : t0Var.compareTo(new t0(6, 1, 0)) < 0 ? g() : t0Var.compareTo(new t0(6, 2, 0)) < 0 ? h() : t0Var.compareTo(new t0(6, 2, 1)) < 0 ? i() : t0Var.compareTo(new t0(7, 0, 0)) < 0 ? j() : t0Var.compareTo(new t0(7, 1, 0)) < 0 ? k() : t0Var.compareTo(new t0(7, 1, 1)) < 0 ? l() : t0Var.compareTo(new t0(7, 2, 0)) < 0 ? m() : t0Var.compareTo(new t0(8, 0, 1)) < 0 ? n() : o();
            }
        }

        static {
            b bVar = new b(1, 25, 11, 24, 9, 6, EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, 20);
            f60278f = bVar;
            b bVarA = b.a(bVar, 0, 17, 0, 9, 0, 0, 0, 17, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null);
            f60279g = bVarA;
            f60280h = bVarA;
            b bVarA2 = b.a(bVarA, 0, 19, 0, 19, 0, 0, 0, 0, 245, null);
            f60281i = bVarA2;
            f60282j = bVarA2;
            b bVarA3 = b.a(bVarA2, 0, 20, 0, 0, 0, 0, 0, 20, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null);
            f60283k = bVarA3;
            f60284l = bVarA3;
            b bVarA4 = b.a(bVarA3, 0, 21, 0, 0, 0, 0, 0, 0, 253, null);
            f60285m = bVarA4;
            b bVarA5 = b.a(bVarA4, 0, 22, 0, 0, 0, 0, 0, 0, 253, null);
            f60286n = bVarA5;
            f60287o = bVarA5;
            f60288p = bVarA5;
            b bVarA6 = b.a(bVarA5, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            f60289q = bVarA6;
            b bVarA7 = b.a(bVarA6, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            f60290r = bVarA7;
            f60291s = b.a(bVarA7, 0, 25, 0, 24, 0, 0, 0, 0, 245, null);
        }

        public a(IBinder iBinder, b bVar, kv.a aVar) {
            this.f60292a = iBinder;
            this.f60293b = bVar;
            this.f60294c = aVar;
        }

        private final Parcel p() {
            Parcel parcel = (Parcel) this.f60294c.invoke();
            parcel.writeInterfaceToken(f60276d.a());
            return parcel;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f60292a;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC3890x
        public int a(String str, String str2) {
            Parcel parcelP = p();
            parcelP.writeInt(this.f60293b.d());
            parcelP.writeString(str);
            parcelP.writeString(str2);
            Parcel parcelA = a(this.f60293b.h(), parcelP);
            int i10 = parcelA.readInt();
            parcelA.recycle();
            return i10;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC3890x
        public Bundle b(String str, String str2, Bundle bundle) {
            Parcel parcelP = p();
            parcelP.writeInt(this.f60293b.c());
            parcelP.writeString(str);
            parcelP.writeString(str2);
            parcelP.writeString(null);
            a(parcelP, bundle);
            Parcel parcelA = a(this.f60293b.g(), parcelP);
            Bundle bundle2 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle2;
        }

        public /* synthetic */ a(IBinder iBinder, b bVar, kv.a aVar, int i10, kotlin.jvm.internal.u uVar) {
            this(iBinder, bVar, (i10 & 4) != 0 ? C0583a.f60295a : aVar);
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC3890x
        public Bundle a(String str, String str2, Bundle bundle) {
            Parcel parcelP = p();
            parcelP.writeInt(this.f60293b.a());
            parcelP.writeString(str);
            parcelP.writeString(str2);
            parcelP.writeString(null);
            a(parcelP, bundle);
            Parcel parcelA = a(this.f60293b.e(), parcelP);
            Bundle bundle2 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle2;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC3890x
        public Bundle a(String str, String str2, Bundle bundle, Bundle bundle2) {
            Parcel parcelP = p();
            parcelP.writeInt(this.f60293b.b());
            parcelP.writeString(str);
            parcelP.writeString(str2);
            a(parcelP, bundle);
            a(parcelP, bundle2);
            Parcel parcelA = a(this.f60293b.f(), parcelP);
            Bundle bundle3 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle3;
        }

        private final void a(Parcel parcel, Parcelable parcelable) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }

        public final Parcel a(int i10, Parcel parcel) {
            Parcel parcel2 = (Parcel) this.f60294c.invoke();
            try {
                try {
                    this.f60292a.transact(i10, parcel, parcel2, 0);
                    parcel2.readException();
                    return parcel2;
                } catch (RuntimeException e10) {
                    parcel2.recycle();
                    throw e10;
                }
            } finally {
                parcel.recycle();
            }
        }

        private final Parcelable a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() == 0) {
                return null;
            }
            Object objCreateFromParcel = creator.createFromParcel(parcel);
            kotlin.jvm.internal.e0.checkNotNull(objCreateFromParcel, "null cannot be cast to non-null type android.os.Parcelable");
            return (Parcelable) objCreateFromParcel;
        }
    }

    int a(String str, String str2);

    Bundle a(String str, String str2, Bundle bundle);

    Bundle a(String str, String str2, Bundle bundle, Bundle bundle2);

    Bundle b(String str, String str2, Bundle bundle);
}
