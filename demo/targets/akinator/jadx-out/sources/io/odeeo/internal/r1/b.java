package io.odeeo.internal.r1;

import bv.d;
import io.odeeo.internal.j1.f;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.advertisement.AdLoader;
import io.odeeo.sdk.advertisement.data.BidRequestData;
import io.odeeo.sdk.domain.PlacementId;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import p0.o2;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends io.odeeo.internal.p1.a<AdLoader.c, a, C0645b> {

    /* renamed from: b, reason: collision with root package name */
    public final f f66234b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66235c;

    /* renamed from: d, reason: collision with root package name */
    public final String f66236d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a extends Throwable {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.r1.b$a$a, reason: collision with other inner class name */
        public static final class C0643a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f66237a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0643a(Throwable errorCause) {
                super(errorCause, null);
                e0.checkNotNullParameter(errorCause, "errorCause");
                this.f66237a = errorCause;
            }

            public static /* synthetic */ C0643a copy$default(C0643a c0643a, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    th2 = c0643a.f66237a;
                }
                return c0643a.copy(th2);
            }

            public final Throwable component1() {
                return this.f66237a;
            }

            public final C0643a copy(Throwable errorCause) {
                e0.checkNotNullParameter(errorCause, "errorCause");
                return new C0643a(errorCause);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0643a) && e0.areEqual(this.f66237a, ((C0643a) obj).f66237a);
            }

            public final Throwable getErrorCause() {
                return this.f66237a;
            }

            public int hashCode() {
                return this.f66237a.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "NetworkError(errorCause=" + this.f66237a + ')';
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.r1.b$a$b, reason: collision with other inner class name */
        public static final class C0644b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final int f66238a;

            /* renamed from: b, reason: collision with root package name */
            public final w0 f66239b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0644b(int i10, w0 w0Var) {
                super(null, 1, 0 == true ? 1 : 0);
                this.f66238a = i10;
                this.f66239b = w0Var;
            }

            public static /* synthetic */ C0644b copy$default(C0644b c0644b, int i10, w0 w0Var, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = c0644b.f66238a;
                }
                if ((i11 & 2) != 0) {
                    w0Var = c0644b.f66239b;
                }
                return c0644b.copy(i10, w0Var);
            }

            public final int component1() {
                return this.f66238a;
            }

            public final w0 component2() {
                return this.f66239b;
            }

            public final C0644b copy(int i10, w0 w0Var) {
                return new C0644b(i10, w0Var);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0644b)) {
                    return false;
                }
                C0644b c0644b = (C0644b) obj;
                return this.f66238a == c0644b.f66238a && e0.areEqual(this.f66239b, c0644b.f66239b);
            }

            public final int getCode() {
                return this.f66238a;
            }

            public final w0 getErrorBody() {
                return this.f66239b;
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f66238a) * 31;
                w0 w0Var = this.f66239b;
                return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ServerError(code=" + this.f66238a + ", errorBody=" + this.f66239b + ')';
            }
        }

        public /* synthetic */ a(Throwable th2, u uVar) {
            this(th2);
        }

        public a(Throwable th2) {
            super(th2);
        }

        public /* synthetic */ a(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.r1.b$b, reason: collision with other inner class name */
    public static final class C0645b {

        /* renamed from: a, reason: collision with root package name */
        public final BidRequestData f66240a;

        /* renamed from: b, reason: collision with root package name */
        public final String f66241b;

        /* renamed from: c, reason: collision with root package name */
        public final String f66242c;

        /* renamed from: d, reason: collision with root package name */
        public final AdUnit.PlacementType f66243d;

        public /* synthetic */ C0645b(BidRequestData bidRequestData, String str, String str2, AdUnit.PlacementType placementType, u uVar) {
            this(bidRequestData, str, str2, placementType);
        }

        /* renamed from: copy-gfFLLNU$default, reason: not valid java name */
        public static /* synthetic */ C0645b m4597copygfFLLNU$default(C0645b c0645b, BidRequestData bidRequestData, String str, String str2, AdUnit.PlacementType placementType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bidRequestData = c0645b.f66240a;
            }
            if ((i10 & 2) != 0) {
                str = c0645b.f66241b;
            }
            if ((i10 & 4) != 0) {
                str2 = c0645b.f66242c;
            }
            if ((i10 & 8) != 0) {
                placementType = c0645b.f66243d;
            }
            return c0645b.m4599copygfFLLNU(bidRequestData, str, str2, placementType);
        }

        public final BidRequestData component1() {
            return this.f66240a;
        }

        public final String component2() {
            return this.f66241b;
        }

        /* renamed from: component3-aRVDu34, reason: not valid java name */
        public final String m4598component3aRVDu34() {
            return this.f66242c;
        }

        public final AdUnit.PlacementType component4() {
            return this.f66243d;
        }

        /* renamed from: copy-gfFLLNU, reason: not valid java name */
        public final C0645b m4599copygfFLLNU(BidRequestData bidRequestData, String requestId, String placementId, AdUnit.PlacementType placementType) {
            e0.checkNotNullParameter(bidRequestData, "bidRequestData");
            e0.checkNotNullParameter(requestId, "requestId");
            e0.checkNotNullParameter(placementId, "placementId");
            e0.checkNotNullParameter(placementType, "placementType");
            return new C0645b(bidRequestData, requestId, placementId, placementType, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0645b)) {
                return false;
            }
            C0645b c0645b = (C0645b) obj;
            return e0.areEqual(this.f66240a, c0645b.f66240a) && e0.areEqual(this.f66241b, c0645b.f66241b) && PlacementId.m4633equalsimpl0(this.f66242c, c0645b.f66242c) && this.f66243d == c0645b.f66243d;
        }

        public final BidRequestData getBidRequestData() {
            return this.f66240a;
        }

        /* renamed from: getPlacementId-aRVDu34, reason: not valid java name */
        public final String m4600getPlacementIdaRVDu34() {
            return this.f66242c;
        }

        public final AdUnit.PlacementType getPlacementType() {
            return this.f66243d;
        }

        public final String getRequestId() {
            return this.f66241b;
        }

        public int hashCode() {
            return this.f66243d.hashCode() + ((PlacementId.m4634hashCodeimpl(this.f66242c) + o2.e(this.f66240a.hashCode() * 31, 31, this.f66241b)) * 31);
        }

        public String toString() {
            return "Params(bidRequestData=" + this.f66240a + ", requestId=" + this.f66241b + ", placementId=" + ((Object) PlacementId.m4635toStringimpl(this.f66242c)) + ", placementType=" + this.f66243d + ')';
        }

        public C0645b(BidRequestData bidRequestData, String str, String str2, AdUnit.PlacementType placementType) {
            this.f66240a = bidRequestData;
            this.f66241b = str;
            this.f66242c = str2;
            this.f66243d = placementType;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.usecase.bidrequest.MakeBidRequestUseCase", f = "MakeBidRequestUseCase.kt", i = {}, l = {31}, m = "execute", n = {}, s = {})
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f66244a;

        /* renamed from: c, reason: collision with root package name */
        public int f66246c;

        public c(zu.d<? super c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f66244a = obj;
            this.f66246c |= Integer.MIN_VALUE;
            return b.this.execute(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f networkManager, String appKey, String bundleId) {
        super(Dispatchers.getIO());
        e0.checkNotNullParameter(networkManager, "networkManager");
        e0.checkNotNullParameter(appKey, "appKey");
        e0.checkNotNullParameter(bundleId, "bundleId");
        this.f66234b = networkManager;
        this.f66235c = appKey;
        this.f66236d = bundleId;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.odeeo.internal.p1.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(io.odeeo.internal.r1.b.C0645b r14, zu.d<? super io.odeeo.internal.a.c<io.odeeo.sdk.advertisement.AdLoader.c, ? extends io.odeeo.internal.r1.b.a>> r15) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.r1.b.execute(io.odeeo.internal.r1.b$b, zu.d):java.lang.Object");
    }
}
