package com.unity3d.mediation;

import a.b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayAdError {
    public static final a Companion = new a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* renamed from: a, reason: collision with root package name */
    private final IronSourceError f50639a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50640b;

    /* renamed from: c, reason: collision with root package name */
    private final String f50641c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayAdError(IronSourceError ironSourceError, String adId, String str) {
        e0.checkNotNullParameter(adId, "adId");
        this.f50639a = ironSourceError;
        this.f50640b = adId;
        this.f50641c = str;
    }

    public final String getAdId() {
        return this.f50640b;
    }

    public final String getAdUnitId() {
        return this.f50641c;
    }

    public final int getErrorCode() {
        IronSourceError ironSourceError = this.f50639a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    public final String getErrorMessage() {
        IronSourceError ironSourceError = this.f50639a;
        String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    public String toString() {
        String str = this.f50641c;
        IronSourceError ironSourceError = this.f50639a;
        return b.m("adUnitId: ", str, " ", ironSourceError != null ? ironSourceError.toString() : null);
    }

    public /* synthetic */ LevelPlayAdError(IronSourceError ironSourceError, String str, String str2, int i10, u uVar) {
        this(ironSourceError, str, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(String adId, String adUnitId, int i10, String errorMessage) {
        this(new IronSourceError(i10, errorMessage), adId, adUnitId);
        e0.checkNotNullParameter(adId, "adId");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
