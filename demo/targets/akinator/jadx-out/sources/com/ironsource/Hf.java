package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Hf {

    /* renamed from: a, reason: collision with root package name */
    private final String f34624a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34625b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34626c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f34627d;

    public Hf(String str, boolean z10, Boolean bool, String str2) {
        this.f34624a = str2;
        this.f34625b = str;
        this.f34626c = z10;
        this.f34627d = bool;
    }

    public final String a() {
        return this.f34624a;
    }

    public final boolean b() {
        return kotlin.jvm.internal.e0.areEqual(this.f34627d, Boolean.TRUE);
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkSettings, "networkSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        String str = this.f34625b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Kf kf2 = Kf.f34769a;
        return kotlin.jvm.internal.e0.areEqual(kf2.a(networkSettings), this.f34625b) && kf2.a(networkSettings, adUnit) == this.f34626c;
    }

    public /* synthetic */ Hf(String str, boolean z10, Boolean bool, String str2, int i10, kotlin.jvm.internal.u uVar) {
        this(str, z10, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? null : str2);
    }
}
