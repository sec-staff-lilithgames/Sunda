package qe;

import android.text.TextUtils;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f82903a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82904b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82905c;

    public w(String str, boolean z10, boolean z11) {
        this.f82903a = str;
        this.f82904b = z10;
        this.f82905c = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == w.class) {
            w wVar = (w) obj;
            if (TextUtils.equals(this.f82903a, wVar.f82903a) && this.f82904b == wVar.f82904b && this.f82905c == wVar.f82905c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((o2.e(31, 31, this.f82903a) + (this.f82904b ? 1231 : 1237)) * 31) + (this.f82905c ? 1231 : 1237);
    }
}
