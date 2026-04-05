package gn;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final View f57724a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: gn.a$a, reason: collision with other inner class name */
    public static final class C0574a {

        /* renamed from: a, reason: collision with root package name */
        public final View f57725a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57726b;

        /* renamed from: c, reason: collision with root package name */
        public String f57727c;

        public C0574a(View view, int i10) {
            this.f57725a = view;
            this.f57726b = i10;
        }

        public a build() {
            return new a(this.f57725a, this.f57726b, this.f57727c);
        }

        public C0574a setDetailedReason(String str) {
            this.f57727c = str;
            return this;
        }
    }

    @Deprecated
    public a(View view, int i10) {
        this(view, i10, null);
    }

    @Deprecated
    public a(View view, int i10, String str) {
        this.f57724a = view;
    }
}
