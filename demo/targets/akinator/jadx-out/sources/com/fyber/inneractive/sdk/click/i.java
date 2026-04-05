package com.fyber.inneractive.sdk.click;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23179a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23180b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23181c = false;

    public i(boolean z10, String str) {
        this.f23179a = str;
        this.f23180b = z10;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        if (this.f23181c) {
            return false;
        }
        return "fybernativebrowser".equalsIgnoreCase(uri.getScheme()) || "fybernativebrowser".equalsIgnoreCase(this.f23179a) || this.f23180b || uri.toString().contains("FYBER_OPEN_BROWSER");
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void cancel() {
        this.f23181c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    @Override // com.fyber.inneractive.sdk.click.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.click.b a(android.content.Context r8, android.net.Uri r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.click.i.a(android.content.Context, android.net.Uri, java.util.List):com.fyber.inneractive.sdk.click.b");
    }
}
