package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC3423r5;
import com.ironsource.Lb;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface o extends InterfaceC3423r5<String> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final String f37488a;

        public a(String rowAdm) {
            e0.checkNotNullParameter(rowAdm, "rowAdm");
            this.f37488a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC3423r5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f37488a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(Lb<String, T> mapper) {
            e0.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.f37488a);
        }
    }

    <T> T a(Lb<String, T> lb2);
}
