package d0;

import com.vungle.ads.internal.protos.Sdk;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 implements t2 {

    /* renamed from: b, reason: collision with root package name */
    public final v5 f51397b;

    /* renamed from: c, reason: collision with root package name */
    public final v5 f51398c;

    /* renamed from: e, reason: collision with root package name */
    public final v5 f51399e;

    public i1(v5 isPressed, v5 isHovered, v5 isFocused) {
        kotlin.jvm.internal.e0.checkNotNullParameter(isPressed, "isPressed");
        kotlin.jvm.internal.e0.checkNotNullParameter(isHovered, "isHovered");
        kotlin.jvm.internal.e0.checkNotNullParameter(isFocused, "isFocused");
        this.f51397b = isPressed;
        this.f51398c = isHovered;
        this.f51399e = isFocused;
    }

    @Override // d0.t2
    public void drawIndication(l1.e eVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        eVar.drawContent();
        if (((Boolean) this.f51397b.getValue()).booleanValue()) {
            l1.i.m5411drawRectnJ9OG0$default(eVar, j1.m0.m4857copywmQWz5c$default(j1.m0.f68918b.m4825getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, eVar.mo5314getSizeNHjbRc(), 0.0f, null, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, null);
        } else if (((Boolean) this.f51398c.getValue()).booleanValue() || ((Boolean) this.f51399e.getValue()).booleanValue()) {
            l1.i.m5411drawRectnJ9OG0$default(eVar, j1.m0.m4857copywmQWz5c$default(j1.m0.f68918b.m4825getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, eVar.mo5314getSizeNHjbRc(), 0.0f, null, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, null);
        }
    }
}
