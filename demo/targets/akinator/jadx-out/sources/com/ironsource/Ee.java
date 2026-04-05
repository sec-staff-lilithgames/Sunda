package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC3456t4;
import com.ironsource.M8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ee implements M8, M8.a {

    /* renamed from: a, reason: collision with root package name */
    private final Fe f34321a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3517we f34322b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3456t4 f34323c;

    /* renamed from: d, reason: collision with root package name */
    private int f34324d;

    /* renamed from: e, reason: collision with root package name */
    private long f34325e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34326a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f34327b = -1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f34328c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final long f34329d = -1;

        private a() {
        }
    }

    public Ee(Fe storage, InterfaceC3517we initResponseStorage, InterfaceC3456t4 currentTimeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.e0.checkNotNullParameter(initResponseStorage, "initResponseStorage");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f34321a = storage;
        this.f34322b = initResponseStorage;
        this.f34323c = currentTimeProvider;
        this.f34324d = -1;
        this.f34325e = -1L;
    }

    private final int b(Context context, Fe fe2) {
        int iB = fe2.b(context, 0) + 1;
        fe2.a(context, iB);
        return iB;
    }

    @Override // com.ironsource.M8.a
    public void a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f34324d = b(context, this.f34321a);
        this.f34325e = a(context, this.f34321a);
    }

    @Override // com.ironsource.M8
    public int c() {
        return this.f34324d;
    }

    private final long a(Context context, Fe fe2) {
        long jA = fe2.a(context, -1L);
        if (this.f34322b.a(context) || jA != -1) {
            return jA;
        }
        long jA2 = this.f34323c.a();
        IronLog.INTERNAL.verbose("set first session timestamp = " + jA2);
        fe2.b(context, jA2);
        return jA2;
    }

    @Override // com.ironsource.M8
    public String b() {
        String strD = IronSourceUtils.d();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strD, "getSessionId()");
        return strD;
    }

    public /* synthetic */ Ee(Fe fe2, InterfaceC3517we interfaceC3517we, InterfaceC3456t4 interfaceC3456t4, int i10, kotlin.jvm.internal.u uVar) {
        this(fe2, (i10 & 2) != 0 ? new C3534xe() : interfaceC3517we, (i10 & 4) != 0 ? new InterfaceC3456t4.a() : interfaceC3456t4);
    }

    @Override // com.ironsource.M8
    public long a() {
        return this.f34325e;
    }
}
