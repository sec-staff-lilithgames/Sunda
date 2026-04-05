package com.sfbx.appconsent.core.business;

import com.sfbx.appconsent.core.di.CoreInjector;
import com.sfbx.appconsent.core.provider.ConfigurationProvider;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AbstractCore$mConfigurationProvider$2 extends f0 implements a {
    public static final AbstractCore$mConfigurationProvider$2 INSTANCE = new AbstractCore$mConfigurationProvider$2();

    public AbstractCore$mConfigurationProvider$2() {
        super(0);
    }

    @Override // kv.a
    public final ConfigurationProvider invoke() {
        return CoreInjector.INSTANCE.provideConfigurationProvider();
    }
}
