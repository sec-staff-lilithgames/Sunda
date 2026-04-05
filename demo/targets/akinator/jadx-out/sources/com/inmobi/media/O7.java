package com.inmobi.media;

import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.unity3d.services.core.fid.Constants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class O7 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final O7 f32092a = new O7();

    public O7() {
        super(0);
    }

    @Override // kv.a
    public final Object invoke() {
        Boolean bool = Boolean.FALSE;
        try {
            if (!kotlin.jvm.internal.e0.areEqual(AppLovinCommunicator.class.getMethod(Constants.GET_INSTANCE, null).getReturnType(), AppLovinCommunicator.class)) {
                return bool;
            }
            int i10 = AppLovinCommunicatorMessage.f13387b;
            return !kotlin.jvm.internal.e0.areEqual(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", AppLovinCommunicatorMessage.class).getReturnType(), Void.TYPE) ? bool : !kotlin.jvm.internal.e0.areEqual(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", null).getReturnType(), String.class) ? bool : Boolean.TRUE;
        } catch (Error unused) {
            return Boolean.FALSE;
        } catch (Exception unused2) {
            return Boolean.FALSE;
        }
    }
}
