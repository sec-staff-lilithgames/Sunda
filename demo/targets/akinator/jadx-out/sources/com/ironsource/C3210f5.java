package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3210f5 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3210f5 f36691a = new C3210f5();

    private C3210f5() {
    }

    public final boolean a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
