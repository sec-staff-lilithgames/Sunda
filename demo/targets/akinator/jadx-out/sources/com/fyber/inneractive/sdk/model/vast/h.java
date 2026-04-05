package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Integer f24110a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f24111b;

    /* renamed from: c, reason: collision with root package name */
    public String f24112c;

    /* renamed from: d, reason: collision with root package name */
    public l f24113d;

    /* renamed from: e, reason: collision with root package name */
    public String f24114e;

    /* renamed from: f, reason: collision with root package name */
    public String f24115f;

    /* renamed from: g, reason: collision with root package name */
    public String f24116g;

    /* renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.vast.b f24118i;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f24117h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f24119j = new ArrayList();

    public final boolean a() {
        return (TextUtils.isEmpty(this.f24115f) && TextUtils.isEmpty(this.f24114e) && this.f24113d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f24110a);
        sb2.append(" h:");
        sb2.append(this.f24111b);
        sb2.append(" ctr:");
        sb2.append(this.f24116g);
        sb2.append(" clt:");
        sb2.append(this.f24117h);
        if (!TextUtils.isEmpty(this.f24115f)) {
            sb2.append(" html:");
            sb2.append(this.f24115f);
        }
        if (this.f24113d != null) {
            sb2.append(" static:");
            sb2.append(this.f24113d.f24122b);
            sb2.append("creative:");
            sb2.append(this.f24113d.f24121a);
        }
        if (!TextUtils.isEmpty(this.f24114e)) {
            sb2.append(" iframe:");
            sb2.append(this.f24114e);
        }
        sb2.append(" events:");
        sb2.append(this.f24119j);
        if (this.f24118i != null) {
            sb2.append(" reason:");
            sb2.append(this.f24118i.f23905a);
            sb2.append(" exception:");
            sb2.append(this.f24118i.getMessage());
        }
        return sb2.toString();
    }
}
