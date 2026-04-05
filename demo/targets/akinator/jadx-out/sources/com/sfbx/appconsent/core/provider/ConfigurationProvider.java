package com.sfbx.appconsent.core.provider;

import android.content.SharedPreferences;
import com.sfbx.appconsent.core.model.api.proto.HelloReply;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigurationProvider {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_CHECK_FOR_UPDATE_HELLO_REPLY = "appconsent_check_for_update";
    private static final String KEY_HELLO_REPLY = "appconsent_hello_reply";
    private static final String KEY_LAST_CMP_HASH = "appconsent_last_cmp_hash";
    private static final String KEY_LAST_GVL_VERSION = "appconsent_last_gvl_version";
    private HelloReply checkForUpdateHelloReply;
    private HelloReply helloReply;
    private final Json json;

    /* renamed from: sp, reason: collision with root package name */
    private final SharedPreferences f50532sp;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public ConfigurationProvider(SharedPreferences sp2, Json json) {
        e0.checkNotNullParameter(sp2, "sp");
        e0.checkNotNullParameter(json, "json");
        this.f50532sp = sp2;
        this.json = json;
    }

    public final void clearConfiguration() {
        this.helloReply = null;
        SharedPreferences.Editor editor = this.f50532sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.remove(KEY_HELLO_REPLY);
        editor.remove(KEY_LAST_GVL_VERSION);
        editor.remove(KEY_LAST_CMP_HASH);
        editor.apply();
        editor.apply();
    }

    public final HelloReply getCheckForUpdateHelloReply() {
        if (this.checkForUpdateHelloReply == null && isHelloReplayCacheIsPresent()) {
            SharedPreferences sharedPreferences = this.f50532sp;
            Json json = this.json;
            HelloReply.Companion companion = HelloReply.Companion;
            String string = sharedPreferences.getString(KEY_CHECK_FOR_UPDATE_HELLO_REPLY, json.encodeToString(BuiltinSerializersKt.getNullable(companion.serializer()), null));
            Json json2 = this.json;
            KSerializer nullable = BuiltinSerializersKt.getNullable(companion.serializer());
            if (string == null) {
                string = AbstractJsonLexerKt.NULL;
            }
            this.checkForUpdateHelloReply = (HelloReply) json2.decodeFromString(nullable, string);
        }
        return this.checkForUpdateHelloReply;
    }

    public final HelloReply getHelloReply() {
        if (this.helloReply == null && isHelloReplayCacheIsPresent()) {
            SharedPreferences sharedPreferences = this.f50532sp;
            Json json = this.json;
            HelloReply.Companion companion = HelloReply.Companion;
            String string = sharedPreferences.getString(KEY_HELLO_REPLY, json.encodeToString(BuiltinSerializersKt.getNullable(companion.serializer()), null));
            Json json2 = this.json;
            KSerializer nullable = BuiltinSerializersKt.getNullable(companion.serializer());
            if (string == null) {
                string = AbstractJsonLexerKt.NULL;
            }
            this.helloReply = (HelloReply) json2.decodeFromString(nullable, string);
        }
        return this.helloReply;
    }

    public final String getLastCmpHash() {
        String string = this.f50532sp.getString(KEY_LAST_CMP_HASH, "");
        return string == null ? "" : string;
    }

    public final int getLastGvlVersion() {
        return this.f50532sp.getInt(KEY_LAST_GVL_VERSION, -1);
    }

    public final boolean isCheckForUpdateHelloReplayCacheIsPresent() {
        return this.f50532sp.contains(KEY_CHECK_FOR_UPDATE_HELLO_REPLY);
    }

    public final boolean isHelloReplayCacheIsPresent() {
        return this.f50532sp.contains(KEY_HELLO_REPLY);
    }

    public final void setCheckForUpdateHelloReply(HelloReply checkForUpdateHelloReply) {
        e0.checkNotNullParameter(checkForUpdateHelloReply, "checkForUpdateHelloReply");
        this.checkForUpdateHelloReply = checkForUpdateHelloReply;
        SharedPreferences.Editor editor = this.f50532sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_CHECK_FOR_UPDATE_HELLO_REPLY, this.json.encodeToString(HelloReply.Companion.serializer(), checkForUpdateHelloReply)).apply();
        editor.apply();
    }

    public final void setHelloReply(HelloReply helloReply) {
        e0.checkNotNullParameter(helloReply, "helloReply");
        this.helloReply = helloReply;
        SharedPreferences.Editor editor = this.f50532sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_HELLO_REPLY, this.json.encodeToString(HelloReply.Companion.serializer(), helloReply)).apply();
        editor.apply();
    }

    public final void setLastCmpHash(String cmpHash) {
        e0.checkNotNullParameter(cmpHash, "cmpHash");
        SharedPreferences.Editor editor = this.f50532sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.putString(KEY_LAST_CMP_HASH, cmpHash).apply();
        editor.apply();
    }

    public final void setLastGvlVersion(int i10) {
        SharedPreferences.Editor editor = this.f50532sp.edit();
        e0.checkNotNullExpressionValue(editor, "editor");
        editor.putInt(KEY_LAST_GVL_VERSION, i10).apply();
        editor.apply();
    }
}
