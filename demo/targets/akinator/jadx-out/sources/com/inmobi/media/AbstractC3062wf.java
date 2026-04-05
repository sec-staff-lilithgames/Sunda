package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.wf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3062wf {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3063x f33551a;

    /* renamed from: b, reason: collision with root package name */
    public H8 f33552b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f33553c;

    /* renamed from: d, reason: collision with root package name */
    public final AdConfig f33554d;

    public AbstractC3062wf(InterfaceC3063x container) {
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        this.f33551a = container;
        this.f33554d = container.getAdConfig();
    }

    public abstract View a(View view, ViewGroup viewGroup, boolean z10);

    public void a() {
        WeakReference weakReference = this.f33553c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(byte b10);

    public abstract void a(Context context, byte b10);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(Map map);

    public View b() {
        WeakReference weakReference = this.f33553c;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public H8 c() {
        return this.f33552b;
    }

    public View d() {
        return null;
    }

    public abstract void e();
}
