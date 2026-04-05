package com.ironsource;

import android.content.Context;
import com.ironsource.C3568ze;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class ni implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38003c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38004e;

    public /* synthetic */ ni(int i10, Object obj, Object obj2) {
        this.f38002b = i10;
        this.f38003c = obj;
        this.f38004e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38002b) {
            case 0:
                C3546y9.a((IronSourceError) this.f38003c, (C3546y9) this.f38004e);
                break;
            case 1:
                AbstractC3553z.a((AbstractC3553z) this.f38003c, (Map) this.f38004e);
                break;
            default:
                C3568ze.b.a((Context) this.f38003c, (C3326le) this.f38004e);
                break;
        }
    }
}
