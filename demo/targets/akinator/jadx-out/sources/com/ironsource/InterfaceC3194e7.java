package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.e7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3194e7 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.e7$a */
    public static final class a implements InterfaceC3194e7 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3140b7 f36573a;

        public a(InterfaceC3140b7 failure) {
            kotlin.jvm.internal.e0.checkNotNullParameter(failure, "failure");
            this.f36573a = failure;
        }

        public final InterfaceC3140b7 a() {
            return this.f36573a;
        }

        public final InterfaceC3140b7 b() {
            return this.f36573a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.e0.areEqual(this.f36573a, ((a) obj).f36573a);
        }

        public int hashCode() {
            return this.f36573a.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.f36573a + ")";
        }

        public final a a(InterfaceC3140b7 failure) {
            kotlin.jvm.internal.e0.checkNotNullParameter(failure, "failure");
            return new a(failure);
        }

        public static /* synthetic */ a a(a aVar, InterfaceC3140b7 interfaceC3140b7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC3140b7 = aVar.f36573a;
            }
            return aVar.a(interfaceC3140b7);
        }

        @Override // com.ironsource.InterfaceC3194e7
        public void a(InterfaceC3212f7 handler) {
            kotlin.jvm.internal.e0.checkNotNullParameter(handler, "handler");
            handler.a(this.f36573a);
        }
    }

    default void a(InterfaceC3212f7 handler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "handler");
    }
}
