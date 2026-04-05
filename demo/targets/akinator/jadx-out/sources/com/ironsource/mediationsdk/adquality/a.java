package com.ironsource.mediationsdk.adquality;

import com.ironsource.C3232g9;
import com.ironsource.EnumC3449se;
import com.ironsource.Q6;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37264a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static EnumC0234a f37265b = EnumC0234a.DONT_INITIALIZE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC0234a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* renamed from: b, reason: collision with root package name */
        public static final C0235a f37266b = new C0235a(null);

        /* renamed from: a, reason: collision with root package name */
        private final int f37272a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C0235a {
            public /* synthetic */ C0235a(u uVar) {
                this();
            }

            public final EnumC0234a a(int i10) {
                EnumC0234a enumC0234a;
                EnumC0234a[] enumC0234aArrValues = EnumC0234a.values();
                int length = enumC0234aArrValues.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        enumC0234a = null;
                        break;
                    }
                    enumC0234a = enumC0234aArrValues[i11];
                    if (enumC0234a.b() == i10) {
                        break;
                    }
                    i11++;
                }
                return enumC0234a == null ? EnumC0234a.DONT_INITIALIZE : enumC0234a;
            }

            private C0235a() {
            }
        }

        EnumC0234a(int i10) {
            this.f37272a = i10;
        }

        public final int b() {
            return this.f37272a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public /* synthetic */ b(u uVar) {
            this();
        }

        public final EnumC0234a a() {
            return a.f37265b;
        }

        private b() {
        }

        public final void a(EnumC0234a enumC0234a) {
            e0.checkNotNullParameter(enumC0234a, RnJusJ.qGrntUxJL);
            a.f37265b = enumC0234a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37273a;

        static {
            int[] iArr = new int[EnumC0234a.values().length];
            try {
                iArr[EnumC0234a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0234a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0234a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37273a = iArr;
        }
    }

    public final boolean b() throws JSONException {
        EnumC3449se enumC3449se;
        JSONArray jSONArrayOptJSONArray = new C3232g9().a().optJSONArray(Q6.f35261g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = jSONArrayOptJSONArray.getInt(i10);
            EnumC3449se[] enumC3449seArrValues = EnumC3449se.values();
            int length2 = enumC3449seArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    enumC3449se = null;
                    break;
                }
                enumC3449se = enumC3449seArrValues[i12];
                if (enumC3449se.b() == i11) {
                    break;
                }
                i12++;
            }
            if (enumC3449se != null) {
                linkedHashSet.add(enumC3449se);
            }
        }
        int i13 = c.f37273a[f37265b.ordinal()];
        if (i13 == 1) {
            return linkedHashSet.contains(EnumC3449se.LEVEL_PLAY_INIT);
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return linkedHashSet.contains(EnumC3449se.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC3449se.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC3449se.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    public final void a(int i10) {
        f37265b = EnumC0234a.f37266b.a(i10);
    }
}
