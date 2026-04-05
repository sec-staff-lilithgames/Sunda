package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A4 implements S8, R8 {

    /* renamed from: a, reason: collision with root package name */
    private final A7 f33823a;

    /* JADX WARN: Multi-variable type inference failed */
    public A4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.R8
    public void a(Context context, EnumC3558z4 source, String key, String value) {
        tu.x0 x0Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        F4 f4A = this.f33823a.a(context, source);
        if (f4A != null) {
            f4A.b(key, value);
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public A4(A7 sharedSignalsStorageFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f33823a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.S8
    public String a(Context context, EnumC3558z4 source, String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        F4 f4A = this.f33823a.a(context, source);
        if (f4A != null) {
            return F4.a(f4A, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ A4(A7 a72, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new D4() : a72);
    }
}
