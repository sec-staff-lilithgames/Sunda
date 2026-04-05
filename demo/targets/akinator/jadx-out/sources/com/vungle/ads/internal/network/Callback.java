package com.vungle.ads.internal.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Callback<T> {
    void onFailure(Call<T> call, Throwable th2);

    void onResponse(Call<T> call, Response<T> response);
}
