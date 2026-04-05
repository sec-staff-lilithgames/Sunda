package com.sfbx.appconsent.core.dao;

import android.content.Context;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.model.api.proto.Configuration;
import gv.d;
import gv.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import sv.g;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigurationDao {
    private static final String CONFIG = "config.json";
    public static final Companion Companion = new Companion(null);
    private final o configuration$delegate;
    private final Context context;
    private final Json json;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public ConfigurationDao(Context context, Json json) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(json, "json");
        this.context = context;
        this.json = json;
        this.configuration$delegate = q.lazy(new ConfigurationDao$configuration$2(this));
    }

    private final Configuration getConfiguration() {
        return (Configuration) this.configuration$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Configuration initConfigurationFromAssets(Context context) throws IOException {
        try {
            InputStream inputStreamOpen = context.getAssets().open(CONFIG);
            e0.checkNotNullExpressionValue(inputStreamOpen, "aContext.assets.open(CONFIG)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, g.f86134b), Segment.SIZE);
            try {
                String text = y.readText(bufferedReader);
                d.closeFinally(bufferedReader, null);
                return (Configuration) this.json.decodeFromString(BuiltinSerializersKt.getNullable(Configuration.Companion.serializer()), text);
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final Configuration getConfigurationFromAssets() {
        return getConfiguration();
    }
}
