package com.iab.omid.library.unity3d.internal;

import android.view.View;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.weakreference.a f31310a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31311b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f31312c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31313d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f31310a = new com.iab.omid.library.unity3d.weakreference.a(view);
        this.f31311b = view.getClass().getCanonicalName();
        this.f31312c = friendlyObstructionPurpose;
        this.f31313d = str;
    }

    public String a() {
        return this.f31313d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f31312c;
    }

    public com.iab.omid.library.unity3d.weakreference.a c() {
        return this.f31310a;
    }

    public String d() {
        return this.f31311b;
    }
}
