package io.bidmachine.analytics.internal;

import java.text.ParseException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class F {

    /* renamed from: c, reason: collision with root package name */
    public static final a f59883c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final sv.x f59884a = new sv.x("^(\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}) ([A-Z])\\/(\\S+)\\(\\s*(\\d+)\\): (.*)$");

    /* renamed from: b, reason: collision with root package name */
    private final N f59885b = new N();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f59886a;

        /* renamed from: b, reason: collision with root package name */
        private final String f59887b;

        /* renamed from: c, reason: collision with root package name */
        private final String f59888c;

        /* renamed from: d, reason: collision with root package name */
        private final String f59889d;

        public b(long j10, String str, String str2, String str3) {
            this.f59886a = j10;
            this.f59887b = str;
            this.f59888c = str2;
            this.f59889d = str3;
        }

        public final String a() {
            return this.f59888c;
        }

        public final String b() {
            return this.f59889d;
        }

        public final String c() {
            return this.f59887b;
        }

        public final long d() {
            return this.f59886a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f59886a == bVar.f59886a && kotlin.jvm.internal.e0.areEqual(this.f59887b, bVar.f59887b) && kotlin.jvm.internal.e0.areEqual(this.f59888c, bVar.f59888c) && kotlin.jvm.internal.e0.areEqual(this.f59889d, bVar.f59889d);
        }

        public int hashCode() {
            return this.f59889d.hashCode() + o2.e(o2.e(Long.hashCode(this.f59886a) * 31, 31, this.f59887b), 31, this.f59888c);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final b a(String str) throws ParseException {
        sv.t tVarFind$default = sv.x.find$default(this.f59884a, str, 0, 2, null);
        if (tVarFind$default == null) {
            return null;
        }
        sv.s destructured = tVarFind$default.getDestructured();
        String str2 = destructured.getMatch().getGroupValues().get(1);
        String str3 = destructured.getMatch().getGroupValues().get(2);
        String str4 = destructured.getMatch().getGroupValues().get(3);
        String str5 = destructured.getMatch().getGroupValues().get(5);
        Long lA = this.f59885b.a(str2);
        return new b(lA != null ? lA.longValue() : 0L, str4, str3, str5);
    }
}
