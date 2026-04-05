package com.moloco.sdk.internal.services.init;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class j {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.internal.services.init.b f47113a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.internal.services.init.b type) {
            super(null);
            e0.checkNotNullParameter(type, "type");
            this.f47113a = type;
        }

        public final com.moloco.sdk.internal.services.init.b a() {
            return this.f47113a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public final int f47114a;

        public b(int i10) {
            super(null);
            this.f47114a = i10;
        }

        public final int a() {
            return this.f47114a;
        }
    }

    public /* synthetic */ j(u uVar) {
        this();
    }

    public j() {
    }
}
