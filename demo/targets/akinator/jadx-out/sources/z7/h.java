package z7;

import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f97604b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f97605c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f97606e;

    static {
        h hVar = new h("NORMAL", 0);
        f97604b = hVar;
        h hVar2 = new h("MULTIPLY", 1);
        f97605c = hVar2;
        f97606e = new h[]{hVar, hVar2, new h("SCREEN", 2), new h("OVERLAY", 3), new h("DARKEN", 4), new h("LIGHTEN", 5), new h("COLOR_DODGE", 6), new h("COLOR_BURN", 7), new h("HARD_LIGHT", 8), new h("SOFT_LIGHT", 9), new h("DIFFERENCE", 10), new h("EXCLUSION", 11), new h("HUE", 12), new h("SATURATION", 13), new h("COLOR", 14), new h("LUMINOSITY", 15), new h("ADD", 16), new h("HARD_MIX", 17)};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f97606e.clone();
    }

    public o3.a toNativeBlendMode() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return Build.VERSION.SDK_INT >= 29 ? o3.a.f77428i : o3.a.f77423c;
        }
        if (iOrdinal == 2) {
            return o3.a.f77424e;
        }
        if (iOrdinal == 3) {
            return o3.a.f77425f;
        }
        if (iOrdinal == 4) {
            return o3.a.f77426g;
        }
        if (iOrdinal == 5) {
            return o3.a.f77427h;
        }
        if (iOrdinal != 16) {
            return null;
        }
        return o3.a.f77422b;
    }
}
