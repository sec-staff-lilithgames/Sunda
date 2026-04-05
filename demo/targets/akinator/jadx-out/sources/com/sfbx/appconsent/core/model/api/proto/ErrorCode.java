package com.sfbx.appconsent.core.model.api.proto;

import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kv.a;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public enum ErrorCode {
    UNKNOWN;

    public static final Companion Companion = new Companion(null);
    private static final o $cachedSerializer$delegate = q.lazy(s.f87404c, (a) ErrorCode$Companion$$cachedSerializer$delegate$1.INSTANCE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final /* synthetic */ o get$cachedSerializer$delegate() {
            return ErrorCode.$cachedSerializer$delegate;
        }

        public final KSerializer<ErrorCode> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }

        private Companion() {
        }
    }
}
