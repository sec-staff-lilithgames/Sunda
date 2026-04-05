package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.ReaderConfig;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC3875h {
    void a(List list);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ReaderConfig.Rule f60035a;

        /* renamed from: b, reason: collision with root package name */
        private final String f60036b;

        /* renamed from: c, reason: collision with root package name */
        private final q0 f60037c;

        public a(ReaderConfig.Rule rule, String str, q0 q0Var) {
            this.f60035a = rule;
            this.f60036b = str;
            this.f60037c = q0Var;
        }

        public final String a() {
            return this.f60036b;
        }

        public final q0 b() {
            return this.f60037c;
        }

        public final ReaderConfig.Rule c() {
            return this.f60035a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f60035a, aVar.f60035a) && kotlin.jvm.internal.e0.areEqual(this.f60036b, aVar.f60036b) && kotlin.jvm.internal.e0.areEqual(this.f60037c, aVar.f60037c);
        }

        public int hashCode() {
            int iHashCode = this.f60035a.hashCode() * 31;
            String str = this.f60036b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            q0 q0Var = this.f60037c;
            return iHashCode2 + (q0Var != null ? q0Var.hashCode() : 0);
        }

        public String toString() {
            return "Data(rule=" + this.f60035a + ", dataHash=" + this.f60036b + ", error=" + this.f60037c + ')';
        }

        public /* synthetic */ a(ReaderConfig.Rule rule, String str, q0 q0Var, int i10, kotlin.jvm.internal.u uVar) {
            this(rule, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : q0Var);
        }
    }
}
