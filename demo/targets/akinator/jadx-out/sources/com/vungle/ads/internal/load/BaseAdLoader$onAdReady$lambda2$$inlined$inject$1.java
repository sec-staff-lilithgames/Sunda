package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.task.JobRunner;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.vungle.ads.internal.load.BaseAdLoader$onAdReady$lambda-2$$inlined$inject$1, reason: invalid class name */
/* loaded from: classes8.dex */
public final class BaseAdLoader$onAdReady$lambda2$$inlined$inject$1 extends f0 implements a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdLoader$onAdReady$lambda2$$inlined$inject$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
    @Override // kv.a
    public final JobRunner invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getService(JobRunner.class);
    }
}
