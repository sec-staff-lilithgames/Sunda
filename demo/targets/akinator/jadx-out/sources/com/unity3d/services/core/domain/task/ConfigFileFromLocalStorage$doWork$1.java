package com.unity3d.services.core.domain.task;

import av.e;
import bv.d;
import bv.f;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage", f = "ConfigFileFromLocalStorage.kt", i = {}, l = {27}, m = "doWork-gIAlu-s", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ConfigFileFromLocalStorage$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigFileFromLocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$1(ConfigFileFromLocalStorage configFileFromLocalStorage, zu.d<? super ConfigFileFromLocalStorage$doWork$1> dVar) {
        super(dVar);
        this.this$0 = configFileFromLocalStorage;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3515doWorkgIAlus = this.this$0.m3515doWorkgIAlus((ConfigFileFromLocalStorage.Params) null, (zu.d<? super z>) this);
        return objM3515doWorkgIAlus == e.getCOROUTINE_SUSPENDED() ? objM3515doWorkgIAlus : z.m7130boximpl(objM3515doWorkgIAlus);
    }
}
