package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class j {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final List f49342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<g> companions) {
            super(null);
            e0.checkNotNullParameter(companions, "companions");
            this.f49342a = companions;
        }

        public final List<g> a() {
            return this.f49342a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public final r f49343a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r linear) {
            super(null);
            e0.checkNotNullParameter(linear, "linear");
            this.f49343a = linear;
        }

        public final r a() {
            return this.f49343a;
        }
    }

    public /* synthetic */ j(kotlin.jvm.internal.u uVar) {
        this();
    }

    public j() {
    }
}
