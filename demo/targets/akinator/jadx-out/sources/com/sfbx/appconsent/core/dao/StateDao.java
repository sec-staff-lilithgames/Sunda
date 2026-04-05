package com.sfbx.appconsent.core.dao;

import android.content.SharedPreferences;
import com.sfbx.appconsent.core.model.reducer.State;
import io.sfbx.appconsent.logger.ACLogger;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StateDao {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_STATE = "key_state";
    private final Json json;

    /* renamed from: sp, reason: collision with root package name */
    private final SharedPreferences f50515sp;
    private State temporaryState;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public StateDao(SharedPreferences sp2, Json json) {
        e0.checkNotNullParameter(sp2, "sp");
        e0.checkNotNullParameter(json, "json");
        this.f50515sp = sp2;
        this.json = json;
    }

    private final State getState() {
        try {
            Json json = this.json;
            KSerializer nullable = BuiltinSerializersKt.getNullable(State.Companion.serializer());
            String string = this.f50515sp.getString(KEY_STATE, null);
            if (string == null) {
                string = AbstractJsonLexerKt.NULL;
            }
            return (State) json.decodeFromString(nullable, string);
        } catch (Exception e10) {
            ACLogger aCLogger = ACLogger.INSTANCE;
            e0.checkNotNullExpressionValue("StateDao", "StateDao::class.java.simpleName");
            aCLogger.e("StateDao", e10);
            return null;
        }
    }

    private final void updateActualTemporaryState(State state) {
        this.temporaryState = state;
    }

    public final void clearTemporaryState() {
        this.temporaryState = null;
    }

    public final synchronized State getTemporaryState() {
        try {
            if (this.temporaryState == null) {
                this.temporaryState = getState();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.temporaryState;
    }

    public final boolean save(State state) {
        saveTemporaryState(state);
        this.f50515sp.edit().putString(KEY_STATE, this.json.encodeToString(BuiltinSerializersKt.getNullable(State.Companion.serializer()), state)).apply();
        return true;
    }

    public final boolean saveTemporaryState(State state) {
        updateActualTemporaryState(state);
        return true;
    }
}
