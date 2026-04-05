package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import kotlin.jvm.internal.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f48335b = new a("Portrait", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f48336c = new a("Landscape", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final a f48337e = new a("None", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f48338f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f48339g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a$a, reason: collision with other inner class name */
    public static final class C0431a {
        public /* synthetic */ C0431a(u uVar) {
            this();
        }

        public final a a(String str) {
            if (str == null) {
                return null;
            }
            int iHashCode = str.hashCode();
            if (iHashCode == 3387192) {
                if (str.equals("none")) {
                    return a.f48337e;
                }
                return null;
            }
            if (iHashCode == 729267099) {
                if (str.equals("portrait")) {
                    return a.f48335b;
                }
                return null;
            }
            if (iHashCode == 1430647483 && str.equals("landscape")) {
                return a.f48336c;
            }
            return null;
        }

        public C0431a() {
        }
    }

    static {
        a[] aVarArrA = a();
        f48338f = aVarArrA;
        f48339g = cv.b.enumEntries(aVarArrA);
        new C0431a(null);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f48335b, f48336c, f48337e};
    }

    public static cv.a b() {
        return f48339g;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f48338f.clone();
    }
}
