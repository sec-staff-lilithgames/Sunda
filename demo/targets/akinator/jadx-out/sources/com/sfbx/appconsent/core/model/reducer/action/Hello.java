package com.sfbx.appconsent.core.model.reducer.action;

import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Hello implements Action {
    private final HelloReply payload;

    public Hello(HelloReply payload) {
        e0.checkNotNullParameter(payload, "payload");
        this.payload = payload;
    }

    public static /* synthetic */ Hello copy$default(Hello hello, HelloReply helloReply, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            helloReply = hello.payload;
        }
        return hello.copy(helloReply);
    }

    public final HelloReply component1() {
        return this.payload;
    }

    public final Hello copy(HelloReply payload) {
        e0.checkNotNullParameter(payload, "payload");
        return new Hello(payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Hello) && e0.areEqual(this.payload, ((Hello) obj).payload);
    }

    public final HelloReply getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    public String toString() {
        return "Hello(payload=" + this.payload + ')';
    }
}
