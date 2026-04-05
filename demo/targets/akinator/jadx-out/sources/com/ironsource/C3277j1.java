package com.ironsource;

import com.ironsource.C3313l1;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3277j1 implements InterfaceC3295k1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36958a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36959b;

    /* renamed from: c, reason: collision with root package name */
    private final IronSource.a f36960c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36961d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f36962e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f36963f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.j1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36964a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f36965b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f36966c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f36967d = 1;

        private a() {
        }
    }

    public C3277j1(String version, String instanceId, IronSource.a adFormat, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        this.f36958a = version;
        this.f36959b = instanceId;
        this.f36960c = adFormat;
        this.f36961d = z10;
        this.f36962e = z11;
        this.f36963f = z12;
    }

    @Override // com.ironsource.InterfaceC3295k1
    public ArrayList<InterfaceC3331m1> a() {
        ArrayList<InterfaceC3331m1> arrayList = new ArrayList<>();
        arrayList.add(new C3313l1.v(this.f36958a));
        arrayList.add(new C3313l1.x(this.f36959b));
        arrayList.add(new C3313l1.a(this.f36960c));
        if (this.f36961d) {
            arrayList.add(new C3313l1.p(1));
        }
        if (this.f36962e) {
            arrayList.add(new C3313l1.e(1));
        }
        if (this.f36963f) {
            arrayList.add(new C3313l1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C3277j1(String str, String str2, IronSource.a aVar, boolean z10, boolean z11, boolean z12, int i10, kotlin.jvm.internal.u uVar) {
        this(str, str2, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? true : z12);
    }
}
