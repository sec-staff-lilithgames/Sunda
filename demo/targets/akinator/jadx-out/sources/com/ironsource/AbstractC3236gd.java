package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3236gd {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3254hd f36810a;

    /* renamed from: b, reason: collision with root package name */
    private long f36811b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36812c;

    public AbstractC3236gd() {
        this(false, 1, null);
    }

    public final InterfaceC3254hd a() {
        return this.f36810a;
    }

    public abstract String b();

    public final long c() {
        return this.f36811b;
    }

    public final boolean d() {
        return this.f36812c;
    }

    public AbstractC3236gd(boolean z10) {
        this.f36812c = z10;
    }

    public final void a(InterfaceC3254hd interfaceC3254hd) {
        this.f36810a = interfaceC3254hd;
    }

    public final void a(boolean z10) {
        this.f36812c = z10;
        if (z10) {
            this.f36811b = System.currentTimeMillis();
            InterfaceC3254hd interfaceC3254hd = this.f36810a;
            if (interfaceC3254hd != null) {
                interfaceC3254hd.a(this);
                return;
            }
            return;
        }
        InterfaceC3254hd interfaceC3254hd2 = this.f36810a;
        if (interfaceC3254hd2 != null) {
            interfaceC3254hd2.b(this);
        }
    }

    public /* synthetic */ AbstractC3236gd(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
