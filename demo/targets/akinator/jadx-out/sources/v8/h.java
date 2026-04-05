package v8;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import n8.v;
import u8.k0;
import u8.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f89189a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f89190b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f89191c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f89192d;

    public h(Context context, l0 l0Var, l0 l0Var2, Class cls) {
        this.f89189a = context.getApplicationContext();
        this.f89190b = l0Var;
        this.f89191c = l0Var2;
        this.f89192d = cls;
    }

    @Override // u8.l0
    public k0 buildLoadData(Uri uri, int i10, int i11, v vVar) {
        return new k0(new i9.d(uri), new g(this.f89189a, this.f89190b, this.f89191c, uri, i10, i11, vVar, this.f89192d));
    }

    @Override // u8.l0
    public boolean handles(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && o8.b.isMediaStoreUri(uri);
    }
}
