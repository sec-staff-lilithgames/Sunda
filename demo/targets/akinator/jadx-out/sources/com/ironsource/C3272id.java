package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3272id extends AbstractC3472u3 {
    public static final C3272id O;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.id$a */
    public static final class a {
        public final void a() {
            new V9().b(ContextProvider.getInstance().getApplicationContext());
            C3272id.O.a(new C5(D5.INIT_DEFERRED_DATA, new C3196e9().a()));
        }
    }

    static {
        C3272id c3272id = new C3272id();
        O = c3272id;
        c3272id.H = "outcome";
        c3272id.G = 0;
        c3272id.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c3272id.e();
    }

    private C3272id() {
    }

    @Override // com.ironsource.AbstractC3472u3
    public int c(C5 c52) {
        return 1;
    }

    @Override // com.ironsource.AbstractC3472u3
    public void d() {
    }

    @Override // com.ironsource.AbstractC3472u3
    public String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean g(C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean h(C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean j(C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC3472u3
    public boolean d(C5 c52) {
        return true;
    }

    @Override // com.ironsource.AbstractC3472u3
    public void a(ArrayList<C5> arrayList) {
    }

    @Override // com.ironsource.AbstractC3472u3
    public void f(C5 c52) {
    }
}
