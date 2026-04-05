package androidx.media;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6852a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6853b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6854c;

    public p0(String str, int i10, int i11) {
        this.f6852a = str;
        this.f6853b = i10;
        this.f6854c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        int i10 = p0Var.f6854c;
        String str = p0Var.f6852a;
        int i11 = p0Var.f6853b;
        int i12 = this.f6854c;
        String str2 = this.f6852a;
        int i13 = this.f6853b;
        return (i13 < 0 || i11 < 0) ? TextUtils.equals(str2, str) && i12 == i10 : TextUtils.equals(str2, str) && i13 == i11 && i12 == i10;
    }

    @Override // androidx.media.m0
    public String getPackageName() {
        return this.f6852a;
    }

    @Override // androidx.media.m0
    public int getPid() {
        return this.f6853b;
    }

    @Override // androidx.media.m0
    public int getUid() {
        return this.f6854c;
    }

    public int hashCode() {
        return w3.d.hash(this.f6852a, Integer.valueOf(this.f6854c));
    }
}
