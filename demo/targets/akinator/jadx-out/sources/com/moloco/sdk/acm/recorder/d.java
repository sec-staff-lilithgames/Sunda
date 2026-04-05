package com.moloco.sdk.acm.recorder;

import com.moloco.sdk.acm.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f45650a;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.acm.recorder.c
    public void recordCountEvent(com.moloco.sdk.acm.d event) {
        e0.checkNotNullParameter(event, "event");
        String str = this.f45650a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.a.f45482a.recordCountEvent$moloco_android_client_metrics_release(event);
        } else {
            com.moloco.sdk.acm.a.f45482a.recordCountEvent$moloco_android_client_metrics_release(event.withTag("mediator", str));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.c
    public void recordTimerEvent(g event) {
        e0.checkNotNullParameter(event, "event");
        String str = this.f45650a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.a.f45482a.recordTimerEvent$moloco_android_client_metrics_release(event);
        } else {
            com.moloco.sdk.acm.a.f45482a.recordTimerEvent$moloco_android_client_metrics_release(event.withTag("mediator", str));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.c
    public g startTimerEvent(String str) {
        return b.a(this, str);
    }

    public d(String str) {
        this.f45650a = str;
    }

    public /* synthetic */ d(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
