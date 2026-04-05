package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e0 extends c0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f13920f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f13921g;

    /* renamed from: h, reason: collision with root package name */
    private final List f13922h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f13923i;

    /* renamed from: j, reason: collision with root package name */
    private final String f13924j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13925k;

    /* renamed from: l, reason: collision with root package name */
    private final a f13926l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(Uri uri);
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.c0(), true, str2, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (this.f13693e.get() || (aVar = this.f13926l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f13693e.get()) {
            return Boolean.FALSE;
        }
        String strA = this.f13925k.H().a(a(), this.f13920f, this.f13921g.getCachePrefix(), this.f13922h, this.f13923i, this.f13925k.H().a(this.f13920f, this.f13921g), this.f13924j, e2.a((AppLovinAdImpl) this.f13921g));
        if (TextUtils.isEmpty(strA)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f13693e.get()) {
            return Boolean.FALSE;
        }
        File fileA = this.f13925k.H().a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13691c.b(this.f13690b, "Unable to retrieve File for cached filename = " + strA);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f13693e.get()) {
            return Boolean.FALSE;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13691c.b(this.f13690b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f13693e.get()) {
            return Boolean.FALSE;
        }
        a(uriFromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f13920f.equals(((e0) obj).f13920f);
    }

    public int hashCode() {
        String str = this.f13920f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public e0(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, String str2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f13920f = str;
        this.f13921g = bVar;
        this.f13922h = list;
        this.f13923i = z10;
        this.f13924j = str2;
        this.f13925k = kVar;
        this.f13926l = aVar;
    }
}
