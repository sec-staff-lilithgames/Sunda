package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class B9 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f31667a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public int f31668b;

    /* renamed from: c, reason: collision with root package name */
    public int f31669c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N9 f31670d;

    public B9(N9 n9) {
        this.f31670d = n9;
    }

    public abstract View a(Context context);

    public void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        HashMap map = N9.f32067c;
        C3073x9.a(view);
        view.setOnClickListener(null);
        this.f31667a.add(view);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.f31670d.f32072a++;
    }

    public final String toString() {
        return "Size:" + this.f31667a.size() + " Miss Count:" + this.f31668b + " Hit Count:" + this.f31669c;
    }

    public void a(View view, C2903n8 asset, AdConfig adConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
        view.setVisibility(asset.f33157v);
        view.setOnClickListener(null);
    }
}
