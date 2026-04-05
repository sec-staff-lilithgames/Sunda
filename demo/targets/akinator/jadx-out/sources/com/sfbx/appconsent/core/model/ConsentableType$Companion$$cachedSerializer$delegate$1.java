package com.sfbx.appconsent.core.model;

import kotlin.jvm.internal.f0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConsentableType$Companion$$cachedSerializer$delegate$1 extends f0 implements a {
    public static final ConsentableType$Companion$$cachedSerializer$delegate$1 INSTANCE = new ConsentableType$Companion$$cachedSerializer$delegate$1();

    public ConsentableType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    @Override // kv.a
    public final KSerializer<Object> invoke() {
        return EnumsKt.createSimpleEnumSerializer("com.sfbx.appconsent.core.model.ConsentableType", ConsentableType.values());
    }
}
