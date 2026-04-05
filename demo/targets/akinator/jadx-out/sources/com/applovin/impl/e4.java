package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e4 {

    /* renamed from: a, reason: collision with root package name */
    private final View f13932a;

    /* renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f13933b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13934c;

    public e4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f13932a = view;
        this.f13933b = friendlyObstructionPurpose;
        this.f13934c = str;
    }

    public String a() {
        return this.f13934c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f13933b;
    }

    public View c() {
        return this.f13932a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e4 e4Var = (e4) obj;
            View view = this.f13932a;
            if (view == null ? e4Var.f13932a != null : !view.equals(e4Var.f13932a)) {
                return false;
            }
            if (this.f13933b != e4Var.f13933b) {
                return false;
            }
            String str = this.f13934c;
            String str2 = e4Var.f13934c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f13932a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f13933b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f13934c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
