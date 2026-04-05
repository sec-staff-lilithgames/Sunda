package rp;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f84725a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84726b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84727c;

    /* renamed from: d, reason: collision with root package name */
    public final List f84728d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f84729e;

    public k0(int i10, String str, int i11, List<j0> list, byte[] bArr) {
        this.f84725a = i10;
        this.f84726b = str;
        this.f84727c = i11;
        this.f84728d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.f84729e = bArr;
    }

    public int getRoleFlags() {
        int i10 = this.f84727c;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
