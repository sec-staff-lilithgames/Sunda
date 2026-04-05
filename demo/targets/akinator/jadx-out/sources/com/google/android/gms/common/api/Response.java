package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class Response<T extends Result> {
    private Result zza;

    public Response() {
    }

    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t10) {
        this.zza = t10;
    }

    public Response(T t10) {
        this.zza = t10;
    }
}
