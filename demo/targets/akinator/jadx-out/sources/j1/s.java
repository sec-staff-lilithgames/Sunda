package j1;

import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s {
    /* renamed from: isSupported-0vamqd0, reason: not valid java name */
    public static final boolean m4940isSupported0vamqd0(int i10) {
        return Build.VERSION.SDK_INT >= 31 || !r2.m4936equalsimpl0(i10, r2.f68961b.m4916getDecal3opZhB0());
    }

    /* renamed from: toAndroidTileMode-0vamqd0, reason: not valid java name */
    public static final Shader.TileMode m4941toAndroidTileMode0vamqd0(int i10) {
        q2 q2Var = r2.f68961b;
        return r2.m4936equalsimpl0(i10, q2Var.m4915getClamp3opZhB0()) ? Shader.TileMode.CLAMP : r2.m4936equalsimpl0(i10, q2Var.m4918getRepeated3opZhB0()) ? Shader.TileMode.REPEAT : r2.m4936equalsimpl0(i10, q2Var.m4917getMirror3opZhB0()) ? Shader.TileMode.MIRROR : r2.m4936equalsimpl0(i10, q2Var.m4916getDecal3opZhB0()) ? Build.VERSION.SDK_INT >= 31 ? s2.f68972a.getFrameworkTileModeDecal() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final int toComposeTileMode(Shader.TileMode tileMode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tileMode, "<this>");
        int i10 = r.$EnumSwitchMapping$0[tileMode.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? (Build.VERSION.SDK_INT < 31 || tileMode != Shader.TileMode.DECAL) ? r2.f68961b.m4915getClamp3opZhB0() : s2.f68972a.m4953getComposeTileModeDecal3opZhB0() : r2.f68961b.m4918getRepeated3opZhB0() : r2.f68961b.m4917getMirror3opZhB0() : r2.f68961b.m4915getClamp3opZhB0();
    }
}
