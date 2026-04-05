package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import j1.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class x {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends x {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f48790a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48791b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48792c;

        public /* synthetic */ a(boolean z10, int i10, int i11, kotlin.jvm.internal.u uVar) {
            this(z10, i10, i11);
        }

        public final int a() {
            return this.f48792c;
        }

        public final boolean b() {
            return this.f48790a;
        }

        public final int c() {
            return this.f48791b;
        }

        public a(boolean z10, int i10, int i11) {
            super(null);
            this.f48790a = z10;
            this.f48791b = i10;
            this.f48792c = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends x {

        /* renamed from: a, reason: collision with root package name */
        public final m1.e f48793a;

        /* renamed from: b, reason: collision with root package name */
        public final String f48794b;

        /* renamed from: c, reason: collision with root package name */
        public final long f48795c;

        /* renamed from: d, reason: collision with root package name */
        public final f2 f48796d;

        /* renamed from: e, reason: collision with root package name */
        public final long f48797e;

        public /* synthetic */ b(m1.e eVar, String str, long j10, f2 f2Var, long j11, kotlin.jvm.internal.u uVar) {
            this(eVar, str, j10, f2Var, j11);
        }

        public final long a() {
            return this.f48797e;
        }

        public final f2 b() {
            return this.f48796d;
        }

        public final String c() {
            return this.f48794b;
        }

        public final long d() {
            return this.f48795c;
        }

        public final m1.e e() {
            return this.f48793a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m1.e painter, String str, long j10, f2 backgroundShape, long j11) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(painter, "painter");
            kotlin.jvm.internal.e0.checkNotNullParameter(backgroundShape, "backgroundShape");
            this.f48793a = painter;
            this.f48794b = str;
            this.f48795c = j10;
            this.f48796d = backgroundShape;
            this.f48797e = j11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends x {

        /* renamed from: a, reason: collision with root package name */
        public final String f48798a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String text) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
            this.f48798a = text;
        }

        public final String a() {
            return this.f48798a;
        }
    }

    public /* synthetic */ x(kotlin.jvm.internal.u uVar) {
        this();
    }

    public x() {
    }
}
