package vn;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i implements zn.p {

    /* renamed from: a, reason: collision with root package name */
    public final String f89448a;

    /* renamed from: b, reason: collision with root package name */
    public final List f89449b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f89450c;

    public i(String str, List list, boolean z10) {
        this.f89448a = str;
        this.f89449b = Collections.unmodifiableList(list);
        this.f89450c = z10;
    }

    @Override // zn.p
    public abstract /* synthetic */ Object copy(List list);
}
