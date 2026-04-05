package com.ironsource;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class sg extends AbstractC3236gd {

    /* renamed from: f, reason: collision with root package name */
    public static final a f38862f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f38863g = "ViewVisibilityTrigger";

    /* renamed from: d, reason: collision with root package name */
    private final b f38864d;

    /* renamed from: e, reason: collision with root package name */
    private final ug f38865e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Rc {
        public b() {
        }

        @Override // com.ironsource.Rc
        public void a(boolean z10) {
            sg.this.a(!z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(View view) {
        super(false, 1, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        b bVar = new b();
        this.f38864d = bVar;
        ug ugVar = new ug(bVar);
        this.f38865e = ugVar;
        ugVar.a(view);
        a(!ugVar.c());
    }

    @Override // com.ironsource.AbstractC3236gd
    public String b() {
        return f38863g;
    }

    public final void e() {
        this.f38865e.b();
    }
}
