package com.sfbx.appconsent.core.dao;

import com.sfbx.appconsent.core.model.api.proto.Configuration;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigurationDao$configuration$2 extends f0 implements a {
    final /* synthetic */ ConfigurationDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurationDao$configuration$2(ConfigurationDao configurationDao) {
        super(0);
        this.this$0 = configurationDao;
    }

    @Override // kv.a
    public final Configuration invoke() {
        ConfigurationDao configurationDao = this.this$0;
        return configurationDao.initConfigurationFromAssets(configurationDao.context);
    }
}
