package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum Ve {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* renamed from: b, reason: collision with root package name */
    public static final a f35647b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f35652a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final Ve a(int i10) {
            Ve ve2;
            Ve[] veArrValues = Ve.values();
            int length = veArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    ve2 = null;
                    break;
                }
                ve2 = veArrValues[i11];
                if (ve2.f35652a == i10) {
                    break;
                }
                i11++;
            }
            return ve2 == null ? Ve.CurrentlyLoadedAds : ve2;
        }

        private a() {
        }
    }

    Ve(int i10) {
        this.f35652a = i10;
    }

    public final int b() {
        return this.f35652a;
    }
}
