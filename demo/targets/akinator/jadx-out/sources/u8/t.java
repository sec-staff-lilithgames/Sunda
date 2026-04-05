package u8;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88118a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f88119b;

    public t(Context context, s sVar) {
        this.f88118a = context.getApplicationContext();
        this.f88119b = sVar;
    }

    public static m0 assetFileDescriptorFactory(Context context) {
        return new o(context);
    }

    public static m0 drawableFactory(Context context) {
        return new p(context);
    }

    public static m0 inputStreamFactory(Context context) {
        return new q(context);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, u8.s] */
    @Override // u8.l0
    public k0 buildLoadData(Integer num, int i10, int i11, n8.v vVar) {
        Resources.Theme theme = (Resources.Theme) vVar.get(z8.h.f97697b);
        return new k0(new i9.d(num), new r(theme, theme != null ? theme.getResources() : this.f88118a.getResources(), this.f88119b, num.intValue()));
    }

    @Override // u8.l0
    public boolean handles(Integer num) {
        return true;
    }
}
