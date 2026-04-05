package oe;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f79086a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79087b;

    /* renamed from: c, reason: collision with root package name */
    public final List f79088c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f79089d;

    public g0(int i10, String str, List<f0> list, byte[] bArr) {
        this.f79086a = i10;
        this.f79087b = str;
        this.f79088c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.f79089d = bArr;
    }
}
