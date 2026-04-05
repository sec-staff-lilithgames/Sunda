package com.applovin.impl.sdk.ad;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import bf.m1;
import com.applovin.impl.f5;
import com.applovin.impl.ga;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.n;
import java.util.List;
import nh.fe;
import nh.we;
import pf.c;
import pf.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements t.a, Continuation, h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15371c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15372e;

    public /* synthetic */ g(boolean z10, Object obj, Object obj2) {
        this.f15371c = obj;
        this.f15372e = obj2;
        this.f15370b = z10;
    }

    @Override // t.a, jd.j
    public Object apply(Object obj) {
        return ((b) this.f15371c).a((MotionEvent) this.f15372e, this.f15370b, (f5) obj);
    }

    @Override // pf.h
    public List create(int i10, m1 m1Var, int[] iArr) {
        pf.c cVar = (pf.c) this.f15371c;
        pf.e eVar = (pf.e) this.f15372e;
        we weVar = pf.c.f81029k;
        return c.a.createForTrackGroup(i10, m1Var, eVar, iArr, this.f15370b, new fe(cVar, 1));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? n.a((Context) this.f15371c, (Intent) this.f15372e, this.f15370b).continueWith(new ga(2), new com.google.android.gms.internal.ads.a(8)) : task;
    }
}
