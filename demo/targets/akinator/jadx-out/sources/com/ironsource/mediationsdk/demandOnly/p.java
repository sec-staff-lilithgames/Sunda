package com.ironsource.mediationsdk.demandOnly;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface p {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements p {

        /* renamed from: a, reason: collision with root package name */
        private final String f37489a;

        public a(String plumbus) {
            e0.checkNotNullParameter(plumbus, "plumbus");
            this.f37489a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        public String value() {
            return this.f37489a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    String value();
}
