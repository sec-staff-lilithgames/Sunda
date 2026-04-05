package io.ktor.utils.io.jvm.javaio;

import bv.d;
import bv.f;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.jvm.javaio.OutputAdapter$loop$1", f = "Blocking.kt", i = {0, 0, 1}, l = {Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, MBSupportMuteAdType.REWARD_VIDEO}, m = "loop", n = {"this", "this_$iv", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes10.dex */
public final class OutputAdapter$loop$1$loop$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutputAdapter$loop$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputAdapter$loop$1$loop$1(OutputAdapter$loop$1 outputAdapter$loop$1, zu.d<? super OutputAdapter$loop$1$loop$1> dVar) {
        super(dVar);
        this.this$0 = outputAdapter$loop$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loop(this);
    }
}
