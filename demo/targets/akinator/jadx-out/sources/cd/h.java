package cd;

import java.util.Collection;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f12139b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f12140c;

    /* renamed from: e, reason: collision with root package name */
    public static final h f12141e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f12142f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f12143g;

    /* renamed from: h, reason: collision with root package name */
    public static final h f12144h;

    /* renamed from: i, reason: collision with root package name */
    public static final h f12145i;

    /* renamed from: j, reason: collision with root package name */
    public static final h f12146j;

    /* renamed from: k, reason: collision with root package name */
    public static final h f12147k;

    /* renamed from: l, reason: collision with root package name */
    public static final h f12148l;

    /* renamed from: m, reason: collision with root package name */
    public static final h f12149m;

    /* renamed from: n, reason: collision with root package name */
    public static final h f12150n;

    /* renamed from: o, reason: collision with root package name */
    public static final h f12151o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ h[] f12152p;

    static {
        h hVar = new h("Array", 0);
        f12139b = hVar;
        h hVar2 = new h("Collection", 1);
        f12140c = hVar2;
        h hVar3 = new h("Map", 2);
        f12141e = hVar3;
        h hVar4 = new h("POJO", 3);
        f12142f = hVar4;
        h hVar5 = new h("Untyped", 4);
        f12143g = hVar5;
        h hVar6 = new h("Integer", 5);
        f12144h = hVar6;
        h hVar7 = new h("Float", 6);
        f12145i = hVar7;
        h hVar8 = new h("Boolean", 7);
        f12146j = hVar8;
        h hVar9 = new h("Enum", 8);
        f12147k = hVar9;
        h hVar10 = new h("Textual", 9);
        f12148l = hVar10;
        h hVar11 = new h("Binary", 10);
        f12149m = hVar11;
        h hVar12 = new h("DateTime", 11);
        f12150n = hVar12;
        h hVar13 = new h("OtherScalar", 12);
        f12151o = hVar13;
        f12152p = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13};
    }

    public static h fromClass(Class<?> cls, h hVar) {
        return cls.isEnum() ? f12147k : cls.isArray() ? cls == byte[].class ? f12149m : f12139b : Collection.class.isAssignableFrom(cls) ? f12140c : Map.class.isAssignableFrom(cls) ? f12141e : cls == String.class ? f12148l : hVar;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f12152p.clone();
    }
}
