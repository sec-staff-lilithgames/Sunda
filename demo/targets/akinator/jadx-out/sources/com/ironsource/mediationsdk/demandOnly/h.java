package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC3275j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface h extends q {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a implements h {

        /* renamed from: a, reason: collision with root package name */
        private final String f37433a;

        /* renamed from: b, reason: collision with root package name */
        private final String f37434b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f37435c;

        public a(String str, String str2, boolean z10) {
            this.f37433a = str;
            this.f37434b = str2;
            this.f37435c = z10;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String b() {
            return this.f37434b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.f37435c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public String e() {
            return this.f37433a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends a {

        /* renamed from: d, reason: collision with root package name */
        private final String f37436d;

        /* renamed from: e, reason: collision with root package name */
        private final Activity f37437e;

        /* renamed from: f, reason: collision with root package name */
        private final ISDemandOnlyBannerLayout f37438f;

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z10, int i10, u uVar) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.a(this.f37436d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        public final Activity f() {
            return this.f37437e;
        }

        public final ISDemandOnlyBannerLayout g() {
            return this.f37438f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String adFormat, Activity activity, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str2, boolean z10) {
            super(str, str2, z10);
            e0.checkNotNullParameter(adFormat, "adFormat");
            this.f37436d = adFormat;
            this.f37437e = activity;
            this.f37438f = iSDemandOnlyBannerLayout;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f37439a = "";

        /* renamed from: b, reason: collision with root package name */
        private Activity f37440b;

        /* renamed from: c, reason: collision with root package name */
        private String f37441c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f37442d;

        /* renamed from: e, reason: collision with root package name */
        private String f37443e;

        /* renamed from: f, reason: collision with root package name */
        private ISDemandOnlyBannerLayout f37444f;

        public final c a(IronSource.a adFormat) {
            e0.checkNotNullParameter(adFormat, "adFormat");
            String string = adFormat.toString();
            e0.checkNotNullExpressionValue(string, "adFormat.toString()");
            this.f37439a = string;
            return this;
        }

        public final c b(String str) {
            this.f37441c = str;
            return this;
        }

        public final c a(Activity activity) {
            this.f37440b = activity;
            return this;
        }

        public final d b() {
            return new d(this.f37439a, this.f37440b, this.f37441c, this.f37443e, this.f37442d);
        }

        public final c a(Activity activity, Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f37440b = activity;
            return this;
        }

        public final c a(boolean z10) {
            this.f37442d = z10;
            return this;
        }

        public final c a(String str) {
            this.f37443e = str;
            return this;
        }

        public final c a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f37444f = iSDemandOnlyBannerLayout;
            return this;
        }

        public final b a() {
            return new b(this.f37439a, this.f37440b, this.f37441c, this.f37444f, this.f37443e, this.f37442d);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends a implements InterfaceC3275j {

        /* renamed from: d, reason: collision with root package name */
        private final String f37445d;

        /* renamed from: e, reason: collision with root package name */
        private final Activity f37446e;

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z10, int i10, u uVar) {
            this(str, activity, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.b(this.f37445d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC3275j
        public Activity d() {
            return this.f37446e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String adFormat, Activity activity, String str, String str2, boolean z10) {
            super(str, str2, z10);
            e0.checkNotNullParameter(adFormat, "adFormat");
            this.f37445d = adFormat;
            this.f37446e = activity;
        }
    }

    String b();

    boolean c();

    String e();
}
