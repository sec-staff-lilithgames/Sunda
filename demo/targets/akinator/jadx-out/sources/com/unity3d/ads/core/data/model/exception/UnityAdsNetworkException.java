package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class UnityAdsNetworkException extends Exception {
    private final String client;
    private final Integer code;
    private final Integer cronetCode;
    private final String message;
    private final String protocol;
    private final OperationType type;
    private final String url;

    public /* synthetic */ UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? OperationType.UNKNOWN : operationType, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : str4);
    }

    public final String getClient() {
        return this.client;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final OperationType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(String message, OperationType type, Integer num, String str, String str2, Integer num2, String str3) {
        super(message);
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(type, "type");
        this.message = message;
        this.type = type;
        this.code = num;
        this.url = str;
        this.protocol = str2;
        this.cronetCode = num2;
        this.client = str3;
    }
}
