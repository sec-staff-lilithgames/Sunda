package com.iab.omid.library.odeeoio.b;

import android.view.View;
import com.iab.omid.library.odeeoio.adsession.FriendlyObstructionPurpose;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.odeeoio.e.a f31180a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31181b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f31182c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31183d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f31180a = new com.iab.omid.library.odeeoio.e.a(view);
        this.f31181b = view.getClass().getCanonicalName();
        this.f31182c = friendlyObstructionPurpose;
        this.f31183d = str;
    }

    public com.iab.omid.library.odeeoio.e.a a() {
        return this.f31180a;
    }

    public String b() {
        return this.f31181b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f31182c;
    }

    public String d() {
        return this.f31183d;
    }
}
