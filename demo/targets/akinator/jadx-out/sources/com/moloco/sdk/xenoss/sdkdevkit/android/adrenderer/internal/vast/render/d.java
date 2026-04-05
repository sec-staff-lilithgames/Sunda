package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.u;
import tu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49898a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f49899a;

        public /* synthetic */ b(int i10, u uVar) {
            this(i10);
        }

        public final int a() {
            return this.f49899a;
        }

        public final int b() {
            return this.f49899a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f49899a == ((b) obj).f49899a;
        }

        public int hashCode() {
            return k0.m7059hashCodeimpl(this.f49899a);
        }

        public String toString() {
            return "Countdown(seconds=" + ((Object) k0.m7060toStringimpl(this.f49899a)) + ')';
        }

        public b(int i10) {
            super(null);
            this.f49899a = i10;
        }

        public final b a(int i10) {
            return new b(i10, null);
        }

        public static /* synthetic */ b a(b bVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = bVar.f49899a;
            }
            return bVar.a(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f49900a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ d(u uVar) {
        this();
    }

    public d() {
    }
}
