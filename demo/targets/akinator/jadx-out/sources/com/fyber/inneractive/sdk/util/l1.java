package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l1 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f26788a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f26789b;

    /* renamed from: c, reason: collision with root package name */
    public final List f26790c;

    public l1(k1 k1Var, Uri uri, List list) {
        this.f26788a = k1Var;
        this.f26789b = uri;
        this.f26790c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f26788a.mPriority.compareTo(((l1) obj).f26788a.mPriority);
    }
}
