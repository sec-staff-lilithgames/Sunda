package com.fyber.inneractive.sdk.cache;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f23123c = IAlog.a(d.class);

    /* renamed from: a, reason: collision with root package name */
    public final String f23124a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23125b;

    public d(String str) {
        this.f23124a = str;
        Locale locale = Locale.US;
        int iHashCode = str.hashCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iHashCode);
        this.f23125b = sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        String str = this.f23124a;
        IAlog.c("%s: onCacheCommitted: %s for url: %s", f23123c, (Uri) obj, str);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.f23125b;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.fromFile(new File(str));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.f23124a;
    }
}
