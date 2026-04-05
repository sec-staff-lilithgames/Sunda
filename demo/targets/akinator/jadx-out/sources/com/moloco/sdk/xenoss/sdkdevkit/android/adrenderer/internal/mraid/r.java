package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final a f48111b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f48112c = new r("Portrait", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final r f48113e = new r("Landscape", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final r f48114f = new r("None", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ r[] f48115g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cv.a f48116h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final r a(String str) {
            if (str == null) {
                return null;
            }
            int iHashCode = str.hashCode();
            if (iHashCode == 3387192) {
                if (str.equals("none")) {
                    return r.f48114f;
                }
                return null;
            }
            if (iHashCode == 729267099) {
                if (str.equals("portrait")) {
                    return r.f48112c;
                }
                return null;
            }
            if (iHashCode == 1430647483 && str.equals("landscape")) {
                return r.f48113e;
            }
            return null;
        }

        public a() {
        }
    }

    static {
        r[] rVarArrA = a();
        f48115g = rVarArrA;
        f48116h = cv.b.enumEntries(rVarArrA);
        f48111b = new a(null);
    }

    public r(String str, int i10) {
    }

    public static final /* synthetic */ r[] a() {
        return new r[]{f48112c, f48113e, f48114f};
    }

    public static cv.a b() {
        return f48116h;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f48115g.clone();
    }
}
