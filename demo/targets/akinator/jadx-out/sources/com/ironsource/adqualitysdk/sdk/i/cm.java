package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cm {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private dq f1546;

    /* renamed from: ｋ, reason: contains not printable characters */
    private e f1547;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends e {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cm.e
        /* renamed from: ｋ, reason: contains not printable characters */
        public final boolean mo1924(hs hsVar) {
            return m1930().isInstance(hsVar.mo2643());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: ｋ, reason: contains not printable characters */
        private cm f1548 = new cm();

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final b m1925(Class cls) {
            this.f1548.f1547 = new c(cls);
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final b m1926(dq dqVar) {
            this.f1548.f1546 = dqVar;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final b m1927(Class cls) {
            this.f1548.f1547 = new d(cls);
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final b m1929(Class cls) {
            this.f1548.f1547 = new a(cls);
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final cm m1928() {
            return this.f1548;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends e {
        public c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cm.e
        /* renamed from: ｋ */
        public final boolean mo1924(hs hsVar) {
            return m1930().isAssignableFrom(hsVar.mo2644().getType());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends e {
        public d(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cm.e
        /* renamed from: ｋ */
        public final boolean mo1924(hs hsVar) {
            return m1930().equals(hsVar.mo2644().getType());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class e {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private Class f1549;

        public e(Class cls) {
            this.f1549 = cls;
        }

        /* renamed from: ｋ */
        public abstract boolean mo1924(hs hsVar);

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final Class m1930() {
            return this.f1549;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m1923(hs hsVar, ds dsVar, cp cpVar, List<Object> list) {
        e eVar = this.f1547;
        if (eVar != null && !eVar.mo1924(hsVar)) {
            return false;
        }
        if (this.f1546 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, hsVar);
        return this.f1546.m2365(dsVar, cpVar, arrayList).m2434();
    }
}
