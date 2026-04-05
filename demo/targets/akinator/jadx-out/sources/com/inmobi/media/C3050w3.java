package com.inmobi.media;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.w3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3050w3 extends androidx.browser.customtabs.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3067x3 f33520a;

    public C3050w3(C3067x3 c3067x3) {
        this.f33520a = c3067x3;
    }

    @Override // androidx.browser.customtabs.e
    public final void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle extras) {
        InterfaceC2779g2 interfaceC2779g2;
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        super.onActivityLayout(i10, i11, i12, i13, i14, extras);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("x3", "access$getLOG_TAG$cp(...)");
        C2880m2 c2880m2 = this.f33520a.f33560c;
        if (c2880m2 == null || (interfaceC2779g2 = (InterfaceC2779g2) c2880m2.f33077i.get()) == null) {
            return;
        }
        interfaceC2779g2.a(i10, i11, i12, i13, i14);
    }

    @Override // androidx.browser.customtabs.e
    public final void onNavigationEvent(int i10, Bundle bundle) {
        super.onNavigationEvent(i10, bundle);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("x3", "access$getLOG_TAG$cp(...)");
        C2880m2 c2880m2 = this.f33520a.f33560c;
        if (c2880m2 != null) {
            C3084y3 c3084y3 = c2880m2.f33075g;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6 && c3084y3.f33594c == null) {
                            if (c3084y3.f33595d == 4) {
                                c3084y3.f33594c = Boolean.TRUE;
                            } else {
                                c3084y3.f33594c = Boolean.FALSE;
                            }
                            if (kotlin.jvm.internal.e0.areEqual(c3084y3.f33594c, Boolean.TRUE)) {
                                InterfaceC2779g2 interfaceC2779g2 = (InterfaceC2779g2) c3084y3.f33596e.get();
                                if (interfaceC2779g2 != null) {
                                    interfaceC2779g2.a(L6.f31995i, c3084y3.f33592a, (Integer) 8003);
                                }
                                InterfaceC2779g2 interfaceC2779g22 = (InterfaceC2779g2) c3084y3.f33596e.get();
                                if (interfaceC2779g22 != null) {
                                    interfaceC2779g22.c();
                                }
                            } else {
                                InterfaceC2779g2 interfaceC2779g23 = (InterfaceC2779g2) c3084y3.f33596e.get();
                                if (interfaceC2779g23 != null) {
                                    interfaceC2779g23.a(L6.f31996j, c3084y3.f33592a, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c3084y3.f33594c == null) {
                        c3084y3.f33594c = Boolean.FALSE;
                        InterfaceC2779g2 interfaceC2779g24 = (InterfaceC2779g2) c3084y3.f33596e.get();
                        if (interfaceC2779g24 != null) {
                            interfaceC2779g24.a(L6.f31996j, c3084y3.f33592a, (Integer) 8004);
                        }
                    }
                } else if (c3084y3.f33594c == null) {
                    c3084y3.f33594c = Boolean.TRUE;
                    InterfaceC2779g2 interfaceC2779g25 = (InterfaceC2779g2) c3084y3.f33596e.get();
                    if (interfaceC2779g25 != null) {
                        interfaceC2779g25.a(L6.f31995i, c3084y3.f33592a, (Integer) null);
                    }
                    InterfaceC2779g2 interfaceC2779g26 = (InterfaceC2779g2) c3084y3.f33596e.get();
                    if (interfaceC2779g26 != null) {
                        interfaceC2779g26.c();
                    }
                }
            } else if (!c3084y3.f33593b) {
                c3084y3.f33593b = true;
                InterfaceC2779g2 interfaceC2779g27 = (InterfaceC2779g2) c3084y3.f33596e.get();
                if (interfaceC2779g27 != null) {
                    interfaceC2779g27.a(L6.f31994h, c3084y3.f33592a, (Integer) null);
                }
            }
            c3084y3.f33595d = i10;
            if (i10 == 1) {
                InterfaceC2779g2 interfaceC2779g28 = (InterfaceC2779g2) c2880m2.f33077i.get();
                if (interfaceC2779g28 != null) {
                    GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
                    interfaceC2779g28.a(C2687ac.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i10 == 4) {
                InterfaceC2779g2 interfaceC2779g29 = (InterfaceC2779g2) c2880m2.f33077i.get();
                if (interfaceC2779g29 != null) {
                    GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
                    interfaceC2779g29.a(C2687ac.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i10 == 5) {
                InterfaceC2779g2 interfaceC2779g210 = (InterfaceC2779g2) c2880m2.f33077i.get();
                if (interfaceC2779g210 != null) {
                    GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
                    interfaceC2779g210.a(C2687ac.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                InterfaceC2779g2 interfaceC2779g211 = (InterfaceC2779g2) c2880m2.f33077i.get();
                if (interfaceC2779g211 != null) {
                    interfaceC2779g211.b();
                    return;
                }
                return;
            }
            if (i10 != 6) {
                return;
            }
            InterfaceC2779g2 interfaceC2779g212 = (InterfaceC2779g2) c2880m2.f33077i.get();
            if (interfaceC2779g212 != null) {
                GestureDetectorOnGestureListenerC3093yc.Z0.getClass();
                interfaceC2779g212.a(C2687ac.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            InterfaceC2779g2 interfaceC2779g213 = (InterfaceC2779g2) c2880m2.f33077i.get();
            if (interfaceC2779g213 != null) {
                interfaceC2779g213.a();
            }
        }
    }
}
