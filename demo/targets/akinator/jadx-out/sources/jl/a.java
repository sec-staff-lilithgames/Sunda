package jl;

import a.b;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f69667a;

    public a(String str) {
        this.f69667a = b.k("UnityScar", str);
    }

    public Bundle getExtras() {
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_5");
        return bundle;
    }

    public String getVersionName() {
        return this.f69667a;
    }
}
