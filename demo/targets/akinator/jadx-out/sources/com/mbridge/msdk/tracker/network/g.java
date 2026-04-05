package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f43962a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43963b;

    public g(String str, String str2) {
        this.f43962a = str;
        this.f43963b = str2;
    }

    public final String a() {
        return this.f43962a;
    }

    public final String b() {
        return this.f43963b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f43962a, gVar.f43962a) && TextUtils.equals(this.f43963b, gVar.f43963b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f43963b.hashCode() + (this.f43962a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f43962a);
        sb2.append(",value=");
        return o2.o(sb2, this.f43963b, C3191e4.i.f36531e);
    }
}
