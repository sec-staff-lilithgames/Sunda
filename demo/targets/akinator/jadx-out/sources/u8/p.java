package u8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p implements m0, s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88100a;

    public p(Context context) {
        this.f88100a = context;
    }

    @Override // u8.m0
    public l0 build(t0 t0Var) {
        return new t(this.f88100a, this);
    }

    @Override // u8.s
    public Class<Drawable> getDataClass() {
        return Drawable.class;
    }

    @Override // u8.s
    public void close(Drawable drawable) throws IOException {
    }

    @Override // u8.s
    public Drawable open(Resources.Theme theme, Resources resources, int i10) {
        return z8.e.getDrawable(this.f88100a, i10, theme);
    }

    @Override // u8.m0
    public void teardown() {
    }
}
