package com.ironsource;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum W7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* renamed from: b, reason: collision with root package name */
    public static final a f35680b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f35685a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final W7 a(Integer num) {
            W7 w72;
            W7[] w7ArrValues = W7.values();
            int length = w7ArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    w72 = null;
                    break;
                }
                w72 = w7ArrValues[i10];
                int iB = w72.b();
                if (num != null && iB == num.intValue()) {
                    break;
                }
                i10++;
            }
            return w72 == null ? W7.UnknownProvider : w72;
        }

        private a() {
        }

        public final W7 a(String dynamicDemandSourceId) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            List listSplit$default = sv.n0.split$default((CharSequence) dynamicDemandSourceId, new String[]{"_"}, false, 0, 6, (Object) null);
            return listSplit$default.size() < 2 ? W7.UnknownProvider : a(sv.j0.toIntOrNull((String) listSplit$default.get(1)));
        }
    }

    W7(int i10) {
        this.f35685a = i10;
    }

    public final int b() {
        return this.f35685a;
    }
}
