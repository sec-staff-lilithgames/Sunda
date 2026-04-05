package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.impl.adview.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends e {
    public h(Context context) {
        super(context);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i10) {
        setViewScale(i10 / 30.0f);
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.INVISIBLE;
    }
}
